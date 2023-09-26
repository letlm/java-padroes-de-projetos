package design.patterns.facade.cep;

public class CepAPI {
    private static CepAPI instance = new CepAPI();;

    private CepAPI() {
    }

    public static CepAPI getInstance() {
        return instance;
    }

    public String getCity(String cep){
        return "Pelotas";
    }

    public String getState(String cep){
        return "RS";
    }
}
