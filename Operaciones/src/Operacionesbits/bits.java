package Operacionesbits;


public class bits {
    
    public static void main(String[] args) {
   
        
        //impresion de bits y movimientos 
        int a =32;
        int b;
        
        System.out.println(a);
        b= a << 2;
        System.out.println(b);
        b= a >> 2;
        System.out.println(b);
        b= a & 2;
        System.out.println(b);
        
        //ciclo for 
        int i;
        for(i=0; i<5; i++ ){
           System.out.println(i);
           break;
        }
        
        System.out.println(i);
        
        
    }
    
}
