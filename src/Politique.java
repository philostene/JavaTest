//test de subclass de subclass
public class Politique extends Refugie {  
    private String typeRefugie;
	
    public boolean Politique(String typeRefugie) {
		
    	// TODO Auto-generated constructor stub
		 if (typeRefugie == "Politique") {System.out.println("Il s'agit d'un r�fugi� politique");}
		 else if (typeRefugie == "Economique")  {System.out.println("Il s'agit d'un r�fugi� politique");}
		 this.typeRefugie = typeRefugie;
		 return true;

}}
