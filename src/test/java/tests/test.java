package tests;

import org.junit.AfterClass;
import org.junit.Test;

import example.Human;

public class test {
        

        @Test  
        public void Test(){
        //создаем нового человека
            Human Petr = new Human("Петр", "Иванов"); 
            System.out.println(Petr.name + " " + Petr.soname + " по счету: " + Human.count);
        }

        @Test
        public void TestOne(){
        //создаем нового человека
            Human Oleg = new Human("Олег", "Захаров"); 
            System.out.println(Oleg.name + " " + Oleg.soname + " по счету: " + Human.count);
        }

        @Test
        public void TestThree(){
        //создаем нового человека
            Human Masha = new Human("Маша", "Васина"); 
            System.out.println(Masha.name + " " + Masha.soname + " по счету: " + Human.count);
        }

        @AfterClass
        public static void TestCheck(){
            Human.check();
        }
         
}
