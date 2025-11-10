package ex10_for_loop;

public class Lab070_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 50 ; i++) {
            if(i%2 !=0 ){
                continue;
            }
            System.out.println(i);
        }
    }
}
