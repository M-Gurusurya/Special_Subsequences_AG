import java.util.Scanner;

public class SpecialSubsequencesAG {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a String");
        String word=scanner.next();
        System.out.println(findSpecialSequence(word));
    }

    public static int findSpecialSequence(String word)
    {
        int length=word.length();
        int count=0;
        int result=0;
        for(int i=0;i<length;i++)
        {
            if(word.charAt(i)=='A')
            {
                count++;
            }
            if(word.charAt(i)=='G')
            {
                result+=count;
            }
        }
        return result;
    }
}
