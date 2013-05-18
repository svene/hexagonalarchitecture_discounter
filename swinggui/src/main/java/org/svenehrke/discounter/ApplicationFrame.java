package org.svenehrke.discounter;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationFrame {
    public JFrame newComponent() {
        JFrame result = new JFrame("Discount Calculator");
        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MigLayout ml = new MigLayout(
            "insets 10, wrap 2",
            "[]10[]10[fill]"
        );
        result.setLayout(ml);

        TextField tf = new TextField("100", 10);
        Label label = new Label("0.00");
        label.setSize(50, label.getHeight());
        JButton button = new JButton("calc discount");

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String amountStr = tf.getText();
                double amount = Double.parseDouble(amountStr);
                double discount = new DiscounterSecondaryAdapter().calculatedDiscount(amount);
                label.setText(String.valueOf(discount));
            }
        };

        button.addActionListener(actionListener);

        result.add(tf);
        result.add(button);
        result.add(label);
        result.setSize(350, 100);
        result.setVisible(true);
        return result;
    }
}
