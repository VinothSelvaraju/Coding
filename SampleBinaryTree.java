/*
simple tree implementation - insert/delete/traverse tree nodes
*/
class SampleBinaryTree<T>{
	private Node<T> root;

	public SampleBinaryTree(T data){
		root = new Node<T>(data);
	}
	public void insert(T data){
		//where to add children?
		insert(root,data);
	}
	public Node<T> insert(Node<T> node, T data){
		//where to add children?
		if(null == node){
			System.out.println("Creating new node : " + data);
			return new Node<T>(data);
		}
		else{
			System.out.println("Else condition : node value : " + node.getData());
			if(node.getData() instanceof Integer){
				int rootData = (Integer) node.getData();
				int dataValue = (Integer) data;
				if(dataValue <= rootData){
					System.out.println("Input value is less than or equal");
					node.left = insert(node.getLeft(),data);
					System.out.println("Node.left.data (after): " + node.left.getData());
				}
				else{
					System.out.println("Input value is greater than");
					node.right = insert(node.getRight(),data);
					System.out.println("Node.right.data (after): " + node.right.getData());
				}
			}
		}
		return node;
	}
	public void delete(T data){
		//where to add children?
	}
	public void printTree(){

	}
	public void inOrderTraversal(){
		System.out.println("IN-ORDER TRAVERSAL");
		inOrderTraversal(root);
	}
	public void preOrderTraversal(){
		System.out.println("PRE-ORDER TRAVERSAL");
		preOrderTraversal(root);
	}
	public void postOrderTraversal(){
		System.out.println("POST-ORDER TRAVERSAL");
		postOrderTraversal(root);
	}
	public void inOrderTraversal(Node<T> root){
		if(root !=null){
			inOrderTraversal(root.getLeft());
			System.out.println(root.getData());
			inOrderTraversal(root.getRight());
		}
	}
	public void preOrderTraversal(Node<T> root){
		if(root !=null){
			System.out.println(root.getData());
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}
	public void postOrderTraversal(Node<T> root){
		if(root !=null){
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.println(root.getData());
		}
	}
	class Node<T>{
		private T data;
		private Node<T> left;
		private Node<T> right;
		
		public Node(T data){
			this.data = data;
			left = null;
			right = null;
		}
		public T getData(){
			return data;
		}
		public Node<T> getLeft(){
			return left;
		}
		public Node<T> getRight(){
			return right;
		}
		public void printNode(){
			System.out.println("data : " + data);
		}
	}
}