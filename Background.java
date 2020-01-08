// The "Background" class.
import java.awt.*;
import hsa.Console;

public class Background
{
    private Console c;           // The output console

    public void displayBackground ()
    {
	c.setColor (new Color (0, 0, 102));
	c.fillRect (0, 0, 640, 500);
	c.setColor (new Color (255, 255, 0));
	c.fillStar (175, 435, 15, 15);
	c.fillStar (550, 465, 15, 15);
	c.fillStar (580, 20, 15, 15);
	c.fillStar (155, 70, 15, 15);

	c.setColor (new Color (192, 192, 192));
	c.fillOval (43, 33, 83, 83);
	c.setColor (new Color (128, 128, 128));
	c.fillOval (61, 50, 20, 20);
	c.fillOval (71, 78, 15, 15);
	c.fillOval (104, 47, 10, 10);

	c.setColor (new Color (0, 128, 255));
	c.fillArc (565, 35, 152, 190, 90, 180);

	int xCoord1[] = {640, 620, 615, 600, 615, 600, 640};
	int yCoord1[] = {75, 90, 75, 95, 125, 150, 215};
	c.setColor (new Color (0, 102, 0));
	c.fillPolygon (xCoord1, yCoord1, 7);

	int xCoord2[] = {585, 595, 600, 590};
	int yCoord2[] = {180, 185, 182, 170};
	c.fillPolygon (xCoord2, yCoord2, 4);

	c.setColor (new Color (0, 128, 255));
	int xCoord[] = {625, 620, 630, 635};
	int yCoord[] = {145, 150, 165, 155};
	c.fillPolygon (xCoord, yCoord, 4);

    }


    public Background (Console con)
    {
	c = con;
	displayBackground ();
    }
} // Background class
