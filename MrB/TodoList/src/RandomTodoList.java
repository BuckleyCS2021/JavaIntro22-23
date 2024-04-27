import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomTodoList {
    private ArrayList<String> todoList;
    private ArrayList<String> completedItems;
    private Random random;

    public RandomTodoList() {
        todoList = new ArrayList<>();
        completedItems = new ArrayList<>();
        random = new Random();
    }

    public void addTodoItem(String item) {
        todoList.add(item);
    }
    public void printListNow() {
        for (int k = 0; k < todoList.size(); k++) {
            System.out.println(todoList.get(k));
            System.out.println(completedItems.get(k));
        }
    }
    public void printRandomItem() {
        if (todoList.isEmpty()) {
            System.out.println("Todo list is empty!");
            return;
        }

        if (completedItems.size() == todoList.size()) {
            System.out.println("You have completed all the tasks in your todo list!");
            return;
        }



        String randomItem;
        do {
            randomItem = todoList.get(random.nextInt(todoList.size()));
        } while (completedItems.contains(randomItem));

        System.out.println("Random Todo Item: " + randomItem);
        completedItems.add(randomItem);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomTodoList todoListManager = new RandomTodoList();

        System.out.println("Welcome to Random Todo List Manager!");
        System.out.println("Enter your todo list items (type 'done' to finish):");

        String input;
        while (true) {
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            todoListManager.addTodoItem(input);
        }

        System.out.println("\nRandomly selected todo list items:");


        while (true) {
            // Print the todo list each time before asking for user input
            todoListManager.printListNow();
            System.out.println("\nEnter 'print' to get a random item, or 'exit' to quit:");

            System.out.println("\nEnter 'print' to get a random item, or 'exit' to quit:");

            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("print")) {
                todoListManager.printRandomItem();
            } else {
                System.out.println("Invalid command! Please enter 'print' or 'exit'.");
            }
        }

        System.out.println("\nThank you for using Random Todo List Manager!");
    }
}
