package Int;

public class ReplaceZerosWithOne {
    public static void main(String[]args){
        int a = 706120678;
        System.out.println(replace(a));
    }
    public static int replace(int a){
        String s = Integer.toString(a);
        s = s.replace('0','1');
        return Integer.parseInt(s);
    }
}
