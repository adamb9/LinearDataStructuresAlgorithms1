
/**
* ADT MyStack: Private Part<br>. 
* The class implements all the operations available in MyStack<br>
*/
public class MyDynamicStack implements MyStack {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
		private MyNode head;
		
	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	//public myStack myCreateEmpty(){}
	
	public MyDynamicStack(){
		this.head = null;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: isEmpty
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
		//1. Scenario 1: The stack is empty. The res value remains true.
		//2. Scenario 2: The stack isn't empty. The res attribute is assigned the value of false.

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		if(head != null) {
			res = false;
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from the top of MyStack and removes it: pop
	//-------------------------------------------------------------------

	public int pop(){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = -1;
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		//1. Scenario 1: The stack is empty and you can't pop anything.
		//2. Scenario 2: The stack isn't empty. The value stored in the current head is assigned to the res attribute using the getInfo() method. 
		//               The position of the head is moved to the next element in the stack.

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		boolean empty = isEmpty();
		if(empty == false) {
			res = head.getInfo();
			head = head.getNext();
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyStack: push 
	//-------------------------------------------------------------------
	
	public void push(int element){
		//-----------------------------
		//SET OF OPS
		//-----------------------------
	
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		//1. Scenario 1: The stack is empty. A new node object is created and the position of the head is set to the new node. 
		//               This is the only object in the stack and the head doesn't need to be moved from another position.
		//2. Scenario 2: The stack isn't empty. A new node object is created and the position of the head is moved from the old head to the position of the new node. 
		//               This is done using the setNext() method.

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------

		boolean empty = isEmpty();
		
		MyNode node = new MyNode(element, null);
		if(empty == true) {
			head = node;
			
		}
		else {
			node.setNext(head);
			head = node;
			}
	}
	
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyStack: print
	//-------------------------------------------------------------------
	
	public void print(){

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		//1. Scenario 1: The stack is empty. Nothing gets printed
		//2. Scenario 2: The stack isn't empty. The loop prints each element of the stack individually until they have all been printed.
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		MyNode newHead = head;
		while(newHead != null){
			System.out.println(newHead.getInfo());
			newHead = newHead.getNext();
		}

	}
	
	
}
