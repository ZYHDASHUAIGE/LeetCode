package LeetCode201_300;

import java.util.LinkedList;
import java.util.Queue;

//最短路径问题，基于广度优先遍历
public class LeetCode279_PerfectSquares {

	public static void main(String[] args) throws Exception {
		int n= 5;
		System.out.println(numSquares(n));
	}
	public static int numSquares(int n)  {
       
		Queue<Pair> q = new LinkedList<>();
		boolean[] visited = new boolean[n+1];  //确保加入过的节点不再重新入队
		for(int i=0;i<visited.length;i++) {
			visited[i]=false;
		}
		visited[n]=true;
        q.add(new Pair(n,0));
        int step = -1;
        while(!q.isEmpty()) {
        	Pair pair= q.poll();
        	int num = pair.value;
        	step = pair.distence;
        	if(num==0) return step;
        	for(int i=1;num-i*i>=0;i++) {
        		if(!visited[num-i*i]) {
        			q.add(new Pair(num-i*i, step+1));
        			visited[num-i*i]=true;
        		}
        		
        	}
        }
		return step;
        
        
        
    }
	
	private static class Pair {
		public int value;
		public int distence;
		
		public Pair(int value,int distence) {
			this.value = value;
			this.distence = distence;
		}
	}
}
