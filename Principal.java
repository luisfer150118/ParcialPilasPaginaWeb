
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir =true;
        
        MetodoPaginaWeb m = new MetodoPaginaWeb();



        while (seguir) {
            System.out.println("*******************************");
            System.out.println("****          MENU         ****");
            System.out.println("* 1. Ingresar pagina          *");
            System.out.println("* 2. Retrocede pagina         *");
            System.out.println("* 3. Ver paginas actual       *");
            System.out.println("* 4. Ver historial de paginas *");
            System.out.println("* 5. Salir                    *");
            System.out.println("*******************************");
            System.out.println("Por favor Seleccione una opcion");
            
            int opt = sc.nextInt();
            sc.nextLine();

         switch (opt) {
            case 1:
                    m.push(sc); 
                    break;
            case 2:
                    m.pop();    
                    break;
            case 3:
                    m.peek();   
                    break;
            case 4:
                    m.MostrarLista(); 
                    break;
            case 5:
                System.out.println("Estas saliendo del aplicativo");
                seguir = false;
                break;  
        
            default:
                System.out.println("Esta opcion no es valida");
                System.out.println("Ingresa la opcion en el rango del 1 al 5");
                break;
            }
        }
    }
}