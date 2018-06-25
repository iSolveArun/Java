package learning;

class Animal{  
	void eat(){System.out.println("eating...");}  
	}  
	class Test extends Animal{  
		void bark(){System.out.println("barking...");}  
	}  
		class Testt{  
			public static void main(String args[]){  
				Test d=new Test();  
				d.bark();  
				d.eat();  
			}
		}  