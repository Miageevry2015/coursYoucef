package m1.miage.projet10.Entite;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value="eleve")
public class Eleve extends Utilisateur implements Serializable {
	
	private Long credits;
	@OneToMany
	@JoinTable(name="Eleve_Cours",
	joinColumns = @JoinColumn(name="idEleve"),
	inverseJoinColumns = @JoinColumn(name="idCours"))
	private Collection<Cours> listeCours;
	@OneToOne
	@JoinColumn(name="idEspacePersonnel")
	private EspacePersonnel espacePersonnel;
	
	public Long getCredits() {
		return credits;
	}
	public void setCredits(Long credits) {
		this.credits = credits;
	}
	public Collection<Cours> getListeCours() {
		return listeCours;
	}
	public void setListeCours(Collection<Cours> listeCours) {
		this.listeCours = listeCours;
	}
	
	public EspacePersonnel getEspacePersonnel() {
		return espacePersonnel;
	}
	public void setEspacePersonnel(EspacePersonnel espacePersonnel) {
		this.espacePersonnel = espacePersonnel;
	}
	public Eleve() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Eleve(String nom, String prenom, String dateNaissance, String adresse, String email, String telephone,
			String motDePasse, Niveau niveau) {
		super(nom, prenom, dateNaissance, adresse, email, telephone, motDePasse, niveau);
		// TODO Auto-generated constructor stub
	}
	public Eleve(String nom, String prenom, String dateNaissance, String adresse, String email, String telephone,
			String motDePasse, Niveau niveau, Long credits) {
		super(nom, prenom, dateNaissance, adresse, email, telephone, motDePasse, niveau);
		this.credits = credits;
	}
	
	
}
