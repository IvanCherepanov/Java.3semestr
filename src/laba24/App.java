package laba24;
// генерирование исключения оператором throw
// решение квадратного уравнения
class QuadraticEquation {
    double a,b,c,x1,x2;

    // конструктор
    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // метод, который решает квадратное уравнение
    void Solution() {
        double d; // дискриминант

        try {
            d = b*b - 4*a*c;

            // учесть деление на 0
            if (a==0)
                throw new ArithmeticException("Деление на 0."); // создать исключение

            // учесть корень из отрицательного числа
            if (d<0)
                throw new ArithmeticException("Уравнение не имеет корней."); // создать исключение

            x1 = (-b - Math.sqrt(d))/(2*a);
            x2 = (-b + Math.sqrt(d))/(2*a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        catch (ArithmeticException e) {
            System.out.println(e); // вывести исключение, созданное в блоке try
        }
    }
}
public class App {
    public static void main(String[] args) {
// создать екземпляр класса
        QuadraticEquation qE = new QuadraticEquation(1,1,1);
        qE.Solution(); // вызвать метод, решающий уравнение
        System.out.println("-------------------------");

        // создать другой екземпляр класса
        QuadraticEquation qE2 = new QuadraticEquation(0,3,5);
        qE2.Solution();
        System.out.println("-------------------------");

        QuadraticEquation qE3 = new QuadraticEquation(2,3,-5);
        qE3.Solution();

    }// end main
}
