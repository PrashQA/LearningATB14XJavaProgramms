package ex15_String_Builder_Buffer;

public class Lab099_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramod");

        stringBuffer.append("Dutta");
        System.out.println(stringBuffer); // PramodDutta


        String s1 = "PRamod";
        s1 = s1+ "Dutta";
        System.out.println(s1);


    }
}
