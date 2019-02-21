package formation.sopra.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import org.hibernate.validator.constraints.Length;

@Entity
public class Adherent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	@Column(name= "Civilite")
	private Titre civilite;
	@Length(min=2)
	@Column(name = "prenom",nullable=false)
	private String prenom;
	@Length(min=2)
	@Column(name = "nom",nullable=false)
	private String nom;
	private Integer noAdherent;
	@ManyToOne
	@JoinColumn(name="Adresse")
	private Adresse adresse;
	@OneToMany(mappedBy="adherent")
//	private Collection<Article> listeArticle;
	@Version
	private int version;
	
	public Adherent() {
		
	}
	
	public Adherent(Titre civilite, String prenom, String nom, Integer noAdherent) {
		this.civilite = civilite;
		this.prenom = prenom;
		this.nom = nom;
		this.noAdherent = noAdherent;
	}
	
	public Titre getCivilite() {
		return civilite;
	}
	public void setCivilite(Titre civilite) {
		this.civilite = civilite;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getNoAdherent() {
		return noAdherent;
	}
	public void setNoAdherent(Integer noAdherent) {
		this.noAdherent = noAdherent;
	}

	public Long getId() {
		return id;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
//	public Collection<Article> getListeArticle() {
//		return listeArticle;
//	}
//	public void setListeAdherents(Collection<Article> listeArticle) {
//		this.listeArticle = listeArticle;
//	}
	
}
