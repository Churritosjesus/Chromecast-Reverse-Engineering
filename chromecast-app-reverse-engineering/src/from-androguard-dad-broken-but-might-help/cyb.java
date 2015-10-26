	private static final java.lang.String b
	private static final java.lang.String c
	private static final java.lang.String d
	private static final java.lang.String e
	private static final java.lang.String f
	private final android.content.Context g
	private ctw h
	private final android.os.HandlerThread i
	private android.os.Handler j
	private final java.util.Set k
	
	    static cyb()
	    {
	        cyb.b = cip.Q.toString();
	        cyb.c = cit.B.toString();
	        cyb.d = cit.v.toString();
	        cyb.e = cit.y.toString();
	        cyb.f = cit.J.toString();
	        return;
	    }
	
	
	    public cyb(android.content.Context p5, ctw p6)
	    {
	        android.os.Looper v1_1 = new String[2];
	        v1_1[0] = cyb.d;
	        v1_1[1] = cyb.c;
	        this(cyb.b, v1_1);
	        this.k = new java.util.HashSet();
	        this.g = p5;
	        this.h = p6;
	        this.i = new android.os.HandlerThread("Google GTM SDK Timer", 10);
	        this.i.start();
	        this.j = new android.os.Handler(this.i.getLooper());
	        return;
	    }
	
	
	    static synthetic java.util.Set a(cyb p1)
	    {
	        return p1.k;
	    }
	
	
	    static synthetic ctw b(cyb p1)
	    {
	        return p1.h;
	    }
	
	
	    static synthetic android.os.Handler c(cyb p1)
	    {
	        return p1.j;
	    }
	
	
	    static synthetic boolean d(cyb p1)
	    {
	        return 0;
	    }
	
	
	    static synthetic boolean e(cyb p1)
	    {
	        return 0;
	    }
	
	
	    static synthetic android.content.Context f(cyb p1)
	    {
	        return p1.g;
	    }
	
	
	    public final cje a(java.util.Map p11)
	    {
	        String v2 = cyh.a(((cje) p11.get(cyb.c)));
	        String v3 = cyh.a(((cje) p11.get(cyb.f)));
	        cyb v1_0 = cyh.a(((cje) p11.get(cyb.d)));
	        cyc v0_12 = cyh.a(((cje) p11.get(cyb.e)));
	        try {
	            long v4 = Long.parseLong(v1_0);
	        } catch (cyb v1) {
	            v4 = 0;
	        }
	        try {
	            long v6 = Long.parseLong(v0_12);
	        } catch (cyc v0) {
	            v6 = 0;
	        }
	        if ((v4 > 0) && (!android.text.TextUtils.isEmpty(v2))) {
	            if ((v3 == null) || (v3.isEmpty())) {
	                v3 = "0";
	            }
	            if (!this.k.contains(v3)) {
	                if (!"0".equals(v3)) {
	                    this.k.add(v3);
	                }
	                this.j.postDelayed(new cyc(this, v2, v3, v4, v6), v4);
	            }
	        }
	        return cyh.f();
	    }
	
	
	    public final boolean a()
	    {
	        return 0;
	    }
	
