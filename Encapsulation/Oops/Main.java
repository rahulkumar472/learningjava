


     /*class Person {
        // Declare a private variable to store the name of the person
        private String name;
        // Declare a private variable to store the age of the person
        private int age;
    
        // Constructor for the Person class that initializes the name and age variables
        public Person(String name, int age) {
            // Set the name variable to the provided name parameter
            this.name = name;
            // Set the age variable to the provided age parameter
            this.age = age;
        }
    
        // Method to retrieve the name of the person
        public String getName() {
            // Return the value of the name variable
            return name;
        }
    
        // Method to retrieve the age of the person
        public int getAge() {
            // Return the value of the age variable
            return age;
        }
    
        // Method to set the name of the person
        public void setName(String name) {
            // Set the name variable to the provided name parameter
            this.name = name;
        }
    
        // Method to set the age of the person
        public void setAge(int age) {
            // Set the age variable to the provided age parameter
            this.age = age;
        }
    }
     class Main2 {
        // Define the main method which is the entry point of the program
        public static void main(String[] args) {
            // Create an instance of the Person class with the name "Ean Craig" and age 11
            Person person1 = new Person("Ean Craig", 11);
            // Create another instance of the Person class with the name "Evan Ross" and age 12
            Person person2 = new Person("Evan Ross", 12);
    
            // Print the name and age of person1 to the console
            System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
            // Print the name and age of person2 to the console
            System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
    
            // Modify the age of person1 using the setter methods
            person1.setAge(14);
            // Modify the name and age of person2 using the setter methods
            person2.setName("Lewis Jordan");
            person2.setAge(12);
            System.out.println("Set new age and name:");
            // Print the updated name and age of person1 to the console
            System.out.println(person1.getName() + " is now " + person1.getAge() + " years old.");
            // Print the updated name and age of person2 to the console
            System.out.println(person2.getName() + " is now " + person2.getAge() + " years old.");
        }

    }
     class Dog {
        // Declare a private variable to store the name of the dog
        private String name;
        // Declare a private variable to store the breed of the dog
        private String breed;
    
        // Constructor for the Dog class that initializes the name and breed variables
        public Dog(String name, String breed) {
            // Set the name variable to the provided name parameter
            this.name = name;
            // Set the breed variable to the provided breed parameter
            this.breed = breed;
        }
    
        // Method to retrieve the name of the dog
        public String getName() {
            // Return the value of the name variable
            return name;
        }
    
        // Method to set the name of the dog
        public void setName(String name) {
            // Set the name variable to the provided name parameter
            this.name = name;
        }
    
        // Method to retrieve the breed of the dog
        public String getBreed() {
            // Return the value of the breed variable
            return breed;
        }
    
        // Method to set the breed of the dog
        public void setBreed(String breed) {
            // Set the breed variable to the provided breed parameter
            this.breed = breed;
        }
    } 
    public  class Main {
        // Define the main method which is the entry point of the program
        public static void main(String[] args) {
            // Create an instance of the Dog class with the name "Buddy" and breed "Golden Retriever"
            Dog dog1 = new Dog("Buddy", "Golden Retriever");
            // Create another instance of the Dog class with the name "Charlie" and breed "Bulldog"
            Dog dog2 = new Dog("Charlie", "Bulldog");
    
            // Print the name and breed of dog1 to the console
            System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
            // Print the name and breed of dog2 to the console
            System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");
    
            // Print a message indicating that the breed of dog1 and the name of dog2 will be changed
            System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
            // Change the breed of dog1 to "Labrador Retriever"
            dog1.setBreed("Labrador Retriever");
            // Change the name of dog2 to "Daisy"
            dog2.setName("Daisy");
    
            // Print the updated name and breed of dog1 to the console
            System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
            // Print the updated name and breed of dog2 to the console
            System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");
        }
    } 
     class Rectangle {
        // Declare a private variable to store the width of the rectangle
        private double width;
        // Declare a private variable to store the height of the rectangle
        private double height;
    
        // Constructor for the Rectangle class that initializes the width and height variables
        public Rectangle(double width, double height) {
            // Set the width variable to the provided width parameter
            this.width = width;
            // Set the height variable to the provided height parameter
            this.height = height;
        }
    
        // Method to retrieve the width of the rectangle
        public double getWidth() {
            // Return the value of the width variable
            return width;
        }
    
        // Method to set the width of the rectangle
        public void setWidth(double width) {
            // Set the width variable to the provided width parameter
            this.width = width;
        }
    
        // Method to retrieve the height of the rectangle
        public double getHeight() {
            // Return the value of the height variable
            return height;
        }
    
        // Method to set the height of the rectangle
        public void setHeight(double height) {
            // Set the height variable to the provided height parameter
            this.height = height;
        }
    
        // Method to calculate and return the area of the rectangle
        public double getArea() {
            // Calculate the area by multiplying width and height, and return the result
            return width * height;
        }
    
        // Method to calculate and return the perimeter of the rectangle
        public double getPerimeter() {
            // Calculate the perimeter by adding width and height, multiplying by 2, and return the result
            return 2 * (width + height);
        }
    }
    public class Main {
        // Define the main method which is the entry point of the program
        public static void main(String[] args) {
            // Create an instance of the Rectangle class with the width 7 and height 12
            Rectangle rectangle = new Rectangle(7, 12);
    
            // Print the area of the rectangle to the console
            System.out.println("The area of the rectangle is " + rectangle.getArea());
            // Print the perimeter of the rectangle to the console
            System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
    
            // Set a new width for the rectangle
            rectangle.setWidth(6);
            // Set a new height for the rectangle
            rectangle.setHeight(12);
    
            // Print the updated area of the rectangle to the console
            System.out.println("\nThe area of the rectangle is now " + rectangle.getArea());
            // Print the updated perimeter of the rectangle to the console
            System.out.println("The perimeter of the rectangle is now " + rectangle.getPerimeter());
        }
    } */
     class TrafficLight {
  
        // Declare a private variable to store the color of the traffic light
        private String color;
        
        // Declare a private variable to store the duration of the traffic light in seconds
        private int duration;
      
        // Constructor for the TrafficLight class
        public TrafficLight(String color, int duration) {
          // Initialize the color of the traffic light
          this.color = color;
          
          // Initialize the duration of the traffic light
          this.duration = duration;
        }
      
        // Method to change the color of the traffic light
        public void changeColor(String newColor) {
          // Update the color variable to the new color
          color = newColor;
        }
      
        // Method to check if the traffic light is red
        public boolean isRed() {
          // Return true if the color is red, otherwise return false
          return color.equals("red");
        }
      
        // Method to check if the traffic light is green
        public boolean isGreen() {
          // Return true if the color is green, otherwise return false
          return color.equals("green");
        }
      
        // Method to get the duration of the traffic light
        public int getDuration() {
          // Return the duration value
          return duration;
        }
      
        // Method to set the duration of the traffic light
        public void setDuration(int duration) {
          // Update the duration variable to the new value
          this.duration = duration;
        }
      }
      public  class Main {
  
        // Main method, the entry point of the Java application
        public static void main(String[] args) {
          
          // Create a new TrafficLight object with initial color "red" and duration 30 seconds
          TrafficLight light = new TrafficLight("red", 30);
      
          // Print whether the traffic light is red
          System.out.println("The light is red: " + light.isRed());
          
          // Print whether the traffic light is green
          System.out.println("The light is green: " + light.isGreen());
      
          // Change the color of the traffic light to "green"
          light.changeColor("green");
      
          // Print whether the traffic light is now green
          System.out.println("The light is now green: " + light.isGreen());
          
          // Print the duration of the traffic light
          System.out.println("The light duration is: " + light.getDuration());
          
          // Set a new duration for the traffic light to 20 seconds
          light.setDuration(20);
          
          // Print the updated duration of the traffic light
          System.out.println("The light duration is now: " + light.getDuration());
        }
    }
    
    
