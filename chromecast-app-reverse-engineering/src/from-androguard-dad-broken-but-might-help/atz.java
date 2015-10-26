	public auq a
	public aur b
	public  c
	public java.lang.String d
	public java.lang.String e
	private java.lang.String i
	private java.lang.String j
	
	    public atz(android.content.Context p2, String p3)
	    {
	        this.j = blf.z(p2);
	        this.i = p3;
	        this.a = new auq();
	        this.b = new aur();
	        return;
	    }
	
	
	    static synthetic long a(atz p1, long p2)
	    {
	        p1.c = p2;
	        return p2;
	    }
	
	
	    static synthetic auq a(atz p0, auq p1)
	    {
	        p0.a = p1;
	        return p1;
	    }
	
	
	    static synthetic aur a(atz p0, aur p1)
	    {
	        p0.b = p1;
	        return p1;
	    }
	
	
	    public final void a(android.os.Bundle p8)
	    {
	        blp v1_0 = this.a;
	        try {
	            java.io.IOException v0_0 = v1_0.a();
	            String v2_1 = new byte[v0_0.d()];
	            v0_0.a(dep.a(v2_1, 0, v2_1.length));
	            p8.putString("user_topic_settings", android.util.Base64.encodeToString(v2_1, 0));
	        } catch (java.io.IOException v0_2) {
	            blp v1_1 = v1_0.a;
	            Object[] v3_3 = new Object[1];
	            v3_3[0] = v0_2;
	            v1_1.a("Could not serialize settings data for savedInstanceState: %s", v3_3);
	        }
	        blp v1_2 = this.b;
	        if (v1_2.b != null) {
	            try {
	                java.io.IOException v0_6 = new byte[v1_2.b.d()];
	                v1_2.b.a(dep.a(v0_6, 0, v0_6.length));
	                p8.putString("user_setting_metadata", android.util.Base64.encodeToString(v0_6, 0));
	            } catch (java.io.IOException v0_8) {
	                blp v1_3 = v1_2.a;
	                Object[] v3_7 = new Object[1];
	                v3_7[0] = v0_8;
	                v1_3.a("Could not serialize backdrop meta data for savedInstanceState: %s", v3_7);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(atf p11, auo p12)
	    {
	        p11.a(new aue(this.j, this.i, this.c, this.d, this.e, new aua(this, p12), new aub(this, p12)));
	        return;
	    }
	
	
	    public final void b(android.os.Bundle p7)
	    {
	        blp v1_0 = this.a;
	        dev v0_1 = p7.getString("user_topic_settings");
	        if (v0_1 != null) {
	            try {
	                v1_0.a(((dck) dew.a(new dck(), android.util.Base64.decode(v0_1, 0))));
	            } catch (dev v0_5) {
	                blp v1_1 = v1_0.a;
	                Object[] v3_0 = new Object[1];
	                v3_0[0] = v0_5;
	                v1_1.a("Could not load user topic settings from savedInstanceState: %s", v3_0);
	            }
	        }
	        blp v1_2 = this.b;
	        dev v0_7 = p7.getString("user_setting_metadata");
	        if (v0_7 != null) {
	            try {
	                v1_2.b = dcj.a(android.util.Base64.decode(v0_7, 0));
	            } catch (dev v0_10) {
	                blp v1_3 = v1_2.a;
	                Object[] v3_1 = new Object[1];
	                v3_1[0] = v0_10;
	                v1_3.a("Could not load backdrop meta data from savedInstanceState: %s", v3_1);
	            }
	        }
	        return;
	    }
	
	
	    public final void b(atf p10, auo p11)
	    {
	        if (this.b()) {
	            try {
	                p10.a(new aum(this.j, this.i, this.a.a(), new auc(this, this.a(), p11), new aud(this, p11)));
	            } catch (java.io.IOException v0_3) {
	                blp v1_1 = this.h;
	                Object[] v3_3 = new Object[1];
	                v3_3[0] = v0_3;
	                v1_1.a("Could not serialize DeviceBackdropSettings data: %s", v3_3);
	            }
	        } else {
	            if (p11 != null) {
	                p11.a(0);
	            }
	        }
	        return;
	    }
	
