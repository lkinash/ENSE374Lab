import java.util.*;	

public class LinkedList {

	private ListElement head;  	//this is the creation of a head node for the list
	private ListElement end;		//this is a end node for the list for new nodes to be added
	private int listCount;
	
	
	public LinkedList()				//linked list constructor 
	{
		head = null;		//sets the head to be a null node 
		end = null;				//sets the last element in the list to be null as well
		listCount = 0;			//sets the list counter to be null too 
	}
	
	public static void main(String[] args)			//the main of the program
	{
		ListElement le = new ListElement();

	}

	public void addElement(ListElement le)			//adds an element to the list
	{
		if(head == null)				//checks if there is a head node in the list
		{
			head = le;
		}
		else							//if there is a head node in the list then add the new one to the end
		{
			end = le;
		}
		return;
	}
	
	public ListElement getElement(int index)
	{
		
		return;
	}

	public ListElement deleteElement(int index)
	{
		
		return;
	}
	
	public void printLinkedListTail()			//this method prints the data value in the last element in the list
	{
		System.out.println("The tail of the list contains the value: " + end.getData());		//prints out the data value at the end of the list
		return;
	}
	
	public void printLinkedListHead()				//this method prints the data value in the first element in the list
	{
		System.out.println("The head of the list contains the value: " + head.getData());		//prints out the data value at the head of the list
		return;
	}
}
