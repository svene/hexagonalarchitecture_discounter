package org.svenehrke.discounter;

import javax.swing.*;
import java.awt.*;

public class SwingGuiStarter {

	private ApplicationFrame applicationFrame;

	public SwingGuiStarter(final IDiscounterAdapter adapter) {
		applicationFrame = new ApplicationFrame(adapter);
	}

	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = applicationFrame.newComponent();
			}
		});
	}
}
