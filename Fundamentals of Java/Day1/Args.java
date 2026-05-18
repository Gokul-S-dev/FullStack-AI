public class Args {
    public static void main( String[] args) {
        System.out.println("The list of arguments passed");
        for (String arg : args){
            System.out.println(arg);
        }
        System.out.println("The number of arguments passed: " + args.length);
    }
    
}
