	static final java.lang.String a
	final brb b
	  c
	  d
	
	    static bqm()
	    {
	        bqm.a = bqm.getName();
	        return;
	    }
	
	
	    bqm(brb p1)
	    {
	        a.c(p1);
	        this.b = p1;
	        return;
	    }
	
	
	    private void d()
	    {
	        this.b.a();
	        this.b.c();
	        return;
	    }
	
	
	    private boolean e()
	    {
	        try {
	            int v0_5;
	            int v0_4 = ((android.net.ConnectivityManager) this.b.a.getSystemService("connectivity")).getActiveNetworkInfo();
	        } catch (int v0) {
	            v0_5 = 0;
	            return v0_5;
	        }
	        if ((v0_4 == 0) || (!v0_4.isConnected())) {
	            v0_5 = 0;
	            return v0_5;
	        } else {
	            v0_5 = 1;
	            return v0_5;
	        }
	    }
	
	
	    public final void a()
	    {
	        this.d();
	        if (!this.c) {
	            int v0_2 = this.b.a;
	            v0_2.registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
	            Boolean v2_2 = new android.content.IntentFilter("com.google.analytics.RADIO_POWERED");
	            v2_2.addCategory(v0_2.getPackageName());
	            v0_2.registerReceiver(this, v2_2);
	            this.d = this.e();
	            this.b.a().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.d));
	            this.c = 1;
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        if (this.c) {
	            this.b.a().b("Unregistering connectivity change receiver");
	            this.c = 0;
	            this.d = 0;
	            try {
	                this.b.a.unregisterReceiver(this);
	            } catch (IllegalArgumentException v0_5) {
	                this.b.a().e("Failed to unregister the network broadcast receiver", v0_5);
	            }
	        }
	        return;
	    }
	
	
	    android.content.Context c()
	    {
	        return this.b.a;
	    }
	
	
	    public void onReceive(android.content.Context p4, android.content.Intent p5)
	    {
	        this.d();
	        bqu v0_0 = p5.getAction();
	        this.b.a().a("NetworkBroadcastReceiver received action", v0_0);
	        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(v0_0)) {
	            if (!"com.google.analytics.RADIO_POWERED".equals(v0_0)) {
	                this.b.a().d("NetworkBroadcastReceiver received unknown action", v0_0);
	            } else {
	                if (!p5.hasExtra(bqm.a)) {
	                    bqu v0_4 = this.b.c();
	                    v0_4.b("Radio powered up");
	                    v0_4.b();
	                }
	            }
	        } else {
	            bqu v0_5 = this.e();
	            if (this.d != v0_5) {
	                this.d = v0_5;
	                this.b.c().a(v0_5);
	            }
	        }
	        return;
	    }
	
