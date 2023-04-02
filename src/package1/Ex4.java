package package1;

public class Ex4 {

    public static void main(String[] args) {
        //4- Check if "01/01/2022" is a valid date format.
        //Yes, it is a valid date format.

       String date="01/01/2022";
       String regex="(0[0-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([0-9]{4})";
       if(date.matches(regex)){
           System.out.println(date+ " is a valid date format");
       }else{
           System.out.println(date+ " is not a valid date format.");
       }





    }
}
