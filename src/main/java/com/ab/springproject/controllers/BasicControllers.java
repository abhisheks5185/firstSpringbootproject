package com.ab.springproject.controllers;

import org.springframework.web.bind.annotation.*;

import com.ab.springproject.entry.BasicEntry;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/first")
public class BasicControllers {

    // In-memory storage
    private Map<String, BasicEntry> map = new HashMap<>();

    // Store data in map
    @PostMapping("/add")
    public String addData(@RequestBody BasicEntry entry) {
        map.put(entry.getId(), entry);
        return "Data stored successfully";
    }

    @GetMapping("/all")
    public Map <String, BasicEntry> getall(){
        return map;
    }

    // Get data from map
    @GetMapping("/get/{id}")
    public BasicEntry getData(@PathVariable String id) {
        return map.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public BasicEntry deletedata(@PathVariable String id){
        return map.remove(id);
    }

    @PutMapping
    public  BasicEntry upadetdata(){
        return null;
    }
}
