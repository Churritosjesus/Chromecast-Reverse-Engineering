import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;
import java.util.Set;

final class bza
  extends byz
  implements Handler.Callback
{
  private final HashMap a = new HashMap();
  private final Context b;
  private final Handler c;
  private final bzw d;
  private final long e;
  
  bza(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    this.c = new Handler(paramContext.getMainLooper(), this);
    this.d = bzw.a();
    this.e = 5000L;
  }
  
  private boolean a(bzb parambzb, ServiceConnection paramServiceConnection, String paramString)
  {
    a.f(paramServiceConnection, "ServiceConnection must not be null");
    for (;;)
    {
      bzc localbzc;
      synchronized (this.a)
      {
        localbzc = (bzc)this.a.get(parambzb);
        if (localbzc == null)
        {
          localbzc = new bzc;
          localbzc.<init>(this, parambzb);
          localbzc.a(paramServiceConnection, paramString);
          localbzc.a(paramString);
          this.a.put(parambzb, localbzc);
          parambzb = localbzc;
          boolean bool = parambzb.d;
          return bool;
        }
        this.c.removeMessages(0, localbzc);
        if (localbzc.a(paramServiceConnection))
        {
          paramServiceConnection = new java/lang/IllegalStateException;
          paramString = new java/lang/StringBuilder;
          paramString.<init>("Trying to bind a GmsServiceConnection that was already connected before.  config=");
          paramServiceConnection.<init>(parambzb);
          throw paramServiceConnection;
        }
      }
      localbzc.a(paramServiceConnection, paramString);
      switch (localbzc.c)
      {
      default: 
        parambzb = localbzc;
        break;
      case 1: 
        paramServiceConnection.onServiceConnected(localbzc.g, localbzc.e);
        parambzb = localbzc;
        break;
      case 2: 
        localbzc.a(paramString);
        parambzb = localbzc;
      }
    }
  }
  
  private void b(bzb parambzb, ServiceConnection paramServiceConnection, String arg3)
  {
    a.f(paramServiceConnection, "ServiceConnection must not be null");
    Object localObject;
    synchronized (this.a)
    {
      localObject = (bzc)this.a.get(parambzb);
      if (localObject == null)
      {
        paramServiceConnection = new java/lang/IllegalStateException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("Nonexistent connection status for service config: ");
        paramServiceConnection.<init>(parambzb);
        throw paramServiceConnection;
      }
    }
    if (!((bzc)localObject).a(paramServiceConnection))
    {
      paramServiceConnection = new java/lang/IllegalStateException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
      paramServiceConnection.<init>(parambzb);
      throw paramServiceConnection;
    }
    ((bzc)localObject).h.d.a(((bzc)localObject).h.b, paramServiceConnection, null, null, "DISCONNECT");
    ((bzc)localObject).b.remove(paramServiceConnection);
    if (((bzc)localObject).a())
    {
      parambzb = this.c.obtainMessage(0, localObject);
      this.c.sendMessageDelayed(parambzb, this.e);
    }
  }
  
  public final boolean a(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    return a(new bzb(paramComponentName), paramServiceConnection, paramString);
  }
  
  public final boolean a(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    return a(new bzb(paramString1), paramServiceConnection, paramString2);
  }
  
  public final void b(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    b(new bzb(paramComponentName), paramServiceConnection, paramString);
  }
  
  public final void b(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    b(new bzb(paramString1), paramServiceConnection, paramString2);
  }
  
  public final boolean handleMessage(Message arg1)
  {
    boolean bool = false;
    switch (???.what)
    {
    }
    for (;;)
    {
      return bool;
      bzc localbzc = (bzc)???.obj;
      synchronized (this.a)
      {
        if (localbzc.a())
        {
          if (localbzc.d)
          {
            localbzc.h.d.a(localbzc.h.b, localbzc.a);
            localbzc.d = false;
            localbzc.c = 2;
          }
          this.a.remove(localbzc.f);
        }
        bool = true;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */