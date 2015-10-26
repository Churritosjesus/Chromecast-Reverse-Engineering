import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import java.util.ArrayList;

public final class qe
  implements cd
{
  final int a;
  public qa b;
  public int c = 0;
  public fb d;
  private final int e;
  private final int f;
  private final int g;
  private CharSequence h;
  private CharSequence i;
  private Intent j;
  private char k;
  private char l;
  private Drawable m;
  private int n = 0;
  private qu o;
  private MenuItem.OnMenuItemClickListener p;
  private int q = 16;
  private View r;
  private gc s;
  private boolean t = false;
  private ContextMenu.ContextMenuInfo u;
  
  qe(qa paramqa, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    this.b = paramqa;
    this.e = paramInt2;
    this.f = paramInt1;
    this.g = paramInt3;
    this.a = paramInt4;
    this.h = paramCharSequence;
    this.c = paramInt5;
  }
  
  private cd a(View paramView)
  {
    this.r = paramView;
    this.d = null;
    if ((paramView != null) && (paramView.getId() == -1) && (this.e > 0)) {
      paramView.setId(this.e);
    }
    this.b.g();
    return this;
  }
  
  public final cd a(fb paramfb)
  {
    if (this.d != null) {
      this.d.a(null);
    }
    this.r = null;
    this.d = paramfb;
    this.b.b(true);
    if (this.d != null) {
      this.d.a(new qf(this));
    }
    return this;
  }
  
  public final cd a(gc paramgc)
  {
    this.s = paramgc;
    return this;
  }
  
  public final fb a()
  {
    return this.d;
  }
  
  public final CharSequence a(qs paramqs)
  {
    if ((paramqs != null) && (paramqs.b())) {}
    for (paramqs = getTitleCondensed();; paramqs = getTitle()) {
      return paramqs;
    }
  }
  
  final void a(qu paramqu)
  {
    this.o = paramqu;
    paramqu.setHeaderTitle(getTitle());
  }
  
  public final void a(boolean paramBoolean)
  {
    int i2 = this.q;
    if (paramBoolean) {}
    for (int i1 = 4;; i1 = 0)
    {
      this.q = (i1 | i2 & 0xFFFFFFFB);
      return;
    }
  }
  
  final void b(boolean paramBoolean)
  {
    int i2 = this.q;
    int i3 = this.q;
    if (paramBoolean) {}
    for (int i1 = 2;; i1 = 0)
    {
      this.q = (i1 | i3 & 0xFFFFFFFD);
      if (i2 != this.q) {
        this.b.b(false);
      }
      return;
    }
  }
  
  public final boolean b()
  {
    boolean bool2 = true;
    boolean bool1;
    if ((this.p != null) && (this.p.onMenuItemClick(this))) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if (!this.b.a(this.b.k(), this)) {
        if (this.j != null)
        {
          try
          {
            this.b.a.startActivity(this.j);
            bool1 = bool2;
          }
          catch (ActivityNotFoundException localActivityNotFoundException)
          {
            Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", localActivityNotFoundException);
          }
        }
        else if (this.d != null)
        {
          bool1 = bool2;
          if (this.d.e()) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public final char c()
  {
    if (this.b.b()) {}
    for (char c1 = this.l;; c1 = this.k) {
      return c1;
    }
  }
  
  final boolean c(boolean paramBoolean)
  {
    boolean bool = false;
    int i2 = this.q;
    int i3 = this.q;
    if (paramBoolean) {}
    for (int i1 = 0;; i1 = 8)
    {
      this.q = (i1 | i3 & 0xFFFFFFF7);
      paramBoolean = bool;
      if (i2 != this.q) {
        paramBoolean = true;
      }
      return paramBoolean;
    }
  }
  
  public final boolean collapseActionView()
  {
    boolean bool = false;
    if ((this.c & 0x8) == 0) {}
    for (;;)
    {
      return bool;
      if (this.r == null) {
        bool = true;
      } else if ((this.s == null) || (this.s.b(this))) {
        bool = this.b.b(this);
      }
    }
  }
  
  public final void d(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (this.q |= 0x20;; this.q &= 0xFFFFFFDF) {
      return;
    }
  }
  
  public final boolean d()
  {
    if ((this.b.c()) && (c() != 0)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void e(boolean paramBoolean)
  {
    this.t = paramBoolean;
    this.b.b(false);
  }
  
  public final boolean e()
  {
    if ((this.q & 0x4) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean expandActionView()
  {
    boolean bool = false;
    if (!i()) {}
    for (;;)
    {
      return bool;
      if ((this.s == null) || (this.s.a(this))) {
        bool = this.b.a(this);
      }
    }
  }
  
  public final boolean f()
  {
    if ((this.q & 0x20) == 32) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean g()
  {
    boolean bool = true;
    if ((this.c & 0x1) == 1) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public final View getActionView()
  {
    View localView;
    if (this.r != null) {
      localView = this.r;
    }
    for (;;)
    {
      return localView;
      if (this.d != null)
      {
        this.r = this.d.a(this);
        localView = this.r;
      }
      else
      {
        localView = null;
      }
    }
  }
  
  public final char getAlphabeticShortcut()
  {
    return this.l;
  }
  
  public final int getGroupId()
  {
    return this.f;
  }
  
  public final Drawable getIcon()
  {
    Drawable localDrawable;
    if (this.m != null) {
      localDrawable = this.m;
    }
    for (;;)
    {
      return localDrawable;
      if (this.n != 0)
      {
        localDrawable = tf.a(this.b.a, this.n);
        this.n = 0;
        this.m = localDrawable;
      }
      else
      {
        localDrawable = null;
      }
    }
  }
  
  public final Intent getIntent()
  {
    return this.j;
  }
  
  @ViewDebug.CapturedViewProperty
  public final int getItemId()
  {
    return this.e;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.u;
  }
  
  public final char getNumericShortcut()
  {
    return this.k;
  }
  
  public final int getOrder()
  {
    return this.g;
  }
  
  public final SubMenu getSubMenu()
  {
    return this.o;
  }
  
  @ViewDebug.CapturedViewProperty
  public final CharSequence getTitle()
  {
    return this.h;
  }
  
  public final CharSequence getTitleCondensed()
  {
    if (this.i != null) {}
    for (CharSequence localCharSequence = this.i;; localCharSequence = this.h)
    {
      Object localObject = localCharSequence;
      if (Build.VERSION.SDK_INT < 18)
      {
        localObject = localCharSequence;
        if (localCharSequence != null)
        {
          localObject = localCharSequence;
          if (!(localCharSequence instanceof String)) {
            localObject = localCharSequence.toString();
          }
        }
      }
      return (CharSequence)localObject;
    }
  }
  
  public final boolean h()
  {
    if ((this.c & 0x2) == 2) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean hasSubMenu()
  {
    if (this.o != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean i()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((this.c & 0x8) != 0)
    {
      if ((this.r == null) && (this.d != null)) {
        this.r = this.d.a(this);
      }
      bool1 = bool2;
      if (this.r != null) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final boolean isActionViewExpanded()
  {
    return this.t;
  }
  
  public final boolean isCheckable()
  {
    boolean bool = true;
    if ((this.q & 0x1) == 1) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public final boolean isChecked()
  {
    if ((this.q & 0x2) == 2) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean isEnabled()
  {
    if ((this.q & 0x10) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean isVisible()
  {
    boolean bool = true;
    if ((this.d != null) && (this.d.b())) {
      if (((this.q & 0x8) != 0) || (!this.d.c())) {}
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      if ((this.q & 0x8) != 0) {
        bool = false;
      }
    }
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    if (this.l == paramChar) {}
    for (;;)
    {
      return this;
      this.l = Character.toLowerCase(paramChar);
      this.b.b(false);
    }
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int i2 = this.q;
    int i3 = this.q;
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.q = (i1 | i3 & 0xFFFFFFFE);
      if (i2 != this.q) {
        this.b.b(false);
      }
      return this;
    }
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    if ((this.q & 0x4) != 0)
    {
      qa localqa = this.b;
      int i3 = getGroupId();
      int i2 = localqa.c.size();
      int i1 = 0;
      if (i1 < i2)
      {
        qe localqe = (qe)localqa.c.get(i1);
        if ((localqe.getGroupId() == i3) && (localqe.e()) && (localqe.isCheckable())) {
          if (localqe != this) {
            break label95;
          }
        }
        label95:
        for (paramBoolean = true;; paramBoolean = false)
        {
          localqe.b(paramBoolean);
          i1++;
          break;
        }
      }
    }
    else
    {
      b(paramBoolean);
    }
    return this;
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (this.q |= 0x10;; this.q &= 0xFFFFFFEF)
    {
      this.b.b(false);
      return this;
    }
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    this.m = null;
    this.n = paramInt;
    this.b.b(false);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.n = 0;
    this.m = paramDrawable;
    this.b.b(false);
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    this.j = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    if (this.k == paramChar) {}
    for (;;)
    {
      return this;
      this.k = paramChar;
      this.b.b(false);
    }
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.p = paramOnMenuItemClickListener;
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.k = paramChar1;
    this.l = Character.toLowerCase(paramChar2);
    this.b.b(false);
    return this;
  }
  
  public final void setShowAsAction(int paramInt)
  {
    switch (paramInt & 0x3)
    {
    default: 
      throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }
    this.c = paramInt;
    this.b.g();
  }
  
  public final MenuItem setTitle(int paramInt)
  {
    return setTitle(this.b.a.getString(paramInt));
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.h = paramCharSequence;
    this.b.b(false);
    if (this.o != null) {
      this.o.setHeaderTitle(paramCharSequence);
    }
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.i = paramCharSequence;
    this.b.b(false);
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    if (c(paramBoolean)) {
      this.b.f();
    }
    return this;
  }
  
  public final String toString()
  {
    return this.h.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */