package Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import loginpage.loginpg;
import module_5.base;
import module_5.excellreader;

public class lgntest extends base {

	@Test(dataProvider="dp")
	public void tst(String uname, String pass) throws IOException
	{
		driver = util();
		
		loginpg log = new loginpg(driver);
		log.lgn();
		log.enterusername(uname);
		log.enterpassword(pass);
		
	}
	
	
	@DataProvider(name="dp")
	public Object[][] dataprovider()
	{
		excellreader rd = new excellreader("C:\\Users\\Admin\\OneDrive\\Documents\\Sheet\\Login.xlsx", "Login");
		int row = rd.rowCount();
		int col = rd.colCount();
		Object obj [][]= new Object[row-1][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rd.getdata(i, j);
				obj[i-1][j]=data;
			}
		}
		return obj;
	}
	
}
