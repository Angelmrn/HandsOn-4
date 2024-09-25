import java.util.ArrayList;

public class Data {
    int index;
    double x,y;

    public Data(int index, double x, double y) {
        this.index = index;
        this.x = x;
        this.y = y;
    }

    public static ArrayList<Data> Datos = new ArrayList<Data>();
    public static ArrayList<Data> QR(){
        Datos.add(new Data(1,108,95));
        Datos.add(new Data(1,115,96));
        Datos.add(new Data(1,106,95));
        Datos.add(new Data(1,97,97));
        Datos.add(new Data(1,95,93));
        Datos.add(new Data(1,91,94));
        Datos.add(new Data(1,97,95));
        Datos.add(new Data(1,83,93));
        Datos.add(new Data(1,83,92));
        Datos.add(new Data(1,78,86));
        Datos.add(new Data(1,54,73));
        Datos.add(new Data(1,67,80));
        Datos.add(new Data(1,56,65));
        Datos.add(new Data(1,53,69));
        Datos.add(new Data(1,61,77));
        Datos.add(new Data(1,115,96));
        Datos.add(new Data(1,81,87));
        Datos.add(new Data(1,78,89));
        Datos.add(new Data(1,30,60));
        Datos.add(new Data(1,45,63));
        Datos.add(new Data(1,99,95));
        Datos.add(new Data(1,32,61));
        Datos.add(new Data(1,25,55));
        Datos.add(new Data(1,28,56));
        Datos.add(new Data(1,90,94));
        Datos.add(new Data(1,89,93));
        return Datos;
    }


    public static ArrayList<Data> datos70 = new ArrayList<Data>();
    public static ArrayList<Data> datos30 = new ArrayList<Data>();
    public static ArrayList<Data> segdatos70 = new ArrayList<Data>();
    public static ArrayList<Data> segdatos30 = new ArrayList<Data>();
    

    //Primer segmentacion
    public static void ObtenerDatos70(){
        int size = Datos.size();
        int size70 = (int) (size * 0.7);

        for (int i = 0; i < size70; i++){
            datos70.add(Datos.get(i));
        }
    }
   
    public static void ObtenerDatos30(){
        int size = Datos.size();
        int size70 = (int) (size * 0.7);

        for (int i = size70; i < size; i++){
            datos30.add(Datos.get(i));
        }
    }

    //Segunda segmentacion
    public static void ObtenersegDatos30(){
        int size = Datos.size();
        int size30 = (int) (size * 0.3);

        for (int i = 0; i < size30; i++){
            segdatos30.add(Datos.get(i));
        }
    }

    public static void ObtenersegDatos70(){
        int size = Datos.size();
        int size30 = (int) (size * 0.3);

        for (int i = size30; i < size; i++){
            segdatos70.add(Datos.get(i));
        }
    }

   

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

}