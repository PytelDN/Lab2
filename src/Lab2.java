import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lab2 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Point3d[] point3ds = new Point3d[3];
            for (int i = 0; i < 3; i++){
                point3ds[i] = new Point3d();
                System.out.println("Точка номер "+(i+1));
                System.out.println("Введите координаты x");
                point3ds[i].setX(Double.parseDouble(reader.readLine()));
                System.out.println("Введите координаты y");
                point3ds[i].setY(Double.parseDouble(reader.readLine()));
                System.out.println("Введите координаты z");
                point3ds[i].setZ(Double.parseDouble(reader.readLine()));
            }

            System.out.println("Площадь треугольника = "+computeArea(point3ds));
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static double computeArea(Point3d[] point3ds){
        if (point3ds[0].equals(point3ds[1])||point3ds[0].equals(point3ds[2])||point3ds[1].equals(point3ds[2])){
            System.out.println("Невозможно создать треугольник, есть эквивалентные точки");
            return 0.0;
        } else {
            double ab = Double.parseDouble(point3ds[0].distanceTo(point3ds[1]));
            double bc = Double.parseDouble(point3ds[1].distanceTo(point3ds[2]));
            double ca = Double.parseDouble(point3ds[2].distanceTo(point3ds[0]));
            double p = (ab+bc+ca)/2;
            return Math.sqrt(p*(p-ab)*(p-bc)*(p-ca));
        }

    }
}
