package tests;

import org.junit.AfterClass;
import org.junit.Test;

import example.human;

public class test {
        

        @Test  
        public void Test(){
        //создаем нового человека
            human Petr = new human("Петр", "Иванов"); 
            System.out.println(Petr.name + " " + Petr.soname + " по счету: " + human.count);
        }

        @Test
        public void TestOne(){
        //создаем нового человека
            human Oleg = new human("Олег", "Захаров"); 
            System.out.println(Oleg.name + " " + Oleg.soname + " по счету: " + human.count);
        }

        @Test
        public void TestThree(){
        //создаем нового человека
            human Masha = new human("Маша", "Васина"); 
            System.out.println(Masha.name + " " + Masha.soname + " по счету: " + human.count);
        }

        @AfterClass
        public static void TestCheck(){
            human.check();
        }
         
}
