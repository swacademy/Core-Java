class AssertTest1{
	public static void main(String[] args) {
		Assert at = new Assert();
		try{
			int dan = Integer.parseInt(args[0]);
			at.gugu(dan);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}