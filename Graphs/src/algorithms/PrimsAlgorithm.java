package algorithms;

/**
 * @author Christina
 *
 */
public class PrimsAlgorithm {
//A Java program for Prim's Minimum Spanning Tree (MST) algorithm.

 // A utility function to find the vertex with minimum key value
 /**
 * 
 */
private static final int VERTEX=4; 
 int minKey(int key[], Boolean mstSet[]) 
 { 
     // Initialize min value 
     int min = Integer.MAX_VALUE, min_index=-1; 

     for (int v = 0; v < VERTEX; v++) 
         if (mstSet[v] == false && key[v] < min) 
         { 
             min = key[v]; 
             min_index = v; 
         } 
     return min_index; 
 } 

 // A utility function to print the constructed MST stored in parent[]
 /**
 * @param parent
 * @param n
 * @param graph
 * @return
 */
public String printSolution(int parent[], int n, int graph[][]) 
 { 
	 String solution = "";
	 for (int i = 1; i < VERTEX; i++) {
		 solution = solution + parent[i] +  " - " + i + ": " + graph[i][parent[i]] + " miles     "; 
	 }
     return solution;
 } 

 // Function to construct and print MST for a graph represented using adjacency matrix representation 
 /**
 * @param graph
 * @return
 * @throws Exception
 */
public String primMST(int graph[][]) throws Exception { 
	 if (graph == null) {
		 throw new Exception("Graph contains no data. Please try again.");
	 } else {
	     // Array to store constructed MST 
	     int parent[] = new int[VERTEX]; 
	
	     // Key values used to pick minimum weight edge in cut 
	     int key[] = new int [VERTEX]; 
	
	     // To represent set of vertices not yet included in MST 
	     Boolean mstSet[] = new Boolean[VERTEX]; 
	
	     // Initialize all keys as INFINITE 
	     for (int i = 0; i < VERTEX; i++) 
	     { 
	         key[i] = Integer.MAX_VALUE; 
	         mstSet[i] = false; 
	     } 
	
	     // Always include first 1st vertex in MST. 
	     key[0] = 0;     // Make key 0 
	     parent[0] = -1; // First node is always root of MST 
	
	     // The MST will have V vertices 
	     for (int count = 0; count < VERTEX-1; count++) 
	     { 
	         // Pick the minimum key vertex from the set of vertices not yet included in MST 
	         int u = minKey(key, mstSet); 
	
	         // Add the picked vertex to the MST Set 
	         mstSet[u] = true; 
	
	         // Update key value and parent index of the adjacent vertices of the picked vertex
	         for (int v = 0; v < VERTEX; v++) 
	
	             // Update the key only if graph[u][v] is smaller than key[v] 
	             if (graph[u][v]!=0 && mstSet[v] == false && 
	                 graph[u][v] < key[v]) 
	             { 
	                 parent[v] = u; 
	                 key[v] = graph[u][v]; 
	             } 
	     } 
	     // print the constructed MST 
	     String solution = printSolution(parent, VERTEX, graph);
	     return solution;
	 }
 } 

 /**
 * @param args
 */
public static void main (String[] args) 
 { 
	 PrimsAlgorithm t = new PrimsAlgorithm(); 
	 	int graph[][] = new int[][]{{0, 4, 0, 3}, 
       								{4, 0, 8, 0}, 
									{0, 8, 0, 7}, 
									{3, 0, 7, 0}};

     // Print the solution 
     String edge = "";
     System.out.println("Edge(City#s): Distance"); 
     try {
		edge = t.primMST(graph);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} 
     System.out.println(edge); 
 	} 
} 