package ru.ulstu.is.sbapp.speaker.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChar implements Array<Character>, InitializingBean, DisposableBean {
    private final Logger log = LoggerFactory.getLogger(ArrayChar.class);

    @Override
    public List<Character> create(int size)
    {
        ArrayList<String> alphaNum = new ArrayList<>();

        for (char c = 'A';c<= 'z';c++){
            String s = "";
            s +=c;
            alphaNum.add(s);
            if (c == 'Z') c = 'a'-1;
        }

        for (int c = 0;c<10;c++){
            String s = "";
            s +=c;
            alphaNum.add(s);
        }
        Character[][] array = new Character[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = alphaNum.get((int)(Math.random()*alphaNum.size())).charAt(0);
            }
        }

        List<Character> list = new ArrayList<>();
        for (Character[] array2 : array) {
            list.addAll(Arrays.asList(array2));
        }
        return list;
    }

    @Override
    public void afterPropertiesSet() {
        log.info("ArrayChar.afterPropertiesSet()");
    }

    @Override
    public void destroy() {
        log.info("ArrayChar.destroy()");

    }
}
