	private android.widget.Button Z
	private axq a
	private android.widget.Button aa
	private  ab
	private axd b
	private android.widget.ViewFlipper c
	private android.support.v7.widget.RecyclerView d
	
	    public awn()
	    {
	        return;
	    }
	
	
	    static synthetic axd a(awn p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic boolean a(awn p1, boolean p2)
	    {
	        p1.ab = 0;
	        return 0;
	    }
	
	
	    static synthetic void b(awn p0)
	    {
	        p0.r();
	        return;
	    }
	
	
	    private void r()
	    {
	        android.widget.ViewFlipper v0_2;
	        int v1_0 = 1;
	        if (this.b.c == null) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        if (!this.ab) {
	            if (v0_2 != null) {
	                if (this.a.a() != 0) {
	                    v1_0 = 0;
	                }
	                if (this.c.getDisplayedChild() != v1_0) {
	                    this.c.setDisplayedChild(v1_0);
	                }
	            } else {
	                this.c.setDisplayedChild(2);
	            }
	        } else {
	            this.c.setDisplayedChild(3);
	        }
	        return;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p6, android.view.ViewGroup p7, android.os.Bundle p8)
	    {
	        android.view.View v1_1 = p6.inflate(a.fF, p7, 0);
	        this.c = ((android.widget.ViewFlipper) v1_1.findViewById(f.K));
	        this.d = ((android.support.v7.widget.RecyclerView) v1_1.findViewById(f.ak));
	        this.Z = ((android.widget.Button) v1_1.findViewById(f.bm));
	        this.aa = ((android.widget.Button) v1_1.findViewById(f.eq));
	        this.d.a(this.a);
	        android.widget.Button v0_15 = new xw(this.y);
	        v0_15.a(1);
	        this.d.a(v0_15);
	        this.d.setLayoutAnimation(new android.view.animation.LayoutAnimationController(android.view.animation.AnimationUtils.loadAnimation(this.y, a.dg)));
	        if (p8 != null) {
	            this.ab = p8.getBoolean("browseError");
	        }
	        this.d.a(new awo(this, this.e().getDimensionPixelSize(a.ee)));
	        this.Z.setOnClickListener(new awp(this));
	        this.aa.setOnClickListener(new awq(this));
	        return v1_1;
	    }
	
	
	    public final void a(android.os.Bundle p4)
	    {
	        super.a(p4);
	        this.a = new axq(this.y, 0);
	        return;
	    }
	
	
	    public final void a(dau[] p1)
	    {
	        return;
	    }
	
	
	    public final void a(dau[] p2, int[] p3)
	    {
	        if (this.a != null) {
	            this.a.a(p2, p3);
	            this.r();
	        }
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putBoolean("browseError", this.ab);
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        this.ab = 0;
	        this.b = ((axm) this.y).g();
	        aef v0_4 = this.b;
	        v0_4.g = this;
	        if (v0_4.c == null) {
	            if (v0_4.j != null) {
	                this.p();
	            }
	        } else {
	            this.a(v0_4.c.a, v0_4.e);
	        }
	        this.r();
	        return;
	    }
	
	
	    public final void p()
	    {
	        this.ab = 1;
	        this.r();
	        return;
	    }
	
	
	    public final void q()
	    {
	        return;
	    }
	
