/*
Ejercicio 3
¿Cuáles serían los atributos de la clase Vivienda? ¿Qué subclases se te ocurren?
 */

/*
Clase principal: Vivienda

Una vivienda es una construcción habitable, por tanto, sus atributos deben describir características comunes a cualquier tipo de vivienda.

🔹 Atributos posibles
String	direccion	    Dirección completa
int	    metrosCuadrados	Superficie total
int	    numHabitaciones	Número de habitaciones
int	    numBanyos	    Número de baños
double	precio	        Precio de venta o alquiler
boolean	tieneGaraje	    Si incluye garaje
boolean	tieneJardin	    Si incluye jardín
boolean	esAlquilada	    Si la vivienda está en alquiler
String	tipoSuministro	Tipo de energía (eléctrica, gas, mixta, etc.)

Subclases posibles (herencia)
Podemos derivar tipos concretos de vivienda según su forma o uso:
Vivienda
 - Piso (vive en edificio, tiene comunidad, planta, ascensor)
 - Chalet (tiene parcela, jardín, piscina)
 - Apartamento (más pequeño, 1 habitación)
 - Dúplex (dos plantas dentro de la misma vivienda)
 - CasaRural (situada en campo, materiales típicos)
 - Ático (última planta, con terraza)
 - Estudio (un solo espacio sin habitaciones separadas)
 */

public class Ej1_003 {

    public static class Vivienda {
        protected String direccion;
        protected int metrosCuadrados;
        protected int numHabitaciones;
        protected int numBanos;
        protected double precio;
        protected boolean tieneGaraje;
        protected boolean tieneJardin;

        public Vivienda(String direccion, int metrosCuadrados, int numHabitaciones,
                        int numBanos, double precio, boolean tieneGaraje, boolean tieneJardin) {
            this.direccion = direccion;
            this.metrosCuadrados = metrosCuadrados;
            this.numHabitaciones = numHabitaciones;
            this.numBanos = numBanos;
            this.precio = precio;
            this.tieneGaraje = tieneGaraje;
            this.tieneJardin = tieneJardin;
        }

        public void mostrarInfo() {
            System.out.println("Dirección: " + direccion);
            System.out.println("Metros cuadrados: " + metrosCuadrados);
            System.out.println("Habitaciones: " + numHabitaciones);
            System.out.println("Baños: " + numBanos);
            System.out.println("Precio: " + precio + "€");
            System.out.println("Garaje: " + (tieneGaraje ? "Sí" : "No"));
            System.out.println("Jardín: " + (tieneJardin ? "Sí" : "No"));
        }
    }

    public static class Piso extends Vivienda {
        protected int planta;
        protected boolean tieneAscensor;

        public Piso(String direccion, int metrosCuadrados, int numHabitaciones, int numBanos,
                    double precio, boolean tieneGaraje, boolean tieneJardin,
                    int planta, boolean tieneAscensor) {

            super(direccion, metrosCuadrados, numHabitaciones, numBanos, precio, tieneGaraje, tieneJardin);
            this.planta = planta;
            this.tieneAscensor = tieneAscensor;
        }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Planta: " + planta);
            System.out.println("Ascensor: " + (tieneAscensor ? "Sí" : "No"));
            System.out.println("--------------------------------------");
        }
    }

    public static class Chalet extends Vivienda {
        protected boolean tienePiscina;
        protected double tamanoParcela;

        public Chalet(String direccion, int metrosCuadrados, int numHabitaciones, int numBanos,
                      double precio, boolean tieneGaraje, boolean tieneJardin,
                      boolean tienePiscina, double tamanoParcela) {

            super(direccion, metrosCuadrados, numHabitaciones, numBanos, precio, tieneGaraje, tieneJardin);
            this.tienePiscina = tienePiscina;
            this.tamanoParcela = tamanoParcela;
        }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Piscina: " + (tienePiscina ? "Sí" : "No"));
            System.out.println("Tamaño parcela: " + tamanoParcela + " m²");
            System.out.println("--------------------------------------");
        }
    }

    public static class Apartamento extends Vivienda {

        public Apartamento(String direccion, int metrosCuadrados, int numBanyos,
                           double precio, boolean tieneGaraje, boolean tieneJardin) {

            super(direccion, metrosCuadrados, 1, numBanyos, precio, tieneGaraje, tieneJardin);
        }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Tipo: Apartamento (1 habitación)");
            System.out.println("--------------------------------------");
        }
    }

    public static class CasaRural extends Vivienda {

        public CasaRural(String direccion, int metrosCuadrados, int numBanyos, int numHabitaciones,
                           double precio, boolean tieneGaraje, boolean tieneJardin) {

            super(direccion, metrosCuadrados, numHabitaciones, numBanyos, precio, tieneGaraje, tieneJardin);
        }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Tipo: Casa Rural (1 habitación)");
            System.out.println("--------------------------------------");
        }
    }


    public static void main(String[] args) {
        Vivienda piso = new Piso("Av. Blasco Ibáñez 45, Valencia", 90, 3, 2,
                220000, true, false, 5, true);

        Vivienda chalet = new Chalet("Calle Pinos 32, Alicante", 200, 5, 3,
                450000, true, true, true, 350.5);


        Vivienda apartamento = new Apartamento("Calle 13 Rue del Percebe, Mislata", 50, 1, 110000,
                false, false);

        Vivienda casaRural = new Apartamento("Camino del Bosque s/n, L'Eliana", 225, 3, 400000,
                true, true);

        System.out.println("=== INFORMACIÓN DE VIVIENDAS ===");
        piso.mostrarInfo();
        chalet.mostrarInfo();
        apartamento.mostrarInfo();
        casaRural.mostrarInfo();

    }


}



