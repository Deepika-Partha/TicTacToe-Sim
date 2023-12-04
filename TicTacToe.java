public class TicTacToe
   {
      private char [] [] board;
      private static final int ROWS = 3, COLUMNS = 3;
      
      public TicTacToe()
      {
         board = new char [ROWS][COLUMNS];
         for (int i = 0; i < ROWS; i++)
         {
            for (int j = 0; j < COLUMNS; j++)
               board[i][j] = ' ';
         }
      }  // default constructor
   
   // post-condition: set a field in the board. The field must be unoccupied
      public void set (int i, int j, char player)
      {
         if (board [i][j] != ' ')
            throw new IllegalArgumentException ("Position occupied");
         board[i][j] = player;
      }  // set
      
       public boolean getWinner()
       {
       
       boolean win = false;
       if (checkWinner('x') == 'x')
       {
          System.out.println("");
          System.out.println(toString());
          System.out.println("‘x’ is the winner!");
          System.out.println("Thank you for playing.");
          win = true;
          
       }
       else if   (checkWinner('o') == 'o')
       {

         System.out.println("");
          System.out.println(toString());

         System.out.println("‘o’ is the winner!");
         System.out.println("Thank you for playing.");
         win = true;


       }
       
       return win;
      }
      public char checkWinner(char player)
      {
       //major diagonal
       if((get(0,0) == player)&&(get(1,1) == player)&&(get(2,2) == player))
       {
         return player;
       } 
       //minor diagonal
       else if((get(0,2) == player)&&(get(1,1) == player)&&(get(2,0) == player))
       {
         return player;
       }
       //first column
       else if((get(0,0) == player)&&(get(1,0) == player)&&(get(2,0) == player))
       {
         return player;
       }
       //second column
       else if((get(0,1) == player)&&(get(1,1) == player)&&(get(2,1) == player))
       {
         return player;
       }
       //third column
       else if((get(0,2) == player)&&(get(1,2) == player)&&(get(2,2) == player))
       {
         return player;
       }
       //first row
       else if((get(0,0) == player)&&(get(0,1) == player)&&(get(0,2) == player))
       {
         return player;
       }
       //second row
       else if((get(1,0) == player)&&(get(1,1) == player)&&(get(1,2) == player))
       {
         return player;
       }
       //third row
       else if((get(2,0) == player)&&(get(2,1) == player)&&(get(2,2) == player))
       {
         return player;
       }
       
       else
       {
         return ' ';
       } 
          
          
      
      }
      
      public char get (int i, int j)
      {
         
         return board[i][j];
      }
   
       public String toString()
      {
         String r = "";
         for (int i = 0; i < ROWS; i++)
         {
            r = r + "|";
            for (int j = 0; j < COLUMNS; j++)
            {
               r = r + board[i][j] + "|";
            }
            r = r + "\n";
         }
         return r;
      } // toString
      
}

/*

OUTPUT:
  ----jGRASP exec: java TicTacToeTester
 | | | |
 | | | |
 | | | |
 
 |x| | |
 | | | |
 | | | |
 
 |x| | |
 |o| | |
 | | | |
 
 |x| | |
 |o|x| |
 | | | |
 
 |x| | |
 |o|x| |
 | |o| |
 
 
 |x| | |
 |o|x| |
 | |o|x|
 
 ‘x’ is the winner!
 Thank you for playing.
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java TicTacToeTester
 | | | |
 | | | |
 | | | |
 
 |x| | |
 | | | |
 | | | |
 
 |x| | |
 |o| | |
 | | | |
 
 |x|x| |
 |o| | |
 | | | |
 
 |x|x|o|
 |o| | |
 | | | |
 
 |x|x|o|
 |o|x| |
 | | | |
 
 |x|x|o|
 |o|x| |
 | | |o|
 
 |x|x|o|
 |o|x|x|
 | | |o|
 
 |x|x|o|
 |o|x|x|
 | |o|o|
 
 
 |x|x|o|
 |o|x|x|
 |x|o|o|
 
 Tie game!
 
 */