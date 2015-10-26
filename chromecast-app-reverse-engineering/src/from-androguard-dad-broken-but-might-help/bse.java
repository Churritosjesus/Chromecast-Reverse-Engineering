	  a
	  b
	private android.app.AlarmManager c
	
	    protected bse(brb p3)
	    {
	        this(p3);
	        this.c = ((android.app.AlarmManager) this.l().getSystemService("alarm"));
	        return;
	    }
	
	
	    private android.app.PendingIntent d()
	    {
	        android.app.PendingIntent v0_1 = new android.content.Intent(this.l(), bpe);
	        v0_1.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
	        return android.app.PendingIntent.getBroadcast(this.l(), 0, v0_1, 0);
	    }
	
	
	    protected final void a()
	    {
	        try {
	            this.c.cancel(this.d());
	        } catch (int v0) {
	            return;
	        }
	        if (brz.e() <= 0) {
	            return;
	        } else {
	            int v0_5 = this.l().getPackageManager().getReceiverInfo(new android.content.ComponentName(this.l(), bpe), 2);
	            if ((v0_5 == 0) || (!v0_5.enabled)) {
	                return;
	            } else {
	                this.b("Receiver registered. Using alarm for local dispatch.");
	                this.a = 1;
	                return;
	            }
	        }
	    }
	
	
	    public final void b()
	    {
	        this.r();
	        a.a(this.a, "Receiver not registered");
	        android.app.AlarmManager v0_1 = brz.e();
	        if (v0_1 > 0) {
	            this.c();
	            long v2_3 = (this.k().b() + v0_1);
	            this.b = 1;
	            this.c.setInexactRepeating(2, v2_3, 0, this.d());
	        }
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.r();
	        this.b = 0;
	        this.c.cancel(this.d());
	        return;
	    }
	
