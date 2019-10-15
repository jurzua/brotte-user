package cl.math;

public class MathHelper {

    public void myMethod(String name) {
        System.out.println("Hello " + name);
    }

    //calcular suma area de cuadrado y circunferencia y los parametros son el radio de la circunferencia y un lado del cuadrado
    // Ac = r2 * PI
    // Ar = L * L

    public static Double squareArea(Double l){
        Double result = l * l;
        return result;
    }

    public static Double circleArea(Double r){
        Double result = r * r * Math.PI;
        return result;
    }

    public static Double sumArea(Double lSquare, Double rCircle){
        Double sumResult = circleArea(rCircle) + squareArea(lSquare);
        return sumResult;
    }

}
