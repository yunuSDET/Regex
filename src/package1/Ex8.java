package package1;

public class Ex8 {

    public static void main(String[] args) {
//8- Check if "192.168.1.1" is a valid IP address format.
//Yes, it is a valid IP address format.

        String ipAdress="192.168.1.1";
        String regex="([0-9]|[1-9][0-9]|1[1-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[1-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[1-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[1-9][0-9]|2[0-4][0-9]|25[0-5])";
        if(ipAdress.matches(regex)){
            System.out.println(ipAdress+" is a valid ip address");
        }else{
            System.out.println(ipAdress+" is not a valid ip address");
        }



    }
}
