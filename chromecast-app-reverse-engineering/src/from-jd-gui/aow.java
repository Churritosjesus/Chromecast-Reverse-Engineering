import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.gms.cast.CastDevice;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class aow
{
  private static final Pattern v = Pattern.compile("\\.([a-z][a-z0-9]{0,3})$");
  public String a;
  public CastDevice b;
  public bdf c = new bdf();
  public boolean d = false;
  BluetoothDevice e;
  String f;
  public atu g = new atu();
  public ArrayList h = new ArrayList();
  public ArrayList i = new ArrayList();
  public String j;
  public String k;
  public List l;
  public boolean m = false;
  public int n;
  public String o;
  public String p;
  public String q;
  public final Runnable r = new aox(this);
  boolean s;
  public String t;
  public final long[] u = new long[5];
  private final bkl w;
  private final blp x;
  
  static
  {
    new aoy();
  }
  
  public aow(bkl parambkl)
  {
    this.w = parambkl;
    this.x = new blp("UnifiedDevice");
    while (i1 < this.u.length)
    {
      this.u[i1] = -1L;
      i1++;
    }
  }
  
  public static String b(String paramString)
  {
    String str = paramString;
    if (paramString != null) {
      str = paramString.replace("-", "");
    }
    return str;
  }
  
  public final long a()
  {
    long l1 = -1L;
    int i1 = 0;
    while (i1 < this.u.length)
    {
      long l2 = l1;
      if (this.u[i1] > l1) {
        l2 = this.u[i1];
      }
      i1++;
      l1 = l2;
    }
    return l1;
  }
  
  public final void a(double paramDouble)
  {
    int i2 = 1;
    Object localObject = o();
    int i1 = 0;
    if (((atu)localObject).d == null)
    {
      ((atu)localObject).d = new atv();
      i1 = 1;
    }
    if (((atu)localObject).d.b != paramDouble)
    {
      ((atu)localObject).d.b = paramDouble;
      i1 = i2;
    }
    for (;;)
    {
      if (i1 != 0)
      {
        localObject = this.i.iterator();
        while (((Iterator)localObject).hasNext()) {
          ((alu)((Iterator)localObject).next()).b(this);
        }
      }
      return;
    }
  }
  
  void a(int paramInt)
  {
    this.u[(paramInt - 1)] = bkl.b();
  }
  
  public final void a(als paramals)
  {
    this.h.add(paramals);
  }
  
  public final void a(bdf parambdf)
  {
    b(parambdf);
    a(aoz.a);
  }
  
  void a(String paramString)
  {
    if (paramString != null) {
      this.a = b(paramString);
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.f = paramString1;
    this.c.a(paramString2);
    paramString2 = v.matcher(paramString1);
    bdf localbdf;
    if (paramString2.find())
    {
      paramString2 = paramString2.group(1);
      if (!this.d)
      {
        if (TextUtils.isEmpty(paramString2)) {
          break label226;
        }
        localbdf = this.c;
        localbdf.F = paramString2.substring(0, 1);
        switch (bdh.a[(localbdf.b() - 1)])
        {
        default: 
          localbdf.h = true;
          localbdf.k = false;
          label118:
          if (TextUtils.isEmpty(paramString2)) {
            break;
          }
        }
      }
    }
    for (this.c.b = paramString1.substring(0, paramString1.length() - paramString2.length() - 1);; this.c.b = paramString1)
    {
      a(aoz.b);
      return;
      paramString2 = null;
      break;
      localbdf.h = false;
      localbdf.k = true;
      break label118;
      localbdf.h = true;
      localbdf.k = true;
      break label118;
      localbdf.h = true;
      localbdf.k = false;
      break label118;
      localbdf.h = false;
      localbdf.k = false;
      break label118;
      localbdf.h = true;
      localbdf.k = false;
      break label118;
      label226:
      this.c.F = "";
      break label118;
    }
  }
  
  public final void a(List paramList)
  {
    if ((this.l == null) || (!this.l.equals(paramList))) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.l = paramList;
      if (i1 != 0) {
        p();
      }
      return;
    }
  }
  
  public final long b(int paramInt)
  {
    return this.u[(paramInt - 1)];
  }
  
  public final void b()
  {
    atv localatv = o().d;
    if ((localatv != null) && (localatv.a()))
    {
      aqj localaqj = SetupApplication.a().j.a(this);
      if (localaqj != null) {
        localaqj.a(localatv.b());
      }
    }
  }
  
  public final void b(bdf parambdf)
  {
    if (parambdf != null)
    {
      this.c = parambdf;
      a(this.c.n);
    }
    this.d = true;
  }
  
  public final void b(String paramString1, String paramString2)
  {
    if ((TextUtils.equals(paramString1, this.o)) && (TextUtils.equals(paramString2, this.p))) {}
    for (;;)
    {
      return;
      this.o = paramString1;
      this.p = paramString2;
      paramString2 = o();
      paramString1 = this.p;
      if (!TextUtils.equals(paramString1, paramString2.a))
      {
        paramString2.b = null;
        paramString2.c = null;
        paramString2.d = null;
        paramString2.e = null;
        paramString2.f = null;
        paramString2.g = null;
        paramString2.h = null;
        paramString2.i = null;
      }
      paramString2.a = paramString1;
      p();
    }
  }
  
  public final void c()
  {
    aqj localaqj = SetupApplication.a().j.a(this);
    if (localaqj != null) {
      localaqj.a(true, false);
    }
  }
  
  boolean c(int paramInt)
  {
    long l1 = this.u[(paramInt - 1)];
    if ((l1 != -1L) && (bkl.b() - l1 >= 30000L)) {
      this.u[(paramInt - 1)] = -1L;
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean d()
  {
    return "E8C28D3C".equals(this.o);
  }
  
  public final boolean d(int paramInt)
  {
    if (this.u[(paramInt - 1)] != -1L) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean e()
  {
    return "674A0243".equals(this.o);
  }
  
  public final String f()
  {
    Object localObject;
    if ((this.c != null) && (this.c.q != null)) {
      localObject = this.c.q;
    }
    for (;;)
    {
      return (String)localObject;
      String str = this.a;
      localObject = str;
      if (str == null) {
        localObject = "";
      }
    }
  }
  
  public final String g()
  {
    return this.c.b;
  }
  
  public final int h()
  {
    if ((!this.d) || (this.c.h)) {}
    for (int i1 = a.eM;; i1 = a.eL) {
      return i1;
    }
  }
  
  public final void i()
  {
    if (this.m)
    {
      this.m = false;
      this.n = -1;
      p();
    }
  }
  
  public final void j()
  {
    aqj localaqj = SetupApplication.a().j.a(this);
    if (localaqj != null) {
      localaqj.f();
    }
    for (;;)
    {
      return;
      g();
    }
  }
  
  public final boolean k()
  {
    if (this.n > 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean l()
  {
    if (this.n < this.l.size() - 1) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final String m()
  {
    return this.c.q;
  }
  
  public final String n()
  {
    String str;
    if (this.b != null) {
      str = this.b.d.getHostAddress();
    }
    for (;;)
    {
      return str;
      if (!TextUtils.isEmpty(this.c.u)) {
        str = this.c.u;
      } else {
        str = "192.168.255.249";
      }
    }
  }
  
  public final atu o()
  {
    if (this.g == null) {
      this.g = new atu();
    }
    return this.g;
  }
  
  public final void p()
  {
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext()) {
      ((als)localIterator.next()).a(this);
    }
  }
  
  public final boolean q()
  {
    boolean bool = false;
    if ((r()) && ((!this.c.w) || (this.c.E))) {
      if (this.c.G != bdj.o) {
        break label52;
      }
    }
    label52:
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        bool = true;
      }
      return bool;
    }
  }
  
  public final boolean r()
  {
    if ((d(aoz.a)) || (d(aoz.d))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean s()
  {
    if ((this.l != null) && (!this.l.isEmpty())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final String toString()
  {
    String str2 = g();
    if (q()) {}
    for (String str1 = "needs set up";; str1 = "ready to cast") {
      return String.valueOf(str2).length() + 3 + String.valueOf(str1).length() + str2 + " (" + str1 + ")";
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */