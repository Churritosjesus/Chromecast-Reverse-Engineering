	final brb a
	final bsh b
	
	    public bry(brb p2)
	    {
	        this.a = p2;
	        this.b = new bsh();
	        return;
	    }
	
	
	    public synthetic bb a()
	    {
	        return this.b();
	    }
	
	
	    public void a(String p3, int p4)
	    {
	        if (!"ga_dispatchPeriod".equals(p3)) {
	            this.a.a().d("Int xml configuration name not recognized", p3);
	        } else {
	            this.b.d = p4;
	        }
	        return;
	    }
	
	
	    public void a(String p3, String p4)
	    {
	        if (!"ga_appName".equals(p3)) {
	            if (!"ga_appVersion".equals(p3)) {
	                if (!"ga_logLevel".equals(p3)) {
	                    this.a.a().d("String xml configuration name not recognized", p3);
	                } else {
	                    this.b.c = p4;
	                }
	            } else {
	                this.b.b = p4;
	            }
	        } else {
	            this.b.a = p4;
	        }
	        return;
	    }
	
	
	    public void a(String p3, boolean p4)
	    {
	        if (!"ga_dryRun".equals(p3)) {
	            this.a.a().d("Bool xml configuration name not recognized", p3);
	        } else {
	            int v0_4;
	            if (!p4) {
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	            this.b.e = v0_4;
	        }
	        return;
	    }
	
	
	    public bsh b()
	    {
	        return this.b;
	    }
	
