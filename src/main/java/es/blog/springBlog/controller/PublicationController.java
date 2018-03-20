package es.blog.springBlog.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import es.blog.springBlog.model.Publication;
import es.blog.springBlog.service.PublicationService;
import es.blog.springBlog.util.RestResponse;

@RestController
public class PublicationController {
	
	@Autowired
	protected PublicationService publicationService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String publicJson) throws JsonParseException, JsonMappingException, IOException {
		
		this.mapper = new ObjectMapper();
		Publication publication = this.mapper.readValue(publicJson, Publication.class);
		
		if(!this.validate(publication)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Faltan campos obligatorios");
		}
		this.publicationService.save(publication);
		
		return new RestResponse(HttpStatus.OK.value(), "Operación Realizada");
		
		
	}
	@RequestMapping(value = "/getPublications", method = RequestMethod.GET)
	public List<Publication> getPublications(){
		return this.publicationService.findAll();
	}
	
	private boolean validate(Publication publication) {

		boolean isValid = true;

		if(publication.getTitlePost() == "" || publication.getTitlePost() == null) {
			isValid = false;
		}

		if(publication.getDescriptionPost() == "" || publication.getDescriptionPost() == null) {
			isValid = false;
		}

		return isValid;
	}

}
