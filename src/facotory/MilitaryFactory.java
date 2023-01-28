package facotory;

public class MilitaryFactory {
    public Military getMilitary(String military){

        if(military.equalsIgnoreCase("NAVY")){
            return new Navy();
        } else if(military.equalsIgnoreCase("AIRFORCE")) {
            return new AirForce();
        }

        return null;
    }
}
