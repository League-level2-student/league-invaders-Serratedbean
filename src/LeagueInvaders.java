import javax.swing.*;

public class LeagueInvaders {

	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;



	
	public LeagueInvaders()
	{
		setup();
		
		
	}
	
	public void setup()
	{
		GamePanel game = new GamePanel();
		JFrame frame = new JFrame();
		//JPanel panel = new JPanel();
		frame.setSize(WIDTH, HEIGHT);
		//panel.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		//frame.add(panel);
		frame.add(game);
	}
	
	public static void main(String[] args) {
		
		LeagueInvaders bugs = new LeagueInvaders();
		
		


	}

}
