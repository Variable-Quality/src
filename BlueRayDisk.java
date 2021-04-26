
public class BlueRayDisk {

	public String title, director;
	public int release;
	public double cost;
	
	public BlueRayDisk(String t, String d, int year, double c)
	{
		title = t;
		director = d;
		release = year;
		cost = c;
	}
	
	@Override
	public String toString()
	{
		return "$" + Double.toString(cost) + " " + Integer.toString(release) + " " + title + ", " + director;
	}
	
}
