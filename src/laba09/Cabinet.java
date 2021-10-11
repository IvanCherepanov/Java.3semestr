package laba09;

public class Cabinet extends Client {
    public Cabinet(String INN, String name) {
        super(INN, name);
    }
    public void CheckINN(String inn) throws MyException {
        if(inn.length() != 10)
            throw new MyException("Недействительный ИНН: "+inn);
    }
    public static void Check(Cabinet cabinet){
        try {
            cabinet.CheckINN(cabinet.getINN());
            System.out.println("ИНН: " + cabinet.getName() + " - действителен");
        }
        catch (MyException myException){
            myException.getMessage();
            System.out.println(myException.getMessage());
        }
    }
}
