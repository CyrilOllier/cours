package lanceur;

import java.util.Arrays;

public class lanceur {
	
	public static String[] tab1 = new String [2];
	
	//public static String[] tab = {"bonjour ", "à tous"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		tab1[0] = "bonjour ";
		tab1[1] = "à tous ";
		//for (int i = 0; i < tab1.length; i++)
	//	{
	//		System.out.println(i + " = " + tab1[i] );
	//	}
		for(String variable : tab1)
		{
			System.out.print(variable);
		}
		//System.out.println(tab1[0] + tab1[1]);
		System.out.println("\nVotre tableau contien : " + tab1.length + " celule");
		//System.out.println(Arrays.toString(tab1));
		//System.out.println(tab[0] + tab[1]);
		//System.out.println(Arrays.asList(tab1));
		
		
 }
}
