// The "EnemyShipTaker" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class EnemyShipTaker extends Thread
{
    private Console c;  // The output console

    public void displayEnemyShipTaker (int location)
    {
	for (int distance = 1 ; distance <= 100 ; distance++)
	{
	    c.setColor (new Color (0, 0, 102));
	    c.fillRect (445, 45 - location + distance, 100, 100);

	    c.setColor (new Color (153, 255, 255));
	    c.fillArc (450, 50 - location + distance, 45, 40, 0, 180);

	    c.setColor (Color.black);
	    c.drawLine (455, 80 - location + distance, 450, 100 - location + distance);
	    c.drawLine (490, 80 - location + distance, 495, 100 - location + distance);

	    c.drawLine (467, 80 - location + distance, 478, 80 - location + distance);
	    c.drawLine (467, 81 - location + distance, 478, 81 - location + distance);

	    c.fillOval (492, 96 - location + distance, 7, 7);
	    c.fillOval (447, 96 - location + distance, 7, 7);

	    c.setColor (new Color (32, 3, 52));
	    c.fillRect (445, 70 - location + distance, 55, 10);

	    c.setColor (Color.red);
	    c.fillArc (468, 82 - location + distance, 11, 15, 0, 180);

	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public void displayEnemyShipTaker2 ()
    {
	for (int distance = 1 ; distance <= 25 ; distance++)
	{
	    c.setColor (new Color (0, 0, 102));
	    c.fillRect (466, 80, 13, 73);
	    c.setColor (new Color (32, 3, 52));
	    c.fillRect (445, 70, 55, 10);

	    c.setColor (Color.black);
	    c.drawLine (467, 80, 478, 80 + distance);
	    c.drawLine (467, 80 + distance, 478, 80);

	    c.drawLine (467, 105, 478, 105 + distance);
	    c.drawLine (467, 105 + distance, 478, 105);

	    c.drawLine (467, 130, 473, 129 + distance);
	    c.drawLine (473, 129 + distance, 478, 130);

	    c.setColor (Color.red);
	    c.fillArc (468, 82 + (distance - 3) * 3, 11, 15, 0, 180);

	    try
	    {
		Thread.sleep (25);
	    }
	    catch (Exception e)
	    {
	    }
	}
	try
	{
	    Thread.sleep (6850);
	}
	catch (Exception e)
	{
	}
    }


    public void displayEnemyShipTaker3 ()
    {
	for (int distance = 1 ; distance <= 200 ; distance++)
	{
	    c.setColor (new Color (0, 0, 102));
	    c.fillRect (445, 45 - distance, 100, 100);

	    c.setColor (new Color (153, 255, 255));
	    c.fillArc (450, 50 - distance, 45, 40, 0, 180);

	    c.setColor (Color.black);
	    c.drawLine (455, 80 - distance, 450, 100 - distance);
	    c.drawLine (490, 80 - distance, 495, 100 - distance);

	    c.fillOval (492, 96 - distance, 7, 7);
	    c.fillOval (447, 96 - distance, 7, 7);

	    c.setColor (new Color (32, 3, 52));
	    c.fillRect (445, 70 - distance, 55, 10);




	    c.setColor (Color.black);
	    c.drawLine (467, 80- distance, 478, 100 - distance);
	    c.drawLine (467, 100 - distance, 478, 80- distance);

	    c.drawLine (467, 105- distance, 478, 130 - distance);
	    c.drawLine (467, 130 - distance, 478, 105- distance);

	    c.drawLine (467, 130- distance, 473, 149 - distance);
	    c.drawLine (473, 149 - distance, 478, 130- distance);

	    c.setColor (Color.red);
	    c.fillArc (468, 148 - distance, 11, 15, 0, 180);

	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public EnemyShipTaker (Console con)
    {
	c = con;
    }


    public void run ()
    {
	displayEnemyShipTaker (100);
	displayEnemyShipTaker2 ();
	displayEnemyShipTaker3 ();
    }
} // EnemyShipTaker class


