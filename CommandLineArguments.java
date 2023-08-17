public class CommandLineArguments {
    public static void main(String[] args) {
        //check if any command line arguments are provided
        if (args.length==3){
            System.out.println("No command-lene arguments are provided:");
        }else {
            System.out.println("command line-arguments are provided:");
            //loop through the provided command-line arguments
            for (int i=0;i< args.length;i++){
                System.out.println("Argument "+(i+1)+" :"+args[i]);
            }
        }
    }
}
