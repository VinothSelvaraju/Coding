//remove duplicates from unsorted LinkedList
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
class RemoveDuplicateLinkedList{
	public static LinkedList<Integer> removeDuplicate(LinkedList<Integer> list){
		LinkedList<Integer> outList = new LinkedList<Integer>();
		if(list != null){
			Set<Integer> set = new HashSet<Integer>();
			set.addAll(list);
			outList.addAll(set);
			return outList;
		}
		return null;
	}

	public static SampleSinglyLinkedList<Integer> removeDuplicateWithoutBuf(SampleSinglyLinkedList<Integer> list){
		//1->2->3->2->5->1
		if(list != null){
			SampleSinglyLinkedList<Integer>.Node<Integer> head = list.getHead();
			SampleSinglyLinkedList<Integer>.Node<Integer> itr = head;
			while(itr != null){
				System.out.println("OUT LOOP : "+ itr.value);
				SampleSinglyLinkedList<Integer>.Node<Integer> itr1 = itr;
				// SampleSinglyLinkedList<Integer>.Node<Integer> itr1 = itr.next;
				// if(itr.value == itr1.value){
				// 	itr1 = itr;
				// 	itr1.next = itr1.next.next;
				// }
				while(itr1 != null){
					System.out.println("IN LOOP : "+ itr1.value);
					if(itr1.next != null && itr1.next.value == itr.value){
						System.out.println("Value matched!!!");
						itr1.next = itr1.next.next;
					}
					else{
						itr1 = itr1.next;
					}
				}
				itr = itr.next;
			}
			return list;
		}
		return null;
	}

	public static void printList(List<Integer> list){
		for(Integer itr : list){
			System.out.println(itr);
		}
	}

	public static void main(String[] args){
		SampleSinglyLinkedList<Integer> list = new SampleSinglyLinkedList<Integer>(0);
		list.addToLast(0);
		list.addToLast(1);
		list.addToLast(2);
		list.addToLast(3);
		list.addToLast(3);
		list.addToLast(4);
		list.addToLast(5);
		list.addToLast(0);
		list.addToLast(4);
		list.addToLast(3);
		SampleSinglyLinkedList<Integer> outList = removeDuplicateWithoutBuf(list);
		outList.printList();
	}
}