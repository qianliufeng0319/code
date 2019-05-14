package book;

public class QuadrangleUseInterface {
	
	class parallelogramgleUseInterface extends QuadrangleUseInterface 
	implements drawTest{
		
		public void draw() {
			
			System.out.println("平行四边形.draw()");
			
		}
		
		void doAnyThing() {
			
			//SomeSentence
		}
		
	}

	
	class SquareUseInterface extends QuadrangleUseInterface 
	implements drawTest{
		
		public void draw() {
			
			System.out.println("正方形.draw()");
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
