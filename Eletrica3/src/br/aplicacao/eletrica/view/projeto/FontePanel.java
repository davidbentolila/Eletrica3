/*
 * Created by JFormDesigner on Sun Jan 14 12:34:02 BRST 2018
 */

package br.aplicacao.eletrica.view.projeto;

import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

import br.aplicacao.eletrica.modelo.projeto.Projeto;

/**
 * @author Ricardo Carvalho
 */
public class FontePanel extends JPanel {
	
	public FontePanel(Projeto p) {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("br.aplicacao.eletrica.view.projeto.Projeto");
		label1 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		label2 = new JLabel();
		comboBox1 = new JComboBox();

		//======== this ========
		setBorder(new TitledBorder("Fonte"));
		setLayout(new FormLayout(
			"default, $lcgap, 77dlu, 2*($lcgap, default), $lcgap, default:grow",
			"2*(default, $lgap), 38dlu"));

		//---- label1 ----
		label1.setText(bundle.getString("br.aplicacao.eletrica.view.projeto.fonte.panel.label1.text"));
		add(label1, CC.xy(1, 1));
		add(textField1, CC.xy(3, 1));

		//---- label3 ----
		label3.setText(bundle.getString("br.aplicacao.eletrica.view.projeto.fonte.panel.label3.text"));
		add(label3, CC.xy(5, 1));

		//======== scrollPane1 ========
		{
			scrollPane1.setViewportView(table1);
		}
		add(scrollPane1, CC.xywh(9, 1, 1, 5));

		//---- label2 ----
		label2.setText(bundle.getString("br.aplicacao.eletrica.view.projeto.fonte.panel.label2.text"));
		add(label2, CC.xy(1, 3));
		add(comboBox1, CC.xywh(3, 3, 3, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField textField1;
	private JLabel label3;
	private JScrollPane scrollPane1;
	private JTable table1;
	private JLabel label2;
	private JComboBox comboBox1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
