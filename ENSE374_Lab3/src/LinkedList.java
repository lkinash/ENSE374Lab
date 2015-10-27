import java.util.*;	

public class LinkedList {

	private ListElement head;  	//this is the creation of a head node for the list
	private ListElement end;		//this is a end node for the list for new nodes to be added
	private ListElement temp;		//a temperay element to be used as a marker when moving through the list	
	private int listCount;
	
	
	public LinkedList()				//linked list constructor 
	{
		head = null;		//sets the head to be a null node 
		end = null;				//sets the last element in the list to be null as well
		temp = null;			//initializes the temp
		listCount = 0;			//sets the list counter to be null too 
	}
	
	public static void main(String[] args)			//the main of the program
	{
		LinkedList linked = new LinkedList();			//creates a linked list object
		
		ListElement le = new ListElement();				//creates a new list element object
		
		le.setData(34);									//sets the data value in the list element created
		linked.addElement(le);						//adds the element to the liked list

		linked.printLinkedListHead();				//prints out the list from head to end for the nodes in it so far
		
		le.setData(85);									//sets the data value in the list element created
		linked.addElement(le);						//adds the element to the liked list

		linked.printLinkedListHead();				//prints out the list from head to end for the nodes in it so far
		
		le.setData(23);									//sets the data value in the list element created
		linked.addElement(le);						//adds the element to the liked list

		linked.printLinkedListHead();				//prints out the list from head to end for the nodes in it so far
		
		le.setData(94);									//sets the data value in the list element created
		linked.addElement(le);						//adds the element to the liked list

		linked.printLinkedListHead();				//prints out the list from head to end for the nodes in it so far
		
		le.setData(12);									//sets the data value in the list element created
		linked.addElement(le);						//adds the element to the liked list

		linked.printLinkedListHead();				//prints out the list from head to end for the nodes in it so far
			
		System.out.println(linked.getElement(0).getData());		//gets the value of an element and prints it out
	
		System.out.println(linked.deleteElement(3).getData());		//deletes an element in the list and prints the value fo the element deleted
		
		linked.printLinkedListHead();				//prints out the list from head to end for the nodes left after the delete
			
		System.out.println(linked.deleteElement(0).getData());  //deletes an element in the list and prints the value fo the element deleted
		
		linked.printLinkedListHead();				//prints out the list from head to end for the nodes left after the delete
		
		//this portion of the main shows how a typical user might use the program to add and delete and look at elements in the linked list
		
	}

	public void addElement(ListElement le)			//adds an element to the list
	{
		
		if(head == null)				//checks if there is a head node in the list
		{
			head = new ListElement();				//adds that element to be the head of the list
			head.setData(le.getData());
			end = head;				//since there is only one node, it is the head and thus that is the end too 
		}
		else							//if there is a head node in the list then add the new one to the end
		{
			end.setNext( new ListElement(le.getData(), null, null));		//sets a new node le as the next in the list
			end = end.getNext(end);						//makes the new node the end of the list 
		}
		listCount++;  			//increments the list count
		return;
	}
	
	public ListElement getElement(int index)		//returns an element in its entirety 
	{
		if (index >  listCount)				//if the index that element is at is less than the number of elements in the list it is not valid 
			return null;				//thus the function will return a null value
		
		temp = head;					//otherwise it will start iterating through the list, first by setting the temp at the head
		
		for(int i = 0; i < index; i++)		//then iterating through until it gets to the index, this is done using a for loop
		{
			temp = temp.getNext(temp);		//the temp is then set to the next node in the list
		}
		return temp;						//then the temp is returned to the caller, this function assumes that index indicates which node to find, if index is 5 it gets the fifth node
	}

	public ListElement deleteElement(int index)
	{
		if(head == null)				//checks if there is a head node in the list
			return null;				//returns null if there is not any elements in the list
		
		if (index >  listCount)				//if the index that element is at is less than the number of elements in the list it is not valid 
			return null;				//thus the function will return a null value
		
		listCount--;  				//deincrements the list count
		temp = head;					//otherwise it will start iterating through the list, first by setting the temp at the head
		
		if(index == 0)					//if the index is pointing at the head of the list
		{
			head = head.getNext(head);			//sets the head to be the next node 
			return head;						//then returns the new head value
		}
		
		ListElement cur = new ListElement();		//creates a new node to use as a temperary current value
		
		for(int i = 0; i < index; i++)		//then iterating through until it gets to the index, this is done using a for loop
		{
			cur = temp;					//the cur is then set to the temp in the list
			temp = temp.getNext(temp);		//the temp is then set to the next node in the list
		}
		
		cur.setNext(temp.getNext(temp));	//gets rid of the node in between and sets the pointers around it
		
		return cur;						//then the temp is returned to the caller, this function assumes that index indicates which node to find, if index is 5 it gets the fifth node
	}
	
	public void printLinkedListTail()			//this method prints the data value in the last element in the list
	{
		System.out.println("The tail of the list contains the value: " + end.getData());		//prints out the data value at the end of the list
		return;
	}
	
	public void printLinkedListHead()				//this method prints the data value in the first element in the list
	{
		System.out.print("The head of the list first, the list contains the values: " + head.getData());		//prints out the data value at the head of the list
		
		temp = head;
		
		for(int i = 0; i < listCount-1 ; i++)		//then iterating through until it gets to the index, this is done using a for loop
		{
			temp = temp.getNext(temp);		//the temp is then set to the next node in the list
			System.out.print(" , " + temp.getData());			//prints out commas between numbers in the list
		}
		
		System.out.println(".");				//prints out and end to the line
		return;
	}
}
