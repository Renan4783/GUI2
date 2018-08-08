package Exercicio8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import Exercicio8.cronometromod;

public class cronometromod implements ActionListener{
	
	JLabel jlab;
	JButton jbtnStartStop;
	long start;
	
	public cronometromod(){
		JFrame jfrm = new JFrame("Um cronometro simples");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(230, 90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jbtnStartStop = new JButton("Iniciar");
		jbtnStartStop.addActionListener(this);
		jfrm.add(jbtnStartStop);
		jlab = new JLabel("Pressione Iniciar para iniciar cronômetro.");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		Calendar cal = Calendar.getInstance();
		if (ae.getActionCommand().equals("Iniciar")){
			start = cal.getTimeInMillis();
			jbtnStartStop.setText("Parar");
			jlab.setText("Cronometro Está executando");
		} else {
			jbtnStartStop.setText("Iniciar");
			jlab.setText("Tempo decorrido: " + (double) (cal.getTimeInMillis() - start)/1000);
		}
	}
	
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new cronometromod();
			}
		});
	}
}
