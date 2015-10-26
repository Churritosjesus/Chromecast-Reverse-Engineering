	private static final blp b
	public com.google.android.gms.common.api.GoogleApiClient a
	private final java.util.List c
	
	    static apk()
	    {
	        apk.b = new blp("CastConnection");
	        return;
	    }
	
	
	    public apk(com.google.android.gms.cast.CastDevice p2, android.content.Context p3)
	    {
	        this.c = new java.util.ArrayList();
	        this.a(p2, p3, this);
	        return;
	    }
	
	
	    private apk(com.google.android.gms.cast.CastDevice p2, android.content.Context p3, apt p4)
	    {
	        this.c = new java.util.ArrayList();
	        this.a(p2, p3, p4);
	        return;
	    }
	
	
	    public static apk a(uh p2, android.content.Context p3, apt p4)
	    {
	        return new apk(com.google.android.gms.cast.CastDevice.a(p2.m), p3, p4);
	    }
	
	
	    private void a(com.google.android.gms.cast.CastDevice p4, android.content.Context p5, apt p6)
	    {
	        com.google.android.gms.common.api.GoogleApiClient v0_4 = new bwf(p5.getApplicationContext()).a(bsr.a, new bta(new btb(p4, p6)));
	        v0_4.a(p6);
	        v0_4.a(p6);
	        this.a = v0_4.b();
	        if ((!this.a.d()) && (!this.a.e())) {
	            this.a.b();
	        }
	        return;
	    }
	
	
	    private void a(String p2, boolean p3, bwn p4)
	    {
	        this.a(new apm(this, p3, p2, p4));
	        return;
	    }
	
	
	    static synthetic blp d()
	    {
	        return apk.b;
	    }
	
	
	    public final com.google.android.gms.cast.ApplicationMetadata a()
	    {
	        com.google.android.gms.cast.ApplicationMetadata v0 = 0;
	        if ((this.a != null) && (this.a.d())) {
	            try {
	                v0 = bsr.b.d(this.a);
	            } catch (String v1_4) {
	                Object[] v4_1 = new Object[1];
	                v4_1[0] = v1_4.getMessage();
	                apk.b.a("Error getting app status from GMS: %s", v4_1);
	            }
	        }
	        return v0;
	    }
	
	
	    public final void a(int p4)
	    {
	        Object[] v0_1 = new Object[1];
	        v0_1[0] = Integer.valueOf(p4);
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p3)
	    {
	        Object[] v0_1 = new Object[1];
	        v0_1[0] = p3;
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p3)
	    {
	        Object[] v0_1 = new Object[1];
	        v0_1[0] = p3;
	        return;
	    }
	
	
	    public final void a(Runnable p3)
	    {
	        if (this.a != null) {
	            if (!this.a.d()) {
	                this.a.a(new apl(this, p3));
	                if (!this.a.e()) {
	                    this.a.b();
	                }
	            } else {
	                p3.run();
	            }
	        }
	        return;
	    }
	
	
	    public final void a(String p2, bwn p3)
	    {
	        this.a(p2, 0, p3);
	        return;
	    }
	
	
	    public final void a(String p2, String p3, Runnable p4)
	    {
	        this.a(new apo(this, p2, p3, p4));
	        return;
	    }
	
	
	    public void a(boolean p2, boolean p3)
	    {
	        this.a(new apq(this, p2, p3));
	        return;
	    }
	
	
	    public final boolean a(String p2, btd p3)
	    {
	        int v0_4;
	        if (this.a != null) {
	            this.c.add(p2);
	            this.a(new apn(this, p2, p3));
	            v0_4 = 1;
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public final void b()
	    {
	        java.util.Iterator v1 = this.c.iterator();
	        while (v1.hasNext()) {
	            try {
	                bsr.b.c(this.a, ((String) v1.next()));
	            } catch (String v0_7) {
	                Object[] v4_1 = new Object[1];
	                v4_1[0] = v0_7.toString();
	                apk.b.a("Couldn\'t remove message callback: %s", v4_1);
	            } catch (String v0_5) {
	                Object[] v4_0 = new Object[1];
	                v4_0[0] = v0_5.toString();
	                apk.b.a("Couldn\'t remove message callback: %s", v4_0);
	            }
	        }
	        this.c.clear();
	        return;
	    }
	
	
	    public final void b(int p4)
	    {
	        Object[] v0_1 = new Object[1];
	        v0_1[0] = Integer.valueOf(p4);
	        return;
	    }
	
	
	    public final void b(String p2, bwn p3)
	    {
	        this.a(p2, 1, p3);
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.a(0, 1);
	        return;
	    }
	
