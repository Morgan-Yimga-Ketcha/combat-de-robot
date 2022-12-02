package robotique;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arena D2R2=new Arena("D2R2");
		Arena Data=new Arena("Data");
		D2R2.fight(Data);
		Figter f1=new Figter("essai");
		Figter f2=new Figter("essai1");
		f1.fight(f2);
		System.out.println(f1.toString());
		D2R2.fire(Data);
		

	}

}
