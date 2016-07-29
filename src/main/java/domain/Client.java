package domain;

public class Client {

    private String clientAddressStreet;
    private int clientAddressHouseNumber;
    private String timeOfOrder;
    private int numberOfPassengers;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getClientAddressStreet() {
        return clientAddressStreet;
    }

    public String getTimeOfOrder() {
        return timeOfOrder;
    }

    public int getClientAddressHouseNumber() {
        return clientAddressHouseNumber;
    }

    public void setClientAddressStreet(String clientAddressStreet) {
        this.clientAddressStreet = clientAddressStreet;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setTimeOfOrder(String timeOfOrder) {
        this.timeOfOrder = timeOfOrder;
    }

    public void setClientAddressHouseNumber(int clientAddressHouseNumber) {
        this.clientAddressHouseNumber = clientAddressHouseNumber;
    }

    public String toSting(){
        return getClass().getSimpleName() + "Client address " +this.getClientAddressStreet() + this.getClientAddressHouseNumber()+
                " , time for order " + this.getTimeOfOrder() +
                " , number of passengers" + this.getNumberOfPassengers();
    }
}
