
public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean flag;
        String mdp;      	;
	    Personne Eric = new Personne("Phil","Corry");
		Personne Phil = new Personne("Phil","Corry",57);
		Personne Toto = new Personne();
		Refugie Azimov = new Refugie();
		Politique Zorro = new Politique();
		Toto.setName("Bibi");
		Toto.setFirstName("Fricotin");
		Toto.setAge(99);
		
		
		
		Toto.adressePers("300","Lagny",93000,"Montreuil");	
		System.out.println(Toto.adresse.getnumVoie()+" "+ Toto.adresse.getnomVoie());
		
		Azimov.setName("Ulysse");
		Azimov.setFirstName("Azimov");
		Azimov.setAge(44);
		
		
	    Azimov.adresseRef("60","Lagny",93000,"Montreuil");
	    System.out.println("Azimov adresse " + Azimov.adresse.getnumVoie()+" "+ Toto.adresse.getnomVoie());
	    Azimov.adresseRef("30","Lagny",93000,"Montreuil");
	    //	Azimov.setnomVoie("Victor Hugo");
	//	Azimov.setcodePostal(93000);
	//	Azimov.setville("Montreuil");
		
		Azimov.setFirstName("Penelope");
	//	Azimov.setville("Paris");
		
		mdp="Siplon";
		flag = Azimov.regulariser(mdp);
		if (flag) {System.out.println("mot de passe OK");}
		else {System.out.println("error  mot de passe");}
		
	//	Azimov.setville("Roissy");
	//	System.out.println(Azimov.getville());

		System.out.println(Azimov);
		
		mdp="simplon";
		flag = Azimov.regulariser(mdp);
		if (flag) {System.out.println("mot de passe OK");}
		else {System.out.println("error  mot de passe");}
		
		 Azimov.adresseRef("30","Lagny",93000,"Montreuil");
		 System.out.println("Azimov adresse " + Azimov.adresse.getnumVoie()+" "+ Toto.adresse.getnomVoie());
	//	Azimov.setville("Marseille");
	//	System.out.println(Azimov.getville());
		
		System.out.println(Eric);
		System.out.println(Phil);
		System.out.println(Toto);
		System.out.println(Azimov);
		
		Zorro.setFirstName("Diego");
		Zorro.Politique("Politique");
	}

}
