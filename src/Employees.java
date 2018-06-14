import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "employees")
public class Employees {
    private List<Employee> employees= new ArrayList<Employee>();

    public void add (Employee employee){
        this.employees.add(employee);
    }

    @XmlElements(@XmlElement(name="employee"))
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

