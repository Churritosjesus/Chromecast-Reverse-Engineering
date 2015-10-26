import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window.Callback;
import java.util.ArrayList;

public final class ou
  extends mj
{
  se a;
  boolean b;
  public Window.Callback c;
  py d;
  private boolean e;
  private boolean f;
  private ArrayList g = new ArrayList();
  private final Runnable h = new ov(this);
  private final wg i = new ow(this);
  
  public ou(Toolbar paramToolbar, CharSequence paramCharSequence, Window.Callback paramCallback)
  {
    this.a = new ti(paramToolbar, false);
    this.c = new pa(this, paramCallback);
    this.a.a(this.c);
    paramToolbar.m = this.i;
    this.a.a(paramCharSequence);
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int j = this.a.m();
    this.a.a(j & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }
  
  public final CharSequence a()
  {
    return this.a.e();
  }
  
  public final void a(int paramInt)
  {
    se localse = this.a;
    if (paramInt != 0) {}
    for (CharSequence localCharSequence = this.a.b().getText(paramInt);; localCharSequence = null)
    {
      localse.b(localCharSequence);
      return;
    }
  }
  
  public final void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
  }
  
  public final void a(Drawable paramDrawable)
  {
    this.a.a(paramDrawable);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.a.b(paramCharSequence);
  }
  
  public final void a(boolean paramBoolean)
  {
    a(2, 2);
  }
  
  public final boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    Menu localMenu = h();
    if (localMenu != null) {
      bool = localMenu.performShortcut(paramInt, paramKeyEvent, 0);
    }
    return bool;
  }
  
  public final int b()
  {
    return this.a.m();
  }
  
  public final void b(int paramInt)
  {
    this.a.c(paramInt);
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    this.a.c(paramCharSequence);
  }
  
  public final void b(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int j = 4;; j = 0)
    {
      a(j, 4);
      return;
    }
  }
  
  public final void c()
  {
    this.a.d(0);
  }
  
  public final void c(CharSequence paramCharSequence)
  {
    this.a.a(paramCharSequence);
  }
  
  public final void c(boolean paramBoolean) {}
  
  public final void d()
  {
    this.a.d(8);
  }
  
  public final void d(boolean paramBoolean) {}
  
  public final Context e()
  {
    return this.a.b();
  }
  
  public final void e(boolean paramBoolean)
  {
    if (paramBoolean == this.f) {}
    for (;;)
    {
      return;
      this.f = paramBoolean;
      int k = this.g.size();
      for (int j = 0; j < k; j++) {
        this.g.get(j);
      }
    }
  }
  
  public final boolean f()
  {
    this.a.a().removeCallbacks(this.h);
    gt.a(this.a.a(), this.h);
    return true;
  }
  
  public final boolean g()
  {
    if (this.a.c()) {
      this.a.d();
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  Menu h()
  {
    if (!this.e)
    {
      this.a.a(new ox(this), new oy(this));
      this.e = true;
    }
    return this.a.o();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */