package Janken;

import java.util.Random;

public class Main {

	// プレイヤーのジャンケン入力
	public static int player_hand() {
		int num = 0;
		System.out.println("[0～2]の数字を入力してください。");
		num = new java.util.Scanner(System.in).nextInt(3);
		return num;
	}

	public static void main(String[] args) throws InterruptedException {
		int playerhands = 0;
		int result = 0;

		// ユーザーに設定説明
		System.out.println("じゃんけんゲーム");
		System.out.println("0がグー、1がチョキ、2がパーになっています");

		// 判定処理
		while (result < 3) {
			Random rand = new Random();
			int computerhands = rand.nextInt(2);// コンピュータの手を設定
			playerhands = player_hand();
			System.out.println("プレイヤーの手は" + playerhands + "です。");
			Thread.sleep(2000);
			System.out.println("コンピュータの手は" + computerhands + "です。");
			// じゃんけんの結果を取得
			int judge = (playerhands - computerhands + 3) % 3;
			if (judge == 2) {
				System.out.println("WIN!!");
			} else if (judge == 1) {
				System.out.println("LOSE");
			} else {
				System.out.println("ドロー！");
			}
			System.out.println("");
			result++;
		}
	}
}