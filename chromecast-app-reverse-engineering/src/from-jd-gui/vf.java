import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteCategory;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class vf
  extends ve
  implements ui, um
{
  private static final ArrayList o;
  private static final ArrayList p;
  public final Object i;
  public final Object j;
  public int k;
  public boolean l;
  public boolean m;
  public final ArrayList n = new ArrayList();
  private final vo q;
  private Object r;
  private Object s;
  private ArrayList t = new ArrayList();
  private ul u;
  private uk v;
  
  static
  {
    Object localObject1 = new IntentFilter();
    ((IntentFilter)localObject1).addCategory("android.media.intent.category.LIVE_AUDIO");
    Object localObject2 = new ArrayList();
    o = (ArrayList)localObject2;
    ((ArrayList)localObject2).add(localObject1);
    localObject2 = new IntentFilter();
    ((IntentFilter)localObject2).addCategory("android.media.intent.category.LIVE_VIDEO");
    localObject1 = new ArrayList();
    p = (ArrayList)localObject1;
    ((ArrayList)localObject1).add(localObject2);
  }
  
  public vf(Context paramContext, vo paramvo)
  {
    super(paramContext);
    this.q = paramvo;
    this.i = paramContext.getSystemService("media_router");
    this.j = c();
    this.r = new un(this);
    paramvo = paramContext.getResources();
    paramContext = this.i;
    paramvo = paramvo.getString(a.cr);
    this.s = ((MediaRouter)paramContext).createRouteCategory(paramvo, false);
    e();
  }
  
  private void a(vh paramvh)
  {
    to localto = new to(paramvh.b, j(paramvh.a));
    a(paramvh, localto);
    paramvh.c = localto.a();
  }
  
  private int b(String paramString)
  {
    int i2 = this.n.size();
    int i1 = 0;
    if (i1 < i2) {
      if (!((vh)this.n.get(i1)).b.equals(paramString)) {}
    }
    for (;;)
    {
      return i1;
      i1++;
      break;
      i1 = -1;
    }
  }
  
  private int e(uh paramuh)
  {
    int i2 = this.t.size();
    int i1 = 0;
    if (i1 < i2) {
      if (((vi)this.t.get(i1)).a != paramuh) {}
    }
    for (;;)
    {
      return i1;
      i1++;
      break;
      i1 = -1;
    }
  }
  
  private void e()
  {
    Object localObject = (MediaRouter)this.i;
    int i2 = ((MediaRouter)localObject).getRouteCount();
    ArrayList localArrayList = new ArrayList(i2);
    for (int i1 = 0; i1 < i2; i1++) {
      localArrayList.add(((MediaRouter)localObject).getRouteAt(i1));
    }
    localObject = localArrayList.iterator();
    i1 = 0;
    boolean bool;
    while (((Iterator)localObject).hasNext()) {
      i1 |= f(((Iterator)localObject).next());
    }
    if (bool) {
      a();
    }
  }
  
  private boolean f(Object paramObject)
  {
    int i1;
    Object localObject;
    if ((i(paramObject) == null) && (g(paramObject) < 0)) {
      if (d() == paramObject)
      {
        i1 = 1;
        if (i1 == 0) {
          break label78;
        }
        localObject = "DEFAULT_ROUTE";
        label34:
        if (b((String)localObject) >= 0) {
          break label108;
        }
        paramObject = new vh(paramObject, (String)localObject);
        a((vh)paramObject);
        this.n.add(paramObject);
      }
    }
    for (boolean bool = true;; bool = false)
    {
      return bool;
      i1 = 0;
      break;
      label78:
      localObject = String.format(Locale.US, "ROUTE_%08x", new Object[] { Integer.valueOf(j(paramObject).hashCode()) });
      break label34;
      label108:
      for (i1 = 2;; i1++)
      {
        String str = String.format(Locale.US, "%s_%d", new Object[] { localObject, Integer.valueOf(i1) });
        if (b(str) < 0)
        {
          localObject = str;
          break;
        }
      }
    }
  }
  
  private static vi i(Object paramObject)
  {
    paramObject = ((MediaRouter.RouteInfo)paramObject).getTag();
    if ((paramObject instanceof vi)) {}
    for (paramObject = (vi)paramObject;; paramObject = null) {
      return (vi)paramObject;
    }
  }
  
  private String j(Object paramObject)
  {
    Context localContext = this.a;
    paramObject = ((MediaRouter.RouteInfo)paramObject).getName(localContext);
    if (paramObject != null) {}
    for (paramObject = ((CharSequence)paramObject).toString();; paramObject = "") {
      return (String)paramObject;
    }
  }
  
  public final tu a(String paramString)
  {
    int i1 = b(paramString);
    if (i1 >= 0) {}
    for (paramString = new vg(this, ((vh)this.n.get(i1)).a);; paramString = null) {
      return paramString;
    }
  }
  
  protected final void a()
  {
    tw localtw = new tw();
    int i2 = this.n.size();
    for (int i1 = 0; i1 < i2; i1++) {
      localtw.a(((vh)this.n.get(i1)).c);
    }
    a(localtw.a());
  }
  
  public final void a(Object paramObject)
  {
    if (paramObject != a.a(this.i, 8388611)) {}
    for (;;)
    {
      return;
      vi localvi = i(paramObject);
      if (localvi != null)
      {
        localvi.a.c();
      }
      else
      {
        int i1 = g(paramObject);
        if (i1 >= 0)
        {
          paramObject = (vh)this.n.get(i1);
          paramObject = this.q.a(((vh)paramObject).b);
          if (paramObject != null) {
            ((uh)paramObject).c();
          }
        }
      }
    }
  }
  
  public final void a(Object paramObject, int paramInt)
  {
    paramObject = i(paramObject);
    if (paramObject != null) {
      ((vi)paramObject).a.a(paramInt);
    }
  }
  
  public final void a(uh paramuh)
  {
    if (paramuh.d() != this)
    {
      Object localObject2 = this.i;
      Object localObject1 = this.s;
      localObject1 = ((MediaRouter)localObject2).createUserRoute((MediaRouter.RouteCategory)localObject1);
      paramuh = new vi(paramuh, localObject1);
      a.b(localObject1, paramuh);
      a.c(localObject1, this.r);
      a(paramuh);
      this.t.add(paramuh);
      ((MediaRouter)this.i).addUserRoute((MediaRouter.UserRouteInfo)localObject1);
    }
    for (;;)
    {
      return;
      int i1 = g(a.a(this.i, 8388611));
      if ((i1 >= 0) && (((vh)this.n.get(i1)).b.equals(paramuh.a))) {
        paramuh.c();
      }
    }
  }
  
  protected void a(vh paramvh, to paramto)
  {
    int i1 = ((MediaRouter.RouteInfo)paramvh.a).getSupportedTypes();
    if ((i1 & 0x1) != 0) {
      paramto.a(o);
    }
    if ((i1 & 0x2) != 0) {
      paramto.a(p);
    }
    paramto.a(((MediaRouter.RouteInfo)paramvh.a).getPlaybackType());
    paramto.b(((MediaRouter.RouteInfo)paramvh.a).getPlaybackStream());
    paramto.c(((MediaRouter.RouteInfo)paramvh.a).getVolume());
    paramto.d(((MediaRouter.RouteInfo)paramvh.a).getVolumeMax());
    paramto.e(((MediaRouter.RouteInfo)paramvh.a).getVolumeHandling());
  }
  
  protected void a(vi paramvi)
  {
    Object localObject2 = paramvi.b;
    Object localObject1 = paramvi.a.c;
    ((MediaRouter.UserRouteInfo)localObject2).setName((CharSequence)localObject1);
    localObject1 = paramvi.b;
    int i1 = paramvi.a.h;
    ((MediaRouter.UserRouteInfo)localObject1).setPlaybackType(i1);
    localObject1 = paramvi.b;
    i1 = paramvi.a.i;
    ((MediaRouter.UserRouteInfo)localObject1).setPlaybackStream(i1);
    localObject1 = paramvi.b;
    i1 = paramvi.a.k;
    ((MediaRouter.UserRouteInfo)localObject1).setVolume(i1);
    localObject1 = paramvi.b;
    i1 = paramvi.a.l;
    ((MediaRouter.UserRouteInfo)localObject1).setVolumeMax(i1);
    localObject1 = paramvi.b;
    i1 = paramvi.a.j;
    ((MediaRouter.UserRouteInfo)localObject1).setVolumeHandling(i1);
  }
  
  protected void b()
  {
    if (this.m)
    {
      this.m = false;
      a.a(this.i, this.j);
    }
    if (this.k != 0)
    {
      this.m = true;
      Object localObject2 = this.i;
      int i1 = this.k;
      Object localObject1 = this.j;
      ((MediaRouter)localObject2).addCallback(i1, (MediaRouter.Callback)localObject1);
    }
  }
  
  public final void b(Object paramObject)
  {
    if (f(paramObject)) {
      a();
    }
  }
  
  public final void b(Object paramObject, int paramInt)
  {
    paramObject = i(paramObject);
    if (paramObject != null) {
      ((vi)paramObject).a.b(paramInt);
    }
  }
  
  public final void b(tp paramtp)
  {
    boolean bool = false;
    int i1;
    if (paramtp != null)
    {
      List localList = paramtp.a().a();
      int i3 = localList.size();
      int i2 = 0;
      i1 = 0;
      if (i2 < i3)
      {
        String str = (String)localList.get(i2);
        if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
          i1 |= 0x1;
        }
        for (;;)
        {
          i2++;
          break;
          if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
            i1 |= 0x2;
          } else {
            i1 = 0x800000 | i1;
          }
        }
      }
      bool = paramtp.b();
    }
    for (;;)
    {
      if ((this.k != i1) || (this.l != bool))
      {
        this.k = i1;
        this.l = bool;
        b();
        e();
      }
      return;
      i1 = 0;
    }
  }
  
  public final void b(uh paramuh)
  {
    if (paramuh.d() != this)
    {
      int i1 = e(paramuh);
      if (i1 >= 0)
      {
        Object localObject = (vi)this.t.remove(i1);
        a.b(((vi)localObject).b, null);
        a.c(((vi)localObject).b, null);
        paramuh = this.i;
        localObject = ((vi)localObject).b;
        ((MediaRouter)paramuh).removeUserRoute((MediaRouter.UserRouteInfo)localObject);
      }
    }
  }
  
  protected Object c()
  {
    return new uj(this);
  }
  
  public final void c(Object paramObject)
  {
    if (i(paramObject) == null)
    {
      int i1 = g(paramObject);
      if (i1 >= 0)
      {
        this.n.remove(i1);
        a();
      }
    }
  }
  
  public final void c(uh paramuh)
  {
    if (paramuh.d() != this)
    {
      int i1 = e(paramuh);
      if (i1 >= 0) {
        a((vi)this.t.get(i1));
      }
    }
  }
  
  protected Object d()
  {
    if (this.v == null) {
      this.v = new uk();
    }
    return this.v.a(this.i);
  }
  
  public final void d(Object paramObject)
  {
    if (i(paramObject) == null)
    {
      int i1 = g(paramObject);
      if (i1 >= 0)
      {
        a((vh)this.n.get(i1));
        a();
      }
    }
  }
  
  public final void d(uh paramuh)
  {
    if (!paramuh.a()) {}
    for (;;)
    {
      return;
      int i1;
      if (paramuh.d() != this)
      {
        i1 = e(paramuh);
        if (i1 >= 0) {
          h(((vi)this.t.get(i1)).b);
        }
      }
      else
      {
        i1 = b(paramuh.a);
        if (i1 >= 0) {
          h(((vh)this.n.get(i1)).a);
        }
      }
    }
  }
  
  public final void e(Object paramObject)
  {
    if (i(paramObject) == null)
    {
      int i1 = g(paramObject);
      if (i1 >= 0)
      {
        vh localvh = (vh)this.n.get(i1);
        i1 = ((MediaRouter.RouteInfo)paramObject).getVolume();
        if (i1 != localvh.c.l())
        {
          localvh.c = new to(localvh.c).c(i1).a();
          a();
        }
      }
    }
  }
  
  protected final int g(Object paramObject)
  {
    int i2 = this.n.size();
    int i1 = 0;
    if (i1 < i2) {
      if (((vh)this.n.get(i1)).a != paramObject) {}
    }
    for (;;)
    {
      return i1;
      i1++;
      break;
      i1 = -1;
    }
  }
  
  protected void h(Object paramObject)
  {
    if (this.u == null) {
      this.u = new ul();
    }
    ul localul = this.u;
    MediaRouter localMediaRouter = (MediaRouter)this.i;
    paramObject = (MediaRouter.RouteInfo)paramObject;
    if (((((MediaRouter.RouteInfo)paramObject).getSupportedTypes() & 0x800000) != 0) || (localul.a != null)) {}
    for (;;)
    {
      try
      {
        localul.a.invoke(localMediaRouter, new Object[] { Integer.valueOf(8388611), paramObject });
        return;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", localIllegalAccessException);
        localMediaRouter.selectRoute(8388611, (MediaRouter.RouteInfo)paramObject);
        continue;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", localInvocationTargetException);
        continue;
      }
      Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\vf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */