//package firstpck;
import java.util.*;

public class lecteur{
	
	public void HelloWorld(){
		System.out.println("Hello World");
	}
	
	public void HelloX(){
		Scanner x=new Scanner(System.in);
		String nom=x.nextLine();
		System.out.println("Hello " + nom);
	}
	
	public void HelloXs(Scanner x){
		String nom;
		while(x.hasNext()){
			nom=x.nextLine();
			System.out.println("Hello " + nom);
			if(nom.equals("end"))
				break;
		}
	}
}