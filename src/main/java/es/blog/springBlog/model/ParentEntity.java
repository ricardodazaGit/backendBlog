package es.blog.springBlog.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable {

	/**
	 * auto-generado al implementar Serializable
	 */
	private static final long serialVersionUID = 6056626173091518643L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false) //Nombre de la columna en BBDD
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
