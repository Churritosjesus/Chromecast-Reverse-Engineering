import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class dhe
{
  private static final TimeZone a = TimeZone.getTimeZone("GMT");
  private static final ThreadLocal b = new dhf();
  private static final String[] c;
  private static final DateFormat[] d;
  
  static
  {
    String[] arrayOfString = new String[15];
    arrayOfString[0] = "EEE, dd MMM yyyy HH:mm:ss zzz";
    arrayOfString[1] = "EEEE, dd-MMM-yy HH:mm:ss zzz";
    arrayOfString[2] = "EEE MMM d HH:mm:ss yyyy";
    arrayOfString[3] = "EEE, dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[4] = "EEE, dd-MMM-yyyy HH-mm-ss z";
    arrayOfString[5] = "EEE, dd MMM yy HH:mm:ss z";
    arrayOfString[6] = "EEE dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[7] = "EEE dd MMM yyyy HH:mm:ss z";
    arrayOfString[8] = "EEE dd-MMM-yyyy HH-mm-ss z";
    arrayOfString[9] = "EEE dd-MMM-yy HH:mm:ss z";
    arrayOfString[10] = "EEE dd MMM yy HH:mm:ss z";
    arrayOfString[11] = "EEE,dd-MMM-yy HH:mm:ss z";
    arrayOfString[12] = "EEE,dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[13] = "EEE, dd-MM-yyyy HH:mm:ss z";
    arrayOfString[14] = "EEE MMM d yyyy HH:mm:ss z";
    c = arrayOfString;
    d = new DateFormat[arrayOfString.length];
  }
  
  public static String a(Date paramDate)
  {
    return ((DateFormat)b.get()).format(paramDate);
  }
  
  public static Date a(String paramString)
  {
    int i = 0;
    Object localObject;
    if (paramString.length() == 0) {
      localObject = null;
    }
    for (;;)
    {
      return (Date)localObject;
      ParsePosition localParsePosition = new ParsePosition(0);
      localObject = ((DateFormat)b.get()).parse(paramString, localParsePosition);
      if (localParsePosition.getIndex() != paramString.length())
      {
        for (;;)
        {
          synchronized (c)
          {
            int j = c.length;
            if (i >= j) {
              break;
            }
            DateFormat localDateFormat = d[i];
            localObject = localDateFormat;
            if (localDateFormat == null)
            {
              localObject = new java/text/SimpleDateFormat;
              ((SimpleDateFormat)localObject).<init>(c[i], Locale.US);
              ((DateFormat)localObject).setTimeZone(a);
              d[i] = localObject;
            }
            localParsePosition.setIndex(0);
            localObject = ((DateFormat)localObject).parse(paramString, localParsePosition);
            if (localParsePosition.getIndex() == 0) {}
          }
          i++;
        }
        localObject = null;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */