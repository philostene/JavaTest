
public class Refugie extends Personne{
	
	private  String numVoie;
    private  String nomVoie;
    private  int codePostal;
    private String ville;
	private boolean Regularise;
			
	 public Refugie() {
		// TODO Auto-generated constructor stub
		 this.Regularise = false;
	}
	 public Refugie(boolean regul) {
			// TODO Auto-generated constructor stub
			 this.Regularise = regul;
	 }
	
	 public void setRegul(boolean newRefugie){
			this.Regularise = newRefugie;
	 }
	 public boolean getRegul() {
		 return this.Regularise;
	 }
	 
	 public boolean regulariser(String motDePasse){
		 
		 if (motDePasse == "simplon") {
			 setRegul(true);
			 return true;
		 }
		 else { setRegul(false);
		 return false;}
		 
	 }
	 
	    public void setnumVoie(String newNumVoie){
			if (this.numVoie == null) {this.numVoie= newNumVoie; }
	    else if (Regularise) { this.numVoie= newNumVoie; }
				else {System.out.println("Interdit de modification");}}
				
		public void setnomVoie(String newNomVoie){
			if (this.nomVoie == null) {this.nomVoie= newNomVoie; }
			else if (Regularise) { this.nomVoie= newNomVoie;  }
			else {System.out.println("Interdit de modification");}}
		
		public void setcodePostal(int newCodePostal){
			if (this.codePostal == 0) {this.codePostal= newCodePostal;
			                           System.out.println("Code postal " + this.codePostal);}  
			else if (Regularise) { this.codePostal= newCodePostal;  }
			else {System.out.println("Interdit de modification");}}
	
		
		public void setville(String newVille){
			if (this.ville == null) {this.ville= newVille; }
		else if (Regularise) { this.ville= newVille;  }
		else {System.out.println("Interdit de modification");}}

		
		public String getnumVoie(){
			return numVoie; }
		
		public String getnomVoie(){
			return nomVoie; }
		
		public int getcodePostal(){
			return codePostal; }
		
		public String getville(){
			return ville; }
		
	 
	 
	 
	 /* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			
			int age = this.getAge();
			String nom = this.getName();
			String prenom = this.getFirstName();
			String regul = "";
			if (Regularise) { regul = "Regularisé";}
			else  { regul = " Pas regularisé";}
			
			if (age == 0)  {return nom + " " + prenom + " " + regul; }
			else {return nom + " " + prenom + " " + age + " " + regul;}
			
	 
}
}


