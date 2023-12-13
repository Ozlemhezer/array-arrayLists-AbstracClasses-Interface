/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import java.util.Date;

class Document{
    private String authors;
    Date date;
    public String getAuthors(){
        return authors;
    }
    public void addAuthor(String name){
        authors = name;
    }
    public Date getDate(){
        return date;
    }
}
class Book extends Document{
    private String title="yüzyıllık yalnızlık";
    public String getTitle(){
        return title;
    }
}
class email extends Document{
    private String subject="kalıtım";
    private String to="@medine";
    public String getSubject(){
        return subject;
    }
    public String getTo(){
        return to;
    }
}

public class Lab6 {

        public static void main(String[] args) {
            Book kitap=new Book();
            email mail = new email();
            System.out.println(kitap.getTitle());
            System.out.println(mail.getSubject());
            System.out.println(mail.getTo());
            System.out.println(mail.getDate());
            kitap.addAuthor("yazaradı");
            System.out.print(kitap.getAuthors()); 
            
    }
    
}
