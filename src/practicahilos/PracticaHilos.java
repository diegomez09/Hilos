
package practicahilos;

public class PracticaHilos extends Thread{
   
    public String nombre;
    
    public PracticaHilos(String nombre){        
        this.nombre=nombre;
    }
    @Override
    public void run(){
        //for(int x = 0; x < 6; x++){
            System.out.println("Hola "+nombre);
        //}
    }
    public static void main(String[] args) {
      //System.out.println("Hola");
      PracticaHilos h1 = new PracticaHilos("Juan");
      PracticaHilos h2 = new PracticaHilos("Brenda");
      h1.start();
      h2.start();
      //System.out.println("Hola");
    }
    
}
