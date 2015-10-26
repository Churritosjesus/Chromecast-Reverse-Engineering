	 cxi a
	bridge  b
	private final android.content.Context c
	private final java.lang.String d
	private final ctw e
	private java.util.Map f
	private java.util.Map g
	private bridge java.lang.String h
	
	    ctk(android.content.Context p5, ctw p6, String p7, long p8, cjd p10)
	    {
	        this.f = new java.util.HashMap();
	        this.g = new java.util.HashMap();
	        this.h = "";
	        this.c = p5;
	        this.e = p6;
	        this.d = p7;
	        this.b = p8;
	        cjc[] v0_5 = p10.b;
	        if (v0_5 != null) {
	            try {
	                cjc[] v0_6 = a.a(v0_5);
	                this.a(v0_6);
	            } catch (String v1_0) {
	                cuh.a(new StringBuilder("Not loading resource: ").append(v0_6).append(" because it is invalid: ").append(v1_0.toString()).toString());
	            }
	            if (p10.a != null) {
	                this.a(p10.a);
	            }
	            return;
	        } else {
	            throw new NullPointerException();
	        }
	    }
	
	
	    ctk(android.content.Context p3, ctw p4, String p5, long p6, clz p8)
	    {
	        this.f = new java.util.HashMap();
	        this.g = new java.util.HashMap();
	        this.h = "";
	        this.c = p3;
	        this.e = p4;
	        this.d = p5;
	        this.b = 0;
	        this.a(p8);
	        return;
	    }
	
	
	    private void a(clz p8)
	    {
	        this.h = p8.c;
	        cuk.a().a.equals(cul.c);
	        this.a(new cxi(this.c, p8, this.e, new ctl(this), new ctm(this), new cvd()));
	        if (this.d("_gtm.loadEventEnabled")) {
	            ctw v0_7 = this.e;
	            String v2_2 = new Object[2];
	            v2_2[0] = "gtm.id";
	            v2_2[1] = this.d;
	            java.util.HashMap v3_4 = new java.util.HashMap(ctw.a(v2_2));
	            v3_4.put("event", "gtm.load");
	            v0_7.a(v3_4);
	        }
	        return;
	    }
	
	
	    private declared_synchronized void a(cxi p2)
	    {
	        try {
	            this.a = p2;
	            return;
	        } catch (Throwable v0) {
	            throw v0;
	        }
	    }
	
	
	    private void a(cjc[] p5)
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList();
	        int v2 = p5.length;
	        cxi v0_0 = 0;
	        while (v0_0 < v2) {
	            v1_1.add(p5[v0_0]);
	            v0_0++;
	        }
	        this.a().a(v1_1);
	        return;
	    }
	
	
	    private boolean d(String p4)
	    {
	        boolean v0_5;
	        boolean v0_0 = this.a();
	        if (v0_0) {
	            try {
	                v0_5 = cyh.d(((cje) v0_0.b(p4).a)).booleanValue();
	            } catch (boolean v0_6) {
	                cuh.a(new StringBuilder("Calling getBoolean() threw an exception: ").append(v0_6.getMessage()).append(" Returning default value.").toString());
	                v0_5 = cyh.c().booleanValue();
	            }
	        } else {
	            cuh.a("getBoolean called for closed container.");
	            v0_5 = cyh.c().booleanValue();
	        }
	        return v0_5;
	    }
	
	
	    declared_synchronized cxi a()
	    {
	        try {
	            return this.a;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public final String a(String p4)
	    {
	        String v0_4;
	        String v0_0 = this.a();
	        if (v0_0 != null) {
	            try {
	                v0_4 = cyh.a(((cje) v0_0.b(p4).a));
	            } catch (String v0_5) {
	                cuh.a(new StringBuilder("Calling getString() threw an exception: ").append(v0_5.getMessage()).append(" Returning default value.").toString());
	                v0_4 = cyh.e();
	            }
	        } else {
	            cuh.a("getString called for closed container.");
	            v0_4 = cyh.e();
	        }
	        return v0_4;
	    }
	
	
	    final s b(String p3)
	    {
	        try {
	            return ((s) this.f.get(p3));
	        } catch (Throwable v0_3) {
	            throw v0_3;
	        }
	    }
	
	
	    final s c(String p3)
	    {
	        try {
	            return ((s) this.g.get(p3));
	        } catch (Throwable v0_3) {
	            throw v0_3;
	        }
	    }
	
