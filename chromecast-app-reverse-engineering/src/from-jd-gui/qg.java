import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

@TargetApi(14)
public class qg
  extends pw
  implements MenuItem
{
  public Method e;
  
  public qg(Context paramContext, cd paramcd)
  {
    super(paramContext, paramcd);
  }
  
  qh a(ActionProvider paramActionProvider)
  {
    return new qh(this, this.a, paramActionProvider);
  }
  
  public boolean collapseActionView()
  {
    return ((cd)this.d).collapseActionView();
  }
  
  public boolean expandActionView()
  {
    return ((cd)this.d).expandActionView();
  }
  
  public ActionProvider getActionProvider()
  {
    Object localObject = ((cd)this.d).a();
    if ((localObject instanceof qh)) {}
    for (localObject = ((qh)localObject).c;; localObject = null) {
      return (ActionProvider)localObject;
    }
  }
  
  public View getActionView()
  {
    View localView2 = ((cd)this.d).getActionView();
    View localView1 = localView2;
    if ((localView2 instanceof qi)) {
      localView1 = (View)((qi)localView2).a;
    }
    return localView1;
  }
  
  public char getAlphabeticShortcut()
  {
    return ((cd)this.d).getAlphabeticShortcut();
  }
  
  public int getGroupId()
  {
    return ((cd)this.d).getGroupId();
  }
  
  public Drawable getIcon()
  {
    return ((cd)this.d).getIcon();
  }
  
  public Intent getIntent()
  {
    return ((cd)this.d).getIntent();
  }
  
  public int getItemId()
  {
    return ((cd)this.d).getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((cd)this.d).getMenuInfo();
  }
  
  public char getNumericShortcut()
  {
    return ((cd)this.d).getNumericShortcut();
  }
  
  public int getOrder()
  {
    return ((cd)this.d).getOrder();
  }
  
  public SubMenu getSubMenu()
  {
    return a(((cd)this.d).getSubMenu());
  }
  
  public CharSequence getTitle()
  {
    return ((cd)this.d).getTitle();
  }
  
  public CharSequence getTitleCondensed()
  {
    return ((cd)this.d).getTitleCondensed();
  }
  
  public boolean hasSubMenu()
  {
    return ((cd)this.d).hasSubMenu();
  }
  
  public boolean isActionViewExpanded()
  {
    return ((cd)this.d).isActionViewExpanded();
  }
  
  public boolean isCheckable()
  {
    return ((cd)this.d).isCheckable();
  }
  
  public boolean isChecked()
  {
    return ((cd)this.d).isChecked();
  }
  
  public boolean isEnabled()
  {
    return ((cd)this.d).isEnabled();
  }
  
  public boolean isVisible()
  {
    return ((cd)this.d).isVisible();
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    cd localcd = (cd)this.d;
    if (paramActionProvider != null) {}
    for (paramActionProvider = a(paramActionProvider);; paramActionProvider = null)
    {
      localcd.a(paramActionProvider);
      return this;
    }
  }
  
  public MenuItem setActionView(int paramInt)
  {
    ((cd)this.d).setActionView(paramInt);
    View localView = ((cd)this.d).getActionView();
    if ((localView instanceof CollapsibleActionView)) {
      ((cd)this.d).setActionView(new qi(localView));
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    Object localObject = paramView;
    if ((paramView instanceof CollapsibleActionView)) {
      localObject = new qi(paramView);
    }
    ((cd)this.d).setActionView((View)localObject);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((cd)this.d).setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((cd)this.d).setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    ((cd)this.d).setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((cd)this.d).setEnabled(paramBoolean);
    return this;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    ((cd)this.d).setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((cd)this.d).setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    ((cd)this.d).setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    ((cd)this.d).setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    cd localcd = (cd)this.d;
    if (paramOnActionExpandListener != null) {}
    for (paramOnActionExpandListener = new qj(this, paramOnActionExpandListener);; paramOnActionExpandListener = null)
    {
      localcd.a(paramOnActionExpandListener);
      return this;
    }
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    cd localcd = (cd)this.d;
    if (paramOnMenuItemClickListener != null) {}
    for (paramOnMenuItemClickListener = new qk(this, paramOnMenuItemClickListener);; paramOnMenuItemClickListener = null)
    {
      localcd.setOnMenuItemClickListener(paramOnMenuItemClickListener);
      return this;
    }
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((cd)this.d).setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    ((cd)this.d).setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((cd)this.d).setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    ((cd)this.d).setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((cd)this.d).setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((cd)this.d).setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    return ((cd)this.d).setVisible(paramBoolean);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */