	private synthetic java.lang.String a
	private synthetic android.content.Context b
	private synthetic java.lang.String c
	
	    ajj(String p1, android.content.Context p2, String p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        java.util.concurrent.atomic.AtomicBoolean v0_1 = aji.e(this.a);
	        if (v0_1 != null) {
	            aji.a(this.a, v0_1);
	            this.b.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).edit().putString(this.c, v0_1.toString()).apply();
	        }
	        aji.a().set(0);
	        return;
	    }
	
