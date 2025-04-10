package com.arrays.twod;
import java.util.*;
public class SpiralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		spiralOrder(arr);
	}
	
	private static void spiralOrder(int[][] arr) {
		int r = arr.length, c = arr[0].length; 
		boolean[][] visited = new boolean[r][c];
		
		int x = 0, y = 0, dc = 0;
		
		List<Integer> order = new ArrayList<>();
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		for(int i = 0; i < r*c; i++) {
			order.add(arr[x][y]);
			visited[x][y] = true;
			
			int nx = x + dx[dc];
			int ny = y + dy[dc];
			
			if(nx >= 0 && nx < r && ny >= 0 && ny < c && !visited[nx][ny]) {
				x = nx;
				y = ny;
			}else {
				dc = (dc +1) %4;
				x += dx[dc];
				y += dy[dc];
			}
		}
		
		System.out.println("order : "+ order);
	}

}
