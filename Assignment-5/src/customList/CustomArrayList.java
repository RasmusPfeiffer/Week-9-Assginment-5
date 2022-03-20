package customList;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int iCount = 0;

	@Override
	public boolean add(T item) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == (null)) {
				items[i] = item;
				return true;
			} else if (items[items.length - 1] != null) {
				items = Arrays.copyOf(items, items.length * 2);
			}
		}
		return false;
	}

	@Override
	public int getSize() {
		return items.length;
	}

	@Override
	public T get(int index) {
		@SuppressWarnings("unchecked")
		T item = (T) items[index];
		return item;
	}
}
