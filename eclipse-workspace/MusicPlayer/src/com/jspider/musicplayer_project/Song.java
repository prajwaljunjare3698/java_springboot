package com.jspider.musicplayer_project;


public class Song {
	//int id;
	private String songName;
	private String singerName;
	private String movieName;
	private String composer;
	private String lyricist;
	private double length;
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double d) {
		this.length = d;
	}
	@Override
	public String toString() {
		return "Song [songName=" + songName + ", singerName=" + singerName + ", movieName=" + movieName + ", composer="
				+ composer + ", lyricist=" + lyricist + ", length=" + length + "]";
	}
	
}
