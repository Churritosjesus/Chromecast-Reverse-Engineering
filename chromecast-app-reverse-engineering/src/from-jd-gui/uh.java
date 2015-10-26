import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import java.util.ArrayList;

public final class uh
{
  final String a;
  final String b;
  public String c;
  public String d;
  public boolean e;
  public boolean f;
  public boolean g;
  int h;
  int i;
  public int j;
  public int k;
  public int l;
  public Bundle m;
  public IntentSender n;
  tn o;
  private final ug p;
  private final ArrayList q = new ArrayList();
  private int r = -1;
  
  uh(ug paramug, String paramString1, String paramString2)
  {
    this.p = paramug;
    this.a = paramString1;
    this.b = paramString2;
  }
  
  final int a(tn paramtn)
  {
    int i2 = 1;
    int i4 = 0;
    int i3 = 0;
    int i1 = i4;
    if (this.o != paramtn)
    {
      this.o = paramtn;
      i1 = i4;
      if (paramtn != null)
      {
        i1 = i3;
        if (!tz.a(this.c, paramtn.b()))
        {
          this.c = paramtn.b();
          i1 = 1;
        }
        if (!tz.a(this.d, paramtn.c()))
        {
          this.d = paramtn.c();
          i1 = 1;
        }
        if (this.e == paramtn.d()) {
          break label401;
        }
        this.e = paramtn.d();
        i1 = i2;
      }
    }
    label401:
    for (;;)
    {
      i2 = i1;
      if (this.f != paramtn.e())
      {
        this.f = paramtn.e();
        i2 = i1 | 0x1;
      }
      i1 = i2;
      if (!this.q.equals(paramtn.h()))
      {
        this.q.clear();
        this.q.addAll(paramtn.h());
        i1 = i2 | 0x1;
      }
      i2 = i1;
      if (this.h != paramtn.j())
      {
        this.h = paramtn.j();
        i2 = i1 | 0x1;
      }
      i1 = i2;
      if (this.i != paramtn.k())
      {
        this.i = paramtn.k();
        i1 = i2 | 0x1;
      }
      i2 = i1;
      if (this.j != paramtn.n())
      {
        this.j = paramtn.n();
        i2 = i1 | 0x3;
      }
      i1 = i2;
      if (this.k != paramtn.l())
      {
        this.k = paramtn.l();
        i1 = i2 | 0x3;
      }
      i2 = i1;
      if (this.l != paramtn.m())
      {
        this.l = paramtn.m();
        i2 = i1 | 0x3;
      }
      i1 = i2;
      if (this.r != paramtn.o())
      {
        this.r = paramtn.o();
        i1 = i2 | 0x5;
      }
      i2 = i1;
      if (!tz.a(this.m, paramtn.p()))
      {
        this.m = paramtn.p();
        i2 = i1 | 0x1;
      }
      i1 = i2;
      if (!tz.a(this.n, paramtn.g()))
      {
        this.n = paramtn.g();
        i1 = i2 | 0x1;
      }
      if (this.g != paramtn.f())
      {
        this.g = paramtn.f();
        i1 |= 0x5;
      }
      for (;;)
      {
        return i1;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    tz.f();
    uc localuc = tz.a;
    paramInt = Math.min(this.l, Math.max(0, paramInt));
    if ((this == localuc.g) && (localuc.h != null)) {
      localuc.h.b(paramInt);
    }
  }
  
  public final boolean a()
  {
    
    if (tz.a.b() == this) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean a(String paramString)
  {
    tz.f();
    int i2 = this.q.size();
    int i1 = 0;
    if (i1 < i2) {
      if (!((IntentFilter)this.q.get(i1)).hasCategory(paramString)) {}
    }
    for (boolean bool = true;; bool = false)
    {
      return bool;
      i1++;
      break;
    }
  }
  
  public final boolean a(tx paramtx)
  {
    if (paramtx == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    tz.f();
    return paramtx.a(this.q);
  }
  
  public final void b(int paramInt)
  {
    
    if (paramInt != 0)
    {
      uc localuc = tz.a;
      if ((this == localuc.g) && (localuc.h != null)) {
        localuc.h.c(paramInt);
      }
    }
  }
  
  public final boolean b()
  {
    
    if (tz.a.a() == this) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void c()
  {
    tz.f();
    tz.a.a(this, 3);
  }
  
  final tq d()
  {
    ug localug = this.p;
    tz.f();
    return localug.a;
  }
  
  public final String toString()
  {
    return "MediaRouter.RouteInfo{ uniqueId=" + this.b + ", name=" + this.c + ", description=" + this.d + ", enabled=" + this.e + ", connecting=" + this.f + ", canDisconnect=" + this.g + ", playbackType=" + this.h + ", playbackStream=" + this.i + ", volumeHandling=" + this.j + ", volume=" + this.k + ", volumeMax=" + this.l + ", presentationDisplayId=" + this.r + ", extras=" + this.m + ", settingsIntent=" + this.n + ", providerPackageName=" + this.p.a() + " }";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\uh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */