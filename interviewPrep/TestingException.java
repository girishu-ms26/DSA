package interviewPrep;

public class TestingException {
    public static void main(String[] args) throws InvalidAgeException {
        try {
            System.out.println(isAgeValid(17));
        } catch (InvalidAgeException invalidAgeException) {
            System.out.println(invalidAgeException.getMessage());
        }
    }
    public static boolean isAgeValid(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Invalid Age",500);
        } else {
            return true;
        }
    }
}
