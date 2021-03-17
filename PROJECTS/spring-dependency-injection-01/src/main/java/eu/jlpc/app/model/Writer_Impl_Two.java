package eu.jlpc.app.model;

public class Writer_Impl_Two implements IWriter {

	@Override
	public void writer(String s) {
		System.out.println("From \"Writer_Two\" : " + s);
	}

}
