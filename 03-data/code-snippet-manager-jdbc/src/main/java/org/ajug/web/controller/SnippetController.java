package org.ajug.web.controller;

import java.util.List;

import org.ajug.web.domain.Snippet;
import org.ajug.web.repository.SnippetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class SnippetController {

	@Autowired
	SnippetRepository snippetRepository;
	
	@RequestMapping("/snippets")
	public List<Snippet> snippets(){
		assert snippetRepository != null;
		return snippetRepository.findAll();
	}
	
	@RequestMapping("/snippets/{id}")
	public Snippet snippet(@PathVariable("id") String id){
		assert snippetRepository != null;
		return snippetRepository.findById(id);
	}
	
	@RequestMapping(value="/snippets",method = { RequestMethod.POST})
	public  ResponseEntity<?> add(@RequestBody Snippet snippet){
		assert snippetRepository != null;
		
		Snippet _snippet = snippetRepository.save(snippet);
		assert _snippet != null;
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder
				.fromCurrentRequest().path("/" + _snippet.getId())
				.buildAndExpand().toUri());
		
		return new ResponseEntity<>(_snippet,httpHeaders,HttpStatus.CREATED);
	}
	
	//TODO: Challenge: Depending on the Accept header response a XML or JSON
	
	//TODO: Challenge: Add and PUT request method to update a give Snippet based on its ID.
	
	
}
