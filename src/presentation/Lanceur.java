package presentation;

import java.sql.Date;

import metier.Cours;
import metier.Ecole;
import metier.Enseignant;
import metier.Etudiant;
import service.GestionEcole;

public class Lanceur {

	/**
	 * M�thode principale du programme.
	 * @param args : Arguments pass�s au programme.
	 */
	public static void main(String[] args) {
		
		// Cr�ation de l'�cole
		Ecole ecole = new Ecole("ENSUP", "ensup@ensup.fr", "Place des fr�res Mongolfier",
								"0109020805", "M. Ledirecteur");
		
		// Cr�ation d'un �tudiant
		Etudiant etudiant = new Etudiant(1, "Boutrois", "Benjamin",
										"benjamin.boutrois28@gmail.com", "12 All�e Jean Antoine Houdon",
										"0607080910", new Date(System.currentTimeMillis()));
		
		Etudiant etudiant2 = new Etudiant(1, "Lorian", "Bruno",
										"bruno.lorian@gmail.com", "15 Boulevard de la mer",
										"0750134978", new Date(System.currentTimeMillis()));
		
		Etudiant etudiant3 = new Etudiant(1, "Fran�ois", "Johnathan",
										"john.francois@gmail.com", "4 Avenue du Sel",
										"0664798211", new Date(System.currentTimeMillis()));
		
		// Cr�ation d'un cours
		Cours cours = new Cours("Anglais", 2);
		
		// Test cr�ation d'�tudiants
		GestionEcole.creerEtudiant(etudiant, ecole);
		GestionEcole.creerEtudiant(etudiant2, ecole);
		GestionEcole.creerEtudiant(etudiant3, ecole);

		// Test affichage de tous les �tudiants
		GestionEcole.afficherTousLesEtudiants(ecole);
		
		// Test association d'un cours � un �tudiant
		GestionEcole.associerCoursEtudiant(cours, etudiant);
		
		// Test affichage d'un �tudiant
		GestionEcole.afficherInformationsEtudiant(etudiant);
		
		// Cr�ation d'un dernier �tudiant qui va servir � modifier le premier
		Etudiant etudiant4 = new Etudiant(1, "Bout", "Ben",
											"bb.28@gmail.com", "14 rue des Fleurs",
											"0102030405", new Date(System.currentTimeMillis()));
		
		// Test modification d'un �tudiant
		GestionEcole.modifierInformationsEtudiant(etudiant4, etudiant.getId(), ecole);

		GestionEcole.afficherTousLesEtudiants(ecole);
		
		// Test suppression d'un �tudiant
		GestionEcole.supprimerEtudiant(etudiant.getId(), ecole);
		
		GestionEcole.afficherTousLesEtudiants(ecole);
	}

}
