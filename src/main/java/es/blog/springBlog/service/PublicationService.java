package es.blog.springBlog.service;

import java.util.List;

import es.blog.springBlog.model.Publication;

public interface PublicationService {

	/**
	 * Guarda una publicacion
	 * @param publication
	 * @return publicacion guardada
	 */
	Publication save(Publication publication);
	
	/**
	 * Recupera todas las publicaciones
	 * @return lista de publicaciones
	 */
	List<Publication> findAll();
	
	/**
	 * elimina una publicacion por id
	 * @param id
	 */
	void deletePublication(Long id);
}
