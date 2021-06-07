package com.example.demo.controller;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.BlogDao;
import com.example.demo.dto.BlogDto;
import com.example.demo.entity.BlogEntity;
import com.example.demo.service.BlogService;
import com.example.demo.service.BlogServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BlogControllerTest {

	@InjectMocks
	BlogService blogService = new BlogServiceImpl();

	@Mock
	private BlogDao blogDao;

	@Before
	public void init() {
		BlogEntity blogEntity = new BlogEntity();
		blogEntity.setId(1L);
		blogEntity.setName("Java 11");
		Mockito.when(blogDao.findAll()).thenReturn(Collections.singletonList(blogEntity));
	}

	@Test
	public void testGetAllBlogs() {
		List<BlogDto> blogDtoList = blogService.getAllBlogs();
		assertEquals(1, blogDtoList.size());
	}
}
