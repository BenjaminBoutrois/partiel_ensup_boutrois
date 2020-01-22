package metier;

import java.util.ArrayList;
import java.util.List;

public class Ecole {
	
	// Propri�t�s
	private String nom, email, adresse, numeroTelephone, directeur;
	
	private List<Etudiant> etudiants;

	// Constructeurs
	public Ecole(String nom, String email, String adresse, String numeroTelephone, String directeur) {
		super();
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
		this.numeroTelephone = numeroTelephone;
		this.directeur = directeur;
		this.etudiants = new ArrayList<Etudiant>();
	}

	// Accesseurs
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getDirecteur() {
		return directeur;
	}

	public void setDirecteur(String directeur) {
		this.directeur = directeur;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	// M�thodes
	
	/**
	 * Ajoute un �tudiant � la liste de l'�cole.
	 * @param etudiant : L'�tudiant � ajouter.
	 */
	public void ajouterEtudiant(Etudiant etudiant) {
		this.etudiants.add(etudiant);
	}
	
	/**
	 * Supprime un �tudiant de la liste de l'�cole.
	 * @param idEtudiant : L'ID de l'�tudiant � supprimer.
	 * @param ecole : L'�cole de l'�tudiant.
	 */
	public void supprimerEtudiant(int idEtudiant) {
		Etudiant etudiantASupprimer = null;
		
		for (Etudiant etudiant : this.getEtudiants()) {
			if(etudiant.getId() == idEtudiant)
			{
				etudiantASupprimer = etudiant;
				break;
			}
		}
		
		if (etudiantASupprimer != null)
			this.getEtudiants().remove(etudiantASupprimer);
	}

	@Override
	public String toString() {
		return "Ecole [nom=" + nom + ", email=" + email + ", adresse=" + adresse + ", numeroTelephone="
				+ numeroTelephone + ", directeur=" + directeur + "]";
	}
}
