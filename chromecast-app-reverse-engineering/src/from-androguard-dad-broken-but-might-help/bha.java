	private azv Z
	 java.lang.String a
	private java.lang.String aa
	private blp b
	private android.os.Handler c
	private java.lang.Runnable d
	
	    public bha()
	    {
	        this.b = new blp("DeviceHotspotManager", 0);
	        this.c = new android.os.Handler();
	        return;
	    }
	
	
	    static synthetic azv a(bha p0, azv p1)
	    {
	        p0.Z = p1;
	        return p1;
	    }
	
	
	    public static bha a(String p3, String p4)
	    {
	        bha v0_1 = new bha();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("deviceHotspotSsid", p3);
	        v1_1.putString("androidWifiSsid", p4);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic blp a(bha p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic azv b(bha p1)
	    {
	        return p1.Z;
	    }
	
	
	    static synthetic String c(bha p1)
	    {
	        return p1.aa;
	    }
	
	
	    public final void a(android.app.Activity p3)
	    {
	        super.a(p3);
	        if (this.d != null) {
	            this.c.removeCallbacks(this.d);
	        }
	        if (this.Z != null) {
	            this.Z.a();
	            this.Z = 0;
	        }
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p3)
	    {
	        super.a(p3);
	        this.c(1);
	        this.aa = this.m.getString("deviceHotspotSsid");
	        if (p3 == null) {
	            this.a = this.m.getString("androidWifiSsid");
	        } else {
	            this.a = p3.getString("androidWifiSsid");
	        }
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putString("androidWifiSsid", this.a);
	        return;
	    }
	
	
	    public final void h_()
	    {
	        super.h_();
	        android.os.Handler v0_0 = this.a;
	        if (!android.text.TextUtils.isEmpty(v0_0)) {
	            this.d = new bhb(this, v0_0, this.y.getApplicationContext());
	            this.c.postDelayed(this.d, ((long) this.e().getInteger(a.fl)));
	        }
	        return;
	    }
	
