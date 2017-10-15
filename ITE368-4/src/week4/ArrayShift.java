package week4;

public class ArrayShift {
	/**
	 * Shift all the values of the input array along by one cell.
	 * @param inArray The input array.
	 * @return The shifted array, whose 0 element has the value -1.
	 */
	public int[] shiftOne(int[] inArray) {
		int[] outArray = new int[inArray.length];
		
		outArray[0] = -1;
		
		for (int i = 0; i < inArray.length - 1; i++) {
			outArray[i + 1] = inArray[i];
		}
		return outArray;
	}
}
