import java.util.Scanner;

/**
 * Abstract base class representing a generic menu component.
 * This can serve as a parent class for both `Menu` (a collection of menu items)
 * and `MenuItem` (an individual action).
 * Provides common attributes like name and a reference to the parent component
 * for hierarchical structure.
 */
abstract class ComponenteMenu {
    protected ComponenteMenu padre; // Reference to the parent component in the menu hierarchy
    protected String nombre; // Name of the menu component
    protected Scanner sc; // Scanner for handling user input

    /**
     * Constructs a `ComponenteMenu` with a specified name and input scanner.
     *
     * @param nombre The name of the menu component.
     * @param sc     The Scanner object used for handling user input.
     */
    protected ComponenteMenu(String nombre, Scanner sc) {
        this.padre = null; // Initializes without a parent by default
        this.nombre = nombre;
        this.sc = sc;
    }

    /**
     * Abstract method to execute the menu component's action.
     * This method must be implemented by subclasses to define specific behavior for
     * each menu component.
     */
    abstract void ejecutar();
}
