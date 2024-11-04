import java.util.Scanner;

/**
 * Main class that demonstrates a hierarchical menu system.
 * Creates menus and menu items for a simple text editor application with
 * options to
 * create, open, save, copy, and paste files.
 * The program utilizes a `Menu` and `MenuItem` structure to build a nested menu
 * system.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Create menu items for file operations
        MenuItem nuevoarchivo = new MenuItem("Nuevo archivo", sc);
        MenuItem abrirarchivo = new MenuItem("Abrir archivo", sc);
        MenuItem guardararchivo = new MenuItem("Guardar archivo", sc);

        // Create the "Archivo" menu and add file operation items
        Menu archivo = new Menu("Archivo", sc);
        archivo.addMenu(nuevoarchivo);
        archivo.addMenu(abrirarchivo);
        archivo.addMenu(guardararchivo);

        // Create menu items for edit operations
        MenuItem copiar = new MenuItem("Copiar", sc);
        MenuItem pegar = new MenuItem("Pegar", sc);

        // Create the "Editar" menu and add edit operation items
        Menu editar = new Menu("Editar", sc);
        editar.addMenu(copiar);
        editar.addMenu(pegar);

        // Create the main menu and add "Archivo" and "Editar" submenus
        Menu MiMenu = new Menu("Mi Editor", sc);
        MiMenu.addMenu(archivo);
        MiMenu.addMenu(editar);

        // Execute the main menu, which displays all options and handles user input
        MiMenu.ejecutar();
    }
}
