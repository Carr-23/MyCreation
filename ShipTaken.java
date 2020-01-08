// The "ShipTaken" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class ShipTaken extends Thread
{
    private Console c;  // The output console

    public void displayShipTaken ()
    {
	for (int distance = 0 ; distance <= 205 ; distance++)
	{
	    c.setColor (new Color (0, 0, 102));
	    c.fillRect (460, -100 + distance, 100, 100);

	    c.setColor (new Color (255, 204, 51));
	    int xCoord[] = {500, 545, 530, 545, 500};
	    int yCoord[] = { - 50 + distance, -40 + distance, -30 + distance, -20 + distance, -10 + distance};
	    c.fillPolygon (xCoord, yCoord, 5);

	    c.setColor (new Color (5, 64, 78));
	    c.fillRoundRect (495, -55 + distance, 15, 50, 10, 10);

	    c.setColor (new Color (83, 77, 102));
	    int xCoord1[] = {465, 465, 490};
	    int yCoord1[] = { - 33 + distance, -50 + distance, -50 + distance};
	    c.fillPolygon (xCoord1, yCoord1, 3);

	    int xCoord2[] = {465, 465, 490};
	    int yCoord2[] = { - 27 + distance, -10 + distance, -10 + distance};
	    c.fillPolygon (xCoord2, yCoord2, 3);


	    c.setColor (new Color (255, 204, 51));
	    int xCoord3[] = {460, 500, 500};
	    int yCoord3[] = { - 30 + distance, -60 + distance, 0 + distance};
	    c.fillPolygon (xCoord3, yCoord3, 3);

	    c.setColor (new Color (153, 255, 255));
	    c.fillOval (480, -37 + distance, 15, 15);

	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
	try
	{
	    Thread.sleep (15000);
	}
	catch (Exception e)
	{
	}
    }


    public void displayShipTaken2 ()
    {
	int location = 205;
	for (int distance = 0 ; distance >= -205 ; distance--)
	{
	    c.setColor (new Color (0, 0, 102));
	    c.fillRect (460, -50 + distance + location, 100, 75);

	    c.setColor (new Color (255, 204, 51));
	    int xCoord[] = {500, 545, 530, 545, 500};
	    int yCoord[] = { - 50 + distance + location, -40 + distance + location, -30 + distance + location, -20 + distance + location, -10 + distance + location};
	    c.fillPolygon (xCoord, yCoord, 5);

	    c.setColor (new Color (5, 64, 78));
	    c.fillRoundRect (495, -55 + distance + location, 15, 50, 10, 10);

	    c.setColor (new Color (83, 77, 102));
	    int xCoord1[] = {465, 465, 490};
	    int yCoord1[] = { - 33 + distance + location, -50 + distance + location, -50 + distance + location};
	    c.fillPolygon (xCoord1, yCoord1, 3);

	    int xCoord2[] = {465, 465, 490};
	    int yCoord2[] = { - 27 + distance + location, -10 + distance + location, -10 + distance + location};
	    c.fillPolygon (xCoord2, yCoord2, 3);


	    c.setColor (new Color (255, 204, 51));
	    int xCoord3[] = {460, 500, 500};
	    int yCoord3[] = { - 30 + distance + location, -60 + distance + location, 0 + distance + location};
	    c.fillPolygon (xCoord3, yCoord3, 3);

	    c.setColor (new Color (153, 255, 255));
	    c.fillOval (480, -37 + distance + location, 15, 15);

	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public ShipTaken (Console con)
    {
	c = con;
    }


    public void run ()
    {
	displayShipTaken ();
	displayShipTaken2 ();
    }
} // ShipTaken class
