
package array;
import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    String []nama ={"dino","dina","dea","desi"};
       
        int pilihan = 0 ; 
        System.out.println("Pilihan Anda ?");
        pilihan = input.nextInt();
        
        if (pilihan<=4){
            System.out.println(nama[pilihan]);
             
        } else {
            System.out.println("data tidak ditemukan");
        }
    
}
}