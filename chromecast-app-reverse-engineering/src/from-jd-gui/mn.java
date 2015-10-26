import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class mn
  implements kt
{
  public final DrawerLayout a;
  public mr b;
  public Drawable c;
  public boolean d = true;
  public final int e;
  public final int f;
  private final mo g;
  private boolean h = false;
  
  public mn(Activity paramActivity, DrawerLayout paramDrawerLayout, int paramInt1, int paramInt2)
  {
    this(paramActivity, null, paramDrawerLayout, null, paramInt1, paramInt2);
  }
  
  private mn(Activity paramActivity, Toolbar paramToolbar, DrawerLayout paramDrawerLayout, Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    if ((paramActivity instanceof mp)) {
      this.g = ((mp)paramActivity).c();
    }
    for (;;)
    {
      this.a = paramDrawerLayout;
      this.e = paramInt1;
      this.f = paramInt2;
      this.b = new mq(paramActivity, this.g.b());
      this.c = e();
      return;
      if (Build.VERSION.SDK_INT >= 18) {
        this.g = new mu(paramActivity);
      } else if (Build.VERSION.SDK_INT >= 11) {
        this.g = new mt(paramActivity);
      } else {
        this.g = new ms(paramActivity);
      }
    }
  }
  
  private void a(int paramInt)
  {
    this.g.a(paramInt);
  }
  
  public void a()
  {
    this.b.a(1.0F);
    if (this.d) {
      a(this.f);
    }
  }
  
  public final void a(float paramFloat)
  {
    this.b.a(Math.min(1.0F, Math.max(0.0F, paramFloat)));
  }
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    if ((!this.h) && (!this.g.c()))
    {
      Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
      this.h = true;
    }
    this.g.a(paramDrawable, paramInt);
  }
  
  public void b()
  {
    this.b.a(0.0F);
    if (this.d) {
      a(this.e);
    }
  }
  
  public final void c()
  {
    Drawable localDrawable;
    if (this.a.e(8388611))
    {
      this.b.a(1.0F);
      if (this.d)
      {
        localDrawable = (Drawable)this.b;
        if (!this.a.e(8388611)) {
          break label74;
        }
      }
    }
    label74:
    for (int i = this.f;; i = this.e)
    {
      a(localDrawable, i);
      return;
      this.b.a(0.0F);
      break;
    }
  }
  
  public void d()
  {
    Object localObject2 = this.a;
    Object localObject1 = ((DrawerLayout)localObject2).b(8388611);
    boolean bool;
    if (localObject1 != null) {
      bool = ((DrawerLayout)localObject2).h((View)localObject1);
    }
    while (bool)
    {
      localObject1 = this.a;
      localObject2 = ((DrawerLayout)localObject1).b(8388611);
      if (localObject2 == null)
      {
        throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.c(8388611));
        bool = false;
      }
      else
      {
        ((DrawerLayout)localObject1).f((View)localObject2);
      }
    }
    for (;;)
    {
      return;
      this.a.d(8388611);
    }
  }
  
  public final Drawable e()
  {
    return this.g.a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */