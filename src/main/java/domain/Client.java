package domain;

public class Client {

    private String clientAddress;
    private String timeOfOrder;
    private int numberOfPassengers;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public String getTimeOfOrder() {
        return timeOfOrder;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setTimeOfOrder(String timeOfOrder) {
        this.timeOfOrder = timeOfOrder;
    }

    public String toSting(){
        return getClass().getSimpleName() + "Client address " +this.clientAddress +
                " , time for order " + this.getTimeOfOrder() +
                " , number of passengers" + this.getNumberOfPassengers();
    }
}
