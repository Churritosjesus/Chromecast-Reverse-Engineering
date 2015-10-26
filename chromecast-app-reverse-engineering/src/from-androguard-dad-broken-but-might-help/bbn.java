	public java.lang.Boolean a
	public com.google.android.gms.cast.CastDevice b
	 com.google.android.gms.common.api.GoogleApiClient c
	public final tz d
	private final blp e
	private final android.content.Context f
	private final bve g
	private final android.os.Handler h
	private final java.util.ArrayList i
	
	    private bbn(android.content.Context p4)
	    {
	        com.google.android.gms.common.api.GoogleApiClient v0_10;
	        this.e = new blp("CastScreenTracker");
	        this.a = 0;
	        this.b = 0;
	        this.i = new java.util.ArrayList();
	        this.f = p4;
	        this.h = new android.os.Handler();
	        this.d = tz.a(this.f);
	        bvq.a();
	        if (bvq.a(this.f) != 0) {
	            v0_10 = 0;
	        } else {
	            v0_10 = 1;
	        }
	        if ((v0_10 != null) && ((bls.a(this.f)) && ((this.c == null) || (!this.c.d())))) {
	            this.c = new bwf(this.f, this, this).a(bvc.b).b();
	            this.c.b();
	        }
	        this.g = new bbo(this);
	        return;
	    }
	
	
	    public static bbn a(android.content.Context p2)
	    {
	        int v0_1;
	        if (!blf.a()) {
	            v0_1 = 0;
	        } else {
	            v0_1 = new bbn(p2.getApplicationContext());
	        }
	        return v0_1;
	    }
	
	
	    static synthetic void a(bbn p3, boolean p4)
	    {
	        p3.a = Boolean.valueOf(0);
	        void v3_1 = p3.a(p3.b, 0);
	        if (p4) {
	            v3_1.h.post(new bbp(v3_1));
	        }
	        v3_1.b = 0;
	        return;
	    }
	
	
	    private void a(com.google.android.gms.cast.CastDevice p3, com.google.android.gms.cast.CastDevice p4)
	    {
	        java.util.Iterator v1 = this.i.iterator();
	        while (v1.hasNext()) {
	            ((bbt) v1.next()).a(p3, p4);
	        }
	        return;
	    }
	
	
	    public final void a(int p4)
	    {
	        Object[] v0_1 = new Object[1];
	        v0_1[0] = Integer.valueOf(p4);
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p4)
	    {
	        this.d();
	        bvc.c.a(this.c, this.g);
	        return;
	    }
	
	
	    public final void a(bbt p2)
	    {
	        this.i.add(p2);
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.cast.CastDevice p2)
	    {
	        this.a = Boolean.valueOf(1);
	        this.a(this.b, p2);
	        this.b = p2;
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p4)
	    {
	        String v0 = String.valueOf(p4);
	        new StringBuilder((String.valueOf(v0).length() + 18)).append("ConnectionFailed: ").append(v0);
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        int v0_1;
	        if (this.a == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final void b(bbt p2)
	    {
	        this.i.remove(p2);
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        if ((this.a == null) || (!this.a.booleanValue())) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final void c()
	    {
	        if ((this.c != null) && (this.c.d())) {
	            bvc.c.a(this.c).a(new bbr(this));
	            android.widget.Toast.makeText(this.f, this.f.getString(b.ap), 1).show();
	        }
	        return;
	    }
	
	
	    public final void d()
	    {
	        if ((this.c != null) && (this.c.d())) {
	            bvc.c.b(this.c).a(new bbs(this));
	        }
	        return;
	    }
	
