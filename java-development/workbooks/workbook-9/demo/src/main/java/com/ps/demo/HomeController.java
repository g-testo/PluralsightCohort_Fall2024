package com.ps.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
//    @RequestMapping(path="/", method = RequestMethod.GET)
    @GetMapping("/elves")
    public String getElves(@RequestParam(defaultValue = "!!") String name){
        return "Elves elves everywhere!" + name;
    }

    @GetMapping("/")
    public String index(@RequestParam String country){
        return "Hello " + country;
    }

    @GetMapping("/add")
    public int add(@RequestParam int num1, @RequestParam int num2){
        return num1 + num2;
    }

    @PutMapping("/elves/{id}")
    public String create(@RequestBody Elf elf, @PathVariable Long id){
        return "Hello " + elf.getName() + id;
    }



}
