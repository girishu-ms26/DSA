package Interview;

public class CreditCardValidation {

    public static void main(String[] args) {

        System.out.println(validateCreditCard("3117 6100 0000 0000     "));
    }

    private static boolean validateCreditCard(String creditCardNumber) {
        if (creditCardNumber == null || creditCardNumber.isBlank()) {
            System.out.println("Empty input");
            return false;
        }

        final String withoutSpaces = creditCardNumber.replaceAll(" ", "");

        if (!withoutSpaces.matches("\\d+")) {
            System.out.println("Contains characters other than digits");
            return false;
        }

        boolean valid = false;
        String cardType = getCardType(withoutSpaces);

        switch (cardType) {
            case "VISA" -> {
                System.out.println("VISA");
                return true;
            }

            case "MASTERCARD" -> {
                System.out.println("MASTERCARD");
                return true;
            }

            default -> {
                System.out.println("UNKNOWN CREDIT CARD NUMBER");
                valid = false;
            }
        }
        return valid;
    }


    public static String getCardType(String creditCardNumber) {
        // Visa: Starts with 4, length 13 or 16
        if (creditCardNumber.length() == 13 || creditCardNumber.length() == 16) {
            if (creditCardNumber.startsWith("4")) {
                return "VISA";
            }
        }

        if (creditCardNumber.length() == 16) {
            int firstTwo = Integer.parseInt(creditCardNumber.substring(0, 2));
            if (firstTwo >= 51 && firstTwo <= 55) {
                return "MASTERCARD";
            } else if (creditCardNumber.startsWith("2")) {
                int firstFour = Integer.parseInt(creditCardNumber.substring(0, 4));
                if (firstFour >= 2221 && firstFour <= 2720) {
                    return "MASTERCARD";
                }
            }
        }

        return "UNKNNOWN";
    }


}
