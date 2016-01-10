import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Panel;
import java.awt.TextArea;

public class TextAreaApplet extends Applet {
	private TextArea m_textarea;
	private StatusBar m_status;
	private Button m_calculate;

	public void init() {
		Panel panel = new Panel();

		m_textarea = new TextArea(5, 20);
		panel.add(m_textarea);
		m_calculate = new Button("Calculate");
		panel.add(m_calculate);

		m_status = new StatusBar("Length : 0");

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
		if (evt.target == m_calculate) {
			m_status.setStatus("Length : " + m_textarea.getText().length());

			return true;
		} else
			return false;
	}
}