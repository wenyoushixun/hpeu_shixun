package com.qingshixun;

import java.util.Scanner;

public class Year {
	
	public static void main(String[] args) {

		/*
		 * 一个回归年：365天5小时48分46秒 。 
		 * 闰年的规定：1.400年倍数者设闰 2.能被4整除的非世纪年设闰
		 * ＜四年一闰，百年不闰，四百年再闰＞ ＜百年24闰，四百年97闰＞ 
		 * 如果不考虑历史上历法使用变迁，仅按照2017年7月23日是星期日来计算：
		 * 489*366+1527*365+204=736533 736533 能够被7整除 即公元元年1月1日是星期日
		 */

		System.out.println("************万年历（元年-？？）************");
		System.err.println("#写在前面：此工具按照现行历法逆推出元年元月1日是星期日#\n#并以此为基础进行计算的，不考虑历法更替等因素导致的误差#");
		Scanner input = new Scanner(System.in);

		System.out.print("请输入年份：");
		int yearNumber = input.nextInt();
		System.out.print("请输入月份：");
		int monthNumber = input.nextInt();

		// 该年之前闰年个数
		int leapNumber = 0;
		for (int m = 1; m < yearNumber; m++) {
			if (m % 4 == 0) {

				leapNumber++;
				if (m % 100 == 0 && m % 400 != 0) {
					leapNumber--;
				}
			}
		}
		System.out.println("该年份之前闰年个数： " + leapNumber);

		// 该年之前平年个数
		int commonNumber = yearNumber - 1 - leapNumber;
		System.out.println("该年份之前平年个数： " + commonNumber);

		/*
		 * 该年之前天数 余几即周几，0为周日。
		 */
		int dayNumber = leapNumber * 366 + commonNumber * 365;
		System.out.println("该年份之前的天数： " + dayNumber);

		// 该年第一天周几 ,定义公元元年第一天为周0。
		if (yearNumber == 1) {
			System.out.println("1年1月1日是星期" + 0);
		} else {
			dayNumber++;
			int week = dayNumber % 7;
			System.out.println("该年第一天是周" + week);
		}

		// 判断是闰年否
		int judge;
		if (yearNumber % 400 == 0) {
			judge = 1;
		} else if (yearNumber % 4 == 0 && yearNumber % 100 != 0) {
			judge = 1;
		} else {
			judge = 0;
		}
		System.out.println("日\t" + "一\t" + "二\t" + "三\t" + "四\t" + "五\t" + "六\t");
		int monthDay = 0;

		// 是平年
		if (judge == 0) {

			switch (monthNumber) {
			case 1:
				monthDay = 31;
				dayNumber = dayNumber + 0;
				break;
			case 2:
				monthDay = 28;
				dayNumber = dayNumber + 31;
				break;
			case 3:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 28;
				break;
			case 4:
				monthDay = 30;
				dayNumber = dayNumber + 31 + 28 + 31;
				break;
			case 5:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 28 + 31 + 30;
				break;
			case 6:
				monthDay = 30;
				dayNumber = dayNumber + 31 + 28 + 31 + 30 + 31;
				break;
			case 7:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 28 + 31 + 30 + 31 + 30;
				break;
			case 8:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 28 + 31 + 30 + 31 + 30 + 31;
				break;
			case 9:
				monthDay = 30;
				dayNumber = dayNumber + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 10:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 11:
				monthDay = 30;
				dayNumber = dayNumber + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 12:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			default:
				System.err.println("！错误的月份！");

			}
			int i = 1;
			// 打印空格，i控制换行
			for (int j = 1; j <= dayNumber % 7; j++, i++) {
				System.out.print(" \t");

			}
			// 打印日期
			for (int k = 1; k <= monthDay; k++, i++) {
				System.out.print(k + "\t");
				if (i % 7 == 0) {
					System.out.println();
				}
			}

		}

		// 是闰年
		if (judge == 1) {

			switch (monthNumber) {
			case 1:
				monthDay = 31;
				dayNumber = dayNumber + 0;
				break;
			case 2:
				monthDay = 29;
				dayNumber = dayNumber + 31;
				break;
			case 3:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 29;
				break;
			case 4:
				monthDay = 30;
				dayNumber = dayNumber + 31 + 29 + 31;
				break;
			case 5:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 29 + 31 + 30;
				break;
			case 6:
				monthDay = 30;
				dayNumber = dayNumber + 31 + 29 + 31 + 30 + 31;
				break;
			case 7:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 29 + 31 + 30 + 31 + 30;
				break;
			case 8:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 29 + 31 + 30 + 31 + 30 + 31;
				break;
			case 9:
				monthDay = 30;
				dayNumber = dayNumber + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 10:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 11:
				monthDay = 30;
				dayNumber = dayNumber + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 12:
				monthDay = 31;
				dayNumber = dayNumber + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			default:
				System.err.println("！错误的月份！");

			}
			int i = 1;
			// 打印空格，i控制换行
			for (int j = 1; j <= dayNumber % 7; j++, i++) {
				System.out.print(" \t");

			}
			// 打印日期
			for (int k = 1; k <= monthDay; k++, i++) {
				System.out.print(k + "\t");
				if (i % 7 == 0) {
					System.out.println();
				}
			}

		}
		input.close();
	}

}
