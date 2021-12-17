package com.codeup.quasarspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String indexPosts(){
        return "Placeholder: index for posts";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String individualPost(@PathVariable int id){
        return "Placeholder for invididual posts of Id " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewCreatePost(){
        return "Placeholder for the create post form!";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "";
    }





}
