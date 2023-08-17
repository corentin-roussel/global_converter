public class ConvertBinary {
    
    public static String decToBinary(int n)
    {
        int[] binaryNum = new int[1000];

        int i = 0;

        while(n > 0)
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        String binaryString = "";

        for(int j = i - 1; j >= 0; j--)
        {
            binaryString += binaryNum[j];
        }

        return binaryString;
    }

    public static void stringToDecimal(String arg)
    {
        String binaryString = "";

        for(int i = 0; i < arg.length(); i++)
        {

            char argChar = arg.charAt(i);

            int temp = (int)argChar;
            
            String binary = decToBinary(temp);
      
            if(binary.length() == 6)
            {
                binaryString += '0' + binary + ' ' ;
            }else {
                binaryString += binary + " ";
            }


        }

        System.out.println(binaryString);
    }
}