import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.ImageView;
import android.widget.TextView;

public final class ti
  implements se
{
  Toolbar a;
  CharSequence b;
  Window.Callback c;
  boolean d;
  private int e;
  private View f;
  private View g;
  private Drawable h;
  private Drawable i;
  private Drawable j;
  private boolean k;
  private CharSequence l;
  private CharSequence m;
  private vu n;
  private int o = 0;
  private final tf p;
  private int q = 0;
  private Drawable r;
  
  public ti(Toolbar paramToolbar, boolean paramBoolean)
  {
    this(paramToolbar, paramBoolean, a.bT, a.ao);
  }
  
  private ti(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.a = paramToolbar;
    this.b = paramToolbar.k;
    this.l = paramToolbar.l;
    boolean bool;
    int i1;
    if (this.b != null)
    {
      bool = true;
      this.k = bool;
      this.j = paramToolbar.e();
      if (!paramBoolean) {
        break label672;
      }
      paramToolbar = th.a(paramToolbar.getContext(), null, oq.a, a.i, 0);
      Object localObject = paramToolbar.c(oq.r);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        b((CharSequence)localObject);
      }
      localObject = paramToolbar.c(oq.p);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        c((CharSequence)localObject);
      }
      localObject = paramToolbar.a(oq.n);
      if (localObject != null)
      {
        this.i = ((Drawable)localObject);
        p();
      }
      localObject = paramToolbar.a(oq.m);
      if ((this.j == null) && (localObject != null))
      {
        this.h = ((Drawable)localObject);
        p();
      }
      localObject = paramToolbar.a(oq.l);
      if (localObject != null) {
        a((Drawable)localObject);
      }
      a(paramToolbar.a(oq.h, 0));
      i1 = paramToolbar.e(oq.g, 0);
      if (i1 != 0)
      {
        localObject = LayoutInflater.from(this.a.getContext()).inflate(i1, this.a, false);
        if ((this.g != null) && ((this.e & 0x10) != 0)) {
          this.a.removeView(this.g);
        }
        this.g = ((View)localObject);
        if ((localObject != null) && ((this.e & 0x10) != 0)) {
          this.a.addView(this.g);
        }
        a(this.e | 0x10);
      }
      i1 = paramToolbar.d(oq.j, 0);
      if (i1 > 0)
      {
        localObject = this.a.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = i1;
        this.a.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      i1 = paramToolbar.b(oq.f, -1);
      int i2 = paramToolbar.b(oq.e, -1);
      if ((i1 >= 0) || (i2 >= 0))
      {
        localObject = this.a;
        i1 = Math.max(i1, 0);
        i2 = Math.max(i2, 0);
        ((Toolbar)localObject).j.a(i1, i2);
      }
      i1 = paramToolbar.e(oq.s, 0);
      Context localContext;
      if (i1 != 0)
      {
        localObject = this.a;
        localContext = this.a.getContext();
        ((Toolbar)localObject).h = i1;
        if (((Toolbar)localObject).b != null) {
          ((Toolbar)localObject).b.setTextAppearance(localContext, i1);
        }
      }
      i1 = paramToolbar.e(oq.q, 0);
      if (i1 != 0)
      {
        localObject = this.a;
        localContext = this.a.getContext();
        ((Toolbar)localObject).i = i1;
        if (((Toolbar)localObject).c != null) {
          ((Toolbar)localObject).c.setTextAppearance(localContext, i1);
        }
      }
      i1 = paramToolbar.e(oq.o, 0);
      if (i1 != 0) {
        this.a.a(i1);
      }
      paramToolbar.a.recycle();
    }
    for (this.p = paramToolbar.a();; this.p = tf.a(paramToolbar.getContext()))
    {
      if (paramInt1 != this.q)
      {
        this.q = paramInt1;
        if (TextUtils.isEmpty(this.a.d())) {
          c(this.q);
        }
      }
      this.m = this.a.d();
      paramToolbar = this.p.a(paramInt2, false);
      if (this.r != paramToolbar)
      {
        this.r = paramToolbar;
        r();
      }
      this.a.a(new tj(this));
      return;
      bool = false;
      break;
      label672:
      i1 = 11;
      if (this.a.e() != null) {
        i1 = 15;
      }
      this.e = i1;
    }
  }
  
  private void d(CharSequence paramCharSequence)
  {
    this.b = paramCharSequence;
    if ((this.e & 0x8) != 0) {
      this.a.a(paramCharSequence);
    }
  }
  
  private void p()
  {
    Drawable localDrawable = null;
    Toolbar localToolbar;
    if ((this.e & 0x2) != 0)
    {
      if ((this.e & 0x1) == 0) {
        break label113;
      }
      if (this.i != null) {
        localDrawable = this.i;
      }
    }
    else
    {
      localToolbar = this.a;
      if (localDrawable == null) {
        break label121;
      }
      if (localToolbar.d == null) {
        localToolbar.d = new ImageView(localToolbar.getContext());
      }
      if (localToolbar.d.getParent() == null)
      {
        localToolbar.a(localToolbar.d);
        localToolbar.b(localToolbar.d);
      }
    }
    for (;;)
    {
      if (localToolbar.d != null) {
        localToolbar.d.setImageDrawable(localDrawable);
      }
      return;
      localDrawable = this.h;
      break;
      label113:
      localDrawable = this.h;
      break;
      label121:
      if ((localToolbar.d != null) && (localToolbar.d.getParent() != null)) {
        localToolbar.removeView(localToolbar.d);
      }
    }
  }
  
  private void q()
  {
    if ((this.e & 0x4) != 0)
    {
      if (!TextUtils.isEmpty(this.m)) {
        break label31;
      }
      this.a.b(this.q);
    }
    for (;;)
    {
      return;
      label31:
      this.a.c(this.m);
    }
  }
  
  private void r()
  {
    Toolbar localToolbar;
    if ((this.e & 0x4) != 0)
    {
      localToolbar = this.a;
      if (this.j == null) {
        break label32;
      }
    }
    label32:
    for (Drawable localDrawable = this.j;; localDrawable = this.r)
    {
      localToolbar.a(localDrawable);
      return;
    }
  }
  
  public final ViewGroup a()
  {
    return this.a;
  }
  
  public final void a(int paramInt)
  {
    int i1 = this.e ^ paramInt;
    this.e = paramInt;
    if (i1 != 0)
    {
      if ((i1 & 0x4) != 0)
      {
        if ((paramInt & 0x4) == 0) {
          break label115;
        }
        r();
        q();
      }
      if ((i1 & 0x3) != 0) {
        p();
      }
      if ((i1 & 0x8) != 0)
      {
        if ((paramInt & 0x8) == 0) {
          break label126;
        }
        this.a.a(this.b);
        this.a.b(this.l);
      }
      label82:
      if (((i1 & 0x10) != 0) && (this.g != null))
      {
        if ((paramInt & 0x10) == 0) {
          break label145;
        }
        this.a.addView(this.g);
      }
    }
    for (;;)
    {
      return;
      label115:
      this.a.a(null);
      break;
      label126:
      this.a.a(null);
      this.a.b(null);
      break label82;
      label145:
      this.a.removeView(this.g);
    }
  }
  
  public final void a(Drawable paramDrawable)
  {
    this.j = paramDrawable;
    r();
  }
  
  public final void a(Menu paramMenu, qq paramqq)
  {
    if (this.n == null) {
      this.n = new vu(this.a.getContext());
    }
    this.n.d = paramqq;
    paramqq = this.a;
    qa localqa = (qa)paramMenu;
    vu localvu = this.n;
    if ((localqa != null) || (paramqq.a != null))
    {
      paramqq.f();
      paramMenu = paramqq.a.a;
      if (paramMenu != localqa)
      {
        if (paramMenu != null)
        {
          paramMenu.b(paramqq.n);
          paramMenu.b(paramqq.o);
        }
        if (paramqq.o == null) {
          paramqq.o = new aar(paramqq);
        }
        localvu.i = true;
        if (localqa == null) {
          break label176;
        }
        localqa.a(localvu, paramqq.f);
        localqa.a(paramqq.o, paramqq.f);
      }
    }
    for (;;)
    {
      paramqq.a.a(paramqq.g);
      paramqq.a.a(localvu);
      paramqq.n = localvu;
      return;
      label176:
      localvu.a(paramqq.f, null);
      paramqq.o.a(paramqq.f, null);
      localvu.b(true);
      paramqq.o.b(true);
    }
  }
  
  public final void a(Window.Callback paramCallback)
  {
    this.c = paramCallback;
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    if (!this.k) {
      d(paramCharSequence);
    }
  }
  
  public final void a(qq paramqq, qb paramqb)
  {
    Toolbar localToolbar = this.a;
    localToolbar.p = paramqq;
    localToolbar.q = paramqb;
  }
  
  public final void a(sm paramsm)
  {
    if ((this.f != null) && (this.f.getParent() == this.a)) {
      this.a.removeView(this.f);
    }
    this.f = paramsm;
  }
  
  public final void a(boolean paramBoolean)
  {
    Toolbar localToolbar = this.a;
    localToolbar.r = paramBoolean;
    localToolbar.requestLayout();
  }
  
  public final Context b()
  {
    return this.a.getContext();
  }
  
  public final void b(int paramInt)
  {
    if (paramInt == 8) {
      gt.o(this.a).a(0.0F).a(new tk(this));
    }
    for (;;)
    {
      return;
      if (paramInt == 0) {
        gt.o(this.a).a(1.0F).a(new tl(this));
      }
    }
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    this.k = true;
    d(paramCharSequence);
  }
  
  public final void c(int paramInt)
  {
    if (paramInt == 0) {}
    for (String str = null;; str = this.a.getContext().getString(paramInt))
    {
      this.m = str;
      q();
      return;
    }
  }
  
  public final void c(CharSequence paramCharSequence)
  {
    this.l = paramCharSequence;
    if ((this.e & 0x8) != 0) {
      this.a.b(paramCharSequence);
    }
  }
  
  public final boolean c()
  {
    Toolbar localToolbar = this.a;
    if ((localToolbar.o != null) && (localToolbar.o.a != null)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void d()
  {
    this.a.c();
  }
  
  public final void d(int paramInt)
  {
    this.a.setVisibility(paramInt);
  }
  
  public final CharSequence e()
  {
    return this.a.k;
  }
  
  public final boolean f()
  {
    Toolbar localToolbar = this.a;
    if ((localToolbar.getVisibility() == 0) && (localToolbar.a != null) && (localToolbar.a.b)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean g()
  {
    return this.a.a();
  }
  
  public final boolean h()
  {
    boolean bool = true;
    Object localObject = this.a;
    int i1;
    if (((Toolbar)localObject).a != null)
    {
      localObject = ((Toolbar)localObject).a;
      if (((ActionMenuView)localObject).c != null)
      {
        localObject = ((ActionMenuView)localObject).c;
        if ((((vu)localObject).l != null) || (((vu)localObject).f()))
        {
          i1 = 1;
          if (i1 == 0) {
            break label64;
          }
          i1 = 1;
          label53:
          if (i1 == 0) {
            break label69;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      i1 = 0;
      break;
      label64:
      i1 = 0;
      break label53;
      label69:
      bool = false;
    }
  }
  
  public final boolean i()
  {
    return this.a.b();
  }
  
  public final boolean j()
  {
    boolean bool = true;
    Object localObject = this.a;
    int i1;
    if (((Toolbar)localObject).a != null)
    {
      localObject = ((Toolbar)localObject).a;
      if ((((ActionMenuView)localObject).c != null) && (((ActionMenuView)localObject).c.c()))
      {
        i1 = 1;
        if (i1 == 0) {
          break label49;
        }
      }
    }
    for (;;)
    {
      return bool;
      i1 = 0;
      break;
      label49:
      bool = false;
    }
  }
  
  public final void k()
  {
    this.d = true;
  }
  
  public final void l()
  {
    Toolbar localToolbar = this.a;
    if (localToolbar.a != null) {
      localToolbar.a.c();
    }
  }
  
  public final int m()
  {
    return this.e;
  }
  
  public final int n()
  {
    return 0;
  }
  
  public final Menu o()
  {
    Toolbar localToolbar = this.a;
    localToolbar.f();
    if (localToolbar.a.a == null)
    {
      qa localqa = (qa)localToolbar.a.b();
      if (localToolbar.o == null) {
        localToolbar.o = new aar(localToolbar);
      }
      localToolbar.a.c.i = true;
      localqa.a(localToolbar.o, localToolbar.f);
    }
    return localToolbar.a.b();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */