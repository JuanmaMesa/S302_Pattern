package nivell1_Observator;

public class Main {

public static void main(String[] args){

    MarketAgent agent1 = new MarketAgent();

    MarketAgency agency1 = new MarketAgency("VanguardGroup");
    MarketAgency agency2= new MarketAgency("Goldman Sachs");


    agent1.addObservers(agency1);
    agent1.addObservers(agency2);

    agent1.setStockvalue(120.8);




}


}
