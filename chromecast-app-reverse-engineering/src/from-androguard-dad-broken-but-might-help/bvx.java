	private bvy a
	public final java.lang.Object b
	public final java.util.ArrayList c
	public bridge bwm d
	public bridge  e
	private final java.util.concurrent.CountDownLatch f
	private bwn g
	private  h
	private  i
	private bye j
	
	    public bvx(android.os.Looper p3)
	    {
	        this.b = new Object();
	        this.f = new java.util.concurrent.CountDownLatch(1);
	        this.c = new java.util.ArrayList();
	        this.a = new bvy(p3);
	        return;
	    }
	
	
	    static void b(bwm p5)
	    {
	        if ((p5 instanceof bwl)) {
	            try {
	                ((bwl) p5).a();
	            } catch (RuntimeException v1_2) {
	                android.util.Log.w("AbstractPendingResult", new StringBuilder("Unable to release ").append(p5).toString(), v1_2);
	            }
	        }
	        return;
	    }
	
	
	    private void c(bwm p4)
	    {
	        this.d = p4;
	        this.j = 0;
	        this.f.countDown();
	        if (this.g != null) {
	            this.a.removeMessages(2);
	            if (!this.h) {
	                this.a.a(this.g, this.f());
	            }
	        }
	        bwn v1_2 = this.c.iterator();
	        while (v1_2.hasNext()) {
	            ((bwk) v1_2.next()).a();
	        }
	        this.c.clear();
	        return;
	    }
	
	
	    private bwm f()
	    {
	        int v0_0 = 1;
	        if (this.e) {
	            v0_0 = 0;
	        }
	        a.a(v0_0, "Result has already been consumed.");
	        a.a(this.a(), "Result is not ready.");
	        int v0_3 = this.d;
	        this.d = 0;
	        this.g = 0;
	        this.e = 1;
	        this.d();
	        return v0_3;
	    }
	
	
	    public final void a(bwk p3)
	    {
	        try {
	            java.util.ArrayList v0_1;
	            if (this.e) {
	                v0_1 = 0;
	            } else {
	                v0_1 = 1;
	            }
	        } catch (java.util.ArrayList v0_4) {
	            throw v0_4;
	        }
	        a.a(v0_1, "Result has already been consumed.");
	        if (!this.a()) {
	            this.c.add(p3);
	        } else {
	            p3.a();
	        }
	        return;
	    }
	
	
	    public final void a(bwm p6)
	    {
	        String v0_0 = 1;
	        try {
	            if ((!this.i) && (!this.h)) {
	                boolean v2_3;
	                if (this.a()) {
	                    v2_3 = 0;
	                } else {
	                    v2_3 = 1;
	                }
	                a.a(v2_3, "Results have already been set");
	                if (this.e) {
	                    v0_0 = 0;
	                }
	                a.a(v0_0, "Result has already been consumed");
	                this.c(p6);
	            } else {
	                bvx.b(p6);
	            }
	        } catch (String v0_1) {
	            throw v0_1;
	        }
	        return;
	    }
	
	
	    public final void a(bwn p4)
	    {
	        try {
	            bvy v0_1;
	            if (this.e) {
	                v0_1 = 0;
	            } else {
	                v0_1 = 1;
	            }
	        } catch (bvy v0_5) {
	            throw v0_5;
	        }
	        a.a(v0_1, "Result has already been consumed.");
	        if (!this.c()) {
	            if (!this.a()) {
	                this.g = p4;
	            } else {
	                this.a.a(p4, this.f());
	            }
	        } else {
	        }
	        return;
	    }
	
	
	    public final void a(bye p3)
	    {
	        try {
	            this.j = p3;
	            return;
	        } catch (Throwable v0) {
	            throw v0;
	        }
	    }
	
	
	    public final boolean a()
	    {
	        int v0_3;
	        if (this.f.getCount() != 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final void b()
	    {
	        try {
	            if ((!this.h) && (!this.e)) {
	                if (this.j != null) {
	                    try {
	                        this.j.a();
	                    } catch (android.os.RemoteException v0) {
	                    }
	                }
	                bvx.b(this.d);
	                this.g = 0;
	                this.h = 1;
	                this.c(this.a(com.google.android.gms.common.api.Status.d));
	            } else {
	            }
	        } catch (android.os.RemoteException v0_9) {
	            throw v0_9;
	        }
	        return;
	    }
	
	
	    public final void c(com.google.android.gms.common.api.Status p3)
	    {
	        try {
	            if (!this.a()) {
	                this.a(this.a(p3));
	                this.i = 1;
	            }
	        } catch (int v0_3) {
	            throw v0_3;
	        }
	        return;
	    }
	
	
	    public final boolean c()
	    {
	        try {
	            return this.h;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    protected void d()
	    {
	        return;
	    }
	
