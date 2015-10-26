import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class uc
  implements vc, vo
{
  final Context a;
  final ArrayList b = new ArrayList();
  final ArrayList c = new ArrayList();
  final ArrayList d = new ArrayList();
  final ve e;
  uz f;
  uh g;
  tu h;
  private final ArrayList i = new ArrayList();
  private final vd j = new vd();
  private final uf k = new uf(this);
  private final ue l = new ue(this);
  private final boolean m;
  private uh n;
  private tp o;
  
  uc(Context paramContext)
  {
    new ud(this);
    this.a = paramContext;
    bz.a(paramContext);
    this.m = a.a((ActivityManager)paramContext.getSystemService("activity"));
    this.e = ve.a(paramContext, this);
    a(this.e);
  }
  
  private void a(boolean paramBoolean)
  {
    if ((this.n != null) && (!a(this.n)))
    {
      new StringBuilder("Clearing the default route because it is no longer selectable: ").append(this.n);
      this.n = null;
    }
    int i1;
    if ((this.n == null) && (!this.c.isEmpty()))
    {
      Iterator localIterator = this.c.iterator();
      if (localIterator.hasNext())
      {
        uh localuh = (uh)localIterator.next();
        if ((localuh.d() != this.e) || (!localuh.a.equals("DEFAULT_ROUTE"))) {
          break label200;
        }
        i1 = 1;
        label109:
        if ((i1 == 0) || (!a(localuh))) {
          break label204;
        }
        this.n = localuh;
        new StringBuilder("Found default route: ").append(this.n);
      }
    }
    if ((this.g != null) && (!a(this.g)))
    {
      new StringBuilder("Unselecting the current route because it is no longer selectable: ").append(this.g);
      b(null, 0);
    }
    if (this.g == null) {
      b(d(), 0);
    }
    for (;;)
    {
      return;
      label200:
      i1 = 0;
      break label109;
      label204:
      break;
      if (paramBoolean) {
        e();
      }
    }
  }
  
  private static boolean a(uh paramuh)
  {
    if ((paramuh.o != null) && (paramuh.e)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private int b(String paramString)
  {
    int i2 = this.c.size();
    int i1 = 0;
    if (i1 < i2) {
      if (!((uh)this.c.get(i1)).b.equals(paramString)) {}
    }
    for (;;)
    {
      return i1;
      i1++;
      break;
      i1 = -1;
    }
  }
  
  private void b(uh paramuh, int paramInt)
  {
    if (this.g != paramuh)
    {
      if (this.g != null)
      {
        if (tz.g()) {
          new StringBuilder("Route unselected: ").append(this.g).append(" reason: ").append(paramInt);
        }
        this.l.a(263, this.g);
        if (this.h != null)
        {
          this.h.a(paramInt);
          this.h.a();
          this.h = null;
        }
      }
      this.g = paramuh;
      if (this.g != null)
      {
        this.h = paramuh.d().a(paramuh.a);
        if (this.h != null) {
          this.h.b();
        }
        if (tz.g()) {
          new StringBuilder("Route selected: ").append(this.g);
        }
        this.l.a(262, this.g);
      }
      e();
    }
  }
  
  private uh d()
  {
    Iterator localIterator = this.c.iterator();
    uh localuh;
    int i1;
    for (;;)
    {
      if (localIterator.hasNext())
      {
        localuh = (uh)localIterator.next();
        if (localuh != this.n) {
          if ((localuh.d() == this.e) && (localuh.a("android.media.intent.category.LIVE_AUDIO")) && (!localuh.a("android.media.intent.category.LIVE_VIDEO")))
          {
            i1 = 1;
            label66:
            if ((i1 == 0) || (!a(localuh))) {
              break label82;
            }
          }
        }
      }
    }
    for (;;)
    {
      return localuh;
      i1 = 0;
      break label66;
      label82:
      break;
      localuh = this.n;
    }
  }
  
  private void e()
  {
    if (this.g != null)
    {
      this.j.a = this.g.k;
      this.j.b = this.g.l;
      this.j.c = this.g.j;
      this.j.d = this.g.i;
      int i2 = this.i.size();
      for (int i1 = 0; i1 < i2; i1++) {
        this.i.get(i1);
      }
    }
  }
  
  public final tz a(Context paramContext)
  {
    int i1 = this.b.size();
    for (;;)
    {
      i1--;
      if (i1 >= 0)
      {
        tz localtz = (tz)((WeakReference)this.b.get(i1)).get();
        if (localtz == null) {
          this.b.remove(i1);
        } else if (localtz.b == paramContext) {
          paramContext = localtz;
        }
      }
      else
      {
        for (;;)
        {
          return paramContext;
          paramContext = new tz(paramContext);
          this.b.add(new WeakReference(paramContext));
        }
      }
    }
  }
  
  public final uh a()
  {
    if (this.n == null) {
      throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }
    return this.n;
  }
  
  public final uh a(String paramString)
  {
    int i1 = c(this.e);
    ug localug;
    if (i1 >= 0)
    {
      localug = (ug)this.d.get(i1);
      i1 = localug.a(paramString);
      if (i1 < 0) {}
    }
    for (paramString = (uh)localug.b.get(i1);; paramString = null) {
      return paramString;
    }
  }
  
  public final void a(tq paramtq)
  {
    if (c(paramtq) < 0)
    {
      ug localug = new ug(paramtq);
      this.d.add(localug);
      if (tz.g()) {
        new StringBuilder("Provider added: ").append(localug);
      }
      this.l.a(513, localug);
      a(localug, paramtq.g);
      paramtq.a(this.k);
      paramtq.a(this.o);
    }
  }
  
  void a(ug paramug, tv paramtv)
  {
    int i1;
    int i2;
    boolean bool3;
    boolean bool1;
    boolean bool2;
    int i3;
    label70:
    tn localtn;
    int i5;
    Object localObject;
    if (paramug.c != paramtv)
    {
      paramug.c = paramtv;
      i1 = 1;
      if (i1 == 0) {
        break label707;
      }
      i2 = 0;
      i1 = 0;
      bool3 = false;
      bool1 = false;
      bool2 = bool3;
      i3 = i2;
      if (paramtv == null) {
        break label548;
      }
      if (!paramtv.b()) {
        break label516;
      }
      List localList = paramtv.a();
      int i4 = localList.size();
      i2 = 0;
      bool2 = bool1;
      i3 = i1;
      if (i2 >= i4) {
        break label548;
      }
      localtn = (tn)localList.get(i2);
      String str = localtn.a();
      i5 = paramug.a(str);
      if (i5 >= 0) {
        break label301;
      }
      localObject = paramug.b().flattenToShortString() + ":" + str;
      if (b((String)localObject) >= 0) {
        break label255;
      }
      paramtv = (tv)localObject;
      paramtv = new uh(paramug, str, paramtv);
      localObject = paramug.b;
      i3 = i1 + 1;
      ((ArrayList)localObject).add(i1, paramtv);
      this.c.add(paramtv);
      paramtv.a(localtn);
      if (tz.g()) {
        new StringBuilder("Route added: ").append(paramtv);
      }
      this.l.a(257, paramtv);
      i1 = i3;
    }
    for (;;)
    {
      i2++;
      break label70;
      i1 = 0;
      break;
      label255:
      for (i3 = 2;; i3++)
      {
        paramtv = String.format(Locale.US, "%s_%d", new Object[] { localObject, Integer.valueOf(i3) });
        if (b(paramtv) < 0) {
          break;
        }
      }
      label301:
      if (i5 < i1)
      {
        Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + localtn);
      }
      else
      {
        paramtv = (uh)paramug.b.get(i5);
        localObject = paramug.b;
        i3 = i1 + 1;
        Collections.swap((List)localObject, i5, i1);
        i1 = paramtv.a(localtn);
        if (i1 != 0)
        {
          if ((i1 & 0x1) != 0)
          {
            if (tz.g()) {
              new StringBuilder("Route changed: ").append(paramtv);
            }
            this.l.a(259, paramtv);
          }
          if ((i1 & 0x2) != 0)
          {
            if (tz.g()) {
              new StringBuilder("Route volume changed: ").append(paramtv);
            }
            this.l.a(260, paramtv);
          }
          if ((i1 & 0x4) != 0)
          {
            if (tz.g()) {
              new StringBuilder("Route presentation display changed: ").append(paramtv);
            }
            this.l.a(261, paramtv);
          }
          if (paramtv == this.g)
          {
            bool1 = true;
            i1 = i3;
            continue;
            label516:
            Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + paramtv);
            i3 = i2;
            bool2 = bool3;
            label548:
            for (i1 = paramug.b.size() - 1; i1 >= i3; i1--)
            {
              paramtv = (uh)paramug.b.get(i1);
              paramtv.a(null);
              this.c.remove(paramtv);
            }
            a(bool2);
            for (i1 = paramug.b.size() - 1; i1 >= i3; i1--)
            {
              paramtv = (uh)paramug.b.remove(i1);
              if (tz.g()) {
                new StringBuilder("Route removed: ").append(paramtv);
              }
              this.l.a(258, paramtv);
            }
            if (tz.g()) {
              new StringBuilder("Provider changed: ").append(paramug);
            }
            this.l.a(515, paramug);
            label707:
            return;
          }
        }
        i1 = i3;
      }
    }
  }
  
  public final void a(uh paramuh, int paramInt)
  {
    if (!this.c.contains(paramuh)) {
      Log.w("MediaRouter", "Ignoring attempt to select removed route: " + paramuh);
    }
    for (;;)
    {
      return;
      if (!paramuh.e) {
        Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + paramuh);
      } else {
        b(paramuh, paramInt);
      }
    }
  }
  
  public final boolean a(tx paramtx, int paramInt)
  {
    boolean bool;
    if (paramtx.c()) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      if (((paramInt & 0x2) == 0) && (this.m))
      {
        bool = true;
      }
      else
      {
        int i2 = this.c.size();
        for (int i1 = 0;; i1++)
        {
          if (i1 >= i2) {
            break label97;
          }
          uh localuh = (uh)this.c.get(i1);
          if ((((paramInt & 0x1) == 0) || (!localuh.b())) && (localuh.a(paramtx)))
          {
            bool = true;
            break;
          }
        }
        label97:
        bool = false;
      }
    }
  }
  
  public final uh b()
  {
    if (this.g == null) {
      throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }
    return this.g;
  }
  
  public final void b(tq paramtq)
  {
    int i1 = c(paramtq);
    if (i1 >= 0)
    {
      paramtq.a(null);
      paramtq.a(null);
      paramtq = (ug)this.d.get(i1);
      a(paramtq, null);
      if (tz.g()) {
        new StringBuilder("Provider removed: ").append(paramtq);
      }
      this.l.a(514, paramtq);
      this.d.remove(i1);
    }
  }
  
  int c(tq paramtq)
  {
    int i2 = this.d.size();
    int i1 = 0;
    if (i1 < i2) {
      if (((ug)this.d.get(i1)).a != paramtq) {}
    }
    for (;;)
    {
      return i1;
      i1++;
      break;
      i1 = -1;
    }
  }
  
  public final void c()
  {
    ty localty = new ty();
    int i2 = this.b.size();
    boolean bool = false;
    int i1 = 0;
    Object localObject;
    for (;;)
    {
      int i3 = i2 - 1;
      if (i3 < 0) {
        break;
      }
      tz localtz = (tz)((WeakReference)this.b.get(i3)).get();
      if (localtz == null)
      {
        this.b.remove(i3);
        i2 = i3;
      }
      else
      {
        int i5 = localtz.c.size();
        for (int i4 = 0; i4 < i5; i4++)
        {
          localObject = (ub)localtz.c.get(i4);
          localty.a(((ub)localObject).c);
          if ((((ub)localObject).d & 0x1) != 0)
          {
            bool = true;
            i1 = 1;
          }
          i2 = i1;
          if ((((ub)localObject).d & 0x4) != 0)
          {
            i2 = i1;
            if (!this.m) {
              i2 = 1;
            }
          }
          i1 = i2;
          if ((((ub)localObject).d & 0x8) != 0) {
            i1 = 1;
          }
        }
        i2 = i3;
      }
    }
    if (i1 != 0)
    {
      localObject = localty.a();
      if ((this.o == null) || (!this.o.a().equals(localObject)) || (this.o.b() != bool)) {
        break label238;
      }
    }
    label238:
    do
    {
      return;
      localObject = tx.c;
      break;
      if ((!((tx)localObject).c()) || (bool)) {
        break label333;
      }
    } while (this.o == null);
    label333:
    for (this.o = null;; this.o = new tp((tx)localObject, bool))
    {
      if (tz.g()) {
        new StringBuilder("Updated discovery request: ").append(this.o);
      }
      i2 = this.d.size();
      for (i1 = 0; i1 < i2; i1++) {
        ((ug)this.d.get(i1)).a.a(this.o);
      }
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\uc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */