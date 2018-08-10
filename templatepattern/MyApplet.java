package templatepattern;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

	/**
	 * 
	 */
	String message;
	private static final long serialVersionUID = 1660369011258886040L;
	public void init() {
		message="hello world!!";
		repaint();
	}
	public void start() {
		message="start~~";
	}
	public void stop() {
		message="i'm being stop!!!";
	}
	public void destroy() {
		
	}
	public void paint(Graphics g)
	{
		g.drawString(message, 5, 15);
	}

}
