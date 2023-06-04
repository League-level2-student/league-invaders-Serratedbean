import java.awt.*;

import javax.swing.*;

public class GamePanel extends JPanel{

    final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;

    
    public void updateMenuState() 
    {  

    	
    }
    
    
    
    
    public void updateGameState() 
    {  

    	
    }
    
    
    
    
    public void updateEndState()  
    {  

    	
    }
    
    
    

	@Override
	public void paintComponent(Graphics g){
		
		g.fillRect(10, 10, 100, 100);
		
		
	}
}

