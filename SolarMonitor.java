public class SolarMonitor {

    public static void main(String[] args) {

        double voltage = 24;
        double current = 5;

        double power = voltage * current;

        System.out.println("================================");
        System.out.println("  SOLAR POWER MONITORING SYSTEM");
        System.out.println("================================");

        System.out.println("Voltage : " + voltage + " V");
        System.out.println("Current : " + current + " A");
        System.out.println("Power   : " + power + " W");

        System.out.println("Status  : Solar Panel Active");

        System.out.println("================================");
    }
}