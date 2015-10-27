import java.util.*;	

public class LinkedList {

	private ListElement head = null; 	//this is the creation of a head node for the list
	private ListElement end = null;		//this is a end node for the list for new nodes to be added
	
	public static void main(String[] args)
	{
		ListElement le = new ListElement();

	}

	public void addElement(ListElement le)
	{
		
		le.setData(5);
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
