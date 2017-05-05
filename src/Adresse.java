
public class Adresse {
	    
	private  String numVoie;
	    private  String nomVoie;
	    private  int codePostal;
	    private String ville;
	
	    public Adresse() {
		// TODO Auto-generated constructor stub
	    	
	}
	   // private  Adresse(String numeroDeVoie, String nomDeVoie, int codePostal, String ville) {
		// TODO Auto-generated constructor stub
	    //	this.numVoie = numeroDeVoie;
	    //	this.nomVoie = nomDeVoie;
	    //	this.codePostal = codePostal;
	    //	this.ville = ville; }
	    
	    
		private void setnumVoie(String newNumVoie){
				this.numVoie= newNumVoie; 
		   // else if (this.getRegul()) { this.numVoie= newNumVoie; }
			//		else {System.out.println("Interdit de modification");}
				}
					
		private void setnomVoie(String newNomVoie){
			this.nomVoie= newNomVoie; 
			//	else if (Regularise) { this.nomVoie= newNomVoie;  }
			//	else {System.out.println("Interdit de modification");}
				}
			
		private void setcodePostal(int newCodePostal){
				this.codePostal= newCodePostal;
		
				                          
			//	else if (Regularise) { this.codePostal= newCodePostal;  }
			//	else {System.out.println("Interdit de modification");}
				}
		
			
		private void setville(String newVille){
				this.ville= newVille; 
			//else if (Regularise) { this.ville= newVille;  }
			//else {System.out.println("Interdit de modification");}
				}

			
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
		
}
