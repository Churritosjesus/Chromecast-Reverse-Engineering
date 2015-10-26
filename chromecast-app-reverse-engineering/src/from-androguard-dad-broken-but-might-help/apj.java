	public  a
	public  b
	public  c
	
	    public apj(android.content.Context p5)
	    {
	        int v0 = 1;
	        int v2_0 = android.preference.PreferenceManager.getDefaultSharedPreferences(p5);
	        this.a = v2_0.getBoolean("SHOW_BACKDROP_TIP", 0);
	        this.b = v2_0.getBoolean("SHOW_CAST_NEARBY_WARM_WELCOME", 0);
	        if (v2_0.getInt("CAST_SCREEN_CLING", 0) != 1) {
	            v0 = 0;
	        }
	        this.c = v0;
	        return;
	    }
	
