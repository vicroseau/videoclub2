package formation.sopra.entity;

<<<<<<< HEAD
=======
import javax.persistence.Column;
>>>>>>> 30e58df794019e85631e25249984303958582ade
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dvd {

	@Id
	private Long noArticle;
<<<<<<< HEAD

	private Boolean bonus;

	public Dvd() {

	}

	public Dvd(Boolean bonus) {
		super();
		this.bonus = bonus;
	}

	public Boolean getBonus() {
		return bonus;
	}

	public void setBonus(Boolean bonus) {
		this.bonus = bonus;
	}

}
=======
	
	
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
>>>>>>> 30e58df794019e85631e25249984303958582ade
