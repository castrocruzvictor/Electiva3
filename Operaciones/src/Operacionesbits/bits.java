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
        
        //ciclo for cero
        int i;
        for(i=0; i<5; i++ ){
           System.out.println(i);
           break;
        }
        
        System.out.println(i);
        
        //ciclo for para saltar numero
        for(i=0; i<5; i++ ){
           if (i==3)
               continue;
           System.out.println(i);
        }
        
        System.out.println(i);
        
        
        //while para subir de dos en dos pregunta antes de hacer
        i=2;
        while (i<10){
            System.out.println(i);
            i+= 2;
        }
        
        //el do while hace y despues pregunta 
        //do{
        //    System.out.println(i);
        //    i+= 2;
            
        //}while(i<10);
        
        if(i<=8){
            System.out.println("menor igual que 8");
        }
        else if (i > 10){
            System.out.println("mayor a 10");
        }
        else {
            System.out.println("entre 9 y 10");
        }
        
        switch(i){
            case 8:
                System.out.println("igual que 8");
            case 10:
                System.out.println("igual que 10");
                break;            
            default:
                System.out.println("diferente");
                
        }
        
    }
    
}
