	private final  a
	private final  b
	private final  c
	private java.lang.CharSequence d
	private java.lang.CharSequence e
	private android.content.Intent f
	private  g
	private  h
	private android.graphics.drawable.Drawable i
	private android.content.Context j
	private  k
	
	    public ps(android.content.Context p3, int p4, int p5, int p6, int p7, CharSequence p8)
	    {
	        this.k = 16;
	        this.j = p3;
	        this.a = 16908332;
	        this.b = 0;
	        this.c = 0;
	        this.d = p8;
	        return;
	    }
	
	
	    public final cd a(fb p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final cd a(gc p1)
	    {
	        return this;
	    }
	
	
	    public final fb a()
	    {
	        return 0;
	    }
	
	
	    public final boolean collapseActionView()
	    {
	        return 0;
	    }
	
	
	    public final boolean expandActionView()
	    {
	        return 0;
	    }
	
	
	    public final android.view.ActionProvider getActionProvider()
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final android.view.View getActionView()
	    {
	        return 0;
	    }
	
	
	    public final char getAlphabeticShortcut()
	    {
	        return this.h;
	    }
	
	
	    public final int getGroupId()
	    {
	        return this.b;
	    }
	
	
	    public final android.graphics.drawable.Drawable getIcon()
	    {
	        return this.i;
	    }
	
	
	    public final android.content.Intent getIntent()
	    {
	        return this.f;
	    }
	
	
	    public final int getItemId()
	    {
	        return this.a;
	    }
	
	
	    public final android.view.ContextMenu$ContextMenuInfo getMenuInfo()
	    {
	        return 0;
	    }
	
	
	    public final char getNumericShortcut()
	    {
	        return this.g;
	    }
	
	
	    public final int getOrder()
	    {
	        return this.c;
	    }
	
	
	    public final android.view.SubMenu getSubMenu()
	    {
	        return 0;
	    }
	
	
	    public final CharSequence getTitle()
	    {
	        return this.d;
	    }
	
	
	    public final CharSequence getTitleCondensed()
	    {
	        CharSequence v0_1;
	        if (this.e == null) {
	            v0_1 = this.d;
	        } else {
	            v0_1 = this.e;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean hasSubMenu()
	    {
	        return 0;
	    }
	
	
	    public final boolean isActionViewExpanded()
	    {
	        return 0;
	    }
	
	
	    public final boolean isCheckable()
	    {
	        int v0_2;
	        if ((this.k & 1) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean isChecked()
	    {
	        int v0_2;
	        if ((this.k & 2) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean isEnabled()
	    {
	        int v0_2;
	        if ((this.k & 16) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean isVisible()
	    {
	        int v0_2;
	        if ((this.k & 8) != 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final android.view.MenuItem setActionProvider(android.view.ActionProvider p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final synthetic android.view.MenuItem setActionView(int p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final synthetic android.view.MenuItem setActionView(android.view.View p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final android.view.MenuItem setAlphabeticShortcut(char p1)
	    {
	        this.h = p1;
	        return this;
	    }
	
	
	    public final android.view.MenuItem setCheckable(boolean p3)
	    {
	        int v0_1;
	        if (!p3) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        this.k = (v0_1 | (this.k & -2));
	        return this;
	    }
	
	
	    public final android.view.MenuItem setChecked(boolean p3)
	    {
	        int v0_1;
	        if (!p3) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 2;
	        }
	        this.k = (v0_1 | (this.k & -3));
	        return this;
	    }
	
	
	    public final android.view.MenuItem setEnabled(boolean p3)
	    {
	        int v0_1;
	        if (!p3) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 16;
	        }
	        this.k = (v0_1 | (this.k & -17));
	        return this;
	    }
	
	
	    public final android.view.MenuItem setIcon(int p2)
	    {
	        this.i = au.a(this.j, p2);
	        return this;
	    }
	
	
	    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable p1)
	    {
	        this.i = p1;
	        return this;
	    }
	
	
	    public final android.view.MenuItem setIntent(android.content.Intent p1)
	    {
	        this.f = p1;
	        return this;
	    }
	
	
	    public final android.view.MenuItem setNumericShortcut(char p1)
	    {
	        this.g = p1;
	        return this;
	    }
	
	
	    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener p2)
	    {
	        throw new UnsupportedOperationException();
	    }
	
	
	    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener p1)
	    {
	        return this;
	    }
	
	
	    public final android.view.MenuItem setShortcut(char p1, char p2)
	    {
	        this.g = p1;
	        this.h = p2;
	        return this;
	    }
	
	
	    public final void setShowAsAction(int p1)
	    {
	        return;
	    }
	
	
	    public final synthetic android.view.MenuItem setShowAsActionFlags(int p1)
	    {
	        this.setShowAsAction(p1);
	        return this;
	    }
	
	
	    public final android.view.MenuItem setTitle(int p2)
	    {
	        this.d = this.j.getResources().getString(p2);
	        return this;
	    }
	
	
	    public final android.view.MenuItem setTitle(CharSequence p1)
	    {
	        this.d = p1;
	        return this;
	    }
	
	
	    public final android.view.MenuItem setTitleCondensed(CharSequence p1)
	    {
	        this.e = p1;
	        return this;
	    }
	
	
	    public final android.view.MenuItem setVisible(boolean p3)
	    {
	        int v0_1;
	        if (!p3) {
	            v0_1 = 8;
	        } else {
	            v0_1 = 0;
	        }
	        this.k = (v0_1 | (this.k & 8));
	        return this;
	    }
	
