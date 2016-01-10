import java.applet.*;
import java.awt.*;

public class AWTEventDemo1 extends java.applet.Applet

{

	private String message = "Waiting for events...";

	public AWTEventDemo1() {
		super();
	}

	public void init() {
		setBackground(Color.white);
	}

	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("Hello world!", 0, size().height - 5);
	}

	public boolean mouseEnter(Event evt, int x, int y) {
		message = "mouseEnter - x:" + x + " y: " + y;

		repaint();

		return true;
	}

	public boolean mouseExit(Event evt, int x, int y) {
		message = "mouseExit - x:" + x + " y: " + y;

		repaint();

		return true;
	}

	public boolean mouseMove(Event evt, int x, int y) {
		message = "mouseMove - x:" + x + " y: " + y;

		repaint();

		return true;
	}

	public boolean mouseDown(Event evt, int x, int y) {
		message = "mouseDown - x:" + x + " y: " + y;

		repaint();

		return true;
	}
}
