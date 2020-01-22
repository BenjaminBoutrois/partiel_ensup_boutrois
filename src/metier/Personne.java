package metier;

/**
 * 
 * @author Benjamin Boutrois
 *
 */
public class Personne {
	
	// Propriétés
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String numeroTelephone;
	
	// Constructeurs
	public Personne() {
		
	}
	
	public Personne(int id, String nom, String prenom, String email, String adresse, String numeroTelephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.setEmail(email);
		this.adresse = adresse;
		this.numeroTelephone = numeroTelephone;
	}
	
	// Accesseurs
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Méthodes

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse="
				+ adresse + ", numeroTelephone=" + numeroTelephone + "]";
	}
}
