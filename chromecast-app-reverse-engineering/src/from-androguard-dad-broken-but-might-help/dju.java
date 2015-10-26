	private static dju a
	private  c
	private dju d
	private  e
	
	    public dju()
	    {
	        return;
	    }
	
	
	    private static declared_synchronized void a(dju p9, long p10, boolean p12)
	    {
	        try {
	            if (dju.a == null) {
	                dju.a = new dju();
	                new djx().start();
	            }
	        } catch (Class v0_11) {
	            throw v0_11;
	        }
	        dju v2_0 = System.nanoTime();
	        if ((p10 == 0) || (!p12)) {
	            if (p10 == 0) {
	                if (!p12) {
	                    throw new AssertionError();
	                } else {
	                    p9.e = p9.c();
	                }
	            } else {
	                p9.e = (v2_0 + p10);
	            }
	        } else {
	            p9.e = (Math.min(p10, (p9.c() - v2_0)) + v2_0);
	        }
	        Class v0_9 = dju.a;
	        while ((v0_9.d != null) && ((p9.e - v2_0) >= (v0_9.d.e - v2_0))) {
	            v0_9 = v0_9.d;
	        }
	        p9.d = v0_9.d;
	        v0_9.d = p9;
	        if (v0_9 == dju.a) {
	            dju.notify();
	        }
	        return;
	    }
	
	
	    private static declared_synchronized boolean a(dju p3)
	    {
	        try {
	            dju v0_0 = dju.a;
	        } catch (dju v0_2) {
	            throw v0_2;
	        }
	        while (v0_0 != null) {
	            if (v0_0.d != p3) {
	                v0_0 = v0_0.d;
	            } else {
	                v0_0.d = p3.d;
	                p3.d = 0;
	                dju v0_1 = 0;
	            }
	            return v0_1;
	        }
	        v0_1 = 1;
	        return v0_1;
	    }
	
	
	    static synthetic dju e()
	    {
	        return dju.g();
	    }
	
	
	    private static declared_synchronized dju g()
	    {
	        Class v0_0 = 0;
	        try {
	            Class v1_1 = dju.a.d;
	        } catch (Class v0_3) {
	            throw v0_3;
	        }
	        if (v1_1 != null) {
	            long v4_1 = (v1_1.e - System.nanoTime());
	            if (v4_1 <= 0) {
	                dju.a.d = v1_1.d;
	                v1_1.d = 0;
	                v0_0 = v1_1;
	            } else {
	                long v6_3 = (v4_1 / 1000000);
	                dju.wait(v6_3, ((int) (v4_1 - (1000000 * v6_3))));
	            }
	        } else {
	            dju.wait();
	        }
	        return v0_0;
	    }
	
	
	    final java.io.IOException a(java.io.IOException p3)
	    {
	        if (this.k_()) {
	            java.io.InterruptedIOException v0_2 = new java.io.InterruptedIOException("timeout");
	            v0_2.initCause(p3);
	            p3 = v0_2;
	        }
	        return p3;
	    }
	
	
	    public void a()
	    {
	        return;
	    }
	
	
	    final void a(boolean p3)
	    {
	        if ((!this.k_()) || (!p3)) {
	            return;
	        } else {
	            throw new java.io.InterruptedIOException("timeout");
	        }
	    }
	
	
	    public final void j_()
	    {
	        if (!this.c) {
	            long v0_1 = this.l_();
	            boolean v2 = this.m_();
	            if ((v0_1 != 0) || (v2)) {
	                this.c = 1;
	                dju.a(this, v0_1, v2);
	            }
	            return;
	        } else {
	            throw new IllegalStateException("Unbalanced enter/exit");
	        }
	    }
	
	
	    public final boolean k_()
	    {
	        boolean v0 = 0;
	        if (this.c) {
	            this.c = 0;
	            v0 = dju.a(this);
	        }
	        return v0;
	    }
	
