package structural_patterns.Facade.v1;

public class Main {
    public static void main(String[] args) {
        InputReadFacade readFacade = new InputReadFacade();
        System.out.println(readFacade.read());
    }
}
