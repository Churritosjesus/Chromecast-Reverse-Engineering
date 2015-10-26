import android.content.Context;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class pj
  extends vr
  implements qb
{
  private Context c;
  private ActionBarContextView d;
  private vs e;
  private WeakReference f;
  private boolean g;
  private qa h;
  
  public pj(Context paramContext, ActionBarContextView paramActionBarContextView, vs paramvs, boolean paramBoolean)
  {
    this.c = paramContext;
    this.d = paramActionBarContextView;
    this.e = paramvs;
    paramContext = new qa(paramActionBarContextView.getContext());
    paramContext.e = 1;
    this.h = paramContext;
    this.h.a(this);
  }
  
  public final MenuInflater a()
  {
    return new MenuInflater(this.d.getContext());
  }
  
  public final void a(int paramInt)
  {
    b(this.c.getString(paramInt));
  }
  
  public final void a(View paramView)
  {
    this.d.d(paramView);
    if (paramView != null) {}
    for (paramView = new WeakReference(paramView);; paramView = null)
    {
      this.f = paramView;
      return;
    }
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.d.b(paramCharSequence);
  }
  
  public final void a(qa paramqa)
  {
    d();
    this.d.a();
  }
  
  public final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    this.d.a(paramBoolean);
  }
  
  public final boolean a(qa paramqa, MenuItem paramMenuItem)
  {
    return this.e.a(this, paramMenuItem);
  }
  
  public final Menu b()
  {
    return this.h;
  }
  
  public final void b(int paramInt)
  {
    a(this.c.getString(paramInt));
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    this.d.a(paramCharSequence);
  }
  
  public final void c()
  {
    if (this.g) {}
    for (;;)
    {
      return;
      this.g = true;
      this.d.sendAccessibilityEvent(32);
      this.e.a(this);
    }
  }
  
  public final void d()
  {
    this.e.b(this, this.h);
  }
  
  public final CharSequence f()
  {
    return this.d.g;
  }
  
  public final CharSequence g()
  {
    return this.d.h;
  }
  
  public final boolean h()
  {
    return this.d.j;
  }
  
  public final View i()
  {
    if (this.f != null) {}
    for (View localView = (View)this.f.get();; localView = null) {
      return localView;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */