	private static bridge agx c
	final agw a
	 agt b
	private final bk d
	
	    private agx(bk p2, agw p3)
	    {
	        ajp.a(p2, "localBroadcastManager");
	        ajp.a(p3, "profileCache");
	        this.d = p2;
	        this.a = p3;
	        return;
	    }
	
	
	    static agx a()
	    {
	        if (agx.c == null) {
	            if (agx.c == null) {
	                agx.c = new agx(bk.a(afv.f()), new agw());
	            }
	        }
	        return agx.c;
	    }
	
	
	    void a(agt p5, boolean p6)
	    {
	        bk v0_0 = this.b;
	        this.b = p5;
	        if (p6) {
	            if (p5 == null) {
	                this.a.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
	            } else {
	                android.content.SharedPreferences$Editor v1_4 = this.a;
	                ajp.a(p5, "profile");
	                String v2_2 = p5.c();
	                if (v2_2 != null) {
	                    v1_4.a.edit().putString("com.facebook.ProfileManager.CachedProfile", v2_2.toString()).apply();
	                }
	            }
	        }
	        if (!aji.a(v0_0, p5)) {
	            android.content.SharedPreferences$Editor v1_10 = new android.content.Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
	            v1_10.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", v0_0);
	            v1_10.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", p5);
	            this.d.a(v1_10);
	        }
	        return;
	    }
	
