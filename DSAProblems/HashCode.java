package DSAProblems;

public class HashCode { private String First_name;
    private String Last_name;

    public HashCode(String First_name, String Last_name) {
        this.First_name = First_name;
        this.Last_name = Last_name;
    }

    @Override
    public int hashCode() {
        int result = (First_name + Last_name).hashCode();
        return result;
    }

    public static void main(String[] args) {
        HashCode person1 = new HashCode("Kanishk", "Singla");

        System.out.println(person1.hashCode());
    }

}
