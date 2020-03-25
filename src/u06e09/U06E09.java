
package u06e09;

import java.util.Scanner;

public class U06E09 {
    public static void main(String args[]) {
        Scanner entrada=new Scanner(System.in);
        char vocal;
        boolean x=true;
        System.out.print("Ingrese una vocal: ");
        vocal=entrada.next().charAt(0);
        vocal=Character.toUpperCase(vocal);
        x=esVocal(vocal);
        System.out.print(x);
    }
    static boolean esVocal(char a){
        boolean z;
        switch(a){
            case 'A':
                z=true;
                break;
            case 'E':
                z=true;
                break;
            case 'I':
                z=true;
                break;
            case 'O':
                z=true;
                break;
            case 'U':
                z=true;
                break;
            default:
                z=false;
                break;
        }
    return(z);
    }
}