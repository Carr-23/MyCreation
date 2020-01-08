// The "Intro" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Intro extends Thread
{
    private Console c;  // The output console

    public void displayIntro ()
    {
	for (int distance = 0 ; distance <= 740 ; distance++)
	{
	    c.setColor (Color.black);
	    c.fillRect (0 + distance, 0, 1, 500);
	    c.fillRect (-705 + distance, 0, 700, 500);

	    c.setFont (new Font ("Comic Sans MS", 1, 50));
	    c.setColor (Color.white);
	    c.drawString ("Protecting Planet Earth", -700 + distance, 220);

	    c.setFont (new Font ("Lucida Calligraphy", 1, 20));
	    c.setColor (Color.green);
	    c.drawString ("By: Braulio Andres Carrion Corveira", -635 + distance, 270);
	    ;

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
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}
    }


    public Intro (Console con)
    {
	c = con;
    }


    public void run ()
    {
	displayIntro ();
    }
} // Intro class


