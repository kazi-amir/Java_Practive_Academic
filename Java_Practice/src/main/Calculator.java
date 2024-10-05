
package main;

/**
 *
 * @author amir
 */
public class Calculator extends Jog_Biyog {
    public void mul(int a, int b){
        System.out.println("a * b = "+(a*b));
    }
    public void div(int a, int b){
        if(b==0){
            System.out.println("Infinite");
        }
        else{
            System.out.println("a / b = "+(a/b));
        }
    }
}
