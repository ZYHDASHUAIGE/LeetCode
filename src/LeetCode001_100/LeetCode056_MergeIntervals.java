package LeetCode001_100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LeetCode056_MergeIntervals {

	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(1, 4));
		List<Interval> res = merge(intervals);
		System.out.println(res.get(0).start+"   "+res.get(intervals.size()-1).end);

	}

	public static List<Interval> merge(List<Interval> intervals) {
		/**
		 * 按区间start排序, 依次判断排序后的每个区间, 如果返回区间中的最后一个区间的end 大于等于当前区间的start, 更新最后一个区间的end,
		 * 否则直接添加入返回值中.
		 **/
		LinkedList<Interval> ret = new LinkedList<Interval>();
		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				return (a.start - b.start);
			}
		});
		for (Interval temp : intervals) {
			if (ret.isEmpty() || ret.peekLast().end < temp.start)
				ret.add(temp);
			else
				ret.peekLast().end = Math.max(ret.peekLast().end, temp.end);
		}
		return ret;
	}

}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}
}