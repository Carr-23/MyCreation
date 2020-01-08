// The "EndScreen" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class EndScreen extends Thread
{
    private Console c;  // The output console

    public void displayEndScreen ()
    {
	for (int distance = 0 ; distance <= 740 ; distance++)
	{
	    c.setColor (Color.black);
	    c.fillRect (0 + distance, 0, 1, 500);
	    c.fillRect (-705 + distance, 0, 600, 500);
	    
	    c.setFont (new Font ("Comic Sans MS", 1, 60));
	    c.setColor (Color.white);
	    c.drawString ("The End", -540+ distance, 220);
	    
	    c.setFont (new Font ("Lucida Calligraphy", 1, 20));
	    c.setColor (Color.yellow);
	    c.drawString ("By: Braulio Andres Carrion Corveira", -635+ distance, 270);
	    ;

	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

    }


    public EndScreen (Console con)
    {
	c = con;
    }


    public void run ()
    {
	displayEndScreen ();
    }
} // EndScreen class


