package week02;

public class TV  {
	boolean on;
	int channel;
	int volum;
	
	void on_off(boolean on) {
		this.on = on;
	}
	void change_channel(int channel) {
		this.channel = channel;
		System.out.println("change_channel »£√‚µ ");
	}
	void change_volum(int volum) {
		this.volum = volum;
	}
}