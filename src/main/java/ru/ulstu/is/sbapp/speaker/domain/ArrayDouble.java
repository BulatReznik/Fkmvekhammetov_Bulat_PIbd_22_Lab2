package ru.ulstu.is.sbapp.speaker.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayDouble implements Array {
    private final Logger log = LoggerFactory.getLogger(ArrayDouble.class);

    @Override
    public List<Double> create(int size)
    {
        Double[][] array = new Double[size][size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextDouble();
            }
        }
        List<Double> list = new ArrayList<>();
        for (Double[] array2 : array) {
            list.addAll(Arrays.asList(array2));
        }
        return list;
    }

    public void init() {
        log.info("ArrayDouble.init()");
    }

    public void destroy() {
        log.info("ArrayDouble.destroy()");
    }
}
