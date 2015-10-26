import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class qv
  extends qt
  implements SubMenu
{
  public qv(Context paramContext, ce paramce)
  {
    super(paramContext, paramce);
  }
  
  public final void clearHeader()
  {
    ((ce)this.d).clearHeader();
  }
  
  public final MenuItem getItem()
  {
    return a(((ce)this.d).getItem());
  }
  
  public final SubMenu setHeaderIcon(int paramInt)
  {
    ((ce)this.d).setHeaderIcon(paramInt);
    return this;
  }
  
  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    ((ce)this.d).setHeaderIcon(paramDrawable);
    return this;
  }
  
  public final SubMenu setHeaderTitle(int paramInt)
  {
    ((ce)this.d).setHeaderTitle(paramInt);
    return this;
  }
  
  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    ((ce)this.d).setHeaderTitle(paramCharSequence);
    return this;
  }
  
  public final SubMenu setHeaderView(View paramView)
  {
    ((ce)this.d).setHeaderView(paramView);
    return this;
  }
  
  public final SubMenu setIcon(int paramInt)
  {
    ((ce)this.d).setIcon(paramInt);
    return this;
  }
  
  public final SubMenu setIcon(Drawable paramDrawable)
  {
    ((ce)this.d).setIcon(paramDrawable);
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */