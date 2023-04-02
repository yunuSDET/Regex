package package1;

public class Ex2 {
    public static void main(String[] args) {
 //2- Check if "https://www.example.com" is a valid URL.
  //Yes, it is a valid URL.

        String url="https://www.example.com";
        String regex="https?://www\\.\\w+\\.[a-zA-Z]+";

        if(url.matches(regex)){
            System.out.println(url+" is a valid URL");
        }else{
            System.out.println(url+" is not a valid URL");
        }

    }
}
