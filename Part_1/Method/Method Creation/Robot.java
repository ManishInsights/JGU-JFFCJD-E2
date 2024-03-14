class Robot
{
	public static void main(String[] args)
	{
		Robot robot = new Robot();
		robot.add();
		robot.drive();
		robot.run();
		robot.sleep();
		robot.game();
	}
	public void add()
	{
		System.out.println("Adding your Fedback...........");
	}
	static void drive()
	{
		System.out.println("Driving the Car ............");
	}
	void run()
	{
		System.out.println("Ready to Run................");
	}
	public static void sleep()
	{
		System.out.println("It's Time to Sleep..........");
	}
	void game()
	{
		System.out.println("Playing game for fun........");	
	}
}