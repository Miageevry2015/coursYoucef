package m1.miage.projet10.Entite;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value="admin")
public class Administrateur extends Utilisateur implements Serializable {
	
	@OneToMany
	@JoinTable(name="Admin_Matiere",
	joinColumns = @JoinColumn(name="idAdmin"),
	inverseJoinColumns = @JoinColumn(name="idMatiere"))
	private List<Matiere> listeMatiere;

	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateur(String nom, String prenom, String dateNaissance, String adresse, String email,
			String telephone, String motDePasse, Niveau niveau) {
		super(nom, prenom, dateNaissance, adresse, email, telephone, motDePasse, niveau);
		// TODO Auto-generated constructor stub
	}

	public Administrateur(String nom, String prenom, String dateNaissance, String adresse, String email,
			String telephone, String motDePasse, Niveau niveau, List<Matiere> listeMatiere) {
		super(nom, prenom, dateNaissance, adresse, email, telephone, motDePasse, niveau);
		this.listeMatiere = listeMatiere;
	}

	public Collection<Matiere> getListeMatiere() {
		return listeMatiere;
	}

	public void setListeMatiere(List<Matiere> listeMatiere) {
		this.listeMatiere = listeMatiere;
	}
	
	
}
