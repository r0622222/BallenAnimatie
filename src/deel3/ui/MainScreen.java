package deel3.ui;

import java.awt.*;
import javax.swing.*;
import deel3.domain.BallenVeld;

public class MainScreen extends JFrame{
   public MainScreen() {
	    //titel en afmeting van scherm (full screen)
	    this.setTitle("Spelen met ballen - PROJECTWEEK 2");
	    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	    this.setSize(dim.width, dim.height - 40); // minus task bar
	    this.setResizable(false);  
	    
	    BallenVeld ballenVeld = new BallenVeld();
	    
	    //mainscreen bevat 2 panels
	    BesturingsPanel bp = new BesturingsPanel(ballenVeld);
	    AnimatiePanel ap = new AnimatiePanel(ballenVeld);
	    this.setLayout(new BorderLayout());
	 	this.add(ap, BorderLayout.CENTER);
	 	this.add(bp, BorderLayout.WEST);
	 	
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	    //het ballenveld heeft dezelfde afmeting als animatiepanel
	    ballenVeld.setMaxX(ap.getSize().width);
	    ballenVeld.setMaxY(ap.getSize().height);	     
	}
}

