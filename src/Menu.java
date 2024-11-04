import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Represents a hierarchical menu that can contain multiple menu items or
 * submenus.
 * Extends `ComponenteMenu` and allows adding child menu components, displaying
 * options, and executing selected actions.
 */
public class Menu extends ComponenteMenu {
    protected List<ComponenteMenu> hijos = new ArrayList<>(); // List of child menu components

    /**
     * Constructs a `Menu` instance with a specified name and scanner for user
     * input.
     *
     * @param nombre The name of the menu.
     * @param sc     The Scanner object for handling user input.
     */
    protected Menu(String nombre, Scanner sc) {
        super(nombre, sc);
    }

    /**
     * Displays the menu options to the user, takes input to select an option,
     * and executes the corresponding child component.
     * Offers an "Exit" option to either return to the parent menu or end the
     * program if no parent exists.
     */
    @Override
    public void ejecutar() {
        System.out.println("Menú " + this.nombre);
        System.out.println("-----------");

        // Display each child menu item with its index
        for (int i = 0; i < hijos.size(); i++) {
            System.out.println(i + ". " + hijos.get(i).nombre);
            if (i == hijos.size() - 1) {
                System.out.println(i + 1 + ". Salir");
            }
        }

        System.out.println("Teclea número opcion");
        int opcion = sc.nextInt();

        // If "Salir" is selected and there is a parent menu, return to it
        if (opcion == hijos.size() && this.padre != null) {
            this.padre.ejecutar();
        }
        // If "Salir" is selected and this is the main menu, exit
        else if (opcion == hijos.size() && this.padre == null) {
            System.out.println("Chao");
        }
        // Otherwise, execute the selected child component
        else {
            hijos.get(opcion).ejecutar();
        }
    }

    /**
     * Adds a new menu item or submenu to this menu, setting this menu as the new
     * item's parent.
     *
     * @param nuevoarchivo The new `ComponenteMenu` to add as a child of this menu.
     */
    public void addMenu(ComponenteMenu nuevoarchivo) {
        nuevoarchivo.padre = this; // Set this menu as the parent of the new item
        this.hijos.add(nuevoarchivo); // Add the new item to the list of children
    }
}
