public class ConvertHexadecimal {
    
    public static String decToHexa(int n)
    {

        char []string = new char [100];



        int i = 0;
        while(n != 0)
        {
            int temp = 0;

            temp = n % 16;

            if(temp < 10)
            {
                string[i] = (char) (temp + 48);
                i++;
            }else
            {
                string[i] = (char) (temp + 55);
                i++;
            }

            n = n / 16;

        }

        String answer = "";

        for(int j = i - 1; j >= 0; j--)
        {
            answer += string[j];
        }
 
        return answer;

    }

    public static void AsciiToHexa(String ascii)
    {
        String hex = "";

        for(int i = 0; i < ascii.length() ; i++)
        {
            char ch = ascii.charAt(i);

            int tmp = (int)ch;

            String part = decToHexa(tmp);


            hex += part + " ";
        }

        System.out.println(hex);
    }
}
