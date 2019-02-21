package formation.sopra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table (name="article")
public class Article {

	@Id
	@Column(name="noArticle")
	private Long noArticle;
	
	@Column(name="nbDisques")
	private int nbDisques;
	
	@Column(name="version")
	private int version;
	
	@Column(name="bonus")
	private Boolean bonus;
	
	@Column(name="troisD")
	private Boolean troisD;

	public Article() {
		
	}

	public Article(Long noArticle, int nbDisques, int version, Boolean bonus, Boolean troisD) {
		super();
		this.noArticle = noArticle;
		this.nbDisques = nbDisques;
		this.version = version;
		this.bonus = bonus;
		this.troisD = troisD;
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


	public Boolean getBonus() {
		return bonus;
	}

	public void setBonus(Dvd dvd) {
		this.bonus = bonus;
	}

	public Boolean getTroisD() {
		return troisD;
	}

	public void setTroisD(Bluray bluray) {
		this.troisD = troisD;
	}
	
	
}
