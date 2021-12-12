package sample;

public class reverse
{
    String reverseString(String input)
    {
        String word = input;
        char[] letters = new char[word.length()];
        int charindex = 0;
        for(int i = letters.length - 1; i>=0; i--)
        {
            letters[charindex] = word.charAt(i);
            charindex++;
        }
        StringBuffer sb = new StringBuffer();
        sb.append(letters);
        String reversedString = sb.toString();
        return reversedString;
    }
}
