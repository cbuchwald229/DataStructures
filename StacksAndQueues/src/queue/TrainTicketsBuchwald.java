package queue;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Christina
 *
 */
public class TrainTicketsBuchwald {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiate the queue and it's size
		int queueSize = 1000; // Since a line at a train station can be very large, I just set it to a high number.
		TrainQueue trainTicketsQueue = new TrainQueue(queueSize);
		
		// Create min and max line size, and then a random number of people in line
		int min = 1;
		int max = 100;
		int randomCustomers = ThreadLocalRandom.current().nextInt(min, max+1);
		
		// Create queue with customers
		try {
			for(int i = 0; i <= randomCustomers; i++) {
				int customer = trainTicketsQueue.enqueueCustomer(i);
			}
			System.out.println(randomCustomers + " customers in line.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Process each customer and sell tickets. Man, some of these people buy a LOT of tickets. LOL
		int ticketMin = 1;
		int ticketMax = 1000;
		for(int j =0; j <=randomCustomers; j++) {
			if (ticketMax > 0) {
				try {
					int randomTickets = ThreadLocalRandom.current().nextInt(ticketMin, ticketMax+1);
					trainTicketsQueue.dequeueCustomer();
					ticketMax = ticketMax - randomTickets;
					System.out.println(ticketMax + " tickets left.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("No tickets left. Rest of line, please dismiss.");
				break;
			}
		}
	}
}