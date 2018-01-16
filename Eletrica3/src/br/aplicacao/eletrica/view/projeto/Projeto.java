/*
 * Created by JFormDesigner on Sun Jan 14 13:09:34 BRST 2018
 */

package br.aplicacao.eletrica.view.projeto;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

public class Projeto extends JPanel {
	private br.aplicacao.eletrica.modelo.projeto.Projeto p;
	
	public Projeto(br.aplicacao.eletrica.modelo.projeto.Projeto p) {
		this.p = p;
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		projetoPanel = new JPanel();
		fontePanel = new JPanel();
		quadroPanel = new JPanel();
		circuitoPanel = new JPanel();
		equipamentoPanel = new JPanel();

		//======== this ========
		setVisible(true);
		setLayout(new FormLayout(
			"default:grow",
			"4*(fill:default, $lgap), fill:default"));

		//======== projetoPanel ========
		{
			projetoPanel.setLayout(new FormLayout(
				"default",
				"fill:default"));
			projetoPanel = new ProjetoPanel(p);
		}
		add(projetoPanel, CC.xy(1, 1));

		//======== fontePanel ========
		{
			fontePanel.setLayout(new FormLayout(
				"default, $lcgap, default",
				"default"));
			fontePanel = new FontePanel(p);
		}
		add(fontePanel, CC.xy(1, 3));

		//======== quadroPanel ========
		{
			quadroPanel.setLayout(new FormLayout(
				"default, $lcgap, default",
				"default"));
			quadroPanel = new QuadroPanel(p);
		}
		add(quadroPanel, CC.xy(1, 5));

		//======== circuitoPanel ========
		{
			circuitoPanel.setLayout(new FormLayout(
				"default, $lcgap, default",
				"default"));
			circuitoPanel = new CircuitoPanel(p);
		}
		add(circuitoPanel, CC.xy(1, 7));

		//======== equipamentoPanel ========
		{
			equipamentoPanel.setLayout(new FormLayout(
				"default, $lcgap, default",
				"default"));
			equipamentoPanel = new EquipamentoPanel(p);
		}
		add(equipamentoPanel, CC.xy(1, 9));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel projetoPanel;
	private JPanel fontePanel;
	private JPanel quadroPanel;
	private JPanel circuitoPanel;
	private JPanel equipamentoPanel;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
