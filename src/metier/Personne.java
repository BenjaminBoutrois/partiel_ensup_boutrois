package metier;

public class Personne {
	
	// Propriétés
	private int id;
	private String nom;
	private String prenom;
	private String adresseEmail;
	private String adresse;
	private String numeroTelephone;
	
	// Constructeurs
	public Personne() {
		
	}
	
	public Personne(int id, String nom, String prenom, String adresseEmail, String adresse, String numeroTelephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresseEmail = adresseEmail;
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
	public String getAdresseEmail() {
		return adresseEmail;
	}
	public void setAdresseEmail(String adresseEmail) {
		this.adresseEmail = adresseEmail;
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
	
	// Méthodes
	
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresseEmail=" + adresseEmail
				+ ", adresse=" + adresse + ", numeroTelephone=" + numeroTelephone + "]";
	}
}
