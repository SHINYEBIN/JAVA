package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus(); //���������� ��ü ����
		
		vehicle.run();
		//vehicle.checkFare();  //�θ�Ÿ�����μ���� ������ �ڽ�Ŭ���� �������� ���� �ȵȴ�!
								//	��
		Bus bus=(Bus)vehicle; // �ذ� ��� (���� Ÿ�� ��ȯ) // �ѹ� ����� ������ �ȹٲ� ���� vehicle�� ������ �ٲ�� �� �ƴ϶� ó���Ҷ��� �ӽ÷� �ٲ��.  
								
		bus.run();
		bus.checkFare();
		
		/*
		Bus bus2=new Bus();
		bus2.run();
		bus2.checkFare();
		*/
		
	}

}
