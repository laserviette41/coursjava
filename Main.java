//package firstpck;
import java.util.*;

public class Main{
	public static void main(String []args){
		double x=19.95;
		Pullover p=new Pullover(1,x,"Brun");
		Pullover q=new Pullover(2,x,"Rouge");
		Pullover s=new Pullover(3,x,"Vert");
		Rayon r=new Rayon(p);
		r.ajoutPull(q);
		r.ajoutPull(s);
		String h=r.toString();
		System.out.println(h);
	}
}