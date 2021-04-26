import java.util.*;
public class driver {

	public static void main(String[] args) 
	{

		BlueRayCollection brc = new BlueRayCollection();
		int userChoice = -1;
		Scanner s = new Scanner(System.in);
		
		while (userChoice != 0)
		{
			String title, director;
			int year;
			double cost;
			showMenu();
			
			userChoice = s.nextInt();
			s.nextLine();
			
			if (userChoice == 1)
			{
				System.out.println("Enter a title: ");
				title = s.nextLine();
				System.out.println("Enter a director: ");
				director = s.nextLine();
				
				System.out.println("Enter the year of release: ");
				year = s.nextInt();
				
				System.out.println("Enter the cost: ");
				cost = s.nextDouble();
				
				brc.add(title, director, year, cost);
			}
			else if(userChoice == 2)
			{
				brc.show_all();
			}
			else if (userChoice == 3)
			{
				System.out.println("Enter a title to search for: ");
				
				String searchTitle = s.nextLine();
				System.out.println(brc.search(searchTitle));
			}
			else if (userChoice == 4)
			{
				System.out.println("Enter a title to delete: ");
				String deleteTitle = s.nextLine();
				
				System.out.println(brc.remove(deleteTitle));
			}
			
		}
		
		s.close();
	}
	
	public static void showMenu()
	{
		System.out.println("0. Quit");
		System.out.println("1. Add BlueRay to collection");
		System.out.println("2. See collection");
		System.out.println("3. Search collection");
		System.out.println("4. Remove BlueRay from collection");
	}

}
