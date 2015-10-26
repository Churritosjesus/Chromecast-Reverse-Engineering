	private android.support.v7.widget.RecyclerView Z
	private axq a
	private android.widget.Button aa
	private  ab
	private axd b
	private bcn c
	private android.widget.ViewFlipper d
	
	    public baz()
	    {
	        return;
	    }
	
	
	    static synthetic axd a(baz p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic boolean a(baz p1, boolean p2)
	    {
	        p1.ab = 0;
	        return 0;
	    }
	
	
	    static synthetic void b(baz p0)
	    {
	        p0.r();
	        return;
	    }
	
	
	    private void r()
	    {
	        android.widget.ViewFlipper v0_2;
	        if (this.b.d == null) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        if (!this.ab) {
	            if (v0_2 != null) {
	                this.d.setDisplayedChild(0);
	            } else {
	                this.d.setDisplayedChild(2);
	            }
	        } else {
	            this.d.setDisplayedChild(3);
	        }
	        return;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p6, android.view.ViewGroup p7, android.os.Bundle p8)
	    {
	        android.view.View v1_1 = p6.inflate(a.fF, p7, 0);
	        this.d = ((android.widget.ViewFlipper) v1_1.findViewById(f.K));
	        this.Z = ((android.support.v7.widget.RecyclerView) v1_1.findViewById(f.ak));
	        this.aa = ((android.widget.Button) v1_1.findViewById(f.eq));
	        this.Z.a(this.a);
	        android.widget.Button v0_12 = new xw(this.y);
	        v0_12.a(1);
	        this.Z.a(v0_12);
	        this.Z.setLayoutAnimation(new android.view.animation.LayoutAnimationController(android.view.animation.AnimationUtils.loadAnimation(this.y, a.dg)));
	        if (p8 != null) {
	            this.ab = p8.getBoolean("getAppsError");
	        }
	        this.Z.a(new bba(this, this.e().getDimensionPixelSize(a.dJ), this.e().getDimensionPixelSize(a.dE)));
	        this.aa.setOnClickListener(new bbb(this));
	        return v1_1;
	    }
	
	
	    public final void a(android.os.Bundle p4)
	    {
	        super.a(p4);
	        this.a = new axq(this.y, 1);
	        return;
	    }
	
	
	    public final void a(dau[] p3)
	    {
	        if (this.a != null) {
	            this.a.a(p3, 0);
	            this.r();
	        }
	        return;
	    }
	
	
	    public final void a(dau[] p1, int[] p2)
	    {
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putBoolean("getAppsError", this.ab);
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        this.ab = 0;
	        this.b = ((axm) this.y).g();
	        axq v0_4 = this.b;
	        v0_4.h = this;
	        if ((v0_4.d == null) || (this == null)) {
	            if (v0_4.k != null) {
	                this.q();
	            }
	        } else {
	            this.a(v0_4.d.a);
	        }
	        this.c = ((axm) this.y).h();
	        axq v0_11 = this.c;
	        bcn v1_1 = this.a;
	        v0_11.e.add(v1_1);
	        if (!v0_11.c.isEmpty()) {
	            android.support.v7.widget.RecyclerView v2_4 = new java.util.ArrayList(v0_11.c.size());
	            v2_4.addAll(v0_11.c);
	            java.util.Collections.sort(v2_4, bcn.a);
	            v1_1.a(v2_4);
	        }
	        axq v0_14 = this.a;
	        android.support.v7.widget.RecyclerView v2_5 = this.Z;
	        v0_14.e = this.c;
	        v0_14.d = v2_5;
	        this.r();
	        return;
	    }
	
	
	    public final void k()
	    {
	        super.k();
	        this.c.e.remove(this);
	        axq v0_2 = this.a;
	        v0_2.e = 0;
	        v0_2.d = 0;
	        return;
	    }
	
	
	    public final void p()
	    {
	        return;
	    }
	
	
	    public final void q()
	    {
	        this.ab = 1;
	        this.r();
	        return;
	    }
	
