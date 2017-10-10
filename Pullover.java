import java.*;

public class Pullover{
	private final static String marque="Nike";
	private static String modele="XLS";
	private final int taille;
	private double prix;
	private boolean etat;
	private boolean abime;
	private String couleur;
	
	public String getTaille(){return taille;}
	public double getPrix(){return prix;}
	public boolean getEtat(){return etat;}
	public boolean getAbime(){return abime;}
	public String getCouleur(){return couleur;}
	public String getMarque(){return marque;}
	public String getModele(){return modele;}
	
	Pullover(int tai,double px, String cou){
		taille=tai;
		prix=px;
		etat=false;
		couleur=cou;
		abime=false;
	}
	
	Pullover(Pullover p){
		taille=p.getTaille();
		prix=p.getPrix();
		etat=p.getEtat();
		abime=p.getAbime();
		couleur=p.getCouleur();
	}
	
	public void setCouleur(String cou){
		couleur=cou;
	}
	
	public void setEtat(boolean e){
		etat=e;
	}
	
	public void setAbime(boolean a){
		abime=a;
	}
	
	public static void setModele(String m){
		modele=m;
	}
	
	public String toString(){
		String str=marque + " " + modele + " " + taille + " " + prix + " " + etat + " " + abime + " " + couleur + "\n";
		return str;
	}
	
	
}