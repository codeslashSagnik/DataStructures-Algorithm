package linkedList1;

public class Runner {

	public static void main(String[] args) {
		Linkedlist list =new Linkedlist();
		list.insert(7);
		list.insert(7);
		list.insert(9);
		list.insert(9);
		list.insert(10);
		list.insertAt(3, 8);
		list.deleteAt(4);
		list.show();
		list.removeduplicate();
		list.show();
		System.out.println("Total number of nodes is "+list.count());
		list.search(9) ;
		
		
	}

}
