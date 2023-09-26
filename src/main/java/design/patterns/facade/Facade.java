package design.patterns.facade;


import design.patterns.facade.cep.CepAPI;
import design.patterns.facade.crm.CrmService;

public class Facade {
    public void migrateCustomer(String name, String cep){
        String city = CepAPI.getInstance().getCity(cep);
        String state = CepAPI.getInstance().getState(cep);

        CrmService.saveCustomer(name, cep, state, city);
    }
}
