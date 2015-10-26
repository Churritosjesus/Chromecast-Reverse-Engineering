	 bps a
	private bpo b
	private android.content.Context c
	
	    cyd(android.content.Context p1)
	    {
	        this.c = p1;
	        return;
	    }
	
	
	    declared_synchronized void a(String p4)
	    {
	        try {
	            if (this.b == null) {
	                this.b = bpo.a(this.c);
	                bpo v1 = this.b;
	                bqk.a(new cye());
	                if (!v1.f) {
	                    bqd.b.a();
	                    new StringBuilder("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append(((String) bqd.b.a())).append(" DEBUG");
	                    v1.f = 1;
	                }
	                this.a = this.b.a(p4);
	            }
	        } catch (bps v0_15) {
	            throw v0_15;
	        }
	        return;
	    }
	
