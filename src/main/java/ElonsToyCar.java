public class ElonsToyCar {
    private int distanceDriven;
    private int bateria=100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters",distanceDriven);
    }

    public String batteryDisplay() {
        if (this.bateria>0) {
            return String.format("Battery at %d%%", bateria);
        }else {
            return "Battery empty";
        }
    }

    public void drive() {
        if (this.bateria!=0) {
            this.distanceDriven += 20;
            this.bateria --;
        }
    }
}
