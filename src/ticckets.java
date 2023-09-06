public class ticckets {
    public static int ticketSaler(int numberOfTickets, int ticketPrice) {
        float commission = 0.28f;
        return (int) (numberOfTickets * ticketPrice - numberOfTickets * ticketPrice * commission);
    }
/*какой нибудь коммент*/
    public static void main(String[] args) {
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));
    }
}
