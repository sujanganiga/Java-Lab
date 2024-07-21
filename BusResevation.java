
class Bus{
    boolean[] seat;
    public Bus(int seatnumber){
        seat=new boolean[seatnumber];
    }
    public synchronized boolean reserveSeat(int seatnumber){
        if(seatnumber<0||seatnumber>=seat.length||seat[seatnumber]){
            System.out.println("seat "+seatnumber+" cant be reserved");
            return false;
        }
        seat[seatnumber]=true;
        System.out.println("seat "+seatnumber+" reserved");
        return true;
    }
}
public class BusResevation implements Runnable{
    Bus bus;
    int seatnumber;
    public BusResevation(Bus bus,int seatnumber){
        this.bus=bus;
        this.seatnumber=seatnumber;
    }
    public void run(){
        bus.reserveSeat(seatnumber);
    }

    public static void main(String[] args) {
        Bus bus=new Bus(10);
        Thread t1=new Thread(new BusResevation(bus, 3));
        Thread t2=new Thread(new BusResevation(bus, 3));
        Thread t3=new Thread(new BusResevation(bus, 4));
        t1.start();
        t2.start();
        t3.start();
    }
}

