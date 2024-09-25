import java.util.ArrayList;
public class QuadraticR {

    public static Modelo QR(ArrayList<Data> datosList) {
        int columnas = 4;
        int filas = 3;
        double sumX = 0, sumY = 0, sumX2 = 0, sumX3 = 0, sumX4 = 0, sumX2Y = 0, sumXY = 0;
        int n = datosList.size();

        double[][] matriz = new double[filas][columnas];
        for (Data datos : datosList) {
            double xt = datos.getX();
            double y = datos.getY();
            sumX += xt;
            sumY += y;
            sumX2 += xt * xt;
            sumX3 += xt * xt * xt;
            sumX4 += xt * xt * xt * xt;
            sumX2Y += (xt * xt) * y;
            sumXY += xt * y;
        }

        matriz[0][0] = sumX4;
        matriz[0][1] = sumX3;
        matriz[0][2] = sumX2;
        matriz[1][0] = sumX3;
        matriz[1][1] = sumX2;
        matriz[1][2] = sumX;
        matriz[2][0] = sumX2;
        matriz[2][1] = sumX;
        matriz[2][2] = n;
        //Valores Y
        matriz[0][3] = sumX2Y;
        matriz[1][3] = sumXY;
        matriz[2][3] = sumY;

        //Gauss Jordan
        for (int i = 0; i<  matriz.length; i++){
            double piv = matriz[i][i];
            for (int j = 0; j < matriz[0].length;j++){
                matriz[i][j] /= piv;
            }
            for (int j = 0; j < matriz.length; j++){
                double factor = matriz[j][i];
                if (j != i){
                    for (int k = 0; k < matriz[0].length;k++){
                        matriz[j][k] -= factor * matriz[i][k];
                    }
                }
            }
        }
        return new Modelo(matriz[2][3],matriz[1][3],matriz[0][3]);
        }


}