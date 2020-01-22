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
	 * Cr�� un �tudiant.
	 * @param etudiant : L'�tudiant � cr�er.
	 * @param ecole : L'�cole dans laquelle l'�tudiant sera cr��.
	 */
	public static void creerEtudiant(Etudiant etudiant, Ecole ecole)
	{
		// Ajouter l'�tudiant � la liste de l'�cole
		ecole.ajouterEtudiant(etudiant);
	}
	
	/**
	 * Associe un cours � un �tudiant.
	 * @param cours : Le cours � associer.
	 * @param etudiant : L'�tudiant auquel associer le cours.
	 */
	public static void associerCoursEtudiant(Cours cours, Etudiant etudiant)
	{
		etudiant.ajouterCours(cours);
	}
	
	/**
	 * Affiche les informations d'un �tudiant.
	 * @param etudiant : L'�tudiant que l'on veut afficher.
	 */
	public static void afficherInformationsEtudiant(Etudiant etudiant)
	{
		System.out.println(etudiant);
	}
	
	/**
	 * Modifie les informations d'un �tudiant � partir d'une instance.
	 * @param nouvelEtudiant : L'instance d'�tudiant.
	 * @param idEtudiant : L'ID de l'�tudiant � modifier.
	 * @param ecole : L'�cole dans laquelle est l'�tudiant � modifier.
	 */
	public static void modifierInformationsEtudiant(Etudiant nouvelEtudiant, int idEtudiant, Ecole ecole)
	{
		ecole.modifierInformationsEtudiant(nouvelEtudiant, idEtudiant);
	}
	
	/**
	 * Supprime un �tudiant.
	 * @param idEtudiant : L'ID de l'�tudiant � supprimer.
	 * @param ecole : L'�cole dans laquelle est l'�tudiant.
	 */
	public static void supprimerEtudiant(int idEtudiant, Ecole ecole) {
		ecole.supprimerEtudiant(idEtudiant);
	}
	
	/**
	 * Affiche la liste de tous les �tudiants de l'�cole.
	 * @param ecole : L'�cole dans laquelle on veut afficher tous les �tudiants.
	 */
	public static void afficherTousLesEtudiants(Ecole ecole)
	{
		ecole.afficherTousLesEtudiants();
	}
}
