package metier;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Benjamin Boutrois
 *
 */
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
		System.out.println("Ajout de l'�tudiant " + etudiant.getPrenom()
							+ " " + etudiant.getNom());
		this.etudiants.add(etudiant);
	}
	
	/**
	 * Modifie les informations d'un �tudiant.
	 * @param nouvelEtudiant : Le nouvel �tudiant qui a les bonnes informations.
	 * @param idEtudiant : L'ID de l'�tudiant � modifier.
	 */
	public void modifierInformationsEtudiant(Etudiant nouvelEtudiant, int idEtudiant)
	{
		Etudiant etudiantAModifier = null;
		
		for (Etudiant etudiant : this.getEtudiants()) {
			if(etudiant.getId() == idEtudiant)
			{
				etudiantAModifier = etudiant;
				break;
			}
		}
		if (etudiantAModifier != null)
		{
			System.out.println("Modification de l'�tudiant � l'ID \"" + idEtudiant + "\".");
			etudiantAModifier.setNom(nouvelEtudiant.getNom());
			etudiantAModifier.setPrenom(nouvelEtudiant.getPrenom());
			etudiantAModifier.setEmail(nouvelEtudiant.getEmail());
			etudiantAModifier.setAdresse(nouvelEtudiant.getAdresse());
			etudiantAModifier.setNumeroTelephone(nouvelEtudiant.getNumeroTelephone());
			etudiantAModifier.setDateNaissance(nouvelEtudiant.getDateNaissance());
		}
	}
	
	/**
	 * Supprime un �tudiant de la liste de l'�cole.
	 * @param idEtudiant : L'ID de l'�tudiant � supprimer.
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
		{
			System.out.println("Suppression de l'�tudiant " + etudiantASupprimer.getPrenom()
								+ " " + etudiantASupprimer.getNom());
			this.getEtudiants().remove(etudiantASupprimer);
		}
	}
	
	/**
	 * Affiche la liste de tous les �tudiants.
	 */
	public void afficherTousLesEtudiants()
	{
		System.out.println("Affichage de tous les �tudiants :");
		for (Etudiant etudiant : this.getEtudiants()) {
			System.out.println(etudiant.getPrenom() + " " + etudiant.getNom());
		}
	}

	@Override
	public String toString() {
		return "Ecole [nom=" + nom + ", email=" + email + ", adresse=" + adresse + ", numeroTelephone="
				+ numeroTelephone + ", directeur=" + directeur + "]";
	}
}
