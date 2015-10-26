	public android.content.Context a
	
	    private ph(android.content.Context p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public static ph a(android.content.Context p1)
	    {
	        return new ph(p1);
	    }
	
	
	    public final boolean a()
	    {
	        boolean v0_5;
	        if (this.a.getApplicationInfo().targetSdkVersion < 16) {
	            v0_5 = this.a.getResources().getBoolean(a.V);
	        } else {
	            v0_5 = this.a.getResources().getBoolean(a.U);
	        }
	        return v0_5;
	    }
	
