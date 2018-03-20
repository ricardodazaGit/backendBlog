package es.blog.springBlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.blog.springBlog.dao.PublicationRepository;
import es.blog.springBlog.model.Publication;

@Service
public class PublicationServiceImpl implements PublicationService {

	@Autowired
	protected PublicationRepository publicationRepository; 
	
	@Override
	public Publication save(Publication publication) {
		return this.publicationRepository.save(publication);
	}

	@Override
	public List<Publication> findAll() {
		return this.publicationRepository.findAll();
	}

	@Override
	public void deletePublication(Long id) {
		this.publicationRepository.deleteById(id);
	}
	
	

}
