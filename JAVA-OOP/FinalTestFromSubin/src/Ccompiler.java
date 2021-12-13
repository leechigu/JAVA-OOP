
public class Ccompiler implements Compiler{

	@Override
	public ObjectCode compile(SourceCode sCode) {
		
		System.out.println("Compiling code: "+sCode.getFileName());
		String temp[] = sCode.getFileName().split("\\.");
		ObjectCode newobj = new ObjectCode(temp[0]+".obj");
		System.out.println("Generating object code: "+newobj.getFileName());
		return newobj;
	}
	
	

}
