import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

public class pb
  extends mj
  implements rj
{
  private static final boolean e;
  private iu A;
  private iu B;
  private iw C;
  pf a;
  vr b;
  vs c;
  boolean d;
  private Context f;
  private Context g;
  private ActionBarOverlayLayout h;
  private ActionBarContainer i;
  private se j;
  private ActionBarContextView k;
  private ActionBarContainer l;
  private View m;
  private boolean n;
  private boolean o;
  private ArrayList p;
  private int q;
  private boolean r;
  private int s;
  private boolean t;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private pp y;
  private boolean z;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14) {}
    for (boolean bool = true;; bool = false)
    {
      e = bool;
      return;
    }
  }
  
  public pb(Activity paramActivity, boolean paramBoolean)
  {
    new ArrayList();
    this.p = new ArrayList();
    this.s = 0;
    this.t = true;
    this.x = true;
    this.A = new pc(this);
    this.B = new pd(this);
    this.C = new pe(this);
    paramActivity = paramActivity.getWindow().getDecorView();
    a(paramActivity);
    if (!paramBoolean) {
      this.m = paramActivity.findViewById(16908290);
    }
  }
  
  public pb(Dialog paramDialog)
  {
    new ArrayList();
    this.p = new ArrayList();
    this.s = 0;
    this.t = true;
    this.x = true;
    this.A = new pc(this);
    this.B = new pd(this);
    this.C = new pe(this);
    a(paramDialog.getWindow().getDecorView());
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i1 = this.j.m();
    if ((paramInt2 & 0x4) != 0) {
      this.n = true;
    }
    this.j.a(i1 & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }
  
  private void a(View paramView)
  {
    this.h = ((ActionBarOverlayLayout)paramView.findViewById(a.bd));
    if (this.h != null)
    {
      localObject = this.h;
      ((ActionBarOverlayLayout)localObject).e = this;
      if (((ActionBarOverlayLayout)localObject).getWindowToken() != null)
      {
        ((ActionBarOverlayLayout)localObject).e.c(((ActionBarOverlayLayout)localObject).a);
        if (((ActionBarOverlayLayout)localObject).d != 0)
        {
          ((ActionBarOverlayLayout)localObject).onWindowSystemUiVisibilityChanged(((ActionBarOverlayLayout)localObject).d);
          gt.q((View)localObject);
        }
      }
    }
    Object localObject = paramView.findViewById(a.aP);
    if ((localObject instanceof se)) {}
    for (localObject = (se)localObject;; localObject = ((Toolbar)localObject).h())
    {
      this.j = ((se)localObject);
      this.k = ((ActionBarContextView)paramView.findViewById(a.aU));
      this.i = ((ActionBarContainer)paramView.findViewById(a.aR));
      this.l = ((ActionBarContainer)paramView.findViewById(a.bu));
      if ((this.j != null) && (this.k != null) && (this.i != null)) {
        break label251;
      }
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
      if (!(localObject instanceof Toolbar)) {
        break;
      }
    }
    if ("Can't make a decor toolbar out of " + localObject != null) {}
    for (paramView = localObject.getClass().getSimpleName();; paramView = "null") {
      throw new IllegalStateException(paramView);
    }
    label251:
    this.f = this.j.b();
    this.q = 0;
    if ((this.j.m() & 0x4) != 0) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        this.n = true;
      }
      paramView = ph.a(this.f);
      if (paramView.a.getApplicationInfo().targetSdkVersion < 14) {}
      h(paramView.a());
      paramView = this.f.obtainStyledAttributes(null, oq.a, a.i, 0);
      if (!paramView.getBoolean(oq.k, false)) {
        break label394;
      }
      if (this.h.b) {
        break;
      }
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }
    this.d = true;
    this.h.a(true);
    label394:
    i1 = paramView.getDimensionPixelSize(oq.i, 0);
    if (i1 != 0)
    {
      float f1 = i1;
      gt.f(this.i, f1);
      if (this.l != null) {
        gt.f(this.l, f1);
      }
    }
    paramView.recycle();
  }
  
  private static boolean b(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool = true;
    if (paramBoolean3) {
      paramBoolean1 = bool;
    }
    for (;;)
    {
      return paramBoolean1;
      if (!paramBoolean1)
      {
        paramBoolean1 = bool;
        if (!paramBoolean2) {}
      }
      else
      {
        paramBoolean1 = false;
      }
    }
  }
  
  private void h(boolean paramBoolean)
  {
    boolean bool = true;
    this.r = paramBoolean;
    int i1;
    label48:
    Object localObject;
    if (!this.r)
    {
      this.j.a(null);
      this.i.a(null);
      if (this.j.n() != 2) {
        break label119;
      }
      i1 = 1;
      localObject = this.j;
      if ((this.r) || (i1 == 0)) {
        break label124;
      }
      paramBoolean = true;
      label66:
      ((se)localObject).a(paramBoolean);
      localObject = this.h;
      if ((this.r) || (i1 == 0)) {
        break label129;
      }
    }
    label119:
    label124:
    label129:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      ((ActionBarOverlayLayout)localObject).c = paramBoolean;
      return;
      this.i.a(null);
      this.j.a(null);
      break;
      i1 = 0;
      break label48;
      paramBoolean = false;
      break label66;
    }
  }
  
  private void i(boolean paramBoolean)
  {
    float f2;
    float f1;
    Object localObject1;
    Object localObject2;
    if (b(this.u, this.v, this.w)) {
      if (!this.x)
      {
        this.x = true;
        if (this.y != null) {
          this.y.b();
        }
        this.i.setVisibility(0);
        if ((this.s != 0) || (!e) || ((!this.z) && (!paramBoolean))) {
          break label336;
        }
        gt.b(this.i, 0.0F);
        f2 = -this.i.getHeight();
        f1 = f2;
        if (paramBoolean)
        {
          localObject1 = new int[2];
          Object tmp107_105 = localObject1;
          tmp107_105[0] = 0;
          Object tmp111_107 = tmp107_105;
          tmp111_107[1] = 0;
          tmp111_107;
          this.i.getLocationInWindow((int[])localObject1);
          f1 = f2 - localObject1[1];
        }
        gt.b(this.i, f1);
        localObject1 = new pp();
        localObject2 = gt.o(this.i).c(0.0F);
        ((ih)localObject2).a(this.C);
        ((pp)localObject1).a((ih)localObject2);
        if ((this.t) && (this.m != null))
        {
          gt.b(this.m, f1);
          ((pp)localObject1).a(gt.o(this.m).c(0.0F));
        }
        if ((this.l != null) && (this.q == 1))
        {
          gt.b(this.l, this.l.getHeight());
          this.l.setVisibility(0);
          ((pp)localObject1).a(gt.o(this.l).c(0.0F));
        }
        ((pp)localObject1).a(AnimationUtils.loadInterpolator(this.f, 17432582));
        ((pp)localObject1).a(250L);
        ((pp)localObject1).a(this.B);
        this.y = ((pp)localObject1);
        ((pp)localObject1).a();
        if (this.h != null) {
          gt.q(this.h);
        }
      }
    }
    for (;;)
    {
      return;
      label336:
      gt.c(this.i, 1.0F);
      gt.b(this.i, 0.0F);
      if ((this.t) && (this.m != null)) {
        gt.b(this.m, 0.0F);
      }
      if ((this.l != null) && (this.q == 1))
      {
        gt.c(this.l, 1.0F);
        gt.b(this.l, 0.0F);
        this.l.setVisibility(0);
      }
      this.B.b(null);
      break;
      if (this.x)
      {
        this.x = false;
        if (this.y != null) {
          this.y.b();
        }
        if ((this.s == 0) && (e) && ((this.z) || (paramBoolean)))
        {
          gt.c(this.i, 1.0F);
          this.i.a(true);
          localObject1 = new pp();
          f2 = -this.i.getHeight();
          f1 = f2;
          if (paramBoolean)
          {
            localObject2 = new int[2];
            Object tmp524_522 = localObject2;
            tmp524_522[0] = 0;
            Object tmp528_524 = tmp524_522;
            tmp528_524[1] = 0;
            tmp528_524;
            this.i.getLocationInWindow((int[])localObject2);
            f1 = f2 - localObject2[1];
          }
          localObject2 = gt.o(this.i).c(f1);
          ((ih)localObject2).a(this.C);
          ((pp)localObject1).a((ih)localObject2);
          if ((this.t) && (this.m != null)) {
            ((pp)localObject1).a(gt.o(this.m).c(f1));
          }
          if ((this.l != null) && (this.l.getVisibility() == 0))
          {
            gt.c(this.l, 1.0F);
            ((pp)localObject1).a(gt.o(this.l).c(this.l.getHeight()));
          }
          ((pp)localObject1).a(AnimationUtils.loadInterpolator(this.f, 17432581));
          ((pp)localObject1).a(250L);
          ((pp)localObject1).a(this.A);
          this.y = ((pp)localObject1);
          ((pp)localObject1).a();
        }
        else
        {
          this.A.b(null);
        }
      }
    }
  }
  
  public final CharSequence a()
  {
    return this.j.e();
  }
  
  public final vr a(vs paramvs)
  {
    if (this.a != null) {
      this.a.c();
    }
    this.h.a(false);
    this.k.c();
    paramvs = new pf(this, this.k.getContext(), paramvs);
    if (paramvs.e())
    {
      paramvs.d();
      this.k.a(paramvs);
      g(true);
      if ((this.l != null) && (this.q == 1) && (this.l.getVisibility() != 0))
      {
        this.l.setVisibility(0);
        if (this.h != null) {
          gt.q(this.h);
        }
      }
      this.k.sendAccessibilityEvent(32);
      this.a = paramvs;
    }
    for (;;)
    {
      return paramvs;
      paramvs = null;
    }
  }
  
  public final void a(int paramInt)
  {
    a(this.f.getString(paramInt));
  }
  
  public final void a(Configuration paramConfiguration)
  {
    h(ph.a(this.f).a());
  }
  
  public final void a(Drawable paramDrawable)
  {
    this.j.a(paramDrawable);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.j.b(paramCharSequence);
  }
  
  public final void a(boolean paramBoolean)
  {
    a(2, 2);
  }
  
  public final int b()
  {
    return this.j.m();
  }
  
  public final void b(int paramInt)
  {
    this.j.c(paramInt);
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    this.j.c(paramCharSequence);
  }
  
  public final void b(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 4;; i1 = 0)
    {
      a(i1, 4);
      return;
    }
  }
  
  public final void c()
  {
    if (this.u)
    {
      this.u = false;
      i(false);
    }
  }
  
  public final void c(int paramInt)
  {
    this.s = paramInt;
  }
  
  public final void c(CharSequence paramCharSequence)
  {
    this.j.a(paramCharSequence);
  }
  
  public final void c(boolean paramBoolean)
  {
    if (!this.n) {
      b(paramBoolean);
    }
  }
  
  public final void d()
  {
    if (!this.u)
    {
      this.u = true;
      i(false);
    }
  }
  
  public final void d(boolean paramBoolean)
  {
    this.z = paramBoolean;
    if ((!paramBoolean) && (this.y != null)) {
      this.y.b();
    }
  }
  
  public final Context e()
  {
    int i1;
    if (this.g == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.f.getTheme().resolveAttribute(a.m, localTypedValue, true);
      i1 = localTypedValue.resourceId;
      if (i1 == 0) {
        break label61;
      }
    }
    label61:
    for (this.g = new ContextThemeWrapper(this.f, i1);; this.g = this.f) {
      return this.g;
    }
  }
  
  public final void e(boolean paramBoolean)
  {
    if (paramBoolean == this.o) {}
    for (;;)
    {
      return;
      this.o = paramBoolean;
      int i2 = this.p.size();
      for (int i1 = 0; i1 < i2; i1++) {
        this.p.get(i1);
      }
    }
  }
  
  public final void f(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }
  
  public final void g(boolean paramBoolean)
  {
    int i2 = 0;
    Object localObject;
    if (paramBoolean)
    {
      if (!this.w)
      {
        this.w = true;
        if (this.h != null) {
          ActionBarOverlayLayout.a();
        }
        i(false);
      }
      localObject = this.j;
      if (!paramBoolean) {
        break label101;
      }
      i1 = 8;
      label46:
      ((se)localObject).b(i1);
      localObject = this.k;
      if (!paramBoolean) {
        break label106;
      }
    }
    label101:
    label106:
    for (int i1 = i2;; i1 = 8)
    {
      ((ActionBarContextView)localObject).b(i1);
      return;
      if (!this.w) {
        break;
      }
      this.w = false;
      if (this.h != null) {
        ActionBarOverlayLayout.a();
      }
      i(false);
      break;
      i1 = 0;
      break label46;
    }
  }
  
  public final boolean g()
  {
    if ((this.j != null) && (this.j.c())) {
      this.j.d();
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void h()
  {
    if (this.v)
    {
      this.v = false;
      i(true);
    }
  }
  
  public final void i()
  {
    if (!this.v)
    {
      this.v = true;
      i(true);
    }
  }
  
  public final void j()
  {
    if (this.y != null)
    {
      this.y.b();
      this.y = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */