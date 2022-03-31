package customList;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] aItems = new Object[10];
	int iCount = 0;

	@Override
	public boolean add(T item) {
		for (int i = 0; i < aItems.length; i++) {
			if (aItems[aItems.length - 1] != null) {
				aItems = Arrays.copyOf(aItems, aItems.length * 2);
			}
			else if (aItems[i] == null) {
				aItems[i] = item;
				return true;
			} 
		}
		return false;
	}

	@Override
	public int getSize() {
		int i = 0;
		while (i < aItems.length && aItems[i] != null) {
			i++;
		}
		return i;
	}

	@Override
	public T get(int index) {
		@SuppressWarnings("unchecked")
		T item = (T) aItems[index];
		return item;
	}
}
