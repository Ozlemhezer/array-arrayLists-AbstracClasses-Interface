/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week10.myprojects;

import java.util.ArrayList;
import java.util.Arrays;

 class animal{
    void eat(){
        
    }
}
class cat extends animal{
    void eat(){
        System.out.println("ben bir kediyim");
    }
    void meow(){
        System.out.println("meowwww");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("ben bir köpeğim");
    }
}
class horse extends animal{
    void eat(){
        System.out.println("ben bir köpeğim");
    }
}

public class Week10MyProjects {

    
    public static void main(String[] args) {
         String[] friendsArray= new String[4];//you need to give a size.ARRAY size const.
         String[] friendsArray2={"jhon","chris","eric","luke"};
         
         ArrayList<String> friendsArrayList = new ArrayList<>();//do not have fix size.dynamic.Primitive tutamaz
         ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("jhon","chris","eric","luke"));
         
         System.out.println(friendsArray2[1]);
         System.out.println(friendsArrayList2.get(1));
         //get size
         System.out.println(friendsArray2.length);
         System.out.println(friendsArrayList2.size());
         
         //add elements
         //you can not do that with arrays.
         friendsArrayList2.add("mitch");
         System.out.println(friendsArrayList2.get(4));
         friendsArrayList.add("ozlem");
         System.out.println(friendsArrayList.get(0));
         
         //set elements
         friendsArray[0]="carl";
         System.out.println(friendsArray[0]);
         friendsArrayList.set(0,"merve");
         System.out.println(friendsArrayList.get(0));
         
         //remove
         //can not do this with arrays.
         friendsArrayList2.remove("chris");//"chris" yerine direkt indeks numarası da yazılabilir.
         System.out.println(friendsArrayList2.get(1));//chris yerine eric yazdı çünkü chris listeden çıkarıldı.
         
        //print array and arraylist
        System.out.println(friendsArray2);
        System.out.println(friendsArrayList2);
        
        
        
        
        /*polymorphism
        java allows two types of polymorphism
        1.compile time (static)
            method overloading
        overloading aynı sınıfın içinde aynı ada sahip methodlardır.
        overload için iki moethod ya farklı parametre sayısına sahip olacak ya da 
        aynı parametre sayısı olduğunda faklı parametre tipi alacak
        return type ı değiştirerek overloading yapılamaz.
        2.run time polymorphism (dynamic)
            method overriding.
        Bir subclass ve superclass arasında gerçekleşir.Bu class lar aynı ada aynı değişken tiplerine ve
        aynı parametre sayısına sahiptir.
        
        -polymorphism and Array-
        üç tane objemiz olsun.cat, dog, horse
        bunları aynı diziye nasıl yerleştirebiliriz.
        hepsi animal class ından üretilmiş obje olsun.
        animal[] myArray = new animal[]{cat,dog,horse}
        for(animal a: myArray){
            a.eat();
        
        
        -Object Type Casting:Downcasting and Upcasting-
        
        bir tipi diğer tipe dönüştürmeye Type casting denir.
        
        *primitive type casting
        double mydouble=1.1;
        int myint=(int)mydouble;//double tipini integer tipine çevirdik..
        
        *Reference Type Casting
        -subclass tan superclass oluşturmaya upcasting denir.
        upcasting inheritence(kalıtım) ile yakından ilişkilidir.
        
        cat kedi=new cat();
        animal hayvan=kedi;
        hayvan=(animal)kedi;
        
        -superclass'tan subclass'a aktarıma downcasting denir.
        animal hayvan = new cat();
        ((cat)).meow;
        cat kedi = new animal();//won't compile.
        animal hayvan = new kedi()//will compile.
        a.eat();
        a.meow();
        meow method sadece cat class'ına ait olduğundan bunu bu formda çağıramayız.
        Fakat eat ethod'u animal class'ta bulunduğundan a.eat() çalışacakatır.
        meow methodu şu şekilde kullanabiliriz= ((cat)hayvan).meow();
        ////kodunu yazalım//////
        */
        
        animal hayvan=new cat();
        hayvan.eat();
        //hayvan.meow();wont compile
        ((cat)hayvan).meow();
        Object o=new animal();
       
        ((animal)o).eat();
       
        //Abstraction and Multiple Inheritence
        
/*Cat cat = new Animal(); //??       false. bc not every animal is a cat.
 Animal a = new Cat();             True.
 a.meow(); //??                     false.bc meow method is only in cat class. 
 ((Cat)a).meow(); //??             True.
 Object o = new Animal();          if animal class abstract won't compile.else is true.
 o.eat(); //??                     false.
 o.meow(); //??                    false.
 ((Animal)o).eat(); //??           true.
 ((Animal)o).meow(); //??          false. bc animal doesn't have meow method
 ((Cat)o).eat(); //?? (*)          false. 
 ((Cat)o).meow(); //??             false.*/     


/*////////INTERFACES:Introduction
1. achieve abstraction. (abstraciton a ulaşmak)
2. support the functionality of multiple(çoklu inheritance ı destekler)
inheritance.
3. achieve loose coupling. (gevşek bağlantı,ilişki' ye ulaşmak)

class->class (extends)
class-->interface(implements)
interface-->interface(extends)
modifier interface ınterfaceID extends interface1,..interfaceN{
    constants
    abstract method (After Java 8.0 static and default methods)
 It provides total abstraction which means
◦ all the methods in an interface are declared with the empty body,(methodlar ; ile bitmeli.gövdeleri yok)
◦ and all the attributes are public, static and final by default.(default olarak tanımlanır.)
 A class that implements an interface MUST implement all the methods declared in the interface.
(class'lar implement ettikleri interface'deki bütün methodları kullanmalıdır.)
-Bir class birden çok interface i implement edebilir.
-interface'ler constructor içeremez.
-class'lar gibi interface'leri de veri tipi olarak kullanabilirsin.
-Interfaces sadece abstract methodları ve constant'ları içerir.
-Interface bir class ı extends edemez.
}

*/
        cat k=new cat();
        System.out.println(k instanceof cat);
    }
    
}
