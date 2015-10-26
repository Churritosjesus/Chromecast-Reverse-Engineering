import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class cjf
{
  private static final buu a = new buu("MetadataUtils");
  private static final String[] b = { "Z", "+hh", "+hhmm", "+hh:mm" };
  private static final String c = "yyyyMMdd'T'HHmmss" + b[0];
  
  public static Calendar a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      a.b("Input string is empty or null", new Object[0]);
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      Object localObject2 = b(paramString);
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        a.b("Invalid date format", new Object[0]);
        paramString = null;
      }
      else
      {
        Object localObject3 = c(paramString);
        paramString = "yyyyMMdd";
        Object localObject1 = localObject2;
        if (!TextUtils.isEmpty((CharSequence)localObject3))
        {
          localObject1 = (String)localObject2 + "T" + (String)localObject3;
          if (((String)localObject3).length() != 6) {
            break label134;
          }
        }
        for (paramString = "yyyyMMdd'T'HHmmss";; paramString = c)
        {
          localObject2 = GregorianCalendar.getInstance();
          try
          {
            localObject3 = new java/text/SimpleDateFormat;
            ((SimpleDateFormat)localObject3).<init>(paramString);
            paramString = ((SimpleDateFormat)localObject3).parse((String)localObject1);
            ((Calendar)localObject2).setTime(paramString);
            paramString = (String)localObject2;
          }
          catch (ParseException paramString)
          {
            label134:
            a.b("Error parsing string: %s", new Object[] { paramString.getMessage() });
            paramString = null;
          }
        }
      }
    }
  }
  
  /* Error */
  public static void a(java.util.List paramList, org.json.JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface 115 1 0
    //   6: aload_1
    //   7: ldc 117
    //   9: invokevirtual 123	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   12: astore_1
    //   13: aload_1
    //   14: invokevirtual 126	org/json/JSONArray:length	()I
    //   17: istore 5
    //   19: iconst_0
    //   20: istore 4
    //   22: iload 4
    //   24: iload 5
    //   26: if_icmpge +34 -> 60
    //   29: aload_1
    //   30: iload 4
    //   32: invokevirtual 130	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   35: astore_3
    //   36: new 132	com/google/android/gms/common/images/WebImage
    //   39: astore_2
    //   40: aload_2
    //   41: aload_3
    //   42: invokespecial 135	com/google/android/gms/common/images/WebImage:<init>	(Lorg/json/JSONObject;)V
    //   45: aload_0
    //   46: aload_2
    //   47: invokeinterface 139 2 0
    //   52: pop
    //   53: iinc 4 1
    //   56: goto -34 -> 22
    //   59: astore_0
    //   60: return
    //   61: astore_2
    //   62: goto -9 -> 53
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	paramList	java.util.List
    //   0	65	1	paramJSONObject	org.json.JSONObject
    //   39	8	2	localWebImage	com.google.android.gms.common.images.WebImage
    //   61	1	2	localIllegalArgumentException	IllegalArgumentException
    //   35	7	3	localJSONObject	org.json.JSONObject
    //   20	34	4	i	int
    //   17	10	5	j	int
    // Exception table:
    //   from	to	target	type
    //   0	19	59	org/json/JSONException
    //   29	36	59	org/json/JSONException
    //   36	53	59	org/json/JSONException
    //   36	53	61	java/lang/IllegalArgumentException
  }
  
  private static String b(String paramString)
  {
    Object localObject = null;
    if (TextUtils.isEmpty(paramString))
    {
      a.b("Input string is empty or null", new Object[0]);
      paramString = (String)localObject;
    }
    for (;;)
    {
      return paramString;
      try
      {
        paramString = paramString.substring(0, 8);
      }
      catch (IndexOutOfBoundsException paramString)
      {
        a.c("Error extracting the date: %s", new Object[] { paramString.getMessage() });
        paramString = (String)localObject;
      }
    }
  }
  
  private static String c(String paramString)
  {
    Object localObject = null;
    int i = 0;
    if (TextUtils.isEmpty(paramString))
    {
      a.b("string is empty or null", new Object[0]);
      paramString = (String)localObject;
    }
    for (;;)
    {
      return paramString;
      int j = paramString.indexOf('T');
      if (j != 8)
      {
        a.b("T delimeter is not found", new Object[0]);
        paramString = (String)localObject;
      }
      else
      {
        String str;
        try
        {
          str = paramString.substring(j + 1);
          if (str.length() != 6) {
            break label107;
          }
          paramString = str;
        }
        catch (IndexOutOfBoundsException paramString)
        {
          a.b("Error extracting the time substring: %s", new Object[] { paramString.getMessage() });
          paramString = (String)localObject;
        }
        continue;
        label107:
        switch (str.charAt(6))
        {
        default: 
          paramString = (String)localObject;
          break;
        case '+': 
        case '-': 
          j = str.length();
          if ((j == b[1].length() + 6) || (j == b[2].length() + 6) || (j == b[3].length() + 6)) {
            i = 1;
          }
          paramString = (String)localObject;
          if (i != 0) {
            paramString = str.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
          }
          break;
        case 'Z': 
          paramString = (String)localObject;
          if (str.length() == b[0].length() + 6) {
            paramString = str.substring(0, str.length() - 1) + "+0000";
          }
          break;
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cjf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */