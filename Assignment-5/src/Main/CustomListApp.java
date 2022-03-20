package Main;

import customList.CustomArrayList;

public class CustomListApp {

	public static void main(String[] args) {

		CustomArrayList<Integer> elements = new CustomArrayList<>();
		for (int i = 0; i < 54; i++) {
			elements.add(i+27);
		}
		elements.getSize();
		elements.get(7);
	}

}
