	final byy a
	public final java.util.ArrayList b
	public final java.util.ArrayList c
	public final java.util.ArrayList d
	public bridge  e
	public  f
	public final java.lang.Object g
	private final java.util.concurrent.atomic.AtomicInteger h
	private final android.os.Handler i
	
	    public byx(android.os.Looper p3, byy p4)
	    {
	        this.b = new java.util.ArrayList();
	        this.c = new java.util.ArrayList();
	        this.d = new java.util.ArrayList();
	        this.e = 0;
	        this.h = new java.util.concurrent.atomic.AtomicInteger(0);
	        this.f = 0;
	        this.g = new Object();
	        this.a = p4;
	        this.i = new android.os.Handler(p3, this);
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.e = 0;
	        this.h.incrementAndGet();
	        return;
	    }
	
	
	    public final void a(int p6)
	    {
	        this.i.removeMessages(1);
	        try {
	            this.f = 1;
	            int v0_3 = new java.util.ArrayList(this.b);
	            int v2_2 = this.h.get();
	            java.util.Iterator v3 = v0_3.iterator();
	        } catch (int v0_9) {
	            throw v0_9;
	        }
	        while (v3.hasNext()) {
	            int v0_6 = ((bwg) v3.next());
	            if ((!this.e) || (this.h.get() != v2_2)) {
	                break;
	            }
	            if (this.b.contains(v0_6)) {
	                v0_6.a(p6);
	            }
	        }
	        this.c.clear();
	        this.f = 0;
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p6)
	    {
	        int v0_0 = 1;
	        try {
	            java.util.Iterator v2_1;
	            if (this.f) {
	                v2_1 = 0;
	            } else {
	                v2_1 = 1;
	            }
	        } catch (int v0_8) {
	            throw v0_8;
	        }
	        a.a(v2_1);
	        this.i.removeMessages(1);
	        this.f = 1;
	        if (this.c.size() != 0) {
	            v0_0 = 0;
	        }
	        a.a(v0_0);
	        int v0_2 = new java.util.ArrayList(this.b);
	        int v1_3 = this.h.get();
	        java.util.Iterator v2_6 = v0_2.iterator();
	        while (v2_6.hasNext()) {
	            int v0_5 = ((bwg) v2_6.next());
	            if ((!this.e) || ((!this.a.k()) || (this.h.get() != v1_3))) {
	                break;
	            }
	            if (!this.c.contains(v0_5)) {
	                v0_5.a(p6);
	            }
	        }
	        this.c.clear();
	        this.f = 0;
	        return;
	    }
	
	
	    public final void a(bwg p5)
	    {
	        a.c(p5);
	        try {
	            if (!this.b.contains(p5)) {
	                this.b.add(p5);
	            } else {
	                android.util.Log.w("GmsClientEvents", new StringBuilder("registerConnectionCallbacks(): listener ").append(p5).append(" is already registered").toString());
	            }
	        } catch (android.os.Handler v0_4) {
	            throw v0_4;
	        }
	        if (this.a.k()) {
	            this.i.sendMessage(this.i.obtainMessage(1, p5));
	        }
	        return;
	    }
	
	
	    public final void a(bwh p5)
	    {
	        a.c(p5);
	        try {
	            if (!this.d.contains(p5)) {
	                this.d.add(p5);
	            } else {
	                android.util.Log.w("GmsClientEvents", new StringBuilder("registerConnectionFailedListener(): listener ").append(p5).append(" is already registered").toString());
	            }
	        } catch (java.util.ArrayList v0_4) {
	            throw v0_4;
	        }
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p6)
	    {
	        this.i.removeMessages(1);
	        try {
	            bwh v0_2 = new java.util.ArrayList(this.d);
	            int v2_2 = this.h.get();
	            java.util.Iterator v3 = v0_2.iterator();
	        } catch (bwh v0_6) {
	            throw v0_6;
	        }
	        while (v3.hasNext()) {
	            bwh v0_5 = ((bwh) v3.next());
	            if ((this.e) && (this.h.get() == v2_2)) {
	                if (this.d.contains(v0_5)) {
	                    v0_5.a(p6);
	                }
	            } else {
	            }
	            return;
	        }
	        return;
	    }
	
	
	    public final boolean handleMessage(android.os.Message p5)
	    {
	        try {
	            String v0_2;
	            if (p5.what != 1) {
	                android.util.Log.wtf("GmsClientEvents", "Don\'t know how to handle this message.");
	                v0_2 = 0;
	            } else {
	                String v0_4 = ((bwg) p5.obj);
	                if ((this.e) && ((this.a.k()) && (this.b.contains(v0_4)))) {
	                    v0_4.a(this.a.b());
	                }
	                v0_2 = 1;
	            }
	        } catch (String v0_5) {
	            throw v0_5;
	        }
	        return v0_2;
	    }
	
