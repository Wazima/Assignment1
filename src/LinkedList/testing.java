package LinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testing {

	@Test
	void test_front() {
		CircularLinkedList obj=new CircularLinkedList();
		obj.pushFront(10);
		obj.pushFront(12);
		obj.pushFront(15);
		
		obj.display();
		
		CircularLinkedList.Node n1;
		n1=obj.gethead();
		
		assertEquals(15,n1.key);

	}
	
	@Test
	void test_popfront() {
		CircularLinkedList obj=new CircularLinkedList();
		obj.pushFront(10);
		obj.pushFront(12);
		obj.pushFront(15);
		
		obj.popFront();
		obj.display();
		
		CircularLinkedList.Node n1;
		n1=obj.gethead();
		
		assertEquals(12,n1.key);

	}
	
	@Test
	void test_back() {
		CircularLinkedList obj=new CircularLinkedList();
		obj.pushBack(50);
		obj.pushBack(40);
		obj.pushBack(10);
		
		obj.display();
		
		CircularLinkedList.Node n1;
		n1=obj.gethead();
		
		assertEquals(50,n1.key);
		

		
	}
	
	@Test
	void test_popback() {
		CircularLinkedList obj=new CircularLinkedList();
		obj.pushBack(50);
		obj.pushBack(40);
		obj.pushBack(10);
		
		obj.popBack();
		obj.display();
		
		CircularLinkedList.Node n1;
		n1=obj.gethead();
		
		assertEquals(50,n1.key);
		
	}
	
	@Test 
	void test_valueAvailable() {
		CircularLinkedList obj=new CircularLinkedList();
		obj.pushFront(10);
		obj.pushFront(12);
		obj.pushFront(15);
		obj.pushFront(100);
		obj.pushFront(120);
		obj.pushFront(150);
		obj.pushBack(200);  
		
		obj.display();
		
		//checking if the value is present at the place
		CircularLinkedList.Node n1;
		n1=obj.gethead();
		for(int i=0;i<4;i++)
		{
			n1=n1.next;
		}
		assertEquals(12,n1.key);
		

	}
	
	@Test
	void test_LinkedList_pushFront() {
		Linked_List obj=new Linked_List();
		obj.pushFront(10);
		obj.pushFront(40);
		obj.pushFront(55);
		obj.pushFront(84);
		
		obj.display();
		
		Linked_List.Node n2;
		n2=obj.gethead();
		
		assertEquals(84,n2.key);

	}
	
	@Test
	void test_LinkedList_pushBack() {
		Linked_List obj=new Linked_List();
		obj.pushBack(55);
		obj.pushBack(78);
		obj.pushBack(66);
		obj.pushBack(42);
		
		obj.display();
		
		Linked_List.Node n2;
		n2=obj.gethead();
		
		assertEquals(55,n2.key);

	}

	@Test
	void test_LinkedList_swaping_back() {
		Linked_List obj=new Linked_List();
		
		obj.pushBack(55);
		obj.pushBack(78);
		obj.pushBack(66);
		obj.pushBack(42);
		obj.swap();
		
		obj.display();
		
		Linked_List.Node n2;
		n2=obj.gethead();
		
		assertEquals(42,n2.key);

	}
	
	@Test
	void test_LinkedList_swaping_front() {
		Linked_List obj=new Linked_List();
		
		obj.pushFront(55);
		obj.pushFront(78);
		obj.pushFront(66);
		obj.pushFront(42);
		obj.swap();
		
		obj.display();
		
		Linked_List.Node n2;
		n2=obj.gethead();
		
		assertEquals(55,n2.key);

	}
	
	@Test
	void test_LinkedList_2_add() throws Exception {
		LinkedList_2 obj=new LinkedList_2();
		
		obj.pushFront(10);
		obj.pushFront(45);
		obj.pushFront(90);
		obj.pushFront(50);
		obj.add(20);
		
		obj.display();
		
		int output=obj.topBack();
		assertEquals(20,output);
	}
	
	@Test
	void test_LinkedList2_topfront() throws Exception {
		LinkedList_2 obj=new LinkedList_2();
		
		obj.pushBack(20);
		obj.pushBack(84);
		obj.pushBack(45);
		obj.pushBack(96);
		obj.add(6);
		obj.display();
		
		int output=obj.topFront();
		assertEquals(50,output);
		
	}
	
	@Test
	void test_LinkedList2_popfront() throws Exception {
		LinkedList_2 obj=new LinkedList_2();
		
		
		obj.pushBack(84);
		obj.pushBack(45);
		obj.pushBack(96);
		obj.add(6);
		
		obj.popFront();
		obj.display();
		
		int output=obj.topFront();
		assertEquals(90,output);
		
	}
	
	@Test
	void test_LinkedList_pushfront() {
		LinkedList obj=new LinkedList();
		
		obj.pushFront(12);
		obj.pushFront(78);
		obj.pushFront(65);
		obj.pushFront(85);
		
		LinkedList.Node n3;
		n3=obj.gethead();
		
		assertEquals(85,n3.key);
		
	}
	
	
	@Test
	void test_LinkedList_pushback() {
		LinkedList obj=new LinkedList();
		
		obj.pushBack(14);
		obj.pushBack(84);
		obj.pushBack(98);
		obj.pushBack(55);
		
		LinkedList.Node n3;
		n3=obj.gethead();
		
		assertEquals(14,n3.key);
		
	}
	
	@Test
	void test_LinkedList_add() {
		LinkedList obj=new LinkedList();
		
		obj.pushBack(14);
		obj.pushBack(84);
		obj.pushBack(98);
		obj.pushBack(55);
		obj.swap();
		
		obj.display();
		
		LinkedList.Node n3;
		n3=obj.gethead();
		
		assertEquals(55,n3.key);
		
	}
	
	
}
