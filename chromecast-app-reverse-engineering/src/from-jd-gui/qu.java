import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class qu
  extends qa
  implements SubMenu
{
  public qa k;
  private qe l;
  
  public qu(Context paramContext, qa paramqa, qe paramqe)
  {
    super(paramContext);
    this.k = paramqa;
    this.l = paramqe;
  }
  
  public final String a()
  {
    int i;
    if (this.l != null)
    {
      i = this.l.getItemId();
      if (i != 0) {
        break label28;
      }
    }
    label28:
    for (String str = null;; str = super.a() + ":" + i)
    {
      return str;
      i = 0;
      break;
    }
  }
  
  public final void a(qb paramqb)
  {
    this.k.a(paramqb);
  }
  
  final boolean a(qa paramqa, MenuItem paramMenuItem)
  {
    if ((super.a(paramqa, paramMenuItem)) || (this.k.a(paramqa, paramMenuItem))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean a(qe paramqe)
  {
    return this.k.a(paramqe);
  }
  
  public final boolean b()
  {
    return this.k.b();
  }
  
  public final boolean b(qe paramqe)
  {
    return this.k.b(paramqe);
  }
  
  public final boolean c()
  {
    return this.k.c();
  }
  
  public final MenuItem getItem()
  {
    return this.l;
  }
  
  public final qa k()
  {
    return this.k;
  }
  
  public final SubMenu setHeaderIcon(int paramInt)
  {
    super.a(au.a(this.a, paramInt));
    return this;
  }
  
  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    super.a(paramDrawable);
    return this;
  }
  
  public final SubMenu setHeaderTitle(int paramInt)
  {
    super.a(this.a.getResources().getString(paramInt));
    return this;
  }
  
  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    super.a(paramCharSequence);
    return this;
  }
  
  public final SubMenu setHeaderView(View paramView)
  {
    super.a(0, null, 0, null, paramView);
    return this;
  }
  
  public final SubMenu setIcon(int paramInt)
  {
    this.l.setIcon(paramInt);
    return this;
  }
  
  public final SubMenu setIcon(Drawable paramDrawable)
  {
    this.l.setIcon(paramDrawable);
    return this;
  }
  
  public final void setQwertyMode(boolean paramBoolean)
  {
    this.k.setQwertyMode(paramBoolean);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */