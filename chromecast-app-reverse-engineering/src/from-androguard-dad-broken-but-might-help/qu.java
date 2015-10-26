	public qa k
	private qe l
	
	    public qu(android.content.Context p1, qa p2, qe p3)
	    {
	        this(p1);
	        this.k = p2;
	        this.l = p3;
	        return;
	    }
	
	
	    public final String a()
	    {
	        String v0_1;
	        if (this.l == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.l.getItemId();
	        }
	        String v0_4;
	        if (v0_1 != null) {
	            v0_4 = new StringBuilder().append(super.a()).append(":").append(v0_1).toString();
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public final void a(qb p2)
	    {
	        this.k.a(p2);
	        return;
	    }
	
	
	    final boolean a(qa p2, android.view.MenuItem p3)
	    {
	        if ((!super.a(p2, p3)) && (!this.k.a(p2, p3))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final boolean a(qe p2)
	    {
	        return this.k.a(p2);
	    }
	
	
	    public final boolean b()
	    {
	        return this.k.b();
	    }
	
	
	    public final boolean b(qe p2)
	    {
	        return this.k.b(p2);
	    }
	
	
	    public final boolean c()
	    {
	        return this.k.c();
	    }
	
	
	    public final android.view.MenuItem getItem()
	    {
	        return this.l;
	    }
	
	
	    public final qa k()
	    {
	        return this.k;
	    }
	
	
	    public final android.view.SubMenu setHeaderIcon(int p2)
	    {
	        super.a(au.a(this.a, p2));
	        return this;
	    }
	
	
	    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable p1)
	    {
	        super.a(p1);
	        return this;
	    }
	
	
	    public final android.view.SubMenu setHeaderTitle(int p2)
	    {
	        super.a(this.a.getResources().getString(p2));
	        return this;
	    }
	
	
	    public final android.view.SubMenu setHeaderTitle(CharSequence p1)
	    {
	        super.a(p1);
	        return this;
	    }
	
	
	    public final android.view.SubMenu setHeaderView(android.view.View p7)
	    {
	        super.a(0, 0, 0, 0, p7);
	        return this;
	    }
	
	
	    public final android.view.SubMenu setIcon(int p2)
	    {
	        this.l.setIcon(p2);
	        return this;
	    }
	
	
	    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable p2)
	    {
	        this.l.setIcon(p2);
	        return this;
	    }
	
	
	    public final void setQwertyMode(boolean p2)
	    {
	        this.k.setQwertyMode(p2);
	        return;
	    }
	
