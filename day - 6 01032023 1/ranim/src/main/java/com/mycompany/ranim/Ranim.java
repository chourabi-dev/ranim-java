
package com.mycompany.ranim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author tchou
 */
public class Ranim {

    public static void main(String[] args) {
        
       /* List<String> notes = new ArrayList<String>();
        
        // insert !!
        
        notes.add("Math : 20");
        
        notes.add("Eco : 18");
        
        
        // for each !!
        for( String note:notes ){
            System.out.println(note);
        }
        
        
        */
        
       
       /*
       // declaration liste de type employee!!!
       List<Employee> employees = new ArrayList<Employee>();
       
       // add new employee !!
       
       Employee e1 = new Employee("chourabi taher","INFO");
       Employee e2 = new Employee("chourabi taher2","INFO2");
       
        
       
       employees.add(e1);
       employees.add(e2);
       
       // afficher la liste des employee !!!
       
       for( Employee e: employees ){
           System.out.println(e);
       }
       */
       
       
       
       /*
       HashMap<String,String> countries = new HashMap<String,String>();
       
       
       countries.put("tn", "tunisia");
       countries.put("fr", "france");
       countries.put("usa", "united states");
       
       
       System.out.println( countries.get("tn") );
       
       */
       
       
       // HashSett
       
       // interface
       
       // compare
       
       
       /*HashSet<String> marks  = new HashSet<String>();
       
       marks.add("Peugote");
       marks.add("Mercedes");
       marks.add("Volvo");
       
       
               
       Cat cat = new Cat();
       
       cat.setName("tom");
       
       cat.walk();
       */
       
       
       Person p1 = new Person();
       Person p2 = new Person();
       
       
       p1.setFullname("chourabi taher");
       p2.setFullname("chourabi taher");
       
       
       p1.setCin(123);
       p2.setCin(123);
       
       // p1 compare to p2
       
       System.out.println(p1.equals(p2));
       
       
       
       
       
       
       
                
    }
    
    
}
