package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numlist = new ArrayList<>();
		//List<String> liste1 = Arrays.asList(new String[] {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"});
		Collections.addAll(numlist, -1, 5, 7, 3, -2, 4, 8, 5);
	//	numlist.add(-1);
		//numlist.add(5);
		//numlist.add(7);
		//numlist.add(3);
		//numlist.add(-2);
		//numlist.add(4);
		//numlist.add(8);
		//numlist.add(5);
		
		for (int i=0; i<numlist.size(); i++) {
			System.out.println(numlist.get(i));
		}
		System.out.println("longeur de liste: "+numlist.size());
		
		int k=0;
		for (int i=0; i<numlist.size(); i++) {
			
			if (k<numlist.get(i)) {
			k=numlist.get(i);
			}
		}
		
		System.out.println("Plus grande element: "  + k);
		
		 int m=0;
		for (int i=0; i<numlist.size(); i++) {
			
			if (m>numlist.get(i)) {
				m=i;
			}
		}
		
		numlist.remove(m); 
		
		System.out.println ("Syprimer -2 ");
		for (int i=0; i<numlist.size(); i++) {
			System.out.println(numlist.get(i));
		
		}
		
for (int i=0; i<numlist.size(); i++) {
			
			if (numlist.get(i)<0) {
				numlist.set(i, -1 * (numlist.get(i)));
			}
		}
System.out.println("les éléments négatifs  deviennent positifs: ");
for (int i=0; i<numlist.size(); i++) {
	System.out.println(numlist.get(i));

}
		
		
	}

}
