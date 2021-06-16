package io.txf4311.librams.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/ms")
public class MsController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "hello test !!!";
    }
}
