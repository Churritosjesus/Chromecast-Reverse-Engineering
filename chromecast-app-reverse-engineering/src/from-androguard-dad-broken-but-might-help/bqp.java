	 android.content.SharedPreferences a
	final bqq b
	private  c
	private  e
	
	    protected bqp(brb p7)
	    {
	        this(p7);
	        this.e = -1;
	        this.b = new bqq(this, "monitoring", ((Long) bqd.D.a()).longValue());
	        return;
	    }
	
	
	    protected final void a()
	    {
	        this.a = this.d.a.getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
	        return;
	    }
	
	
	    public final void a(String p3)
	    {
	        brb.i();
	        this.r();
	        String v0_1 = this.a.edit();
	        if (!android.text.TextUtils.isEmpty(p3)) {
	            v0_1.putString("installation_campaign", p3);
	        } else {
	            v0_1.remove("installation_campaign");
	        }
	        if (!v0_1.commit()) {
	            this.e("Failed to commit campaign data");
	        }
	        return;
	    }
	
	
	    public final long b()
	    {
	        brb.i();
	        this.r();
	        if (this.c == 0) {
	            long v0_3 = this.a.getLong("first_run", 0);
	            if (v0_3 == 0) {
	                long v0_6 = this.d.c.a();
	                String v2_3 = this.a.edit();
	                v2_3.putLong("first_run", v0_6);
	                if (!v2_3.commit()) {
	                    this.e("Failed to commit first run time");
	                }
	                this.c = v0_6;
	            } else {
	                this.c = v0_3;
	            }
	        }
	        return this.c;
	    }
	
	
	    public final bqr c()
	    {
	        return new bqr(this.d.c, this.b());
	    }
	
	
	    public final long d()
	    {
	        brb.i();
	        this.r();
	        if (this.e == -1) {
	            this.e = this.a.getLong("last_dispatch", 0);
	        }
	        return this.e;
	    }
	
	
	    public final void e()
	    {
	        brb.i();
	        this.r();
	        long v0_2 = this.d.c.a();
	        android.content.SharedPreferences$Editor v2_1 = this.a.edit();
	        v2_1.putLong("last_dispatch", v0_2);
	        v2_1.apply();
	        this.e = v0_2;
	        return;
	    }
	
	
	    public final String f()
	    {
	        String v0 = 0;
	        brb.i();
	        this.r();
	        String v1_1 = this.a.getString("installation_campaign", 0);
	        if (!android.text.TextUtils.isEmpty(v1_1)) {
	            v0 = v1_1;
	        }
	        return v0;
	    }
	
