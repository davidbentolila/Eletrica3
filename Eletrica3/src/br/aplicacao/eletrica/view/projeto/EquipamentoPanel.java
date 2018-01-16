/*
 * Created by JFormDesigner on Sun Jan 14 16:08:34 BRST 2018
 */

package br.aplicacao.eletrica.view.projeto;

import java.util.ResourceBundle;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;

import br.aplicacao.eletrica.modelo.projeto.Projeto;

/**
 * @author Ricardo Carvalho
 */
public class EquipamentoPanel extends JPanel {

	public EquipamentoPanel(Projeto p) {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("br.aplicacao.eletrica.view.projeto.Projeto");
		label1 = new JLabel();
		textField1 = new JTextField();
		label9 = new JLabel();
		textField5 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		label10 = new JLabel();
		textField6 = new JTextField();
		label3 = new JLabel();
		comboBox1 = new JComboBox();
		label11 = new JLabel();
		textField7 = new JTextField();
		label4 = new JLabel();
		comboBox2 = new JComboBox();
		label12 = new JLabel();
		textField8 = new JTextField();
		label5 = new JLabel();
		textField3 = new JTextField();
		label13 = new JLabel();
		textField9 = new JTextField();
		label6 = new JLabel();
		comboBox3 = new JComboBox();
		label14 = new JLabel();
		textField10 = new JTextField();
		label7 = new JLabel();
		comboBox4 = new JComboBox();
		label8 = new JLabel();
		textField4 = new JTextField();

		// ======== this ========
		setBorder(new TitledBorder("Equipamento"));
		setLayout(new FormLayout("3*(default, $lcgap), default", "7*(default, $lgap), default"));

		// ---- label1 ----
		label1.setText(bundle.getString("Equipamento.label1.text"));
		add(label1, CC.xy(1, 1));
		add(textField1, CC.xy(3, 1));

		// ---- label9 ----
		label9.setText(bundle.getString("Equipamento.label9.text"));
		add(label9, CC.xy(5, 1));
		add(textField5, CC.xy(7, 1));

		// ---- label2 ----
		label2.setText(bundle.getString("Equipamento.label2.text"));
		add(label2, CC.xy(1, 3));
		add(textField2, CC.xy(3, 3));

		// ---- label10 ----
		label10.setText(bundle.getString("Equipamento.label10.text"));
		add(label10, CC.xy(5, 3));
		add(textField6, CC.xy(7, 3));

		// ---- label3 ----
		label3.setText(bundle.getString("Equipamento.label3.text"));
		add(label3, CC.xy(1, 5));
		add(comboBox1, CC.xy(3, 5));

		// ---- label11 ----
		label11.setText(bundle.getString("Equipamento.label11.text"));
		add(label11, CC.xy(5, 5));
		add(textField7, CC.xy(7, 5));

		// ---- label4 ----
		label4.setText(bundle.getString("Equipamento.label4.text"));
		add(label4, CC.xy(1, 7));
		add(comboBox2, CC.xy(3, 7));

		// ---- label12 ----
		label12.setText(bundle.getString("Equipamento.label12.text"));
		add(label12, CC.xy(5, 7));
		add(textField8, CC.xy(7, 7));

		// ---- label5 ----
		label5.setText(bundle.getString("Equipamento.label5.text"));
		add(label5, CC.xy(1, 9));
		add(textField3, CC.xy(3, 9));

		// ---- label13 ----
		label13.setText(bundle.getString("Equipamento.label13.text"));
		add(label13, CC.xy(5, 9));
		add(textField9, CC.xy(7, 9));

		// ---- label6 ----
		label6.setText(bundle.getString("Equipamento.label6.text"));
		add(label6, CC.xy(1, 11));
		add(comboBox3, CC.xy(3, 11));

		// ---- label14 ----
		label14.setText(bundle.getString("Equipamento.label14.text"));
		add(label14, CC.xy(5, 11));
		add(textField10, CC.xy(7, 11));

		// ---- label7 ----
		label7.setText(bundle.getString("Equipamento.label7.text"));
		add(label7, CC.xy(1, 13));
		add(comboBox4, CC.xy(3, 13));

		// ---- label8 ----
		label8.setText(bundle.getString("Equipamento.label8.text"));
		add(label8, CC.xy(1, 15));
		add(textField4, CC.xy(3, 15));
		// JFormDesigner - End of component initialization //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField textField1;
	private JLabel label9;
	private JTextField textField5;
	private JLabel label2;
	private JTextField textField2;
	private JLabel label10;
	private JTextField textField6;
	private JLabel label3;
	private JComboBox comboBox1;
	private JLabel label11;
	private JTextField textField7;
	private JLabel label4;
	private JComboBox comboBox2;
	private JLabel label12;
	private JTextField textField8;
	private JLabel label5;
	private JTextField textField3;
	private JLabel label13;
	private JTextField textField9;
	private JLabel label6;
	private JComboBox comboBox3;
	private JLabel label14;
	private JTextField textField10;
	private JLabel label7;
	private JComboBox comboBox4;
	private JLabel label8;
	private JTextField textField4;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
