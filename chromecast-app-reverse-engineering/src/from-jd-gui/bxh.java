import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.locks.Lock;

public abstract class bxh
  implements bwg
{
  public bxh(bwz parambwz) {}
  
  public final void a(int paramInt)
  {
    bwz.b(this.a).lock();
    for (;;)
    {
      boolean bool;
      try
      {
        bool = bwz.a(this.a) instanceof bwy;
        if (bool) {
          return;
        }
        switch (paramInt)
        {
        default: 
          bwz.b(this.a).unlock();
          break;
        case 2: 
          bwz.a(this.a, paramInt);
          this.a.b();
          break;
        case 1: 
          bool = this.a.g;
        }
      }
      finally
      {
        bwz.b(this.a).unlock();
      }
      if (bool)
      {
        bwz.b(this.a).unlock();
      }
      else
      {
        bwz.a(this.a, true);
        if (this.a.i == null)
        {
          bwz localbwz = this.a;
          Object localObject2 = new bxf;
          ((bxf)localObject2).<init>(this.a);
          localbwz.i = ((BroadcastReceiver)localObject2);
          localObject2 = new android/content/IntentFilter;
          ((IntentFilter)localObject2).<init>("android.intent.action.PACKAGE_ADDED");
          ((IntentFilter)localObject2).addDataScheme("package");
          bwz.c(this.a).getApplicationContext().registerReceiver(this.a.i, (IntentFilter)localObject2);
        }
        this.a.h.sendMessageDelayed(this.a.h.obtainMessage(1), bwz.d(this.a));
        this.a.h.sendMessageDelayed(this.a.h.obtainMessage(2), bwz.e(this.a));
        bwz.a(this.a, paramInt);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */