import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Panel;

public class StatusBar extends Panel {
	private Label m_status;

	public StatusBar() {
		this(new String("Ok"));
	}

	public StatusBar(String value) {
		setLayout(new BorderLayout());

		m_status = new Label(value);
		add(m_status, "West");
	}

	public String getStatus() {
		return m_status.getText();
	}

	public void setStatus(String newValue) {
		m_status.setText(newValue);

		layout();
	}
}
