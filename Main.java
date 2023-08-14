/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	int board1[][]=new int[5][5];
    int board2[][]=new int[5][5];
    for(int row=0;row<board1.length;row++){
        for(int col=0;col<board1[row].length;col++){
            board1[row][col]=-1;
            board2[row][col]=-1;
        }
    }

	// Placement of boats on board 1

	
	for(int a=0;a<3;a++){
	    int a1=(int)(Math.random()*(4-0)+0);
	    int a2=(int)(Math.random()*(4-0)+0);
	    
	    if(board1[a1][a2]!=1){
	        board1[a1][a2]=1;
	    }
	}
	
	// Placement of boats on board 2
	
	for(int a=0;a<3;a++){
	    int a1=(int)(Math.random()*(4-0)+0);
	    int a2=(int)(Math.random()*(4-0)+0);
	    
	    if(board2[a1][a2]!=1){
	        board2[a1][a2]=1;
	    }
	}

    int turn=1;
    
    while(turn!=3){
        Scanner sc=new Scanner(System.in);
        if(turn==1){
        
        for(int row=0;row<board1.length;row++){
        for(int col=0;col<board1[row].length;col++){
           if(board2[row][col]==-1 || board2[row][col]==1){
               System.out.print(" ~ ");
           }
           else if(board2[row][col]==0){
               System.out.print(" * ");
           }
           else if(board2[row][col]==11){
               System.out.print(" X ");
           }
        }
        System.out.println();
    }
        System.out.println("Player 1:  \nEnter first coordinate:  ");
        int guess1=sc.nextInt();
        System.out.println("Player 1:  \nEnter second coordinate:  ");
        int guess2=sc.nextInt();
        
        if(board2[guess1-1][guess2-1]==-1){
           board2[guess1-1][guess2-1]=0 ;
        }
        else if(board2[guess1-1][guess2-1]==1){
            board2[guess1-1][guess2-1]=11;
        }
        else if(board2[guess1-1][guess2-1]==0){
            board2[guess1-1][guess2-1]=0;
        }
        else if(board2[guess1-1][guess2-1]==11){
            board2[guess1-1][guess2-1]=11;
        }
        
        for(int row=0;row<board2.length;row++){
        for(int col=0;col<board2[row].length;col++){
           if(board2[row][col]==1){
            turn=2;
           }
           
        }
    }
    
    if(turn==1){
        System.out.println("Player 1 has WON !");
        turn=3;
    }    
        
            
    }
    
    if(turn==2){
        
        for(int row=0;row<board1.length;row++){
        for(int col=0;col<board1[row].length;col++){
           if(board1[row][col]==-1 || board1[row][col]==1){
               System.out.print(" ~ ");
           }
           else if(board1[row][col]==0){
               System.out.print(" * ");
           }
           else if(board1[row][col]==11){
               System.out.print(" X ");
           }
        }
        System.out.println();
    }
        System.out.println("Player 2:  \nEnter first coordinate:  ");
        int guess1=sc.nextInt();
        System.out.println("Player 2:  \nEnter second coordinate:  ");
        int guess2=sc.nextInt();
        
        if(board1[guess1-1][guess2-1]==-1){
           board1[guess1-1][guess2-1]=0 ;
        }
        else if(board1[guess1-1][guess2-1]==1){
            board1[guess1-1][guess2-1]=11;
        }
        else if(board1[guess1-1][guess2-1]==0){
            board1[guess1-1][guess2-1]=0;
        }
        else if(board1[guess1-1][guess2-1]==11){
            board1[guess1-1][guess2-1]=11;
        }
        
        for(int row=0;row<board1.length;row++){
        for(int col=0;col<board1[row].length;col++){
           if(board1[row][col]==1){
            turn=1;
           }
           
        }
    }
    
    if(turn==2){
        System.out.println("Player 2 has WON !");
        turn=3;
    }    
        
            
    }    

        
    }
	
    	
	
	}
}
