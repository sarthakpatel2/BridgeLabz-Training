package flight;
public class FlightUtil{
    public boolean validateFlightNumber(String flightNumber)
            throws InvalidFlightException{
        if (!flightNumber.matches("FL-[1-9][0-9]{3}")){
            throw new InvalidFlightException("The flight number " +flightNumber+" is invalid");
        }
        return true;
    }
    public boolean validateFlightName(String flightName)throws InvalidFlightException {
        //case-sensitive comparison
        if (!(flightName.equals("SpiceJet") ||
              flightName.equals("Vistara") ||
              flightName.equals("IndiGo") ||
              flightName.equals("Air Arabia"))){
            throw new InvalidFlightException("The flight name "+flightName+" is invalid");
        }
        return true;
    }
    public boolean validatePassengerCount(int passengerCount,String flightName)throws InvalidFlightException{
        int maxCapacity;
        switch (flightName){
            case "SpiceJet":
                maxCapacity=396;
                break;
            case "Vistara":
                maxCapacity =615;
                break;
            case "IndiGo":
                maxCapacity=230;
                break;
            case "Air Arabia":
                maxCapacity=130;
                break;
            default:
                throw new InvalidFlightException("The flight name "+flightName+" is invalid");
        }
        if (passengerCount<=0 || passengerCount> maxCapacity) {
            throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);
        }
        return true;
    }
    public double calculateFuelToFillTank(String flightName,double currentFuelLevel)throws InvalidFlightException{
        double tankCapacity;
        switch (flightName){
            case "SpiceJet":
                tankCapacity=200000;
                break;
            case "Vistara":
                tankCapacity= 300000;
                break;
            case "IndiGo":
                tankCapacity=250000;
                break;
            case "Air Arabia":
                tankCapacity =150000;
                break;
            default:
                throw new InvalidFlightException("Invalid fuel level for "+flightName);
        }
        if (currentFuelLevel <0 || currentFuelLevel>tankCapacity) {
            throw new InvalidFlightException("Invalid fuel level for "+ flightName);
        }
        return tankCapacity-currentFuelLevel;
    }
}
