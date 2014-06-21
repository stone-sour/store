package com.kdstore.product;

public class ShoeProduct extends Product {

		private double shoeSize;
		private String shoeStyle;
		private int shoeBox;
		private String shoeType;
		
		public double getShoeSize() {
			return shoeSize;
		}
		public void setShoeSize(double shoeSize) {
			this.shoeSize = shoeSize;
		}
		public String getShoeStyle() {
			return shoeStyle;
		}
		public void setShoeStyle(String shoeStyle) {
			this.shoeStyle = shoeStyle;
		}
		public int getShoeBox() {
			return shoeBox;
		}
		public void setShoeBox(int shoeBox) {
			this.shoeBox = shoeBox;
		}
		public String getShoeType() {
			return shoeType;
		}
		public void setShoeType(String shoeType) {
			this.shoeType = shoeType;
		}
}
