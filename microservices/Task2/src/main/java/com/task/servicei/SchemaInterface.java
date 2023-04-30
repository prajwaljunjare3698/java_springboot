package com.task.servicei;

import java.io.IOException;


import com.task.model.Scheme;

public interface SchemaInterface
{

	public void saveScheme() throws IOException;

	public Iterable<Scheme> searchSchemeByName(String schemeName);

	public void savedata() throws  IOException;

	

}
