
import java.util.Scanner;

class Tiktok{
    public static void main(String args[]){
        char grid[][] = new char[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter player 1 name");
        String name1 = sc.nextLine();

        System.out.println("Enter player 2 name");
        String name2 = sc.nextLine();

        Players play1 = new Players();
        Players play2 = new Players();

        boolean win = false;
        boolean flip = true;
        int count = 0;

        while(!win){
            if(flip){
                win = play1.turn(play1, name1, grid, 'X', sc, count);
                if(win){
                    System.out.print(name1+" wins");
                    break;
                }
            }else{
                win = play2.turn(play2, name2, grid, 'O', sc, count);
                if(win){
                    System.out.print(name2+" wins");
                    break;
                } 
            }
            flip = !flip;
            count++;
        }
    }
}