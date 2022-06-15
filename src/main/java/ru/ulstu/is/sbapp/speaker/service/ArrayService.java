package ru.ulstu.is.sbapp.speaker.service;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import ru.ulstu.is.sbapp.speaker.domain.Array;

import java.util.List;

@Service
public class ArrayService {
    private final ApplicationContext applicationContext;

    public ArrayService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public List say(int size, String type) {
        final Array array = (Array) applicationContext.getBean(type);
        return array.create(size);
    }
}
