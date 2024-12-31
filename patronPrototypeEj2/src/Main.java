//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Jhon");
        usuario.setApellidos("Doe");
        usuario.setEdad(20);

        Usuario usuario2 = usuario.clone();

        System.out.println(usuario);
        System.out.println(usuario2);
    }
}
