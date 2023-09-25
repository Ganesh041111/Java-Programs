package Cafe_Manager;

import java.awt.EventQueue;
import java.lang.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Cafe_Manager {

	private JFrame frame;
	private JTextField MisalPav;
	private JTextField PavBhaji;
	private JTextField VegBiryani;
	private JTextField QtyDrinks;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafe_Manager window = new Cafe_Manager();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Cafe_Manager() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1800, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(26, 92, 743, 394);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Misal Pav");
		lblNewLabel_1.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_1.setBounds(39, 26, 166, 46);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pav Bhaji");
		lblNewLabel_2.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_2.setBounds(39, 85, 166, 70);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Veg. Biryani");
		lblNewLabel_3.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_3.setBounds(39, 156, 208, 62);
		panel.add(lblNewLabel_3);
		
		MisalPav = new JTextField();
		MisalPav.setFont(new Font("Times New Roman", Font.BOLD, 36));
		MisalPav.setBounds(323, 27, 232, 38);
		panel.add(MisalPav);
		MisalPav.setColumns(10);
		
		PavBhaji = new JTextField();
		PavBhaji.setFont(new Font("Times New Roman", Font.BOLD, 36));
		PavBhaji.setColumns(10);
		PavBhaji.setBounds(323, 98, 232, 38);
		panel.add(PavBhaji);
		
		VegBiryani = new JTextField();
		VegBiryani.setFont(new Font("Times New Roman", Font.BOLD, 36));
		VegBiryani.setColumns(10);
		VegBiryani.setBounds(323, 165, 232, 38);
		panel.add(VegBiryani);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 24));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tea", "Masala Tea", "Coffee", "Cappuccino", "Lassi", "Chaas"}));
		comboBox.setBounds(43, 301, 190, 38);
		panel.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("Drinks");
		lblNewLabel_7.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_7.setBounds(39, 263, 87, 25);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Quantity");
		lblNewLabel_8.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_8.setBounds(403, 264, 102, 25);
		panel.add(lblNewLabel_8);
		
		QtyDrinks = new JTextField();
		QtyDrinks.setFont(new Font("Sitka Display", Font.BOLD, 24));
		QtyDrinks.setBounds(403, 301, 116, 40);
		panel.add(QtyDrinks);
		QtyDrinks.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(843, 92, 403, 394);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox CheckBoxSD = new JCheckBox("Service Tax");
		CheckBoxSD.setBounds(71, 105, 214, 57);
		panel_1.add(CheckBoxSD);
		CheckBoxSD.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 36));
		
		JCheckBox CheckBoxHD = new JCheckBox("Home Delivery");
		CheckBoxHD.setBounds(71, 225, 279, 57);
		panel_1.add(CheckBoxHD);
		CheckBoxHD.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 36));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_1.setBounds(1318, 94, 452, 846);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("RECEIPT");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 49));
		lblNewLabel_6.setBounds(123, 26, 224, 49);
		panel_1_1.add(lblNewLabel_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 24));
		textArea.setBounds(12, 80, 428, 753);
		panel_1_1.add(textArea);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_2.setBounds(843, 499, 403, 311);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Service Tax");
		lblNewLabel_5.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_5.setBounds(26, 33, 180, 49);
		panel_1_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Sub Total");
		lblNewLabel_5_1.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_5_1.setBounds(26, 113, 157, 49);
		panel_1_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Total");
		lblNewLabel_5_2.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_5_2.setBounds(26, 191, 180, 49);
		panel_1_2.add(lblNewLabel_5_2);
		
		JLabel se_tax = new JLabel("");
		se_tax.setHorizontalAlignment(SwingConstants.RIGHT);
		se_tax.setFont(new Font("Times New Roman", Font.BOLD, 36));
		se_tax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		se_tax.setBounds(237, 33, 126, 39);
		panel_1_2.add(se_tax);
		
		JLabel sub_tot = new JLabel("");
		sub_tot.setHorizontalAlignment(SwingConstants.RIGHT);
		sub_tot.setFont(new Font("Times New Roman", Font.BOLD, 24));
		sub_tot.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		sub_tot.setBounds(195, 113, 168, 39);
		panel_1_2.add(sub_tot);
		
		JLabel Total = new JLabel("");
		Total.setHorizontalAlignment(SwingConstants.RIGHT);
		Total.setFont(new Font("Times New Roman", Font.BOLD, 24));
		Total.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Total.setBounds(195, 201, 168, 39);
		panel_1_2.add(Total);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_3.setBounds(26, 499, 743, 311);
		frame.getContentPane().add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cost of Drinks");
		lblNewLabel_1_1.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_1_1.setBounds(52, 34, 235, 46);
		panel_1_3.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cost of Meals");
		lblNewLabel_2_1.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_2_1.setBounds(52, 97, 258, 74);
		panel_1_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Cost of Delivery");
		lblNewLabel_3_1.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_3_1.setBounds(48, 184, 280, 62);
		panel_1_3.add(lblNewLabel_3_1);
		
		JLabel lblCostOfDrinks = new JLabel("");
		lblCostOfDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostOfDrinks.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblCostOfDrinks.setBounds(383, 34, 251, 39);
		lblCostOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1_3.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeals = new JLabel("");
		lblCostOfMeals.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostOfMeals.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblCostOfMeals.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblCostOfMeals.setBounds(383, 107, 251, 39);
		panel_1_3.add(lblCostOfMeals);
		
		JLabel lblCostOfDelivery = new JLabel("");
		lblCostOfDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostOfDelivery.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblCostOfDelivery.setBounds(383, 193, 251, 39);
		panel_1_3.add(lblCostOfDelivery);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_4.setBounds(26, 823, 1268, 117);
		frame.getContentPane().add(panel_1_4);
		panel_1_4.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			    //=====================meals==================================
			public void actionPerformed(ActionEvent e) {
				double misal_pav = Double.parseDouble(MisalPav.getText());
				double imisal_pav = 40;
				double pmisal_pav;
				pmisal_pav = (misal_pav*imisal_pav);
				String omisal_pav = String.format("%.2f", pmisal_pav);
				lblCostOfMeals.setText(omisal_pav);
				
				double pav_bhaji = Double.parseDouble(PavBhaji.getText());
				double ipav_bhaji = 80;
				double ppav_bhaji;
				ppav_bhaji = (pav_bhaji*ipav_bhaji);
				String opav_bhaji = String.format("%.2f", pmisal_pav + ppav_bhaji);
				lblCostOfMeals.setText(opav_bhaji);
				
				double veg_bir = Double.parseDouble(VegBiryani.getText());
				double iveg_bir = 100;
				double pveg_bir;
				pveg_bir = (veg_bir*iveg_bir);
				String oveg_bir = String.format("%.2f", pmisal_pav + ppav_bhaji + pveg_bir);
				lblCostOfMeals.setText(oveg_bir);
				
				//==========================delivery===========================
				double iDelivery = 20;
				if(CheckBoxHD.isSelected())
				{
					String pDelivery = String.format("%.2f",iDelivery);
					lblCostOfDelivery.setText(pDelivery);
					
				}
				else
					
				{
					lblCostOfDelivery.setText("0");
				}
				
				//=================================Drinks=========================
				double Drinks = Double.parseDouble(QtyDrinks.getText());
				double Tea = 10 * Drinks;
				double Masala_Tea = 15 * Drinks;
				double Coffee = 15 * Drinks;
				double Cappuccino = 25 * Drinks;
				double Lassi = 20 * Drinks;
				double Chaas = 20 * Drinks;
				
				if (comboBox.getSelectedItem().equals("Chaas"))
				{
					String cChaas = String.format("%.2f", Chaas);
					lblCostOfDrinks.setText(cChaas);
				}
				if (comboBox.getSelectedItem().equals("Lassi"))
				{
					String cLassi = String.format("%.2f", Lassi);
					lblCostOfDrinks.setText(cLassi);
				}
				if (comboBox.getSelectedItem().equals("Cappuccino"))
				{
					String cCappuccino = String.format("%.2f", Cappuccino);
					lblCostOfDrinks.setText(cCappuccino);
				}
				if (comboBox.getSelectedItem().equals("Coffee"))
				{
					String cCoffee = String.format("%.2f", Coffee);
					lblCostOfDrinks.setText(cCoffee);
				}
				if (comboBox.getSelectedItem().equals("Masala Tea"))
				{
					String cMasala_Tea = String.format("%.2f", Masala_Tea);
					lblCostOfDrinks.setText(cMasala_Tea);
				}
				if (comboBox.getSelectedItem().equals("Tea"))
				{
					String cTea = String.format("%.2f", Tea);
					lblCostOfDrinks.setText(cTea);
				}
				//==============================TAX Rate===============================
				double cTotal1 = Double.parseDouble(lblCostOfDrinks.getText());
				double cTotal2 = Double.parseDouble(lblCostOfMeals.getText());
				double cTotal3 = Double.parseDouble(lblCostOfDelivery.getText());
				double AllTotal = (cTotal1+cTotal2+cTotal3)/40;
				if(CheckBoxSD.isSelected()) {
					String iTotal = String.format("%.2f", AllTotal);
					se_tax.setText(iTotal);
					
				}
				
				//===========================Total====================
				double cTotal4= Double.parseDouble(se_tax.getText());
				
				double subTotal = (cTotal1+cTotal2+cTotal3);
				String isubTotal = String.format("Rs. %.2f", subTotal);
				sub_tot.setText(isubTotal);
				
				double allTotal = (cTotal1+cTotal2+cTotal3+cTotal4);
				String iTotal = String.format("Rs. %.2f", allTotal);
				Total.setText(iTotal);
				
				
			}
		});
		btnTotal.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 39));
		btnTotal.setBounds(147, 34, 186, 42);
		panel_1_4.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double Qty11 = Double.parseDouble(MisalPav.getText());
				double Qty22 = Double.parseDouble(PavBhaji.getText());
				double Qty33 = Double.parseDouble(VegBiryani.getText());
				double Qty77 = Double.parseDouble(QtyDrinks.getText());
				
				 textArea.setText("\n========================================\n\n Cafe Maneger : \t\t "
				 		+ "\n\n"+"Misal Pav: \t"+Qty11+
				 		"\nPav Bhaji: \t"+Qty22+
				 		"\nVeg. Biryani: \t"
				 		+Qty33+
				 		"\nQuantity of Drinks: \t"+Qty77+
				 		"\n\nTHANK YOU! VISIT AGAIN!!\n===========================================\n");
				
				}
		});
		btnReceipt.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 39));
		btnReceipt.setBounds(438, 34, 186, 42);
		panel_1_4.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MisalPav.setText(null);
				PavBhaji.setText(null);
				VegBiryani.setText(null);
				QtyDrinks.setText(null);
				lblCostOfDrinks.setText(null);
				lblCostOfMeals.setText(null);
				lblCostOfDelivery.setText(null);
				se_tax.setText(null);
				sub_tot.setText(null);
				Total.setText(null);
				comboBox.setSelectedItem("Select a drink");
				
				
				
				
				
				
			}
		});
		btnReset.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 39));
		btnReset.setBounds(743, 34, 186, 42);
		panel_1_4.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 39));
		btnExit.setBounds(1014, 34, 186, 42);
		panel_1_4.add(btnExit);
		
		JLabel lblNewLabel = new JLabel(" CAFE MANAGER");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 49));
		lblNewLabel.setBounds(745, 13, 429, 66);
		frame.getContentPane().add(lblNewLabel);
	}
}
