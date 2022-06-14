package lab_06;

import java.util.Scanner;

//Check http OR https; domain name, .com OR .net
public class Lab_64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("URL example: https://google.com");
        System.out.print("Please input your url: ");
        String inputURL = sc.next();
        System.out.println("Check http/https: " + checkMethod(inputURL));
        System.out.println("Check domain name: " + checkDomainName(inputURL));
        System.out.println("Check .com/.net : " + checkDotComOrDotNet(inputURL));
    }

    public static boolean checkMethod(String urlTest) {
        String[] urlTestSplit = urlTest.split("://");
        String methodTest = urlTestSplit[0];
        if (methodTest.equals("http")) {
            return true;
        } else if (methodTest.equals("https")) {
            return true;
        } else
            return false;
    }

    public static boolean checkDomainName(String url) {
        String[] urlSplit = url.split("://");
        String domainName = urlSplit[1].substring(0, 4);
        if (domainName.equals("google"))
            return true;
        else
            return false;
    }

    public static boolean checkDotComOrDotNet(String url) {
        String inforCorrect = url.substring(url.length() - 4, url.length());
        if (inforCorrect.equals(".com"))
            return true;
        else if (inforCorrect.equals(".net"))
            return true;
        else
            return false;
    }
}
