package es.blog.springBlog.service;

import java.util.List;
import java.util.Optional;

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
	public Publication findOneById(Long id) {
		Optional<Publication> optional = this.publicationRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return new Publication();
	}

	@Override
	public void deletePublication(Long id) {
		this.publicationRepository.deleteById(id);
	}
	

	
	

}
