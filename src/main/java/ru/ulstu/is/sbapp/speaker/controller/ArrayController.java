package ru.ulstu.is.sbapp.speaker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ulstu.is.sbapp.speaker.service.ArrayService;

import java.util.List;

@RestController
public class ArrayController {
    private final ArrayService arrayService;

    public ArrayController(ArrayService arrayService) {
        this.arrayService = arrayService;
    }

    @GetMapping("/")
    public List array2(@RequestParam(value = "size", defaultValue = "10") int size,
                       @RequestParam(value = "type", defaultValue = "int") String type) {
        return arrayService.say(size, type);
    }

}
