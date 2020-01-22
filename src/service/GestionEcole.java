package service;

import metier.Cours;
import metier.Ecole;
import metier.Etudiant;

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
	 * @param etudiant : L'instance d'�tudiant.
	 * @param idEtudiant : L'ID de l'�tudiant � modifier.
	 */
	public static void modifierInformationsEtudiant(Etudiant etudiant, int idEtudiant, Ecole ecole)
	{
		
	}
	
	/**
	 * Supprime un �tudiant.
	 * @param idEtudiant : L'ID de l'�tudiant � supprimer.
	 */
	public void supprimerEtudiant(int idEtudiant, Ecole ecole) {
		ecole.supprimerEtudiant(idEtudiant);
	}
	
	/**
	 * Affiche la liste de tous les �tudiants de l'�cole.
	 */
	public static void afficherTousLesEtudiants(Ecole ecole)
	{
		System.out.println(ecole.getEtudiants());
	}
}