package es.blog.springBlog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.blog.springBlog.model.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long>{

}
