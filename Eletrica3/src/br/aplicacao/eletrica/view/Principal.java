/*
 * Created by JFormDesigner on Sun Jan 14 12:11:42 BRST 2018
 */

package br.aplicacao.eletrica.view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

import br.aplicacao.eletrica.view.controller.ListaController;
import br.aplicacao.eletrica.view.controller.ProjetoController;

public class Principal extends JFrame {
	
	public Principal() {
		initComponents();
		setLocationRelativeTo(null);
		setVisible(true);
		setExtendedState( JFrame.MAXIMIZED_BOTH );
	}

	private void abrirTelaProjeto(ActionEvent e) {
		ProjetoController controller = new ProjetoController();
		Lista l = new Lista(controller);
		l.setVisible(true);
		l.setSize(800,600);
		desktopPane1.add(l);
	}

	private void initComponents() {
		CellConstraints CC = new  CellConstraints();
		
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("br.aplicacao.eletrica.view.Principal");
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem1 = new JMenuItem();
		toolBar1 = new JToolBar();
		button1 = new JButton();
		desktopPane1 = new JDesktopPane();

		//======== this ========
		setTitle(bundle.getString("br.aplicacao.eletrica.view.principal.this.title"));
		Container contentPane = getContentPane();
		contentPane.setLayout(new FormLayout(
			"default:grow",
			"default, $lgap, fill:default:grow"));

		//======== menuBar1 ========
		{

			//======== menu1 ========
			{
				menu1.setText(bundle.getString("br.aplicacao.eletrica.view.principal.menu1.text"));

				//---- menuItem1 ----
				menuItem1.setText(bundle.getString("br.aplicacao.eletrica.view.principal.menuItem1.text"));
				menuItem1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						abrirTelaProjeto(e);
					}
				});
				menu1.add(menuItem1);
			}
			menuBar1.add(menu1);
		}
		setJMenuBar(menuBar1);

		//======== toolBar1 ========
		{

			//---- button1 ----
			button1.setText(bundle.getString("br.aplicacao.eletrica.view.principal.button1.text"));
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					abrirTelaProjeto(e);
				}
			});
			toolBar1.add(button1);
		}
		contentPane.add(toolBar1, CC.xy(1, 1));
		contentPane.add(desktopPane1, CC.xy(1, 3));
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItem1;
	private JToolBar toolBar1;
	private JButton button1;
	private JDesktopPane desktopPane1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
