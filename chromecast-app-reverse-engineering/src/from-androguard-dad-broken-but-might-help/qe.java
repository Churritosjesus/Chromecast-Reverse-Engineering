	final  a
	public qa b
	public  c
	public fb d
	private final  e
	private final  f
	private final  g
	private java.lang.CharSequence h
	private java.lang.CharSequence i
	private android.content.Intent j
	private  k
	private  l
	private android.graphics.drawable.Drawable m
	private  n
	private qu o
	private android.view.MenuItem$OnMenuItemClickListener p
	private  q
	private android.view.View r
	private gc s
	private  t
	private android.view.ContextMenu$ContextMenuInfo u
	
	    qe(qa p3, int p4, int p5, int p6, int p7, CharSequence p8, int p9)
	    {
	        this.n = 0;
	        this.q = 16;
	        this.c = 0;
	        this.t = 0;
	        this.b = p3;
	        this.e = p5;
	        this.f = p4;
	        this.g = p6;
	        this.a = p7;
	        this.h = p8;
	        this.c = p9;
	        return;
	    }
	
	
	    private cd a(android.view.View p3)
	    {
	        this.r = p3;
	        this.d = 0;
	        if ((p3 != null) && ((p3.getId() == -1) && (this.e > 0))) {
	            p3.setId(this.e);
	        }
	        this.b.g();
	        return this;
	    }
	
	
	    static synthetic qa a(qe p1)
	    {
	        return p1.b;
	    }
	
	
	    public final cd a(fb p3)
	    {
	        if (this.d != null) {
	            this.d.a(0);
	        }
	        this.r = 0;
	        this.d = p3;
	        this.b.b(1);
	        if (this.d != null) {
	            this.d.a(new qf(this));
	        }
	        return this;
	    }
	
	
	    public final cd a(gc p1)
	    {
	        this.s = p1;
	        return this;
	    }
	
	
	    public final fb a()
	    {
	        return this.d;
	    }
	
	
	    public final CharSequence a(qs p2)
	    {
	        if ((p2 == null) || (!p2.b())) {
	            CharSequence v0_1 = this.getTitle();
	        } else {
	            v0_1 = this.getTitleCondensed();
	        }
	        return v0_1;
	    }
	
	
	    final void a(qu p2)
	    {
	        this.o = p2;
	        p2.setHeaderTitle(this.getTitle());
	        return;
	    }
	
	
	    public final void a(boolean p3)
	    {
	        int v0_1;
	        if (!p3) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 4;
	        }
	        this.q = (v0_1 | (this.q & -5));
	        return;
	    }
	
	
	    final void b(boolean p5)
	    {
	        qa v0_1;
	        int v2 = this.q;
	        if (!p5) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 2;
	        }
	        this.q = (v0_1 | (this.q & -3));
	        if (v2 != this.q) {
	            this.b.b(0);
	        }
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        int v0 = 1;
	        if (((this.p == null) || (!this.p.onMenuItemClick(this))) && (!this.b.a(this.b.k(), this))) {
	            if (this.j == null) {
	                if ((this.d == null) || (!this.d.e())) {
	                    v0 = 0;
	                }
	            } else {
	                try {
	                    this.b.a.startActivity(this.j);
	                } catch (boolean v1_8) {
	                    android.util.Log.e("MenuItemImpl", "Can\'t find activity to handle intent; ignoring", v1_8);
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public final char c()
	    {
	        char v0_2;
	        if (!this.b.b()) {
	            v0_2 = this.k;
	        } else {
	            v0_2 = this.l;
	        }
	        return v0_2;
	    }
	
	
	    final boolean c(boolean p5)
	    {
	        int v0_1;
	        int v1 = 0;
	        int v2 = this.q;
	        if (!p5) {
	            v0_1 = 8;
	        } else {
	            v0_1 = 0;
	        }
	        this.q = (v0_1 | (this.q & -9));
	        if (v2 != this.q) {
	            v1 = 1;
	        }
	        return v1;
	    }
	
	
	    public final boolean collapseActionView()
	    {
	        boolean v0_0 = 0;
	        if ((this.c & 8) != 0) {
	            if (this.r != null) {
	                if ((this.s == null) || (this.s.b(this))) {
	                    v0_0 = this.b.b(this);
	                }
	            } else {
	                v0_0 = 1;
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final void d(boolean p2)
	    {
	        if (!p2) {
	            this.q = (this.q & -33);
	        } else {
	            this.q = (this.q | 32);
	        }
	        return;
	    }
	
	
	    public final boolean d()
	    {
	        if ((!this.b.c()) || (this.c() == 0)) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final void e(boolean p3)
	    {
	        this.t = p3;
	        this.b.b(0);
	        return;
	    }
	
	
	    public final boolean e()
	    {
	        int v0_2;
	        if ((this.q & 4) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean expandActionView()
	    {
	        boolean v0_0 = 0;
	        if ((this.i()) && ((this.s == null) || (this.s.a(this)))) {
	            v0_0 = this.b.a(this);
	        }
	        return v0_0;
	    }
	
	
	    public final boolean f()
	    {
	        int v0_2;
	        if ((this.q & 32) != 32) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean g()
	    {
	        int v0 = 1;
	        if ((this.c & 1) != 1) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public final android.view.ActionProvider getActionProvider()
	    {
	        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
	    }
	
	
	    public final android.view.View getActionView()
	    {
	        int v0_2;
	        if (this.r == null) {
	            if (this.d == null) {
	                v0_2 = 0;
	            } else {
	                this.r = this.d.a(this);
	                v0_2 = this.r;
	            }
	        } else {
	            v0_2 = this.r;
	        }
	        return v0_2;
	    }
	
	
	    public final char getAlphabeticShortcut()
	    {
	        return this.l;
	    }
	
	
	    public final int getGroupId()
	    {
	        return this.f;
	    }
	
	
	    public final android.graphics.drawable.Drawable getIcon()
	    {
	        int v0_2;
	        if (this.m == null) {
	            if (this.n == 0) {
	                v0_2 = 0;
	            } else {
	                v0_2 = tf.a(this.b.a, this.n);
	                this.n = 0;
	                this.m = v0_2;
	            }
	        } else {
	            v0_2 = this.m;
	        }
	        return v0_2;
	    }
	
	
	    public final android.content.Intent getIntent()
	    {
	        return this.j;
	    }
	
	
	    public final int getItemId()
	    {
	        return this.e;
	    }
	
	
	    public final android.view.ContextMenu$ContextMenuInfo getMenuInfo()
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
	
	
	    public final android.view.SubMenu getSubMenu()
	    {
	        return this.o;
	    }
	
	
	    public final CharSequence getTitle()
	    {
	        return this.h;
	    }
	
	
	    public final CharSequence getTitleCondensed()
	    {
	        String v0_1;
	        if (this.i == null) {
	            v0_1 = this.h;
	        } else {
	            v0_1 = this.i;
	        }
	        if ((android.os.Build$VERSION.SDK_INT < 18) && ((v0_1 != null) && (!(v0_1 instanceof String)))) {
	            v0_1 = v0_1.toString();
	        }
	        return v0_1;
	    }
	
	
	    public final boolean h()
	    {
	        int v0_2;
	        if ((this.c & 2) != 2) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean hasSubMenu()
	    {
	        int v0_1;
	        if (this.o == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean i()
	    {
	        int v0 = 0;
	        if ((this.c & 8) != 0) {
	            if ((this.r == null) && (this.d != null)) {
	                this.r = this.d.a(this);
	            }
	            if (this.r != null) {
	                v0 = 1;
	            }
	        }
	        return v0;
	    }
	
	
	    public final boolean isActionViewExpanded()
	    {
	        return this.t;
	    }
	
	
	    public final boolean isCheckable()
	    {
	        int v0 = 1;
	        if ((this.q & 1) != 1) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public final boolean isChecked()
	    {
	        int v0_2;
	        if ((this.q & 2) != 2) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean isEnabled()
	    {
	        int v0_2;
	        if ((this.q & 16) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean isVisible()
	    {
	        int v0 = 1;
	        if ((this.d == null) || (!this.d.b())) {
	            if ((this.q & 8) != 0) {
	                v0 = 0;
	            }
	        } else {
	            if (((this.q & 8) != 0) || (!this.d.c())) {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final android.view.MenuItem setActionProvider(android.view.ActionProvider p3)
	    {
	        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
	    }
	
	
	    public final synthetic android.view.MenuItem setActionView(int p4)
	    {
	        android.view.View v0_1 = this.b.a;
	        this.a(android.view.LayoutInflater.from(v0_1).inflate(p4, new android.widget.LinearLayout(v0_1), 0));
	        return this;
	    }
	
	
	    public final synthetic android.view.MenuItem setActionView(android.view.View p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public final android.view.MenuItem setAlphabeticShortcut(char p3)
	    {
	        if (this.l != p3) {
	            this.l = Character.toLowerCase(p3);
	            this.b.b(0);
	        }
	        return this;
	    }
	
	
	    public final android.view.MenuItem setCheckable(boolean p5)
	    {
	        qa v0_1;
	        int v2 = this.q;
	        if (!p5) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        this.q = (v0_1 | (this.q & -2));
	        if (v2 != this.q) {
	            this.b.b(0);
	        }
	        return this;
	    }
	
	
	    public final android.view.MenuItem setChecked(boolean p8)
	    {
	        if ((this.q & 4) == 0) {
	            this.b(p8);
	        } else {
	            qa v4 = this.b;
	            int v5 = this.getGroupId();
	            int v6 = v4.c.size();
	            int v3 = 0;
	            while (v3 < v6) {
	                int v0_5 = ((qe) v4.c.get(v3));
	                if ((v0_5.getGroupId() == v5) && ((v0_5.e()) && (v0_5.isCheckable()))) {
	                    int v1_3;
	                    if (v0_5 != this) {
	                        v1_3 = 0;
	                    } else {
	                        v1_3 = 1;
	                    }
	                    v0_5.b(v1_3);
	                }
	                v3++;
	            }
	        }
	        return this;
	    }
	
	
	    public final android.view.MenuItem setEnabled(boolean p3)
	    {
	        if (!p3) {
	            this.q = (this.q & -17);
	        } else {
	            this.q = (this.q | 16);
	        }
	        this.b.b(0);
	        return this;
	    }
	
	
	    public final android.view.MenuItem setIcon(int p3)
	    {
	        this.m = 0;
	        this.n = p3;
	        this.b.b(0);
	        return this;
	    }
	
	
	    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable p3)
	    {
	        this.n = 0;
	        this.m = p3;
	        this.b.b(0);
	        return this;
	    }
	
	
	    public final android.view.MenuItem setIntent(android.content.Intent p1)
	    {
	        this.j = p1;
	        return this;
	    }
	
	
	    public final android.view.MenuItem setNumericShortcut(char p3)
	    {
	        if (this.k != p3) {
	            this.k = p3;
	            this.b.b(0);
	        }
	        return this;
	    }
	
	
	    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener p3)
	    {
	        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
	    }
	
	
	    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener p1)
	    {
	        this.p = p1;
	        return this;
	    }
	
	
	    public final android.view.MenuItem setShortcut(char p3, char p4)
	    {
	        this.k = p3;
	        this.l = Character.toLowerCase(p4);
	        this.b.b(0);
	        return this;
	    }
	
	
	    public final void setShowAsAction(int p3)
	    {
	        switch ((p3 & 3)) {
	            case 0:
	            case 1:
	            case 2:
	                this.c = p3;
	                this.b.g();
	                return;
	            default:
	                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
	        }
	    }
	
	
	    public final synthetic android.view.MenuItem setShowAsActionFlags(int p1)
	    {
	        this.setShowAsAction(p1);
	        return this;
	    }
	
	
	    public final android.view.MenuItem setTitle(int p2)
	    {
	        return this.setTitle(this.b.a.getString(p2));
	    }
	
	
	    public final android.view.MenuItem setTitle(CharSequence p3)
	    {
	        this.h = p3;
	        this.b.b(0);
	        if (this.o != null) {
	            this.o.setHeaderTitle(p3);
	        }
	        return this;
	    }
	
	
	    public final android.view.MenuItem setTitleCondensed(CharSequence p3)
	    {
	        this.i = p3;
	        this.b.b(0);
	        return this;
	    }
	
	
	    public final android.view.MenuItem setVisible(boolean p2)
	    {
	        if (this.c(p2)) {
	            this.b.f();
	        }
	        return this;
	    }
	
	
	    public final String toString()
	    {
	        return this.h.toString();
	    }
	
