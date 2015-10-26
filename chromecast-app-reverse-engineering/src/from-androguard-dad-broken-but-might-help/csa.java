	private static bridge android.os.Bundle d
	private static bridge android.os.Bundle e
	private java.lang.String a
	private java.lang.String b
	private final java.util.HashMap c
	
	    public csa(android.content.Context p8, android.os.Looper p9, bwg p10, bwh p11, String p12, byl p13)
	    {
	        this(p8.getApplicationContext(), p9, 5, p10, p11, p13);
	        this.c = new java.util.HashMap();
	        this.a = p12;
	        this.b = p13.e;
	        return;
	    }
	
	
	    static synthetic com.google.android.gms.common.api.Status a(int p3, String p4, android.os.Bundle p5)
	    {
	        android.app.PendingIntent v0_2;
	        if (p5 != null) {
	            v0_2 = ((android.app.PendingIntent) p5.getParcelable("pendingIntent"));
	        } else {
	            v0_2 = 0;
	        }
	        return new com.google.android.gms.common.api.Status(p3, 0, v0_2);
	    }
	
	
	    private declared_synchronized void a(android.os.Bundle p4)
	    {
	        if (p4 != null) {
	            try {
	                cld.a(p4.getBoolean("use_contactables_api", 1));
	                crz.a.a(p4.getStringArray("config.url_uncompress.patterns"), p4.getStringArray("config.url_uncompress.replacements"));
	                csa.d = p4.getBundle("config.email_type_map");
	                csa.e = p4.getBundle("config.phone_type_map");
	            } catch (Throwable v0_7) {
	                throw v0_7;
	            }
	        }
	        return;
	    }
	
	
	    protected final synthetic android.os.IInterface a(android.os.IBinder p2)
	    {
	        return crv.a(p2);
	    }
	
	
	    public final bye a(bwq p5, String p6, String p7, int p8)
	    {
	        csg v2_1 = new csg(p5);
	        try {
	            int v0_2 = ((cru) super.o()).c(v2_1, p6, p7, 0);
	        } catch (int v0) {
	            v2_1.a(8, 0, 0, 0);
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final bye a(bwq p8, String p9, String p10, int p11, int p12)
	    {
	        csg v1_1 = new csg(p8);
	        try {
	            int v0_2 = ((cru) super.o()).b(v1_1, p9, p10, p11, p12);
	        } catch (int v0) {
	            v1_1.a(8, 0, 0, 0);
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final void a()
	    {
	        try {
	            if (this.k()) {
	                java.util.Iterator v7 = this.c.values().iterator();
	                while (v7.hasNext()) {
	                    String v1_1 = ((csc) v7.next());
	                    0.f();
	                    try {
	                        ((cru) super.o()).a(v1_1, 0, 0, 0, 0);
	                    } catch (IllegalStateException v0_8) {
	                        a.a("PeopleClient", "PeopleService is in unexpected state", v0_8);
	                    } catch (IllegalStateException v0_9) {
	                        a.a("PeopleClient", "Failed to unregister listener", v0_9);
	                    }
	                }
	            }
	        } catch (IllegalStateException v0_10) {
	            throw v0_10;
	        }
	        this.c.clear();
	        super.a();
	        return;
	    }
	
	
	    protected final void a(int p2, android.os.IBinder p3, android.os.Bundle p4)
	    {
	        if ((p2 == 0) && (p4 != null)) {
	            this.a(p4.getBundle("post_init_configuration"));
	        }
	        android.os.Bundle v0_3;
	        if (p4 != null) {
	            v0_3 = p4.getBundle("post_init_resolution");
	        } else {
	            v0_3 = 0;
	        }
	        super.a(p2, p3, v0_3);
	        return;
	    }
	
	
	    public final void a(bwq p4, String p5, int p6)
	    {
	        super.n();
	        csd v1_1 = new csd(p4);
	        try {
	            ((cru) super.o()).a(v1_1, p5, p6);
	        } catch (int v0) {
	            v1_1.a(8, 0, 0);
	        }
	        return;
	    }
	
	
	    public final void a(bwq p9, boolean p10, boolean p11, String p12, String p13, int p14)
	    {
	        super.n();
	        csf v1_1 = new csf(p9);
	        try {
	            ((cru) super.o()).a(v1_1, 0, p11, 0, 0, p14);
	        } catch (int v0) {
	            v1_1.a(8, 0, 0);
	        }
	        return;
	    }
	
	
	    protected final String c()
	    {
	        return "com.google.android.gms.people.service.START";
	    }
	
	
	    protected final String d()
	    {
	        return "com.google.android.gms.people.internal.IPeopleService";
	    }
	
	
	    protected final android.os.Bundle e()
	    {
	        android.os.Bundle v0_1 = new android.os.Bundle();
	        v0_1.putString("social_client_application_id", this.a);
	        v0_1.putString("real_client_package_name", this.b);
	        v0_1.putBoolean("support_new_image_callback", 1);
	        return v0_1;
	    }
	
