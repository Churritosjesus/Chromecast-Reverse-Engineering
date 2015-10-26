import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionMenuView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;

public final class pf
  extends vr
  implements qb
{
  private final Context c;
  private final qa d;
  private vs e;
  private WeakReference f;
  
  public pf(pb parampb, Context paramContext, vs paramvs)
  {
    this.c = paramContext;
    this.e = paramvs;
    parampb = new qa(paramContext);
    parampb.e = 1;
    this.d = parampb;
    this.d.a(this);
  }
  
  public final MenuInflater a()
  {
    return new pm(this.c);
  }
  
  public final void a(int paramInt)
  {
    b(pb.k(this.g).getResources().getString(paramInt));
  }
  
  public final void a(View paramView)
  {
    pb.i(this.g).d(paramView);
    this.f = new WeakReference(paramView);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    pb.i(this.g).b(paramCharSequence);
  }
  
  public final void a(qa paramqa)
  {
    if (this.e == null) {}
    for (;;)
    {
      return;
      d();
      pb.i(this.g).a();
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    pb.i(this.g).a(paramBoolean);
  }
  
  public final boolean a(qa paramqa, MenuItem paramMenuItem)
  {
    if (this.e != null) {}
    for (boolean bool = this.e.a(this, paramMenuItem);; bool = false) {
      return bool;
    }
  }
  
  public final Menu b()
  {
    return this.d;
  }
  
  public final void b(int paramInt)
  {
    a(pb.k(this.g).getResources().getString(paramInt));
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    pb.i(this.g).a(paramCharSequence);
  }
  
  public final void c()
  {
    if (this.g.a != this) {
      return;
    }
    label52:
    ActionBarContextView localActionBarContextView;
    if (!pb.a(pb.g(this.g), pb.h(this.g), false))
    {
      this.g.b = this;
      this.g.c = this.e;
      this.e = null;
      this.g.g(false);
      localActionBarContextView = pb.i(this.g);
      if (localActionBarContextView.l != 2)
      {
        if (localActionBarContextView.i != null) {
          break label150;
        }
        localActionBarContextView.c();
      }
    }
    for (;;)
    {
      pb.j(this.g).a().sendAccessibilityEvent(32);
      pb.f(this.g).a(this.g.d);
      this.g.a = null;
      break;
      this.e.a(this);
      break label52;
      label150:
      localActionBarContextView.b();
      localActionBarContextView.l = 2;
      ih localih = gt.o(localActionBarContextView.i).b(-localActionBarContextView.i.getWidth() - ((ViewGroup.MarginLayoutParams)localActionBarContextView.i.getLayoutParams()).leftMargin);
      localih.a(200L);
      localih.a(localActionBarContextView);
      localih.a(new DecelerateInterpolator());
      pp localpp = new pp();
      localpp.a(localih);
      if (localActionBarContextView.b != null) {
        localActionBarContextView.b.getChildCount();
      }
      localActionBarContextView.k = localpp;
      localActionBarContextView.k.a();
    }
  }
  
  /* Error */
  public final void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	pf:g	Lpb;
    //   4: getfield 109	pb:a	Lpf;
    //   7: aload_0
    //   8: if_acmpeq +4 -> 12
    //   11: return
    //   12: aload_0
    //   13: getfield 37	pf:d	Lqa;
    //   16: invokevirtual 221	qa:d	()V
    //   19: aload_0
    //   20: getfield 27	pf:e	Lvs;
    //   23: aload_0
    //   24: aload_0
    //   25: getfield 37	pf:d	Lqa;
    //   28: invokeinterface 224 3 0
    //   33: pop
    //   34: aload_0
    //   35: getfield 37	pf:d	Lqa;
    //   38: invokevirtual 226	qa:e	()V
    //   41: goto -30 -> 11
    //   44: astore_1
    //   45: aload_0
    //   46: getfield 37	pf:d	Lqa;
    //   49: invokevirtual 226	qa:e	()V
    //   52: aload_1
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	pf
    //   44	9	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   19	34	44	finally
  }
  
  public final boolean e()
  {
    this.d.d();
    try
    {
      boolean bool = this.e.a(this, this.d);
      return bool;
    }
    finally
    {
      this.d.e();
    }
  }
  
  public final CharSequence f()
  {
    return pb.i(this.g).g;
  }
  
  public final CharSequence g()
  {
    return pb.i(this.g).h;
  }
  
  public final boolean h()
  {
    return pb.i(this.g).j;
  }
  
  public final View i()
  {
    if (this.f != null) {}
    for (View localView = (View)this.f.get();; localView = null) {
      return localView;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */