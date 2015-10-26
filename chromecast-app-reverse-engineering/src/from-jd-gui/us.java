import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

final class us
  extends tq
  implements ServiceConnection
{
  static final boolean i = Log.isLoggable("MediaRouteProviderProxy", 3);
  final ComponentName j;
  boolean k;
  ut l;
  private final ux m;
  private final ArrayList n = new ArrayList();
  private boolean o;
  private boolean p;
  
  public us(Context paramContext, ComponentName paramComponentName)
  {
    super(paramContext, new tt(paramComponentName));
    this.j = paramComponentName;
    this.m = new ux(this);
  }
  
  private void g()
  {
    if (this.l != null)
    {
      a(null);
      this.p = false;
      int i2 = this.n.size();
      for (int i1 = 0; i1 < i2; i1++) {
        ((uw)this.n.get(i1)).d();
      }
      ut localut = this.l;
      localut.a(2, 0, 0, null, null);
      localut.b.a.clear();
      localut.a.getBinder().unlinkToDeath(localut, 0);
      localut.h.m.post(new uu(localut));
      this.l = null;
    }
  }
  
  public final tu a(String paramString)
  {
    Object localObject = this.g;
    int i1;
    if (localObject != null)
    {
      localObject = ((tv)localObject).a();
      int i2 = ((List)localObject).size();
      i1 = 0;
      if (i1 < i2) {
        if (((tn)((List)localObject).get(i1)).a().equals(paramString))
        {
          paramString = new uw(this, paramString);
          this.n.add(paramString);
          if (this.p) {
            paramString.a(this.l);
          }
          b();
        }
      }
    }
    for (;;)
    {
      return paramString;
      i1++;
      break;
      paramString = null;
    }
  }
  
  public final void a()
  {
    if (!this.k)
    {
      if (i) {
        new StringBuilder().append(this).append(": Starting");
      }
      this.k = true;
      b();
    }
  }
  
  void b()
  {
    if (c()) {
      d();
    }
    for (;;)
    {
      return;
      e();
    }
  }
  
  public final void b(tp paramtp)
  {
    if (this.p) {
      this.l.a(paramtp);
    }
    b();
  }
  
  boolean c()
  {
    boolean bool = true;
    if (this.k) {
      if (this.e == null) {}
    }
    for (;;)
    {
      return bool;
      if (this.n.isEmpty()) {
        bool = false;
      }
    }
  }
  
  void d()
  {
    Object localObject;
    if (!this.o)
    {
      if (i) {
        new StringBuilder().append(this).append(": Binding");
      }
      localObject = new Intent("android.media.MediaRouteProviderService");
      ((Intent)localObject).setComponent(this.j);
    }
    try
    {
      this.o = this.a.bindService((Intent)localObject, this, 1);
      if ((!this.o) && (i))
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append(this).append(": Bind failed");
      }
      return;
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        if (i) {
          new StringBuilder().append(this).append(": Bind failed");
        }
      }
    }
  }
  
  void e()
  {
    if (this.o)
    {
      if (i) {
        new StringBuilder().append(this).append(": Unbinding");
      }
      this.o = false;
      g();
      this.a.unbindService(this);
    }
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (i) {
      new StringBuilder().append(this).append(": Connected");
    }
    if (this.o)
    {
      g();
      if (paramIBinder == null) {
        break label77;
      }
      paramComponentName = new Messenger(paramIBinder);
      if (!a.a(paramComponentName)) {
        break label109;
      }
      paramComponentName = new ut(this, paramComponentName);
      if (!paramComponentName.a()) {
        break label82;
      }
      this.l = paramComponentName;
    }
    for (;;)
    {
      return;
      label77:
      paramComponentName = null;
      break;
      label82:
      if (i)
      {
        new StringBuilder().append(this).append(": Registration failed");
        continue;
        label109:
        Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
      }
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (i) {
      new StringBuilder().append(this).append(": Service disconnected");
    }
    g();
  }
  
  public final String toString()
  {
    return "Service connection " + this.j.flattenToShortString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\us.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */