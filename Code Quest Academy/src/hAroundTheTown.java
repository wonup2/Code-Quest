import java.util.*;
import java.math.*;
import java.text.*;
public class hAroundTheTown {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		df.setRoundingMode(RoundingMode.HALF_UP);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int l = sc.nextInt();
			int s = sc.nextInt();
			Point[] landmarks = new Point[l];
			Point[] stops = new Point[s];
			for(int j = 0; j < l; j++)
				landmarks[j] = new Point(sc.nextDouble(), sc.nextDouble());
			for(int j = 0; j < s; j++)
				stops[j] = new Point(sc.nextDouble(), sc.nextDouble());
			Point[] pre = new Point[s];
			for(int j = 0; j < s; j++)
				pre[j] = new Point(0, 0);
			while(!equals(pre, stops)) {
				for(int j = 0; j < s; j++)
					pre[j] = stops[j];
				ArrayList<Point>[] clusters = new ArrayList[s];
				for(int j = 0; j < s; j++)
					clusters[j] = new ArrayList<Point>();
				for(int j = 0; j < l; j++) {
					double minDist = Math.sqrt(Math.pow(pre[0].x - landmarks[j].x, 2) + Math.pow(pre[0].y - landmarks[j].y, 2));
					double x = pre[0].x;
					double y = pre[0].y;
					int index = 0;
					for(int k = 1; k < s; k++) {
						double dist = Math.sqrt(Math.pow(pre[k].x - landmarks[j].x, 2) + Math.pow(pre[k].y - landmarks[j].y, 2));
						if(dist < minDist || dist == minDist && pre[k].x < x || dist == minDist && pre[k].x == x && pre[k].y < y) {
							minDist = dist;
							x = pre[k].x;
							y = pre[k].y;
							index = k;
						}
					}
					clusters[index].add(landmarks[j]);
				}
				for(int j = 0; j < s; j++) {
					double x = 0.0;
					double y = 0.0;
					for(int k = 0; k < clusters[j].size(); k++) {
						x += clusters[j].get(k).x;
						y += clusters[j].get(k).y;
					}
					x /= clusters[j].size();
					y /= clusters[j].size();
					stops[j] = new Point(x, y);
				}
			}
			for(int j = 0; j < s; j++)
				System.out.println(df.format(stops[j].x) + " " + df.format(stops[j].y));
		}
		sc.close();
	}
	static class Point {
		public double x, y;
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
	public static boolean equals(Point[] a, Point[] b) {
		for(int i = 0; i < a.length; i++)
			if(a[i].x != b[i].x || a[i].y != b[i].y)
				return false;
		return true;
	}
}