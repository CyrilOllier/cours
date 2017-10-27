package lanceur;

import java.util.Scanner;

public class lanceur {
	
	public static String dateBuilder[][] = {
		{"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Décembre"},
		{ "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimmanche"}
	};
	public static int jour; // NB restant apres calcul !
	public static int mois; // indice numero du moi
	public static int numeroJour; // valeur entrer par l'utilisateur
	
	public static final int MOIS31 = 31; 
	public static final int MOIS30 = 30;
	public static int cpt31 = 1;
	public static int cpt30 = 1;
	
	public static int semaineNum = 0; //numero de la semaine
	public static String affiche; // affichage jour de la semaine
	public static int ctrlAnneeType;
	public static int anneeType;
	public static String typeAnnee;
	public static int annee = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez taper un numero de jour ?");
		numeroJour = sc.nextInt();
		
		if (numeroJour <= (MOIS31 * cpt31)) mois = 0; // janvier
		else if (numeroJour <= (MOIS31 * cpt31) + (MOIS30 * cpt30) - 1) mois = 1; // fevrier
		else if (numeroJour <= (MOIS31 * ++cpt31) + (MOIS30 * cpt30) - 1) mois = 2; //mars
		else if (numeroJour <= (MOIS31 * cpt31) + (MOIS30 * ++cpt30) - 1) mois = 3; // avril
		else if (numeroJour <= (MOIS31 * ++cpt31) + (MOIS30 * cpt30) - 1) mois = 4; // mai 
		else if (numeroJour <= (MOIS31 * cpt31) + (MOIS30 * ++cpt30) - 1) mois = 5; // juin
		else if (numeroJour <= (MOIS31 * ++cpt31) + (MOIS30 * cpt30) - 1) mois = 6; // juillet
		else if (numeroJour <= (MOIS31 * ++cpt31) + (MOIS30 * cpt30) - 1) mois = 7; // aout
		else if (numeroJour <= (MOIS31 * cpt31) + (MOIS30 * ++cpt30) - 1) mois = 8; // septembre
		else if (numeroJour <= (MOIS31 * ++cpt31) + (MOIS30 * cpt30) - 1) mois = 9; // octobre
		else if (numeroJour <= (MOIS31 * cpt31) + (MOIS30 * ++cpt30) - 1) mois = 10; // novembre
		else if (numeroJour <= (MOIS31 * ++cpt31) + (MOIS30 * cpt30) - 1) mois = 11; // decembre
		
		// annee type
		ctrlAnneeType = numeroJour % 1095; 
		if(ctrlAnneeType != 1)
		{
			typeAnnee = "Normale";
		}
		else 
		{
			typeAnnee = "Bisextile";
		}
		// fin annee type
		
		// recuperation nombre de jour restant (ok)	
		int modulo = numeroJour % 7;
		jour = modulo  == 0 ? 7 : modulo;
		
		
		
		// reglage bug sur affichage jour (ok)
		if (jour == 0)
		{
			affiche = dateBuilder[1][6];
		}
		else if (jour <= 0)
		{
			jour = 0;
			affiche = dateBuilder[1][jour];
		}
		else
		{
			affiche = dateBuilder[1][jour-1];
		}
		// fin
		
		// reglage bug numsemaine	
		
		
		/*if (numeroJour < 7)
		{
			semaineNum = 1;
		}
		/*else if ( (numeroJour >= 8) && (numeroJour <= 14) )
		{
			semaineNum = 2;
		}
		else  
		{*/
			//semaineNum = numeroJour / 7;
			//semaineNum = semaineNum +1 ;						
		/*}*/
		
		
		
		//System.out.println("ce sera la semaine : " + semaineNum + " resultat " + semaineNum * 7 + " il reste en jour : " + jour + " le jour de la semaine est : " + affiche  );
		//System.out.println("nous seron au mois de : " + dateBuilder[0][mois] + mois);
		System.out.println("nous seron au mois de : " + dateBuilder[0][mois]);
		System.out.println("ce sera un : " + affiche );
		System.out.println("le numero de semaine est le : " + semaineNum );
		System.out.println(" c'est l'annee : " + annee);
		System.out.println("c'est une annee : " + typeAnnee +" pour test voir numero annee " + ctrlAnneeType);
		/*
		switch(numeroJour)
		{		
		case 31 : mois = numeroJour <= 31; System.out.println(dateBuilder[0][0]); break;
		case 60 : mois = numeroJour <= 31+29; System.out.println(dateBuilder[0][1]); break;
		case 91 : mois = numeroJour <= (31*2)+29; break;
		case 121 : mois = numeroJour <= (31*2)+30+29; break;
		case 152 : mois = numeroJour <= (31*3)+30+29; break;
		case 182 : mois = numeroJour <= (31*3)+(30*2)+29; break;
		case 213 : mois = numeroJour <= (31*4)+(30*2)+29; break;
		case 243 : mois = numeroJour <= (31*4)+(30*3)+29; break;
		case 274 : mois = numeroJour <= (31*5)+(30*3+29); break;
		case 304: mois = numeroJour <= (31*5)+(30*4)+29; break;
		case 335: mois = numeroJour <= (31*6)+(30*4)+29; break;
		case 365: mois = numeroJour <= (31*6)+(30*5)+29; break;
		default: System.out.println("veuillez taper un chiffre"); break;
		}*/
		
		//System.out.println("nous somme le :" + dateBuilder);
	//System.out.println(numeroJour);
		
		
		
	}
	
}
