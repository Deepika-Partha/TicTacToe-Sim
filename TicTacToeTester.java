import javax.swing.JOptionPane;

public class TicTacToeTester 
{
   public static void main (String [] args)
	{
	   int playCount = 0;
      char player = 'x';
		TicTacToe game = new TicTacToe();
		while (true)
		{
		   System.out.println (game);
			String input = JOptionPane.showInputDialog ("Row for " +
			               player + " (from 0-2 and press Cancel to exit)");
			if (input == null) System.exit(0);
			
			int row = Integer.parseInt (input);
			input = JOptionPane.showInputDialog ("Column for " + player +
		                                        " from 0-2 and press Cancel to exit)") ;
			int column = Integer.parseInt (input);
			game.set (row, column, player);
         
         playCount ++;
         boolean win = false;
           if(playCount >= 5)
           {
                        
             win = game.getWinner();
             if (win)
             {
               
                
                break;
             }
             
             else if ((playCount >= 9) )
             {
               System.out.println("");
                System.out.println (game);
               System.out.println("Tie game!");
               break;
             }
                        
           }

			if (player == 'x')
			  player = 'o';
			else
			  player = 'x';
           
           
		} // while
      
      
	}  // main
} // TicTacToeTester