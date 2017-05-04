
public class Personne {

	private  int age ;
    private  String prenom;
    private  String nom;
    private  String numVoie;
    private  String nomVoie;
    private  int codePostal;
    private String ville;
    
	public Personne(){
		//this.nom = "";
		//this.prenom = "";
		//this.age = 0;
	}
    
    public Personne(String nom, String prenom) {
		// TODO Auto-generated constructor stub
		super();
		this.nom = nom;
		this.prenom = prenom;
		
	}

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;	
	}
	
	public  void setName(String newNom){
		if (this.nom == null) this.nom= newNom;	}
	
	public void setFirstName(String newPrenom){
		if (this.prenom == null) { this.prenom= newPrenom;}
	else {System.out.println("interdit de modifier le prénom");}}
	
	public void setAge(int newAge){
		this.age= newAge; }
	
	public void setnumVoie(String newNumVoie){
		this.numVoie= newNumVoie; }
	
	public void setnomVoie(String newNomVoie){
		this.nomVoie= newNomVoie; }
	
	public void setcodePostal(int newCodePostal){
		this.codePostal= newCodePostal; }
	
	public void setville(String newVille){
		this.ville= newVille; }
	
	public String getName(){
		return nom;	}
	
	public String getFirstName(){
		return prenom; }
	
	public int getAge(){
		return age;	}
	
	public String getnumVoie(){
		return numVoie; }
	
	public String getnomVoie(){
		return nomVoie; }
	
	public int getcodePostal(){
		return codePostal; }
	
	public String getville(){
		return ville; }
	
	boolean demenager(String numeroDeVoie, String nomDeVoie, int codePostal, String ville)
	{
		setnumVoie(numeroDeVoie);
		setnomVoie(nomDeVoie);
		setcodePostal(codePostal);
		setville(ville);
		
		return true ;
	}
	
	
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
