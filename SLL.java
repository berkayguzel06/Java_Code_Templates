public class SLL {

	public Node head = null;
	public Node tail = null;
	public void addSorted(Object data) {
		
		if(head==null) {
			Node newNode = new Node(data);                   // adding first element
			head = newNode;
			tail = newNode;
		}
		else if(Integer.parseInt(data.toString().split(" ")[1]) < Integer.parseInt(head.getData().toString().split(" ")[1])) {           // adding to front node the first element
			Node newnode = new Node(data);
			newnode.setLink(head);
			head = newnode;
		}
		else {
			Node temp = head;
			Node previous = null;              
			// split names and scores and sort them according to their scores
			while(temp!=null && Integer.parseInt(data.toString().split(" ")[1]) > Integer.parseInt(temp.getData().toString().split(" ")[1])) {
				previous = temp;
				temp=temp.getLink();
			}
			if(temp==null){                                     // adding to last 
				Node newnode = new Node(data);
				previous.setLink(newnode);
			}
			else {                                              // adding between two nodes
				Node newnode = new Node(data);
				newnode.setLink(temp);
				previous.setLink(newnode);
			}
		}
	}
	public void add(Object data) {
		
		if(head==null) {
			Node newNode = new Node(data);                   // adding first element
			head = newNode;
			tail = newNode;
		}
		else  {           // adding to front node the first element
			Node newnode = new Node(data);
			newnode.setLink(head);
			head = newnode;
		}
	}
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		while(current != null) {
			System.out.print(current.getData()+" ");
			current = current.getLink();
		}
	}
	public int size() {
		int count = 0;
		if(head == null) {
			System.out.println("Linked list is empty.");
		}
		else {
			Node temp = head;
			while(temp != null){
				count++;
				temp=temp.getLink();
			}
		}
		return count;
	}
	public void reversed() {
		SLL temp = new SLL();
		while(true) {
			Node temH = head;
			while(temH.getLink()!=null) {
				temH = temH.getLink();
			}
			temp.add(temH.getData()); 
			temH.setLink(null);
			if(size()==0) {break;}
		}
		temp.display();
	}
}
