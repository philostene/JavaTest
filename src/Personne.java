
public class Personne {

	public int age ;
    public String prenom;
    public String nom;
	
	public Personne(String nom, String prenom) {
		// TODO Auto-generated constructor stub
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		
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
