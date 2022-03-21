package Work;

public class LinkedList 
{
	Node head; 
	class Node 
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	void printNthFromEnd(int n)
	{
	    Node ptr1 = head;
        Node ptr2 = head;
 
        int count = 0;
        if (head != null)
        {
            while (count < n)
            {
                if (ptr2 == null)
                {
                   System.out.println("-1");
                   System.out.println(n+ "th node from the last doesnt exist");
                    return;
                }
                ptr2 = ptr2.next;
                count++;
            }
 
            if(ptr2 == null)
            {
              head = head.next;
              if(head != null)
                System.out.println(n +"th node from the last is "+head.data);
            }
            else
            {
                   
              while (ptr2 != null)
              {
                  ptr1 = ptr1.next;
                  ptr2 = ptr2.next;
              }
              System.out.println(n +"th node from the last is "+ptr1.data);
            }
        }
	
	}
	public void add(int newData)
	{
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
        ll.add(4);
        ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.printNthFromEnd(5);
	
	}
}
