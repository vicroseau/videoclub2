package formation.sopra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class Article {

	@Id
	@Column(name = "noArticle")
	private Long noArticle;

	@Column(name = "nbDisques")
	private int nbDisques;

	@Column(name = "bonus")
	private Dvd dvd;

	@Column(name = "troisD")
	private Bluray bluray;

	@Version
	private int version;

	public Article() {

	}

	public Article(Long noArticle, int nbDisques, Dvd dvd, Bluray bluray, int version) {
		super();
		this.noArticle = noArticle;
		this.nbDisques = nbDisques;
		this.dvd = dvd;
		this.bluray = bluray;
		this.version = version;
	}

	public Dvd getDvd() {
		return dvd;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}

	public Bluray getBluray() {
		return bluray;
	}

	public void setBluray(Bluray bluray) {

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
	private Dvd dvd;
	
	@Column(name="troisD")
	private Bluray bluray;

	public Article() {
		
	}

	public Article(Long noArticle, int nbDisques, int version, Dvd dvd, Bluray bluray) {
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

<<<<<<< HEAD
=======
	public Dvd getDvd() {
		return dvd;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}

	public Bluray getBluray() {
		return bluray;
	}

	public void setBluray(Bluray bluray) {
		this.bluray = bluray;
	}
	
	
>>>>>>> 30e58df794019e85631e25249984303958582ade
}
