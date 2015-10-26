import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class ue
  extends Handler
{
  private final ArrayList a = new ArrayList();
  
  ue(uc paramuc) {}
  
  public final void a(int paramInt, Object paramObject)
  {
    obtainMessage(paramInt, paramObject).sendToTarget();
  }
  
  public final void handleMessage(Message paramMessage)
  {
    int k = paramMessage.what;
    paramMessage = paramMessage.obj;
    switch (k)
    {
    }
    for (;;)
    {
      Object localObject;
      tz localtz;
      ua localua;
      try
      {
        int i = this.b.b.size();
        i--;
        if (i >= 0)
        {
          localObject = (tz)((WeakReference)this.b.b.get(i)).get();
          if (localObject == null)
          {
            this.b.b.remove(i);
            continue;
            this.b.e.a((uh)paramMessage);
            continue;
            this.b.e.b((uh)paramMessage);
            continue;
            this.b.e.c((uh)paramMessage);
            continue;
            this.b.e.d((uh)paramMessage);
            continue;
          }
          this.a.addAll(((tz)localObject).c);
          continue;
        }
        int m = this.a.size();
        i = 0;
        if (i >= m) {
          break;
        }
        ub localub = (ub)this.a.get(i);
        localtz = localub.a;
        localua = localub.b;
        switch (0xFF00 & k)
        {
        default: 
          i++;
          break;
        case 256: 
          localObject = (uh)paramMessage;
          int j;
          if (((localub.d & 0x2) != 0) || (((uh)localObject).a(localub.c)))
          {
            j = 1;
            if (j == 0) {
              continue;
            }
          }
          switch (k)
          {
          case 261: 
          default: 
            break;
          case 257: 
            localua.a(localtz, (uh)localObject);
            continue;
            j = 0;
          }
        }
      }
      finally
      {
        this.a.clear();
      }
      continue;
      localua.b(localtz, (uh)localObject);
      continue;
      localua.c(localtz, (uh)localObject);
      continue;
      localua.b((uh)localObject);
      continue;
      localua.a((uh)localObject);
      continue;
      localua.a();
      continue;
      switch (k)
      {
      default: 
        break;
      case 513: 
        localua.a(localtz);
        break;
      case 514: 
        localua.b(localtz);
        break;
      case 515: 
        localua.c(localtz);
      }
    }
    this.a.clear();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */