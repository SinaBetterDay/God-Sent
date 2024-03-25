import java.util.Scanner;

class Employee {
  private String fName;
  private String lName;
  private Employee boss = null;
  private Address addr;
  private static int count;

  {
    count++;
  }

  public Employee(String fName, String lName) {
    this.fName = fName;
    this.lName = lName;
  }

  public Employee(String fName, String lName, Employee boss) {
    this(fName, lName);
    this.boss = boss;
  }

  public Employee(String fName, String lName, Employee boss, Address addr) {
    this(fName, lName, boss);
    this.addr = addr;
  }

  public String getFName() {
    return fName;
  }

  public String getLName() {
    return lName;
  }

  public Employee getBoss() {
    return boss;
  }

  public Address getAddr() {
    return addr;
  }

  public static int getCount() {
    return count;
  }

  public void displayInfo() {
    System.out.println("----------------------");
    System.out.println("Employee: " + fName + " " + lName);

    if (addr != null) {
      System.out.println("City: " + addr.getCity());
      System.out.println("State: " + addr.getState());
    } else {
      System.out.println("City: Unknown");
      System.out.println("State: Unknown");
    }

    System.out.println("Boss: " + (boss != null ? boss.getFName() + " " + boss.getLName() : "None"));
  }
}

class Address {
  private String city;
  private String state;

  public Address(String city, String state) {
    this.city = city;
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }
}

public class Driver {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    Employee emp1 = createEmployee(scnr, null);
    Employee emp2 = createEmployee(scnr, emp1);
    Employee emp3 = createEmployee(scnr, emp2);

    emp1.displayInfo();
    emp2.displayInfo();
    emp3.displayInfo();

    System.out.println("----------------------");
  }

  private static Employee createEmployee(Scanner scnr, Employee previousEmployee) {
    System.out.print("Enter employee name (first, last): ");
    String fName = scnr.next();
    String lName = scnr.next();

    Address addr = null;

    if (Employee.getCount() == 2) {
        System.out.print("Enter employee address (city, state) ");
        String city = scnr.next();
        String state = scnr.next();
        addr = new Address(city, state);
    }

    System.out.println("Creating employee " + fName + " " + lName);
    if (Employee.getCount() == 0) {
      return new Employee(fName, lName);
    } else if (Employee.getCount() == 1) {
      return new Employee(fName, lName, previousEmployee);
    } else {
      return new Employee(fName, lName, previousEmployee, addr);
    }
  }
}
