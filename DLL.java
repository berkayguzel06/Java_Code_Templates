
public class DLL {

	private DLL_Node head;
	private DLL_Node tail;
	public DLL() {
		head = null;
		tail = null;
	}
	public void add(Object dataToAdd) {
		if(head == null && tail == null) {
			DLL_Node newNode = new DLL_Node(dataToAdd);
			head = newNode;
			tail = newNode;
		}
		else {
			DLL_Node newNode = new DLL_Node(dataToAdd);
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	public int size(){
		 int count = 0;
		 DLL_Node temp = head;
		 while(temp != null){
		 count++;
		 temp = temp.getNext();
		 }
		 return count;
	}
	public void display(){
		DLL_Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData()+"\n");
		    temp = temp.getNext();
		}
	}
}
