import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Event;
import java.awt.Panel;
import java.awt.TextField;

public class TextFieldApplet extends Applet {
	private TextField m_textfield;
	private StatusBar m_status;

	public void init() {
		Panel panel = new Panel();

		m_textfield = new TextField(15);
		panel.add(m_textfield);

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
		if (evt.target == m_textfield) {
			m_status.setStatus("Value : " + m_textfield.getText());

			return true;
		} else
			return false;
	}
}
