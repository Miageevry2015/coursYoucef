package m1.miage.projet10.Entite;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class EspacePersonnel implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEspacePersonne;
	@OneToMany
	@JoinTable(name="EspacePerso_Document",
	joinColumns = @JoinColumn(name="idEspacePersonnel"),
	inverseJoinColumns = @JoinColumn(name="idDocument"))
	private Collection<Document> listeDocument;
	
	
	public EspacePersonnel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdEspacePersonne() {
		return idEspacePersonne;
	}
	public void setIdEspacePersonne(Long idEspacePersonne) {
		this.idEspacePersonne = idEspacePersonne;
	}
	public Collection<Document> getListeDocument() {
		return listeDocument;
	}
	public void setListeDocument(Collection<Document> listeDocument) {
		this.listeDocument = listeDocument;
	}
	
	
}
