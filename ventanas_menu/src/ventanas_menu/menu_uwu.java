package ventanas_menu;

import java.awt.Color;
import java.awt.MenuBar;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

public class menu_uwu {
	public static void main(String[] args) {
		// declaraciones
		JFrame frame = new JFrame();
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu1 = new JMenu("Manuela");
		JMenu menu2 = new JMenu("Rosario");
		JMenu menu3 = new JMenu("Jose Luisa");
		JMenu menu4 = new JMenu("Laura");
		JMenuItem MI1 = new JMenuItem("Manuela 1");
		JMenuItem MI2 = new JMenuItem("Manuela 2");
		JMenuItem MI3 = new JMenuItem("Manuela 3");
		
		JMenuItem MI4 = new JMenuItem("Rosario 1");
		JMenuItem MI5 = new JMenuItem("Rosario 2");
		JMenu submenu = new JMenu("Quien es?");
		JMenuItem submenu1 = new JMenuItem("Es Rosario");
		JMenuItem submenu2 = new JMenuItem("No es Rosario");
		
		JRadioButton boton1 = new JRadioButton("Griegos");
		JRadioButton boton2 = new JRadioButton("Romanos");
		JCheckBox boton3 = new JCheckBox("La maja desnuda");
		JCheckBox boton4 = new JCheckBox("La maja vestida");
		
		JMenuItem MI6 = new JMenuItem("Twinkiwinki");
		JMenuItem MI7 = new JMenuItem("pPO");
		
		menu4.add(MI6);
		menu4.add(MI7);
		
		menu3.add(boton1);
		menu3.add(boton2);
		menu3.add(boton3);
		menu3.add(boton4);
		
		menu2.add(MI4);
		menu2.add(MI5);
		menu2.add(submenu);
		submenu.add(submenu1);
		submenu.add(submenu2);
		
		
		menu1.add(MI1);
		menu1.add(MI2);
		menu1.add(MI3);
		
		frame.setJMenuBar(menuBar);
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);
		
		frame.getContentPane().setBackground(Color.pink);
		frame.setOpacity(1);
		frame.setTitle("Si soy un cupcake de frambuesa");
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
}
}