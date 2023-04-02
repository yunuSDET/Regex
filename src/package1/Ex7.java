package package1;

public class Ex7 {

    public static void main(String[] args) {
//7- Check if "12345" is a valid postal code format.
//Yes, it is a valid postal code format.

        String postalCode="12345";
        String regex="[0-9]{5}";
        if(postalCode.matches(regex)){
            System.out.println(postalCode+" is a valid postal code.");
        }else {
            System.out.println(postalCode+" is not a valid postal code.");
        }


    }
}
