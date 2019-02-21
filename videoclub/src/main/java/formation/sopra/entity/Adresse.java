package formation.sopra.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private Integer numero;
	private String rue;
	private String ville;
	private String codePostal;
	@OneToMany(mappedBy="adresse")
	private Collection<Adherent> listeAdherents;
	@Version
	private int version;
	
	public Long getId() {
		return id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public Collection<Adherent> getListeAdherents() {
		return listeAdherents;
	}
	public void setListeAdherents(Collection<Adherent> listeAdherents) {
		this.listeAdherents = listeAdherents;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
}
