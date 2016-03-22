package m1.miage.projet10;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import m1.miage.projet10.Entite.Administrateur;
import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Disponibilite;
import m1.miage.projet10.Entite.Document;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Niveau;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Entite.Utilisateur;
import m1.miage.projet10.Metier.CoursParticulierMetier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(new String[]{"applicontext.xml"});
		
		CoursParticulierMetier metier = (CoursParticulierMetier) app.getBean("metier");
		
		
		Administrateur admin = new Administrateur();
		admin.setNom("Boukersi");
		admin.setPrenom("Youcef");
		admin.setDateNaissance("16/05/1993");
		admin.setEmail("youcef.boukersi@yahoo.fr");
		admin.setMotDePasse("youyou2012");
		
		
		Administrateur admin2 = new Administrateur();
		admin2.setNom("Benkhellat");
		admin2.setPrenom("omar");
		admin2.setDateNaissance("30/09/1992");
		admin2.setEmail("omar07ben@outlook.fr");
		admin2.setMotDePasse("benkhellat");
		//Matiere mat1 = new Matiere("Mathematique", Niveau.TERMINAL, 10L);
		
		Professeur prof1 = new Professeur("DJAFRI", "BACHIR", "16051993", "", "youcef.boukersi@yahoo.fr", "", "youyou2012", Niveau.BAC4);
		Professeur prof2 = new Professeur("Melliti", "Tarek", "16051993", "", "youcef.boukersi@yahoo.fr", "", "youyou2012", Niveau.BAC5);
		Professeur prof3 = new Professeur("Hanichi", "djelloul", "16051993", "", "youcef.boukersi@yahoo.fr", "", "youyou2012", Niveau.BAC5);
		Eleve eleve2 = new Eleve("youcef", "Boukersi", "16051993", "", "youcef.boukersi@yahoo.fr","", "youyou2012", Niveau.BAC5);
		eleve2.setCredits(100L);
		Matiere m1 = new Matiere("mathématique", Niveau.BAC1, 15L);
		Cours c1 = new Cours("Limite", 20L, "2h", null, m1, null);
		
		Disponibilite dispo1 = new Disponibilite(new Date(), "12h", "13h");
		
		//Cours cours = metier.addCours(c1, 2L);
		//System.err.println(metier.getEleve(eleve2).getIdUtilisateur());
		//metier.addCredit(500L, metier.getEleve(eleve2).getIdUtilisateur());
		//metier.acheterCours(c1, metier.getEleve(eleve2).getIdUtilisateur());
		for(Professeur prof : metier.getListProf())
			System.out.println(prof.getIdUtilisateur()+"  "+prof.getNom());
		
		//System.out.println(metier.getProfesseur(prof1).getNom());
		
		
		// /////////////////////////////
		
	}
}
