import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

final class ut
  implements IBinder.DeathRecipient
{
  final Messenger a;
  final uy b;
  int c = 1;
  int d = 1;
  int e;
  int f;
  final SparseArray g = new SparseArray();
  private final Messenger i;
  
  public ut(us paramus, Messenger paramMessenger)
  {
    this.a = paramMessenger;
    this.b = new uy(this);
    this.i = new Messenger(this.b);
  }
  
  public final void a(int paramInt)
  {
    int j = this.c;
    this.c = (j + 1);
    a(5, j, paramInt, null, null);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("volume", paramInt2);
    paramInt2 = this.c;
    this.c = (paramInt2 + 1);
    a(7, paramInt2, paramInt1, null, localBundle);
  }
  
  public final void a(tp paramtp)
  {
    int j = this.c;
    this.c = (j + 1);
    if (paramtp != null) {}
    for (paramtp = paramtp.a;; paramtp = null)
    {
      a(10, j, 0, paramtp, null);
      return;
    }
  }
  
  public final boolean a()
  {
    boolean bool = true;
    int j = this.c;
    this.c = (j + 1);
    this.f = j;
    if (!a(1, this.f, 1, null, null)) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      try
      {
        this.a.getBinder().linkToDeath(this, 0);
      }
      catch (RemoteException localRemoteException)
      {
        binderDied();
        bool = false;
      }
    }
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
  {
    Message localMessage = Message.obtain();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramObject;
    localMessage.setData(paramBundle);
    localMessage.replyTo = this.i;
    try
    {
      this.a.send(localMessage);
      bool = true;
    }
    catch (RemoteException paramObject)
    {
      for (;;)
      {
        if (paramInt1 != 2) {
          Log.e("MediaRouteProviderProxy", "Could not send message to service.", (Throwable)paramObject);
        }
        boolean bool = false;
      }
    }
    catch (DeadObjectException paramObject)
    {
      for (;;) {}
    }
    return bool;
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("volume", paramInt2);
    paramInt2 = this.c;
    this.c = (paramInt2 + 1);
    a(8, paramInt2, paramInt1, null, localBundle);
  }
  
  public final void binderDied()
  {
    us.a(this.h).post(new uv(this));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */