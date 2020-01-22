package metier;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Benjamin Boutrois
 *
 */
public class Etudiant extends Personne {
	
	// Propriétés
	private Date dateNaissance;
	private Ecole ecole;
	
	private List<Cours> cours;
	
	public Etudiant(int id, String nom, String prenom, String adresseEmail, String adresse, String numeroTelephone, Date dateNaissance) {
		super(id, nom, prenom, adresseEmail, adresse, numeroTelephone);
		this.dateNaissance = dateNaissance;
		this.cours = new ArrayList<Cours>();
		this.ecole = null;
	}
	
	public Etudiant() {
		super();
		this.cours = new ArrayList<Cours>();
		this.ecole = null;
	}

	// Accesseurs
	public Date getDateNaissance() {
		return dateNaissance;
	}
	
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}

	public List<Cours> getCours() {
		return cours;
	}

	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}
	
	// Méthodes
	
	/**
	 * Ajoute un cours à la liste de cours de l'étudiant.
	 * @param cours : Le cours à ajouter.
	 */
	public void ajouterCours(Cours cours)
	{
		this.cours.add(cours);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
