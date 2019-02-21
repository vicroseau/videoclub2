package formation.sopra.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;




@Entity
public class Realisateur {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@ManyToMany(mappedBy="listRealisateur")
	@Column(name="film")
	private Collection<Film> listFilm;
	
	@Column(name="version")
	@Version
	private int version;
	
	
	
	public Realisateur() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Collection<Film> getListFilm() {
		return listFilm;
	}



	public void setListFilm(Collection<Film> listFilm) {
		this.listFilm = listFilm;
	}



	public int getVersion() {
		return version;
	}



	public void setVersion(int version) {
		this.version = version;
	}
	
	
	
	




	
	

}
