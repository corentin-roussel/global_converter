public class GlobalConverter {

    public static void main(String[] args) {

        if(args.length == 2)
        {
            switch(args[0])
            {
                case "-d":
                    System.out.println(ConvertDecimal.convertDecimal(args[1]));
                    break;
                case "-h":
                    System.out.println(ConvertHexadecimal.AsciiToHexa(args[1]));
                    break;
                case "-o":
                    System.out.println(ConvertOctal.decimalToOctal(args[1]));
                    break;
                case "-b":
                    System.out.println();
                    break;
                default:
                    System.out.println("Please choose a correct translating language (-d, -h, -o, -b) this argument needs to be first (Example: java GlobalConverter -h \"Hello\")");
            }
        }else {
            System.out.println("Please enter a phrase to translate don't forget the \" \" or \\ before a space or special character this argument needs to be second (Example: java GlobalConverter -h \\\"Hello\\\")");
        }

    }
}