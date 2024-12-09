public class AnimalFactory {
    private static AnimalFactory instance;

    private AnimalFactory() {}

    public static AnimalFactory getInstance() {
        if (instance == null){
            instance = new AnimalFactory();
            return instance;
        }
        return instance;
    }

    public Animal animal(TipoAnimal tipoAnimal){
        switch (tipoAnimal) {
            case GATO -> {
                return new Gato();
            }
            case PERRO -> {
                return new Perro();
            }
            case LORO -> {
                return new Loro();
            }
            default -> {
                return null;
            }
        }
    }
}
