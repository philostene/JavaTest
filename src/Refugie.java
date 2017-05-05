
public class Refugie extends Personne{
	
	private boolean Regularise;
	Adresse adresse;
			
	 public Refugie() {
		// TODO Auto-generated constructor stub
		 this.Regularise = false;
	}
	 public Refugie(boolean regul) {
			// TODO Auto-generated constructor stub
			 this.Regularise = regul;
	 }
	 
	 public void adresseRef(String numeroDeVoie, String nomDeVoie, int codePostal, String ville) {
		 
		 if (this.adresse == null)  {adresse = new Adresse();
		                             this.adresse.demenager(numeroDeVoie, nomDeVoie, codePostal, ville); }
		 else if (this.getRegul()) { 
			 System.out.println("mofication adresse");
			 this.adresse.demenager(numeroDeVoie, nomDeVoie, codePostal, ville); }
		         else {System.out.println("Interdit de modification");}
		 
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


