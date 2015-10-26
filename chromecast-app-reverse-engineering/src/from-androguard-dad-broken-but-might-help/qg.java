	public java.lang.reflect.Method e
	
	    public qg(android.content.Context p1, cd p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    qh a(android.view.ActionProvider p3)
	    {
	        return new qh(this, this.a, p3);
	    }
	
	
	    public boolean collapseActionView()
	    {
	        return ((cd) this.d).collapseActionView();
	    }
	
	
	    public boolean expandActionView()
	    {
	        return ((cd) this.d).expandActionView();
	    }
	
	
	    public android.view.ActionProvider getActionProvider()
	    {
	        int v0_3;
	        int v0_2 = ((cd) this.d).a();
	        if (!(v0_2 instanceof qh)) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ((qh) v0_2).c;
	        }
	        return v0_3;
	    }
	
	
	    public android.view.View getActionView()
	    {
	        android.view.View v0_2 = ((cd) this.d).getActionView();
	        if ((v0_2 instanceof qi)) {
	            v0_2 = ((android.view.View) ((qi) v0_2).a);
	        }
	        return v0_2;
	    }
	
	
	    public char getAlphabeticShortcut()
	    {
	        return ((cd) this.d).getAlphabeticShortcut();
	    }
	
	
	    public int getGroupId()
	    {
	        return ((cd) this.d).getGroupId();
	    }
	
	
	    public android.graphics.drawable.Drawable getIcon()
	    {
	        return ((cd) this.d).getIcon();
	    }
	
	
	    public android.content.Intent getIntent()
	    {
	        return ((cd) this.d).getIntent();
	    }
	
	
	    public int getItemId()
	    {
	        return ((cd) this.d).getItemId();
	    }
	
	
	    public android.view.ContextMenu$ContextMenuInfo getMenuInfo()
	    {
	        return ((cd) this.d).getMenuInfo();
	    }
	
	
	    public char getNumericShortcut()
	    {
	        return ((cd) this.d).getNumericShortcut();
	    }
	
	
	    public int getOrder()
	    {
	        return ((cd) this.d).getOrder();
	    }
	
	
	    public android.view.SubMenu getSubMenu()
	    {
	        return this.a(((cd) this.d).getSubMenu());
	    }
	
	
	    public CharSequence getTitle()
	    {
	        return ((cd) this.d).getTitle();
	    }
	
	
	    public CharSequence getTitleCondensed()
	    {
	        return ((cd) this.d).getTitleCondensed();
	    }
	
	
	    public boolean hasSubMenu()
	    {
	        return ((cd) this.d).hasSubMenu();
	    }
	
	
	    public boolean isActionViewExpanded()
	    {
	        return ((cd) this.d).isActionViewExpanded();
	    }
	
	
	    public boolean isCheckable()
	    {
	        return ((cd) this.d).isCheckable();
	    }
	
	
	    public boolean isChecked()
	    {
	        return ((cd) this.d).isChecked();
	    }
	
	
	    public boolean isEnabled()
	    {
	        return ((cd) this.d).isEnabled();
	    }
	
	
	    public boolean isVisible()
	    {
	        return ((cd) this.d).isVisible();
	    }
	
	
	    public android.view.MenuItem setActionProvider(android.view.ActionProvider p3)
	    {
	        int v1;
	        cd v0_1 = ((cd) this.d);
	        if (p3 == null) {
	            v1 = 0;
	        } else {
	            v1 = this.a(p3);
	        }
	        v0_1.a(v1);
	        return this;
	    }
	
	
	    public android.view.MenuItem setActionView(int p4)
	    {
	        ((cd) this.d).setActionView(p4);
	        android.view.View v1 = ((cd) this.d).getActionView();
	        if ((v1 instanceof android.view.CollapsibleActionView)) {
	            ((cd) this.d).setActionView(new qi(v1));
	        }
	        return this;
	    }
	
	
	    public android.view.MenuItem setActionView(android.view.View p2)
	    {
	        if ((p2 instanceof android.view.CollapsibleActionView)) {
	            p2 = new qi(p2);
	        }
	        ((cd) this.d).setActionView(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setAlphabeticShortcut(char p2)
	    {
	        ((cd) this.d).setAlphabeticShortcut(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setCheckable(boolean p2)
	    {
	        ((cd) this.d).setCheckable(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setChecked(boolean p2)
	    {
	        ((cd) this.d).setChecked(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setEnabled(boolean p2)
	    {
	        ((cd) this.d).setEnabled(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setIcon(int p2)
	    {
	        ((cd) this.d).setIcon(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable p2)
	    {
	        ((cd) this.d).setIcon(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setIntent(android.content.Intent p2)
	    {
	        ((cd) this.d).setIntent(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setNumericShortcut(char p2)
	    {
	        ((cd) this.d).setNumericShortcut(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener p3)
	    {
	        int v1_0;
	        cd v0_1 = ((cd) this.d);
	        if (p3 == null) {
	            v1_0 = 0;
	        } else {
	            v1_0 = new qj(this, p3);
	        }
	        v0_1.a(v1_0);
	        return this;
	    }
	
	
	    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener p3)
	    {
	        int v1_0;
	        cd v0_1 = ((cd) this.d);
	        if (p3 == null) {
	            v1_0 = 0;
	        } else {
	            v1_0 = new qk(this, p3);
	        }
	        v0_1.setOnMenuItemClickListener(v1_0);
	        return this;
	    }
	
	
	    public android.view.MenuItem setShortcut(char p2, char p3)
	    {
	        ((cd) this.d).setShortcut(p2, p3);
	        return this;
	    }
	
	
	    public void setShowAsAction(int p2)
	    {
	        ((cd) this.d).setShowAsAction(p2);
	        return;
	    }
	
	
	    public android.view.MenuItem setShowAsActionFlags(int p2)
	    {
	        ((cd) this.d).setShowAsActionFlags(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setTitle(int p2)
	    {
	        ((cd) this.d).setTitle(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setTitle(CharSequence p2)
	    {
	        ((cd) this.d).setTitle(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setTitleCondensed(CharSequence p2)
	    {
	        ((cd) this.d).setTitleCondensed(p2);
	        return this;
	    }
	
	
	    public android.view.MenuItem setVisible(boolean p2)
	    {
	        return ((cd) this.d).setVisible(p2);
	    }
	
