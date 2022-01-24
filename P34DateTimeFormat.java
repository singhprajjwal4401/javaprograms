/* this program will be working on formats of date and time.When user
 want to */
import java.time.format.*;
import java.time.*;
class LogicDateTimeFormat
{
	void formatOfDateTime()
	{
	LocalDateTime obj=LocalDateTime.parse("2018:02:09 02:56:56");
	DateTimeFormatter.ofPattern( "yyyy/MM/dd kk:mm:ss" ); 
	
	}
}

class P34DateTimeFormat
{
	public static void main(String args[])
	{
	LogicDateTimeFormat obj=new LogicDateTimeFormat();
	obj.formatOfDateTime();
	}
}