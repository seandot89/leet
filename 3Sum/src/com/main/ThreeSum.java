package com.main;

import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		int[] numbers = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> sumZero = threeSum(numbers);

		for (int i = 0; i < sumZero.size(); i++) {
			System.out.print("[");
			for (int temp : sumZero.get(i)) {
				System.out.print(temp + " ");
			}
			System.out.print("]");
		}

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new LinkedList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
				while (lo < hi) {
					if (nums[lo] + nums[hi] == sum) {
						List<Integer> tmpList = new ArrayList<Integer>();
						tmpList.add(nums[i]);
						tmpList.add(nums[lo]);
						tmpList.add(nums[hi]);
						result.add(tmpList);
						while (lo < hi && nums[lo] == nums[lo + 1])
							lo++;
						while (lo < hi && nums[hi] == nums[hi - 1])
							hi--;
						lo++;
						hi--;

					} else if (nums[lo] + nums[hi] < sum)
						lo++;
					else
						hi--;
				}

			}

		}

		return result;
	}

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int minDiff = nums[0] + nums[1] + nums[nums.length - 1];
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int lo = i + 1;
				int hi = nums.length - 1;

				while (lo < hi) {
					int sum = nums[i] + nums[lo] + nums[hi];
					if (sum > target)
						hi--;
					else
						lo++;
					if (Math.abs(sum - target) < Math.abs(minDiff - target)) {
						minDiff = sum;
					}
				}
			}
		}

		return minDiff;
	}

}
