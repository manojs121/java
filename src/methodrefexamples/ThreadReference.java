package methodrefexamples;

public class ThreadReference {
    public static void runRef(){
        System.out.println("Running Now ");
    }
    public static void main(String args[]) throws Exception {
        Thread t1=new Thread(ThreadReference::runRef);
        t1.start();
    }
}
