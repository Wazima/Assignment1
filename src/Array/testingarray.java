package Array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testingarray {
	



		@Test
		void test_LinearSearch() {
			 
			Array obj=new Array();
			
			int insertArray[]= {20,30,40,10,50};
			obj.getValues();
			for(int i=0;i<5;i++) {
				obj.insert(insertArray[i], i);
			}
			//obj.getValues(); 
			boolean val; 
			val=obj.linearSearch(10);	//check 10 is available in the array using linear search
			obj.display();
			obj.delete(0);
			
			assertEquals(true,val);
		}

		@Test
		void test_BinarySearch() {
			
			Array obj=new Array();
			int insertArray[]= {20,30,40,10,50};
			for(int i=0;i<4;i++) {
				obj.insert(insertArray[i], i);
			}
			//obj.getValues();
			boolean val;
			val=obj.binarySearch(40,0,4);	//check 40 is available in the array using binary search
			assertEquals(true,val);
		}
		
		@Test
		void test_BubbleSort() {
			
			Array obj=new Array();
			int insertArray[]= {20,30,40,10,50};
			for(int i=0;i<4;i++) {
				obj.insert(insertArray[i], i);
			}
			//obj.getValues();
			boolean val;
			obj.bubbleSort();
			val=obj.binarySearch(40,0,4);	//check 40 is available in the array using binary search
			assertEquals(true,val);
		}
		
		@Test
		void test_ArrayInsertion() {
			ArrayInsertion obj=new ArrayInsertion();
			int [] insertArray= new int [10];
			for(int i=0,j=0;i<4;i++,j+=2) {
				obj.insert(insertArray,j,i);
			}
			
			assertEquals(true,true);
		}
		
		@Test
		void test_deletion() {
			ArrayDeletion obj=new ArrayDeletion();
			int arr[]= {1,2,3};
			obj.display(arr);
			assertEquals(true,true);
			
			
		}
		 

		
	}

