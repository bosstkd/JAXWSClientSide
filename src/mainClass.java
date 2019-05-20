
import employee.service.Employee;
import employee.service.EmployeeInterfaceImp;
import employee.service.EmployeeInterfaceImpService;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrateur
 */
public class mainClass {
    public static void main(String[] args) {
      // System.out.println("test");
      
      EmployeeInterfaceImp inter =  new EmployeeInterfaceImpService().getEmployeeInterfaceImpPort();
      Employee emp = inter.getEmployeeById("1");
      
      System.out.println(emp.getNom());
      
      
      emp = getEmployeeById("1");
      System.out.println(emp.getPoste());
      
    }

    private static Employee getEmployeeById(java.lang.String arg0) {
        employee.service.EmployeeInterfaceImpService service = new employee.service.EmployeeInterfaceImpService();
        employee.service.EmployeeInterfaceImp port = service.getEmployeeInterfaceImpPort();
        return port.getEmployeeById(arg0);
    }
    
    
    
}
