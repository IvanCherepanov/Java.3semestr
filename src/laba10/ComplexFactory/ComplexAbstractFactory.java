package laba10.ComplexFactory;
/**
* Абстрактная фабрика — общий интерфейс, который содержит методы создания всех продуктов семейства
* */
public interface ComplexAbstractFactory {
    public Complex createComplex();
    public Complex createComplex(int real, int image);
}
