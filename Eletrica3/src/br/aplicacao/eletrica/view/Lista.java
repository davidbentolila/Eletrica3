/*
 * Created by JFormDesigner on Sun Jan 14 12:45:40 BRST 2018
 */

package br.aplicacao.eletrica.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;

import br.aplicacao.eletrica.modelo.projeto.Entidade;
import br.aplicacao.eletrica.view.controller.ListaController;

public class Lista<T extends Entidade> extends JInternalFrame {

	private ListaController<T> controller;
	private int colunaID;

	public Lista(ListaController<T> controller) {
		this.controller = controller;
		initComponents();
		controller.configureTabela(table1);
		colunaID = controller.getColunaID();
	}

	private T getSelectEntidade() {
		if (table1.getSelectedRow() >= 0) {
			Integer id = (Integer) table1.getValueAt(table1.getSelectedRow(), colunaID);
			return controller.getProjeto(id);
		}
		return null;
	}

	private void abrirDetalhe(T e) {
		Detalhe d = controller.abrirDetalhe(e);
		d.setSize(800, 600);
		d.setVisible(true);
		((JDesktopPane) getParent()).add(d);
	}

	private void adicionar() {
		abrirDetalhe(controller.criarEntidade());
	}

	private void editar() {
		T e = getSelectEntidade();
		if (e != null) {
			abrirDetalhe((T) e.copiar());
		}
	}

	private void excluir() {
		T e = getSelectEntidade();
		if (e != null) {
			controller.excluir(e);
		}
	}

	private void copiar() {
		T e = getSelectEntidade();
		if (e != null) {
			abrirDetalhe((T) e.clonarSemID());
		}
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("br.aplicacao.eletrica.view.Lista");
		toolBar1 = new JToolBar();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();

		// ======== this ========
		setVisible(true);
		setClosable(true);
		setMaximizable(true);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FormLayout("default:grow", "default, $lgap, fill:default:grow"));

		// ======== toolBar1 ========
		{

			// ---- button1 ----
			button1.setText(bundle.getString("br.aplicacao.eletrica.view.lista.button1.text"));
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					adicionar();
				}
			});
			toolBar1.add(button1);

			// ---- button2 ----
			button2.setText(bundle.getString("br.aplicacao.eletrica.view.lista.button2.text"));
			button2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					editar();
				}
			});
			toolBar1.add(button2);

			// ---- button3 ----
			button3.setText(bundle.getString("br.aplicacao.eletrica.view.lista.button3.text"));
			button3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					excluir();
				}
			});
			toolBar1.add(button3);

			// ---- button4 ----
			button4.setText(bundle.getString("br.aplicacao.eletrica.view.lista.button4.text"));
			button4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					copiar();
				}
			});
			toolBar1.add(button4);
		}
		contentPane.add(toolBar1, CC.xy(1, 1));

		// ======== scrollPane1 ========
		{
			scrollPane1.setViewportView(table1);
		}
		contentPane.add(scrollPane1, CC.xy(1, 3));
		// JFormDesigner - End of component initialization //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY //GEN-BEGIN:variables
	private JToolBar toolBar1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JScrollPane scrollPane1;
	private JTable table1;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
