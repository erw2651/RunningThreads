package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tab {

    public static void main(String[] args) {

        Pattern patternInput = Pattern.compile("^[a-zA-Z_.-]+[0-9]+$");
        Pattern pattrnInptStrToBeMatched = Pattern.compile("[0-9]+");


        String problem1 = "abcd.135";
        String problem2 = "abcd.135uvqz.7tzik.888";
        String problem3 = "abcd.135\tuvqz.7\ttzik.888\n";

        Matcher Match1 = patternInput.matcher(problem1);
        Matcher Match2 = patternInput.matcher("f4.12b");
        Matcher Match3 = patternInput.matcher("kjisl.22");
        Matcher MatchProblem2 = pattrnInptStrToBeMatched.matcher(problem2);

        Matcher MatchProblem3 = pattrnInptStrToBeMatched.matcher(problem3);


        System.out.println(Match1.matches());
        System.out.println(Match2.matches());
        System.out.println(Match3.matches());

        while (MatchProblem2.find()) {
            System.out.println(MatchProblem2.group());
        }


        while (MatchProblem3.find()) {

            System.out.println("start index: "+MatchProblem3.start()+" end index: "+(MatchProblem3.end()-1));
        }
    }
}