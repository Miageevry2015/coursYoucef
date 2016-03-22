package m1.miage.projet10.Entite;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.validation.constraints.Size;

@Entity
public class Message implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMessage;
	private String objet;
	@Size(max=50)
	private String texte;
	private Date date;
	private String destinataire;
	private String emetteur;
	
	
	public Long getIdMessage() {
		return idMessage;
	}
	public void setIdMessage(Long idMessage) {
		this.idMessage = idMessage;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}
	public String getEmetteur() {
		return emetteur;
	}
	public void setEmetteur(String emetteur) {
		this.emetteur = emetteur;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String objet, String texte, Date date, String destinataire, String emetteur) {
		super();
		this.objet = objet;
		this.texte = texte;
		this.date = date;
		this.destinataire = destinataire;
		this.emetteur = emetteur;
	}
	
	
	
}
