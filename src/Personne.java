
public class Personne {

	private  int age ;
    private  String prenom;
    private  String nom;
    Adresse adresse;
    
	public Personne(){
		//this.nom = "";
		//this.prenom = "";
		//this.age = 0;
	}
    
    public Personne(String nom, String prenom) {
		// TODO Auto-generated constructor stub
		super();
		this.nom = nom;
		this.prenom = prenom;	}

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;			}
	
	public void adressePers(String numeroDeVoie, String nomDeVoie, int codePostal, String ville) {
	    
		if (this.adresse == null)  
		{adresse = new Adresse();
		this.adresse.demenager(numeroDeVoie, nomDeVoie, codePostal, ville);}
		else {this.adresse.demenager(numeroDeVoie, nomDeVoie, codePostal, ville);}
		
	}
	
	
	public  void setName(String newNom){
		if (this.nom == null) this.nom= newNom;	}
	
	public void setFirstName(String newPrenom){
		if (this.prenom == null) { this.prenom= newPrenom;}
	else {System.out.println("interdit de modifier le prénom");}}
	
	public void setAge(int newAge){
		this.age= newAge; }
	
	public String getName(){
		return nom;	}
	
	public String getFirstName(){
		return prenom; }
	
	public int getAge(){
		return age;	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (age == 0) {return nom + " " + prenom; }
		else {return nom + " " + prenom + " " + age;}
		
	}
}
