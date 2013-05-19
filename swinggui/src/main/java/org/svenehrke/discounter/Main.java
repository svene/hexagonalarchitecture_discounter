package org.svenehrke.discounter;

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
				IDiscounterSecondaryPort discounter = new DiscounterSecondaryAdapter();
				JFrame frame = new ApplicationFrame(discounter).newComponent();

            }
        };
        EventQueue.invokeLater(runnable);
	}
}
