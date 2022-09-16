package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.stereotype.Controller;

import javax.annotation.processing.SupportedAnnotationTypes;
@Slf4j
@Controller
public class gitTest {

    @Test
    public void git(){
        log.info("你好git");
        log.info("你好git2");

    }
}
