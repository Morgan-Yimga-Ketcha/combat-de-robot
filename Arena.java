package robotique;

public class Arena extends Robot {
//constructeur
	public Arena(String nom) {
		super(nom);
	}
	// la methode fight
	public Robot fight(Robot R) {
		// appel de methode
		if(!R.isDead()) {
			fire(R);
		}
			System.out.println("le robot "+R.nom+" a été touché par le robot "+this.nom);
		return this;	
		
	}
}



