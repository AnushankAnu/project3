package anu;

public class Sll {
	public Node head;
	public Node tail;
	public int size;
	private int searchvalue;
	
	
	//creation of sll
	
	public Node creationsll(int nodevalue)
	{
		head=new Node();
		Node node=new Node();
		node.value=nodevalue;
		node.next=null;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	
	
	//insertion of sll
	
	public void insertion(int location,int value)
	{
		Node node=new Node();
		node.value=value;
		if(head==null)
		{
			creationsll(value);
		}
		else if(location==0)
		{
			node.next=head;
			head=node;
		}
		else if(location>=size)
		{
			node.next=null;
			tail.next=node;
			tail=node;
		}
		else
		{
			Node tempNode=head;
			int index=0;
			while(index<location-1)
			{
				tempNode=tempNode.next;
				index++;
			}
			Node nextNode=tempNode.next;
			tempNode.next=node;
			node.next=nextNode;
		}
		size++;
	}
	
	// traversal of sll
	
	public void traversalofsll()
	{
		if(head==null)
		{
			System.out.println("List doesnot exist");
		}
		else
		{
			Node tempNode=head;
			for(int i=0;i<size;i++)
			{
				System.out.println(tempNode.value+" ");
				tempNode=tempNode.next;
			}
		}
	}
	
	//searching of sll
	
	public boolean searchingofsll(int searchvalue)
	{
		if(head!=null)
		{
			Node tempNode=head;
			for(int i=0;i<size;i++)
			{
				if(searchvalue == tempNode.value)
				{
					System.out.println("the value is present in the list of"+i);
					return true;
				}
				tempNode=tempNode.next;
			}
		}
		System.out.println("value is not present");
		return false;
	}
	
	//deletion of sll
	
	public void deletingsll()
	{
		head=null;
		tail=null;
		System.out.println("the list is deleted");
		
	}
	

}
