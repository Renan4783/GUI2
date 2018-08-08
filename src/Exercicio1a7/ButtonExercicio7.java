package Exercicio1a7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonExercicio7 implements ActionListener{
	JLabel jlab;
	public ButtonExercicio7(){
		JFrame jfrm = new JFrame("Exemplo de um botão");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220, 90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jbotao1 = new JButton("Botão 1");
		JButton jbotao2 = new JButton("Botão 2");
		jbotao1.addActionListener(this);
		jbotao2.addActionListener(this);
		jfrm.add(jbotao1);
		jfrm.add(jbotao2);
		jlab = new JLabel("Pressione um dos botões");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		if (ae.getActionCommand().equals("Botão 1")){
			jlab.setText("Primeiro botão pressionado!");
		} else {
			jlab.setText("Segundo botão pressionado!");
		}
	}
	
	public static void main (String args[]){
		SwingUtilities.invokeLater(new Runnable () {
			public void run (){
				new ButtonExercicio7();
			}
		});
	}
}
