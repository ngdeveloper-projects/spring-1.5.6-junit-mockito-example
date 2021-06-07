package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BlogDto;
import com.example.demo.service.BlogService;

@RestController
@RequestMapping("/v1/blog")
public class BlogController {

	@Autowired
	BlogService blogService;

	@GetMapping("/")
	public List<BlogDto> getAllBlogs() {
		return blogService.getAllBlogs();
	}
}
