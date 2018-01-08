public class  CastOne {
	public static void main(String [] args){
		byte     byte1 = 127;
		short    short1 ;
		char     char1 = 10;
		int      int1 ;
		float    float1 ;
		long     long1 ;
		double   double1 ;

		short1 = byte1;       // byte(8 bits)   => short(16 bits)
		int1   = short1;      // short(16 bits) => int(32 bits)
		int1   = char1;       // char(16 bits)  => int(32 bits)
		long1  = int1;        // int(32 bits)   => long(64 bits)
		float1 = int1;        // int(32 bits)   => float(32 bits)
		double1 = long1;      // long(64 bits)  => double(64 bits)
	}
}
//자동 형변환