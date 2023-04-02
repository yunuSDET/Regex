package package1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

    public static void main(String[] args) {
//1- Check if "ali@example.com" is a valid email address.
//Yes, it is a valid email address.

        String email="al@example.com";
        String regex="\\w+@\\w+\\.[a-zA-Z]+";
        if(email.matches(regex)){
            System.out.println(email+" is a valid email address.");
        }else{
            System.out.println(email+" is not a valid email address.");
        }


    }
}
