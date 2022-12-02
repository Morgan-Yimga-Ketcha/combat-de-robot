package robotique;
//exercice1

public class Robot {
	protected String nom;
	private int nombrePointVie=10;
	
	//le constructeur
	public Robot(String nom) {
		this.nom=nom;
		this.nombrePointVie=10;

}
	//la methode Fire
		public void fire(Robot R) {
			R.nombrePointVie-=2;
			System.out.println("le robot "+R.nom+" a été tiré");
		}
		
	//la  methode isDead
	public boolean isDead(){
		if(nombrePointVie >0 && nombrePointVie <=10){
			return false;
		}else {
			return true;
		}
		
	}
	
	
	
	}
