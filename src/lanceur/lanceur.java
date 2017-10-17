package lanceur;

import java.util.Scanner;

public class lanceur {
	
	public static String[] tab1 = {"Tu as", "ans"};
	//public static String[] tab1 = new String [2];	
	public static int age;
	public static String nom;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in)	;
	System.out.println("quel est ton nom ?");
	nom = sc.nextLine();
	System.out.println("Salut " + nom);
	System.out.println("quel est ton age ?");
	age = sc.nextInt();
	
/*	for (int i= 0; i< tab1.length; i++)
	{
		//if (i != 1) // different de
		if (i%2 == 0) // avec modulo
		{
			System.out.print(tab1[i] +" " + age + " ");
		}		
		else 
		{
			System.out.print(tab1[i]);
		}
		
	}*/
	
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
	sc.close();
		//tab1[0] = "Tu as";
		//tab1[1] = "ans";
	
		//System.out.println(tab1[0] + " " + age + " " + tab1[1]);
	
 }
	
}
