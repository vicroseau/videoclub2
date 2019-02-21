package formation.sopra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Article {

	@Id
	@Column(name="noArticle")
	private Long noArticle;
	
	@Column(name="nbDisques")
	private int nbDisques;
	
	@Column(name="version")
	private int version;
	
	@Column(name="bonus")
	private Boolean dvd;
	
	@Column(name="troisD")
	private Boolean bluray;

	public Article() {
		
	}

	public Article(Long noArticle, int nbDisques, int version, Boolean dvd, Boolean bluray) {
		super();
		this.noArticle = noArticle;
		this.nbDisques = nbDisques;
		this.version = version;
		this.dvd = dvd;
		this.bluray = bluray;
	}

	public Long getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(Long noArticle) {
		this.noArticle = noArticle;
	}

	public int getNbDisques() {
		return nbDisques;
	}

	public void setNbDisques(int nbDisques) {
		this.nbDisques = nbDisques;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Boolean getDvd() {
		return dvd;
	}

	public void setDvd(Boolean dvd) {
		this.dvd = dvd;
	}

	public Boolean getBluray() {
		return bluray;
	}

	public void setBluray(Boolean bluray) {
		this.bluray = bluray;
	}
	
	
}
