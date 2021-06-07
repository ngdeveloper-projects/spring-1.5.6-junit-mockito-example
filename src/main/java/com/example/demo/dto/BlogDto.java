package com.example.demo.dto;

import com.example.demo.entity.BlogEntity;

public class BlogDto {
	
	private Long id;
	private String name;	 	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public BlogDto(){
		
	}
	
	public BlogDto(BlogEntity blogEntity) {
		this.setId(blogEntity.getId());
		this.setName(blogEntity.getName());
	}
	
	
}
