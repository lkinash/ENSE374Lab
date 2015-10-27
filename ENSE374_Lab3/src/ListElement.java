
public class ListElement {

	
		private ListElement next;			//pointer for the next node
		private ListElement previous;		//pointer for the previous node
		private int data;					//where the data in the node is stored
		
		public ListElement( )		//a list element object constructor for nulls
		{	
			this.data = 0;			//sets the data to zero
			this.next = null;		//sets the next pointer to null
			this.previous = null;	//sets the previous pointer to null as well, this will stay null the entire time in the single linked list
		}
	
		public ListElement(int data, ListElement next, ListElement previous)		//a list element object constructor for setting things
		{	
			this.data = data;			//sets the data to the value put in
			this.next = next;		//sets the next pointer to the value put in
			this.previous = previous;	//sets the previous pointer to the previous node
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
		
		public ListElement getPrevious(ListElement previous) 		//a getter for the previous element
		{
			return this.previous;			//gets the previous element in the list
		}
		
		public void setPrevious(ListElement previous) 		//a setter for the previous element 
		{
			this.previous = previous;			//sets the value of the previous element for the node
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
