	private bli a
	
	    public alh(com.google.android.apps.chromecast.app.DebugActivity p2)
	    {
	        this.a = com.google.android.apps.chromecast.app.SetupApplication.a().c();
	        return;
	    }
	
	
	    public final String a()
	    {
	        return bli.a(0);
	    }
	
	
	    public final void a(String p6)
	    {
	        blp v0_0 = this.a;
	        String v1_2 = android.preference.PreferenceManager.getDefaultSharedPreferences(com.google.android.apps.chromecast.app.SetupApplication.a()).edit();
	        Object[] v2_1 = bli.a(p6, bli.a());
	        if (p6.equals(bli.d[0])) {
	            v1_2.remove("ACM_LEVEL").apply();
	        } else {
	            v1_2.putString("ACM_LEVEL", p6).apply();
	        }
	        try {
	            v0_0.a(com.google.android.apps.chromecast.app.SetupApplication.a(), v2_1);
	        } catch (String v1) {
	            Object[] v2_2 = new Object[0];
	            v0_0.c.a("Failed to switch container maps", v2_2);
	        }
	        return;
	    }
	
	
	    public final String b()
	    {
	        return bli.a(1);
	    }
	
	
	    public final String[] c()
	    {
	        return bli.c();
	    }
	
	
	    public final String[] d()
	    {
	        return bli.d();
	    }
	
