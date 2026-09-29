# Assignment 3 — Bridge Pattern

Topic: food orders served on a plate or packed for takeaway.

The program separates **what food is ordered** from **how it is served**.
A pizza or burger can use either serving method. The method can change while
the program is running, without creating a new order.

## Bridge components

| Role | Class or interface | Responsibility |
| --- | --- | --- |
| Abstraction | `FoodOrder` | Holds a `ServingMethod` reference and allows changing it. |
| Refined Abstractions | `PizzaOrder`, `BurgerOrder` | Represent the food and delegate serving to `ServingMethod`. |
| Implementor | `ServingMethod` | Declares `serve(String foodName)`. |
| Concrete Implementors | `PlateServing`, `TakeawayServing` | Provide the two serving methods. |
| Client | `Main` | Combines orders with serving methods and switches them at runtime. |

The `servingMethod` field is the bridge between the two class hierarchies.
For example, `pizzaOrder.setServingMethod(takeawayServing)` changes the serving
method of the existing pizza order. `PizzaOrder` does not need to change.

## Five Clean Code principles

1. **Separate responsibilities.** Order classes identify the food; serving
   classes handle how it is served. This keeps changes to one side independent
   of the other. After choosing the objects, `Main` uses the common order API.
2. **Meaningful names.** Names such as `PizzaOrder`, `ServingMethod` and
   `setServingMethod` explain each class or method without extra comments.
3. **Small, focused classes and methods.** Each class has one role, and each
   `serve` method performs one short action. This makes the code easy to follow.
4. **Avoid duplicated logic.** Both food types reuse the same serving classes;
   there are no separate pizza and burger versions of each serving method.
   The two implementors contain only their own serving action. Reference storage
   and switching are implemented once in `FoodOrder`.
5. **Extend without changing existing abstractions.** A new serving method can
   implement `ServingMethod` and be passed to any existing order. `FoodOrder`,
   `PizzaOrder` and `BurgerOrder` need no changes, because they depend on the
   interface rather than on a particular serving class.

## Run in IntelliJ IDEA

Requires JDK 17 or newer. No external libraries are needed.

1. Choose **File → Open** and select this project folder.
2. If IDEA asks for an SDK, choose your installed JDK under
   **File → Project Structure → Project → SDK**.
3. Open `src/Main.java`.
4. Click the green triangle next to `main` and choose **Run 'Main.main()'**.
5. Read the output in the **Run** panel at the bottom.

## Expected output

```text
Initial orders:
Pizza is served on a plate.
Burger is packed in a takeaway box.

Switching pizza to takeaway:
Pizza is packed in a takeaway box.

Switching burger to a plate:
Burger is served on a plate.
```

This demonstrates all four combinations using the same two order objects.

Alternatively, from the project folder:

```sh
javac -d out src/*.java
java -cp out Main
```
