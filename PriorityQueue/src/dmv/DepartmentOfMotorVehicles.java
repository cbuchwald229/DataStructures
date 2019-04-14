package dmv;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Christina
 *
 */
public class DepartmentOfMotorVehicles {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiate the queue
		PriorityQueue personQueue = new PriorityQueue();
		int id = 0;
		
		int minP = 1;
		int maxP = 2;
		int randomPriority = ThreadLocalRandom.current().nextInt(minP, maxP+1);
		
		// Create queue with customers
		try {
			while(personQueue.getSize() < 50) {
				int min = 1;
				int max = 4;
				int randomCustomerAmount = ThreadLocalRandom.current().nextInt(min, max+1);
				for(int i = 0; i <= randomCustomerAmount; i++) {
					Person person = new Person(id++, randomPriority);
					personQueue.enqueue(person);
				}
				System.out.println(randomCustomerAmount + " customers added.");
			}
			System.out.println(personQueue.getSize() + " customers in line.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Dequeue customers
		try {
			while(personQueue.getSize() != 0) {
				personQueue.dequeue();
				System.out.println(personQueue.getSize() + " customers now.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}