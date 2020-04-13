public class ListNode<T>
{
	private T value;
	private ListNode next;
	private ListNode previous;

	public ListNode(T initValue)
	{
		value=initValue;
		next=null;
		previous=null;
	}
	public ListNode(T initValue, ListNode<T> nextValue)
	{
		value=initValue;
		next=nextValue;
		previous=null;
	}	
	public ListNode(T initValue, ListNode<T> nextValue, ListNode<T> prevValue)
	{
		value=initValue;
		next=nextValue;
		previous=prevValue;
	}
	public T getValue()
	{
		return value;
	}
	public ListNode getNext()
	{
		return next;
	}
	public ListNode getPrevious()
	{
		return previous;
	}
	public void setValue(T theNewValue)
	{
		value=theNewValue;
	}
	public void setNext(ListNode theNewNext)
	{
		next=theNewNext;
	}
	public boolean hasNext()
	{
		if(next!=null)
			return true;
		else
			return false;
	}
	public boolean hasPrevious()
	{
		if(previous!=null)
			return true;
		else
			return false;
	}
	public void setPrevious(ListNode theNewPrevious)
	{
		previous=theNewPrevious;
		//theNewPrevious.setNext(this);
	}
}
