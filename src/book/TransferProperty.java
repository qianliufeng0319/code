package book;

public class TransferProperty {
	
	
	
	static int i= 47;
	public void call() {
		
		System.out.println("����call()����");
		
		for(i=0;i<3;i++) {
			
			System.out.println(i+" ");
			if(i==2) {
				
			System.out.println("\n");	
			}
		}
	}

	public TransferProperty() {
		}

	

public static void main(String[] args) {
	
	TransferProperty t1= new TransferProperty();
	TransferProperty t2= new TransferProperty();
	t2.i=60;
	System.out.println("��һ��ʵ��������ñ���i�Ľ����"+ t1.i++);
	System.out.println("��һ��ʵ��������ñ���i�Ľ����"+ t1.i);
	t1.call();
	
	System.out.println("�ڶ���ʵ��������ñ����Ľ����"+t2.i);
	t2.call();
	
}

}
