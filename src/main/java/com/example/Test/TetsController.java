package com.example.Test;

import org.springframework.web.bind.annotation.*;

@RestController
public class TetsController {

    @GetMapping("/hi")
    public String hi(){
        return "This is Get";
    }

    @PostMapping("/hi")
    public Student hipost(@RequestBody Student student){
Student s=new Student();
s.setName("This is"+student.getName());
        return s;
    }
    @DeleteMapping("/hi")
    public String hidelete(){
        return "User is deleted";
    }
    @PutMapping("/hi")
    public Student hiput(@RequestBody Student student){
        return student;
    }
}
