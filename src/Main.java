public class Main {
    public static void main(String[] args) {
        Coche Toyota = new Coche();
        // Ingreso los datos con los Setter a la nueva instancia de
        // Coche
        Toyota.setColor("Azul");
        Toyota.setMarca("Toyota");
        Toyota.setRuedas(7);
        Toyota.setHibrido(true);

        // Para obtener los datos uso los Getter
        // y los podemos imprimir en Consola
        System.out.println(Toyota.getMarca());
        System.out.println(Toyota.getColor());
        System.out.println(Toyota.getRuedas());
        System.out.println(Toyota.getHibrido());

        Moto Kawasaki = new Moto("Kawasaki","verde");

        System.out.println(Kawasaki.getMarca());
        System.out.println(Kawasaki.getColor());
        System.out.println(Kawasaki.getRuedas());

    }

}