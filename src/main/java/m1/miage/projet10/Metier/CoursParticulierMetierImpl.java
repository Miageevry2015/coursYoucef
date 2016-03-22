package m1.miage.projet10.Metier;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

import m1.miage.projet10.DAO.CoursPDAO;
import m1.miage.projet10.DAO.InterfaceCoursPDAO;
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


public class CoursParticulierMetierImpl implements CoursParticulierMetier{
	
	private CoursPDAO dao;
	
	public void setDao(CoursPDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean addProf(Professeur user) {		
		return dao.addProf(user);
	}

	@Override
	public boolean supprimerProf(Professeur user) {
		
		return dao.supprimerProf(user);
	}

	


	@Override
	public boolean addMatiere(Matiere matiere) {
		// TODO Auto-generated method stub
		
		return dao.addMatiere(matiere);
	}

	@Override
	public boolean supprimerMatiere(Matiere matiere) {
		// TODO Auto-generated method stub
		
		return dao.supprimerMatiere(matiere);
		
	}

	@Override
	public Collection<Eleve> getListEleve() {
		// TODO Auto-generated method stub
		
		return dao.getListEleve();
		
	}

	@Override
	public Collection<Professeur> getListProf() {
		// TODO Auto-generated method stub
		
		return dao.getListProf();
	}

	@Override
	public Collection<Cours> consulterCours(Long idEleve) {
		// TODO Auto-generated method stub
		
		return dao.consulterCours(idEleve);
	}

	@Override
	public Collection<Cours> rechercherCours(Matiere matiere, Niveau niveau) {
		// TODO Auto-generated method stub
		return dao.rechercherCours(matiere, niveau);
	}

	@Override
	public Collection<Cours> rechercheCours(Niveau niveau) {
		// TODO Auto-generated method stub
		return dao.rechercheCours(niveau);
	}

	@Override
	public Collection<Cours> rechercherCours(String motCle) {
		// TODO Auto-generated method stub
		return dao.rechercherCours(motCle);
	}

	@Override
	public Collection<Document> getListDocument(EspacePersonnel esp) {
		// TODO Auto-generated method stub
		return dao.getListDocument(esp);
	}

	@Override
	public Utilisateur seConnecter(String email, String motdepasse) {
		// TODO Auto-generated method stub
		return dao.seConnecter(email, motdepasse);
	}

	
	@Override
	public boolean sedeconnecter() {
		return dao.sedeconnecter();
	}

	@Override
	public boolean envoyerMessage(Message msg, Collection<Utilisateur> users) {
		// TODO Auto-generated method stub
		return dao.envoyerMessage(msg, users);
	}

	@Override
	public boolean supprimerMessage(Message msg) {
		// TODO Auto-generated method stub
		return dao.supprimerMessage(msg);
	}

	@Override
	public Collection<Message> getMessages() {
		// TODO Auto-generated method stub
		return dao.getMessages();
	}

	
	@Override
	public boolean modifierProfilProf(Professeur prof, Long idProf) {
		// TODO Auto-generated method stub
		return dao.modifierProfilProf(prof, idProf);
	}

	@Override
	public void inscrire(Utilisateur user) {
		// TODO Auto-generated method stub
		dao.inscrire(user);
	}

	@Override
	public boolean modifierStatutProf(Statut statut, Long idProf) {
		return dao.modifierStatutProf(statut, idProf);
	}

	@Override
	public boolean modifierPrixMatiere(Long idMatiere, Long prix) {
		// TODO Auto-generated method stub
		return dao.modifierPrixMatiere(idMatiere, prix);
	}

	
	@Override
	public boolean acheterCours(Cours cours, Long idEleve) {
		// TODO Auto-generated method stub
		return dao.acheterCours(cours, idEleve);
	}

	@Override
	public Long rechargerCredit(Long credit, Long idEleve) {
		// TODO Auto-generated method stub
		return dao.rechargerCredit(credit, idEleve);
	}

	@Override
	public EspacePersonnel getEspacePersonnel(Long idEleve) {
		// TODO Auto-generated method stub
		return dao.getEspacePersonnel(idEleve);
	}

	@Override
	public Collection<Cours> getListCoursProfesseur(Long idProf) {
		// TODO Auto-generated method stub
		return dao.getListCoursProfesseur(idProf);
	}

	@Override
	public Collection<Disponibilite> getListDispo(Long idProf) {
		// TODO Auto-generated method stub
		return dao.getListDispo(idProf);
	}

	@Override
	public Collection<Disponibilite> getlistDispoCours(Cours c, Long idProf) {
		// TODO Auto-generated method stub
		return dao.getlistDispoCours(c, idProf);
	}

	@Override
	public Disponibilite supprimerDisponibilite(Disponibilite Dispo, Long idProf) {
		// TODO Auto-generated method stub
		return dao.supprimerDisponibilite(Dispo, idProf);
	}

	@Override
	public boolean addDispo(Disponibilite d, Long idProf) {
		// TODO Auto-generated method stub
		return dao.addDispo(d, idProf);
	}

	@Override
	public Cours addCours(Cours c, Long idProf) {
		// TODO Auto-generated method stub
		return dao.addCours(c, idProf);
	}

	@Override
	public Cours addCours(Cours c, Collection<Disponibilite> dispo, Long idProf) {
		// TODO Auto-generated method stub
		return dao.addCours(c, dispo , idProf);
	}

	@Override
	public void saisirCompteRendu(String text, Long idCours, Long idProf) {
		// TODO Auto-generated method stub
		dao.saisirCompteRendu(text, idCours, idProf);
	}

	@Override
	public Collection<Eleve> getElevesByCours(Cours c, Long idProf) {
		// TODO Auto-generated method stub
		return dao.getElevesByCours(c, idProf);
	}

	@Override
	public boolean modifierMail(String mail, Long idUtilisateur) {
		// TODO Auto-generated method stub
		return dao.modifierMail(mail, idUtilisateur);
	}

	@Override
	public boolean modifierMDP(String mdp, Long idUtilisateur) {
		// TODO Auto-generated method stub
		return dao.modifierMDP(mdp, idUtilisateur);
	}

	@Override
	public String reinitilialiserMDP(Long idUtilisateur) {
		// TODO Auto-generated method stub
		return dao.reinitilialiserMDP(idUtilisateur);
	}

	@Override
	public boolean addCredit(Long credit, Long idEleve) {
		// TODO Auto-generated method stub
		return dao.addCredit(credit, idEleve);
	}

	@Override
	public String modifierTitreMatiere(Long idMAtiere, String intitule) {
		// TODO Auto-generated method stub
		return dao.modifierTitreMatiere(idMAtiere, intitule);
	}

	@Override
	public void deposerDocument(Document doc, Collection<Eleve> listeEleve, Long idProf) {
		dao.deposerDocument(doc, listeEleve, idProf);
	}

	@Override
	public Collection<Matiere> getlistMatiere() {
		return dao.getlistMatiere();
	}

	@Override
	public Administrateur getAdmin(Administrateur admin) {
		return dao.getAdmin(admin);
	}

	@Override
	public Professeur getProfesseur(Professeur prof) {
		return dao.getProfesseur(prof);
	}

	@Override
	public Eleve getEleve(Eleve eleve) {
		return dao.getEleve(eleve);
	}

	@Override
	public Matiere getMatiere(Matiere matiere) {
		return dao.getMatiere(matiere);
	}

	@Override
	public Cours getCours(Cours cours) {
		return dao.getCours(cours);
	}

	@Override
	public Document getDocument(Document doc) {
		return dao.getDocument(doc);
	}

	@Override
	public Message getMessage(Message msg) {
		return dao.getMessage(msg);
	}

	@Override
	public Disponibilite getDispinibilite(Disponibilite dispo) {
		return dao.getDispinibilite(dispo);
	}

	@Override
	public Collection<Cours> getListCours() {
		return dao.getListCours();
	}

}
