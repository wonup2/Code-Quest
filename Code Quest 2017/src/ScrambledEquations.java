import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class ScrambledEquations {
	static String file = "Prob16";

	static ArrayList<int[]> n;
	static ArrayList<char[]> o;
	static int size;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new File(file+".in.txt"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
		//Scanner sc = new Scanner(System.in);
		String possibleOperations = "+-*/";
		int t = Integer.parseInt(sc.nextLine());
		for(int a = 0; a < t; a++) {
			String[] input = sc.nextLine().split("[: ]");
			int sol = Integer.parseInt(input[0]);
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			ArrayList<Character> operations = new ArrayList<Character>();
			for(int i = 1; i < input.length; i++) {
				if(possibleOperations.contains(input[i]))
					operations.add(input[i].charAt(0));
				else
					numbers.add(Integer.parseInt(input[i]));
			}
			size = operations.size();
			n = new ArrayList<int[]>();
			o = new ArrayList<char[]>();
			ArrayList list1 = new ArrayList<Integer>();
			ArrayList list2 = new ArrayList<Character>();
			permuteNum(numbers, list1);
			permuteOp(operations, list2);
			boolean findSolution = false;
			boolean didBreak = false;
			boolean zeroError = false;
			for(int i = 0; i < n.size(); i++) {
				int[] tempNum = (int[])(n.get(i));
				for(int j = 0; j < o.size(); j++) {
					char[] tempOp = (char[])(o.get(j));
					boolean works = true;
					for(int k = 0; k < tempOp.length; k++) {
						for(int l = k + 1; l < tempOp.length; l++) {
							if((tempOp[k] == '+' || tempOp[k] == '-') && (tempOp[l] == '*' || tempOp[l] == '/')) {
								works = false;
								break;
							}
						}
						if(!works)
							break;
					}
					if(!works)
						continue;
					double res = tempNum[0];
					for(int k = 0; k < tempOp.length; k++) {
						if(tempOp[k] == '+')
							res += tempNum[k + 1];
						else if(tempOp[k] == '-')
							res -= tempNum[k + 1];
						else if(tempOp[k] == '*')
							res *= tempNum[k + 1];
						else {
							if(tempNum[k + 1] == 0) {
								zeroError = true;
								break;
							}
							res /= tempNum[k + 1] + 0.0;
						}
					}
					if(zeroError)
						continue;
					if(res == sol) {
						didBreak = true;
						findSolution = true;
						break;
					}
				}
				if(didBreak)
					break;
			}
			//System.out.println(findSolution ? "TRUE" : "FALSE");
			out.println(findSolution ? "TRUE" : "FALSE");

		}
		sc.close();
		out.close();
		Check.check("out.txt", file+".out.txt");
	}
	@SuppressWarnings("unchecked")
	public static void permuteNum(ArrayList<Integer> list, ArrayList<Integer> temp) {
		if(list.isEmpty()) {
			int[] temp2 = new int[temp.size()];
			for(int i = 0; i < temp.size(); i++)
				temp2[i] = temp.get(i);
			n.add(temp2);
		}
		else {
			ArrayList<Integer> temp2 = new ArrayList<Integer>();
			for(int i = 0; i < temp.size(); i++)
				temp2.add(temp.get(i));
			for(int i = 0; i < list.size(); i++) {
				ArrayList<Integer> list2 = new ArrayList<Integer>();
				for(int j = 0; j < list.size(); j++) {
					if(i == j)
						continue;
					list2.add(list.get(j));
				}
				temp2.add(list.get(i));
				permuteNum(list2, temp2);
				temp2 = (ArrayList<Integer>)(temp.clone());
			}
		}
	}
	@SuppressWarnings("unchecked")
	public static void permuteOp(ArrayList<Character> list, ArrayList<Character> temp) {
		if(list.isEmpty()) {
			char[] temp2 = new char[temp.size()];
			for(int i = 0; i < temp.size(); i++)
				temp2[i] = temp.get(i);
			o.add(temp2);
		}
		else {
			ArrayList<Character> temp2 = new ArrayList<Character>();
			for(int i = 0; i < temp.size(); i++)
				temp2.add(temp.get(i));
			for(int i = 0; i < list.size(); i++) {
				ArrayList<Character> list2 = new ArrayList<Character>();
				for(int j = 0; j < list.size(); j++) {
					if(i == j)
						continue;
					list2.add(list.get(j));
				}
				temp2.add(list.get(i));
				permuteOp(list2, temp2);
				temp2 = (ArrayList<Character>)(temp.clone());
			}
		}
	}
}