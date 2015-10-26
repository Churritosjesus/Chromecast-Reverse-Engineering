import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;

final class uy
  extends Handler
{
  final WeakReference a;
  
  public uy(ut paramut)
  {
    this.a = new WeakReference(paramut);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    ut localut = (ut)this.a.get();
    int i;
    int j;
    Object localObject;
    Bundle localBundle;
    if (localut != null)
    {
      int k = paramMessage.what;
      i = paramMessage.arg1;
      j = paramMessage.arg2;
      localObject = paramMessage.obj;
      localBundle = paramMessage.peekData();
      switch (k)
      {
      default: 
        i = 0;
      }
    }
    for (;;)
    {
      if ((i == 0) && (us.f())) {
        new StringBuilder("Unhandled message from server: ").append(paramMessage);
      }
      return;
      if (i == localut.f)
      {
        localut.f = 0;
        us.a(localut.h, localut, "Registation failed");
      }
      if ((a)localut.g.get(i) != null) {
        localut.g.remove(i);
      }
      i = 1;
      continue;
      i = 1;
      continue;
      if ((localObject != null) && (!(localObject instanceof Bundle))) {
        break;
      }
      localObject = (Bundle)localObject;
      if ((localut.e == 0) && (i == localut.f) && (j > 0))
      {
        localut.f = 0;
        localut.e = j;
        us.a(localut.h, localut, tv.a((Bundle)localObject));
        us.a(localut.h, localut);
        i = 1;
      }
      else
      {
        i = 0;
        continue;
        if ((localObject != null) && (!(localObject instanceof Bundle))) {
          break;
        }
        localObject = (Bundle)localObject;
        if (localut.e != 0)
        {
          us.a(localut.h, localut, tv.a((Bundle)localObject));
          i = 1;
        }
        else
        {
          i = 0;
          continue;
          if ((localObject != null) && (!(localObject instanceof Bundle))) {
            break;
          }
          localObject = (Bundle)localObject;
          if ((a)localut.g.get(i) != null)
          {
            localut.g.remove(i);
            i = 1;
          }
          else
          {
            i = 0;
            continue;
            if ((localObject != null) && (!(localObject instanceof Bundle))) {
              break;
            }
            if (localBundle == null) {}
            for (;;)
            {
              localObject = (Bundle)localObject;
              if ((a)localut.g.get(i) == null) {
                break label414;
              }
              localut.g.remove(i);
              i = 1;
              break;
              localBundle.getString("error");
            }
            label414:
            i = 0;
          }
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\uy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */