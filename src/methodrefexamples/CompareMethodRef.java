package methodrefexamples;

import java.util.ArrayList;
import java.util.Collections;

class Emp{
    int eno,sal;
    String ename;

    @Override
    public String toString() {
        return "Emp{" + "eno=" + eno + ", sal=" + sal + ", ename=" + ename + '}';
    }

    public Emp(int eno, String ename, int sal) {
        this.eno = eno;
        this.sal = sal;
        this.ename = ename;
    }
    
}
public class CompareMethodRef {
    public int check(Emp e1, Emp e2){
        return e1.ename.compareTo(e2.ename);
    }
    
    public static void main(String args[]){
      Emp e1=new Emp(111,"Rajesh",50000);
     Emp e2=new Emp(51,"Suresh",34000);
     Emp e3=new Emp(56,"Jay",67000);
     ArrayList<Emp> list=new ArrayList<Emp>();
     
     list.add(e1);list.add(e2);list.add(e3);
     for(Emp e:list){
         System.out.println(e);
     }
     System.out.println("_________________________________________________________");
     Collections.sort(list, new CompareMethodRef()::check);
     for(Emp e:list){
         System.out.println(e);
     }
     System.out.println("_________________________________________________________");
    }
}
