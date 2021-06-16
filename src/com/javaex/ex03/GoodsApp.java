package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		List<Goods> list = new ArrayList<Goods>();
		int sum = 0;

		while (true) {
			try {
				String g = sc.nextLine();

				if (g.equals("q")) {

					break;
				} else {
					Goods goods = new Goods();
					List<String> gList = Arrays.asList(g.split(","));
					goods.setName(gList.get(0));
					goods.setPrice(Integer.parseInt(gList.get(1)));
					goods.setCount(Integer.parseInt(gList.get(2)));

					list.add(goods);
					
					sum = sum + goods.getCount();
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못 입력하셨습니다. 처음부터 다시 입력해주세요.\n");
			} catch (NumberFormatException e) {
				System.out.println("가격과 갯수는 정수로만 입력해주세요.\n");
			}

		}

		System.out.println("==============================");
		
		for (Goods g : list) {
			g.showInfo();
		}
		System.out.println("모든 상품의 갯수는 " + sum + "개 입니다.");

		sc.close();

	}

}
