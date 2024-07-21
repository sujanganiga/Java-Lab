/*Consider a Bus reservation system that allows online reservations to its customers. Suppose there are two transactions of reservation for a particular seat simultaneously which leads to race condition. Develop a solution to avoid the unpredictable situation with a program. */
class  seatsAlreadyReasevedException extends Exception{
    public seatsAlreadyReasevedException(String msg){
        super(msg);
    }
}
class Seat{
    private Boolean isReserved;
    public Seat(){
        this.isReserved=false;
    }
    public synchronized Boolean reserve()throws seatsAlreadyReasevedException{
        if(isReserved){
            throw new seatsAlreadyReasevedException("seat is already reseved");
        }
        isReserved=true;
        return true;
    }
}
class Bus{
    private Seat[] seat;
    public Bus(int numseats){
        seat=new Seat[numseats];
        for(int i=0;i<numseats;i++){
            seat[i]=new Seat();
        }
    }
    public synchronized Boolean reserveSeat(int seatnumber) throws seatsAlreadyReasevedException{
        if(seatnumber<0||seatnumber>=seat.length){
            throw new seatsAlreadyReasevedException("Invalid seat number");
        }
        return seat[seatnumber].reserve();
    }
}
public class ReservationSystem implements Runnable{
    private Bus bus;
    private int seatToBe;
    public ReservationSystem(Bus bus, int seatToBe){
        this.bus=bus;
        this.seatToBe=seatToBe;
    }
    @Override
    public void run(){
        try {
            Boolean reseved= bus.reserveSeat(seatToBe);
            if(reseved){
                System.out.println("Seat " + seatToBe + " successfully reserved.");
            }
            
        } catch (seatsAlreadyReasevedException e) {
            System.err.println("Seat " + seatToBe + " reservation failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Bus bus=new Bus(10);
        
        Thread t1=new Thread(new ReservationSystem(bus, 5));
        Thread t2=new Thread(new ReservationSystem(bus, 5));
        t1.start();
        t2.start();
    }
}