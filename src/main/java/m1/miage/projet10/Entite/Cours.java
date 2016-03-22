package m1.miage.projet10.Entite;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

@Entity
public class Cours  implements Serializable{
	
	public Cours(String intituleCours, Long prix, String duree) {
		super();
		this.intituleCours = intituleCours;
		this.prix = prix;
		this.duree = duree;
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCours;
	private String intituleCours;
	private Long prix;
	private String duree;
	@Size(min=10,max=200)
	private String compteRendu;
	@ManyToOne
	@JoinColumn(name="idMatiereCours")
	private Matiere matiere;
	@OneToMany
	@JoinTable(name="Cours_Diponibilite",
	joinColumns = @JoinColumn(name="idCours"),
	inverseJoinColumns = @JoinColumn(name="idDiponibilite"))
	private	Collection<Disponibilite> date;
	
	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cours(String intituleCours, Long prix, String duree, String compteRendu, 
			Matiere matiere, Collection<Disponibilite> date) {
		super();
		this.intituleCours = intituleCours;
		this.prix = prix;
		this.duree = duree;
		this.compteRendu = compteRendu;
		this.matiere = matiere;
		this.date = date;
	}
	
	public Long getIdCours() {
		return idCours;
	}
	public void setIdCours(Long idCours) {
		this.idCours = idCours;
	}
	public Long getPrix() {
		return prix;
	}
	public void setPrix(Long prix) {
		this.prix = prix;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getCompteRendu() {
		return compteRendu;
	}
	public void setCompteRendu(String compteRendu) {
		this.compteRendu = compteRendu;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public Collection<Disponibilite> getDate() {
		return date;
	}
	public void setDate(Collection<Disponibilite> date) {
		this.date = date;
	}
	
	public String getIntituleCours() {
		return intituleCours;
	}
	public void setIntituleCours(String intituleCours) {
		this.intituleCours = intituleCours;
	}
	
	
}
