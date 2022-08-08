import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			char[] chars = input.toCharArray();
			int i = 0;
			Stack<Character> stack = new Stack<Character>();
			boolean status = false;

			while (i < chars.length) {
				if ((chars[i] == '(') || (chars[i] == '{') || (chars[i] == '[')) {
					stack.push(chars[i]);
				} else {
					if (!stack.isEmpty()) {
						switch (chars[i]) {
						case ']':
							if (stack.pop() == '[')
								status = true;
							else
								status = false;
							break;
						case '}':
							if (stack.pop() == '{')
								status = true;
							else
								status = false;
							break;
						case ')':
							if (stack.pop() == '(')
								status = true;
							else
								status = false;
							break;
						}

						if (!status)
							break;
					} else {
						status = false;
						break;
					}
				}
				i++;
			}
			if (!stack.isEmpty()) {
				status = false;
			}
			System.out.println(status);

		}
		sc.close();

	}
}