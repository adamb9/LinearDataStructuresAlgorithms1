
/**
* ADT MyStack: Private Part<br>. 
* The class implements all the operations available in MyStack<br>
*/
public class MyDoubleDynamicStack<T> implements MyStack<T> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyDoubleLinkedNode<T> head;
	private MyDoubleLinkedNode<T> tail;
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	//public myStack myCreateEmpty(){}
	
	public MyDoubleDynamicStack(){

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: isEmpty
	//-------------------------------------------------------------------	

	public boolean isEmpty(){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		boolean res = true; 
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		//Scenario 1: The stack is empty and this function assigns false to the res attribute
		//Scenario 2: The stack is not empty and this function assigns true to the res attribute
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		if(head != null && tail != null) {
			res = false;
		}
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStack: first
	//-------------------------------------------------------------------

	public T first(){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		T res = null;
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		//Scenario 1: The stack is empty and no info can be gotten. The res attribute remains null
		//Scenario 2: The stack isn't empty. The info from the head (the first object in the stack) is gotten and assigned to the res attribute

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		boolean empty = isEmpty();
		if( empty == false) {
			res = head.getInfo();
		}
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyStack: addByFirst 
	//-------------------------------------------------------------------

	public void addByFirst(T element){
		//-----------------------------
		//SET OF OPS
		//-----------------------------
	
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		//Scenario 1: The stack is empty. This new object gets added to the stack and is now the head.
		//It is the first and only object in the stack, therefore it is both the head and the tail.
		//Scenario 2: The stack not empty. This new object gets added to the stack and is now the head. It is linked to the old head.
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		boolean empty = isEmpty();
		if( empty == true) {
			MyDoubleLinkedNode<T> newNode  = new MyDoubleLinkedNode<T> (null, element, null);
			head = newNode;
			tail = newNode;
		}
		else {
			MyDoubleLinkedNode<T> newNode  = new MyDoubleLinkedNode<T> (null , element, head);
			head.setLeft(newNode);
			head = newNode;
		}
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst 
	//-------------------------------------------------------------------	

	public void removeByFirst(){
		//-----------------------------
		//SET OF OPS
		//-----------------------------
	
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		//Scenario 1: The stack is empty. There is nothing you can remove from an empty stack. An message is printed, informing the user of this.
		//Scenario 2: There is 1 element in the stack. It is both the head and the tail. Both the head and the tail are set to null.
		//Scenario 3: There is more than 1 element in the stack. The element to the right of the original head is set as the new head. The original head is removed.

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		boolean empty = isEmpty();
		if(empty == true) {
			System.out.println("You cannot remove anything because the stack is empty");
		}
		else {
			if(head == tail) {
				head = tail = null;
			}
			else {
				head = head.getRight();
				head.setLeft(null);
			}
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStack: last
	//-------------------------------------------------------------------

	public T last(){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		T res = null;
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		//Scenario 1: The stack is empty and no info can be gotten. The res attribute remains null
		//Scenario 2: The stack isn't empty. The info from the tail (the last object in the stack) is gotten and assigned to the res attribute

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		boolean empty = isEmpty();
		if( empty == false) {
			res = tail.getInfo();
		}
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		
		return res;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyStack: addByLast 
	//-------------------------------------------------------------------

	public void addByLast(T element){
		//-----------------------------
		//SET OF OPS
		//-----------------------------
	
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		//Scenario 1: The stack is empty. This new object gets added to the stack and is now the tail.
		//It is the first and only object in the stack, therefore it is both the head and the tail.
		//Scenario 2: The stack not empty. This new object gets added to the stack and is now the tail. It is linked to the old tail.
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		boolean empty = isEmpty();
		if( empty == true) {
			MyDoubleLinkedNode<T> newNode  = new MyDoubleLinkedNode<T> (null, element, null);
			tail = newNode;
			head = newNode;
		}
		else {
			MyDoubleLinkedNode<T> newNode  = new MyDoubleLinkedNode<T> (tail, element, null);
			tail.setRight(newNode);
			tail = newNode;
		}

	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst 
	//-------------------------------------------------------------------	

	public void removeByLast(){
		//-----------------------------
		//SET OF OPS
		//-----------------------------
	
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		//Scenario 1: The stack is empty. There is nothing you can remove from an empty stack. An message is printed, informing the user of this.
		//Scenario 2: There is 1 element in the stack. It is both the head and the tail. Both the head and the tail are set to null.
		//Scenario 3: There is more than 1 element in the stack. The element to the left of the original tail is set as the new tail. The original tail is removed.

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		boolean empty = isEmpty();
		if(empty == true) {
			System.out.println("You cannot remove anything because the stack is empty");
		}
		else {
			if(head == tail) {
				head = tail = null;
			}
			else {
				tail = tail.getLeft();
				tail.setRight(null);
			}
		}

	}
	
}

