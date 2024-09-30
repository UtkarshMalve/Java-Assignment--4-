package ASSIGNMENT4;

class Time {
	private int hr;
	private int min;
	private int sec;

	public Time(int hr, int min, int sec) {
		if (isValidTime(hr, min, sec)) {
			this.hr = hr;
			this.min = min;
			this.sec = sec;
		} else {
			System.out.println("Invalid time format. Setting to 00:00:00.");
			this.hr = 0;
			this.min = 0;
			this.sec = 0;
		}
	}

	public Time(int seconds) {
		this.hr = seconds / 3600;
		this.min = (seconds % 3600) / 60;
		this.sec = seconds % 60;
	}

	private boolean isValidTime(int hr, int min, int sec) {
		return hr >= 0 && hr < 24 && min >= 0 && min < 60 && sec >= 0 && sec < 60;
	}

	public void display() {
		System.out.printf("%02d:%02d:%02d", hr, min, sec);
	}

	public static void main(String[] args) {
		Time time1 = new Time(12, 30, 45);
		time1.display();

		Time time2 = new Time(7200); // 2 hours
		time2.display();
	}
}