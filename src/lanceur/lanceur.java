package lanceur;

import java.util.Scanner;

public class lanceur {
	
	public static String[] tab1 = {"Tu as", "ans"};
	//public static String[] tab1 = new String [2];	
	public static int age;
	public static String nom;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	demande_info();
	//tableau_simple();
	//lecture_tableau();
	//lecture_tableau_foreach();
	ternaire();
	ternaire_imbrique();
	
		
	
	
 }
	
	public static void demande_info()
	{
		Scanner sc = new Scanner(System.in)	;
		System.out.println("quel est ton nom ?");
		nom = sc.nextLine();
		System.out.println("Salut " + nom);
		System.out.println("quel est ton age ?");
		age = sc.nextInt();
	}
	public static void tableau_simple()
	{
		// insertion donnee tableau
		tab1[0] = "Tu as"; 
		tab1[1] = "ans";
		// fin
			
		System.out.println(tab1[0] + " " + age + " " + tab1[1]);
	}
	
	public static void lecture_tableau()
	{
		for (int i= 0; i< tab1.length; i++)
		{
			if (i != 1) // different de
			//if (i%2 == 0) // avec modulo
			{
				System.out.print(tab1[i] +" " + age + " ");
			}		
			else 
			{
				System.out.print(tab1[i]);
			}
			
		}
	}
	
	public static void lecture_tableau_foreach()
	{
		for (String str : tab1)
		{
			if (str.equals(tab1[tab1.length-1]))
					{
				System.out.print(" "+ age +" "+ str +   " " );
					}
			else
			{
				System.out.print(str);
			}
		}
	}
	
	public static void ternaire()
	{
		// condition ternaire
		for (int i = 0; i < tab1.length; i++)
		{
		String resultat = i !=1 ? tab1[i] +" " + age + " " : tab1[i];
		System.out.print (resultat);
		}
		//fin 
	}
	
	public static void ternaire_imbrique()
	{
		// condition ternaire imbriqué 
		String resultat2 = (age < 18) ?
				(age > 3) ?
						"tu n'est pas enfant" : "tu est un enfant" 
					: "tu est un adulte";
		System.out.print (" " + resultat2);
		// fin
	}
}
