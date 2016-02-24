public class LinkedTree<E>{
	
	//------------nestdd Node class ------------
	protected static class Node<E>{
		private E element;
		private Node<E> parent;
		private Node<E> left;
		private Node<E> right;
		
		/** conturct a node with the given element and neighbors */
		public Node(E e, Node<E> parent_node, Node<E> left_child, Node<E> right_child){
			this.parent = parent_node;
			this.left = left_child;
			this.right = right_child;
			this.element = e;
		}

		//accessor methods:
		public <E> getElement {return this.element;}
		public Node<E> getRight {return this.right;}
		public Node<E> getLeft {return this.left;}
		public Node<E> getParent {return this.parent;}

		//update methods:
		public void setElement(E, e){ this.element = e;}
		public void setParent(Node<E> parent_node) {this.parent = parent_node;}
		public void setLeft(Node<E> left_child) {this.left = left_child;}
		public void setLeft(Node<E> right_child) {this.right = right_child;}
	} //---------- end of nested node class


	/** Factory method to create a new node storing element */
	protected Node<E> createNode(E e, Node<E> parent_node, Node<E> left_child, Node<E> right_child){
		return new Node<E>(e, parent_node, left_child, right_child);
	}

	//BinaryTree instance variables

	protected Node<E> root = null;
	private size = 0;

	//Binary contructer:
	public LinkedTree(){}  //construct an empty binary tree.

	//update methods:
	/** place element e at the root of an empty tree and returns its new Position*/
	public Position<E> addRoot()



}