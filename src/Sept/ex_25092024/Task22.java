package Sept.ex_25092024;

public class Task22 {

    public static void main(String[] args)
    {
        String s="pramod";
        int vowels=0, consonants=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vowels++;
            }
            else if(ch == ' ')
            {
                continue;
            }
            else
            {
                consonants++;
            }

        }
        System.out.println("vowels"+vowels);
        System.out.println("consonants"+consonants);
    }

}
