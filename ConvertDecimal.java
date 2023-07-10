

public class ConvertDecimal {

    public static void convertDecimal(String userInput) {

        String result = "";

        for(int i = 0; i < userInput.length() ; i++)
        {   
            result += (int)userInput.charAt(i) + " ";
        }

        System.out.println(result);
    }
}