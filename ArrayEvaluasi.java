package array;
public class ArrayEvaluasi {
    public static void main(String[] args) {
        String nama[][] = {
                {"01","Alya","18765"},
                {"02","Aladin","11876"},
                {"03","Nala","17622"},
                {"04","Wawan","29988"},
                {"05","Setya","98765"}
            };
        for (String[] nama1 : nama) {
            System.out.println("No. :" + nama1[0]);
            System.out.println("Nama: " + nama1[1]);
            System.out.println("No.ID: " + nama1[2]);
            System.out.println("=============");
        }
    }
}