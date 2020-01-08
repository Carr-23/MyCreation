// The "MyCreation" class.
import java.awt.*;
import hsa.Console;

public class MyCreation
{
    Console c = new Console ();   // The output console

    public void intro ()
    {
	Intro i = new Intro (c);
	i.start ();
	try
	{
	    i.join ();
	}
	catch (Exception e)
	{
	}
    }


    public void background ()
    {
	Background b = new Background (c);
    }


    public void shipShoot ()
    {
	ShipShoot ss = new ShipShoot (c);
	ss.start ();

	ShipShoot ss1 = new ShipShoot (c, Color.green, Color.red);
	ss1.start ();

	ShipShoot ss2 = new ShipShoot (c, Color.yellow, Color.orange, 10);
	ss2.start ();
    }


    public void enemyShip ()
    {
	EnemyShip es = new EnemyShip (c);
	es.start ();
	try
	{
	    es.join ();
	}
	catch (Exception e)
	{
	}
    }


    public void shipTaken ()
    {
	ShipTaken st = new ShipTaken (c);
	st.start ();
    }


    public void shipLoot ()
    {
	ShipLoot sl = new ShipLoot (c);
	sl.run ();
    }


    public void enemyShipTaker ()
    {
	EnemyShipTaker est = new EnemyShipTaker (c);
	est.start ();
	try
	{
	    est.join ();
	}
	catch (Exception e)
	{
	}
    }


    public void meteor ()
    {
	Meteor m = new Meteor (c);
	m.start ();
	try
	{
	    m.join ();
	}
	catch (Exception e)
	{
	}
    }


    public void endScreen ()
    {
	EndScreen es = new EndScreen (c);
	es.start ();
    }


    public static void main (String[] args)
    {
	MyCreation mc = new MyCreation ();
	mc.intro ();
	mc.background ();
	mc.shipShoot ();
	mc.enemyShip ();
	mc.shipTaken ();
	mc.shipLoot ();
	mc.enemyShipTaker ();
	mc.meteor();
	mc.endScreen ();

	// Place your program here.  'c' is the output console
    } // main method
} // MyCreation class
