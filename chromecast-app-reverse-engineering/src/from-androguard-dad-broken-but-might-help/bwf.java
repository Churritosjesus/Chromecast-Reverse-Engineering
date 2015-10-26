	private final java.util.Set a
	private java.lang.String b
	private java.lang.String c
	private final java.util.Map d
	private final android.content.Context e
	private final java.util.Map f
	private  g
	private  h
	private android.os.Looper i
	private bwd j
	private final java.util.Set k
	private final java.util.Set l
	private clu m
	
	    public bwf(android.content.Context p3)
	    {
	        this.a = new java.util.HashSet();
	        this.d = new java.util.HashMap();
	        this.f = new java.util.HashMap();
	        this.g = -1;
	        this.h = -1;
	        this.k = new java.util.HashSet();
	        this.l = new java.util.HashSet();
	        this.m = new clu();
	        this.e = p3;
	        this.i = p3.getMainLooper();
	        this.b = p3.getPackageName();
	        this.c = p3.getClass().getName();
	        this.j = clp.a;
	        return;
	    }
	
	
	    public bwf(android.content.Context p2, bwg p3, bwh p4)
	    {
	        this(p2);
	        a.f(p3, "Must provide a connected listener");
	        this.k.add(p3);
	        a.f(p4, "Must provide a connection failed listener");
	        this.l.add(p4);
	        return;
	    }
	
	
	    public final bwf a(bvz p3)
	    {
	        this.f.put(p3, 0);
	        this.a.addAll(p3.a);
	        return this;
	    }
	
	
	    public final bwf a(bvz p3, bwb p4)
	    {
	        a.f(p4, "Null options are not permitted for this Api");
	        this.f.put(p3, p4);
	        this.a.addAll(p3.a);
	        return this;
	    }
	
	
	    public final bwf a(bwg p2)
	    {
	        this.k.add(p2);
	        return this;
	    }
	
	
	    public final bwf a(bwh p2)
	    {
	        this.l.add(p2);
	        return this;
	    }
	
	
	    public final byl a()
	    {
	        return new byl(0, this.a, this.d, 0, 0, this.b, this.c, this.m.a());
	    }
	
	
	    public final com.google.android.gms.common.api.GoogleApiClient b()
	    {
	        bxq v0_2;
	        int v11 = 1;
	        if (this.f.isEmpty()) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        bwz v1_2;
	        a.b(v0_2, "must call addApi() to add at least one API");
	        if (this.g < 0) {
	            if (this.h < 0) {
	                v1_2 = new bwz(this.e, this.i, this.a(), this.j, this.f, this.k, this.l, -1, -1);
	            } else {
	                bxq v0_5 = bxq.a(0);
	                if (v0_5.y == null) {
	                    v1_2 = 0;
	                } else {
	                    bwz v1_4 = v0_5.b(this.h);
	                    if (v1_4 == null) {
	                    } else {
	                        v1_2 = v1_4.e;
	                    }
	                }
	                if (v1_2 == null) {
	                    v1_2 = new bwz(this.e.getApplicationContext(), this.i, this.a(), this.j, this.f, this.k, this.l, -1, this.h);
	                }
	                int v2_4 = this.h;
	                a.f(v1_2, "GoogleApiClient instance cannot be null");
	                if (v0_5.a.indexOfKey(v2_4) >= 0) {
	                    v11 = 0;
	                }
	                a.a(v11, new StringBuilder("Already managing a GoogleApiClient with id ").append(v2_4).toString());
	                v0_5.a.put(v2_4, new bxs(v1_2, 0));
	                if (v0_5.y != null) {
	                    ar.a = 0;
	                    v0_5.h().a(v2_4, 0, v0_5);
	                }
	            }
	        } else {
	            int v10_2 = bxn.a(0);
	            bxq v0_7 = new bwz(this.e.getApplicationContext(), this.i, this.a(), this.j, this.f, this.k, this.l, this.g, -1);
	            bwz v1_8 = this.g;
	            a.f(v0_7, "GoogleApiClient instance cannot be null");
	            if (v10_2.c.indexOfKey(v1_8) >= 0) {
	                v11 = 0;
	            }
	            a.a(v11, new StringBuilder("Already managing a GoogleApiClient with id ").append(v1_8).toString());
	            v10_2.c.put(v1_8, new bxo(v10_2, v1_8, v0_7, 0));
	            if ((v10_2.a) && (!v10_2.b)) {
	                v0_7.b();
	            }
	            v1_2 = v0_7;
	        }
	        return v1_2;
	    }
	
