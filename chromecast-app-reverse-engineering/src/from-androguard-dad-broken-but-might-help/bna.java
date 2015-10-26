	private synthetic java.lang.Long a
	
	    bna(bmu p1, Long p2)
	    {
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p8)
	    {
	        bkf v0_1 = bkh.a().g;
	        long v2 = this.a.longValue();
	        v0_1.f.add(String.valueOf(v2));
	        android.preference.PreferenceManager.getDefaultSharedPreferences(com.google.android.apps.chromecast.app.SetupApplication.a()).edit().putString("IGNORED_ANNOUNCEMENT_CARDS", android.text.TextUtils.join(",", v0_1.f.toArray())).apply();
	        java.util.Iterator v1_6 = v0_1.d.iterator();
	        while (v1_6.hasNext()) {
	            ((bkf) v1_6.next()).a(v2);
	        }
	        return;
	    }
	
