package eu.jlpc.dev.model;

import org.springframework.stereotype.Service;

@Service
public class Writer_Impl_One implements IWriter {

	@Override
	public void writer(String s) {
		System.out.println("From \"Writer_One\" : " + s);
	}

}
