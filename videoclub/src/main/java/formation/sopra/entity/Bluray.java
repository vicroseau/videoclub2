package formation.sopra.entity;

<<<<<<< HEAD
=======
import javax.persistence.Column;
>>>>>>> 30e58df794019e85631e25249984303958582ade
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bluray {

	@Id
	private Long noArticle;
<<<<<<< HEAD

	private Boolean troisD;

	public Bluray(Long noArticle, Boolean troisD) {
		super();
		this.noArticle = noArticle;
		this.troisD = troisD;
	}

	public Bluray() {
=======
	
	
	private Boolean troisD;
	
	@Column(name="version")
	private int version;

	public Bluray(Long noArticle, Boolean troisD, int version) {
		super();
		this.noArticle = noArticle;
		this.troisD = troisD;
		this.version = version;
	}

	public Bluray() {
		
>>>>>>> 30e58df794019e85631e25249984303958582ade
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
<<<<<<< HEAD
=======

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
>>>>>>> 30e58df794019e85631e25249984303958582ade
	
	
}
