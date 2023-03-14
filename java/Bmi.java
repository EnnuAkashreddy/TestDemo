import java.awt.*;
import java.awt.event.*;

class Bmi implements ActionListener {
	// Declaring Objects
	Frame f = new Frame();
	Label l1 = new Label("WEIGHT IN (KG)");
	Label l2 = new Label("HEIGHT IN (M)");
	Label l3 = new Label("YOUR BMI");
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	Button b1 = new Button("GET BMI");
	Button b2 = new Button("EXIT");

	Bmi() {
		// Giving Coordinates
		l1.setBounds(50, 100, 100, 20);
		l2.setBounds(50, 140, 100, 20);
		l3.setBounds(50, 180, 100, 20);
		t1.setBounds(200, 100, 100, 20);
		t2.setBounds(200, 140, 100, 20);
		t3.setBounds(200, 180, 100, 20);
		b1.setBounds(50, 250, 70, 20);
		b2.setBounds(130, 250, 50, 20);
		// Adding components to the frame
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400, 350);
	}

	public void actionPerformed(ActionEvent e) {
		float n1 = Float.parseFloat(t1.getText());
		float n2 = Float.parseFloat(t2.getText());
		if (e.getSource() == b1) {
			t3.setText(String.valueOf(n1 / (n2 * n2)));
		}
		if (e.getSource() == b2) {
			System.exit(0);
		}
	}

	public static void main(String... s) {
		new Bmi();
	}
}