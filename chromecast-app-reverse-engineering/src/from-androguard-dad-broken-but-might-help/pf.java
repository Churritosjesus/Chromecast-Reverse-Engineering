	private final android.content.Context c
	private final qa d
	private vs e
	private java.lang.ref.WeakReference f
	private synthetic pb g
	
	    public pf(pb p3, android.content.Context p4, vs p5)
	    {
	        this.g = p3;
	        this.c = p4;
	        this.e = p5;
	        qa v0_1 = new qa(p4);
	        v0_1.e = 1;
	        this.d = v0_1;
	        this.d.a(this);
	        return;
	    }
	
	
	    public final android.view.MenuInflater a()
	    {
	        return new pm(this.c);
	    }
	
	
	    public final void a(int p2)
	    {
	        this.b(pb.k(this.g).getResources().getString(p2));
	        return;
	    }
	
	
	    public final void a(android.view.View p2)
	    {
	        pb.i(this.g).d(p2);
	        this.f = new ref.WeakReference(p2);
	        return;
	    }
	
	
	    public final void a(CharSequence p2)
	    {
	        pb.i(this.g).b(p2);
	        return;
	    }
	
	
	    public final void a(qa p2)
	    {
	        if (this.e != null) {
	            this.d();
	            pb.i(this.g).a();
	        }
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        super.a(p2);
	        pb.i(this.g).a(p2);
	        return;
	    }
	
	
	    public final boolean a(qa p2, android.view.MenuItem p3)
	    {
	        int v0_1;
	        if (this.e == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.e.a(this, p3);
	        }
	        return v0_1;
	    }
	
	
	    public final android.view.Menu b()
	    {
	        return this.d;
	    }
	
	
	    public final void b(int p2)
	    {
	        this.a(pb.k(this.g).getResources().getString(p2));
	        return;
	    }
	
	
	    public final void b(CharSequence p2)
	    {
	        pb.i(this.g).a(p2);
	        return;
	    }
	
	
	    public final void c()
	    {
	        if (this.g.a == this) {
	            if (pb.a(pb.g(this.g), pb.h(this.g), 0)) {
	                this.e.a(this);
	            } else {
	                this.g.b = this;
	                this.g.c = this.e;
	            }
	            this.e = 0;
	            this.g.g(0);
	            boolean v1_3 = pb.i(this.g);
	            if (v1_3.l != 2) {
	                if (v1_3.i != null) {
	                    v1_3.b();
	                    v1_3.l = 2;
	                    pp v0_21 = gt.o(v1_3.i).b(((float) ((- v1_3.i.getWidth()) - ((android.view.ViewGroup$MarginLayoutParams) v1_3.i.getLayoutParams()).leftMargin)));
	                    v0_21.a(200);
	                    v0_21.a(v1_3);
	                    v0_21.a(new android.view.animation.DecelerateInterpolator());
	                    pp v2_6 = new pp();
	                    v2_6.a(v0_21);
	                    if (v1_3.b != null) {
	                        v1_3.b.getChildCount();
	                    }
	                    v1_3.k = v2_6;
	                    v1_3.k.a();
	                } else {
	                    v1_3.c();
	                }
	            }
	            pb.j(this.g).a().sendAccessibilityEvent(32);
	            pb.f(this.g).a(this.g.d);
	            this.g.a = 0;
	        }
	        return;
	    }
	
	
	    public final void d()
	    {
	        if (this.g.a == this) {
	            this.d.d();
	            try {
	                this.e.b(this, this.d);
	                this.d.e();
	            } catch (Throwable v0_5) {
	                this.d.e();
	                throw v0_5;
	            }
	        }
	        return;
	    }
	
	
	    public final boolean e()
	    {
	        this.d.d();
	        try {
	            Throwable v0_2 = this.e.a(this, this.d);
	            this.d.e();
	            return v0_2;
	        } catch (Throwable v0_3) {
	            this.d.e();
	            throw v0_3;
	        }
	    }
	
	
	    public final CharSequence f()
	    {
	        return pb.i(this.g).g;
	    }
	
	
	    public final CharSequence g()
	    {
	        return pb.i(this.g).h;
	    }
	
	
	    public final boolean h()
	    {
	        return pb.i(this.g).j;
	    }
	
	
	    public final android.view.View i()
	    {
	        int v0_1;
	        if (this.f == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = ((android.view.View) this.f.get());
	        }
	        return v0_1;
	    }
	
