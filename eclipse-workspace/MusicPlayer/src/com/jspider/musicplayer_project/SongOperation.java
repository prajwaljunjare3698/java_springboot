package com.jspider.musicplayer_project;

import java.util.ArrayList;
import java.util.Scanner;

public class SongOperation {
	 
	static SongOperation operation = new SongOperation();
	public static ArrayList<Song> music = new ArrayList<Song>();
	
	Scanner sc = new Scanner(System.in);

	public void addSongs() {
		System.out.println("how many song u want to add");
		int no = sc.nextInt();
		
		for (int i =1;i<=no;i++) {
			Song song = new Song();
			System.out.println("Enter song name:");			
			String songName = sc.next();
			song.setSongName(songName);
			
			System.out.println("enter movie"); 
			String movie = sc.next();			
			song.setMovieName(movie);
			
			System.out.println("enter composer");
			String composer = sc.next(); 
			song.setComposer(composer);
			
			System.out.println("enter length");
			double length = sc.nextDouble();
			song.setLength(length);
			
			music.add(song);
			System.out.println("song added successfully");
		}
	}
	public void displayListOfSong() {
		if (music.isEmpty() == true) {
			System.out.println("playlist is empty add songs");		
			MusicPlayer.musicMenu();
		} else {
			int count=0;
			for(Song song:music) {
				System.out.println(++count+"."+song.getSongName());
			}
		}
	}
	public void removeSong() {
		if(music.isEmpty()==true) {
			System.out.println("playlist is empty add songs");
			MusicPlayer.musicMenu();
		}
		else {
			System.out.println("enter id for remove the song");
			displayListOfSong();
			int id = sc.nextInt();
			if(id<=music.size()) {
				music.remove(id-1);
				System.out.println("song removed...");
			}
			else {
				System.out.println("enter proper id");
			}
		}
	}
	public void ChooseSongPlay() {
		if(music.size()!=0) {
			displayListOfSong();
			//Song song = new Song();
			System.out.println("enter song id");
			int id = sc.nextInt();
			if(id<=music.size()) {
				System.out.println(music.get(id-1).getSongName()+" is playing");
			}
			else {
				System.out.println("invalid input");
				operation.ChooseSongPlay();
			}
		}
		else {
			System.out.println("playlist is empty add songs");
			MusicPlayer.musicMenu();
		}		
	}
	public void PlayAllSong() {
		if(music.size()!=0) {
			for (int i = 0; i < music.size(); i++) {
				System.out.println(music.get(i).getSongName() + " song playing");
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else {
			System.out.println("playlist is empty add songs");
			MusicPlayer.musicMenu();
		}
	}
	public void PlayRandom() {
		if(music.size()!=0) {
			//Math.random() * (max - min + 1) + min  
			double a = Math.random() * music.size();
			System.out.println(music.get((int) a).getSongName() + " song playing...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("playlist is empty");
			MusicPlayer.musicMenu();
		}
	}

	public void update() {
		if(music.size()!=0) {
			int count=0;
			for(Song song:music) {
				System.out.println(++count+" "+song.getSongName());
			}
			System.out.println("choose song id no to update");
			int n = sc.nextInt();
			System.out.println("what you want to update\n 1.song name\n 2.movie name \n 3.composer \n 4.length \n 5. back");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("enter new name");
				music.get(n - 1).setSongName(sc.next());
				break;
			case 2:
				System.out.println("enter new movie name");
				music.get(n - 1).setMovieName(sc.next());
				break;
			case 3:
				System.out.println("enter new composer");
				music.get(n - 1).setComposer(sc.next());
				break;
			case 4:
				System.out.println("enter new length");
				music.get(n - 1).setLength(sc.nextDouble());
				break;
			case 5:
				MusicPlayer.musicMenu();
				break;
			}
		}
		else {
			System.out.println("playlist is empty...");
			MusicPlayer.musicMenu();
		}
	}
}
