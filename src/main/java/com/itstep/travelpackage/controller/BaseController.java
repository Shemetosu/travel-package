package com.itstep.travelpackage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface BaseController<D, DC, DU> {

    @GetMapping("/one")
    ResponseEntity<D> findOne(@RequestParam Long id);

    @PostMapping("/create")
    ResponseEntity<D> create(@RequestBody DC dto);

    // todo: post vs put
    @PostMapping("/update")
    ResponseEntity<D> update(@RequestBody DU dto);

    @DeleteMapping("/remove")
    void remove(@RequestParam Long id);
}
