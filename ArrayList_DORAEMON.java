package array;
import java.util.ArrayList;
public class ArrayList_DORAEMON {
    public static void main(String[] args) {
        
        ArrayList kantongAjaib = new ArrayList();
        
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);
        
        kantongAjaib.remove("tikus");
        
        System.out.println(kantongAjaib);
        
        System.out.println("Kantong Ajaib berisi "+ kantongAjaib.size() +" item");
    }    
}