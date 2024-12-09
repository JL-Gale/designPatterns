public class Main {
    public static void main(String[] args) {
        var animal = AnimalFactory.getInstance();
        Animal tipo = animal.animal(TipoAnimal.LORO);
        tipo.sonido();
    }
}
