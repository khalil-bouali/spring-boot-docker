package com.kbouali.docker;

import lombok.Builder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/demo")
@Builder
public class DemoController {

    private final DemoRepository repository;

    @GetMapping
    public List<DemoEntity> findAll() { return repository.findAll(); }

    @PostMapping
    public DemoEntity save(@RequestBody DemoEntity demo) { return repository.save(demo); }

    @GetMapping("/{id}")
    public DemoEntity findById(@PathVariable Integer id) { return repository.findById(id).orElseThrow(); }

}
