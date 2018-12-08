package second;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=1;
		int a2=2;
		switch(a1+a2)
		{
		case 1:System.out.println("aaaaaaaaaaaa");
			break;
		case 2:System.out.println("bbbbbbbbbbbb");
		break;
		case 3:System.out.println("ccccccccccccccc");
		break;
		default:System.out.println("ddddddddddddd");
		
		}
			
		String b="abc";
		
		switch(b)
				{
				case "abc":System.out.println("eeeeeeeeee");
					break;
				case "def":System.out.println("fffffffffff");
				break;
				case "hgi":System.out.println("ggggggggggg");
				break;
				default:System.out.println("hhhhhhhhhhh");
				
				}
		
	}

}
