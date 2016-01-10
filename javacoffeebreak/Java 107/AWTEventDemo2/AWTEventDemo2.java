import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;

public class AWTEventDemo2 extends Applet {
	private NumberTextField numberField;
	private Button clear;

	public void init() {
		setBackground(Color.white);

		setLayout(new FlowLayout());

		numberField = new NumberTextField(10);

		add(numberField);

		clear = new Button("Clear");

		add(clear);
	}

	public boolean action(Event evt, Object what) {
		if (evt.target == clear) {
			numberField.setText(" ");

			return true;
		} else
			return false;
	}
}