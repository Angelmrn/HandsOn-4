import java.util.ArrayList;

public class MatesDiscretas {
    

    public double Correlacion(ArrayList<Data> dataList, double b0, double b1, double b2) {
        int n = dataList.size();
        double sumX = 0;
        double sumY = 0;
        double sumX2 = 0;
        double sumXY = 0;
        double sumY2 = 0;
    
        for (Data punto : dataList) {
            double x = punto.getX();
            double y = punto.getY();
            double prediccion = b0 + b1 * x + b2 * Math.pow(x, 2);  // Predicción cuadrática
    
            sumX += prediccion;              // Suma de los valores predichos
            sumY += y;                       // Suma de los valores reales
            sumX2 += Math.pow(prediccion, 2); // Suma de los cuadrados de las predicciones
            sumXY += prediccion * y;          // Suma de los productos (predicción * valor real)
            sumY2 += Math.pow(y, 2);          // Suma de los cuadrados de los valores reales
        }
    
        // Fórmula para la correlación
        return (n * sumXY - sumX * sumY) / 
               Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY));
    }
}
