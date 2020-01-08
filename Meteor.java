// The "Meteor" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Meteor extends Thread
{
    private Console c;  // The output console

    public void displayMeteor (int location)
    {
	for (int distance = 1 ; distance <= 600 ; distance++)
	{
	    c.setColor (new Color (0, 0, 102));
	    c.fillRect (200-location+distance, 20-location/2 + distance/2, 250-location+distance, 100-location/2 + distance/2);
	    
	    c.setColor (new Color (66, 0, 78));
	    c.fillArc (214-location+distance,33-location/2 + distance/2,200,50,45,135);
	    
	    c.setColor (new Color (75, 67, 78));
	    c.fillOval (336-location+distance,41-location/2+distance/2,60,60);
	    
	    c.setColor (new Color (0, 25, 0));
	    int xCoord[] = {375-location+distance,375-location+distance,355-location+distance,345-location+distance,345-location+distance,350-location+distance,370-location+distance,390-location+distance,385-location+distance,400-location+distance};
	    int yCoord[] = {60-location/2 + distance/2,55-location/2 + distance/2,55-location/2 + distance/2,65-location/2 + distance/2,80-location/2 + distance/2,80-location/2 + distance/2,80-location/2 + distance/2,75-location/2 + distance/2,70-location/2 + distance/2,65-location/2 + distance/2};
	    c.fillPolygon (xCoord, yCoord, 10);
	    
	    
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Meteor (Console con)
    {
	c = con;
    }





    public void run ()
    {
	displayMeteor (500);
    }
} // Meteor class


