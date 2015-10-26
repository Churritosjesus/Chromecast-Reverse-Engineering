import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class aia
  extends BroadcastReceiver
{
  private static aia a;
  private Context b;
  
  private aia(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
  }
  
  public static aia a(Context paramContext)
  {
    if (a != null) {}
    for (paramContext = a;; paramContext = a)
    {
      return paramContext;
      paramContext = new aia(paramContext);
      a = paramContext;
      bk.a(paramContext.b).a(paramContext, new IntentFilter("com.parse.bolts.measurement_event"));
    }
  }
  
  protected final void finalize()
  {
    try
    {
      bk localbk = bk.a(this.b);
      for (;;)
      {
        synchronized (localbk.a)
        {
          ArrayList localArrayList1 = (ArrayList)localbk.a.remove(this);
          if (localArrayList1 == null) {
            return;
          }
          int j = 0;
          if (j < localArrayList1.size())
          {
            IntentFilter localIntentFilter = (IntentFilter)localArrayList1.get(j);
            int k = 0;
            if (k < localIntentFilter.countActions())
            {
              String str = localIntentFilter.getAction(k);
              ArrayList localArrayList2 = (ArrayList)localbk.b.get(str);
              if (localArrayList2 != null)
              {
                int i = 0;
                if (i < localArrayList2.size())
                {
                  if (((bn)localArrayList2.get(i)).b != this) {
                    break label196;
                  }
                  localArrayList2.remove(i);
                  i--;
                  i++;
                  continue;
                }
                if (localArrayList2.size() <= 0) {
                  localbk.b.remove(str);
                }
              }
              k++;
              continue;
            }
            j++;
          }
        }
      }
    }
    finally
    {
      super.finalize();
    }
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    ahe localahe = ahe.a(paramContext);
    paramContext = String.valueOf("bf_");
    Object localObject = String.valueOf(paramIntent.getStringExtra("event_name"));
    if (((String)localObject).length() != 0) {}
    for (paramContext = paramContext.concat((String)localObject);; paramContext = new String(paramContext))
    {
      Bundle localBundle = paramIntent.getBundleExtra("event_args");
      localObject = new Bundle();
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        paramIntent = (String)localIterator.next();
        ((Bundle)localObject).putString(paramIntent.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String)localBundle.get(paramIntent));
      }
    }
    localahe.a(paramContext, (Bundle)localObject);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */