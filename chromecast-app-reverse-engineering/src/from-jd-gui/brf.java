import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

public final class brf
  extends bra
{
  final brh a;
  private bqg b;
  private final bsb c;
  private bqr e;
  
  protected brf(brb parambrb)
  {
    super(parambrb);
    this.e = new bqr(parambrb.c);
    this.a = new brh(this);
    this.c = new brg(this, parambrb);
  }
  
  private void e()
  {
    this.e.a();
    this.c.a(((Long)bqd.A.a()).longValue());
  }
  
  private void f()
  {
    this.d.c().c();
  }
  
  protected final void a() {}
  
  public final boolean a(bsi parambsi)
  {
    a.c(parambsi);
    brb.i();
    r();
    bqg localbqg = this.b;
    boolean bool;
    if (localbqg == null) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      if (parambsi.f) {}
      for (String str = brz.h();; str = brz.i())
      {
        List localList = Collections.emptyList();
        try
        {
          localbqg.a(parambsi.a, parambsi.d, str, localList);
          e();
          bool = true;
        }
        catch (RemoteException parambsi)
        {
          b("Failed to send hits to AnalyticsService");
          bool = false;
        }
      }
    }
  }
  
  public final boolean b()
  {
    brb.i();
    r();
    if (this.b != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean c()
  {
    boolean bool = true;
    brb.i();
    r();
    if (this.b != null) {}
    for (;;)
    {
      return bool;
      bqg localbqg = this.a.a();
      if (localbqg != null)
      {
        this.b = localbqg;
        e();
      }
      else
      {
        bool = false;
      }
    }
  }
  
  public final void d()
  {
    brb.i();
    r();
    try
    {
      bzw.a().a(l(), this.a);
      if (this.b != null)
      {
        this.b = null;
        this.d.c().c();
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */