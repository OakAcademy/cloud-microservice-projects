package com.rest.springRest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("post")
public class PostController {

	@Autowired
	private ModelMapper mapper;
	private PostDTO ConvertToPostDTO(Post post)
	{
		PostDTO dto=mapper.map(post, PostDTO.class);
		return dto;
	}
	
	private Post ConvertToEntity(PostDTO dto)
	{
		Post post=mapper.map(dto, Post.class);
		return post;
		
	}
	
	@GetMapping
	public PostDTO getpostdto()
	{
		Post post=new Post();
		post.setId(1);
		post.setName("Post value");
		post.setTitle("PostTitle");
		post.setUrl("postURL");
		PostDTO postdto=ConvertToPostDTO(post);
		post=new Post();
		post=ConvertToEntity(postdto);
		
		return postdto;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
