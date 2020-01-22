package metier;

public class Enseignant extends Personne {
	
	// Propriétés
	private String matiere;
	
	private Ecole ecole;
	
	// Constructeurs
	public Enseignant() {
		super();
	}

	public Enseignant(int id, String nom, String prenom, String adresseEmail, String adresse, String numeroTelephone) {
		super(id, nom, prenom, adresseEmail, adresse, numeroTelephone);
		// TODO Auto-generated constructor stub
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}
	
	// Méthodes
	
	@Override
	public String toString() {
		return super.toString() + " | Enseignant [matiere=" + matiere + "]";
	}
}
