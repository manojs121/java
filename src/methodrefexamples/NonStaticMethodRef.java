package methodrefexamples;

class Trial
{
    void disp(){
        System.out.println("From Display Method");
    }
    void check(){
        System.out.println("From Check MEthod");
    }
}


public class NonStaticMethodRef {
    public void show(){
        System.out.println("Showing From Non Static Method");
    }
    public static void main(String args[]){
        NonStaticMethodRef ob=new NonStaticMethodRef();
        Thread t=new Thread(ob::show);
        t.start();
        
        Thread t1=new Thread(
        new Runnable(){
            public void run(){
                System.out.println("Legacy Approach");
            }    
        }
        );
        t1.start();
        
        Thread t2=new Thread(new Trial()::disp);
        t2.start();
        
        
        Runnable r=new Trial()::check;
        
        Thread t3=new Thread(r);
        t3.start();
    }
}
