/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahoa;

/**
 *
 * @author nghie
 */
 class ThuatToan {
     public String caesarCipher(String a, int b)
             {
                 String str = "";
                 String A[] = {"a",	"b",	"c",	"d",	"e",	"f",	"g",	"h",	"i",	"j",	"k",	"l",	"m",	"n",	"o",	"p",	"q",	"r",	"s",	"t",	"u",	"v",	"w",	"x",	"y",	"z"};
                 String[] B = new String[26];
              
                 for(int i =0; i<b; i++)
                 {
                     B[26-b+i] = A[i];
                 }
                 for(int i= 0; i< 26-b;i++)
                 {
                    B[i] = A[i+b];    
                 }
                 for(int i =0; i<  a.length() ;i++)
                 {
                     String c = Character.toString(a.charAt(i));
                     if(c.equalsIgnoreCase(" ")==true) 
                     {
                         str +=" ";
                         continue;
                     
                     }
                     for(int j = 0; j<26 ; j++)
                     {
                         if(A[j].equalsIgnoreCase(c)==true)
                         {
                             str +=B[j];
                         }
                     }
                 }              
                     return str;
             }
     public String playfairKeyMatrix(String a)
     {
          String str = "";
          String A[] = {"a",	"b",	"c",	"d",	"e",	"f",	"g",	"h",	"i",	"j",	"k",	"l",	"m",	"n",	"o",	"p",	"q",	"r",	"s",	"t",	"u",	"v",	"w",	"x",	"y",	"z"};
          String B[][] = new String[5][5];
          
          
          
          
          
          return str;
     }
     

 
    
}
