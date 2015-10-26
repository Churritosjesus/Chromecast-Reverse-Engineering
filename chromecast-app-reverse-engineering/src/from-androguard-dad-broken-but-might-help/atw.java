	public final java.util.List a
	public  b
	private java.lang.String c
	
	    public atw(android.content.Context p2)
	    {
	        this.a = new java.util.ArrayList();
	        this.b = 0;
	        this.c = blf.z(p2);
	        return;
	    }
	
	
	    static synthetic boolean a(atw p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic boolean a(atw p1, boolean p2)
	    {
	        p1.b = 1;
	        return 1;
	    }
	
	
	    static synthetic java.util.List b(atw p1)
	    {
	        return p1.a;
	    }
	
	
	    public final void a(android.os.Bundle p11)
	    {
	        try {
	            int v3_1 = new dbs();
	            int v0_2 = new dbr[this.a.size()];
	            v3_1.a = v0_2;
	            int v1_0 = 0;
	        } catch (int v0_13) {
	            int v1_4 = this.h;
	            int v4_3 = new Object[1];
	            v4_3[0] = v0_13;
	            v1_4.a("Could not serialize device data for savedInstanceState: %s", v4_3);
	            return;
	        }
	        while (v1_0 < this.a.size()) {
	            int v4_1 = v3_1.a;
	            int v0_10 = ((ast) this.a.get(v1_0));
	            dbr v5_1 = new dbr();
	            v5_1.a = v0_10.a;
	            v5_1.b = v0_10.b;
	            v5_1.c = v0_10.c;
	            if (v0_10.d > 0) {
	                v5_1.d = Long.valueOf(v0_10.d);
	            }
	            v4_1[v1_0] = v5_1;
	            v1_0++;
	        }
	        int v0_6 = new byte[v3_1.d()];
	        v3_1.a(dep.a(v0_6, 0, v0_6.length));
	        p11.putString("user_devices", android.util.Base64.encodeToString(v0_6, 0));
	        return;
	    }
	
	
	    public final void a(atf p5, auo p6)
	    {
	        p5.a(new auk(this.c, new atx(this, p6), new aty(this, p6)));
	        return;
	    }
	
	
	    public final void a(dbs p4)
	    {
	        this.a.clear();
	        int v0_1 = 0;
	        while (v0_1 < p4.a.length) {
	            this.a.add(new ast(p4.a[v0_1]));
	            v0_1++;
	        }
	        return;
	    }
	
	
	    public final void b(android.os.Bundle p7)
	    {
	        dev v0_1 = p7.getString("user_devices");
	        if (v0_1 != null) {
	            try {
	                this.a(dbs.a(android.util.Base64.decode(v0_1, 0)));
	            } catch (dev v0_4) {
	                blp v1_1 = this.h;
	                Object[] v3 = new Object[1];
	                v3[0] = v0_4;
	                v1_1.a("Could not load user device list from savedInstanceState: %s", v3);
	            }
	        }
	        dev v0_5 = new Object[1];
	        v0_5[0] = Integer.valueOf(this.a.size());
	        return;
	    }
	
