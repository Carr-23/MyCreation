// The "EnemyShip" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class EnemyShip extends Thread
{
    private Console c;  // The output console

    public void displayEnemyShip ()
    {
	for (int distance = 0 ; distance <= 167 ; distance++)
	{
	    c.setColor (new Color (0, 0, 102));
	    c.fillRect (-100 + distance, 230, 100, 75);

	    //
	    c.setColor (new Color (153, 255, 255));
	    c.fillArc (-62 + distance, 245, 50, 45, 0, 180);

	    //
	    c.setColor (new Color (12, 45, 255));
	    c.fillRoundRect (-75 + distance, 265, 75, 15, 30, 30);

	    c.setColor (Color.black);
	    c.drawLine (-60 + distance, 280, -67 + distance, 295);
	    c.drawLine (-14 + distance, 280, -7 + distance, 295);

	    c.fillOval (-72 + distance, 295, 7, 7);
	    c.fillOval (-8 + distance, 295, 7, 7);

	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public EnemyShip (Console con)
    {
	c = con;
    }


    public void run ()
    {
	displayEnemyShip ();
    }
} // EnemyShip class
