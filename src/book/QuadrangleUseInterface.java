package book;

public class QuadrangleUseInterface {
	
	class parallelogramgleUseInterface extends QuadrangleUseInterface 
	implements drawTest{
		
		public void draw() {
			
			System.out.println("ƽ���ı���.draw()");
			
		}
		
		void doAnyThing() {
			
			//SomeSentence
		}
		
	}

	
	class SquareUseInterface extends QuadrangleUseInterface 
	implements drawTest{
		
		public void draw() {
			
			System.out.println("������.draw()");
		}
		
		void doAnyThing() {
			
			//SomeSentence
		}
	}
	
	class AnyThingUseInterface extends QuadrangleUseInterface{
		
		public void doAnything() {
			
			
		}
	}
	
	public void doAnything() {
		
		//SomeSentence
	}
	
	public static void main(String[] args) {
		
	}
}
