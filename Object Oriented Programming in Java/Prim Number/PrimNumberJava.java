
package prim.number.java;


public class PrimNumberJava {

    
    public static void main(String[] args) {
        int n=10;
        int flag=0;
        if(n==0||n==1){
            System.out.println("The number "+n+" is not a prim number:");
            
        }
        else{
            for(int i=2; i<n/2; i++){
            if(n%i==0){
                System.out.println("This number is not a prim number:");
                flag=1;
                break;
            }
        }
        }
        if(flag==0){
            System.out.println(n+"This is a prim number:");
        }
    }
    
}
