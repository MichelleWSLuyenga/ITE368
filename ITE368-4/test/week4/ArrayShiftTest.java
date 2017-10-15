package week4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArrayShiftTest {

	ArrayShift array = new ArrayShift();
	
	private int[] arr = new int[3];
	private int[] res = new int[3];
	
	public ArrayShiftTest(int[] arr, int[] res) {
		this.arr = arr;
		this.res = res;
	}
	
	@Parameters
public static Collection testConditions(){
		
		int[] arr1 ={1,2,3};
		int[] arr2 ={16,12,20};
		int[] arr3 ={11,22,31};
		
		int[] res1 ={-1,1,2};
		int[] res2 ={-1,16,12};
		int[] res3 ={-1,11,22};
		
	        return Arrays.asList(new Object [][]{
	                {res1, arr1},
	                {res2, arr2},
	                {res3, arr3},
	   
	        });
	}
	
	@Test
	public void test() {
		assertArrayEquals(arr , array.shiftOne(res));
	}

}

