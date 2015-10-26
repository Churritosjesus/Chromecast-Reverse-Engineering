import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class bql
  extends bra
{
  private static String a = "3";
  private static String b = "01VDIWEA?";
  private static bql c;
  
  public bql(brb parambrb)
  {
    super(parambrb);
  }
  
  private static String a(Object paramObject)
  {
    if (paramObject == null)
    {
      paramObject = null;
      return (String)paramObject;
    }
    if ((paramObject instanceof Integer)) {}
    for (Object localObject = new Long(((Integer)paramObject).intValue());; localObject = paramObject)
    {
      if ((localObject instanceof Long))
      {
        if (Math.abs(((Long)localObject).longValue()) < 100L)
        {
          paramObject = String.valueOf(localObject);
          break;
        }
        if (String.valueOf(localObject).charAt(0) == '-') {}
        for (paramObject = "-";; paramObject = "")
        {
          localObject = String.valueOf(Math.abs(((Long)localObject).longValue()));
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append((String)paramObject);
          localStringBuilder.append(Math.round(Math.pow(10.0D, ((String)localObject).length() - 1)));
          localStringBuilder.append("...");
          localStringBuilder.append((String)paramObject);
          localStringBuilder.append(Math.round(Math.pow(10.0D, ((String)localObject).length()) - 1.0D));
          paramObject = localStringBuilder.toString();
          break;
        }
      }
      if ((localObject instanceof Boolean))
      {
        paramObject = String.valueOf(localObject);
        break;
      }
      if ((localObject instanceof Throwable))
      {
        paramObject = localObject.getClass().getCanonicalName();
        break;
      }
      paramObject = "-";
      break;
    }
  }
  
  public static bql b()
  {
    return c;
  }
  
  private void b(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    int i = 0;
    label222:
    label228:
    for (;;)
    {
      try
      {
        a.c(paramString);
        if (paramInt >= 0) {
          break label228;
        }
        paramInt = i;
        if (paramInt >= b.length())
        {
          paramInt = b.length() - 1;
          char c1;
          if (m().a())
          {
            if (byk.a)
            {
              c1 = 'P';
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              paramString = a + b.charAt(paramInt) + c1 + "7327" + ":" + c(paramString, a(paramObject1), a(paramObject2), a(paramObject3));
              if (paramString.length() <= 1024) {
                break label222;
              }
              paramString = paramString.substring(0, 1024);
              paramObject1 = this.d;
              if ((((brb)paramObject1).g == null) || (!((brb)paramObject1).g.q()))
              {
                paramObject1 = null;
                if (paramObject1 != null) {
                  ((bqp)paramObject1).b.a(paramString);
                }
              }
            }
            else
            {
              c1 = 'C';
              continue;
            }
          }
          else
          {
            if (byk.a)
            {
              c1 = 'p';
              continue;
            }
            c1 = 'c';
            continue;
          }
          paramObject1 = ((brb)paramObject1).g;
          continue;
          continue;
        }
      }
      finally {}
    }
  }
  
  protected final void a()
  {
    try
    {
      c = this;
      return;
    }
    finally {}
  }
  
  public final void a(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str = (String)bqd.b.a();
    if (Log.isLoggable(str, paramInt)) {
      Log.println(paramInt, str, c(paramString, paramObject1, paramObject2, paramObject3));
    }
    if (paramInt >= 5) {
      b(paramInt, paramString, paramObject1, paramObject2, paramObject3);
    }
  }
  
  public final void a(bsi parambsi, String paramString)
  {
    if (parambsi != null) {}
    for (parambsi = parambsi.toString();; parambsi = "no hit data")
    {
      d("Discarding hit. " + paramString, parambsi);
      return;
    }
  }
  
  public final void a(Map paramMap, String paramString)
  {
    StringBuilder localStringBuilder;
    if (paramMap != null)
    {
      localStringBuilder = new StringBuilder();
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(',');
        }
        localStringBuilder.append((String)localEntry.getKey());
        localStringBuilder.append('=');
        localStringBuilder.append((String)localEntry.getValue());
      }
    }
    for (paramMap = localStringBuilder.toString();; paramMap = "no hit data")
    {
      d("Discarding hit. " + paramString, paramMap);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */