package LeetCode301_400;
import java.util.*;
public class LeetCode347_TopKElements {

	public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
		for(int num:nums) {
			if(map.containsKey(num)) {
				map.put(num,map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		PriorityQueue<Freq> pq = new PriorityQueue<>();
		for(int key:map.keySet()) {
			if(pq.size()<k) {
				pq.add(new Freq(key, map.get(key)));
				
			}else if(map.get(key)>pq.peek().frequency) {
				
				//map.get(key).compareTo(pq.peek().frequency) > 0
				pq.poll();
				pq.add(new Freq(key, map.get(key)));
			}
		}
		
		List<Integer> list = new ArrayList<>();
		
		while(!pq.isEmpty()) {
			list.add(pq.poll().key);
		}
		return list;    		
    }

	private class Freq implements Comparable<Freq>{
		int key;
		int frequency;

		public Freq(int key, int frequency) {
			this.frequency = frequency;
			this.key = key;

		}

		@Override
		public int compareTo(Freq freq) {
			if (this.frequency < freq.frequency) {
	            return -1;
	        } else if (this.frequency > freq.frequency) {
	            return 1;
	        } else {
	            return 0;
	        }
			
		}
    }
	
}
