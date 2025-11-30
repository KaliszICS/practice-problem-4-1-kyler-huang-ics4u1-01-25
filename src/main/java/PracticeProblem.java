public class PracticeProblem {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        Circle c = new Circle(2);
        Person p = new Person("Alice", 25, 170, 60, "Blue", "Brown");

        System.out.println("Rectangle area: " + r.area());
        System.out.println("Circle circumference: " + c.circumference());
        System.out.println("Person's name: " + p.getName());
    }
}

// Non-public Rectangle class
class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }

    public double area() { return length * width; }
    public double perimeter() {
    if (length == 0 || width == 0) {
        return 0;
    }
    return 2 * (length + width);
}

}

// Non-public Circle class
class Circle {
    private double radius;

    public Circle(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }

    public double area() { return 3.14 * radius * radius; }
    public double circumference() { return 2 * 3.14 * radius; }
}

// Non-public Person class
class Person {
    private String name;
    private int age, height, weight;
    private String eyeColour, hairColour;

    public Person(String name, int age, int height, int weight, String eyeColour, String hairColour) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }
    public String getEyeColour() { return eyeColour; }
    public String getHairColour() { return hairColour; }
}
