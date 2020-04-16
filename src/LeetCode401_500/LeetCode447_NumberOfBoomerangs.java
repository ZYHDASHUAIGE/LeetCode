package LeetCode401_500;

import java.util.HashMap;
import java.util.Map;

public class LeetCode447_NumberOfBoomerangs {
	public static void main(String[] args) {
		int[][] points = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
		System.out.println(numberOfBoomerangs(points));
	}

	public static int numberOfBoomerangs(int[][] points) {
		/**
		 * map<距离，点数>
		 */
		int res=0;
		for(int i=0;i<points.length;i++) {
			Map<Integer, Integer> map = new HashMap<>();  //每一个点对应一个map
			for(int j=0;j<points.length;j++) {
				if(i!=j) {
					//System.out.println(distence(points[i], points[j]));
					if(!map.containsKey(distence(points[i], points[j])))
						map.put(distence(points[i], points[j]), 1);
					else map.put(distence(points[i], points[j]), map.get(distence(points[i], points[j]))+1);
				}else {
					continue;
				}
			}
			
			for(Integer a:map.keySet()) {
				if(map.get(a)>=2) res +=map.get(a)*(map.get(a)-1);
				else continue;
			
			}
			
		}
		
		
		return res;
	}

	public static int distence(int[] x, int[] y) {
		int x_d = Math.abs(x[0] - y[0]);
		int y_d = Math.abs(x[1] - y[1]);
		int a = x_d * x_d + y_d * y_d;
		return a;
	}
}
