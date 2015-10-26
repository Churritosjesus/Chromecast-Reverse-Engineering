import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class bk
{
  private static final Object f = new Object();
  private static bk g;
  public final HashMap a = new HashMap();
  public final HashMap b = new HashMap();
  private final Context c;
  private final ArrayList d = new ArrayList();
  private final Handler e;
  
  private bk(Context paramContext)
  {
    this.c = paramContext;
    this.e = new bl(this, paramContext.getMainLooper());
  }
  
  public static bk a(Context paramContext)
  {
    synchronized (f)
    {
      if (g == null)
      {
        bk localbk = new bk;
        localbk.<init>(paramContext.getApplicationContext());
        g = localbk;
      }
      paramContext = g;
      return paramContext;
    }
  }
  
  public final void a(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    synchronized (this.a)
    {
      bn localbn = new bn;
      localbn.<init>(paramIntentFilter, paramBroadcastReceiver);
      Object localObject2 = (ArrayList)this.a.get(paramBroadcastReceiver);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(1);
        this.a.put(paramBroadcastReceiver, localObject1);
      }
      ((ArrayList)localObject1).add(paramIntentFilter);
      for (int i = 0; i < paramIntentFilter.countActions(); i++)
      {
        localObject2 = paramIntentFilter.getAction(i);
        localObject1 = (ArrayList)this.b.get(localObject2);
        paramBroadcastReceiver = (BroadcastReceiver)localObject1;
        if (localObject1 == null)
        {
          paramBroadcastReceiver = new java/util/ArrayList;
          paramBroadcastReceiver.<init>(1);
          this.b.put(localObject2, paramBroadcastReceiver);
        }
        paramBroadcastReceiver.add(localbn);
      }
      return;
    }
  }
  
  public final boolean a(Intent paramIntent)
  {
    label366:
    label393:
    label480:
    label489:
    for (;;)
    {
      Object localObject3;
      int i;
      Object localObject1;
      Object localObject2;
      StringBuilder localStringBuilder;
      int k;
      synchronized (this.a)
      {
        String str3 = paramIntent.getAction();
        String str1 = paramIntent.resolveTypeIfNeeded(this.c.getContentResolver());
        localObject3 = paramIntent.getData();
        String str2 = paramIntent.getScheme();
        Set localSet = paramIntent.getCategories();
        if ((paramIntent.getFlags() & 0x8) != 0)
        {
          i = 1;
          if (i != 0)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("Resolving type ");
            ((StringBuilder)localObject1).append(str1).append(" scheme ").append(str2).append(" of intent ").append(paramIntent);
          }
          ArrayList localArrayList = (ArrayList)this.b.get(paramIntent.getAction());
          if (localArrayList == null) {
            break label480;
          }
          if (i != 0)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("Action list: ");
            ((StringBuilder)localObject1).append(localArrayList);
          }
          localObject1 = null;
          int j = 0;
          if (j >= localArrayList.size()) {
            break label393;
          }
          localObject2 = (bn)localArrayList.get(j);
          if (i != 0)
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("Matching against filter ");
            localStringBuilder.append(((bn)localObject2).a);
          }
          if (((bn)localObject2).c)
          {
            if (i == 0) {
              break label366;
            }
            j++;
            continue;
          }
        }
        else
        {
          i = 0;
          continue;
        }
        k = ((bn)localObject2).a.match(str3, str1, str2, (Uri)localObject3, localSet, "LocalBroadcastManager");
        if (k >= 0)
        {
          if (i != 0)
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("  Filter matched!  match=0x");
            localStringBuilder.append(Integer.toHexString(k));
          }
          if (localObject1 != null) {
            break label489;
          }
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          ((ArrayList)localObject1).add(localObject2);
          ((bn)localObject2).c = true;
        }
      }
      if (i != 0) {
        switch (k)
        {
        default: 
          localObject2 = "unknown reason";
        }
      }
      for (;;)
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("  Filter did not match: ");
        localStringBuilder.append((String)localObject2);
        break;
        localObject2 = "action";
        continue;
        localObject2 = "category";
        continue;
        localObject2 = "data";
        continue;
        localObject2 = "type";
      }
      boolean bool;
      if (localObject1 != null)
      {
        for (i = 0; i < ((ArrayList)localObject1).size(); i++) {
          ((bn)((ArrayList)localObject1).get(i)).c = false;
        }
        localObject3 = this.d;
        localObject2 = new bm;
        ((bm)localObject2).<init>(paramIntent, (ArrayList)localObject1);
        ((ArrayList)localObject3).add(localObject2);
        if (!this.e.hasMessages(1)) {
          this.e.sendEmptyMessage(1);
        }
        bool = true;
      }
      for (;;)
      {
        return bool;
        bool = false;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */