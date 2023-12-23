package Strings;

public class DegangingIP {
    public static void main(String[]args) {
        String s = "1.1.1.1";
        System.out.println(defangIPaddr(s));
    }
    public static String defangIPaddr(String address) {
        address = address.replaceAll("\\.","[.]");
        return address;
    }
}
