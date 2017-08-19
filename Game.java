import java.util.Scanner;
public class Game{
	public int[] inputTest(){
	int[] testScores = new int[21];
		testScores[0] = 10;
		testScores[1] = 0;
		
		testScores[2] = 10;
		testScores[3] = 0;
		
		testScores[4] = 5;
		testScores[5] = 5;
		
		testScores[6] = 10;
		testScores[7] = 0;
		
		testScores[8] = 10;
		testScores[9] = 0;
		
		testScores[10] = 10;
		testScores[11] = 0;
		
		testScores[12] = 0;
		testScores[13] = 10;
		
		testScores[14] = 5;
		testScores[15] = 4;
		
		testScores[16] = 0;
		testScores[17] = 10;
		
		testScores[18] = 5;
		testScores[19] = 5;
		testScores[20] = 1;
		
		return testScores;
	}
	//入力
	public int[] Input(){
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[21];
		int count = 1;
		for (int i = 0; i < 18; i++){
			System.out.println("ROUND" + count +"--1");
			scores[i]= scan.nextInt();
			if(scores[i]== 10){
				i +=1;
				count += 1; 
			
			}else{
				i++;
				System.out.println("ROUND" + count +"--2");
				scores[i] = scan.nextInt();
				count += 1; 
			}
		}
		
		//第⑩ラウンド
		System.out.println("ROUND" + 10 +"--1");
		scores[18]= scan.nextInt();
		if(scores[18] != 10){
			System.out.println("ROUND" + 10 +"--2");
			scores[19] = scan.nextInt();
			if ((scores[18]+scores[19]) == 10){
				System.out.println("ROUND" + 10 +"--3");
				scores[20] = scan.nextInt();
			}
		}else{
			System.out.println("ROUND" + 10 +"--2");
			scores[19] = scan.nextInt();
			System.out.println("ROUND" + 10 +"--3");
			scores[20] = scan.nextInt();
		}
		return scores;
	}
	
	//出力画面
	public void Display(){
		int[] scores = inputTest();
		int[] roundScore = Calculation();
		System.out.print("Round:");
		
		for(int i = 0; i < 10; i++){
			if(i>8){
				System.out.print(i+1);
				System.out.print("|  ");
			}else{
			System.out.print(" " + (i+1));
			System.out.print("|  ");
			}
		}
		System.out.println("");
		System.out.print("1回目:");
		//System.out.print("     ");
		
		for(int i = 0; i < 20; i++){
			if( i%2 == 0){
				if(scores[i] != 10){
					System.out.print(" "+scores[i]);
					System.out.print("|  ");
				}else{
					System.out.print(scores[i]);
					System.out.print("|  ");
				}
			}
		}		System.out.println();
		System.out.print("2回目:");
		//System.out.print("     ");
		for(int i = 0; i < 20; i++){
			if( i%2 == 1){
				if(scores[i] != 10){
					System.out.print(" "+scores[i]);
					System.out.print("|  ");
				}else{
					System.out.print(scores[i]);
					System.out.print("|  ");
				}
			}
		}
		System.out.println("");
		System.out.print("3回目:");
		System.out.print(" -|   -|   -|   -|   -|   -|   -|   -|   -|   " + scores[20] + "|");
		
		//計算結果の出力
		System.out.println("");
		System.out.print("成績:");
		System.out.println(roundScore[1]);
	}

}