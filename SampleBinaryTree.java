/*
simple tree implementation - insert/delete/traverse tree nodes
*/
import java.lang.Math;
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
			// System.out.println("Creating new node : " + data);
			return new Node<T>(data);
		}
		else{
			// System.out.println("Else condition : node value : " + node.getData());
			if(node.getData() instanceof Integer){
				int rootData = (Integer) node.getData();
				int dataValue = (Integer) data;
				if(dataValue <= rootData){
					// System.out.println("Input value is less than or equal");
					node.left = insert(node.getLeft(),data);
					// System.out.println("Node.left.data (after): " + node.left.getData());
				}
				else{
					// System.out.println("Input value is greater than");
					node.right = insert(node.getRight(),data);
					// System.out.println("Node.right.data (after): " + node.right.getData());
				}
			}
		}
		return node;
	}
	public void delete(T data){
		//where to add children?
	}
	public Node<T> getRoot(){
		System.out.println("root: " + root.data);
		return root;
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
	//O(n*log(n))
	public boolean isBalanced(Node<T> node){
		if(node == null){
			return false;
		}
		return isBalanced(node,1);
	}
	//pass the root of the tree to find whether the tree is balanced or not
	public boolean isBalanced(Node<T> node, int count){
		if(node == null){
			return true;
		}
		int left = getHeight(node.left, count);
		int right = getHeight(node.right, count);
		if(Math.abs(left - right) > 1){
			return false;
		}
		return isBalanced(node.left,1) && isBalanced(node.right,1);

	}
	public int getHeight(Node<T> node, int count){
		
		int leftHeight = 1;
		int rightHeight = 1;
		if(node == null){
			return count;
		}
		leftHeight = leftHeight + getHeight(node.left, count);
		rightHeight = rightHeight + getHeight(node.right, count);

		//returning the max of left and right sub-tree's height
		return leftHeight > rightHeight ? leftHeight : rightHeight;
	}

	public void printTree(Node<T> root){
		if(root != null){
			System.out.println(root.data);
			System.out.println(root.left.data);
			System.out.println(root.right.data);
			root = root.left;
			System.out.println(root.data);
			if(root.left != null){
				System.out.println(root.left.data);
			}
			if(root.right != null){
				System.out.println(root.right.data);
			}
		
			// printTree(root.left);
			// printTree(root.right);
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