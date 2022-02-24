
package array;
public class Array1P3 {
    public static void main(String[] args) {
        
        String nama[][] = {
                {"Arya","10001"},
                {"bagas","10002"},
                {"Chintya","10003"},
            };
        for (String[] nama1 : nama) {
            System.out.println("nama: " + nama1[0]);
            System.out.println("nama: " + nama1[1]);
            System.out.println("=============");
        }
    }
}
