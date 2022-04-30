package sec05_try_with_resource;

public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file) {
		this.file=file;
	}
	
	public void read() {
		System.out.println(file+"을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception{  // try catch문이 종료가 될 때에 
		System.out.println(file+"을 닫습니다.");
	}
}
