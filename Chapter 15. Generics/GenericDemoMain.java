class GenericDemoMain {
	public static void main(String[] args){
		GenericDemo<String> gd = new GenericDemo<String>();
		
		String [] array = {"Hello", "World", "Good", "Morning"};
		gd.set(array);
		gd.print();
		/* Compile 시 Warning 발생
		GenericDemo gd = new GenericDemo();
		Integer [] s = {1,2,3};
		gd.set(s);
		gd.print();  */
	}
}
