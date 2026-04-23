import java.util.LinkedList;
import java.util.Scanner;

public class MetodoPaginaWeb {

    private LinkedList<ObjPaginaWeb> pila;

        public MetodoPaginaWeb(){
        pila = new LinkedList<>();
        }
    
    
    public ObjPaginaWeb push( Scanner sc){

            ObjPaginaWeb o = new ObjPaginaWeb();
            System.out.println("Indroduzca la direccion URL : ");
            o.setUrl(sc.nextLine());
            System.out.println("Nombre de la pagina");
            o.setTitulo(sc.nextLine());
                    
            System.out.println("Ingresa la fecha de entrada a la pagina");
            o.setFechaAcceso(sc.nextLine());

            pila.push(o);  
            System.out.println("Pagina agregada");
  
        return o;
    }
         public ObjPaginaWeb pop() {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        } else {
            ObjPaginaWeb eliminado = pila.pop();
            System.out.println("Eliminado: " + eliminado.getTitulo() + " Pagina: " + eliminado.getUrl());
            return eliminado;
        }
            
    }
        public ObjPaginaWeb peek(){
            if (pila.isEmpty()) {
                System.out.println("la pila esta vacia");
                return null;
                
            } else {
                ObjPaginaWeb top = pila.peek();
                System.out.println("Ultima pagina: " +top.getTitulo() + " Url: " + top.getUrl());
                return top;
                
            }
        }



   
    public void MostrarLista() {
        if(pila.isEmpty()){
            System.out.println("No hay paginas en el historial");
        }
        for (ObjPaginaWeb o : pila) {
            System.out.println(" -------------------------------------");
            System.out.println("Url: " + o.getUrl());
            System.out.println("Nombre pagina: " + o.getTitulo());
            System.out.println("Fecha ingreso: " + o.getFechaAcceso());
            System.out.println("--------------------------------------");
            System.out.println();
        }
    }
}

    

