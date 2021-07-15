import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /*private static boolean isEmailValid (String email) {
        boolean isValid = false;
        String expression ="^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }
    private boolean isPhoneNumberValid(String phoneNumber) {
        boolean isValid = false;
        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }*/
    public static void main(String [] args) {

        boolean result = AddressBook.isEmailValid("ruthxxx@gmail.com");
        System.out.println(result);
        boolean output = AddressBook.isPhoneNumberValid("(800)-321-3331");
        System.out.println(output);

        AddressBook address1 = new AddressBook(" Ruth "," 3235 Ony water Drive ", " Richmond "," Virgina "," ruthxxx@gmail.com "," (800)321-1331) ", " 23233 ");










    }
}
