package stream_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Puzzle {
	public static void main(String[] args) {
		List<String> t = new ArrayList<>();
		while(true) {//			
			if(t.size()==8) {
				t.add("-");
				break;
			}			
			else{
//				int rand = (int)(Math.random() * max-min+1) + min;
				int rand = (int)(Math.random()*9-1)+1;
				String no = String.valueOf(rand);
				if(!t.contains(no)) {
					t.add(no);
				}
			}									
		}
		System.out.println(t.get(0)+" "+t.get(1)+" "+t.get(2));
		System.out.println(t.get(3)+" "+t.get(4)+" "+t.get(5));
		System.out.println(t.get(6)+" "+t.get(7)+" "+t.get(8));
		
		System.out.println("arrange the no in ascending order");
		System.out.println("u can use u-Up d-Down l-Left r-Right");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("move the '-' for arranging element");	
			System.out.println(t.get(0)+" "+t.get(1)+" "+t.get(2));
			System.out.println(t.get(3)+" "+t.get(4)+" "+t.get(5));
			System.out.println(t.get(6)+" "+t.get(7)+" "+t.get(8));
			char op = sc.next().charAt(0);
			int ind = t.indexOf("-");
			String dash = "-";
			System.out.println(ind);
			if(op=='u') {
				if(ind!=0 && ind!=1 && ind!=2) {
					if(ind==3) {
						String temp = t.get(3);
						t.add(3,t.get(0));
						t.add(0,temp);
					}					
					else if(ind==4) {
						String temp = t.get(4);
						t.add(4,t.get(1));
						t.add(1,temp);
					}					
					else if(ind==5) {
						String temp = t.get(5);
						t.add(5,t.get(2));
						t.add(2,temp);
					}					
					else if(ind==6) {
						String temp = t.get(6);
						t.add(6,t.get(3));
						t.add(3,temp);
					}					
					else if(ind==7) {
						String temp = t.get(7);
						t.add(7,t.get(4));
						t.add(4,temp);
					}					
					else if(ind==8) {
						String temp = t.get(8);
						t.add(8,t.get(5));
						t.add(5,temp);
						System.out.println(temp+" "+t.get(8)+" "+t.get(5));
					}
					System.out.println(t.get(0)+" "+t.get(1)+" "+t.get(2));
					System.out.println(t.get(3)+" "+t.get(4)+" "+t.get(5));
					System.out.println(t.get(6)+" "+t.get(7)+" "+t.get(8));
				}
				else {
					System.out.println("can't go updside");
				}
				boolean winner = checkWinner(t);
				if(winner) {
					System.out.println("win");
					break;
				}
			}
			else if(op=='d') {
				if(ind!=6 && ind!=7 && ind!=8) {
					if(ind==0) {
						String temp = t.get(0);
						t.add(0,t.get(3));
						t.add(3,temp);
					}
					else if(ind==1) {
						String temp = t.get(1);
						t.add(1,t.get(4));
						t.add(4,temp);
					}
					else if(ind==2) {
						String temp = t.get(2);
						t.add(2,t.get(5));
						t.add(5,temp);
					}
					else if(ind==3) {
						String temp = t.get(3);
						t.add(3,t.get(6));
						t.add(6,temp);
					}
					else if(ind==4) {
						String temp = t.get(4);
						t.add(4,t.get(7));
						t.add(7,temp);
					}
					else if(ind==5) {
						String temp = t.get(5);
						t.add(5,t.get(8));
						t.add(8,temp);
					}
				}
				else {
					System.out.println("can't go downside");
				}
				boolean winner = checkWinner(t);
				if(winner) {
					System.out.println("win");
					break;
				}
			}
			else if(op=='l') {

				if(ind!=0 && ind!=3 && ind!=6) {
					if(ind==1) {
						String temp = t.get(1);
						t.add(1,t.get(0));
						t.add(0,temp);
					}
					else if(ind==2) {
						String temp = t.get(2);
						t.add(2,t.get(1));
						t.add(1,temp);
					}
					else if(ind==4) {
						String temp = t.get(4);
						t.add(4,t.get(3));
						t.add(3,temp);
					}
					else if(ind==5) {
						String temp = t.get(5);
						t.add(5,t.get(4));
						t.add(4,temp);
					}
					else if(ind==7) {
						String temp = t.get(7);
						t.add(7,t.get(6));
						t.add(6,temp);
					}
					else if(ind==8) {
						String temp = t.get(8);
						t.add(8,t.get(7));
						t.add(7,temp);
					}
				}
				else {
					System.out.println("can't go left");
				}
				boolean winner = checkWinner(t);
				if(winner) {
					System.out.println("win");
					break;
				}
			}
			else if(op=='r') {
				if(ind!=2 && ind!=5 && ind!=8) {
					if(ind==0) {
						String temp = t.get(0);
						t.add(0,t.get(1));
						t.add(1,temp);
					}
					else if(ind==3) {
						String temp = t.get(3);
						t.add(3,t.get(4));
						t.add(4,temp);
					}
					else if(ind==6) {
						String temp = t.get(6);
						t.add(6,t.get(7));
						t.add(7,temp);
					}
					else if(ind==1) {
						String temp = t.get(1);
						t.add(1,t.get(2));
						t.add(2,temp);
					}
					else if(ind==4) {
						String temp = t.get(4);
						t.add(4,t.get(5));
						t.add(5,temp);
					}
					else if(ind==7) {
						String temp = t.get(7);
						t.add(7,t.get(8));
						t.add(8,temp);
					}
				}
				else {
					System.out.println("can't go right");
				}
				boolean winner = checkWinner(t);
				if(winner) {
					System.out.println("win");
					break;
				}
			}
		}		
	}
	public static boolean checkWinner(List<String> t) {
//		List<Integer> t = list.stream().map(Integer::parseInt).collect(Collectors.toList());
		if(t.get(0).equals("1") && t.get(1).equals("2") && t.get(2).equals("3") && t.get(3).equals("4") && t.get(4).equals("5") && t.get(5).equals("6")&& t.get(6).equals("7") && t.get(7).equals("8") && t.get(8).equals("-") ) {
			return true;
		}
		return false;
	}
}
