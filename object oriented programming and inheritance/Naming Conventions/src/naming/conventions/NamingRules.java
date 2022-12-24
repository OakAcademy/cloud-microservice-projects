package naming.conventions;

import java.beans.JavaBean;

public class NamingRules {

	public static void main(String[] args) {
		
		//variables
		int java;//valid
		int _java;//valid
		int $java;//valid
		int _$java;//valid
		int __$$java;//valid
		int __$$java_$;//valid
		
//		int 1java;//invalid
//		int &java;//invalid
//		int @java;//invalid
//		int java@java;//invalid
//		int public;//invalid
		
		int Public;//valid public is not the same as Public
		int $public;//valid
		int _public;//valid

	}
	
	//methods
	void java() {}//valid
	void _java() {}//valid
	void $java() {}//valid
	void _$java() {}//valid
	void __$$java_$() {}//valid
	void Java() {}//valid
	void JAVA() {}//valid
	
	//void 1java() {}//invalid
	//void &java() {}//invalid
	//void @java() {}//invalid
	//void public() {}//invalid
	
	void Public() {}//valid
	void $public() {}//valid
	void _public() {}//valid
	
	
	
	
	
	
	
	
	
	

}
