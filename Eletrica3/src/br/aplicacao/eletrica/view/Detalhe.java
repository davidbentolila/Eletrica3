/*
 * Created by JFormDesigner on Sun Jan 14 12:41:51 BRST 2018
 */

package br.aplicacao.eletrica.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;

import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;

import br.aplicacao.eletrica.view.controller.ListaController;

public class Detalhe extends JInternalFrame {

	private ListaController controller;
	
	public Detalhe(ListaController controller) {
		initComponents();
		this.controller = controller;
		scrollPane1.setViewportView(controller.getPainel());
	}
	
	private void cancelarDetalhe() {
		//Criar confirmacao
		dispose();
	}

	private void salvarDetalhe() {
		controller.salvarDetalhe();
	}
	
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("br.aplicacao.eletrica.view.Detalhe");
		scrollPane1 = new JScrollPane();
		button2 = new JButton();
		button1 = new JButton();

		//======== this ========
		setVisible(true);
		setClosable(true);
		setMaximizable(true);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FormLayout(
			"right:default:grow, $lcgap, default",
			"fill:default:grow, $lgap, default"));
		contentPane.add(scrollPane1, CC.xywh(1, 1, 3, 1));

		//---- button2 ----
		button2.setText(bundle.getString("br.aplicacao.eletrica.view.detalhe.button2.text"));
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cancelarDetalhe();
			}
		});
		contentPane.add(button2, CC.xy(1, 3));

		//---- button1 ----
		button1.setText(bundle.getString("br.aplicacao.eletrica.view.detalhe.button1.text"));
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				salvarDetalhe();
			}
		});
		contentPane.add(button1, CC.xy(3, 3));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JScrollPane scrollPane1;
	private JButton button2;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
