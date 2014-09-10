class SampleSinglyLinkedList<T>{
	private Node<T> head;

	public SampleSinglyLinkedList(T input){
		Node<T> nodeInput = new Node<T>(input);
		head = nodeInput;
	}
	public SampleSinglyLinkedList(){
		head = null;
	}
	public void addToFirst(T input){
		if(null != input){
			Node<T> nodeInput = new Node<T>(input);
			if(head != null){
				nodeInput.next = head;
				head = nodeInput;
			}
			else{
				head = nodeInput;
			}
		}
	}
	public void addToLast(T input){
		if(input != null && head !=null){
			Node<T> nodeInput = new Node<T>(input);
			if(head != null){
				Node<T> itr = head;
				while(itr.next != null){
					itr = itr.next;
				}
				itr.next = nodeInput;
			}
			else{
				head = nodeInput;
			}
		}
	}
	public void deleteNode(T input){
		if(input != null && head != null){
			Node<T> nodeInput = new Node<T>(input);
			Node<T> itr = head;
			if(itr.value == nodeInput.value){
				head = itr.next;
				itr = null;
			}
			while(itr != null){
				if(itr.next != null && (itr.next.value == nodeInput.value)){
					Node<T> temp = itr.next;
					itr.next = itr.next.next;
					temp = null;
				}
				itr = itr.next;
			}
		}
	}
	public void printList(){
		if(head != null){
			Node<T> itr = head;
			System.out.println("Printing SampleLinkedList: ");
			while(itr != null){
				System.out.println(itr.value);
				itr = itr.next;
			}
		}
	}
	public Node<T> getHead(){
		return head;
	}
	class Node<T>{
		public T value;
		public Node<T> next;

		public Node(T value){
			this.value = value;
			this.next = null;
		}
	}
}