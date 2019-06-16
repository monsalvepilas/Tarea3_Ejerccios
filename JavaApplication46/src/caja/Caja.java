package caja;

public class Caja {

    private int x;
    private int y;
    private String caracter;
    private material material;
    private boolean giramos;

    public enum material {
        MADERA, CORCHO, PLASTICO, CARTON;
    }

    // Punto 3
    public Caja() {

        caracter = "*";
        x = 5;
        y = 2;
        material = material.CORCHO;

    }

    // PUNTO 4
    public Caja(String caracter, int columnas, int filas, material material) {

        this.caracter = caracter;
        x = columnas;
        y = filas;
        this.material = material;

    }

    // PUNTO 5
    @Override
    public String toString() {
        String mensaje = "La caja se dibuja con el carácter: " + caracter + " y se dibujará con: " + x + " columnas "
                + " y " + x + " filas. " + " El material de la caja es: " + material;

        return mensaje;
    }

    // PUNTO 2 Añadiendo los métodos constructores SETTER Y GETTER
// SETTER
    public void establece_columnas(int num_col) {

        x = num_col;

    }

//GETTER
    public int dime_columnas() {

        return (x);
    }

    // SETTER
    public void establece_filas(int num_fil) {

        y = num_fil;

    }

//GETTER
    public int dime_filas() {

        return (y);
    }

//SETTER
    public void establece_caracter(String caracter_caja) {

        caracter = caracter_caja;

    }

//GETTER
    public String dime_caracter() {

        return (caracter);
    }

//SETTER
    public void establece_material(material valor_material) {

        material = valor_material;

    }

//GETTER
    public material dime_mamterial() {

        return (material);
    }

// PUNTO 7
//SETTER
    private int anchura;
    boolean incremento = false;

    public void aumentarAnchura(int valor_anchura) {

        anchura = valor_anchura;

        if (anchura <= 0) {
            incremento = false;
        }
        else {
            anchura = y + anchura;
            incremento = true;

        }
    }

//GETTER
    public int dime_anchura() {

        return (anchura);

    }

//GETTER
    public String dime_incremento() {

        return "El incremento de la caja es:  " + incremento;

    }

//SETTER
    public void giramos_caja(String giramos) {

        if (giramos.equalsIgnoreCase("si")) {
            this.giramos = true;
        }
        else {
            this.giramos = false;
        }

    }

    //GETTER
    private int z = 0;

    public String girarCaja() {

        if (giramos == true) {

            for (int contador_col = 0; contador_col < anchura; contador_col++) {
                System.out.print(caracter);

                for (int contador_fil = 1; contador_fil < y; contador_fil++) {
                    System.out.print(caracter);
                }

                System.out.println("");
            }
            System.out.println("");
            System.out.println("");
            return "Ahora la cja tiene " + y + " columnas y " + anchura + " filas. ";

        }
        else {
            System.out.println("");
            System.out.println("");
            return "No se ha querido girar la caja. ";

        }
    }

}

