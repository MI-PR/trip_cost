import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cost {

    public static void main(String[] args) {
        JTextField distancField = new JTextField(5);
        JTextField mileageField = new JTextField(5);
        JTextField petrolCostField = new JTextField(5);

        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Distance"));
        panel.add(distancField);

        panel.add(new JLabel("Mileage"));
        panel.add(mileageField);

        panel.add(new JLabel("Petrol cost"));
        panel.add(petrolCostField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Enter trip details", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            double distance = Double.parseDouble(distancField.getText());
            double mileage = Double.parseDouble(mileageField.getText());
            double petrol = Double.parseDouble(petrolCostField.getText());

            double tripCost = (distance / mileage) * petrol;

            JOptionPane.showMessageDialog(null, "Trip Cost Rs. " + tripCost);
        }
    }

}
