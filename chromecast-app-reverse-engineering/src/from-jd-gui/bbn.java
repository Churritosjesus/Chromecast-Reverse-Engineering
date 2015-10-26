import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Iterator;

public final class bbn
  implements bwg, bwh
{
  public Boolean a = null;
  public CastDevice b = null;
  GoogleApiClient c;
  public final tz d;
  private final blp e = new blp("CastScreenTracker");
  private final Context f;
  private final bve g;
  private final Handler h;
  private final ArrayList i = new ArrayList();
  
  private bbn(Context paramContext)
  {
    this.f = paramContext;
    this.h = new Handler();
    this.d = tz.a(this.f);
    bvq.a();
    if (bvq.a(this.f) == 0) {}
    for (int j = 1;; j = 0)
    {
      if ((j != 0) && (bls.a(this.f)) && ((this.c == null) || (!this.c.d())))
      {
        this.c = new bwf(this.f, this, this).a(bvc.b).b();
        this.c.b();
      }
      this.g = new bbo(this);
      return;
    }
  }
  
  public static bbn a(Context paramContext)
  {
    if (blf.a()) {}
    for (paramContext = new bbn(paramContext.getApplicationContext());; paramContext = null) {
      return paramContext;
    }
  }
  
  private void a(CastDevice paramCastDevice1, CastDevice paramCastDevice2)
  {
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext()) {
      ((bbt)localIterator.next()).a(paramCastDevice1, paramCastDevice2);
    }
  }
  
  public final void a(int paramInt) {}
  
  public final void a(Bundle paramBundle)
  {
    d();
    bvc.c.a(this.c, this.g);
  }
  
  public final void a(bbt parambbt)
  {
    this.i.add(parambbt);
  }
  
  public final void a(CastDevice paramCastDevice)
  {
    this.a = Boolean.valueOf(true);
    a(this.b, paramCastDevice);
    this.b = paramCastDevice;
  }
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    paramConnectionResult = String.valueOf(paramConnectionResult);
    new StringBuilder(String.valueOf(paramConnectionResult).length() + 18).append("ConnectionFailed: ").append(paramConnectionResult);
  }
  
  public final boolean a()
  {
    if (this.a != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void b(bbt parambbt)
  {
    this.i.remove(parambbt);
  }
  
  public final boolean b()
  {
    if ((this.a != null) && (this.a.booleanValue())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void c()
  {
    if ((this.c != null) && (this.c.d()))
    {
      bvc.c.a(this.c).a(new bbr(this));
      Toast.makeText(this.f, this.f.getString(b.ap), 1).show();
    }
  }
  
  public final void d()
  {
    if ((this.c == null) || (!this.c.d())) {}
    for (;;)
    {
      return;
      bvc.c.b(this.c).a(new bbs(this));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */