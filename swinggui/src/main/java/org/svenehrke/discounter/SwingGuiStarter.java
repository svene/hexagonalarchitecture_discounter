package org.svenehrke.discounter;

import javax.swing.*;
import java.awt.*;

public class SwingGuiStarter {

	private final IDiscounterSecondaryPort discounter;

	public SwingGuiStarter(final IDiscounterSecondaryPort discounter) {
		this.discounter = discounter;
	}

	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new ApplicationFrame(discounter).newComponent();
			}
		});
	}
}
