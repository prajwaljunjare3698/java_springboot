package com.jspider.godown;
public class Godown {
	int storeproduct;
	public Godown(int product) {
		System.out.println(product +" products are available");
		this.storeproduct = product;
	}	
	public int checkProduct(){
		return storeproduct;
	}
	public synchronized void orderProduct(int product)  {
		System.out.println("\n customer ordering "+product+" product");
		if(this.storeproduct >= product) {
			System.out.println(product +" products supplied");
			this.storeproduct -= product;
			System.out.println(checkProduct()+" products available"); 
		}
		else {
			try {
				System.out.println(product +" products not available plz wait");
				this.wait();
				System.out.println(checkProduct() +" products available");	
				System.out.println(product+" product supplied successfully");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public synchronized void orderSupply(int product) {
		System.out.println("supplying "+product+" product in godown");
		this.storeproduct += product;
		//System.out.println(storeproduct+ " product available in godown");
		this.notify();
	}
}

