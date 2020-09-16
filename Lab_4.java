/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_4;

import lab_4.books.book_detail;
import lab_4.books.journal_detail;

/**
 *
 * @author hp
 */
public class Lab_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student s1=new student();
        book_detail s2=new book_detail();
        s2.book();
        staff s3=new staff();
        journal_detail s4=new journal_detail();
        s4.journal();
       
        
        // TODO code application logic here
    }
    
}
class student
{
    student()
    {
    System.out.println("book no 1:apple cart"+"\n"+"book no 2:party"+"\n"+"book no 3:think rich"+"\n"+"book no 4:every one have a story");
    
    }
    
    }
class staff
    {
    staff()
         {
             System.out.println("\n"+"journal name 1:the lancet"+"\n"+"journal name 2:nature"+"\n"+"journal name 3:neurology journal");
             
                    
                }
    }
