	private synthetic bmg a
	
	    bmh(bmg p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onClick(android.content.DialogInterface p5, int p6)
	    {
	        int v0_4 = bmg.a(this.a).getText().toString().trim();
	        if ((!android.text.TextUtils.isEmpty(v0_4)) && (!v0_4.equals(bmg.b(this.a)))) {
	            com.google.android.apps.chromecast.app.DeviceSettingsActivity v1_5 = bmg.c(this.a);
	            if (v1_5.g()) {
	                v1_5.e.a(v0_4);
	            }
	            java.util.HashMap v2_3 = new java.util.HashMap();
	            v2_3.put("friendly_name", v0_4);
	            v1_5.a(v2_3, new alv(v1_5, v0_4), 37);
	        }
	        return;
	    }
	
