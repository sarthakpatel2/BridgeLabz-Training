package futurelogistics;
public class Utility{
    public boolean validateTransportId(String transportId){
        if (!transportId.matches("RTS[0-9]{3}[A-Z]")) {
            System.out.println("Transport id "+transportId+" is invalid");
            return false;
        }
        return true;
    }
    public GoodsTransport parseDetails(String input){
        String[] data=input.split(":");
        if (!validateTransportId(data[0])) {
            System.out.println("Provide a valid record");
            return null;
        }
        String transportId=data[0];
        String transportDate= data[1];
        int rating= Integer.parseInt(data[2]);
        String type=data[3];
        if (type.equalsIgnoreCase("BrickTransport")){
            return new BrickTransport(
                    transportId, transportDate, rating,
                    Float.parseFloat(data[4]),
                    Integer.parseInt(data[5]),
                    Float.parseFloat(data[6])
            );
        }
        if (type.equalsIgnoreCase("TimberTransport")){
            return new TimberTransport(
                    transportId, transportDate, rating,
                    Float.parseFloat(data[4]),
                    Float.parseFloat(data[5]),
                    data[6],
                    Float.parseFloat(data[7])
            );
        }
        return null;
    }
    public String findObjectType(GoodsTransport gt){
        if (gt instanceof TimberTransport)
            return "TimberTransport";
        if (gt instanceof BrickTransport)
            return "BrickTransport";
        return "";
    }
}
