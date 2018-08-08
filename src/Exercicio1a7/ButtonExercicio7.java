package Exercicio1a7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonExercicio7 implements ActionListener{
	JLabel jlab;
	public ButtonExercicio7(){
		JFrame jfrm = new JFrame("Exemplo de um bot�o");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220, 90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jbotao1 = new JButton("Bot�o 1");
		JButton jbotao2 = new JButton("Bot�o 2");
		jbotao1.addActionListener(this);
		jbotao2.addActionListener(this);
		jfrm.add(jbotao1);
		jfrm.add(jbotao2);
		jlab = new JLabel("Pressione um dos bot�es");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		if (ae.getActionCommand().equals("Bot�o 1")){
			jlab.setText("Primeiro bot�o pressionado!");
		} else {
			jlab.setText("Segundo bot�o pressionado!");
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
