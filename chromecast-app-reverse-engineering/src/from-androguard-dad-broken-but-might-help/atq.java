	private synthetic atf a
	
	    atq(atf p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final synthetic void a(Object p8)
	    {
	        this.a.g = ((daz) p8);
	        if (!android.text.TextUtils.isEmpty(((daz) p8).e)) {
	            com.google.android.apps.chromecast.app.SetupApplication.a().c = ((daz) p8).e;
	        }
	        String v3_0 = blx.a(this.a.a, ((daz) p8));
	        atf v0_7 = new String[v3_0.size()];
	        v3_0.toArray(v0_7);
	        this.a.f = blx.a(v0_7);
	        this.a.b();
	        boolean v4_0 = ((daz) p8).d;
	        dax v1_2 = 0;
	        atf v0_10 = 0;
	        while (v1_2 < v4_0.length) {
	            if (!v3_0.contains(v4_0[v1_2])) {
	                v0_10 = 1;
	            }
	            v1_2++;
	        }
	        android.preference.PreferenceManager.getDefaultSharedPreferences(this.a.a).edit().putBoolean("content_search_enabled", ((daz) p8).a.booleanValue()).putBoolean("content_whatson_enabled", ((daz) p8).b.booleanValue()).putBoolean("content_getapps_enabled", ((daz) p8).c.booleanValue()).putBoolean("content_default_getapps", v0_10).commit();
	        while (!this.a.i.isEmpty()) {
	            ((atr) this.a.i.remove(0)).a(this.a.f);
	        }
	        this.a.j.clear();
	        this.a.h = 0;
	        return;
	    }
	
