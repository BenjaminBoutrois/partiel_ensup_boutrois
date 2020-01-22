package presentation;

import java.sql.Date;

import metier.Cours;
import metier.Ecole;
import metier.Enseignant;
import metier.Etudiant;
import service.GestionEcole;

public class Lanceur {

	/**
	 * Méthode principale du programme.
	 * @param args : Arguments passés au programme.
	 */
	public static void main(String[] args) {
		
		// Création de l'école
		Ecole ecole = new Ecole("ENSUP", "ensup@ensup.fr", "Place des frères Mongolfier",
								"0109020805", "M. Ledirecteur");
		
		// Création d'un étudiant
		Etudiant etudiant = new Etudiant(1, "Boutrois", "Benjamin",
										"benjamin.boutrois28@gmail.com", "12 Allée Jean Antoine Houdon",
										"0607080910", new Date(System.currentTimeMillis()));
		
		Etudiant etudiant2 = new Etudiant(1, "Lorian", "Bruno",
										"bruno.lorian@gmail.com", "15 Boulevard de la mer",
										"0750134978", new Date(System.currentTimeMillis()));
		
		Etudiant etudiant3 = new Etudiant(1, "François", "Johnathan",
										"john.francois@gmail.com", "4 Avenue du Sel",
										"0664798211", new Date(System.currentTimeMillis()));
		
		// Création d'un cours
		Cours cours = new Cours("Anglais", 2);
		
		// Test création d'étudiants
		GestionEcole.creerEtudiant(etudiant, ecole);
		GestionEcole.creerEtudiant(etudiant2, ecole);
		GestionEcole.creerEtudiant(etudiant3, ecole);

		// Test affichage de tous les étudiants
		GestionEcole.afficherTousLesEtudiants(ecole);
		
		// Test association d'un cours à un étudiant
		GestionEcole.associerCoursEtudiant(cours, etudiant);
		
		// Test affichage d'un étudiant
		GestionEcole.afficherInformationsEtudiant(etudiant);
		
		// Création d'un dernier étudiant qui va servir à modifier le premier
		Etudiant etudiant4 = new Etudiant(1, "Bout", "Ben",
											"bb.28@gmail.com", "14 rue des Fleurs",
											"0102030405", new Date(System.currentTimeMillis()));
		
		// Test modification d'un étudiant
		GestionEcole.modifierInformationsEtudiant(etudiant4, etudiant.getId(), ecole);

		GestionEcole.afficherTousLesEtudiants(ecole);
		
		// Test suppression d'un étudiant
		GestionEcole.supprimerEtudiant(etudiant.getId(), ecole);
		
		GestionEcole.afficherTousLesEtudiants(ecole);
	}

}
