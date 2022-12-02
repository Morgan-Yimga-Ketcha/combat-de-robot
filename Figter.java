package robotique;
import java.util.*;

public class Figter extends Robot{
	public Figter(String nom) {
		super(nom);
		
	}
//la methode affiche
	public String toString() {
		return "Figter "+this.nom;
	}
	
	
	//redefinition de la methode fight
	public Robot fight(Robot R) {
		// appel de methode
		if(!R.isDead()) {
			fire(R);
		}
		Random r=new Random();
			r.nextInt();
		System.out.println("le robot "+R.nom+" a été touché par le robot "+this.nom);
		return this;	
		
	}
	
		
				
	}
	

