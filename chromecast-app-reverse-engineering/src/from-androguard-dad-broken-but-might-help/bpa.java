	private caf a
	private ciq b
	private  c
	private java.lang.Object d
	private bpc e
	private final android.content.Context f
	private  g
	
	    private bpa(android.content.Context p3, long p4)
	    {
	        this.d = new Object();
	        a.c(p3);
	        this.f = p3;
	        this.c = 0;
	        this.g = -1;
	        return;
	    }
	
	
	    public static bpb a(android.content.Context p4)
	    {
	        try {
	            void v1_2 = new bpa(p4, -1).a(0);
	            Throwable v0_1 = v1_2.b();
	            v1_2.a();
	            return v0_1;
	        } catch (Throwable v0_2) {
	            v1_2.a();
	            throw v0_2;
	        }
	    }
	
	
	    private static ciq a(caf p2)
	    {
	        try {
	            return cir.a(p2.a());
	        } catch (java.io.IOException v0) {
	            throw new java.io.IOException("Interrupted exception");
	        }
	    }
	
	
	    private void a(boolean p2)
	    {
	        a.h("Calling this from your main thread can lead to deadlock");
	        try {
	            if (this.c) {
	                this.a();
	            }
	        } catch (int v0_7) {
	            throw v0_7;
	        }
	        this.a = bpa.b(this.f);
	        this.b = bpa.a(this.a);
	        this.c = 1;
	        return;
	    }
	
	
	    private bpb b()
	    {
	        a.h("Calling this from your main thread can lead to deadlock");
	        try {
	            if (!this.c) {
	                if ((this.e != null) && (this.e.b)) {
	                    this.a(0);
	                    if (!this.c) {
	                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
	                    }
	                } else {
	                    throw new java.io.IOException("AdvertisingIdClient is not connected.");
	                }
	            }
	        } catch (java.io.IOException v0_20) {
	            throw v0_20;
	        }
	        a.c(this.a);
	        a.c(this.b);
	        try {
	            java.io.IOException v0_11 = new bpb(this.b.a(), this.b.a(1));
	        } catch (java.io.IOException v0) {
	            throw new java.io.IOException("Remote exception");
	        }
	        if (this.e != null) {
	            this.e.a.countDown();
	            try {
	                this.e.join();
	            } catch (InterruptedException v2) {
	            }
	        }
	        if (this.g > 0) {
	            this.e = new bpc(this, this.g);
	        }
	        return v0_11;
	    }
	
	
	    private static caf b(android.content.Context p4)
	    {
	        try {
	            p4.getPackageManager().getPackageInfo("com.android.vending", 0);
	        } catch (java.io.IOException v0) {
	            throw new bvr(9);
	        }
	        try {
	            bvt.b(p4);
	            java.io.IOException v0_4 = new caf();
	            String v1_3 = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
	            v1_3.setPackage("com.google.android.gms");
	        } catch (java.io.IOException v0_5) {
	            throw new java.io.IOException(v0_5);
	        }
	        if (!bzw.a().a(p4, v1_3, v0_4, 1)) {
	            throw new java.io.IOException("Connection failure");
	        } else {
	            return v0_4;
	        }
	    }
	
	
	    public final void a()
	    {
	        a.h("Calling this from your main thread can lead to deadlock");
	        try {
	            if ((this.f != null) && (this.a != null)) {
	                try {
	                    if (this.c) {
	                        bzw.a().a(this.f, this.a);
	                    }
	                } catch (int v0) {
	                }
	                this.c = 0;
	                this.b = 0;
	                this.a = 0;
	            } else {
	            }
	        } catch (int v0_8) {
	            throw v0_8;
	        }
	        return;
	    }
	
	
	    protected final void finalize()
	    {
	        this.a();
	        super.finalize();
	        return;
	    }
	
