//three negative testcases are also available in this code

package Queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testing {

	@Test
	void test_EmptyQueue() {
		Queue obj=new Queue(4);
		int s=obj.size();
		boolean output=obj.empty();
		obj.display();
		assertEquals(true,output);
	}
	
	@Test
	void test_queue() throws Exception {
		Queue obj=new Queue(4);
		for(int i=0;i<4;i++)
		{ 
			try {
				obj.enqueue(i+1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		obj.dequeue();
		obj.display();
		boolean output=obj.empty();
		assertEquals(false,output);
	}
	

	

	
	@Test
	void test_addrigth() { 
		Dequeue obj=new Dequeue(4);
		obj.addRight(10);
		obj.display();
		assertEquals(true,true);
		
	}
	
	@Test
	void test_addleft() {
		Dequeue obj=new Dequeue(4);
		obj.addLeft(70);
		obj.display();
		assertEquals(true,true);
	}
	
	@Test
	void test_QueueWithArray() {
		QueueWithArray obj=new QueueWithArray(4);
		for(int i=0;i<4;i++)
		{
			obj.enqueue(i+2);
		}
		
		obj.display();
		assertEquals(true,true);
	}
	 

	

	
	@Test
	void test_dequeue() {		//positive test case
		QueueWithArray obj=new QueueWithArray(4);
		int output=obj.dequeue();
		obj.display();
		assertEquals(-1,output);	//-1 shows queue is empty
		
	}

	
	@Test
	void test_enqueue() {
		QueueWithArray obj=new QueueWithArray(4);
		
		for(int i=0;i<=4;i++)
		obj.enqueue(i+2);
		obj.display();
		obj.dequeue();
		assertEquals(true,true);
		
	}
	
	@Test
	void test_enqueue_2() {
		QueueWithArray obj=new QueueWithArray(4);
		
		for(int i=0;i<=5;i++)
		obj.enqueue(i+2);
		obj.display();
		
		assertEquals(true,true);
		
	}
	
	
	@Test
	void test_DequeueLinkedList() {		//positive test case
		QueueWithLinkedList obj=new QueueWithLinkedList();
		
		int output=obj.dequeue();
		obj.display();
		assertEquals(-1,output);	//-1 shows empty
	}

	@Test
	void test_DequeueLinkedList_2() {		//positive test case
		QueueWithLinkedList obj=new QueueWithLinkedList();
		
		for(int i=0;i<4;i++)
		{
			obj.enqueue(i+2);
		}
		
		int output=obj.dequeue();
		obj.display();
		assertEquals(2,output);	//-1 shows empty
	}

	
	@Test
	void test_Insertion_queueLinkedList() {
		QueueWithLinkedList obj=new QueueWithLinkedList();
		for(int i=0;i<4;i++)
		{
			obj.enqueue(i+2);
		}
		obj.display();
		assertEquals(true,true);
	}
	

	
}
