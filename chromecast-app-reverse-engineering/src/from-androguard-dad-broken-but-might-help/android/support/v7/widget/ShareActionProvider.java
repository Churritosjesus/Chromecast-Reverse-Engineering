	private  c
	private final aak d
	private final android.content.Context e
	private java.lang.String f
	
	    public ShareActionProvider(android.content.Context p2)
	    {
	        this(p2);
	        this.c = 4;
	        this.d = new aak(this);
	        this.f = "share_history.xml";
	        this.e = p2;
	        return;
	    }
	
	
	    public static synthetic android.content.Context a(android.support.v7.widget.ShareActionProvider p1)
	    {
	        return p1.e;
	    }
	
	
	    public static synthetic void a(android.support.v7.widget.ShareActionProvider p2, android.content.Intent p3)
	    {
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            p3.addFlags(524288);
	        } else {
	            p3.addFlags(134742016);
	        }
	        return;
	    }
	
	
	    public static synthetic String b(android.support.v7.widget.ShareActionProvider p1)
	    {
	        return p1.f;
	    }
	
	
	    public final android.view.View a()
	    {
	        android.support.v7.internal.widget.ActivityChooserView v0_1 = new android.support.v7.internal.widget.ActivityChooserView(this.e);
	        if (!v0_1.isInEditMode()) {
	            boolean v1_3 = rl.a(this.e, this.f);
	            android.widget.ImageView v2_1 = v0_1.a;
	            android.database.DataSetObserver v3_2 = android.support.v7.internal.widget.ActivityChooserView.a(v2_1.c).a;
	            if ((v3_2 != null) && (v2_1.c.isShown())) {
	                v3_2.unregisterObserver(android.support.v7.internal.widget.ActivityChooserView.i(v2_1.c));
	            }
	            v2_1.a = v1_3;
	            if ((v1_3) && (v2_1.c.isShown())) {
	                v1_3.registerObserver(android.support.v7.internal.widget.ActivityChooserView.i(v2_1.c));
	            }
	            v2_1.notifyDataSetChanged();
	            if (v0_1.c()) {
	                v0_1.b();
	                v0_1.a();
	            }
	        }
	        boolean v1_6 = new android.util.TypedValue();
	        this.e.getTheme().resolveAttribute(a.p, v1_6, 1);
	        v0_1.b.setImageDrawable(tf.a(this.e, v1_6.resourceId));
	        v0_1.c = this;
	        v0_1.d = a.bX;
	        v0_1.b.setContentDescription(v0_1.getContext().getString(a.bW));
	        return v0_1;
	    }
	
	
	    public final void a(android.view.SubMenu p9)
	    {
	        p9.clear();
	        rl v2_1 = rl.a(this.e, this.f);
	        android.content.pm.PackageManager v3 = this.e.getPackageManager();
	        int v4 = v2_1.a();
	        android.view.SubMenu v5_0 = Math.min(v4, this.c);
	        int v0_3 = 0;
	        while (v0_3 < v5_0) {
	            android.view.MenuItem v6_4 = v2_1.a(v0_3);
	            p9.add(0, v0_3, v0_3, v6_4.loadLabel(v3)).setIcon(v6_4.loadIcon(v3)).setOnMenuItemClickListener(this.d);
	            v0_3++;
	        }
	        if (v5_0 < v4) {
	            android.view.SubMenu v5_1 = p9.addSubMenu(0, v5_0, v5_0, this.e.getString(a.bU));
	            int v0_6 = 0;
	            while (v0_6 < v4) {
	                android.view.MenuItem v6_1 = v2_1.a(v0_6);
	                v5_1.add(0, v0_6, v0_6, v6_1.loadLabel(v3)).setIcon(v6_1.loadIcon(v3)).setOnMenuItemClickListener(this.d);
	                v0_6++;
	            }
	        }
	        return;
	    }
	
	
	    public final boolean f()
	    {
	        return 1;
	    }
	
