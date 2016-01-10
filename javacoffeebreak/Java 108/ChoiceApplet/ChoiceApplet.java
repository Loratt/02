import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Event;
import java.awt.Panel;

public class ChoiceApplet extends Applet {
	private Choice m_choice;
	private StatusBar m_status;

	public void init() {
		Panel panel = new Panel();

		m_choice = new Choice();
		panel.add(m_choice);

		m_choice.addItem("Make a selection");
		m_choice.addItem("Selection 1");
		m_choice.addItem("Selection 2");
		m_choice.addItem("Selection 3");

		m_status = new StatusBar("Value : ");

		setBackground(Color.white);
		setForeground(Color.black);
		panel.setBackground(Color.white);
		panel.setForeground(Color.black);
		m_status.setBackground(Color.white);
		m_status.setForeground(Color.black);

		setLayout(new BorderLayout());
		add(panel, "North");
		add(m_status, "South");

		layout();
	}

	public boolean action(Event evt, Object what) {
		if (evt.target == m_choice) {
			m_status.setStatus("Value : " + m_choice.getSelectedItem());

			return true;
		} else
			return false;
	}
}