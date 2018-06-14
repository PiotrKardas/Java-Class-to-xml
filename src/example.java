import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class example {



    public static void main(String... arg) throws Exception {
        Employees employees = new Employees();
        employees.add(new Employee("Marcin", "Wolfram",44540656));
        employees.add(new Employee("Adrian", "Karabin",845456056));
        employees.add(new Employee("Wiktor", "Plasko",645456426));
        employees.add(new Employee("Damian", "Wielomian",145456446));
        employees.add(new Employee("Barbara", "Rabarbar",745456486));
        employees.add(new Employee("Daniel", "Telewizor",245456476));
        employees.add(new Employee("Marcin", "Wolfram",44540656));
        employees.add(new Employee("Adrian", "Karabin",845456056));
        employees.add(new Employee("Wiktor", "Plasko",645456426));
        employees.add(new Employee("Damian", "Wielomian",145456446));
        employees.add(new Employee("Barbara", "Rabarbar",745456486));
        employees.add(new Employee("Daniel", "Telewizor",245456476));
        employees.add(new Employee("Wiktor", "Plasko",645456426));
        employees.add(new Employee("Damian", "Wielomian",145456446));
        employees.add(new Employee("Barbara", "Rabarbar",745456486));


        JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(employees, System.out);

       // File directory = new File("C:\\xml");
       // directory.mkdir();

        Path directory = Paths.get("C:\\xml");
        if (!Files.exists(directory)){
            try {
                Files.createDirectory(directory);
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        jaxbMarshaller.marshal(employees,  new File("C:\\xml\\employee.xml"));
    }
}