// The "ShipLoot" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class ShipLoot implements Runnable
{
    private Console c;  // The output console

    public void displayShipLoot (int location)
    {
	for (int distance = 0 ; distance <= 200 ; distance++)
	{
	    c.setColor (new Color (0, 0, 102));
	    c.fillRect ((450 + location) - distance, 340, 120, 110);

	    c.setColor (new Color (255, 204, 51));
	    int xCoord[] = {515 + location - distance, 540 + location - distance, 530 + location - distance, 540 + location - distance, 515 + location - distance};
	    int yCoord[] = {365, 375, 380, 385, 395};
	    c.fillPolygon (xCoord, yCoord, 5);


	    c.setColor (new Color (153, 255, 255));
	    c.fillArc (475 + location - distance, 345, 30, 50, 90, 180);
	    c.fillArc (475 + location - distance, 365, 30, 50, 90, 180);

	    c.setColor (new Color (23, 32, 102));
	    c.fillRect (505 + location - distance, 355, 8, 48);
	    c.fillRect (510 + location - distance, 363, 8, 33);

	    c.setColor (new Color (255, 204, 51));
	    int xCoord1[] = {458 + location - distance, 505 + location - distance, 505 + location - distance};
	    int yCoord1[] = {380, 345, 415};
	    c.fillPolygon (xCoord1, yCoord1, 3);

	    c.setColor (new Color (153, 255, 255));
	    c.fillOval (480 + location - distance, 373, 15, 15);


	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	 try
	{
	    Thread.sleep (6000);
	}
	catch (Exception e)
	{
	}
    }


    public void displayShipLoot2 ()
    {
	for (int distance = 0 ; distance <= 350 ; distance++)
	{
	    c.setColor (new Color (0, 0, 102));
	    c.fillRect ((450) - distance, 340- (distance/4), 120, 76);

	    c.setColor (new Color (255, 204, 51));
	    int xCoord[] = {515 - distance, 540 - distance, 530 - distance, 540 - distance, 515 - distance};
	    int yCoord[] = {365- (distance/4), 375- (distance/4), 380- (distance/4), 385- (distance/4), 395- (distance/4)};
	    c.fillPolygon (xCoord, yCoord, 5);


	    c.setColor (new Color (153, 255, 255));
	    c.fillArc (475 - distance, 345- (distance/4), 30, 50, 90, 180);
	    c.fillArc (475 - distance, 365- (distance/4), 30, 50, 90, 180);

	    c.setColor (new Color (23, 32, 102));
	    c.fillRect (505 - distance, 355- (distance/4), 8, 48);
	    c.fillRect (510 - distance, 363- (distance/4), 8, 33);

	    c.setColor (new Color (255, 204, 51));
	    int xCoord1[] = {458 - distance, 505 - distance, 505 - distance};
	    int yCoord1[] = {380- (distance/4), 345- (distance/4), 415- (distance/4)};
	    c.fillPolygon (xCoord1, yCoord1, 3);

	    c.setColor (new Color (153, 255, 255));
	    c.fillOval (480 - distance, 373- (distance/4), 15, 15);


	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }



    public ShipLoot (Console con)
    {
	c = con;
    }



    public void run ()
    {
	displayShipLoot (200);
	displayShipLoot2 ();
    }
} // ShipLoot class
