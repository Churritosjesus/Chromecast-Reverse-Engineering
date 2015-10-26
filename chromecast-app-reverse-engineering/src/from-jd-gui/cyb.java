import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class cyb
  extends cvf
{
  private static final String b = cip.Q.toString();
  private static final String c = cit.B.toString();
  private static final String d = cit.v.toString();
  private static final String e = cit.y.toString();
  private static final String f = cit.J.toString();
  private final Context g;
  private ctw h;
  private final HandlerThread i;
  private Handler j;
  private final Set k = new HashSet();
  
  public cyb(Context paramContext, ctw paramctw)
  {
    super(b, new String[] { d, c });
    this.g = paramContext;
    this.h = paramctw;
    this.i = new HandlerThread("Google GTM SDK Timer", 10);
    this.i.start();
    this.j = new Handler(this.i.getLooper());
  }
  
  public final cje a(Map paramMap)
  {
    String str2 = cyh.a((cje)paramMap.get(c));
    String str1 = cyh.a((cje)paramMap.get(f));
    String str3 = cyh.a((cje)paramMap.get(d));
    paramMap = cyh.a((cje)paramMap.get(e));
    try
    {
      l1 = Long.parseLong(str3);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      try
      {
        for (;;)
        {
          l2 = Long.parseLong(paramMap);
          if ((l1 > 0L) && (!TextUtils.isEmpty(str2)))
          {
            if (str1 != null)
            {
              paramMap = str1;
              if (!str1.isEmpty()) {}
            }
            else
            {
              paramMap = "0";
            }
            if (!this.k.contains(paramMap))
            {
              if (!"0".equals(paramMap)) {
                this.k.add(paramMap);
              }
              this.j.postDelayed(new cyc(this, str2, paramMap, l1, l2), l1);
            }
          }
          return cyh.f();
          localNumberFormatException = localNumberFormatException;
          long l1 = 0L;
        }
      }
      catch (NumberFormatException paramMap)
      {
        for (;;)
        {
          long l2 = 0L;
        }
      }
    }
  }
  
  public final boolean a()
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cyb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */