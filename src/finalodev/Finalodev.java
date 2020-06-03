
package finalodev;

import java.util.Scanner;

public class Finalodev 
{

    public static void main(String[] args)
    {
        {
            Scanner girdi=new Scanner(System.in);    
            int a = 0;      
            System.out.print("Faktöriyel için 1, fibonacci için 2'ye basınız...:");
            int islem, sayi=0;
            islem=girdi.nextInt();
            if(islem==1)
            { 
                System.out.println("Faktöriyelini öğrenmek istediğiniz sayıyı giriniz...:");
                a=girdi.nextInt();
                System.out.println(a+"! = "+faktoriyel(a));
            }
            else if(islem==2)
            {
                System.out.println("Lütfen fibonaccisi hesaplancak sayıyı giriniz...");
                sayi=girdi.nextInt();
                System.out.println(sayi+".elamanı..:" +fibonacci(sayi));           
            }
            else
            {
                System.out.println("lütfen 1 veya 2 rakamını kulanınız.....");
                islem=girdi.nextInt();
            }      
	}
    }
    	static int faktoriyel (int sayi)            
      	{
		if(sayi==1  ||  sayi==0)     
		{
		return 1;                              
		}
		else                        
		{
		return sayi*faktoriyel(sayi-1);    
		}
        }
       static int fibonacci(int x)                                      
    {
       if(x<=1)                                                            
           return x;			                                  
       else				                                       
           return fibonacci(x-1)+fibonacci(x-2);                           
    }
}