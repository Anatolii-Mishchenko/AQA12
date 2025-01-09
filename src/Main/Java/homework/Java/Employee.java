package Main.Java.homework.Java;


public class Employee {
    public String fullName;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public void getInfoAboutEmployee() {
        System.out.println("Employee's name: " + fullName);
        System.out.println("Employee's position: " + position);
        System.out.println("Employee's email: " + email);
        System.out.println("Employee's phone number: " + phoneNumber);
        System.out.println("Employee's salary: " + salary);
        System.out.println("Employee's age: " + age);
    }

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }


    public int getAge() {
        return age;
    }

    public String getInfo() {
        return fullName + ": " + age + " " + "years old";
    }


    public void fiveEmployees() {

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Johnny Depp", "Cashier", "jdepp@gmail.com", "321654987", 15000, 61);
        employeesArray[1] = new Employee("Mike Tyson", "Nanny", "mtyson@gmail.com", "123456789", 10000, 58);
        employeesArray[2] = new Employee("Sydney Sweeney", "Welder", "ssweeney@gmail.com", "987654321", 30000, 27);
        employeesArray[3] = new Employee("Azamat Aitaliev", "Clown", "aaitaliev@gmail.com", "789456123", 500, 34);
        employeesArray[4] = new Employee("Jason Statham", "Poet", "jstatham@gmail.com", "777999333", 300000, 57);

        System.out.println("Employee older than 40: ");
        for (Employee employeeAge : employeesArray) {
            if (employeeAge.getAge() > 40) {
                System.out.println(employeeAge.getInfo());


            }
        }
    }
}
