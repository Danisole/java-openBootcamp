public class Loop {

    public static void main(String[] args) {

        String[] nombres = {"pepe", "carlos", "robert", "miguel"};

        String acumulador=" ";

       for(String nombre:nombres){

        acumulador += nombre + " ";

       } System.out.println(acumulador);
    }
}

