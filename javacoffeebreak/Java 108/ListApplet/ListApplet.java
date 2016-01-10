import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Event;
import java.awt.List;
import java.awt.Panel;

public class ListApplet extends Applet {
	private List m_list;
	private StatusBar m_status;

	public void init() {
		Panel panel = new Panel();

		m_list = new List(5, false);
		panel.add(m_list);

		m_list.addItem("Selection 1");
		m_list.addItem("Selection 2");
		m_list.addItem("Selection 3");
		m_list.addItem("Selection 4");
		m_list.addItem("Selection 5");

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
		if (evt.target == m_list) {
			m_status.setStatus("Value : " + m_list.getSelectedItem());

			return true;
		} else
			return false;
	}
}