package package1;

public class Ex9 {

    public static void main(String[] args) {
//9- Check if the following text is in a valid credit card number
// format: "1234 5678 9012 3456"

        String creditCardNumber="1234 5678 9012 3456";
        String regex="[0-9]{4} [0-9]{4} [0-9]{4} [0-9]{4}";

        if(creditCardNumber.matches(regex)){
            System.out.println(creditCardNumber+" is a valid number");
        }else{
            System.out.println(creditCardNumber+ " is not a valid number");
        }




    }
}
