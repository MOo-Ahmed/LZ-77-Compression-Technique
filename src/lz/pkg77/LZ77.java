
package lz.pkg77;

import java.util.ArrayList;
import java.util.Scanner;

public class LZ77 {
    
     public static   int SearchWindowLength = 12 , LookAheadLength = 8 ;
    public static  String Message ;
    public static  ArrayList<Tag> Tags = new ArrayList();
    public static  String SearchWindow = new String();
    public static  String LookAheadWindow = new String();
    
    public  int indexOfLongestMatch (String part){
        for(int i = 0 ; i < Message.length() ; i++ ){
            
        }
    
    }
    
    public static   void Encode (String Msg) {
           
            String temp = new String();     // used to store a char
            String Sequence = new String();     // sequence to longest match
            int startLookAhead = 0 ;
            boolean encoded = false ;
            
            for(int i = startLookAhead ; i < Msg.length() ; i= startLookAhead) {
                    if(encoded == true || i == 0) {
                        
                        if  (Msg.length() - startLookAhead >= SearchWindowLength)
                            LookAheadWindow = Msg.substring(startLookAhead, SearchWindowLength) ;
                        else    LookAheadWindow = Msg.substring(startLookAhead) ;
                        
                    }
                    temp = Msg.charAt(i) + "" ;
                    Sequence += temp ;
                    if(SearchWindow.lastIndexOf(Sequence) == -1 ){
                            if(Sequence.length() == 1){
                                // Single symbol
                                    Tag t = new Tag (0,0,temp) ;
                                    Tags.add(t) ;
                                    startLookAhead++ ;
                                    SearchWindow += Sequence ;        
                                            
                            }
                            else {
                                // sequence of multiple chars
                                    int pos  = SearchWindow.length() - SearchWindow.lastIndexOf(Sequence.substring(0, Sequence.length() -1));
                                    Tag t = new Tag () ;
                                    t.position = pos ;
                                    t.Next = temp ;
                                    t.length = Sequence.length() - 1 ;
                                    startLookAhead += Sequence.length() ;
                                    SearchWindow += Sequence ;
                                    Tags.add(t) ;
                                     
                            }
                    }
                    
            }
    
    
    
    
    } 
    
    public static void print (){
        for(int i = 0 ; i < Tags.size() ; i++){
            System.out.println(Tags.get(i));
        }
    
    }
    
    public static  String Decode (){
        String NewMessage  = new String();
        return NewMessage ;
        
    }
    
    public  static void main(String[] args) {
        
       System.out.println("enter your message : ");
        
        Scanner scan= new Scanner(System.in);
       Message =scan.nextLine();
        
        Encode(Message) ;
        print();
        
        
        /*
        String DecodedMessage = new String();
        DecodedMessage = Decode() ;
        Scanner scan= new Scanner(System.in);
       Message =scan.nextLine();*/
      
        
        
        
    }
    
}
