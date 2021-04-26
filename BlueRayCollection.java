
public class BlueRayCollection {

	private Node head;
	
	public BlueRayCollection()
	{
		head = null;
	}
	
	public void add(String title, String director, int year, double cost)
	{
		BlueRayDisk blu = new BlueRayDisk(title, director, year, cost);
		Node n = new Node();
		
		n.data = blu;
		
		if (head == null)
		{
			n.next = null;
			head = n;
			return;
		}
		
		Node current = head;
		
		while (current.next != null)
		{
			current = current.next;
		}
		
		current.next = n;
	}
	//End of add
	
	public void show_all()
	{
		Node current = head;
		
		while (current.next != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
		
		System.out.println(current.data);
	}
	//End of show_all
	
	public String search(String title)
	{
		if (head == null)
			return "Not Found";
		
		Node current = head;
		
		while(current.next != null)
		{
			if (current.data.title.equals(title))
				return current.data.toString();
			
			current = current.next;
		}
		
		if (current.data.title.equals(title))
			return current.data.toString();
		else
			return "Not Found";
	}
	//End of search
	
	public String remove(String title)
	{
		if (head == null)
			return "Not Found";
		
		Node current = head;
		Node previous = current;
		
		if (current.data.title.equals(title))
		{
			head = current.next;
			return title + " deleted";
		}
		
		while (!current.data.title.equals(title))
		{
			previous = current;
			current = current.next;
			if (current == null)
				return "Not Found";
			
		}
		previous.next = current.next;
		return title + " deleted";
	}
	//End of remove
}
