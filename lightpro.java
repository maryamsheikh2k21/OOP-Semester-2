public class lightpro
{
	public static void main(String args[])
	{
	int lightspeed;
	long days;
	long distance;
	long seconds;
	lightspeed=186000; //the approximate speed of light in miles per second
	days=800; //here input can be taken from user but we use a fixed value temporarily
	seconds=days*24*60*60; //1000 days in seconds will be equal to 69120000
	distance=lightspeed*seconds; //formula to calculate the distance
	//now we would print the result
	System.out.println("In " + days + " days light will travel about " + distance + " miles.");
	}
}