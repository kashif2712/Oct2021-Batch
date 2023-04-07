import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	// ArrayList -> data table Structure -> one column 

	public static void main(String[] args) {
	// creating ArrayList data table
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add("Name");
		al.add("true");
		al.add('C');
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("David");
		al1.add("M.");
		al1.add("101010");
		al1.add("QA");
		al1.add("Manhattan");
		al1.add("QA Manager");
//		al1.add((120000);   not allowed any other data type other than String
		al1.add("120000");
		
		System.out.println(al1);
		
//    extracting value
	  System.out.println("Job location of "+al1.get(0)+" "+al1.get(1)+": "+al1.get(4));
	  
//    Total number of rows 
	  System.out.println("Numberof rows: "+al1.size());
	  
	  System.out.println("Employee Detail");
//	  for( int i=0; i<al1.size(); i++) {
//		  System.out.println(al1.get(i));
//	  }
	  // while loop
//	  int i= 0;
//	  while(i<al1.size());
//	     System.out.println(al1.get(i));
//	     i++;
	  
//   for each loop
	  for(String a: al1){
		  System.out.println(a);
	  }
//	  Iterator Concept /
		
	  Iterator<String> it= al1.iterator();
//	  System.out.println("Value in 1st row: "+it.next());
//	  System.out.println("Row 2nd present or not? "+it.hasNext());
//	  System.out.println(("Value in 2nd row : "+it.next()));
//	  System.out.println("Row 3rd present or not? "+it.hasNext());
//	  System.out.println("Value in 3rd row: "+it.next());
//	  System.out.println("Row 4th present or not? "+it.hasNext());
//	  System.out.println("Value in 4th row: "+it.next());
//	  System.out.println("Row 5th present or not? "+it.hasNext());
//	  System.out.println("Value in 5th row: "+it.next());
//    System.out.println("Row 6th present or not? "+it.hasNext());
//    System.out.println("Value in 6th row: "+it.next());
//	  System.out.println("Row 7th present or not? "+it.hasNext());
//	  System.out.println("Value in 7th row: "+it.next());
//	  System.out.println("Row 8th present or not? "+it.hasNext());
//	  System.out.println("Value in 8th row: "+it.next());
	  
	  while (it.hasNext()) {
		  System.out.println(it.next());
	  }
	  
	  // some methods
	  al1.add(1, "K.");
	  System.out.println(al1);
	  	 
      al1.remove(4);
      System.out.println(al1);
      
      
      System.out.println(al1.contains("M."));
	  System.out.println(al1.contains("david"));	
	  
	  System.out.println(al1.indexOf("Manhattan"));
	  
//	  al1.clear();
	  System.out.println(al1);
	  System.out.println(al1.isEmpty());
	  
	  Object al2 = al1.clone();
	  al1.add(4, "QA");
	  System.out.println(al1.equals(al2));
	  
		

	}

}
