public class Funciones {

    public static void main(String[] args) {
        
        double precio1= 320.34;
        double precio2=250.45;

        double total= precio1+precio2;

        System.out.println(total);

        double precioConIva= precioMasIva(total);

        System.out.println(precioConIva);
    }

    private static double precioMasIva(double total) {

//        double iva = total * 0.21;

        return total + (total*0.21);
   }
}