package m1.miage.projet10.Entite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.SQLInsert;

@Entity
public class Matiere implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMatiere;
	private String intitule;
	private Long prix;
	@Enumerated
	private Niveau niveau;
	
	public Long getIdMatiere() {
		return idMatiere;
	}
	public void setIdMatiere(Long idMatiere) {
		this.idMatiere = idMatiere;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	public Long getPrix() {
		return prix;
	}
	public void setPrix(Long prix) {
		this.prix = prix;
	}
	public Matiere(String intitule, Niveau niveau, Long prix) {
		super();
		this.intitule = intitule;
		this.niveau = niveau;
		this.prix = prix;
	}
	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
