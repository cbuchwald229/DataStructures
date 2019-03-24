package algorithms;

import java.util.*;

/**
 * @author Christina
 *
 */
public class KruskalsAlgorithm {

 // A class to represent a graph edge 
 /**
 * @author Christina
 *
 */
public class Edge implements Comparable<Edge> 
 { 
     int src, dest, weight; 
     // Compare function used for sorting edges based on their weight 
     /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Edge compareEdge) 
     { 
         return this.weight-compareEdge.weight; 
     } 
 }; 

 // A class to represent a subset
 /**
 * @author Christina
 *
 */
public class subset 
 { 
     int parent, rank; 
 }; 

 int V, E;    // V = no. of vertices & E =  no.of edges 
 Edge edge[]; // collection of all edges 

 // Constructor
 /**
 * @param v
 * @param e
 */
public KruskalsAlgorithm(int v, int e) 
 { 
     V = v; 
     E = e; 
     edge = new Edge[E]; 
     for (int i = 0; i < e; ++i) 
         edge[i] = new Edge(); 
 } 

 // A utility function to find subset
 /**
 * @param subsets
 * @param i
 * @return
 * @throws Exception
 */
public int find(subset subsets[], int i) throws Exception 
 { 
	 if(subsets == null) {
		 throw new Exception("Please enter subset.");
	 } else {
	     if (subsets[i].parent != i) 
	         subsets[i].parent = find(subsets, subsets[i].parent); 
	
	     return subsets[i].parent; 
	 }
 } 

 // A function that does the union of two sets of x and y 
/**
 * @param subsets
 * @param x
 * @param y
 * @throws Exception
 */
public void Union(subset subsets[], int x, int y) throws Exception 
 { 
	if(subsets == null ) {
		throw new Exception("Please input subsets.");
	} else {
	     int xroot = find(subsets, x); 
	     int yroot = find(subsets, y); 
	
	     // Attach smaller rank tree under root of higher rank tree 
	     if (subsets[xroot].rank < subsets[yroot].rank) 
	         subsets[xroot].parent = yroot; 
	     else if (subsets[xroot].rank > subsets[yroot].rank) 
	         subsets[yroot].parent = xroot; 
	
	     // If ranks are the same, then make one root
	     else
	     { 
	         subsets[yroot].parent = xroot; 
	         subsets[xroot].rank++; 
	     } 
	}
 } 

 // The main function to construct MST using Kruskal's algorithm 
 /**
 * @return
 */
public String KruskalMST() 
 { 
     Edge result[] = new Edge[V];  // This will store the resultant MST 
     int e = 0;  // An index variable, used for result[] 
     int i = 0;  // An index variable, used for sorted edges 
     for (i = 0; i < V; ++i) 
         result[i] = new Edge(); 

     // Step 1:  Sort all the edges in non-decreasing order of their weight.
     Arrays.sort(edge); 

     // Allocate memory for creating V subsets 
     subset subsets[] = new subset[V]; 
     for(i = 0; i < V; ++i) {
         subsets[i] = new subset();
     }
     
     // Create V subsets with single elements 
     for (int v = 0; v < V; ++v) { 
         subsets[v].parent = v; 
         subsets[v].rank = 0; 
     } 

     i = 0;  // Index used to pick next edge 

     // Number of edges to be taken is equal to V-1 
     while (e < V - 1) { 
         // Step 2: Pick the smallest edge.
         Edge next_edge = new Edge(); 
         next_edge = edge[i++]; 

         int x = 0;
		try {
			x = find(subsets, next_edge.src);
		} catch (Exception e0) {
			System.out.println(e0.getMessage());
		} 
         int y = 0;
		try {
			y = find(subsets, next_edge.dest);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		} 

         // If including this edge does't cause cycle, include it in result
         if (x != y) 
         { 
             result[e++] = next_edge; 
             try {
				Union(subsets, x, y);
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			} 
         } 
     } 

     // print the contents 
     String solution = printSolution(result, e);
     return solution;
 }
 /**
 * @param result
 * @param e
 * @return
 */
public String printSolution(Edge result[], int e) {
	 String solution = "";
     for (int i = 0; i < e; ++i) {
         solution = solution + result[i].src+" - " +  
                result[i].dest+": " + result[i].weight + " miles     "; 
     }
     return solution;
 } 

 // Driver Program 
 /**
 * @param args
 */
public static void main (String[] args) { 
     int V = 4;  // Number of vertices in graph 
     int E = 4;  // Number of edges in graph 
     KruskalsAlgorithm graph = new KruskalsAlgorithm(V, E); 

     // add edge 0-1 
     graph.edge[0].src = 0; 
     graph.edge[0].dest = 1; 
     graph.edge[0].weight = 4; 

     // add edge 0-3 
     graph.edge[2].src = 0; 
     graph.edge[2].dest = 3; 
     graph.edge[2].weight = 3;
     
     // add edge 1-2 
     graph.edge[1].src = 1; 
     graph.edge[1].dest = 2; 
     graph.edge[1].weight = 8; 

     // add edge 2-3 
     graph.edge[3].src = 2; 
     graph.edge[3].dest = 3; 
     graph.edge[3].weight = 7; 

     String result = graph.KruskalMST();
     System.out.println("Edge(City#s): Distance");
     System.out.println(result);
 	} 
} 