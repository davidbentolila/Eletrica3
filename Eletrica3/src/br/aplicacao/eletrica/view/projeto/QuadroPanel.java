/*
 * Created by JFormDesigner on Sun Jan 14 15:43:01 BRST 2018
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
public class QuadroPanel extends JPanel {
	
	public QuadroPanel(Projeto p) {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("br.aplicacao.eletrica.view.projeto.Projeto");
		label3 = new JLabel();
		textField5 = new JTextField();
		label4 = new JLabel();
		comboBox1 = new JComboBox();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		label1 = new JLabel();
		textField1 = new JTextField();
		label7 = new JLabel();
		comboBox3 = new JComboBox();
		label2 = new JLabel();
		textField2 = new JTextField();
		label8 = new JLabel();
		comboBox4 = new JComboBox();
		label5 = new JLabel();
		textField3 = new JTextField();
		label6 = new JLabel();
		textField4 = new JTextField();

		//======== this ========
		setBorder(new TitledBorder("Quadro"));
		setLayout(new FormLayout(
			"5*(default, $lcgap), default:grow",
			"4*(default, $lgap), default"));

		//---- label3 ----
		label3.setText(bundle.getString("Quadro.label3.text"));
		add(label3, CC.xy(1, 1));
		add(textField5, CC.xy(3, 1));

		//---- label4 ----
		label4.setText(bundle.getString("Quadro.label4.text"));
		add(label4, CC.xy(5, 1));
		add(comboBox1, CC.xy(7, 1));

		//======== scrollPane1 ========
		{
			scrollPane1.setViewportView(table1);
		}
		add(scrollPane1, CC.xywh(11, 1, 1, 9));

		//---- label1 ----
		label1.setText(bundle.getString("Quadro.label1.text"));
		add(label1, CC.xy(1, 3));
		add(textField1, CC.xy(3, 3));

		//---- label7 ----
		label7.setText(bundle.getString("Quadro.label7.text"));
		add(label7, CC.xy(5, 3));
		add(comboBox3, CC.xy(7, 3));

		//---- label2 ----
		label2.setText(bundle.getString("Quadro.label2.text"));
		add(label2, CC.xy(1, 5));
		add(textField2, CC.xy(3, 5));

		//---- label8 ----
		label8.setText(bundle.getString("Quadro.label8.text"));
		add(label8, CC.xy(5, 5));
		add(comboBox4, CC.xy(7, 5));

		//---- label5 ----
		label5.setText(bundle.getString("Quadro.label5.text"));
		add(label5, CC.xy(1, 7));
		add(textField3, CC.xy(3, 7));

		//---- label6 ----
		label6.setText(bundle.getString("Quadro.label6.text"));
		add(label6, CC.xy(1, 9));
		add(textField4, CC.xy(3, 9));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label3;
	private JTextField textField5;
	private JLabel label4;
	private JComboBox comboBox1;
	private JScrollPane scrollPane1;
	private JTable table1;
	private JLabel label1;
	private JTextField textField1;
	private JLabel label7;
	private JComboBox comboBox3;
	private JLabel label2;
	private JTextField textField2;
	private JLabel label8;
	private JComboBox comboBox4;
	private JLabel label5;
	private JTextField textField3;
	private JLabel label6;
	private JTextField textField4;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
