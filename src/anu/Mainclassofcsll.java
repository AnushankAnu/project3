package anu;

public class Mainclassofcsll {
	public static void main(String[] args) {
		Csll s1=new Csll();
		s1.creationcsll(5);
		System.out.println("the list is inserted with value of"+s1.head.value);
	
		
		s1.insertionofcsll(1,9);
		s1.insertionofcsll(2,8);
		s1.insertionofcsll(3,7);
		s1.insertionofcsll(4,6);
		s1.insertionofcsll(5,11);
		
		
		s1.traversalofcsll();
		
		s1.searchingofcsll(7);
		
		s1.deletingcsll();
		
	}

}
