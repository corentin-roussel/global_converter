

public class ConvertOctal {
    
    public static String translateOctal(int decimal)
    {
        int[] octalNum = new int[100];
 
        
        int i = 0;
        while (decimal != 0) {
 
            octalNum[i] = decimal % 8;
            decimal = decimal / 8;
            i++;
        }
 

        String octalString = "";

        for (int j = i - 1; j >= 0; j--){ 
            octalString += (octalNum[j]);
        }
        return octalString;
    }

    public static String decimalToOctal(String decimalString)
    {
        String hex = "";

        for(int i = 0; i < decimalString.length() ; i++)
        {
            char ch = decimalString.charAt(i);

            int tmp = (int)ch;

            String part = translateOctal(tmp);


            hex += part + " ";
        }

        return hex;
    }
}
