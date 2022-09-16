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
        log.info("你好git3");
        log.info("你好git4");
        log.info("你好master4");

        log.info("你好push5");
        log.info("你好pull6");
    }
}
