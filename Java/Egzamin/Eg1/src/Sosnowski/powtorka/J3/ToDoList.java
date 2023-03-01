package Sosnowski.powtorka.J3;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz polecenie: ");
            String command = scanner.nextLine();
            if (command.startsWith("dodaj ")) {
                String[] parts = command.split(" ", 3);
                int priority = Integer.parseInt(parts[1]);
                String description = parts[2];
                tasks.add(new Task(priority, description));
            } else if (command.equals("następne")) {
                Task nextTask = tasks.poll();
                if (nextTask == null) {
                    System.out.println("Brak zadań do wykonania.");
                } else {
                    System.out.println("Następne zadanie: " + nextTask.getDescription());
                }
            } else if (command.equals("zakończ")) {
                break;
            } else {
                System.out.println("Nieznane polecenie.");
            }
        }
    }
}