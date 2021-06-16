package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

	public static void main(String[] args) {

		Rectangle r01 = new Rectangle(5, 6);
		RectTriangle t01 = new RectTriangle(6, 2);

		List<Shape> sList = new ArrayList<Shape>();
		sList.add(r01);
		sList.add(t01);

		
		for (int i = 0; i < sList.size(); i++) {

			System.out.println("area: " + sList.get(i).getArea());
			System.out.println("perimeter: " + sList.get(i).getPerimeter());

			if (sList.get(i) instanceof Resizeable) {
				((Resizeable) sList.get(i)).resize(0.5);

				System.out.println("new area: " + sList.get(i).getArea());
				System.out.println("new perimeter: " + sList.get(i).getPerimeter());
			}
		}
		
		
		/*
		 * 일단 해결은 되는데 다른 리사이징 가능한 클래스가 왔을땐 사용 안된다는 점에서 탈락일듯
		for (Shape s : sList) {

			System.out.println("area: " + s.getArea());
			System.out.println("perimeter: " + s.getPerimeter());

			if (s instanceof Rectangle) {
				((Resizeable)s).resize(0.5);

				System.out.println("new area: " + s.getArea());
				System.out.println("new perimeter: " + s.getPerimeter());
			}
		}
		*/


	}
}
