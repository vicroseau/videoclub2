package formation.sopra.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bluray {

	@Id
	private Long noArticle;

	private Boolean troisD;

	public Bluray(Long noArticle, Boolean troisD) {
		super();
		this.noArticle = noArticle;
		this.troisD = troisD;
	}

	public Bluray() {
	}

	public Long getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(Long noArticle) {
		this.noArticle = noArticle;
	}

	public Boolean getTroisD() {
		return troisD;
	}

	public void setTroisD(Boolean troisD) {
		this.troisD = troisD;
	}
	
	
}
