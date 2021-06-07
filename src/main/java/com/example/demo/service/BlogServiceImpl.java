package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BlogDao;
import com.example.demo.dto.BlogDto;
import com.example.demo.entity.BlogEntity;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogDao blogDao;

	public List<BlogDto> getAllBlogs() {		 
		List<BlogEntity> blogs = blogDao.findAll();
		List<BlogDto> blogDto = blogs.parallelStream().map(BlogDto::new).collect(Collectors.toList());
		return blogDto;
	}
}
