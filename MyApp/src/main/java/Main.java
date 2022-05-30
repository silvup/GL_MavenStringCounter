public class Main {
    public static void main(String[] args)
    {
        StringLetterCounter counter = new StringLetterCounter();
        for(int i = 0; i < args.length; i++)
        {
            String answer = counter.CountLetters(args[i]);
            System.out.println("Counted letters:");
            System.out.println(answer);
            System.out.println("Finished\n");
        }
    }
}
