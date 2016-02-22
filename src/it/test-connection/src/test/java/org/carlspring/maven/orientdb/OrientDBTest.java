package org.carlspring.maven.orientdb;

import java.io.IOException;
import java.util.Properties;

import org.apache.maven.plugins.annotations.Parameter;
import org.junit.Assert;
import org.junit.Test;
import com.orientechnologies.orient.client.remote.OServerAdmin;

public class OrientDBTest
{
	@Test
	public void connectionTest() throws IOException
	{
		OServerAdmin serverAdmin = new OServerAdmin("remote:localhost:3015").connect("rootoo", "hello");
		System.out.println("Succesfully connected to database");
	}

}
