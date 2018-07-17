import com.home.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

    System.out.println(employeeService.getEmployee().getName());

    employeeService.getEmployee().setName("Pankaj");

//    employeeService.getEmployee().throwException();

    ctx.close();
  }
}
