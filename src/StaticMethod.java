
public class StaticMethod {

	public static void main(String[] args) {
	machineinfo();
	StaticMethod MI1 = new StaticMethod();
	MI1.Machineinfo1("Rivetting machine",10,'B',10.6f);
	MI1.Machineinfo1("oil filling machine",11,'A',12.2f);
	MI1.Machineinfo1("Dust cap fitting machine",12 , 'A',14.4f);
	MI1.Machineinfo1("Loctite machine", 13, 'A', 6.2f);
	}
 public static void machineinfo()
 {
String MachineName ="Rivetting machine";
int MachineNumber =10;
char grade ='A';
float CycleTime = 10.5f;
System.out.println("================================");
System.out.println("My machine name is "+ MachineName);
System.out.println("My machine number is "+MachineNumber);
System.out.println("Machine grade is "+grade);
System.out.println("Machine cycle time is "+CycleTime);
System.out.println("================================");
 }
 public void Machineinfo1(String MachineName,int MachineNumber,char grade,float CycleTime)
 {
	 System.out.println("=================================");
	 System.out.println("My machine name is "+MachineName);
	 System.out.println("My machine Number is  "+MachineNumber);
	 System.out.println("Machine grade is "+grade);
	 System.out.println("Machine cycle time is "+CycleTime);
	 System.out.println("==================================");
 }
}
