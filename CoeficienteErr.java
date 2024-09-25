import java.util.ArrayList;

public class CoeficienteErr {

    public static double CoefErr(ArrayList<Data> dataList, double b0, double b1, double b2) {
        double error = 0;
    
        for (Data punto : dataList) {
            // Predicción usando el modelo cuadrático: b0 + b1 * x + b2 * x^2
            double prediccion = b0 + b1 * punto.getX() + b2 * Math.pow(punto.getX(), 2);
            
            // Sumar el cuadrado del error
            error += Math.pow(prediccion - punto.getY(), 2);
        }
    
        // Devolver el error cuadrático medio (MSE)
        return error / dataList.size();
    }
    
    public static double CalcularR2(ArrayList<Data> Restante, double b0, double b1, double b2) {
        double SST = 0;
        double SSR = 0;
        double meanY = 0;
    
        // Calcular la media de Y
        for (Data p : Restante) {
            meanY += p.y;
        }
        meanY /= Restante.size();
    
        for (Data p : Restante) {
            // Total sum of squares (SST)
            SST += Math.pow(p.y - meanY, 2);
    
            // Residual sum of squares (SSR) usando la fórmula cuadrática: b0 + b1 * x + b2 * x^2
            double yPredicho = b0 + b1 * p.x + b2 * Math.pow(p.x, 2);
            SSR += Math.pow(p.y - yPredicho, 2);
        }
    
        // R^2 = 1 - (SSR / SST)
        return 1 - (SSR / SST);
    }
}
