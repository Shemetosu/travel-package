package com.itstep.travel_package.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface BaseController<E> {

    @GetMapping("/one")
    ResponseEntity<E> findOne(@RequestParam Integer id);

    @DeleteMapping("/remove")
    void remove (@RequestParam Integer id);
}
