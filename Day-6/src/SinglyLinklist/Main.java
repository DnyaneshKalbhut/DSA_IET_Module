package SinglyLinklist;

public class Main {

	public static void main(String[] args) {
	
		SinglyLinklist s1 = new SinglyLinklist();
		s1.addNode(3);
		s1.addNode(4);
		s1.addNode(1);
		s1.addByPosition(6, 2);
		s1.addByValue(4, 23);
		s1.Display();
		System.out.println("---------------------------");
		s1.deleteByPosition(2);
		s1.Display();
		s1.deleteByVal(3);
		System.out.println("---------------------------");
		s1.Display();
	}

}
