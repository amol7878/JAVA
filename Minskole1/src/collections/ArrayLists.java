package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// collection
		// list (extends collection)
		// arrayList (implements list)

		// java ArrayList vs Array

		// ADD The Element

		ArrayList<Integer> listA = new ArrayList<>();
		listA.add(12);
		listA.add(13);
		listA.add(14);
		listA.add(15);

		System.out.println(listA);

		// Array List Of String

		ArrayList<String> names = new ArrayList<>();
		names.add("chinmay");
		names.add("Sarika");
		names.add("Poorva");
		names.add("Sham");
		names.add("Ram");

		System.out.println(names);

		// Retrieve the Element

		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));

		for (int i = 0; i < names.size(); i++) {
			System.out.println(i);
			System.out.println(names.get(i));
		}

		// Update The Element

		names.set(2, "KOMAL");
		System.out.println(names.get(2));

		// Updating the Value At Particular index

		names.remove(2);
		System.out.println(names);

		// Methods

		ArrayList<String> names2 = new ArrayList<>();
		names2.add("chinmay");
		names2.add("Sarika");
		names2.add("Poorva");
		names2.add("Sham");
		names2.add("Ram");
		
		
		// size()
		int aa =names2.size();
		System.out.println(aa);
		System.out.println(names2);
		
		// Sort()
//		names2.sort(null);
//		System.out.println(names2);
		
		Collections.sort(names2);
	    System.out.println(names2);
	    
	    //IsEmpty()
	    
	    boolean b =names2.isEmpty();
	    System.out.println(b);
	    ArrayList<String> names3 = new ArrayList<>();
	    boolean c =names3.isEmpty();
	    System.out.println(c);
	    
	    names3.add("Mayuri");
	    names3.add("Poorva");
	    names3.add("Sham");
	    
	    //IndexOf()
	    
	    int ia = names3.indexOf("Mayuri");
	    System.out.println(ia);
	    
	    // contains()
	    
	    boolean qa = names3.contains("Sham");
	    System.out.println(qa);
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
