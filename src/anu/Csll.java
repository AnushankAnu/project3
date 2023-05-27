package anu;

public class Csll {
	public Node head;
	public Node tail;
	public int size;
	private int searchvalue;
	
	
	//creation of csll
	
	public Node creationcsll(int nodevalue)
	{
		head=new Node();
		Node node=new Node();
		node.value=nodevalue;
		node.next=node;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	
	
	//insertion of csll
	
	public void insertionofcsll(int location,int value)
	{
		Node node=new Node();
		node.value=value;
		if(head==null)
		{
			creationcsll(value);
		}
		else if(location==0)
		{
			node.next=head;
			head=node;
		}
		else if(location>=size)
		{
			tail.next=node;
			tail=node;
			tail.next=head;
		}
		else
		{
			Node tempNode=head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			tempNode.next=tempNode.next;
			tempNode.next=node;
		}
		size++;
	}
	
	// traversal of csll
	
	public void traversalofcsll()
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
	
	//searching of csll
	
	public boolean searchingofcsll(int searchvalue)
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
	
	//deletion of csll
	
	public void deletingcsll()
	{
		head=null;
		tail.next=null;
		tail=null;
		System.out.println("the list is deleted");
		
	}
	

}

