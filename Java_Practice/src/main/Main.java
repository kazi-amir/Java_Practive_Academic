//import java.util.*;
package main;

public class Main {
    public static void main(String[] args) {
        //just a Person Class
        Person man = new Person();
        man.name = "Amir Hamza";
        man.age = 21;
        System.out.println(man.name+" "+man.age);
        
        //Student inherits Person
    	Student st1 = new Student();
    	st1.setInfo("1895", "Amir", 3.32);
        st1.nid = "646523912";
    	System.out.println(st1.getId()+" "+st1.name+" "+st1.getCGPA()+" "+st1.nid);
    	
        //ChatroLeague extends Student extends Person
        ChatroLeague st = new ChatroLeague();
        st.print();
    	st.setInfo("1894", "Bappy", 3.54);
        st.nid = "646523912";
        st.leagueId = "Sovapoti";
    	System.out.println(st.getId()+" "+st.name+" "+st.getCGPA()+" "+st.nid+" "+st.age+" "+st.leagueId);
        
        Calculator c1 = new Calculator();
        c1.add(4, 5);
        c1.sub(5, 4);
        c1.mul(5, 6);
        c1.div(4, 0);
        c1.div(5, 2);
        
        Car corolla = new Car(100);
        corolla.printStatus();
        
        FClass F = new FClass();
        F.myMethod();
        TClass T = new TClass();
        T.myMethod2();
        ThClass Th = new ThClass();
        Th.myMethod();
        Th.myMethod2();
        Th.myMethod3();

    }
    
}
