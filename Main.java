import java.util.*;

public class Main {
    public static int main(String[] args) {

        // declara un array de enteros.
        int[][] arr;

        // asignando memoria para 5 enteros.
        arr = new int[6][5];

        imprimirMariz(6,5, arr);

        // inicializa el primer elemento del array
        arr[0][2] = 10;

        // inicializa el segundo elemento del array
        arr[1][3] = 20;

        // y así...
        arr[2][2] = 30;
        arr[3][2] = 40;
        arr[4][1] = 50;
        arr[4][4] = 12;

        general();

        /*
        String entradaTeclado = "";
        System.out.println ("Empezamos el programa");
        do {
            System.out.println("Por favor introduzca la operacion a realizar:");
            System.out.println("1. Suma diagonal");
            System.out.println("2. POST");
            System.out.println("3. DELETE");
            System.out.println("4. SALIR");

            Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
            entradaTeclado = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner

            if("1".equalsIgnoreCase(entradaTeclado)) {
                System.out.println("1");
                System.out.println("La diagonal por el metodo 1 suma: " + sumaDiagonalPPal(5, arr));
            }
            if("2".equalsIgnoreCase(entradaTeclado)){
                System.out.println("2");
                System.out.println("La diagonal por el metodo 2 suma: " + sumaDiagonalPPal2(5, arr));
            }
            if("3".equalsIgnoreCase(entradaTeclado)) {
                System.out.println("3");
            }
        } while (!"4".equals(entradaTeclado));

    }  */

    private static void general(){
        int a, b;
        a = 11;
        b = 5;
        int suma, resta, producto;
        int cociente, residuo;

        suma = sumaEnteros(a,b);

        //suma = a+b;
        resta = a-b;
        producto = a*b;
        cociente = a/b;
        residuo = a%b;

        System.out.println("Hola");
        System.out.println("La suma de " + a + "+" + b + " es igual a: " + suma);
        System.out.println(resta);
        System.out.println(producto);
        System.out.println(cociente);
        System.out.println(residuo);

        // declara un array de enteros.
        int[][] arr;

        // asignando memoria para 5 enteros.
        arr = new int[6][5];

        imprimirMariz(6,5, arr);

        // inicializa el primer elemento del array
        arr[0][2] = 10;

        // inicializa el segundo elemento del array
        arr[1][3] = 20;

        // y así...
        arr[2][2] = 30;
        arr[3][2] = 40;
        arr[4][1] = 50;
        arr[4][4] = 12;

        mapas();
        listas();

        imprimirMariz(6,5, arr);

        int[][] resultado = sumaMatrices(6,5, arr, arr);
        imprimirMariz(6,5, resultado);

        int diagonal = sumaDiagonalPPal(5, arr);
        int diagonal2 = sumaDiagonalPPal2(5, arr);
        System.out.println("La diagonal ppal suma: " + diagonal);
        System.out.println("La diagonal ppal suma2: " + diagonal2);

    }

    private static void mapas() {
        Map<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Rojo");
        hm.put(2, "Verde");
        hm.put(3, "Azul");
        hm.put(4, "Blanco");
        hm.put(2,"Cafe");
        System.out.println(hm);
        System.out.println(hm.get(3));
    }

    private static int sumaEnteros(int a, int b){
        int suma;
        suma = a + b;
        return suma;
    }

    private  static void listas(){
        List<String> myList = new ArrayList<String>();

        myList.add("Gabriel");
        myList.add("Carlos");
        myList.add("Sonia");

        System.out.println(myList.toString());
        System.out.println(myList.get(0));


        int x = 0;

        // Salir cuando x llega a ser mayor que 4
        while (x < myList.size())
        {
            System.out.println("NOmbre: " + myList.get(x));

            //incrementa el valor de x para la siguiente iteración
            x++;
        }

    }

    private static int[][] sumaMatrices(int filas, int columnas, int[][] arr, int[][] arr1){
        int[][] resultado;
        resultado = new int[filas][columnas];
        for (int fila =0; fila<filas; fila++){
            for(int columna = 0; columna<columnas; columna++){
                resultado[fila][columna] = arr[fila][columna] + arr1[fila][columna];
            }
        }
        return resultado;
    }

    private static int sumaDiagonalPPal(int tam, int[][] arr){
        int suma = 0;
        for(int i=0; i<tam; i++) {
            suma = suma + arr[i][i];
        }
        return suma;
    }

    private static int sumaDiagonalPPal2(int tam, int[][] arr){
        int suma = 0;
        for(int fila=0; fila<tam; fila++) {
            for (int columna=0; columna<tam; columna++) {
                if(fila==columna){
                    suma = suma + arr[fila][columna];
                }
            }
        }
        return suma;
    }

    private static void imprimirMariz (int filas, int columnas, int[][] arr) {
        for (int y = 0; y <= filas-1; y++) {
            for(int w=0; w<=columnas-1; w++) {
                System.out.print(" " + arr[y][w]);
            }
            System.out.println();
        }
    }



}

