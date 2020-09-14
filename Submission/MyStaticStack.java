
/**
* ADT MyStack: Private Part<br>. 
* The class implements all the operations available in MyStack<br>
*/
public class MyStaticStack implements MyStack {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private int items[]; 
	private int numItems;
	private int maxItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	//public myStack myCreateEmpty(){}

	public MyStaticStack(int m){
		this.maxItems = m;
		this.items = new int[m];
		this.numItems = -1;
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
		//Scenario 1: The stack is empty. The res attribute keeps the true value.
		//Scenario 2: The stack is not empty. The res attribute is given the value false.
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		if(numItems != -1) {
			res = false;
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get and remove first element from top of MyStack: pop
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
		//Scenario 1: The stack is empty. There are no elements to pop from an empty stack.
		//Scenario 2: The stack isn't empty. 
		//			  The element at the top of the stack gets removed and the pointer is moved to the next element.
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		boolean empty = isEmpty();
		if(empty == false) {
			res = items[numItems];
			numItems--;
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
		//Scenario 1: The stack is full. No more elements can be pushed into the stack.
		//Scenario 2: The stack isn't full. The element is added to the stack.

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		if((numItems+1) != maxItems) {
			numItems++;
			items[numItems] = element;
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
		//Scenario 1: The stack is empty. There are no elements to print from an empty stack.
		//Scenario 2: The stack isn't empty. The for loop goes through and prints every element from the stack.

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		for(int i = 0;i <= numItems; i++) {
			System.out.println(items[i]);
		}
	}
	
}
