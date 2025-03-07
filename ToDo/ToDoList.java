import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        
        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int input = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (input) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    System.out.println("Enter task number to remove:");
                    int index = scanner.nextInt();
                    if (index >= 1 && index <= toDoList.size()) {
                        String removedTask = toDoList.remove(index - 1); 
                    System.out.println("Task removed: " + removedTask);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 3:
                    System.out.println("\nYour To-Do List:");
                    if (toDoList.isEmpty()) {
                        System.out.println("No tasks found.");
                    } else {
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Have a productive day:)");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
