public class Main {
    public static void main(String[] args) {
        Data.QR();
        Data.ObtenerDatos70();
        Data.ObtenerDatos30();
        Data.ObtenersegDatos30();
        Data.ObtenersegDatos70();

        QuadraticR QRmodelo = new QuadraticR();
        Modelo modelo = QRmodelo.QR(Data.datos70);
        Modelo modelo2 = QRmodelo.QR(Data.segdatos70);
        
        modelo.MostrarModelo(modelo, modelo2);
    }    
}
