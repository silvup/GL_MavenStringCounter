public class StringLetterCounter
{
    private int[] letters;
    private StringBuilder builder;
    public String CountLetters(String arg)
    {
        letters = new int[26];
        // assuming that we only use english alphabet
        for(int i = 0; i < arg.length(); i++)
        {
            // we will use ascii values
            int current = arg.charAt(i);
            if(current < 65 || current > 122 || (current > 90 && current < 97))
                return "Bad input";
            if(current < 97)
                current += 32;
            letters[current - 97]++;
        }
        builder = new StringBuilder();
        for(int i = 0; i < letters.length; i++)
        {
            if(letters[i] != 0)
            {
                char current = (char) (i + 97);
                String currentLine = String.format("%c = %d\n", current, letters[i]);
                builder.append(currentLine);
            }
        }
        return builder.toString();
    }
}
