import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Panel;

public class ButtonApplet extends Applet {
	private Button m_button;
	private StatusBar m_status;

	public static final String state1 = "Click me";
	public static final String state2 = "Clicked";

	public void init() {
		Panel panel = new Panel();

		m_button = new Button(state1);
		panel.add(m_button);

		m_status = new StatusBar("Value : unclicked");

		setBackground(Color.white);
		setForeground(Color.black);
		panel.setBackground(Color.white);
		panel.setForeground(Color.black);
		m_status.setBackground(Color.white);
		m_status.setForeground(Color.black);
		m_button.setBackground(Color.blue);
		m_button.setForeground(Color.white);

		setLayout(new BorderLayout());
		add(panel, "North");
		add(m_status, "South");

		layout();
	}

	public boolean action(Event evt, Object what) {
		if ((evt.target == m_button) && (evt.id == 1001)) {
			if (m_button.getLabel().compareTo(state1) == 0) {
				m_button.setLabel(state2);
				m_status.setStatus(state1);
			} else {
				m_button.setLabel(state1);
				m_status.setStatus(state2);
			}

			return true;
		} else
			return false;
	}
}