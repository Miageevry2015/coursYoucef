package m1.miage.projet10.Entite;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value="prof")
public class Professeur extends Utilisateur implements Serializable{
	
	@Enumerated
	private Statut statut;
	@OneToMany
	@JoinTable(name="Prof_Cours",
	joinColumns = @JoinColumn(name="idProf"),
	inverseJoinColumns = @JoinColumn(name="idCours"))
	private Collection<Cours> listeCours;
	@OneToMany
	@JoinTable(name="Prof_Dispo",
	joinColumns = @JoinColumn(name="idProf"),
	inverseJoinColumns = @JoinColumn(name="idDisponibilite"))
	private Collection<Disponibilite> listeDisponibilte;
	
	
	public Professeur(String nom, String prenom, String dateNaissance, String adresse, String email, String telephone,
			String motDePasse, Niveau niveau, Statut statut) {
		super(nom, prenom, dateNaissance, adresse, email, telephone, motDePasse, niveau);
		this.statut = statut;
	}
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professeur(String nom, String prenom, String dateNaissance, String adresse, String email, String telephone,
			String motDePasse, Niveau niveau) {
		super(nom, prenom, dateNaissance, adresse, email, telephone, motDePasse, niveau);
		// TODO Auto-generated constructor stub
	}
	public Statut getStatut() {
		return statut;
	}
	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	public Collection<Cours> getListeCours() {
		return listeCours;
	}
	public void setListeCours(Collection<Cours> listeCours) {
		this.listeCours = listeCours;
	}
	public Collection<Disponibilite> getListeDisponibilte() {
		return listeDisponibilte;
	}
	public void setListeDisponibilte(Collection<Disponibilite> listeDisponibilte) {
		this.listeDisponibilte = listeDisponibilte;
	}
	
	
	
}
