	final synthetic brf a
	private bridge bqg b
	private bridge  c
	
	    protected brh(brf p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final bqg a()
	    {
	        bqg v0_0 = 0;
	        brb.i();
	        brf v1_1 = new android.content.Intent("com.google.android.gms.analytics.service.START");
	        v1_1.setComponent(new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
	        String v2_4 = this.a.l();
	        v1_1.putExtra("app_package_name", v2_4.getPackageName());
	        String v3_2 = bzw.a();
	        try {
	            this.b = 0;
	            this.c = 1;
	            brf v1_2 = v3_2.a(v2_4, v1_1, this.a.a, 129);
	            this.a.a("Bind to service requested", Boolean.valueOf(v1_2));
	        } catch (bqg v0_7) {
	            throw v0_7;
	        }
	        if (v1_2 != null) {
	            try {
	                this.wait(((Long) bqd.B.a()).longValue());
	            } catch (bqg v0) {
	                this.a.e("Wait for service connect was interrupted");
	            }
	            this.c = 0;
	            v0_0 = this.b;
	            this.b = 0;
	            if (v0_0 == null) {
	                this.a.f("Successfully bound to service but never got onServiceConnected callback");
	            }
	        } else {
	            this.c = 0;
	        }
	        return v0_0;
	    }
	
	
	    public final void onServiceConnected(android.content.ComponentName p5, android.os.IBinder p6)
	    {
	        a.g("AnalyticsServiceConnection.onServiceConnected");
	        try {
	            if (p6 != null) {
	                IllegalArgumentException v0_1 = 0;
	                try {
	                    cox v1_0 = p6.getInterfaceDescriptor();
	                } catch (cox v1) {
	                    this.a.f("Service connect failed to get IAnalyticsService");
	                    if (v0_1 != null) {
	                        if (this.c) {
	                            this.b = v0_1;
	                        } else {
	                            this.a.e("onServiceConnected received after the timeout limit");
	                            this.a.d.b().a(new bri(this, v0_1));
	                        }
	                    } else {
	                        try {
	                            bzw.a().a(this.a.l(), this.a.a);
	                        } catch (IllegalArgumentException v0) {
	                        }
	                    }
	                    this.notifyAll();
	                }
	                if (!"com.google.android.gms.analytics.internal.IAnalyticsService".equals(v1_0)) {
	                    this.a.e("Got binder with a wrong descriptor", v1_0);
	                } else {
	                    v0_1 = bqh.a(p6);
	                    this.a.b("Bound to IAnalyticsService interface");
	                }
	            } else {
	                this.a.f("Service connected with null binder");
	                this.notifyAll();
	            }
	        } catch (IllegalArgumentException v0_5) {
	            throw v0_5;
	        } catch (IllegalArgumentException v0_4) {
	            this.notifyAll();
	            throw v0_4;
	        }
	        return;
	    }
	
	
	    public final void onServiceDisconnected(android.content.ComponentName p3)
	    {
	        a.g("AnalyticsServiceConnection.onServiceDisconnected");
	        this.a.d.b().a(new brj(this, p3));
	        return;
	    }
	
