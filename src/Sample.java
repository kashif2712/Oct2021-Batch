
public class Sample {

	public static void main(String[] args) {
		
    String firstname = "micheal";
    String middlename = "K.";
    String lastname = "jordan";
    String fullname = firstname+" "+lastname;
    
    System.out.println(firstname+" "+lastname);
    System.out.println(fullname);
    System.out.println(fullname.toUpperCase());
    System.out.println(fullname.toLowerCase());
    
    String fullname2 = firstname.concat(" "+lastname);
    System.out.println(fullname2);
    
    System.out.println(firstname.concat(" "+middlename.concat(" "+lastname)));
    String fullname3 = firstname.concat(" "+middlename.concat(" "+lastname));
    
    int index = fullname3.indexOf('K');
    System.out.println("Index of K: "+index);
    System.out.println("position of K: "+(index+1));
    
    int indexOflastname= fullname3.indexOf(lastname);
    System.out.println("Last starts from index: "+indexOflastname);
    
    char characterAt5 =fullname3.charAt(5);
    System.out.println("Character at 5th index: "+characterAt5);
    
    fullname3 =fullname3.concat("a a a a a");
    System.out.println("First occurence of a : "+fullname3.indexOf('a'));
    System.out.println("Second occurence of a: "+fullname3.indexOf('a',6));
    fullname3.indexOf('a');
    int thirdOccurenceOfa =fullname3.indexOf('a', fullname3.indexOf('a')+1)+1;
    System.out.println("Third occurence of a: "+thirdOccurenceOfa);
    
    String address ="123 court sq, LIC, NY 11000";
    int indexOfcharacter = address.indexOf('L');
    String address2= address.substring(indexOfcharacter);
    System.out.println(address2);
    int zipcodeIndex = address.indexOf('1', address.indexOf('1')+1);
    String zipcode= address.substring(zipcodeIndex);
    System.out.println(zipcode);
    
    String custfirstname= "   David    ";
    custfirstname = custfirstname.trim();
    System.out.println("Welcome "+ custfirstname+"!");
    
    System.out.println("Is NY present? "+address.contains("NY"));
    System.out.println(address.contains("c"));
    
    address =address.replace("123", "321");
    System.out.println(address);
    System.out.println(address.replace(" sq",""));
    
    String a= " ";
    String b = "";
    System.out.println(a);
    System.out.println(b);
    
    System.out.println("Is a empty? "+a.isEmpty());
    System.out.println("Is a blank? "+a.isBlank());
    System.out.println("Is b empty? "+b.isEmpty());
    System.out.println("Is b blank? "+b.isBlank());
    
    
     
    
		
	}

}
 