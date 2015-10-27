
public class ListElement {

	
		private ListElement next;			//pointer for the next node
		private ListElement previous;		//pointer to the last node, to be used in the doubley linked list only 
		private int data;					//where the data in the node is stored
		
		public ListElement( )		//a list element object constructor
		{	
			this.data = 0;			//sets the data to zero
			this.next = null;		//sets the next pointer to null
			this.previous = null;	//sets the previous pointer to null as well, this will stay null the entire time in the single linked list
		}
	
		public void setData( int data ) 		//a setter for the list element object
		{
			this.data = data ;			//sets the value of the data element for the node
		}
	
		public int getData ( ) 			//a getter for the list element object 
		{
			return this.data ;			//returns the value of the data in the node
		}
	
		public void setNext(ListElement next) 		//a setter for the next element 
		{
			this.next = next;			//sets the value of the next element for the node
			return;
		}
		
		public ListElement getNext(ListElement next) 		//a getter for the next element
		{
			return this.next;			//gets the next element in the list
		}
		
		public ListElement getElement(ListElement element) 		//a getter for a list element
		{
			return element;			//gets the element and returns it
		}
		
}
