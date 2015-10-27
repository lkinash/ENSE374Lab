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
		LinkedList linked = new LinkedList();
		
		ListElement le = new ListElement();
		le.setData(34);
		linked.addElement(le);

		linked.printLinkedListHead();
		linked.printLinkedListTail();
		le.setData(54);
		linked.addElement(le);

		linked.printLinkedListHead();
		linked.printLinkedListTail();
		
		le.setData(67);
		linked.addElement(le);

		linked.printLinkedListHead();
		linked.printLinkedListTail();
		
		le.setData(97);
		linked.addElement(le);

		linked.printLinkedListHead();
		linked.printLinkedListTail();
		
		
		int a = linked.getElement(0).getData();
		System.out.println(a);
		
		
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
			end.setNext( new ListElement(le.getData(), null));
			end = end.getNext(end);
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
		return temp;						//then the temp is returned to the caller
	}

	public ListElement deleteElement(int index)
	{
		
		return temp;
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
			System.out.print(" , " + temp.getData());
		}
		
		System.out.println(".");
		return;
	}
}
