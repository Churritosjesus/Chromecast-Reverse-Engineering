import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class ps
  implements cd
{
  private final int a;
  private final int b;
  private final int c;
  private CharSequence d;
  private CharSequence e;
  private Intent f;
  private char g;
  private char h;
  private Drawable i;
  private Context j;
  private int k = 16;
  
  public ps(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence)
  {
    this.j = paramContext;
    this.a = 16908332;
    this.b = 0;
    this.c = 0;
    this.d = paramCharSequence;
  }
  
  public final cd a(fb paramfb)
  {
    throw new UnsupportedOperationException();
  }
  
  public final cd a(gc paramgc)
  {
    return this;
  }
  
  public final fb a()
  {
    return null;
  }
  
  public final boolean collapseActionView()
  {
    return false;
  }
  
  public final boolean expandActionView()
  {
    return false;
  }
  
  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException();
  }
  
  public final View getActionView()
  {
    return null;
  }
  
  public final char getAlphabeticShortcut()
  {
    return this.h;
  }
  
  public final int getGroupId()
  {
    return this.b;
  }
  
  public final Drawable getIcon()
  {
    return this.i;
  }
  
  public final Intent getIntent()
  {
    return this.f;
  }
  
  public final int getItemId()
  {
    return this.a;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }
  
  public final char getNumericShortcut()
  {
    return this.g;
  }
  
  public final int getOrder()
  {
    return this.c;
  }
  
  public final SubMenu getSubMenu()
  {
    return null;
  }
  
  public final CharSequence getTitle()
  {
    return this.d;
  }
  
  public final CharSequence getTitleCondensed()
  {
    if (this.e != null) {}
    for (CharSequence localCharSequence = this.e;; localCharSequence = this.d) {
      return localCharSequence;
    }
  }
  
  public final boolean hasSubMenu()
  {
    return false;
  }
  
  public final boolean isActionViewExpanded()
  {
    return false;
  }
  
  public final boolean isCheckable()
  {
    if ((this.k & 0x1) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean isChecked()
  {
    if ((this.k & 0x2) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean isEnabled()
  {
    if ((this.k & 0x10) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean isVisible()
  {
    if ((this.k & 0x8) == 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    this.h = paramChar;
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int n = this.k;
    if (paramBoolean) {}
    for (int m = 1;; m = 0)
    {
      this.k = (m | n & 0xFFFFFFFE);
      return this;
    }
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    int n = this.k;
    if (paramBoolean) {}
    for (int m = 2;; m = 0)
    {
      this.k = (m | n & 0xFFFFFFFD);
      return this;
    }
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    int n = this.k;
    if (paramBoolean) {}
    for (int m = 16;; m = 0)
    {
      this.k = (m | n & 0xFFFFFFEF);
      return this;
    }
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    this.i = au.a(this.j, paramInt);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.i = paramDrawable;
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    this.f = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    this.g = paramChar;
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.g = paramChar1;
    this.h = paramChar2;
    return this;
  }
  
  public final void setShowAsAction(int paramInt) {}
  
  public final MenuItem setTitle(int paramInt)
  {
    this.d = this.j.getResources().getString(paramInt);
    return this;
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    int n = this.k;
    if (paramBoolean) {}
    for (int m = 0;; m = 8)
    {
      this.k = (m | n & 0x8);
      return this;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */