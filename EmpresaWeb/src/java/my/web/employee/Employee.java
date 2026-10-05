
package my.web.employee;

/**
 *
 * @author lucia
 */
public class Employee {
    private int Id;
    private String Name;
    private String Department;

    public Employee(int Id, String Name, String Department) {
        this.Id = Id;
        this.Name = Name;
        this.Department = Department;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }  
}
