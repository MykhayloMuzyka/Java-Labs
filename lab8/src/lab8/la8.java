package lab8;

import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class la8 {

	private static JFrame frmExcursions;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_8;
	ArrayList<Excursion> excursion = new ArrayList<>();
	Excursion e = new Excursion();
	methods meth = new methods();
	 public ArrayList<Excursion> getExcursion() {
	        return excursion;
	    }
	    public void setExcursion(ArrayList<Excursion> excursion) {
	        this.excursion = excursion;
	    }
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					la8 window = new la8();
					window.frmExcursions.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public la8() {
		frmExcursions = new JFrame();
		frmExcursions.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmExcursions.setTitle("EXCURSIONS");
		frmExcursions.setBounds(100, 100, 450, 251);
		frmExcursions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExcursions.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Show all excursions");
		btnNewButton.setBounds(10, 11, 243, 23);
		frmExcursions.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add excursion");
		btnNewButton_1.setBounds(10, 45, 243, 23);
		frmExcursions.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remove excursion");
		btnNewButton_2.setBounds(10, 79, 243, 23);
		frmExcursions.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Sort excursions by place");
		btnNewButton_3.setBounds(10, 113, 243, 23);
		frmExcursions.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Save to XML");
		btnNewButton_4.setBounds(10, 147, 121, 23);
		frmExcursions.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Save to TXT");
		btnNewButton_5.setBounds(132, 147, 121, 23);
		frmExcursions.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Load from XML");
		btnNewButton_6.setBounds(10, 181, 121, 23);
		frmExcursions.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 =  new JButton("Load from TXT");
		btnNewButton_7.setBounds(132, 181, 121, 23);
		frmExcursions.getContentPane().add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel("Place: ");
		lblNewLabel.setVisible(false);
		lblNewLabel.setBounds(10, 15, 46, 14);
		frmExcursions.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setVisible(false);
		textField.setBounds(91, 12, 162, 20);
		frmExcursions.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Date:");
		lblNewLabel_1.setVisible(false);
		lblNewLabel_1.setBounds(10, 49, 46, 14);
		frmExcursions.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setVisible(false);
		textField_1.setBounds(91, 46, 162, 20);
		frmExcursions.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Time:");
		lblNewLabel_2.setVisible(false);
		lblNewLabel_2.setBounds(10, 83, 46, 14);
		frmExcursions.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setVisible(false);
		textField_2.setBounds(91, 80, 162, 20);
		frmExcursions.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Duration:");
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setBounds(10, 117, 61, 14);
		frmExcursions.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Discription:");
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setBounds(10, 151, 71, 14);
		frmExcursions.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setVisible(false);
		textField_4.setBounds(91, 147, 162, 20);
		frmExcursions.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("Add");
		btnNewButton_8.setVisible(false);
		btnNewButton_8.setBounds(10, 181, 121, 23);
		frmExcursions.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Back");
		btnNewButton_9.setVisible(false);
		btnNewButton_9.setBounds(132, 181, 121, 23);
		frmExcursions.getContentPane().add(btnNewButton_9);
		
		JLabel lblNewLabel_5 = new JLabel("Enter the number of excursion");
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setBounds(53, 49, 200, 14);
		frmExcursions.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("you want to remove:");
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setBounds(79, 67, 121, 14);
		frmExcursions.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton_10 = new JButton("Remove");
		btnNewButton_10.setVisible(false);
		btnNewButton_10.setBounds(10, 181, 121, 23);
		frmExcursions.getContentPane().add(btnNewButton_10);
		
		JLabel lblNewLabel_7 = new JLabel("you want to save:");
		lblNewLabel_7.setVisible(false);
		lblNewLabel_7.setBounds(79, 67, 121, 14);
		frmExcursions.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Enter the name of the file");
		lblNewLabel_8.setVisible(false);
		lblNewLabel_8.setBounds(66, 113, 149, 14);
		frmExcursions.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("you want to save to:");
		lblNewLabel_9.setVisible(false);
		lblNewLabel_9.setBounds(79, 128, 121, 14);
		frmExcursions.getContentPane().add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setVisible(false);
		textField_7.setBounds(89, 148, 86, 20);
		frmExcursions.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_11 = new JButton("Save");
		btnNewButton_11.setVisible(false);
		btnNewButton_11.setBounds(10, 181, 121, 23);
		frmExcursions.getContentPane().add(btnNewButton_11);
		
		JLabel lblEnterTheName = new JLabel("Enter the name the file");
		lblEnterTheName.setVisible(false);
		lblEnterTheName.setBounds(66, 49, 134, 14);
		frmExcursions.getContentPane().add(lblEnterTheName);
		
		JLabel lblYouWantTo = new JLabel("you want to load from:");
		lblYouWantTo.setVisible(false);
		lblYouWantTo.setBounds(79, 67, 136, 14);
		frmExcursions.getContentPane().add(lblYouWantTo);
		
		textField_8 = new JTextField();
		textField_8.setVisible(false);
		textField_8.setBounds(89, 92, 86, 20);
		frmExcursions.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_12 = new JButton("Load");
		btnNewButton_12.setVisible(false);
		btnNewButton_12.setBounds(10, 181, 121, 23);
		frmExcursions.getContentPane().add(btnNewButton_12);
		
		JSpinner spinner = new JSpinner();
		spinner.setVisible(false);
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setBounds(91, 114, 162, 20);
		frmExcursions.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setVisible(false);
		spinner_1.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner_1.setBounds(91, 113, 84, 20);
		frmExcursions.getContentPane().add(spinner_1);
		
		JButton btnNewButton_13 = new JButton("Clear");
		btnNewButton_13.setBounds(297, 181, 89, 23);
		frmExcursions.getContentPane().add(btnNewButton_13);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner_2.setVisible(false);
		spinner_2.setBounds(91, 79, 84, 20);
		frmExcursions.getContentPane().add(spinner_2);
		
		JButton btnNewButton_14 = new JButton("Load");
		btnNewButton_14.setVisible(false);
		btnNewButton_14.setBounds(10, 181, 121, 23);
		frmExcursions.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("Save");
		btnNewButton_15.setBounds(10, 181, 121, 23);
		frmExcursions.getContentPane().add(btnNewButton_15);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(263, 11, 161, 159);
		frmExcursions.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(false);     btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false);   btnNewButton_3.setVisible(false);
				btnNewButton_4.setVisible(false);   btnNewButton_5.setVisible(false);
				btnNewButton_6.setVisible(false);   btnNewButton_7.setVisible(false);
				btnNewButton_8.setVisible(true);    btnNewButton_9.setVisible(true);
				lblNewLabel.setVisible(true);     	lblNewLabel_1.setVisible(true);
				lblNewLabel_2.setVisible(true);		lblNewLabel_3.setVisible(true);
				lblNewLabel_4.setVisible(true);		textField.setVisible(true);
				textField_1.setVisible(true);		textField_2.setVisible(true);
				spinner.setVisible(true);		textField_4.setVisible(true);
				 textField.setText(""); 		textField_1.setText("");	textField_2.setText("");	textField_4.setText("");
				 spinner.setValue(1);
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				meth.sort(excursion);
				meth.show(textArea, excursion);
			}
		});
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(true);      btnNewButton_1.setVisible(true);
				btnNewButton_2.setVisible(true);    btnNewButton_3.setVisible(true);
				btnNewButton_4.setVisible(true);    btnNewButton_5.setVisible(true);
				btnNewButton_6.setVisible(true);    btnNewButton_7.setVisible(true);
				btnNewButton_8.setVisible(false);   btnNewButton_9.setVisible(false);
				lblNewLabel.setVisible(false);      lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);    lblNewLabel_3.setVisible(false);
				lblNewLabel_4.setVisible(false);    textField.setVisible(false);
				textField_1.setVisible(false);	    textField_2.setVisible(false);
				spinner.setVisible(false);	        textField_4.setVisible(false);
				lblNewLabel_5.setVisible(false);    lblNewLabel_6.setVisible(false);
				btnNewButton_9.setVisible(false);   lblEnterTheName.setVisible(false);
				spinner_1.setVisible(false);	    btnNewButton_10.setVisible(false);
				lblNewLabel_5.setVisible(false);	lblNewLabel_7.setVisible(false);
				lblNewLabel_8.setVisible(false);	lblNewLabel_9.setVisible(false);
				spinner_2.setVisible(false); 		textField_7.setVisible(false);
				btnNewButton_9.setVisible(false);	btnNewButton_11.setVisible(false);
				lblYouWantTo.setVisible(false);		btnNewButton_9.setVisible(false);
				textField_8.setVisible(false);		btnNewButton_12.setVisible(false);
				btnNewButton_14.setVisible(false);  btnNewButton_15.setVisible(false);
			}
		});
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_1.getText().matches("(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[012])\\.(20[12][0-9])"))
					if(	textField_2.getText().matches("([01][0-9]|2[0-4]):([0-5][0-9])"))
				    {
						String date = textField_1.getText();
						String time = textField_2.getText();
						int duration = (int) spinner.getValue();
						Date data = new Date (date, time, duration);			
						String place = textField.getText();
						String discription = textField_4.getText();
						excursion.add(new Excursion(data, place, discription));
						btnNewButton.setVisible(true);     btnNewButton_1.setVisible(true);
						btnNewButton_2.setVisible(true);   btnNewButton_3.setVisible(true);
						btnNewButton_4.setVisible(true);   btnNewButton_5.setVisible(true);
						btnNewButton_6.setVisible(true);   btnNewButton_7.setVisible(true);
						btnNewButton_8.setVisible(false);  btnNewButton_9.setVisible(false);
						lblNewLabel.setVisible(false);     lblNewLabel_1.setVisible(false);
						lblNewLabel_2.setVisible(false);   lblNewLabel_3.setVisible(false);
						lblNewLabel_4.setVisible(false);   textField.setVisible(false);
						textField_1.setVisible(false);	   textField_2.setVisible(false);
						spinner.setVisible(false);	       textField_4.setVisible(false);
					}
					if (!textField_1.getText().matches("(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[012])\\.(20[12][0-9])"))
						textField_1.setText("Error!!!");
					if(!textField_2.getText().matches("([01][0-9]|2[0-4]):([0-5][0-9])"))
						textField_2.setText("Error!!!");				   									
		}
	});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(false);     btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false);   btnNewButton_3.setVisible(false);
				btnNewButton_4.setVisible(false);   btnNewButton_5.setVisible(false);
				btnNewButton_6.setVisible(false);   btnNewButton_7.setVisible(false);
				lblNewLabel_5.setVisible(true);		lblNewLabel_6.setVisible(true);
				btnNewButton_9.setVisible(true);	btnNewButton_8.setVisible(false);	
				spinner_1.setVisible(true);		 btnNewButton_10.setVisible(true);
				meth.getPlaces(textArea,excursion);

			}
		});
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(true);     btnNewButton_1.setVisible(true);
				btnNewButton_2.setVisible(true);   btnNewButton_3.setVisible(true);
				btnNewButton_4.setVisible(true);   btnNewButton_5.setVisible(true);
				btnNewButton_6.setVisible(true);   btnNewButton_7.setVisible(true);
				lblNewLabel_5.setVisible(false);   lblNewLabel_6.setVisible(false);
				btnNewButton_9.setVisible(false);  btnNewButton_8.setVisible(true);	
				spinner_1.setVisible(false);	   btnNewButton_10.setVisible(false);
				int i = (int) spinner_1.getValue();
				int index = i-1;		            
				meth.remove(index,excursion);
				spinner_1.setValue(1);
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_7.setText(".xml");
				btnNewButton.setVisible(false);     btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false);   btnNewButton_3.setVisible(false);
				btnNewButton_4.setVisible(false);   btnNewButton_5.setVisible(false);
				btnNewButton_6.setVisible(false);   btnNewButton_7.setVisible(false);
				lblNewLabel_5.setVisible(true);		lblNewLabel_7.setVisible(true);
				lblNewLabel_8.setVisible(true);		lblNewLabel_9.setVisible(true);
				spinner_2.setVisible(true); 		textField_7.setVisible(true);
				btnNewButton_9.setVisible(true);	btnNewButton_11.setVisible(true);
				meth.getPlaces(textArea,excursion);
			}
		});
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(false);     btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false);   btnNewButton_3.setVisible(false);
				btnNewButton_4.setVisible(false);   btnNewButton_5.setVisible(false);
				btnNewButton_6.setVisible(false);   btnNewButton_7.setVisible(false);
				lblNewLabel_5.setVisible(true);		lblNewLabel_7.setVisible(true);
				lblNewLabel_8.setVisible(true);		lblNewLabel_9.setVisible(true);
				spinner_2.setVisible(true); 		textField_7.setVisible(true);
				btnNewButton_9.setVisible(true);	btnNewButton_15.setVisible(true);
				meth.getPlaces(textArea,excursion);           textField_7.setText(".txt");
			}
		});
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(true);      btnNewButton_1.setVisible(true);
				btnNewButton_2.setVisible(true);    btnNewButton_3.setVisible(true);
				btnNewButton_4.setVisible(true);    btnNewButton_5.setVisible(true);
				btnNewButton_6.setVisible(true);    btnNewButton_7.setVisible(true);
				lblNewLabel_5.setVisible(false);		lblNewLabel_7.setVisible(false);
				lblNewLabel_8.setVisible(false);		lblNewLabel_9.setVisible(false);
				spinner_2.setVisible(false); 		textField_7.setVisible(false);
				btnNewButton_9.setVisible(false);	btnNewButton_11.setVisible(false);
		        int i = (int) spinner_2.getValue();
				int index = i-1;
				String filename = textField_7.getText();
				meth.WriteXML(filename, index, textArea,excursion);
				textField_7.setText("");
				spinner_2.setValue(1);
			}
		});
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEnterTheName.setVisible(true); 	lblYouWantTo.setVisible(true);
				btnNewButton.setVisible(false);     btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false);   btnNewButton_3.setVisible(false);
				btnNewButton_4.setVisible(false);   btnNewButton_5.setVisible(false);
				btnNewButton_6.setVisible(false);   btnNewButton_7.setVisible(false);
				textField_8.setVisible(true);		btnNewButton_9.setVisible(true);
				btnNewButton_12.setVisible(true);	textField_8.setText(".xml");	
				btnNewButton_8.setVisible(false);
			}
		});
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(true);      btnNewButton_1.setVisible(true);
				btnNewButton_2.setVisible(true);    btnNewButton_3.setVisible(true);
				btnNewButton_4.setVisible(true);    btnNewButton_5.setVisible(true);
				btnNewButton_6.setVisible(true);    btnNewButton_7.setVisible(true);
				textField_8.setVisible(false);		btnNewButton_9.setVisible(false);
				btnNewButton_12.setVisible(false);  lblEnterTheName.setVisible(false);
				lblYouWantTo.setVisible(false);
				String filename = textField_8.getText();
				meth.ReadXML(filename, textArea);
				textField_8.setText("");
			}
		});
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEnterTheName.setVisible(true); 	lblYouWantTo.setVisible(true);
				btnNewButton.setVisible(false);     btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false);   btnNewButton_3.setVisible(false);
				btnNewButton_4.setVisible(false);   btnNewButton_5.setVisible(false);
				btnNewButton_6.setVisible(false);   btnNewButton_7.setVisible(false);
				textField_8.setVisible(true);		btnNewButton_9.setVisible(true);
				btnNewButton_14.setVisible(true);	textField_8.setText(".txt");
				btnNewButton_8.setVisible(false);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				meth.show(textArea,excursion);
			}
		});
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(true);      btnNewButton_1.setVisible(true);
				btnNewButton_2.setVisible(true);    btnNewButton_3.setVisible(true);
				btnNewButton_4.setVisible(true);    btnNewButton_5.setVisible(true);
				btnNewButton_6.setVisible(true);    btnNewButton_7.setVisible(true);
				lblNewLabel_5.setVisible(false);	lblNewLabel_7.setVisible(false);
				lblNewLabel_8.setVisible(false);	lblNewLabel_9.setVisible(false);
				spinner_2.setVisible(false); 		textField_7.setVisible(false);
				btnNewButton_9.setVisible(false);	btnNewButton_15.setVisible(false);
				String fileName = textField_7.getText();
				int i = (int) spinner_2.getValue();
				int index = i-1;
				String filename = textField_7.getText();
				meth.Writefile(filename, index, textArea,excursion);
				textField_7.setText("");
				spinner_2.setValue(1);
			}
		});
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(true);      btnNewButton_1.setVisible(true);
				btnNewButton_2.setVisible(true);    btnNewButton_3.setVisible(true);
				btnNewButton_4.setVisible(true);    btnNewButton_5.setVisible(true);
				btnNewButton_6.setVisible(true);    btnNewButton_7.setVisible(true);
				textField_8.setVisible(false);		btnNewButton_9.setVisible(false);
				btnNewButton_14.setVisible(false);	lblEnterTheName.setVisible(false);
				lblYouWantTo.setVisible(false);
				String fileName = textField_8.getText();
				meth.Readfile(fileName, textArea);
				textField_8.setText("");
			}
		});
		}
	}


