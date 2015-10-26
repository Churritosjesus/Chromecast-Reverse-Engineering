	public final android.support.v4.widget.DrawerLayout a
	public mr b
	public android.graphics.drawable.Drawable c
	public  d
	public final  e
	public final  f
	private final mo g
	private  h
	
	    public mn(android.app.Activity p8, android.support.v4.widget.DrawerLayout p9, int p10, int p11)
	    {
	        this(p8, 0, p9, 0, p10, p11);
	        return;
	    }
	
	
	    private mn(android.app.Activity p3, android.support.v7.widget.Toolbar p4, android.support.v4.widget.DrawerLayout p5, android.graphics.drawable.Drawable p6, int p7, int p8)
	    {
	        this.d = 1;
	        this.h = 0;
	        if (!(p3 instanceof mp)) {
	            if (android.os.Build$VERSION.SDK_INT < 18) {
	                if (android.os.Build$VERSION.SDK_INT < 11) {
	                    this.g = new ms(p3);
	                } else {
	                    this.g = new mt(p3);
	                }
	            } else {
	                this.g = new mu(p3);
	            }
	        } else {
	            this.g = ((mp) p3).c();
	        }
	        this.a = p5;
	        this.e = p7;
	        this.f = p8;
	        this.b = new mq(p3, this.g.b());
	        this.c = this.e();
	        return;
	    }
	
	
	    private void a(int p2)
	    {
	        this.g.a(p2);
	        return;
	    }
	
	
	    public void a()
	    {
	        this.b.a(1065353216);
	        if (this.d) {
	            this.a(this.f);
	        }
	        return;
	    }
	
	
	    public final void a(float p4)
	    {
	        this.b.a(Math.min(1065353216, Math.max(0, p4)));
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p3, int p4)
	    {
	        if ((!this.h) && (!this.g.c())) {
	            android.util.Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
	            this.h = 1;
	        }
	        this.g.a(p3, p4);
	        return;
	    }
	
	
	    public void b()
	    {
	        this.b.a(0);
	        if (this.d) {
	            this.a(this.e);
	        }
	        return;
	    }
	
	
	    public final void c()
	    {
	        if (!this.a.e(8388611)) {
	            this.b.a(0);
	        } else {
	            this.b.a(1065353216);
	        }
	        if (this.d) {
	            int v1_4;
	            if (!this.a.e(8388611)) {
	                v1_4 = this.e;
	            } else {
	                v1_4 = this.f;
	            }
	            this.a(((android.graphics.drawable.Drawable) this.b), v1_4);
	        }
	        return;
	    }
	
	
	    public void d()
	    {
	        IllegalArgumentException v0_1;
	        IllegalArgumentException v0_0 = this.a;
	        String v1_0 = v0_0.b(8388611);
	        if (v1_0 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = v0_0.h(v1_0);
	        }
	        if (v0_1 == null) {
	            this.a.d(8388611);
	        } else {
	            IllegalArgumentException v0_3 = this.a;
	            String v1_1 = v0_3.b(8388611);
	            if (v1_1 != null) {
	                v0_3.f(v1_1);
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("No drawer view found with gravity ").append(android.support.v4.widget.DrawerLayout.c(8388611)).toString());
	            }
	        }
	        return;
	    }
	
	
	    public final android.graphics.drawable.Drawable e()
	    {
	        return this.g.a();
	    }
	
