package ch07;
/*
 * 設計一個筆的類別，搭配PenTest.java一起參考使用
 * 此為物件導向設計之基礎
 */
public class Pen {
	//實體變數，需透過物件參考變數進行操作
	String brand;
	double price;
	//方法成員，需透過物件參考變數進行呼叫
	public void showInfo() {
		System.out.println("牌子為：" + brand);
		System.out.println("價格為：" + price);
	}
}
