# RunningThreads
1. Write a regular expression that will match a string that starts with a series of 
letters. The letters must be followed by a period. After the period, there must 
be a series of digits. The string “kjisl.22” would match. The string “f4.12b” 
would not. Use the following string to testyour regular expression:
String problem1 = “abcd.135”;
2. Modify the regular expression in problem 1 to use a group, so that we can 
print all the digitsthat occur in a string that contains multiple occurrences of the 
pattern. Write all the code required to accomplish this (create a pattern and 
matcher etc.). Use the following string to testyour code:
String problem2 = “abcd.135uvqz.7tzik.888”;
There are three occurrences of the pattern we looked for in problem 2. When 
you run yourcode, you should see 135, 7, and 888 printed to the console.
3. Let’s suppose we are reading strings that match the patterns we used in 
problem 1 and 2from a file. Tabs are used to separate the matches, with one 
exception. The last match is followed by a newline. Our revised problem 2 
string would look like this:
String problem3 = “abcd.135\tuvqz.7\ttzik.888\n”;
Revise the regular expression accordingly and extract all the numbers, as you did
in problem 2.
4. Instead of printing out the numbers themselves, print out their start and end 
indices. Use thesame string you used for problem 3. Make those indices inclusive. 
For example, the start index printed for 135 should be 5, and the end index 
should be 7. Hint: You will need to look at the documentation for the 
Matcher.start() and Matcher.end() methods. There is more than one version of 
these methods. The documentation is here:
https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html
5. Suppose we have the following string containing points on a graph within 
curly braces.Extract what is in the curly braces.
String problem4 = “{0, 2}, {0, 7}, {1, 3}, {2, 4}”;
6. Write a Java program to remove the specific letters from a string and return the 
new string. Specific letters: "p", "q", or "r".
If the given string does not contain "p", "q", or "r", return “Not found.”
7. Write a Java program to check whether a string contains only a certain set of 
characters (in this case a-z, A-Z and 0-9).
