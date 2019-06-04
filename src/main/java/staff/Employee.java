package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() != 0){
            this.name = name;
        }
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double raise){
        if (raise > 0) {
            this.salary += raise;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

}
