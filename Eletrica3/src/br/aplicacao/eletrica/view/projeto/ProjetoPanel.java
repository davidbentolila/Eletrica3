package br.aplicacao.eletrica.view.projeto;

/*
 * Created by JFormDesigner on Sun Jan 14 12:33:17 BRST 2018
 */

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;

import br.aplicacao.eletrica.modelo.projeto.Projeto;

/**
 * @author Ricardo Carvalho
 */
public class ProjetoPanel extends JPanel {
	private Projeto p;
	private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public ProjetoPanel(Projeto p) {
		this.p = p;
		initComponents();
		preencherDados();
	}

	private void preencherDados() {
		txtProjetoNome.setText(p.getNome());

		txtProjetoData.setText(p.getData() != null ? df.format(p.getData().getTime()) : "");
		txtProjetoDescricao.setText(p.getDescricao());
		txtProjetoAutor.setText(p.getAutor());
	}

	private void atualizaProjeto() {
		p.setNome(txtProjetoNome.getText());
		p.setDescricao(txtProjetoDescricao.getText());
		p.setAutor(txtProjetoAutor.getText());

		Calendar c = Calendar.getInstance();
		try {
			c.setTime(df.parse(txtProjetoData.getText()));
			p.setData(c);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(this, "Data em formato inválido");
		}
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("br.aplicacao.eletrica.view.projeto.Projeto");
		JLabel label1 = new JLabel();
		txtProjetoNome = new JTextField();
		JLabel label4 = new JLabel();
		JLabel label2 = new JLabel();
		txtProjetoData = new JTextField();
		JScrollPane scrollPane1 = new JScrollPane();
		txtProjetoDescricao = new JTextArea();
		JLabel label3 = new JLabel();
		txtProjetoAutor = new JTextField();

		// ======== this ========
		setBorder(new TitledBorder("Projeto"));
		setLayout(new FormLayout("default, $lcgap, 117dlu, $ugap, default:grow", "2*(default, $lgap), default"));

		// ---- label1 ----
		label1.setText(bundle.getString("br.aplicacao.eletrica.view.projeto.ProjetoPanel.label1.text"));
		add(label1, CC.xy(1, 1));

		// ---- txtProjetoNome ----
		txtProjetoNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				atualizaProjeto();
			}
		});
		add(txtProjetoNome, CC.xy(3, 1));

		// ---- label4 ----
		label4.setText(bundle.getString("br.aplicacao.eletrica.view.projeto.ProjetoPanel.label4.text"));
		add(label4, CC.xy(5, 1));

		// ---- label2 ----
		label2.setText(bundle.getString("br.aplicacao.eletrica.view.projeto.ProjetoPanel.label2.text"));
		add(label2, CC.xy(1, 3));

		// ---- txtProjetoData ----
		txtProjetoData.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				atualizaProjeto();
			}
		});
		add(txtProjetoData, CC.xy(3, 3));

		// ======== scrollPane1 ========
		{

			// ---- txtProjetoDescricao ----
			txtProjetoDescricao.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					atualizaProjeto();
				}
			});
			scrollPane1.setViewportView(txtProjetoDescricao);
		}
		add(scrollPane1, CC.xywh(5, 3, 1, 3));

		// ---- label3 ----
		label3.setText(bundle.getString("br.aplicacao.eletrica.view.projeto.ProjetoPanel.label3.text"));
		add(label3, CC.xy(1, 5));

		// ---- txtProjetoAutor ----
		txtProjetoAutor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				atualizaProjeto();
			}
		});
		add(txtProjetoAutor, CC.xy(3, 5));
		// JFormDesigner - End of component initialization //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY //GEN-BEGIN:variables
	private JTextField txtProjetoNome;
	private JTextField txtProjetoData;
	private JTextArea txtProjetoDescricao;
	private JTextField txtProjetoAutor;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
