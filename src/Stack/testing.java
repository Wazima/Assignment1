package Stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testing {

	@Test
	void test_push() throws Exception {
		MyStack obj=new MyStack(4);
		
		
		obj.push(15);
		obj.push(25);
		obj.push(85);
		obj.push(95);
		
		int output=obj.top();
		assertEquals(95,output);
		}
	
	@Test
	void test_pop() throws Exception {
		MyStack obj=new MyStack(4);
		
		obj.push(15);
		obj.push(25);
		obj.push(85);
		obj.push(95);
		
		obj.pop();		
		
		obj.displayStack();
		int output=obj.top();
		assertEquals(85,output);
		
	}
	
	@Test
	void test_stack_push() {
		Stack obj=new Stack(); 
		
		obj.push(45);
		obj.push(85);
		obj.push(89);
		obj.push(14);
		obj.push(12);
		
		obj.display();
		
		int output=obj.pop();
		
		assertEquals(12,output);
	}
	
	@Test
	void test_stackWithLinkedList_push() {
		StackWithLinkedList obj=new StackWithLinkedList();
		
		obj.push(15);
		obj.push(45);
		obj.push(78);
		obj.push(85);
		
		obj.display();
		
		StackWithLinkedList.Node n4;
		n4=obj.gethead();
		
		assertEquals(85,n4.key);
	}
	
	@Test
	void test_stcakWithLinkedList_top() {
StackWithLinkedList obj=new StackWithLinkedList();
		
		obj.push(15);
		obj.push(45);
		obj.push(78);
		obj.push(85);
		obj.pop();
		
		obj.display();
		
		StackWithLinkedList.Node n4;
		n4=obj.gethead();
		
		int output=obj.top();		
		assertEquals(78,output);
	}
	

}
