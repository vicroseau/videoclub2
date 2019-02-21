package formation.sopra.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


public class Bluray {

	private Long noArticle;

	
	private Boolean troisD;
	
	
	private int version;

	public Bluray(Long noArticle, Boolean troisD, int version) {
		super();
		this.noArticle = noArticle;
		this.troisD = troisD;
		this.version = version;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	
	
}
