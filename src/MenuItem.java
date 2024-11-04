import java.util.Scanner;

/**
 * Represents an individual menu item, which performs an action when selected.
 * Extends `ComponenteMenu`, and serves as a leaf node in the menu hierarchy
 * (i.e., it has no children).
 */
public class MenuItem extends ComponenteMenu {

    /**
     * Constructs a `MenuItem` with a specified name and scanner for user input.
     *
     * @param nombre The name of the menu item.
     * @param sc     The Scanner object used for handling user input.
     */
    protected MenuItem(String nombre, Scanner sc) {
        super(nombre, sc);
    }

    /**
     * Executes the action associated with the menu item, displaying a message
     * and then returning to the parent menu.
     */
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando " + this.nombre);

        // Return to the parent menu after executing the item action
        if (this.padre != null) {
            this.padre.ejecutar();
        }
    }
}
