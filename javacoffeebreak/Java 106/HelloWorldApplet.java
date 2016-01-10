import java.applet.*;
import java.awt.*;

/*
 *
 * HelloWorldApplet.java
 * Demonstration for Java 106 tutorial
 * David Reilly, August 24, 1997
 *
 */

public class HelloWorldApplet extends java.applet.Applet
{
        public HelloWorldApplet()
        {
                super();
        }

        public void paint ( Graphics g )
        {
                this.setBackground ( Color.white );
                g.setColor   ( Color.red );
                g.drawString ( "Hello world!", 0, size().height - 5);
        }
}
