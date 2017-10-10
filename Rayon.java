import java.*;

public class Rayon{
	public Pullover []pull;
	private int nb=0;
	
	Rayon(Pullover p){
		pull=new Pullover[1];
		pull[0]=new Pullover(p);
		nb++;
	}
	
	public void ajoutPull(Pullover p){
		if(nb<=30){
			Pullover []tmp=pull;
			pull=new Pullover[nb+1];
			System.arraycopy(tmp,0,pull,0,nb);
			pull[nb]=new Pullover(p);
			nb++;
		}
		else
			System.out.println("Rayon Plein");
	}
	
	public int getNb(){
		return nb;
	}
	
	public String toString(){
		int i=0;
		String str=pull[i].toString();
		for(i=1;i<nb;i++)
			str+=pull[i].toString();
		return str;
	}
	
	public void affiche(){
		String s=toString();
		System.out.println(s);
	}
	
	public int enleveAbime(){
		for(int i=0;i<nb;i++){
			if(pull[i].getAbime()){
				
			}
		}
	}
}