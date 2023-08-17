public class GlobalConverter {

    public static void main(String[] args) {

        if(args.length == 2)
        {
            switch(args[0])
            {
                case "decimal":
                case "-d":
                    ConvertDecimal.convertDecimal(args[1]);
                    break;
                case "hexadecimal":
                case "-h":
                    ConvertHexadecimal.AsciiToHexa(args[1]);
                    break;
                case "octal":
                case "-o":
                    ConvertOctal.decimalToOctal(args[1]);
                    break;
                case "binary":
                case "-b":
                    ConvertBinary.stringToDecimal(args[1]);
                    break;
                default:
                    System.out.println("Please choose a correct translating language (-d, -h, -o, -b) this argument needs to be first (Example: java GlobalConverter -h \"Hello\")");
            }
        }else {
            System.out.println("Please enter a phrase to translate don't forget the \" \" or \\ before a space or special character this argument needs to be second (Example: java GlobalConverter -h \\\"Hello\\\")");
        }

    }
}