// The "ShipShoot" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class ShipShoot extends Thread
{
    private Console c;  // The output console

    public void displayShipShoot ()
    {
	for (int distance = 1 ; distance <= 240 ; distance++)
	{
	    c.setColor (new Color (0, 0, 102));
	    c.fillRect (641 - distance, 230, 100, 70);

	    //
	    c.setColor (new Color (153, 255, 255));
	    c.fillArc (680 - distance, 240, 40, 20, 0, 180);
	    c.fillArc (680 - distance, 270, 40, 20, 180, 180);

	    c.setColor (Color.black);
	    c.drawLine (720 - distance, 250, 720 - distance, 280);

	    c.setColor (new Color (255, 204, 51));
	    int xCoord[] = {720 - distance, 740 - distance, 730 - distance, 740 - distance, 720 - distance, };
	    int yCoord[] = {260, 260, 265, 270, 270};
	    c.fillPolygon (xCoord, yCoord, 5);

	    c.setColor (new Color (68, 54, 102));
	    c.fillRect (718 - distance, 260, 5, 10);


	    //
	    c.setColor (new Color (0, 25, 0));
	    int xCoord1[] = {640 - distance, 670 - distance, 670 - distance};
	    int yCoord1[] = {265, 250, 285};
	    c.fillPolygon (xCoord1, yCoord1, 3);

	    int xCoord2[] = {670 - distance, 670 - distance, 700 - distance, 700 - distance};
	    int yCoord2[] = {255, 280, 300, 230};
	    c.fillPolygon (xCoord2, yCoord2, 4);

	    //
	    c.setColor (new Color (153, 255, 255));
	    c.fillOval (675 - distance, 260, 15, 15);


	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}


    }


    private Color missile = new Color (89, 172, 255);
    private Color missileWings = new Color (8, 172, 255);
    private int speed = 20;

    public void missile ()
    {


	for (int distance = 1 ; distance <= 210 ; distance++)
	{
	    c.setColor (new Color (0, 0, 102));
	    c.fillRect (380 - distance, 254, 21, 25);

	    //wings
	    c.setColor (missileWings);
	    int xCoord[] = {385 - distance, 395 - distance, 395 - distance};
	    int yCoord[] = {265, 275, 255};
	    c.fillPolygon (xCoord, yCoord, 3);
	    //ship
	    c.setColor (missile);
	    c.fillRoundRect (380 - distance, 260, 20, 10, 30, 30);


	    try
	    {
		Thread.sleep (speed);
	    }
	    catch (Exception e)
	    {
	    }
	}


	for (int size = 1 ; size <= 25 ; size++)
	{
	    c.setColor (Color.red);
	    c.drawOval (150 - size, 250 - size, 1 + size * 3, 1 + size * 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}


	c.setColor (new Color (0, 0, 102));
	c.fillRect (80, 200, 122, 110);
    }


    public ShipShoot (Console con)
    {
	c = con;
    }


    public ShipShoot (Console con, Color c1, Color c2)
    {
	c = con;
	missile = c1;
	missileWings = c2;
	speed = speed + 10;
    }


    public ShipShoot (Console con, Color c1, Color c2, int t)
    {
	c = con;
	missile = c1;
	missileWings = c2;
	speed = t;
    }


    public void run ()
    {
	displayShipShoot ();
	missile ();
    }
} // ShipShoot class


