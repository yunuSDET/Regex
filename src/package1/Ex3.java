package package1;

public class Ex3 {

    public static void main(String[] args) {
//3- Check if "+90 555 555 55 55" is a valid phone number.
//Yes, it is a valid phone number.

        String phoneNumber="+90 555 555 55 55";
        String regex="\\+[0-9]{2}\\s[0-9]{3}\\s[0-9]{3}\\s[0-9]{2}\\s[0-9]{2}";
        if(phoneNumber.matches(regex)){
            System.out.println(phoneNumber+ " is a valid phone number.");
        }else{
            System.out.println(phoneNumber+" is not a valid phone number.");
        }



    }
}
