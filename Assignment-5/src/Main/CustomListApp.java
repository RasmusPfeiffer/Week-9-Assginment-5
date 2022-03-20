package Main;

import customList.CustomArrayList;

public class CustomListApp {

	public static void main(String[] args) {

		CustomArrayList<String> elements = new CustomArrayList<>();
		for (int i = 0; i < 54; i++) {
			elements.add("Element " + i);
		}
		for (int i = 0; i < elements.getSize(); i++) {
			System.out.println(elements.get(i));
		}
	}
}
