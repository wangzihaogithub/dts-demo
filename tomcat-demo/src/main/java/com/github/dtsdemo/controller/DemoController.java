package com.github.dtsdemo.controller;

import com.github.dts.sdk.DtsSdkClient;
import com.github.dtsdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DtsSdkClient dtsSdkClient;
    @Autowired
    private DemoService demoService;

    @RequestMapping("/save")
    public CompletableFuture<Integer> save(String name) {
        Integer id = demoService.save(name);
        return dtsSdkClient.listenEs("demo_table", id)
                .handle((listenEsResponse, throwable) -> id);
    }
}
