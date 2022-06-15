package ru.ulstu.is.sbapp.speaker.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

@Component(value = "int")
public class ArrayInt implements Array {
    private final Logger log = LoggerFactory.getLogger(ArrayInt.class);

    @Override
    public List<Integer> create(int size)
    {
        Integer[][] array = new Integer[size][size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt();
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Integer[] array2 : array) {
            list.addAll(Arrays.asList(array2));
        }
        return list;
    }

    @PostConstruct
    public void init() {
        log.info("ArrayInt.init()");
    }

    @PreDestroy
    public void destroy() {
        log.info("ArrayInt.destroy()");
    }
}
