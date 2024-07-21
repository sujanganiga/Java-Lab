// Define the custom exception
class ZeroTemperatureException extends Exception {
    public ZeroTemperatureException(String msg) {
        super(msg);
    }
}
public class Temperature {
    private double temp;

    // Constructor
    public Temperature(double temp) throws ZeroTemperatureException {
        if (temp == 0) {
            throw new ZeroTemperatureException("Temperature cannot be zero!");
        }
        this.temp = temp;
    }

    // Setter method
    public void setTemp(double temp) throws ZeroTemperatureException {
        if (temp == 0) {
            throw new ZeroTemperatureException("Temperature cannot be zero!");
        }
        this.temp = temp;
    }

    // Getter method
    public double getTemp() {
        return temp;
    }

    // Method to display the temperature
    public void displayTemperature() {
        System.out.println("Temperature: " + temp + "°C");
    }

    public static void main(String[] args) {
        try {
            // Test with a non-zero temperature
            Temperature temp1 = new Temperature(25.5);
            temp1.displayTemperature();

            // Test with a zero temperature
            Temperature temp2 = new Temperature(0); // This will throw an exception
            temp2.displayTemperature();
        } catch (ZeroTemperatureException e) {
            System.out.println(e.getMessage());
        }

        try {
            Temperature temp3 = new Temperature(15.0);
            temp3.displayTemperature();
            temp3.setTemp(0); // This will throw an exception
        } catch (ZeroTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }
}
