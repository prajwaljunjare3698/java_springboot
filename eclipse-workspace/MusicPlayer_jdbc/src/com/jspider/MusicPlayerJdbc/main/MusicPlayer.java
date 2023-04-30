package com.jspider.MusicPlayerJdbc.main;

import java.io.IOException;
import java.sql.SQLException;
import com.jspider.MusicPlayerJdbc.AddSong;
import com.jspider.MusicPlayerJdbc.ChooseSong;
import com.jspider.MusicPlayerJdbc.PlayAllSongs;
import com.jspider.MusicPlayerJdbc.PlayRandomSong;
import com.jspider.MusicPlayerJdbc.RemoveSong;
import com.jspider.MusicPlayerJdbc.RequiredResources;
import com.jspider.MusicPlayerJdbc.SongTable;
import com.jspider.MusicPlayerJdbc.UpdateSong;

public class MusicPlayer {
	static boolean loop = true;
	
	public static void main(String[] args) {
		musicMenu();
		while (loop) {
			musicMenu();
		}		
		try { 
			if(RequiredResources.connection!=null) {
				RequiredResources.connection.close();  
			}
			if(RequiredResources.statement!=null) {
				RequiredResources.statement.close();
			}
			if(RequiredResources.callableStatement!=null) {
				RequiredResources.callableStatement.close();
			}
			if(RequiredResources.preparedStatement!=null) {
				RequiredResources.preparedStatement.close();
			}
			if(RequiredResources.resultSet!=null) {
				RequiredResources.resultSet.close();
			}
			if(RequiredResources.fileReader!=null) { 
				RequiredResources.fileReader.close();
			}
			if(RequiredResources.scanner!=null) {
				RequiredResources.scanner.close();
			}
			
			System.err.println("all connections are closed..");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void musicMenu() {
		
		System.err.println("Menu:-");
		System.out.println("1.show Song-Table\n2.play \n3.Add/Remove \n4.Edit \n5.Exit");
		System.err.println("choose option :-");
		int key = RequiredResources.scanner.nextInt();
		
		switch (key) {
		case 1:
			SongTable.songTable();
			musicMenu();
			break;
		case 2: {
			System.out.println("1.choose song \n2.play all songs \n3.random song \n4.go back.\n");
			System.err.println("choose option :-");
			int key1 = RequiredResources.scanner.nextInt();
			
			switch (key1) {
				case 1: {
					ChooseSong.chooseSong();
					break;
				}
				case 2: {
					PlayAllSongs.PlayAllSong();
					break;
				}
				case 3: {
					PlayRandomSong.PlayRandom();
					break;
				}
				case 4: {
					MusicPlayer.musicMenu();
					break;
				}
				default :
					System.out.println("invalid input");
					musicMenu();
					break;
				}
			break;
		}
		case 3: {
			System.out.println("1.Add song \n2.Remove song \n3. go back");
			System.err.println("choose option :-");
			int key2 = RequiredResources.scanner.nextInt();
			switch (key2) {
				case 1: {
					AddSong.addSong();
					break;
				}
				case 2: {
					RemoveSong.removeSong();
					break;
				}
				case 3: {
					musicMenu();
					break;
				}
				default:
					System.out.println("invalid input");
			}
			break;
		}
		case 4: {
			UpdateSong.updateSong();
			MusicPlayer.musicMenu();
			break;
		}
		case 5:
			loop=false;
			break;
		default : {
			System.err.println("invalid input");			
		}
		}	
	}
}

