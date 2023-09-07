package practicalworks.first;

public class Args {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println("Arg " + (i + 1) + ": " + args[i]);
        }
    }
}
