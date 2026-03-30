package Homework5.Test17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		Scanner sc = new Scanner(System.in);
		tv.setVolumeLevel(sc.nextInt());
		tv.setChannel(sc.nextInt());
		System.out.println("tv的音量和频道为" + tv.getVolumeLevel() + "和" + tv.getChannel());
		tv.channelUp();
		tv.volumeDown();
		System.out.println("调频道和音量后的音量和频道为" + tv.getVolumeLevel() + "和" + tv.getChannel());
	}
}

class TV{
	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on = false;

	public TV() {
	}

	public TV(int channel, int volumeLevel, boolean on) {
		this.channel = channel;
		this.volumeLevel = volumeLevel;
		this.on = on;
	}

	public void turnOn(){
		this.on = true;
	}

	public void turnOff(){
		this.on = false;
	}


	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}

	public void channelUp(){
		if(channel == 120) return;
		this.channel++;
	}

	public void channelDown(){
		this.channel--;
	}

	public void volumeUp(){
		this.volumeLevel++;
	}

	public void volumeDown(){
		if(volumeLevel == 1) return;
		this.volumeLevel--;
	}

}

