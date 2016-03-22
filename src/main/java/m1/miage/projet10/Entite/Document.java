package m1.miage.projet10.Entite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDocument;
	private String texte;
	private String titre;
	private String idFile;
	
	
	public Long getIdDocument() {
		return idDocument;
	}
	public void setIdDocument(Long idDocument) {
		this.idDocument = idDocument;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getIdFile() {
		return idFile;
	}
	public void setIdFile(String idFile) {
		this.idFile = idFile;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Document(String texte, String titre, String idFile) {
		super();
		this.texte = texte;
		this.titre = titre;
		this.idFile = idFile;
	}
	
	
	
	
}
