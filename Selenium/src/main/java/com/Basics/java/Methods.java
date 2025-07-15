package com.Basics.java;

public class Methods {
	public void createVideo(){
		System.out.println("Video created");
		boolean upload = uploadVideo();
		System.out.println(upload);
	}
	private String deleteVideo(String videoId) {
		return videoId;
	}
	//method overloading
	private int deleteVideo(int id) {
		return id;
	}
	private boolean uploadVideo() {
		return true;
	}
	public String shareVideo() {
		return "facebook";
	}
	
	public static void main(String[] args) {
		Methods m = new Methods();
		String s = m.deleteVideo("hsuefnwu123");
		System.out.println("Deleted Video: " + s);
	}
}
