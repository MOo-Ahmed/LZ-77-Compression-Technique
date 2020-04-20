/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lz.pkg77;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;

/**
 *
 * @author MOo , FastestManAlive
 */
public class Tag {
    
    public  int position ;
    public int length ;
    public String Next ;
    
    public Tag(){}
    
    public Tag(int p , int l , String n){
        position = p ;
        length = l ;
        Next = n ;
    }
    @Override
    public  String toString(){
        return "< " + position + " , " + length + " , " + Next + " >" ;
    }
    
}
