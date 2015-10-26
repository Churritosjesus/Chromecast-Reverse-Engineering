import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.ValidateAccountRequest;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public abstract class byo
  implements bwc, byy
{
  private final byl a;
  private final byz b;
  private final Object c = new Object();
  private bzl d;
  private boolean e = false;
  private bwi f;
  public final Context g;
  public final Looper h;
  final Handler i;
  private IInterface j;
  private final ArrayList k = new ArrayList();
  private byt l;
  private int m = 1;
  private final Set n;
  private final Account o;
  private final byx p;
  private final int q;
  
  @Deprecated
  public byo(Context paramContext, Looper paramLooper, int paramInt, bwg parambwg, bwh parambwh)
  {
    this.g = ((Context)a.c(paramContext));
    this.h = ((Looper)a.f(paramLooper, "Looper must not be null"));
    this.b = byz.a(paramContext);
    this.p = new byx(paramLooper, this);
    this.i = new byq(this, paramLooper);
    this.q = paramInt;
    this.o = null;
    this.n = Collections.emptySet();
    this.a = new bwf(paramContext).a();
    a((bwg)a.c(parambwg));
    a((bwh)a.c(parambwh));
  }
  
  public byo(Context paramContext, Looper paramLooper, int paramInt, bwg parambwg, bwh parambwh, byl parambyl)
  {
    this(paramContext, paramLooper, byz.a(paramContext), paramInt, parambyl, parambwg, parambwh);
  }
  
  private byo(Context paramContext, Looper paramLooper, byz parambyz, int paramInt, byl parambyl)
  {
    this.g = ((Context)a.f(paramContext, "Context must not be null"));
    this.h = ((Looper)a.f(paramLooper, "Looper must not be null"));
    this.b = ((byz)a.f(parambyz, "Supervisor must not be null"));
    this.p = new byx(paramLooper, this);
    this.i = new byq(this, paramLooper);
    this.q = paramInt;
    this.a = ((byl)a.c(parambyl));
    this.o = parambyl.a;
    this.n = a(parambyl.c);
  }
  
  private byo(Context paramContext, Looper paramLooper, byz parambyz, int paramInt, byl parambyl, bwg parambwg, bwh parambwh)
  {
    this(paramContext, paramLooper, parambyz, paramInt, parambyl);
    a((bwg)a.c(parambwg));
    a((bwh)a.c(parambwh));
  }
  
  private Set a(Set paramSet)
  {
    if (paramSet == null) {}
    Iterator localIterator;
    do
    {
      while (!localIterator.hasNext())
      {
        return paramSet;
        localIterator = paramSet.iterator();
      }
    } while (paramSet.contains((Scope)localIterator.next()));
    throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
  }
  
  private void a(int paramInt, IInterface paramIInterface)
  {
    boolean bool = true;
    int i1;
    int i2;
    if (paramInt == 3)
    {
      i1 = 1;
      if (paramIInterface == null) {
        break label81;
      }
      i2 = 1;
      label18:
      if (i1 != i2) {
        break label87;
      }
      a.b(bool);
    }
    for (;;)
    {
      synchronized (this.c)
      {
        this.m = paramInt;
        this.j = paramIInterface;
        switch (paramInt)
        {
        default: 
          return;
          i1 = 0;
          break;
          i2 = 0;
          break label18;
          bool = false;
          break;
        case 2: 
          label81:
          label87:
          if (this.l != null)
          {
            paramIInterface = new java/lang/StringBuilder;
            paramIInterface.<init>("Calling connect() while still connected, missing disconnect() for ");
            Log.e("GmsClient", c());
            this.b.b(c(), this.l, l());
          }
          paramIInterface = new byt;
          paramIInterface.<init>(this);
          this.l = paramIInterface;
          if (this.b.a(c(), this.l, l())) {
            continue;
          }
          paramIInterface = new java/lang/StringBuilder;
          paramIInterface.<init>("unable to connect to service: ");
          Log.e("GmsClient", c());
          this.i.sendMessage(this.i.obtainMessage(3, Integer.valueOf(9)));
        }
      }
      if (this.l != null)
      {
        this.b.b(c(), this.l, l());
        this.l = null;
      }
    }
  }
  
  private void a(bwg parambwg)
  {
    this.p.a(parambwg);
  }
  
  private boolean a(int paramInt1, int paramInt2, IInterface paramIInterface)
  {
    synchronized (this.c)
    {
      if (this.m != paramInt1)
      {
        bool = false;
        return bool;
      }
      a(paramInt2, paramIInterface);
      boolean bool = true;
    }
  }
  
  public abstract IInterface a(IBinder paramIBinder);
  
  public void a()
  {
    this.p.a();
    synchronized (this.k)
    {
      int i2 = this.k.size();
      for (int i1 = 0; i1 < i2; i1++) {
        ((byr)this.k.get(i1)).d();
      }
      this.k.clear();
      a(1, null);
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    this.i.sendMessage(this.i.obtainMessage(4, Integer.valueOf(paramInt)));
  }
  
  public void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    this.i.sendMessage(this.i.obtainMessage(1, new byu(this, paramInt, paramIBinder, paramBundle)));
  }
  
  public final void a(bwh parambwh)
  {
    this.p.a(parambwh);
  }
  
  public final void a(bwi parambwi)
  {
    this.f = ((bwi)a.f(parambwi, "Must provide a non-null ConnectionStatusReportCallbacks"));
    this.e = true;
  }
  
  public final void a(bzf parambzf)
  {
    parambzf = new ValidateAccountRequest(parambzf, (Scope[])this.n.toArray(new Scope[this.n.size()]), this.g.getPackageName(), null);
    try
    {
      bzl localbzl = this.d;
      bys localbys = new bys;
      localbys.<init>(this);
      localbzl.a(localbys, parambzf);
      return;
    }
    catch (DeadObjectException parambzf)
    {
      for (;;)
      {
        Log.w("GmsClient", "service died");
        a(1);
      }
    }
    catch (RemoteException parambzf)
    {
      for (;;)
      {
        Log.w("GmsClient", "Remote exception occurred", parambzf);
      }
    }
  }
  
  public final void a(bzf parambzf, Set paramSet)
  {
    try
    {
      Object localObject = e();
      parambzf = new com/google/android/gms/common/internal/GetServiceRequest;
      parambzf.<init>(this.q);
      parambzf.d = this.g.getPackageName();
      parambzf.g = ((Bundle)localObject);
      if (paramSet != null) {
        parambzf.f = ((Scope[])paramSet.toArray(new Scope[paramSet.size()]));
      }
      if (p()) {
        parambzf.h = this.o;
      }
      paramSet = this.d;
      localObject = new bys;
      ((bys)localObject).<init>(this);
      paramSet.a((bzi)localObject, parambzf);
      return;
    }
    catch (DeadObjectException parambzf)
    {
      for (;;)
      {
        Log.w("GmsClient", "service died");
        a(1);
      }
    }
    catch (RemoteException parambzf)
    {
      for (;;)
      {
        Log.w("GmsClient", "Remote exception occurred", parambzf);
      }
    }
  }
  
  public final void a(String arg1, PrintWriter paramPrintWriter)
  {
    paramPrintWriter.append(???).println("GmsClient:");
    String str = ??? + "  ";
    paramPrintWriter.append(str).append("mStartServiceAction=").println(c());
    for (;;)
    {
      IInterface localIInterface;
      synchronized (this.c)
      {
        int i1 = this.m;
        localIInterface = this.j;
        paramPrintWriter.append(str).append("mConnectState=");
        switch (i1)
        {
        default: 
          paramPrintWriter.print("UNKNOWN");
          paramPrintWriter.append(" mService=");
          if (localIInterface != null) {
            break label189;
          }
          paramPrintWriter.println("null");
          return;
        }
      }
      paramPrintWriter.print("CONNECTING");
      continue;
      paramPrintWriter.print("CONNECTED");
      continue;
      paramPrintWriter.print("DISCONNECTING");
      continue;
      paramPrintWriter.print("DISCONNECTED");
      continue;
      label189:
      paramPrintWriter.append(d()).append("@").println(Integer.toHexString(System.identityHashCode(localIInterface.asBinder())));
    }
  }
  
  public Bundle b()
  {
    return null;
  }
  
  public abstract String c();
  
  public abstract String d();
  
  public Bundle e()
  {
    return new Bundle();
  }
  
  public final void j()
  {
    this.p.e = true;
    int i1 = bvt.a(this.g);
    if (i1 != 0)
    {
      a(1, null);
      this.i.sendMessage(this.i.obtainMessage(3, Integer.valueOf(i1)));
    }
    for (;;)
    {
      return;
      a(2, null);
    }
  }
  
  public final boolean k()
  {
    synchronized (this.c)
    {
      if (this.m == 3)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
  
  public String l()
  {
    return this.a.f;
  }
  
  public final boolean m()
  {
    synchronized (this.c)
    {
      if (this.m == 2)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
  
  public final void n()
  {
    if (!k()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  public final IInterface o()
  {
    synchronized (this.c)
    {
      if (this.m == 4)
      {
        DeadObjectException localDeadObjectException = new android/os/DeadObjectException;
        localDeadObjectException.<init>();
        throw localDeadObjectException;
      }
    }
    n();
    if (this.j != null) {}
    for (boolean bool = true;; bool = false)
    {
      a.a(bool, "Client is connected but service is null");
      IInterface localIInterface = this.j;
      return localIInterface;
    }
  }
  
  public boolean p()
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */