package learning.inheritance;

 public class Mobile {
	
//Instance variable
	String companyName;
	float  price;
	String modelType;
void setInfo(String companyName,float price,String modelType) {
	
	this.companyName=companyName;
	this.price= price;
	this.modelType=modelType;
	}

	void getinfo()
	{
		System.out.println("companyName: " +companyName +  " price " + price + "modelType:" + modelType);
	}
}
class SmartPhone extends Mobile
{
	String osName,cameraResolution;
	void setMobileinfo(String osName,String cameraResolution) {
		this.osName=osName;
		this.cameraResolution=cameraResolution;
	}
	void getinfo()
	{
		super.getinfo();
		

		System.out.println("osName:" + osName + "cameraResolution: " + cameraResolution);
	}
}





