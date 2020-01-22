package service;

import metier.Cours;
import metier.Ecole;
import metier.Etudiant;

/**
 * 
 * @author Benjamin Boutrois
 *
 */
public class GestionEcole {
	
	/**
	 * Créé un étudiant.
	 * @param etudiant : L'étudiant à créer.
	 * @param ecole : L'école dans laquelle l'étudiant sera créé.
	 */
	public static void creerEtudiant(Etudiant etudiant, Ecole ecole)
	{
		// Ajouter l'étudiant à la liste de l'école
		ecole.ajouterEtudiant(etudiant);
	}
	
	/**
	 * Associe un cours à un étudiant.
	 * @param cours : Le cours à associer.
	 * @param etudiant : L'étudiant auquel associer le cours.
	 */
	public static void associerCoursEtudiant(Cours cours, Etudiant etudiant)
	{
		etudiant.ajouterCours(cours);
	}
	
	/**
	 * Affiche les informations d'un étudiant.
	 * @param etudiant : L'étudiant que l'on veut afficher.
	 */
	public static void afficherInformationsEtudiant(Etudiant etudiant)
	{
		System.out.println(etudiant);
	}
	
	/**
	 * Modifie les informations d'un étudiant à partir d'une instance.
	 * @param nouvelEtudiant : L'instance d'étudiant.
	 * @param idEtudiant : L'ID de l'étudiant à modifier.
	 * @param ecole : L'école dans laquelle est l'étudiant à modifier.
	 */
	public static void modifierInformationsEtudiant(Etudiant nouvelEtudiant, int idEtudiant, Ecole ecole)
	{
		ecole.modifierInformationsEtudiant(nouvelEtudiant, idEtudiant);
	}
	
	/**
	 * Supprime un étudiant.
	 * @param idEtudiant : L'ID de l'étudiant à supprimer.
	 * @param ecole : L'école dans laquelle est l'étudiant.
	 */
	public static void supprimerEtudiant(int idEtudiant, Ecole ecole) {
		ecole.supprimerEtudiant(idEtudiant);
	}
	
	/**
	 * Affiche la liste de tous les étudiants de l'école.
	 * @param ecole : L'école dans laquelle on veut afficher tous les étudiants.
	 */
	public static void afficherTousLesEtudiants(Ecole ecole)
	{
		ecole.afficherTousLesEtudiants();
	}
}
