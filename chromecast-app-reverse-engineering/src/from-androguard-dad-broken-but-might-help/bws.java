	final bwz a
	final java.util.concurrent.locks.Lock b
	  c
	 cls d
	  e
	  f
	 bzf g
	  h
	  i
	private final android.content.Context j
	private com.google.android.gms.common.ConnectionResult k
	private  l
	private  m
	private  n
	private final android.os.Bundle o
	private final java.util.Set p
	private  q
	private final byl r
	private final java.util.Map s
	private final bwd t
	
	    public bws(bwz p2, byl p3, java.util.Map p4, bwd p5, java.util.concurrent.locks.Lock p6, android.content.Context p7)
	    {
	        this.m = 0;
	        this.n = 0;
	        this.o = new android.os.Bundle();
	        this.p = new java.util.HashSet();
	        this.a = p2;
	        this.r = p3;
	        this.s = p4;
	        this.t = p5;
	        this.b = p6;
	        this.j = p7;
	        return;
	    }
	
	
	    private void a(boolean p2)
	    {
	        if (this.d != null) {
	            if (this.d.k()) {
	                if (p2) {
	                    this.d.i_();
	                }
	                this.d.a();
	            }
	            this.g = 0;
	        }
	        return;
	    }
	
	
	    private static String c(int p1)
	    {
	        String v0;
	        switch (p1) {
	            case 0:
	                v0 = "STEP_GETTING_SERVICE_BINDINGS";
	                break;
	            case 1:
	                v0 = "STEP_VALIDATING_ACCOUNT";
	                break;
	            case 2:
	                v0 = "STEP_AUTHENTICATING";
	                break;
	            case 3:
	                v0 = "STEP_GETTING_REMOTE_SERVICE";
	                break;
	            default:
	                v0 = "UNKNOWN";
	        }
	        return v0;
	    }
	
	
	    private void i()
	    {
	        byx v1_0 = this.a;
	        v1_0.a.lock();
	        try {
	            v1_0.g();
	            v1_0.p = new bwr(v1_0);
	            v1_0.p.a();
	            v1_0.b.signalAll();
	            v1_0.a.unlock();
	        } catch (android.os.Bundle v0_7) {
	            v1_0.a.unlock();
	            throw v0_7;
	        }
	        if (this.d != null) {
	            if (this.h) {
	                this.d.a(this.g, this.i);
	            }
	            this.a(0);
	        }
	        byx v1_3 = this.a.k.keySet().iterator();
	        while (v1_3.hasNext()) {
	            ((bwc) this.a.j.get(((bwe) v1_3.next()))).a();
	        }
	        if (!this.n) {
	            android.os.Bundle v0_17;
	            if (!this.o.isEmpty()) {
	                v0_17 = this.o;
	            } else {
	                v0_17 = 0;
	            }
	            this.a.c.a(v0_17);
	        } else {
	            this.n = 0;
	            this.a(-1);
	        }
	        return;
	    }
	
	
	    private java.util.Set j()
	    {
	        java.util.HashSet v1_1 = new java.util.HashSet(this.r.b);
	        java.util.Map v2 = this.r.d;
	        java.util.Iterator v3 = v2.keySet().iterator();
	        while (v3.hasNext()) {
	            int v0_6 = ((bvz) v3.next());
	            if (!this.a.k.containsKey(v0_6.b())) {
	                v2.get(v0_6);
	                v1_1.addAll(0);
	            }
	        }
	        return v1_1;
	    }
	
	
	    public final bwp a(bwp p2)
	    {
	        this.a.f.add(p2);
	        return p2;
	    }
	
	
	    public final void a()
	    {
	        this.a.c.e = 1;
	        this.a.k.clear();
	        this.n = 0;
	        this.e = 0;
	        this.k = 0;
	        this.m = 0;
	        this.q = 2;
	        this.f = 0;
	        this.h = 0;
	        byl v3_0 = this.s.keySet().iterator();
	        while (v3_0.hasNext()) {
	            bwc v0_25 = ((bvz) v3_0.next());
	            ((bwc) this.a.j.get(v0_25.b())).a(new bwi(this, v0_25, ((Integer) this.s.get(v0_25)).intValue()));
	            v0_25.a();
	        }
	        if (this.e) {
	            this.r.h = Integer.valueOf(System.identityHashCode(this.a));
	            bwx v5_1 = new bwx(this);
	            this.d = ((cls) this.t.a(this.j, this.a.e, this.r, this.r.g, v5_1, v5_1));
	            this.d.j();
	        }
	        this.c = this.a.j.size();
	        java.util.Iterator v1_5 = this.a.j.values().iterator();
	        while (v1_5.hasNext()) {
	            ((bwc) v1_5.next()).j();
	        }
	        return;
	    }
	
	
	    public final void a(int p4)
	    {
	        if (p4 != -1) {
	            this.a.a(this.k);
	        } else {
	            com.google.android.gms.common.ConnectionResult v1_0 = this.a.f.iterator();
	            while (v1_0.hasNext()) {
	                ((bxi) v1_0.next()).b();
	                v1_0.remove();
	            }
	            this.a.f();
	            if ((this.k != null) || (this.a.f.isEmpty())) {
	                this.a.k.clear();
	                this.k = 0;
	                this.a(1);
	            } else {
	                this.n = 1;
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p2)
	    {
	        if (this.b(3)) {
	            if (p2 != null) {
	                this.o.putAll(p2);
	            }
	            if (this.d()) {
	                this.i();
	            }
	        }
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p2, bvz p3, int p4)
	    {
	        if (this.b(3)) {
	            this.b(p2, p3, p4);
	            if (this.d()) {
	                this.i();
	            }
	        }
	        return;
	    }
	
	
	    boolean a(com.google.android.gms.common.ConnectionResult p4)
	    {
	        int v0 = 1;
	        if ((this.q != 2) && ((this.q != 1) || (p4.a()))) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public final bwp b(bwp p3)
	    {
	        throw new IllegalStateException("GoogleApiClient is not connected yet.");
	    }
	
	
	    public final void b()
	    {
	        this.n = 0;
	        return;
	    }
	
	
	    void b(com.google.android.gms.common.ConnectionResult p3)
	    {
	        byx v0_0 = 0;
	        this.n = 0;
	        this.a.l.clear();
	        if (!p3.a()) {
	            v0_0 = 1;
	        }
	        this.a(v0_0);
	        this.a(3);
	        if ((!this.a.g) || (!bvt.b(this.j, p3.c))) {
	            this.a.g();
	            this.a.c.a(p3);
	        }
	        this.a.c.a();
	        return;
	    }
	
	
	    void b(com.google.android.gms.common.ConnectionResult p5, bvz p6, int p7)
	    {
	        bwe v0_0 = 1;
	        if (p7 != 2) {
	            p6.a();
	            if (p7 != 1) {
	                if ((this.k != null) && (2147483647 >= this.l)) {
	                    v0_0 = 0;
	                }
	            } else {
	                bwe v2_4;
	                if (!p5.a()) {
	                    if (bvt.a(p5.c) == null) {
	                        v2_4 = 0;
	                    } else {
	                        v2_4 = 1;
	                    }
	                } else {
	                    v2_4 = 1;
	                }
	                if (v2_4 == null) {
	                }
	            }
	            if (v0_0 != null) {
	                this.k = p5;
	                this.l = 2147483647;
	            }
	        }
	        this.a.k.put(p6.b(), p5);
	        return;
	    }
	
	
	    boolean b(int p4)
	    {
	        int v0_1;
	        if (this.m == p4) {
	            v0_1 = 1;
	        } else {
	            android.util.Log.wtf("GoogleApiClientConnecting", new StringBuilder("GoogleApiClient connecting is in step ").append(bws.c(this.m)).append(" but received callback for step ").append(bws.c(p4)).toString());
	            this.b(new com.google.android.gms.common.ConnectionResult(8, 0));
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final String c()
	    {
	        return "CONNECTING";
	    }
	
	
	    boolean d()
	    {
	        int v0 = 0;
	        this.c = (this.c - 1);
	        if (this.c <= 0) {
	            if (this.k == null) {
	                v0 = 1;
	            } else {
	                this.b(this.k);
	            }
	        }
	        return v0;
	    }
	
	
	    void e()
	    {
	        if ((this.f) && (this.c == 0)) {
	            this.m = 1;
	            this.c = this.a.j.size();
	            java.util.Iterator v1 = this.a.j.keySet().iterator();
	            while (v1.hasNext()) {
	                bwc v0_11 = ((bwe) v1.next());
	                if (!this.a.k.containsKey(v0_11)) {
	                    ((bwc) this.a.j.get(v0_11)).a(this.g);
	                } else {
	                    if (this.d()) {
	                        this.f();
	                    }
	                }
	            }
	        }
	        return;
	    }
	
	
	    void f()
	    {
	        this.m = 2;
	        this.a.l = this.j();
	        this.d.a(this.g, this.a.l, new bwt(this));
	        return;
	    }
	
	
	    void g()
	    {
	        java.util.Set v1_1;
	        bwc v0_1 = this.a.l;
	        if (!v0_1.isEmpty()) {
	            v1_1 = v0_1;
	        } else {
	            v1_1 = this.j();
	        }
	        this.m = 3;
	        this.c = this.a.j.size();
	        java.util.Iterator v2 = this.a.j.keySet().iterator();
	        while (v2.hasNext()) {
	            bwc v0_12 = ((bwe) v2.next());
	            if (!this.a.k.containsKey(v0_12)) {
	                ((bwc) this.a.j.get(v0_12)).a(this.g, v1_1);
	            } else {
	                if (this.d()) {
	                    this.i();
	                }
	            }
	        }
	        return;
	    }
	
	
	    void h()
	    {
	        this.e = 0;
	        this.a.l.clear();
	        java.util.Iterator v1 = this.p.iterator();
	        while (v1.hasNext()) {
	            bwe v0_6 = ((bwe) v1.next());
	            if (!this.a.k.containsKey(v0_6)) {
	                this.a.k.put(v0_6, new com.google.android.gms.common.ConnectionResult(17, 0));
	            }
	        }
	        return;
	    }
	
