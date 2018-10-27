package methodrefexamples;

interface Greet {
    public void greeting();
}

public class StaticMethodExample {

public static void greetSomeone(){
    System.out.println("hello user");
}    
    
public static void main(String args[]){

Greet g=StaticMethodExample::greetSomeone;
g.greeting();
    
}    
}
