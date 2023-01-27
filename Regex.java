package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Regex {
        public static void main(String[] args) {


            Pattern pattrnInptStrToBeMatched = Pattern.compile("[0-9]+");


            String problem2 = "abcd.135uvqz.7tzik.888";


            Matcher stringsTestForMatch = pattrnInptStrToBeMatched.matcher(problem2);


            while(stringsTestForMatch.find())
                System.out.println(stringsTestForMatch.group());
        }
    }

