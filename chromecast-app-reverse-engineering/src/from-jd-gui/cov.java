import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public abstract class cov
{
  public static String a(Object paramObject)
  {
    return a(paramObject, 0);
  }
  
  public static String a(Object paramObject, int paramInt)
  {
    if (paramInt > 10) {
      paramObject = "ERROR: Recursive toString calls";
    }
    for (;;)
    {
      return (String)paramObject;
      if (paramObject == null)
      {
        paramObject = "";
      }
      else if ((paramObject instanceof String))
      {
        if (TextUtils.isEmpty((String)paramObject)) {
          paramObject = "";
        } else {
          paramObject = paramObject.toString();
        }
      }
      else if ((paramObject instanceof Integer))
      {
        if (((Integer)paramObject).intValue() == 0) {
          paramObject = "";
        } else {
          paramObject = paramObject.toString();
        }
      }
      else if ((paramObject instanceof Long))
      {
        if (((Long)paramObject).longValue() == 0L) {
          paramObject = "";
        } else {
          paramObject = paramObject.toString();
        }
      }
      else if ((paramObject instanceof Double))
      {
        if (((Double)paramObject).doubleValue() == 0.0D) {
          paramObject = "";
        } else {
          paramObject = paramObject.toString();
        }
      }
      else if ((paramObject instanceof Boolean))
      {
        if (!((Boolean)paramObject).booleanValue()) {
          paramObject = "";
        } else {
          paramObject = paramObject.toString();
        }
      }
      else
      {
        StringBuffer localStringBuffer;
        int i;
        Object localObject;
        if ((paramObject instanceof List))
        {
          localStringBuffer = new StringBuffer();
          if (paramInt > 0) {
            localStringBuffer.append("[");
          }
          paramObject = (List)paramObject;
          i = localStringBuffer.length();
          paramObject = ((List)paramObject).iterator();
          while (((Iterator)paramObject).hasNext())
          {
            localObject = ((Iterator)paramObject).next();
            if (localStringBuffer.length() > i) {
              localStringBuffer.append(", ");
            }
            localStringBuffer.append(a(localObject, paramInt + 1));
          }
          if (paramInt > 0) {
            localStringBuffer.append("]");
          }
          paramObject = localStringBuffer.toString();
        }
        else if ((paramObject instanceof Map))
        {
          localStringBuffer = new StringBuffer();
          Iterator localIterator = new TreeMap((Map)paramObject).entrySet().iterator();
          int k = 0;
          i = 0;
          while (localIterator.hasNext())
          {
            localObject = (Map.Entry)localIterator.next();
            paramObject = a(((Map.Entry)localObject).getValue(), paramInt + 1);
            if (!TextUtils.isEmpty((CharSequence)paramObject))
            {
              int m = k;
              int j = i;
              if (paramInt > 0)
              {
                m = k;
                j = i;
                if (i == 0)
                {
                  localStringBuffer.append("{");
                  j = 1;
                  m = localStringBuffer.length();
                }
              }
              if (localStringBuffer.length() > m) {
                localStringBuffer.append(", ");
              }
              localStringBuffer.append((String)((Map.Entry)localObject).getKey());
              localStringBuffer.append('=');
              localStringBuffer.append((String)paramObject);
              k = m;
              i = j;
            }
          }
          if (i != 0) {
            localStringBuffer.append("}");
          }
          paramObject = localStringBuffer.toString();
        }
        else
        {
          paramObject = paramObject.toString();
        }
      }
    }
  }
  
  public static String a(Map paramMap)
  {
    return a(paramMap, 1);
  }
  
  public abstract void a(cov paramcov);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */