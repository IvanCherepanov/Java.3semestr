package laba10.ComplexFactory;
/**
 * Для каждой вариации семейства продуктов мы должны создать свою собственную фабрику,
 * реализовав абстрактный интерфейс. Фабрики создают продукты одной вариации.
 * */
public class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real,image);
    }
}
