package algorithms;

//A Java program for Dijkstra's algorithm using an adjacency matrix
public class DijsktrasAlgorithm {
 
 // A utility function to find the vertex with minimum distance value from the set of vertices not yet included in shortest path tree 
 static final int VERTEX=4; 
 int minDistance(int distance[], Boolean shortSet[]) 
 { 
     // Initialize min value 
     int min = Integer.MAX_VALUE, min_index=-1; 

     for (int v = 0; v < VERTEX; v++) 
         if (shortSet[v] == false && distance[v] <= min) 
         { 
             min = distance[v]; 
             min_index = v; 
         } 

     return min_index; 
 } 

 // A function to print the row and then distance 
 public String printSolution(int distance[], int n, int dest) 
 { 
	 String solution = dest + " : " + distance[dest] + " miles   "; 
     return solution;
 } 

 // Function that implements Dijkstras algorithm 
 public String dijkstra(int graph[][], int src, int dest) 
 { 
     int distance[] = new int[VERTEX]; // The output array. 

     // shortSet[i] will true if vertex i is included in shortest path tree or shortest distance from source to i is finalized 
     Boolean shortSet[] = new Boolean[VERTEX]; 

     // Initialize all distances as INFINITE and shortSet[] as false 
     for (int i = 0; i < VERTEX; i++) 
     { 
    	 distance[i] = Integer.MAX_VALUE; 
         shortSet[i] = false; 
     } 

     // Distance of source vertex from itself is always 0 
     distance[src] = 0; 

     // Find shortest path for all vertices 
     for (int count = 0; count < VERTEX-1; count++) 
     { 
         // Pick the minimum distance vertex from the set of vertices 
         int u = minDistance(distance, shortSet); 

         // Mark the picked vertex as processed 
         shortSet[u] = true; 

         // Update distance value of the adjacent vertices of the picked vertex. 
         for (int v = 0; v < VERTEX; v++) 
             // Update distance[v]
             if (!shortSet[v] && graph[u][v]!=0 && distance[u] != Integer.MAX_VALUE && distance[u]+graph[u][v] < distance[v]) {
            	 distance[v] = distance[u] + graph[u][v]; 
             }
     }  
     String solution = printSolution(distance, VERTEX, dest);
     return solution;
 } 

 // Driver method 
 public static void main (String[] args) 
 	{ 
	 	int graph[][] = new int[][]{{0, 4, 0, 3}, 
                               		{4, 0, 8, 0}, 
                               		{0, 8, 0, 7}, 
                               		{3, 0, 7, 0}};
      	DijsktrasAlgorithm t = new DijsktrasAlgorithm(); 
      	System.out.println("City# : Shortest Distance from Chicago");
      	String shortest = t.dijkstra(graph, 0, 2); 
      	System.out.println(shortest);
 	} 
 	// Works, now to add exception handling and maybe name the 
} 