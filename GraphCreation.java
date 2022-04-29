package ImportantDataStructureConcept;

import java.util.ArrayList;
import java.util.List;

public class GraphCreation {
	


	/* Two ways to create Graph 1) Adjacency Matrix
	 * 2)Adjacency List
	 *  For input(Vertices) more than 10^5 or so to craete a 2D matrix of length [10^5+1][10^5+1] is a memory waste,hence we use List of List of Integer to store neighbor vertex and weight
	 */
	//Approach 1 with Adjacency Matrix:: We can take either boolean or Integer array where as u=numbers of vertices and v=numbers of edges.
	/*public void  graphReprestWithMatrix(int u,int v)
	{
		int[][] adj=new int[u+1][u+1];
		
	// edge 1<--->2
		adj[1][2]=1;
		adj[2][1]=1;
		
	// edge 2<--->5
		adj[2][5]=1;
		adj[5][2]=1;
		
	// edge 1<--->3
		adj[1][3]=1;
		adj[3][1]=1;
	
	// edge 3<--->4
		adj[3][4]=1;
		adj[4][3]=1;
	
	// edge 4<--->5
		adj[4][5]=1;
		adj[5][4]=1;
	} */
	
	//Approach 2 with Adjacency List:: We can take List of List of Integer
		/*public static void  graphReprestWithList(int u,int v)
		{
			List<List<Integer>> adj=new ArrayList<List<Integer>>();
			
			for(int k=0;k<=u;k++)
			{
				adj.add(new ArrayList());
				
			  
				
				
				// edge 1<--->2
				adj.get(1).add(2);
				adj.get(2).add(1);
				
				// edge 3<--->4
				adj.get(3).add(4);
				adj.get(4).add(3);
				
				// edge 1<--->3
				adj.get(1).add(3);
				adj.get(3).add(1);
				
				// edge 2<--->4
				adj.get(2).add(4);
				adj.get(4).add(2);  
			
			}
			
		} */
	
			public static void main (String[] args) {
				int n = 3, m = 3; 
				ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
				
				for (int i = 0; i <= n; i++) 
					adj.add(new ArrayList<Integer>());
				
				// edge 1---2
				adj.get(1).add(2); 
				adj.get(2).add(1);
				
				
				//adj.get(u).add(v);
				//adj.get(v).add(u);
				
				// edge 2---3
				adj.get(2).add(3);
				adj.get(3).add(2);
				
				
				// adge 1--3
				adj.get(1).add(3);
				adj.get(3).add(1);
				
				
				for (int i = 1; i < n; i++) 
				{ 
					for (int j = 0; j < adj.get(i).size(); j++)
					{ 
						System.out.print(adj.get(i).get(j)+" "); 
					} 
					System.out.println(); 
				}
				
			}
		}