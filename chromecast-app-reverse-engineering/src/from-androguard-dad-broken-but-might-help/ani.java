	private synthetic apd a
	private synthetic  b
	private synthetic java.lang.String c
	private synthetic and d
	
	    ani(and p1, apd p2, int p3, String p4)
	    {
	        this.d = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final synthetic void a(Object p9)
	    {
	        ape.a().a(this.a.a(1));
	        java.io.IOException v0_3 = com.google.android.apps.chromecast.app.SetupApplication.a().b().c(and.b(this.d));
	        if (v0_3 != null) {
	            com.google.android.apps.chromecast.app.SetupApplication.a().b().a(v0_3);
	            if ((this.b == bfk.b) && (!android.text.TextUtils.isEmpty(this.c))) {
	                blp v1_10 = new dcg();
	                v1_10.a = Integer.valueOf(2);
	                String v2_3 = new dbt[1];
	                v2_3[0] = asr.a(v0_3);
	                v1_10.c = v2_3;
	                try {
	                    atf.a(this.d.getApplicationContext()).a(new auf(blf.z(this.d.getApplicationContext()), v1_10, 0, 0));
	                } catch (java.io.IOException v0_8) {
	                    blp v1_12 = this.d.t;
	                    Object[] v3_3 = new Object[1];
	                    v3_3[0] = v0_8;
	                    v1_12.a("Could not serialize device link data: %s", v3_3);
	                }
	            }
	        }
	        this.d.finish();
	        return;
	    }
	
	
	    public final void b_(int p4)
	    {
	        this.d.e(this.d.getString(b.aO));
	        ape.a().a(this.a.a(0));
	        this.d.y();
	        this.d.w();
	        return;
	    }
	
