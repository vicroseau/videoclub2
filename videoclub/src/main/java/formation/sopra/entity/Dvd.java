package formation.sopra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dvd {

	@Id
	private Long noArticle;
	
	
	private Boolean bonus;
	
	@Column(name="version")
	private int version;

	public Dvd(Long noArticle, Boolean bonus, int version) {
		super();
		this.noArticle = noArticle;
		this.bonus = bonus;
		this.version = version;
	}

	public Dvd() {
		
	}

	public Long getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(Long noArticle) {
		this.noArticle = noArticle;
	}

	public Boolean getTroisD() {
		return bonus;
	}

	public void setTroisD(Boolean troisD) {
		this.bonus = troisD;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
}