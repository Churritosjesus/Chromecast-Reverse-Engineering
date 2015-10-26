	final java.util.concurrent.atomic.AtomicReference a
	private final android.os.Handler b
	
	    public buh(bue p3)
	    {
	        this.a = new java.util.concurrent.atomic.AtomicReference(p3);
	        this.b = new android.os.Handler(p3.h);
	        return;
	    }
	
	
	    private static void a(bue p3, long p4, int p6)
	    {
	        bue.g(p3);
	        Throwable v0_2 = ((bwq) bue.g(p3).remove(Long.valueOf(p4)));
	        if (v0_2 != null) {
	            v0_2.a(new com.google.android.gms.common.api.Status(p6));
	        }
	        return;
	    }
	
	
	    private static boolean a(bue p3, int p4)
	    {
	        bue.i();
	        try {
	            int v0_1;
	            if (bue.h(p3) == null) {
	                v0_1 = 0;
	            } else {
	                bue.h(p3).a(new com.google.android.gms.common.api.Status(p4));
	                bue.b(p3, 0);
	                v0_1 = 1;
	            }
	        } catch (int v0_4) {
	            throw v0_4;
	        }
	        return v0_1;
	    }
	
	
	    public final bue a()
	    {
	        int v0_2 = ((bue) this.a.getAndSet(0));
	        if (v0_2 != 0) {
	            bue.b(v0_2);
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final void a(int p7)
	    {
	        bue v0 = this.a();
	        if (v0 != null) {
	            int v1_0 = bue.g();
	            Object[] v3_1 = new Object[1];
	            v3_1[0] = Integer.valueOf(p7);
	            v1_0.b("ICastDeviceControllerListener.onDisconnected: %d", v3_1);
	            if (p7 != 0) {
	                v0.a(2);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(long p4)
	    {
	        bue v0_2 = ((bue) this.a.get());
	        if (v0_2 != null) {
	            buh.a(v0_2, p4, 0);
	        }
	        return;
	    }
	
	
	    public final void a(long p2, int p4)
	    {
	        bue v0_2 = ((bue) this.a.get());
	        if (v0_2 != null) {
	            buh.a(v0_2, p2, p4);
	        }
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.cast.ApplicationMetadata p10, String p11, String p12, boolean p13)
	    {
	        bue v6_1 = ((bue) this.a.get());
	        if (v6_1 != null) {
	            bue.a(v6_1, p10);
	            bue.a(v6_1, p10.b);
	            bue.b(v6_1, p12);
	            bue.h();
	            try {
	                if (bue.c(v6_1) != null) {
	                    bue.c(v6_1).a(new buf(new com.google.android.gms.common.api.Status(0), p10, p11, p12, p13));
	                    bue.a(v6_1, 0);
	                }
	            } catch (int v0_7) {
	                throw v0_7;
	            }
	        }
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.cast.internal.ApplicationStatus p5)
	    {
	        bue v0_2 = ((bue) this.a.get());
	        if (v0_2 != null) {
	            Object[] v3_1 = new Object[0];
	            bue.g().b("onApplicationStatusChanged", v3_1);
	            this.b.post(new buk(this, v0_2, p5));
	        }
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.cast.internal.DeviceStatus p5)
	    {
	        bue v0_2 = ((bue) this.a.get());
	        if (v0_2 != null) {
	            Object[] v3_1 = new Object[0];
	            bue.g().b("onDeviceStatusChanged", v3_1);
	            this.b.post(new buj(this, v0_2, p5));
	        }
	        return;
	    }
	
	
	    public final void a(String p6, String p7)
	    {
	        bue v0_2 = ((bue) this.a.get());
	        if (v0_2 != null) {
	            android.os.Handler v1_0 = bue.g();
	            Object[] v3_1 = new Object[2];
	            v3_1[0] = p6;
	            v3_1[1] = p7;
	            v1_0.b("Receive (type=text, ns=%s) %s", v3_1);
	            this.b.post(new bul(this, v0_2, p6, p7));
	        }
	        return;
	    }
	
	
	    public final void a(String p6, byte[] p7)
	    {
	        if (((bue) this.a.get()) != null) {
	            buu v0_3 = bue.g();
	            Object[] v2_1 = new Object[2];
	            v2_1[0] = p6;
	            v2_1[1] = Integer.valueOf(p7.length);
	            v0_3.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", v2_1);
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        Object[] v2_1 = new Object[0];
	        bue.g().b("Deprecated callback: \"onStatusreceived\"", v2_1);
	        return;
	    }
	
	
	    public final void b(int p6)
	    {
	        Throwable v0_2 = ((bue) this.a.get());
	        if (v0_2 != null) {
	            bue.h();
	            try {
	                if (bue.c(v0_2) != null) {
	                    bue.c(v0_2).a(new buf(new com.google.android.gms.common.api.Status(p6)));
	                    bue.a(v0_2, 0);
	                }
	            } catch (Throwable v0_3) {
	                throw v0_3;
	            }
	        }
	        return;
	    }
	
	
	    public final void c(int p2)
	    {
	        bue v0_2 = ((bue) this.a.get());
	        if (v0_2 != null) {
	            buh.a(v0_2, p2);
	        }
	        return;
	    }
	
	
	    public final void d(int p2)
	    {
	        bue v0_2 = ((bue) this.a.get());
	        if (v0_2 != null) {
	            buh.a(v0_2, p2);
	        }
	        return;
	    }
	
	
	    public final void e(int p4)
	    {
	        bue v0_2 = ((bue) this.a.get());
	        if (v0_2 != null) {
	            bue.a(v0_2, 0);
	            bue.b(v0_2, 0);
	            buh.a(v0_2, p4);
	            if (bue.d(v0_2) != null) {
	                this.b.post(new bui(this, v0_2, p4));
	            }
	        }
	        return;
	    }
	
