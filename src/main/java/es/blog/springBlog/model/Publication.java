package es.blog.springBlog.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="publics") //nombre de la tbla
@Access(AccessType.FIELD)
public class Publication extends ParentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -211038666124140031L;
	
	@Column(name="title", nullable=false, length=100)
	private String titlePost;
	
	@Column(name="description", nullable=false, length=1000)
	private String descriptionPost;
	
	@Column(name="img_title", nullable=false, length=300)
	private String imgTitle;

	public String getTitlePost() {
		return titlePost;
	}

	public void setTitlePost(String titlePost) {
		this.titlePost = titlePost;
	}

	public String getDescriptionPost() {
		return descriptionPost;
	}

	public void setDescriptionPost(String descriptionPost) {
		this.descriptionPost = descriptionPost;
	}

	public String getImgTitle() {
		return imgTitle;
	}

	public void setImgTitle(String imgTitle) {
		this.imgTitle = imgTitle;
	}

}
