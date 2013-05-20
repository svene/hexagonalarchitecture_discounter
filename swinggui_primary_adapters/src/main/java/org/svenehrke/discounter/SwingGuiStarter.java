package org.svenehrke.discounter;

import javax.swing.*;
import java.awt.*;

public class SwingGuiStarter {

	private final IDiscounterPrimaryPort discounterApi;

	public SwingGuiStarter(final IDiscounterPrimaryPort discounterApi) {
		this.discounterApi = discounterApi;
	}

	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new ApplicationFrame(discounterApi).newComponent();
			}
		});
	}
}
