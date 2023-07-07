

public class ConvertDecimal {

    public static String convertDecimal(String userInput) {

        String result = "";

        for(int i = 0; i < userInput.length() ; i++)
        {   
            result += (int)userInput.charAt(i) + " ";
        }

        return result;
    }
}