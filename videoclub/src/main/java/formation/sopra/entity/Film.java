package formation.sopra.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Film {
	
	@Id
	@GeneratedValue
	private Long id;
	
//	@OneToMany(mappedBy="")
//	private Collection<Article> listArticle; // plus getters et setters
	
	@Column(name="titre")
	private String titre;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	@Column(name="date")
	private Date date;
	
	@Column(name="version")
	private int version;
	
	@ManyToMany
	@JoinTable(name = "FILM_REAL", joinColumns = @JoinColumn(name = "FILM_ID") , inverseJoinColumns = @JoinColumn(name = "REAL_ID") )
	@Column(name="realisateur")
	private Collection<Realisateur> listRealisateur;

	public Film() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Collection<Realisateur> getListRealisateur() {
		return listRealisateur;
	}

	public void setListRealisateur(Collection<Realisateur> listRealisateur) {
		this.listRealisateur = listRealisateur;
	}

	
}
