package staff;

public abstract class Employee {

    private String name;
    private String ni;
    private double salary;

    public Employee(String name, String ni, double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNi() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase){
        if(increase > 0){
            this.salary += increase;
        }
    }

    public double payBonus(){
        return (this.salary * 0.01);
    }

    public void setName(String newName){
        if(newName != ""){
            this.name = newName;
        }
    }
}
