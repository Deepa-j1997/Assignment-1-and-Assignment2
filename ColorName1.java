package JavaPrograms;
	class colorname
	{
	public static void main(String args[])throws Exception
	{
	char ch;
	System.out.println("enter color code in VIBGYOR ");
	ch=(char)System.in.read();
	switch(ch)
	{
	case 'v':
	System.out.println("violet");
	break;
	case 'i':
	System.out.println("indigo");
	break;
	case 'b':
	System.out.println("blue");
	break;
	case 'g':
	System.out.println("green");
	break;
	case 'y':
	System.out.println("yellow");
	break;
	case 'o':
	System.out.println("orange");
	break;
	case 'r':
	System.out.println("red");
	break;
	default:
	System.out.println("labled color code");
	break;
	}
	}
	}


