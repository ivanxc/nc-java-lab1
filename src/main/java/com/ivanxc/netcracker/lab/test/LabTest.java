package com.ivanxc.netcracker.lab.test;

import com.ivanxc.netcracker.lab.partone.Author;
import com.ivanxc.netcracker.lab.partone.Book;
import com.ivanxc.netcracker.lab.partone.Circle;
import com.ivanxc.netcracker.lab.partone.Employee;
import com.ivanxc.netcracker.lab.partone.MyPoint;
import com.ivanxc.netcracker.lab.partone.MyTriangle;
import com.ivanxc.netcracker.lab.partone.Rectangle;
import com.ivanxc.netcracker.lab.parttwo.Ball;
import com.ivanxc.netcracker.lab.parttwo.Container;
import com.ivanxc.netcracker.lab.parttwo.MyComplex;
import com.ivanxc.netcracker.lab.parttwo.MyPolynomial;

public class LabTest {
    public static void circleTest() {
        Circle circle = new Circle();
        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle);

        System.out.println("====================");

        Circle circle2 = new Circle(2.0);
        System.out.println(circle2.getColor());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
        System.out.println(circle2);

        System.out.println("====================");

        Circle circle3 = new Circle(3.0, "Amethyst");
        System.out.println(circle3);
        circle3.setColor("Orchid");
        circle3.setRadius(4.0);
        System.out.println(circle3.getColor());
        System.out.println(circle3.getRadius());
        System.out.println(circle3.getArea());
        System.out.println(circle3);
    }

    public static void rectangleTest() {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle);

        System.out.println("====================");

        Rectangle rectangle2 = new Rectangle(3.0f, 4.0f);
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2);

        System.out.println("====================");

        rectangle2.setLength(5.0f);
        rectangle2.setWidth(6.0f);
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2);
    }

    public static void employeeTest() {
        Employee employee = new Employee(1, "Ivan", "Nikolaev", 1000);
        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee);

        employee.raiseSalary(20);
        System.out.println(employee.getSalary());
        employee.setSalary(1400);
        System.out.println(employee.getSalary());
        System.out.println(employee);
    }

    public static void bookTest() {
        Author author = new Author("Cay Horstmann", "cay@horstmann.com", 'm');
        Author author2 = new Author("Gary Cornell", "gary@cornell.com", 'm');
        Author author3 = new Author("Joshua Bloch", "joshua@bloch.com", 'm');

        Book book = new Book("Java Core: Fundamentals", new Author[] {author, author2}, 45);
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getQty());
        System.out.println(book.getAuthorNames());

        for(Author currentAuthor : book.getAuthors()) {
            System.out.println(currentAuthor.getName());
        }

        System.out.println(book);

        System.out.println("====================");

        Book book2 = new Book("Effective Java", new Author[] {author3}, 30, 1000);
        System.out.println(book2);
        book2.setPrice(29.0);
        book2.setQty(900);
        System.out.println(book2);
    }

    public static void myPointTest() {
        MyPoint myPoint = new MyPoint();
        System.out.println(myPoint.getX() + " " + myPoint.getY());
        System.out.println(myPoint.getXY()[0] + " " + myPoint.getXY()[1]);
        System.out.println(myPoint.distance());
        myPoint.setX(3);
        myPoint.setY(3);
        System.out.println(myPoint.distance());
        System.out.println(myPoint);
        myPoint.setXY(4, 4);
        System.out.println(myPoint);

        System.out.println("====================");

        MyPoint myPoint2 = new MyPoint(2, 2);
        System.out.println(myPoint.distance(myPoint2));
        System.out.println(myPoint2.distance(myPoint));
        System.out.println(myPoint2);
    }

    public static void myTriangleTest() {
        // Невозможно задать равносторонний треугольник с помощью целочисленных координат,
        // поэтому его нет в тесте.

        MyTriangle isoscelesTriangle = new MyTriangle(1, 1, 9, 1, 5, 2);
        System.out.println(isoscelesTriangle.getPerimeter());
        System.out.println(isoscelesTriangle.getType());
        System.out.println(isoscelesTriangle);

        System.out.println("====================");

        MyTriangle scaleneTriangle = new MyTriangle(0, 0, 3, 0, 3, 4);
        System.out.println(scaleneTriangle.getPerimeter());
        System.out.println(scaleneTriangle.getType());
        System.out.println(scaleneTriangle);

        System.out.println("====================");

        MyPoint myPoint = new MyPoint(0, 0);
        MyPoint myPoint2 = new MyPoint(3, 0);
        MyPoint myPoint3 = new MyPoint(3, 4);
        scaleneTriangle = new MyTriangle(myPoint, myPoint2, myPoint3);
        System.out.println(scaleneTriangle.getPerimeter());
        System.out.println(scaleneTriangle.getType());
        System.out.println(scaleneTriangle);


    }

    public static void myComplexTest() {
        MyComplex myComplex = new MyComplex();
        System.out.println(myComplex.getReal() + " " + myComplex.getImag());
        System.out.println(myComplex.isReal());
        System.out.println(myComplex.isImaginary());
        System.out.println(myComplex.magnitude());
        System.out.println(myComplex.argument());
        System.out.println(myComplex);

        System.out.println("====================");

        MyComplex myComplex2 = new MyComplex(2, 4);
        System.out.println(myComplex2.isReal());
        System.out.println(myComplex2.isImaginary());
        System.out.println(myComplex2.magnitude());
        System.out.println(myComplex2.argument());
        System.out.println(myComplex2.equals(myComplex));
        System.out.println(myComplex2.equals(myComplex2));
        System.out.println(myComplex2.equals(2, 4));
        System.out.println(myComplex2.conjugate());

        System.out.println("====================");

        MyComplex myComplex3 = new MyComplex(3, 5);
        System.out.println(myComplex2.addNew(myComplex3));
        System.out.println(myComplex2.subtractNew(myComplex3));
        myComplex.add(myComplex2);
        System.out.println(myComplex);

        myComplex.subtract(myComplex3);
        System.out.println(myComplex);

        myComplex.multiply(myComplex3);
        System.out.println(myComplex);

        myComplex.divide(myComplex2);
        System.out.println(myComplex);
    }

    public static void myPolynomialTest() {
        MyPolynomial myPolynomial = new MyPolynomial(1, 2, 3, 4, 5);
        MyPolynomial myPolynomial2 = new MyPolynomial(-5, -4, -3, -2, -1);

        System.out.println(myPolynomial.getDegree());
        System.out.println(myPolynomial);
        System.out.println(myPolynomial.evaluate(1));
        System.out.println(myPolynomial.evaluate(-1));

        System.out.println(myPolynomial2.getDegree());
        System.out.println(myPolynomial2);
        System.out.println(myPolynomial2.evaluate(1));
        System.out.println(myPolynomial2.evaluate(-1));

        System.out.println("====================");

        System.out.println(myPolynomial.add(myPolynomial));
        System.out.println(myPolynomial.add(myPolynomial2));
        System.out.println(myPolynomial.multiple(myPolynomial));
        System.out.println(myPolynomial.multiple(myPolynomial2));
        System.out.println(myPolynomial2.multiple(myPolynomial2));
    }

    public static void ballTest() {
        Ball ball = new Ball(5, 5, 1, 2, 90);
        Container container = new Container(0, 0, 10, 10);

        System.out.println(ball);
        System.out.println(container);
        System.out.println(container.collides(ball));

        for(int i = 0; i < 3; i++) {
            ball.move();
            System.out.println(ball);
            System.out.println(container.collides(ball));
        }

        System.out.println("====================");

        ball = new Ball(5, 5, 1, 2, 0);

        System.out.println(ball);
        System.out.println(container.collides(ball));

        for(int i = 0; i < 3; i++) {
            ball.move();
            System.out.println(ball);
            System.out.println(container.collides(ball));
        }

        System.out.println("====================");

        ball = new Ball(999, 999, 999, 1, 90);
        System.out.println(container.collides(ball));

        System.out.println("====================");

        try {
            ball = new Ball(5, 5, 1, 1, 270);
            System.out.println(container.collides(ball));
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
        }
    }
}
