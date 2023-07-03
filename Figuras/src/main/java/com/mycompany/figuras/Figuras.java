
package com.mycompany.figuras;


import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics; 

public class Figuras extends Applet {
 
    
  
    public void Figuras (Graphics R) {
       

	R.setColor(Color.blue );
	R.fillRect(50 , 150, 100, 100);
	
	R.setColor(Color.white);
	R.fillRect(75, 120, 50,20 );
	
	R.setColor(Color.blue);
    R.fillOval(50,150,100,100); 
    	
    R.setColor(Color.blue);
    R.fillOval(50,240,50,50); 
    
    R.setColor(Color.blue);
    R.fillOval(100,240,50,50);   

    R.setColor(Color.blue );
    R.fillOval(60, 80, 25, 25);

    R.setColor(Color.blue );
    R.fillOval(110, 80, 25, 25);
   
    R.setColor(Color.blue );
    R.fillOval(10, 180, 40, 40);
   
    R.setColor(Color.blue );
    R.fillOval(150, 180, 40, 40);
   
    {
	
}

}

}
