import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class bwf
{
  private final Set a = new HashSet();
  private String b;
  private String c;
  private final Map d = new HashMap();
  private final Context e;
  private final Map f = new HashMap();
  private int g = -1;
  private int h = -1;
  private Looper i;
  private bwd j;
  private final Set k = new HashSet();
  private final Set l = new HashSet();
  private clu m = new clu();
  
  public bwf(Context paramContext)
  {
    this.e = paramContext;
    this.i = paramContext.getMainLooper();
    this.b = paramContext.getPackageName();
    this.c = paramContext.getClass().getName();
    this.j = clp.a;
  }
  
  public bwf(Context paramContext, bwg parambwg, bwh parambwh)
  {
    this(paramContext);
    a.f(parambwg, "Must provide a connected listener");
    this.k.add(parambwg);
    a.f(parambwh, "Must provide a connection failed listener");
    this.l.add(parambwh);
  }
  
  public final bwf a(bvz parambvz)
  {
    this.f.put(parambvz, null);
    this.a.addAll(parambvz.a);
    return this;
  }
  
  public final bwf a(bvz parambvz, bwb parambwb)
  {
    a.f(parambwb, "Null options are not permitted for this Api");
    this.f.put(parambvz, parambwb);
    this.a.addAll(parambvz.a);
    return this;
  }
  
  public final bwf a(bwg parambwg)
  {
    this.k.add(parambwg);
    return this;
  }
  
  public final bwf a(bwh parambwh)
  {
    this.l.add(parambwh);
    return this;
  }
  
  public final byl a()
  {
    return new byl(null, this.a, this.d, 0, null, this.b, this.c, this.m.a());
  }
  
  public final GoogleApiClient b()
  {
    boolean bool3 = true;
    boolean bool2 = true;
    boolean bool1;
    Object localObject3;
    Object localObject2;
    int n;
    label113:
    Object localObject1;
    if (!this.f.isEmpty())
    {
      bool1 = true;
      a.b(bool1, "must call addApi() to add at least one API");
      if (this.g < 0) {
        break label192;
      }
      localObject3 = bxn.a(null);
      localObject2 = new bwz(this.e.getApplicationContext(), this.i, a(), this.j, this.f, this.k, this.l, this.g, -1);
      n = this.g;
      a.f(localObject2, "GoogleApiClient instance cannot be null");
      if (((bxn)localObject3).c.indexOfKey(n) >= 0) {
        break label186;
      }
      bool1 = bool2;
      a.a(bool1, "Already managing a GoogleApiClient with id " + n);
      localObject1 = new bxo((bxn)localObject3, n, (GoogleApiClient)localObject2, null);
      ((bxn)localObject3).c.put(n, localObject1);
      if ((((bxn)localObject3).a) && (!((bxn)localObject3).b)) {
        ((GoogleApiClient)localObject2).b();
      }
    }
    for (;;)
    {
      return (GoogleApiClient)localObject2;
      bool1 = false;
      break;
      label186:
      bool1 = false;
      break label113;
      label192:
      if (this.h >= 0)
      {
        localObject3 = bxq.a(null);
        n = this.h;
        if (((j)localObject3).y != null)
        {
          localObject1 = ((bxq)localObject3).b(n);
          if (localObject1 != null)
          {
            localObject2 = ((bxr)localObject1).e;
            label233:
            localObject1 = localObject2;
            if (localObject2 == null) {
              localObject1 = new bwz(this.e.getApplicationContext(), this.i, a(), this.j, this.f, this.k, this.l, -1, this.h);
            }
            n = this.h;
            a.f(localObject1, "GoogleApiClient instance cannot be null");
            if (((bxq)localObject3).a.indexOfKey(n) >= 0) {
              break label389;
            }
          }
        }
        label389:
        for (bool1 = bool3;; bool1 = false)
        {
          a.a(bool1, "Already managing a GoogleApiClient with id " + n);
          localObject2 = new bxs((GoogleApiClient)localObject1, null);
          ((bxq)localObject3).a.put(n, localObject2);
          localObject2 = localObject1;
          if (((j)localObject3).y == null) {
            break;
          }
          ar.a = false;
          ((bxq)localObject3).h().a(n, null, (aq)localObject3);
          localObject2 = localObject1;
          break;
          localObject2 = null;
          break label233;
        }
      }
      localObject2 = new bwz(this.e, this.i, a(), this.j, this.f, this.k, this.l, -1, -1);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bwf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */