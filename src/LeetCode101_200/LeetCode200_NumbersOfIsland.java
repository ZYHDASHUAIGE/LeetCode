package LeetCode101_200;

import LeetCode201_300.LeetCode220_ContainsDuplicate;

public class LeetCode200_NumbersOfIsland {

	int[][] directions = { 
			{ 0, 1 }, 
			{ 1, 0 }, 
			{ 0, -1 }, 
			{ -1, 0 } 
			};

	boolean[][] visited;

	public int numIslands(char[][] grid) {
		visited = new boolean[grid.length][grid[0].length];
		if (grid.length == 0)
			return 0;

		// initial

		init(visited);

		int res = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1' && !visited[i][j]) {
					res++;
					// floodfill
					dfs(grid, i, j);
				}
			}
		}

		return res;

	}

	private void init(boolean[][] visited) {
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[0].length; j++) {
				visited[i][j] = false;
			}
		}
	}

	private boolean inArea(char[][] grid, int x, int y) {
		return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length;
	}

	// 深度优先遍历,从grid[x][y]开始，找到所有的陆地
	private void dfs(char[][] grid, int x, int y) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int newx = x + directions[i][0];
			int newy = y + directions[i][1];
			if (grid[newx][newy] == '1' && !visited[newx][newy] && inArea(grid, newx, newy)) {
				dfs(grid, newx, newy);
			}
		}
	}

	public static void main(String[] args) {
		LeetCode200_NumbersOfIsland island = new LeetCode200_NumbersOfIsland();
		char[][] grid = { 
				{ '1', '1', '1', '0' }, 
				{ '1', '0', '0', '0' }, 
				{ '1', '0', '0', '0' }, 
				{ '0', '0', '1', '0' }

		};
		int res = island.numIslands(grid);
		System.out.println(res);
	}
}
