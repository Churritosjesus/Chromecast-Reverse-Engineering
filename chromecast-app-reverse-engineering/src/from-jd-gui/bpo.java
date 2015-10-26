import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class bpo
  extends bpd
{
  private static List i = new ArrayList();
  public boolean c;
  public boolean d;
  volatile boolean e;
  public boolean f;
  
  public bpo(brb parambrb)
  {
    super(parambrb);
    new HashSet();
  }
  
  public static bpo a(Context paramContext)
  {
    return brb.a(paramContext).d();
  }
  
  public static void b()
  {
    try
    {
      if (i != null)
      {
        Iterator localIterator = i.iterator();
        while (localIterator.hasNext()) {
          ((Runnable)localIterator.next()).run();
        }
        i = null;
      }
    }
    finally {}
  }
  
  public final bps a(String paramString)
  {
    try
    {
      bps localbps = new bps;
      localbps.<init>(this.a, paramString, null);
      localbps.s();
      return localbps;
    }
    finally {}
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */