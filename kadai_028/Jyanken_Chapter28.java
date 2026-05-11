package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	

	public String getMyChoice() {
		
		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		
		String rock = "r";
		String scissors = "s";
		String paper = "p";
		
		while(true) {
			//入力した内容を取得する
			String input = scanner.next();
		if(input.equals(rock)|| input.equals(scissors)|| input.equals(paper)) {
			return input;
		} else {
			System.out.println("入力が間違っています。正しいじゃんけんの手を入力してください");
		}
	}
}
	
	public String getRandom() {
		String[] randomChoice = {"r", "s", "p"};
		
		int number = (int)Math.floor(Math.random() * 3);
		
		return randomChoice[number];
	}
	
	public void playGame(String getMyChoice, String getRandom) {
		HashMap<String,String> Game = new HashMap<String,String>();
		
		Game.put("r", "グー");
		Game.put("s", "チョキ");
		Game.put("p", "パー");
		
		System.out.println("自分の手は" + Game.get(getMyChoice) + ",対戦相手の手は" + Game.get(getRandom));
		
		if(getMyChoice.equals(getRandom)) {
			System.out.println("あいこです");
		} else if((getMyChoice.equals("r")&& getRandom.equals("s"))||
				  (getMyChoice.equals("s")&& getRandom.equals("p"))||
				  (getMyChoice.equals("p")&& getRandom.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
