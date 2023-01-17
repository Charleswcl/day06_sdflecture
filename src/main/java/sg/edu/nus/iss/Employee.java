package sg.edu.nus.iss;

public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer Salary;

    public Employee(Integer id, String firstName, String lastName, Integer salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Salary=" + Salary
                + "]";
    }

}
