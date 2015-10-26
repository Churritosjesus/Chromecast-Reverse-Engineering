	public  a
	final bqj b
	final bpu c
	private final java.util.Map e
	private final java.util.Map f
	
	    bps(brb p5, String p6, bqj p7)
	    {
	        this(p5);
	        this.e = new java.util.HashMap();
	        this.f = new java.util.HashMap();
	        if (p6 != null) {
	            this.e.put("&tid", p6);
	        }
	        this.e.put("useSecure", "1");
	        this.e.put("&a", Integer.toString((new java.util.Random().nextInt(2147483647) + 1)));
	        this.b = new bqj("tracking");
	        this.c = new bpu(this, p5);
	        return;
	    }
	
	
	    static synthetic bqf a(bps p1)
	    {
	        return p1.d.f();
	    }
	
	
	    private static String a(java.util.Map$Entry p3)
	    {
	        String v0_3;
	        String v0_1 = ((String) p3.getKey());
	        p3.getValue();
	        if ((v0_1.startsWith("&")) && (v0_1.length() >= 2)) {
	            v0_3 = 1;
	        } else {
	            v0_3 = 0;
	        }
	        String v0_6;
	        if (v0_3 != null) {
	            v0_6 = ((String) p3.getKey()).substring(1);
	        } else {
	            v0_6 = 0;
	        }
	        return v0_6;
	    }
	
	
	    private void a(String p2, String p3)
	    {
	        a.f(p2, "Key should be non-null");
	        if (!android.text.TextUtils.isEmpty(p2)) {
	            this.e.put(p2, p3);
	        }
	        return;
	    }
	
	
	    private static void a(java.util.Map p3, java.util.Map p4)
	    {
	        a.c(p4);
	        if (p3 != null) {
	            java.util.Iterator v1 = p3.entrySet().iterator();
	            while (v1.hasNext()) {
	                Object v0_3 = ((java.util.Map$Entry) v1.next());
	                String v2 = bps.a(v0_3);
	                if (v2 != null) {
	                    p4.put(v2, v0_3.getValue());
	                }
	            }
	        }
	        return;
	    }
	
	
	    static synthetic brm b(bps p1)
	    {
	        return p1.d.h();
	    }
	
	
	    private static void b(java.util.Map p4, java.util.Map p5)
	    {
	        a.c(p5);
	        if (p4 != null) {
	            java.util.Iterator v1 = p4.entrySet().iterator();
	            while (v1.hasNext()) {
	                Object v0_3 = ((java.util.Map$Entry) v1.next());
	                String v2 = bps.a(v0_3);
	                if ((v2 != null) && (!p5.containsKey(v2))) {
	                    p5.put(v2, v0_3.getValue());
	                }
	            }
	        }
	        return;
	    }
	
	
	    static synthetic bsd c(bps p1)
	    {
	        return p1.d.h;
	    }
	
	
	    static synthetic bsd d(bps p1)
	    {
	        return p1.d.h;
	    }
	
	
	    static synthetic bql e(bps p1)
	    {
	        return p1.d.a();
	    }
	
	
	    static synthetic bql f(bps p1)
	    {
	        return p1.d.a();
	    }
	
	
	    static synthetic bqu g(bps p1)
	    {
	        return p1.d.c();
	    }
	
	
	    static synthetic bqu h(bps p1)
	    {
	        return p1.d.c();
	    }
	
	
	    protected final void a()
	    {
	        this.c.s();
	        String v0_3 = this.d.e().c();
	        if (v0_3 != null) {
	            this.a("&an", v0_3);
	        }
	        String v0_6 = this.d.e().b();
	        if (v0_6 != null) {
	            this.a("&av", v0_6);
	        }
	        return;
	    }
	
	
	    public final void a(java.util.Map p12)
	    {
	        long v6 = this.d.c.a();
	        if (!this.d.d().e) {
	            boolean v8 = this.d.d().d;
	            java.util.HashMap v3_1 = new java.util.HashMap();
	            bps.a(this.e, v3_1);
	            bps.a(p12, v3_1);
	            boolean v9 = bqs.a(((String) this.e.get("useSecure")), 1);
	            bps.b(this.f, v3_1);
	            this.f.clear();
	            String v5_1 = ((String) v3_1.get("t"));
	            if (!android.text.TextUtils.isEmpty(v5_1)) {
	                String v10_1 = ((String) v3_1.get("tid"));
	                if (!android.text.TextUtils.isEmpty(v10_1)) {
	                    boolean v4 = this.a;
	                    if (("screenview".equalsIgnoreCase(v5_1)) || (("pageview".equalsIgnoreCase(v5_1)) || (("appview".equalsIgnoreCase(v5_1)) || (android.text.TextUtils.isEmpty(v5_1))))) {
	                        cox v0_28 = (Integer.parseInt(((String) this.e.get("&a"))) + 1);
	                        if (v0_28 >= 2147483647) {
	                            v0_28 = 1;
	                        }
	                        this.e.put("&a", Integer.toString(v0_28));
	                    }
	                    this.d.b().a(new bpt(this, v3_1, v4, v5_1, v6, v8, v9, v10_1));
	                } else {
	                    this.d.a().a(v3_1, "Missing tracking id parameter");
	                }
	            } else {
	                this.d.a().a(v3_1, "Missing hit type parameter");
	            }
	        } else {
	            this.c("AppOptOut is set to true. Not sending Google Analytics hit");
	        }
	        return;
	    }
	
