package laba10.ComplexFactory;
/**
 * Используйте паттерн Абстрактная Фабрика в таких случаях:
 *      система не должна зависеть от способа создания объектов;
 *      система работает с одним из нескольких семейств объектов;
 *      объекты внутри семейства взаимосвязаны.
 * Плюсы:
 *  Гарантирует сочетаемость создаваемых продуктов.
 *  Избавляет клиентский код от привязки к конкретным классам продуктов.
 *  Выделяет код производства продуктов в одно место, упрощая поддержку кода.
 *  Упрощает добавление новых продуктов в программу.
 *  Реализует принцип открытости/закрытости.
 * Минусы
 *  Усложняет код программы из-за введения множества дополнительных классов.
 *  Требует наличия всех типов продуктов в каждой вариации.
 * **/
public class TestComplexClass {
    public static void main(String[] args) {
    ComplexAbstractFactory complexFactory = new ConcreteFactory();
    Complex c1 = complexFactory.createComplex(3, -7);
    Complex c2 = complexFactory.createComplex(24, 16);
    Complex c3 = c1.add(c2);
    Complex c4 = c1.multiple(c2);
    Complex c5 = complexFactory.createComplex(5,0);
    Complex c6 = c5.add(c1);
    Complex c7 = c5.multiple(c1);

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(c7);
    try {
        Complex с8= c2.division(c1);
        System.out.println(с8);
    } catch (Exception e) {
        e.printStackTrace();
    }
    Complex c9= complexFactory.createComplex();
    try {
        Complex c10=c1.division(c9);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
}
