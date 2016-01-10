import java.awt.Event;
import java.awt.TextField;

public class NumberTextField extends TextField {
	public NumberTextField(int cols) {
		super(cols);
	}

	public boolean keyDown(Event evt, int key) {
		char keyChar = (char) key;

		if (((keyChar > '0') && (keyChar < '9')) || (keyChar == '.') || (keyChar == '-') || (keyChar == 8)
				|| (keyChar == 127)) {
			return super.keyDown(evt, key);
		} else
			return true;
	}
}
