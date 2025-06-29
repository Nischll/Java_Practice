import practice.*;
import practice.customException.ValidationException;
import practice.entity.User;
import practice.enums.Gender;
import practice.enums.Role;
import practice.service.LoginCredentialService;
import practice.service.UserService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        primitive date types
//        int age = 23;  // Stack Memory
//        double pi = 3.14;  // Stack Memory
//        char grade = 'A';  // Stack Memory
//        boolean isStudent = true;  // Stack Memory

//        type casting
//        final double test = 500;
//        int test2 = (int)test;

//        System.out.println("age" +age + ", " + pi + ", " + grade + ", " + isStudent +", " + test2);

//        string & string pool
//        String s1 = "one";
//        String s2 = "one";  // Heap Memory
//        String s3 = new String("one");

//        System.out.println(s1 == s2);  // true (same pool reference)
//        System.out.println(s1 == s3);  // false (new object)
//        System.out.println(s1.equals((s3)));  // true (checks value)

//        Ternary Operator
//        String gender = "M";
//        String result = (gender == "M") ? "Male" : " Female";

//        System.out.println(result);

//        Loops in Java
//    for ( int i = 0; i <= 7 ; i++){
//        System.out.println("test " + i);
//    }

//    int num = 4;
//    while (num <= 2) {
//        System.out.println("test " + num);
//        num++;
//    }

//    do{
//        System.out.println("num" + num);
//        num++;
//    } while (num <= 2);

//        For Each loop;
//    int[] nums = {1, 2, 3, 4, 5};
//    for (int num : nums){
//        System.out.println("test, " +num);
//    }

//        break and continue
//    for (int i = 1; i<=10; i++) {
//        if(i == 3) continue; // skip 3
//        if(i == 5) break;
//        System.out.println(i);
//    }


//OOP , CLASS, METHOD, CONSTRUCTOR;
//        Person firstPerson = new Person();
//        firstPerson.name = "Ram";
//        firstPerson.age = 25;
//
//        Person secondPerson = new Person();
//        secondPerson.age = 18;
//        secondPerson.name = "Nischal";
//
//        firstPerson.introduce();
//        secondPerson.introduce();

//        Person firstPerson = new Person("John", 45);
//        Person secondPerson = new Person("Harry");
//        Person defaultPerson = new Person();
//
//        firstPerson.introduce();
//        secondPerson.introduce();
//        defaultPerson.introduce();


//    GETTER / SETTER
//        Person p = new Person();
//        p.setData("Kaji", 44);
//
//        System.out.println("Name: " + p.getName());
//        System.out.println("Age: " + p.getAge());
//
//        p.introduce();

//        INHERITANCE;
//        Inheritance testInheritance = new Inheritance();
//        testInheritance.setData("Inheritance", 2);
//        testInheritance.introduce();  //inherited from Person class
//        testInheritance.child();

//        Employee employee = new Employee();
//        employee.introduce();

//        POLYMORPHISM;
//        Person poly = new Employee();
//        poly.introduce();

//        EXCEPTION HANDLING
//        ExceptionDemo t = new ExceptionDemo();
//        t.basicTryCatch();
//        t.withFinally();

//        try {
//            t.checkAge(17);
//        } catch (UnderAgeException e){
//            System.out.println("custom error: " +e.getMessage());
//        }

//        try{
//            t.divide(100, 100);
//        } catch (ArithmeticException e){
//            System.out.println("Error: " + e.getMessage());
//        } finally {
//            System.out.println("Finished.");
//        }


//        CUSTOM EXCEPTION;
//        UserService userService = new UserService();
//        try {
//            userService.registerUser("nnischal9156@gmail.c", "9823744524", 22, "Gokarna");
//        }catch (ValidationException e){
//            System.out.println("Error: " + e.getStatusCode() + ": " + e.getMessage());
//        }


//        ARRAYS;

//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(numbers[2]);
//        for (int number : numbers) {
//            System.out.println(number);
//        }

//        int[][] twoDimensional = {{1,2}, {2,2}, {1,2}};
//        System.out.println(twoDimensional[1][0]);
//
//        int[] scores = {70, 55, 90, 80, 65, 46};
//        Enhanced Loop;
//        for(int val : scores){
//            System.out.println("Score: " + val);
//        }
//
//        int sum = 0;
//        for(int score : scores){
//            sum += score;
//        }
//        double average = (double)sum / scores.length;
//        System.out.println("total: " + sum);
//        System.out.println("total count : " + scores.length);
//        System.out.println("average: " + average);

//        Array List;
//        ArrayList<String> users = new ArrayList<>();
//
//        users.add("Nischal");
//        users.add("Kaji");
//        users.add("Lama");
//        users.add("Rai");
//        users.remove(3);
//
//        System.out.println("index 1: " + users.get(1));
//        System.out.println("total users: " + users.size());
//
//        users.clear();
//
//        for(String user: users){
//            System.out.println("User: " + user);
//        }

//        ArrayList<Integer> scores = new ArrayList<>();
//
//            scores.add(99);
//            scores.add(45);
//            scores.add(55);
//            scores.add(68);
//            scores.add(23);
//
//            for(int score: scores){
//                System.out.println("Score: " + score);
//            }
//
//            scores.removeFirst();
//
//            System.out.println("---------------:After Removing:---------------");
//            for(int score: scores){
//                System.out.println("Final score: " + score);
//        }

//        ArrayList<User> userList = new ArrayList<>();
//
//        userList.add(new User("Nischal", 22));
//        userList.add(new User("Thapa", 25));
//        userList.add(new User("Rai", 14));
//        userList.add(new User("Lama", 12));
//
//        for(User u: userList){
//            System.out.println("hey!! " + u.getName() + ", " + u.getAge());
//        }
//
//        for(User user: userList){
//            if(user.getAge() < 18){
//                System.out.println(user.getName() + " " + "is under age" +" (" + user.getAge() + ")");
//            }
//        }
//
//        String toRemove = "Nischal";
//        int targetAge = 12;
//        userList.removeIf(user -> user.getName().equalsIgnoreCase(toRemove));
//        userList.removeIf(user -> user.getAge() == targetAge);
//
//        System.out.println("After removing name "+ toRemove + " : ");
//        for(User updated: userList){
//            System.out.println( updated.getName());
//        }
//
//        userList.sort((a,b) -> Integer.compare(a.getAge(), b.getAge()));
//        System.out.println("Sorted by age");
//        for(User sortedOne: userList){
//            System.out.println(sortedOne.getAge());
//        }
//
//        userList.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
//        System.out.println("Sorted by name: ");
//        for (User nameSorted: userList){
//            System.out.println(nameSorted.getName());
//        }

//        HASH MAP;
//        basic hashmap;
//        HashMap<String, Integer> users = new HashMap<>();
//        users.put("Nischal", 22);
//        users.put("Thapa", 18);
//        users.put("Rai", 16);
//
//        System.out.println("Hash Map: " + users.get("Thapa"));
//        System.out.println("Hash Map: " + users.values());

//        User u1 = new User();
//        User u2 = new User();
//        u1.setData("Chandrey", 34);
//        u2.setData("Tupi", 34);
//
//        HashMap<Integer, User> userMap = new HashMap<>();
//        userMap.put(0, u1);
//        userMap.put(5, u2);

//        User user = userMap.get(5);
//        System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());

//        for(Map.Entry<Integer, User> entry: userMap.entrySet()){
//            int id = entry.getKey();
//            User u = entry.getValue();
//            System.out.println(id + ": " + u.getName() + ", " + u.getAge());
//        }

//        Gender gender = Gender.FEMALE;
//        if(gender == Gender.FEMALE){
//            System.out.println("Its a girl!");
//        }
//
//        for(Gender g: Gender.values()){
//            System.out.println("Gender enums: " + g);
//        }

//        User user = new User();
//        user.setData("Nischal", 22, Role.SUPERADMIN);
//        System.out.println(user.getName() + " is " + user.getRole());

//        File Handling;
//        try{
//            FileWriter writer = new FileWriter("output.html", true);
//            writer.write("<h3> Java File Handling </h3> <span> Testing  </span> \n <span> and Java practice </span> \n");
//            writer.write("<div> Hello <strong>HTML</strong> </div> \n");
//            writer.close();
//            System.out.println("Data written to file.");
//        } catch(IOException e) {
//            System.out.println("Error writing file: " + e.getMessage());
//        }
//
//        try{
//            File file = new File("output.html");
//            Scanner reader = new Scanner(file);
//
//            while (reader.hasNextLine()){
//                String line = reader.nextLine();
//                System.out.println("output reader: " + line);
//            }
//            reader.close();
//        } catch(FileNotFoundException e){
//            System.out.println("file not found. " + e.getMessage());
//        }

//        String[] users = {"Nischal", "Tupi", "Baun"};

//       try{
//           FileWriter writer = new FileWriter("user.html");
////           writer.write("<html><body>\n");
//           writer.write("<h2>User List</h2>\n");
//           writer.write("<ol>");
//
//           for(String u: users){
//               writer.write("<li>" + u + "</li>\n");
//           }
//           writer.write("</ol>");
//
//
//           writer.close();
//       } catch(IOException e) {
//           System.out.println("file not found. " + e.getMessage());
//       }


//        Write File;
//        CSV FIle;
//        ArrayList<User> users = new ArrayList<>();
//        users.add(new User("nischall", 12, Role.ADMIN));
//        users.add(new User("Tupi", 30, Role.USER));
//        users.add(new User("Tupi", 30, Role.USER));
//        users.add(new User("Tupi", 30, Role.USER));
//        users.add(new User("Tupi", 30, Role.USER));
//
//        try{
//            FileWriter csvFile = new FileWriter("users.csv");
//            csvFile.write("Name,  Age,  Role\n");
//
//            for(User u : users){
//                csvFile.write(u.getName() + ", " + u.getAge() + ", " + u.getRole() + " \n");
//            }
//            csvFile.close();
//            System.out.println("File writing successful!");
//        } catch (IOException e) {
//            System.out.println("Error writing File: " + e.getMessage());
//        }

//        Read CSV File;
//        try{
//            File file = new File("users.csv");
//            Scanner reader = new Scanner(file);
//
//            boolean skipHeader = true;
//            while (reader.hasNextLine()){
//                String line = reader.nextLine();
//
//                if(skipHeader){
//                    skipHeader = false;
//                    continue;
//                }
//
//                String[] parts = line.split(",");
//                String name = parts[0].trim();
//                int age = Integer.parseInt(parts[1].trim());
//                Role role = Role.valueOf(parts[2].trim());
//
//                System.out.println("Name: "+ name + ", Age: " + age + ", " + "Role: " + role);
//            }
//            reader.close();
//        } catch (FileNotFoundException e){
//            System.out.println("File not found: " + e.getMessage());
//        }

        LoginCredentialService loginService = new LoginCredentialService();

        loginService.registerLogin("nischal", "Admin@123");
        loginService.registerLogin("kaley", "Kaley@123");
        loginService.registerLogin("kaji", "Kaji@123");
        loginService.registerLogin("fuchey", "Fuchey@123");

        System.out.println("\nAll users:");
        loginService.listAllUsers();

    }
}