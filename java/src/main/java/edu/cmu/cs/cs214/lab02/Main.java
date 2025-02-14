package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Square;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Дүрсээ сонгоно уу: (1) Rectangle, (2) Circle, (3) Square");
        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.println("Тэгш өнцөгтийн урт өргөнийг оруул:");
                double height = scanner.nextDouble();
                double width = scanner.nextDouble();
                shape = new Rectangle(height, width);
                break;
            case 2:
                System.out.println("Радиус оруул:");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 3:
                System.out.println("Кватратын талбайг оруул:");
                double side = scanner.nextDouble();
                shape = new Square(side);
                break;
            default:
                System.out.println("1-3 хооронд сонгоно уу!");
                scanner.close();
                return;
        }

        
        System.out.println("Area: " + shape.getArea());

        scanner.close();
    }
}
