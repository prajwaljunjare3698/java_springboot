package com.jspider.musicplayer_project;

import java.util.Scanner;

public class MusicPlayer {
	static boolean loop = true;
	static SongOperation operation = new SongOperation();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while (loop) {
			musicMenu();
		}
		sc.close();
	}
	public static void musicMenu() {
		
		System.out.println("Menu :- \n1.play \n2.Add/Remove \n3.Edit \n4.Exit");
		System.err.println("choose option :-");
		int key = sc.nextInt();
		 
		switch (key) {
		case 1: {
			System.out.println("1.choose song \n2.all songs \n3.random song \n4.go back.");
			System.err.println("choose option :-");
			int key1 = sc.nextInt();
			switch (key1) {
			case 1: {
				operation.ChooseSongPlay();
				break;
			}
			case 2: {
				operation.PlayAllSong();
				break;
			}
			case 3: {
				operation.PlayRandom();
				break;
			}
			case 4: {
				musicMenu();
				break;
			}
			default :
				System.out.println("invalid input");
				break;
			}
			break;
		}
		case 2: {
			System.out.println("1.Add song \n2.Remove song \n3. go back");
			System.err.println("choose option :-");
			int key2 = sc.nextInt();
			switch (key2) {
				case 1: {
					operation.addSongs();
					break;
				}
				case 2: {
					operation.removeSong();
					break;
				}
				case 3: {
					musicMenu();
					break;
				}
				default :
					System.out.println("invalid input");
					break;
			}
			break;
		}
		case 3: {
			operation.update();
			break;
		}
		case 4:
			loop=false;
			break;
		default : {
			System.out.println("invalid input");			
		}
		}			
	}
}

