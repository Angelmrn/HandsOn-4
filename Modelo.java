import java.util.ArrayList;

public class Modelo {
    double b0, b1, b2, correlacion;

    public static ArrayList<Modelo> modelos = new ArrayList<>();
    
    public Modelo(double b0, double b1, double b2){
        this.b0 = b0;
        this.b1 = b1;
        this.b2 = b2;
        this.correlacion = correlacion;
    }

    public double getB0(){
        return b0;
    }
    public double getB1(){
        return b1;
    } 
    public double getCorrelacion() {
        return correlacion;
    }


    public void MostrarModelo(Modelo modelo, Modelo modelo2){
        // Ecuación de Regresión con valores óptimos
    
        System.out.println("----------------------------------------------");
        System.out.println("             70% - 30% de los datos           ");  
        System.out.println("----------------------------------------------");
        System.out.println("ECUACION : Y = B0 + (B1 * X1) + (B2 * X1^2)");
        System.out.println("Y = " + modelo.b0 + " (+) " + modelo.b1 + " * (X1) + " + modelo.b2 + " * x^2");
        System.out.println("B0 = " + modelo.b0);
        System.out.println("B1 = " + modelo.b1);
        System.out.println("B2 = " + modelo.b2);
        System.out.println("El coeficiente de error es: " + CoeficienteErr.CoefErr(Data.datos30, modelo.b0, modelo.b1, modelo.b2));

        double errorCuadraticoMedio = CoeficienteErr.CoefErr(Data.datos30, modelo.b0, modelo.b1, modelo.b2);
        double raizErrorCuadratico = Math.sqrt(errorCuadraticoMedio);

        System.out.println("Raiz del error cuadratico medio: " + raizErrorCuadratico);
        System.out.println("Coeficiente de Determinacion = " + CoeficienteErr.CalcularR2(Data.datos30, modelo.b0, modelo.b1, modelo.b2));
        System.out.println("----------------------------------------------");
        System.out.println("                  Simulaciones                ");
        System.out.println("----------------------------------------------");
        double val[] = {4, 5, 6, 7, 8};
        for (double x : val) {
            double result = b0 * (x * x) + b1 * x + b2;  
            System.out.println("X:" + x + " Y = " + result);
        }
        //SEGUNDA SEGMENTACION
        System.out.println("----------------------------------------------");
        System.out.println("             30% - 70% de los datos           ");  
        System.out.println("----------------------------------------------");
        System.out.println("ECUACION : Y = B0 + (B1 * X1) + (B2 * X1^2)");
        System.out.println("Y = " + modelo2.b0 + " (+) " + modelo2.b1 + " * (X1) + " + modelo2.b2 + " * x^2");
        System.out.println("B0 = " + modelo2.b0);
        System.out.println("B1 = " + modelo2.b1);
        System.out.println("B2 = " + modelo2.b2);
        System.out.println("El coeficiente de error es: " + CoeficienteErr.CoefErr(Data.segdatos30, modelo2.b0, modelo2.b1, modelo2.b2));
        
        double errorCuadraticoMedio2 = CoeficienteErr.CoefErr(Data.segdatos30, modelo2.b0, modelo2.b1, modelo2.b2);
        double raizErrorCuadratico2 = Math.sqrt(errorCuadraticoMedio2);
        
        System.out.println("Raiz del error cuadratico medio: " + raizErrorCuadratico2);
        System.out.println("Coeficiente de Determinacion = " + CoeficienteErr.CalcularR2(Data.segdatos30, modelo2.b0, modelo2.b1, modelo2.b2));
        System.out.println("----------------------------------------------");
        System.out.println("                  Simulaciones                ");
        System.out.println("----------------------------------------------");
        double val2[] = {4, 5, 6, 7, 8};
        for (double x : val2) {
            double result = b0 * (x * x) + b1 * x + b2;  
            System.out.println("X:"+ x + " Y = "+ result);
        }
       
    }
}