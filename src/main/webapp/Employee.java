public class Employee {

private static int empCount;
private String empName;
private double empSalary;
private double empRate;
private double empHour;
private double empBase;
private static int empPieces;
private static int empType;
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    empCount = 0;
    empCount ++;

    System.out.printf("Enter Employee Name: " );
    String name =input.next();
    Employee e1= new Employee(name);
    System.out.printf( "Employee count is " + empCount+ "\n" );
    empCount ++;

    e1.setEmployeePay(253553);
     System.out.printf("Enter Employee Name: ");
    name =input.next();
    Employee e2= new Employee(name);
    System.out.println( "Employee count is " + empCount );
    empCount ++;

     System.out.printf("Enter Employee Name: ");
    name =input.next();
    Employee e3= new Employee(name);
    System.out.println( "Employee count is " + empCount );
    empCount ++;

     System.out.printf("Enter Employee Name: ");
    name =input.next();
    Employee e4= new Employee(name);
    System.out.println( "Employee count is " + empCount );
    empCount ++;

    System.out.println("Employee "+name+" earned: " +"");
    System.out.println("Employee "+name+" earned: " +"");
    System.out.println("Employee "+name+" earned: " +"");
    System.out.println("Employee "+name +" earned: " +"");
}

public Employee(String name){

}
public String getName(){

 return empName;    
 }
 public static int getNumber(){
 Random random = new Random(); 
     int empnumber = 1000 + random.nextInt(9999);

 return empnumber;
 }