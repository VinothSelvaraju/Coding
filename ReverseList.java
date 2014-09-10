class ReverseList{
	public static SampleSinglyLinkedList<Integer> reverseLinkedList(SampleSinglyLinkedList<Integer> list){
		//rip the head off and pass the tail to the same func

		SampleSinglyLinkedList<Integer> outList = null;
		SampleSinglyLinkedList<Integer> finalOutList = new SampleSinglyLinkedList<Integer>();
		SampleSinglyLinkedList<Integer>.Node<Integer> itr = list.getHead();
		itr = itr.next;
		if(itr != null){
			outList = new SampleSinglyLinkedList<Integer>(itr.value);
		}
		while(itr != null){
			itr = itr.next;
			if(itr != null){
				outList.addToLast(itr.value);
			}
		}
		if(finalOutList != null && outList != null && outList.getHead() != null){
			System.out.println("TEST : " + outList.getHead().value);
			finalOutList.addToLast((reverseLinkedList(outList)).getHead().value);
		}
		return finalOutList;

	}
	public static void main(String[] args){
		SampleSinglyLinkedList<Integer> list = new SampleSinglyLinkedList<Integer>(0);
		list.addToLast(1);
		list.addToLast(2);
		list.addToLast(3);
		list.addToLast(4);
		list.addToLast(5);
		reverseLinkedList(list);
		list.printList();
	}
}