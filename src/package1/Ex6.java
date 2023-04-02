package package1;

public class Ex6 {

    public static void main(String[] args) {
//6- Check if "$100.00" is a valid currency format.
//Yes, it is a valid currency format.


        String price="$100.00";
        String regex="\\$[0-9]+\\.[0-9]{2}";

        if(price.matches(regex)){
            System.out.println(price+" is a valid currency format.");
        }else{
            System.out.println(price+ " is not a valid currency format.");
        }


    }
}
