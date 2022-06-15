package ru.ulstu.is.sbapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.ulstu.is.sbapp.speaker.service.ArrayService;

import java.util.List;

@SpringBootTest
class SbappApplicationTests {
    @Autowired
    ArrayService arrayService;

    @Test
    void testArrayInt() {
        final List<Integer> res = arrayService.say(10, "int");
        Assertions.assertEquals(100, res.size());
        Assertions.assertEquals(Integer.class, res.get(0).getClass());
    }

    @Test
    void testArrayDouble() {
        final List<Double> res = arrayService.say(10, "double");
        Assertions.assertEquals(100, res.size());
        Assertions.assertEquals(Double.class, res.get(0).getClass());
    }

    @Test
    void testArrayChar() {
        final List<Character> res = arrayService.say(10, "char");
        Assertions.assertEquals(100, res.size());
        Assertions.assertEquals(Character.class, res.get(0).getClass());
    }

    @Test
    void testSpeakerErrorWired() {
        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> arrayService.say(10, "failtype"));
    }
}
