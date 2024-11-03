/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author harsh
 */
public class Demo {
    public  int add(int a,int b){
    return a+b;
    }
    public  int sub(int a,int b){
    return a-b;
    }
    public  int mul(int a,int b){
    return a*b;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Demo a=new Demo();
        int c=2;
        int b=3;
        int ans=a.add(c,b);
        System.out.println(ans);
    }
    
}
