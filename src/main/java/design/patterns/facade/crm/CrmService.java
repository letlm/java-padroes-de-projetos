package design.patterns.facade.crm;

public class CrmService {

    private CrmService(){}
    public static void saveCustomer(String name, String cep, String state, String city){
        System.out.println("Customer saved in CRM: "+ name + ", " + cep + ", " + state + ", " + city + ".");
    }
}
