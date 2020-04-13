import java.util.*;
public class ListNodeTest
{
	public ListNodeTest()
	{
		ListNode a=new ListNode(new String("1"));
		ListNode b=new ListNode(new String("2"));
		ListNode c=new ListNode(new String("3"));
		//b.setPrevious(a);
		//b.setNext(c);
		a.setPrevious(b);
		a.setNext(c);
		c.setPrevious(b);
		output(a);

		System.out.println(c.hasNext());

		a.setNext(c);
		//outputNext(a);

		//run this with caution!
		//a.setNext(b);
		//b.setNext(c);
		//c.setNext(a);
		//output(a);

	}

	public void output(ListNode a)
	{
		ListNode musketeers=a;
		for(ListNode x=musketeers;x!=null;x=x.getNext()){
			if(x.getPrevious() != null)
				System.out.println(x.getPrevious().getValue());
			if(x.getValue() != null)
				System.out.println(x.getValue().toString());
		}
		System.out.println("===================================");
	}
	public static void main(String args[])
	{
		ListNodeTest app=new ListNodeTest();
	}

}