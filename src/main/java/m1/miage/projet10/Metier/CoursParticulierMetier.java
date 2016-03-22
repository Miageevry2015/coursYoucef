package m1.miage.projet10.Metier;

import java.util.Collection;

import m1.miage.projet10.Entite.Administrateur;
import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Disponibilite;
import m1.miage.projet10.Entite.Document;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.EspacePersonnel;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Niveau;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Entite.Statut;
import m1.miage.projet10.Entite.Utilisateur;


public interface CoursParticulierMetier {
	
	public boolean addProf(Professeur user);
	public boolean supprimerProf(Professeur user);
	public boolean modifierProfilProf(Professeur prof, Long idProf);
	public boolean modifierStatutProf(Statut statut , Long idProf);
	public boolean addMatiere(Matiere matiere);
	public boolean supprimerMatiere(Matiere matiere);
	public boolean modifierPrixMatiere(Long idMatiere,Long prix);
	public Collection<Eleve> getListEleve();
	public Collection<Professeur> getListProf();
	public String modifierTitreMatiere(Long idMAtiere, String intitule);
	public Collection<Cours> consulterCours(Long idEleve);
	public boolean acheterCours(Cours cours, Long idEleve);
	public Long rechargerCredit(Long credit, Long idEleve);
	public EspacePersonnel getEspacePersonnel(Long idEleve);
	public Collection<Cours> rechercherCours(Matiere matiere, Niveau niveau);
	public Collection<Cours> rechercheCours(Niveau niveau);
	public Collection<Cours> rechercherCours(String motCle);
	public Collection<Document> getListDocument(EspacePersonnel esp);	
	public Utilisateur seConnecter(String email, String motdepasse);
	public void inscrire(Utilisateur user);
	public Collection<Cours> getListCoursProfesseur(Long idProf);
	public Collection<Disponibilite> getListDispo(Long idProf);
	public Collection<Disponibilite> getlistDispoCours(Cours c, Long idProf);
	public Disponibilite supprimerDisponibilite(Disponibilite Dispo, Long idProf);
	public boolean addDispo(Disponibilite d, Long idProf);
	public Cours addCours(Cours c, Long idProf);
	public Cours addCours(Cours c, Collection<Disponibilite> dispo, Long idProf);
	public void saisirCompteRendu(String text, Long idCours, Long idProf );
	public void deposerDocument(Document doc, Collection<Eleve> listeEleve, Long idProf);
	public Collection<Eleve> getElevesByCours(Cours c, Long idProf);

	public boolean sedeconnecter();
	public boolean envoyerMessage(Message msg, Collection<Utilisateur> idUtilisateur);
	public boolean supprimerMessage(Message msg);
	public Collection<Message> getMessages();
	public boolean modifierMail(String mail, Long idUtilisateur);
	public boolean modifierMDP(String mdp, Long idUtilisateur);
	public String reinitilialiserMDP(Long idUtilisateur); // renvoyer le mot de passe a la boite mail
	boolean addCredit(Long credit, Long idEleve);
	public Collection<Matiere> getlistMatiere();

	// méthodes dont je aurai besoin
	public Administrateur getAdmin(Administrateur admin);
	public Professeur getProfesseur(Professeur prof);
	public Eleve getEleve(Eleve eleve);
	public Matiere getMatiere(Matiere matiere);
	public Cours getCours(Cours cours);
	public Document getDocument(Document doc);
	public Message getMessage(Message msg);
	public Disponibilite getDispinibilite(Disponibilite dispo);
	public Collection<Cours> getListCours();
}
