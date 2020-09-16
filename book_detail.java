/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_4.books;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class book_detail {
    public void book()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the book no. for the book :");
        
        int a=obj.nextInt();
        switch (a){
            case 1:
                System.out.println("Bookid:456 "+"\n"+"accession no.:SFR899"+"\n"+"book name:apple cart "+"\n"+"author:shaw"+"\n"+"publication:pareson");
                break;
            case 2: 
               System.out.println("Bookid:523 "+"\n"+"accession no.:AS459"+"\n"+"book name:party "+"\n"+"author:nirali"+"\n"+"publication:hardik");
               break;
            case 3:
               System.out.println("Bookid:309 "+"\n"+"accession no.:HUR8783"+"\n"+"book name:think rich"+"\n"+"author:peter"+"\n"+"publication:harry");
               break;
            case 4:
                System.out.println("Bookid:782 "+"\n"+"accession no.:VA345F"+"\n"+"book name:every one have a story "+"\n"+"author:savi"+"\n"+"publication:bashir");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
    
                
                



        }
        
    
    
    

