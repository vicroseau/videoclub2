package formation.sopra.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dvd {

	@Id
	private Long noArticle;

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
