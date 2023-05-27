package anu;

public class Mainclass {
	public static void main(String[] args) {
		Sll s1=new Sll();
		s1.creationsll(5);
		System.out.println("the list is created with the value of"+s1.head.value);
		s1.insertion(1, 2);
		s1.insertion(2, 3);
		s1.insertion(3, 4);
		s1.insertion(4, 5);
		s1.insertion(5, 5);
		
		s1.traversalofsll();
		s1.searchingofsll(3);
		s1.deletingsll();
		
	}

}
