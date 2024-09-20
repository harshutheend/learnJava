import java.util.Scanner;
public class pattern {
    public static void main(String args[]){
        int num=5 ;
        for (int i =1 ; i<=num  ; i++){
            for(int s=num; s>0 ; s-- ){
                System.out.print(" "); 
            }
            for (int j = 1; j<=2*i+1 ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    
}
