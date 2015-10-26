import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.data.DataHolder;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

public final class csi
{
  public static final String a;
  
  static
  {
    new csj();
    new crq();
    new Handler(Looper.getMainLooper());
    Pattern.compile("\\,");
    Pattern.compile("[     ᠎             　\t\013\f\034\035\036\037\n\r]+");
    Pattern.compile(Pattern.quote("\001"));
    Pattern.compile(Pattern.quote("\002"));
    a = "\001";
    new SecureRandom();
    new csk();
    new csl();
    new csm();
    new csn();
    new cso();
    new csp();
  }
  
  public static String a(Bundle paramBundle)
  {
    return a(paramBundle, "", new StringBuilder()).toString();
  }
  
  private static StringBuilder a(Object paramObject, String paramString, StringBuilder paramStringBuilder)
  {
    if (paramObject == null) {
      paramStringBuilder.append("[null]\n");
    }
    for (;;)
    {
      return paramStringBuilder;
      String str1 = paramString + "  ";
      paramStringBuilder.append("(").append(paramObject.getClass().getSimpleName()).append(") ");
      if ((paramObject instanceof Bundle))
      {
        paramObject = (Bundle)paramObject;
        if (((Bundle)paramObject).isEmpty())
        {
          paramStringBuilder.append("{ }\n");
        }
        else
        {
          paramStringBuilder.append("{\n");
          Iterator localIterator = ((Bundle)paramObject).keySet().iterator();
          while (localIterator.hasNext())
          {
            String str2 = (String)localIterator.next();
            paramStringBuilder.append(str1).append(str2).append(" : ");
            a(((Bundle)paramObject).get(str2), str1, paramStringBuilder);
          }
          paramStringBuilder.append(paramString).append("}\n");
        }
      }
      else
      {
        if ((paramObject instanceof DataHolder))
        {
          paramString = (DataHolder)paramObject;
          paramStringBuilder.append(" [");
          if (paramString.b()) {
            paramStringBuilder.append("CLOSED");
          }
          for (;;)
          {
            paramStringBuilder.append("] ").append(paramObject).append("\n");
            break;
            paramStringBuilder.append(paramString.h);
          }
        }
        int i;
        if ((paramObject instanceof ArrayList))
        {
          paramObject = (ArrayList)paramObject;
          if (((ArrayList)paramObject).isEmpty())
          {
            paramStringBuilder.append("[ ]\n");
          }
          else
          {
            paramStringBuilder.append("[\n");
            for (i = 0; i < ((ArrayList)paramObject).size(); i++)
            {
              paramStringBuilder.append(str1).append(i).append(" : ");
              a(((ArrayList)paramObject).get(i), str1, paramStringBuilder);
            }
            paramStringBuilder.append(paramString).append("]\n");
          }
        }
        else if ((paramObject instanceof byte[]))
        {
          i = ((byte[])paramObject).length;
          paramStringBuilder.append(" [").append(i).append("] ");
          paramString = new byte[Math.min(i, 56)];
          System.arraycopy(paramObject, 0, paramString, 0, paramString.length);
          paramStringBuilder.append(Base64.encodeToString(paramString, 0));
        }
        else if ((paramObject instanceof char[]))
        {
          paramStringBuilder.append("\"").append(new String((char[])paramObject)).append("\"\n");
        }
        else if (paramObject.getClass().isArray())
        {
          if (Array.getLength(paramObject) == 0)
          {
            paramStringBuilder.append("[ ]\n");
          }
          else
          {
            paramStringBuilder.append("[ ");
            paramStringBuilder.append(Array.get(paramObject, 0));
            for (i = 1; i < Array.getLength(paramObject); i++) {
              paramStringBuilder.append(", ").append(Array.get(paramObject, i));
            }
            paramStringBuilder.append(" ]\n");
          }
        }
        else if ((paramObject instanceof String))
        {
          paramStringBuilder.append("\"").append(paramObject).append("\"\n");
        }
        else
        {
          paramStringBuilder.append(paramObject).append("\n");
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\csi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */