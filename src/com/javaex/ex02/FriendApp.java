package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Friend> fList = new ArrayList<Friend>();
		System.out.println("친구를 3명 등록해 주세요");

		while (true) {
			
			try {
				if (fList.size() == 3) {
					break;

				}else {
					Friend friend = new Friend();
					String friendList = sc.nextLine();
					List<String> f = Arrays.asList(friendList.split(" "));
					friend.setName(f.get(0));
					friend.setHp(f.get(1));
					friend.setSchool(f.get(2));
					fList.add(friend);
					
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못 입력하셨습니다. 처음부터 다시 입력해주세요.\n");
			}
			
			

		}
		for(Friend f : fList) {
			f.showInfo();
		}

		sc.close();

	}

}
