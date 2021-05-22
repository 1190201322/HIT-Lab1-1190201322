package p1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class main1 {
	static final int num = 100;//先设置一个静态变量num
	public static int[][] sq = new int[num][num];//定义矩阵的二维数组
	public static boolean[] v = new boolean[num * num + 1];
//main函数里读取5个矩阵并判断、生成一个矩阵判断后输出到文件中，并且在读取时，用for循环分别将字符1到5拼入地址中，输出同理。其中在生成幻方之前，判断n的合法性。
	public static void main(String[] args) throws IOException {
		for (char i = '1'; i <= '5'; i++) {
			System.out.println(i + " " + String.valueOf(isLegalMagicSquare("src/P1/txt/" + i + ".txt")));
		}
		Scanner sr = new Scanner(System.in);
		int n1 = sr.nextInt();
		while (n1 <= 0 || n1 % 2 == 0) {
			System.out.println("Input Wrong");
			n1 = sr.nextInt();
		}
		generateMagicSquare(n1);
		System.out.println("6" + " " + String.valueOf(isLegalMagicSquare("src/P1.txt/txt/" + "6" + ".txt")));
		return;
	}
//判断一个矩阵是否为幻方	
	public static boolean isLegalMagicSquare(String fileName) throws IOException {
		File file = new File(fileName);
		FileReader r = new FileReader(file);
		BufferedReader bR = new BufferedReader(r);
		StringBuilder sb = new StringBuilder();
		String line = "";

		int n = 0, m = 0;
		Arrays.fill(v, false);
		while ((line = bR.readLine()) != null) {
			String[] l = line.split("\t");
			m = l.length;
			for (int i = 0; i < m; i++) {
				sq[n][i] = Integer.valueOf(l[i].trim());
				if (sq[n][i] <= 0 || v[sq[n][i]])
					return false;
				else
					v[sq[n][i]] = true;
			}
			n++;
		}
		bR.close();
		if (n != m)
			return false;
		int s1 = 0, s2 = 0, s = 0;
		for (int i = 0; i < n; i++) {
			s1 += sq[i][i];
			s2 += sq[n - i - 1][i];
		}
		if (s1 == s2)
			s = s1;
		else
			return false;
		for (int i = 0; i < n; i++) {
			s1 = s2 = 0;
			for (int j = 0; j < n; j++) {
				s1 += sq[i][j];
				s2 += sq[j][i];
			}
			if (s1 != s || s2 != s)
				return false;
		}
		return true;
	}

//实现生成一个边长为奇数的幻方
public static boolean generateMagicSquare(int n) throws IOException {
	int magic[][] = new int[n][n];
	int row = 0, col = n / 2, i, j, square = n * n;
	for (i = 1; i <= square; i++) {
		magic[row][col] = i;
		if (i % n == 0)
			row++;
		else {
			if (row == 0)
				row = n - 1;
			else
				row--;
			if (col == (n - 1))
				col = 0;
			else
				col++;
		}
	}
	File file = new File("src/P1/txt/6.txt");
	PrintWriter output = new PrintWriter(file);
	for (i = 0; i < n; i++) {
		for (j = 0; j < n; j++)
			output.print(magic[i][j] + "\t");
		output.println();
	}
	output.close();
	return true;
}

}