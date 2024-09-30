package Sept.ex_30092024;

public class Task28 {
    public static void main(String[] args) {
        String name="Pramod";
        vowels_con(name);
    }

    public static void vowels_con(String name)
    {

        int vowels=0,con=0;

        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vowels++;
            }
            else
            {
                con++;
            }
        }
        System.out.println("vowels => " +vowels);
        System.out.println("consonants => "+con);
    }
}
