package sample;

import java.util.regex.*;


public class Main {

    public static void main(String[] args) {


        Pattern pattrnInptStrToBeMatched = Pattern.compile("^[a-zA-Z_.-]+[0-9]+$");


        String problem1 = "abcd.135";


        Matcher stringsTestForMatch = pattrnInptStrToBeMatched.matcher(problem1);
        Matcher stringsTestForMatch2 = pattrnInptStrToBeMatched.matcher("f4.12b");
        Matcher stringsTestForMatch3 = pattrnInptStrToBeMatched.matcher("kjisl.22");


        System.out.println(stringsTestForMatch.matches());
        System.out.println(stringsTestForMatch2.matches());
        System.out.println(stringsTestForMatch3.matches());
    }
}
