package ru.ulstu.is.sbapp.speaker.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.ulstu.is.sbapp.speaker.domain.Array;
import ru.ulstu.is.sbapp.speaker.domain.ArrayChar;
import ru.ulstu.is.sbapp.speaker.domain.ArrayDouble;

@Configuration
public class ArrayConfiguration {
    private final Logger log = LoggerFactory.getLogger(ArrayConfiguration.class);

    @Bean(value = "double", initMethod = "init", destroyMethod = "destroy")
    public ArrayDouble createDoubleArray() {
        log.info("Call createDoubleArray()");
        return new ArrayDouble();
    }

    @Bean(value = "char")
    public Array createCharArray() {
        log.info("Call createCharArray()");
        return new ArrayChar();
    }
}
