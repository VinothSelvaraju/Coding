class Tester{
	public static void main(String[] args){
		// SampleSinglyLinkedList<Integer> list = new SampleSinglyLinkedList<Integer>(1);
		// list.printList();
		// list.addToFirst(0);
		// list.addToLast(2);
		// list.addToLast(3);
		// list.addToLast(4);
		// list.addToLast(5);
		// list.printList();
		// list.deleteNode(4);
		// list.printList();
		// list.deleteNode(0);
		// list.printList();
		// list.deleteNode(5);
		// list.printList();
		SampleBinaryTree<Integer> tree = new SampleBinaryTree<Integer>(5);
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(6);
		tree.insert(7);
		tree.insert(8);
		tree.inOrderTraversal();
		tree.preOrderTraversal();
		tree.postOrderTraversal();
	}
}