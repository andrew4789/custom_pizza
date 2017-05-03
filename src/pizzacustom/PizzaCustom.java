package pizzacustom;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PizzaCustom extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	// field, instance, class variables
	
	  JPanel sizePanel = new JPanel();
	  ButtonGroup sizeButtonGroup = new ButtonGroup();
	  JRadioButton smallRadioButton = new JRadioButton();
	  JRadioButton mediumRadioButton = new JRadioButton();
	  JRadioButton largeRadioButton = new JRadioButton();
	  
	  JPanel crustPanel = new JPanel();
	  ButtonGroup crustButtonGroup = new ButtonGroup();
	  JRadioButton thinRadioButton = new JRadioButton();
	  JRadioButton thickRadioButton = new JRadioButton();
	  
	  JPanel toppingsPanel = new JPanel();
	  JCheckBox cheeseCheckBox = new JCheckBox();
	  JCheckBox mushroomsCheckBox = new JCheckBox();
	  JCheckBox olivesCheckBox = new JCheckBox();
	  JCheckBox onionsCheckBox = new JCheckBox();
	  JCheckBox peppersCheckBox = new JCheckBox();
	  JCheckBox tomatoesCheckBox = new JCheckBox();
	  
	  ButtonGroup whereButtonGroup = new ButtonGroup();
	  JRadioButton eatInRadioButton = new JRadioButton();
	  JRadioButton takeOutRadioButton = new JRadioButton();
	  
	  JButton buildButton = new JButton();
	  JButton exitButton = new JButton();
	  
	  String pizzaSize;
	  String pizzaCrust;
	  String pizzaWhere;
	  JCheckBox[] topping = new JCheckBox[6];
	  
	  // Prices
	  
	  double smallPrice = 5;
	  double mediumPrice = 6;
	  double largePrice = 7;
	  double toppingPrice = 0.5;
	  double crustPrice = 1;
	  double totalPrice = 0;
	  
	  String sizeSelected;
	  String typeSelected;

	// constructor
	  
	  public PizzaCustom()
	  {
	    setTitle("Build yo pizza dawg");
	    setResizable(false);
	    addWindowListener(new WindowAdapter()
	    {
	      public void windowClosing(WindowEvent e)
	      {
	        exitForm(e);
	      }
	    });
	    
	    getContentPane().setLayout(new GridBagLayout());
	    GridBagConstraints gridConstraints;
	    
	    sizePanel.setLayout(new GridBagLayout());
	    sizePanel.setBorder(BorderFactory.createTitledBorder("Size"));
	    
	    smallRadioButton.setText("Small" + " - " + smallPrice + "$");
	    smallRadioButton.setSelected(true);
	    sizeButtonGroup.add(smallRadioButton);
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 0;
	    gridConstraints.gridy = 0;

	    gridConstraints.anchor = GridBagConstraints.WEST;
	    sizePanel.add(smallRadioButton, gridConstraints);
	    smallRadioButton.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	sizeSelected = "Small";
	        sizeRadioButtonActionPerformed(e);
	      }
	    });
	    
	    mediumRadioButton.setText("Medium" + " - " + mediumPrice + "$");
	    sizeButtonGroup.add(mediumRadioButton);
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 0;
	    gridConstraints.gridy = 1;
	    
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    sizePanel.add(mediumRadioButton, gridConstraints);
	    mediumRadioButton.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	 sizeSelected = "Medium";
	        sizeRadioButtonActionPerformed(e);
	      }
	    });
	    
	    largeRadioButton.setText("Large" + " - " + largePrice + "$");
	    sizeButtonGroup.add(largeRadioButton);
	    gridConstraints = new GridBagConstraints(); // erases the old constraints
	    gridConstraints.gridx = 0;
	    gridConstraints.gridy = 2;
	    
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    sizePanel.add(largeRadioButton, gridConstraints);
	    largeRadioButton.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	sizeSelected = "Large";
	        sizeRadioButtonActionPerformed(e);
	      }
	    });
	    
	    gridConstraints = new GridBagConstraints(); // erase the old ones
	    gridConstraints.gridx = 0;
	    gridConstraints.gridy = 0;
	    getContentPane().add(sizePanel, gridConstraints);
	    
	    // end of size panel
	    
	    crustPanel.setLayout(new GridBagLayout());
	    crustPanel.setBorder(BorderFactory.createTitledBorder("Crust"));
	    
	    thinRadioButton.setText("Thin Crust");
	    thinRadioButton.setSelected(true);
	    crustButtonGroup.add(thinRadioButton);
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 0;
	    gridConstraints.gridy = 0;
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    crustPanel.add(thinRadioButton, gridConstraints);
	    thinRadioButton.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        crustRadioButtonActionPerformed(e);
	      }
	    });
	    
	    thickRadioButton.setText("Thick Crust - " + crustPrice + "$");
	    crustButtonGroup.add(thickRadioButton);
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 0;
	    gridConstraints.gridy = 1;
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    crustPanel.add(thickRadioButton, gridConstraints);
	    thickRadioButton.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	 typeSelected = "thick";
	        crustRadioButtonActionPerformed(e);
	      }
	    });
	    
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 0;
	    gridConstraints.gridy = 1;
	    getContentPane().add(crustPanel, gridConstraints);
	    
	    // end of the crust panel
	    
	    toppingsPanel.setLayout(new GridBagLayout());
	    toppingsPanel.setBorder(BorderFactory.createTitledBorder("Toppings - " + toppingPrice + " $ each"));
	    
	    cheeseCheckBox.setText("xtra Cheese");
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 0;
	    gridConstraints.gridy = 0;
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    toppingsPanel.add(cheeseCheckBox, gridConstraints);
	    
	    mushroomsCheckBox.setText("Mushr00ms");
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 0;
	    gridConstraints.gridy = 1;
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    toppingsPanel.add(mushroomsCheckBox, gridConstraints);
	    
	    olivesCheckBox.setText("0lives");
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 0;
	    gridConstraints.gridy = 2;
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    toppingsPanel.add(olivesCheckBox, gridConstraints);
	    
	    onionsCheckBox.setText("Onions");
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 1;
	    gridConstraints.gridy = 0;
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    toppingsPanel.add(onionsCheckBox, gridConstraints);
	    
	    peppersCheckBox.setText("green Peppers");
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 1;
	    gridConstraints.gridy = 1;
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    toppingsPanel.add(peppersCheckBox, gridConstraints);
	    
	    tomatoesCheckBox.setText("Tomatoes");
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 1;
	    gridConstraints.gridy = 2;
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    toppingsPanel.add(tomatoesCheckBox, gridConstraints);
	    
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 1;
	    gridConstraints.gridy = 0;
	    gridConstraints.gridwidth = 2;
	    getContentPane().add(toppingsPanel, gridConstraints);
	    
	    eatInRadioButton.setText("Eet in");
	    eatInRadioButton.setSelected(true);
	    whereButtonGroup.add(eatInRadioButton);
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 1;
	    gridConstraints.gridy = 1;
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    getContentPane().add(eatInRadioButton, gridConstraints);
	    eatInRadioButton.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        whereRadioButtonActionPerformed(e);
	      }
	    });
	    
	    takeOutRadioButton.setText("Take 0ut");
	    whereButtonGroup.add(takeOutRadioButton);
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 2;
	    gridConstraints.gridy = 1;
	    gridConstraints.anchor = GridBagConstraints.WEST;
	    getContentPane().add(takeOutRadioButton, gridConstraints);
	    takeOutRadioButton.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        whereRadioButtonActionPerformed(e);
	      }
	    });
	    
	    buildButton.setText("Build the Pizza");
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 1;
	    gridConstraints.gridy = 2;
	    getContentPane().add(buildButton, gridConstraints);
	    buildButton.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		buildButtonActionPerformed(e);
	    	}
	    });
	    
	    exitButton.setText("exit");
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 2;
	    gridConstraints.gridy = 2;
	    getContentPane().add(exitButton, gridConstraints);
	    exitButton.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		exitButtonActionPerformed(e);
	    	}
	    });
	    
	    
	    // end of panels and components, finish the JFrame
	    setSize(1920
	    		,1180);
	    //pack();
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds((int) (0.5 * (screenSize.width - getWidth())), 
	    		(int) (0.5 * (screenSize.height - getHeight())), 
	    		getWidth(), getHeight());
	    
	    
	    pizzaSize = smallRadioButton.getText();
	    pizzaCrust = thinRadioButton.getText();
	    pizzaWhere = eatInRadioButton.getText();
	    
	    topping[0] = cheeseCheckBox;
	    topping[1] = mushroomsCheckBox;
	    topping[2] = olivesCheckBox;
	    topping[3] = onionsCheckBox;
	    topping[4] = peppersCheckBox;
	    topping[5] = tomatoesCheckBox;
	    
	    
	  } // end of constructor
	  
	  public void buildButtonActionPerformed(ActionEvent e){
		  
		  
		  String message;
		  message = pizzaWhere + "\n";
		  message += pizzaSize + "\n";
		  message += pizzaCrust + "\n";
		  for (int i = 0; i < 6; i++){
			  if (topping[i].isSelected()){
				  totalPrice += 0.5;
				  message += topping[i].getText() + "\n";
			  }
		  }
		  
		  if (sizeSelected == "Small"){
			  totalPrice += 5.0;
		  }else if(sizeSelected == "Medium"){
			  totalPrice += 6.0;
		  }else{
			  totalPrice += 7.0;
		  }
		  
		  if (typeSelected == "thick"){
			  totalPrice += 1.0;
		  }
		  
		  message += "Total Price " + totalPrice + "\n";
		  
		  
		  JOptionPane.showConfirmDialog(null, message, "Your Pizza",
				  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
		  
		  totalPrice = 0.0;
		  
	  }
	  
	  public void exitButtonActionPerformed(ActionEvent e){
		  System.exit(0);
	  }

	// methods
	  
	  private void whereRadioButtonActionPerformed(ActionEvent e){
		  

		  pizzaWhere = e.getActionCommand();
	  }
	  
	  private void crustRadioButtonActionPerformed(ActionEvent e){
		 
		  pizzaCrust = e.getActionCommand();
		  
	  }
	  
	  private void sizeRadioButtonActionPerformed(ActionEvent e){
		 
		  pizzaSize = e.getActionCommand();
		  
	  }
	  
	  private void exitForm(WindowEvent e){
		  // ask "are you really sure?"
		  // ask "do you want to save your work before exiting?"
		  System.exit(0);
	  }

	// by common convention main goes last
	public static void main(String args[]) {

		new PizzaCustom().setVisible(true);
	}

} // end of class