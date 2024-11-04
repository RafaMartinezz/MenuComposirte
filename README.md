# Hierarchical Menu System

This Java project implements a hierarchical, text-based menu system that allows users to navigate through menus and submenus and execute individual menu actions. The system includes both composite menus and individual menu items, enabling complex nested structures and interactions, similar to a basic command-line application interface.

## Table of Contents

- [Overview](#overview)
- [Purpose](#purpose)
- [Features](#features)
- [Class Structure](#class-structure)
- [Input Format](#input-format)
- [Example Input and Output](#example-input-and-output)
- [Explanation](#explanation)

---

## Overview

The project defines a flexible and extensible menu structure that supports nested menus and individual actions. Each menu or menu item can be accessed and executed based on user input, allowing for a variety of interactions within the menu hierarchy. The `Menu` class can contain other `Menu` objects or `MenuItem` objects, while `MenuItem` represents an action within a menu.

## Purpose

This project serves as a **learning exercise** in:
- Implementing the **Composite design pattern** to manage hierarchical structures with composite (`Menu`) and leaf (`MenuItem`) nodes.
- Utilizing **polymorphism** with an abstract base class (`ComponenteMenu`) to handle different types of menu components.
- Building **nested menu systems** that simulate command-line interfaces, with options for returning to parent menus and exiting the program.

## Features

- **Hierarchical Structure**: Allows creation of nested menus and individual menu items, supporting complex navigation structures.
- **Composite Design Pattern**: Uses `ComponenteMenu` as a base class to enable both `Menu` and `MenuItem` components.
- **User Interaction**: Users can navigate menus, execute menu items, and return to parent menus, creating a dynamic and interactive menu system.
- **Exit Option**: Provides an option to exit the current menu and return to the parent or close the application.

## Class Structure

- **`ComponenteMenu`**: Abstract base class for all menu components. Holds common attributes such as the name, a reference to the parent component, and a scanner for user input.
- **`Menu`**: Represents a composite menu that can contain other `ComponenteMenu` objects (both `Menu` and `MenuItem`). Displays options to the user and allows navigation within the menu hierarchy.
- **`MenuItem`**: Represents an individual action within a menu. When executed, it displays a message and returns to the parent menu.
- **`Main`**: Demonstrates creating a sample menu hierarchy with both menus and menu items, and starts the menu interaction.

## Input Format

The program expects user input in the form of integers corresponding to menu options. After each action, the program either returns to the parent menu or exits based on user selection:
1. **Menu Selection**: Users are prompted to select an option by entering the corresponding number.
2. **Execution and Return**: After executing a `MenuItem`, the program returns to the parent menu. If the user selects "Exit," the program either returns to the previous menu or terminates if it’s the main menu.

### Example

A sample interaction might look like this:

```plaintext
Menú Mi Editor
-----------
0. Archivo
1. Editar
2. Salir
Teclea número opcion
```

## Example Input and Output

### Input

1. User selects **"Archivo"**.
2. In the `Archivo` menu, the user selects **"Nuevo archivo"**.

### Output

```plaintext
Menú Mi Editor
-----------
0. Archivo
1. Editar
2. Salir
Teclea número opcion
0
Menú Archivo
-----------
0. Nuevo archivo
1. Abrir archivo
2. Guardar archivo
3. Salir
Teclea número opcion
0
ejecutando Nuevo archivo
```

### Explanation

- **Menu Navigation**: The user navigates to `Archivo`, selects `Nuevo archivo`, and executes it.
- **Return to Parent**: After executing `Nuevo archivo`, the program returns to the `Archivo` menu.

## Explanation

The project’s structure supports both individual actions and navigation within nested menus. This approach allows for flexible expansion by simply adding new `Menu` or `MenuItem` instances to the hierarchy.