	private static final java.lang.String g
	public btj e
	public final java.util.List f
	private final buy h
	private final buy i
	private final buy j
	private final buy k
	private final buy l
	private final buy m
	private final buy n
	private final buy o
	private final buy p
	private final buy q
	
	    static buv()
	    {
	        buv.g = a.e("com.google.cast.media");
	        return;
	    }
	
	
	    public buv(String p9)
	    {
	        this(buv.g, "MediaControlChannel", p9, 1000);
	        this.h = new buy(86400000);
	        this.i = new buy(86400000);
	        this.j = new buy(86400000);
	        this.k = new buy(86400000);
	        this.l = new buy(86400000);
	        this.m = new buy(86400000);
	        this.n = new buy(86400000);
	        this.o = new buy(86400000);
	        this.p = new buy(86400000);
	        this.q = new buy(86400000);
	        this.f = new java.util.ArrayList();
	        this.f.add(this.h);
	        this.f.add(this.i);
	        this.f.add(this.j);
	        this.f.add(this.k);
	        this.f.add(this.l);
	        this.f.add(this.m);
	        this.f.add(this.n);
	        this.f.add(this.o);
	        this.f.add(this.p);
	        this.f.add(this.q);
	        this.f();
	        return;
	    }
	
	
	    private void a(long p6, org.json.JSONObject p8)
	    {
	        buy v0_5;
	        java.util.Iterator v1_0 = 1;
	        int v3_0 = this.h.a(p6);
	        if ((!this.l.b()) || (this.l.a(p6))) {
	            v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        if (((!this.m.b()) || (this.m.a(p6))) && ((!this.n.b()) || (this.n.a(p6)))) {
	            v1_0 = 0;
	        }
	        buy v0_6;
	        if (v0_5 == null) {
	            v0_6 = 0;
	        } else {
	            v0_6 = 2;
	        }
	        if (v1_0 != null) {
	            v0_6 |= 1;
	        }
	        if ((v3_0 == 0) && (this.e != null)) {
	            buy v0_7 = this.e.a(p8, v0_6);
	        } else {
	            this.e = new btj(p8);
	            android.os.SystemClock.elapsedRealtime();
	            v0_7 = 7;
	        }
	        if ((v0_7 & 1) != 0) {
	            android.os.SystemClock.elapsedRealtime();
	            this.a();
	        }
	        if ((v0_7 & 2) != 0) {
	            android.os.SystemClock.elapsedRealtime();
	            this.a();
	        }
	        if ((v0_7 & 4) != 0) {
	            this.b();
	        }
	        java.util.Iterator v1_5 = this.f.iterator();
	        while (v1_5.hasNext()) {
	            ((buy) v1_5.next()).a(p6, 0, 0);
	        }
	        return;
	    }
	
	
	    private long e()
	    {
	        if (this.e != null) {
	            return this.e.a;
	        } else {
	            throw new IllegalStateException("No current media session");
	        }
	    }
	
	
	    private void f()
	    {
	        this.e = 0;
	        java.util.Iterator v1 = this.f.iterator();
	        while (v1.hasNext()) {
	            Throwable v0_4 = ((buy) v1.next());
	            try {
	                if (v0_4.a != -1) {
	                    v0_4.a();
	                }
	            } catch (Throwable v0_5) {
	                throw v0_5;
	            }
	        }
	        return;
	    }
	
	
	    public final long a(bux p7)
	    {
	        String v0_1 = new org.json.JSONObject();
	        long v2 = this.d();
	        this.o.a(v2, p7);
	        this.a(1);
	        try {
	            v0_1.put("requestId", v2);
	            v0_1.put("type", "GET_STATUS");
	        } catch (int v1) {
	            this.a(v0_1.toString(), v2, 0);
	            return v2;
	        }
	        if (this.e == null) {
	            this.a(v0_1.toString(), v2, 0);
	            return v2;
	        } else {
	            v0_1.put("mediaSessionId", this.e.a);
	            this.a(v0_1.toString(), v2, 0);
	            return v2;
	        }
	    }
	
	
	    public final long a(bux p7, org.json.JSONObject p8)
	    {
	        String v0_1 = new org.json.JSONObject();
	        long v2 = this.d();
	        this.i.a(v2, p7);
	        this.a(1);
	        try {
	            v0_1.put("requestId", v2);
	            v0_1.put("type", "PAUSE");
	            v0_1.put("mediaSessionId", this.e());
	        } catch (int v1) {
	            this.a(v0_1.toString(), v2, 0);
	            return v2;
	        }
	        if (p8 == null) {
	            this.a(v0_1.toString(), v2, 0);
	            return v2;
	        } else {
	            v0_1.put("customData", p8);
	            this.a(v0_1.toString(), v2, 0);
	            return v2;
	        }
	    }
	
	
	    public void a()
	    {
	        return;
	    }
	
	
	    public final void a(String p9)
	    {
	        buy v0_0 = this.b;
	        String v2_0 = new Object[1];
	        v2_0[0] = p9;
	        v0_0.b("message received: %s", v2_0);
	        try {
	            buy v0_2 = new org.json.JSONObject(p9);
	            org.json.JSONObject v1_2 = v0_2.getString("type");
	            String v2_2 = v0_2.optLong("requestId", -1);
	        } catch (buy v0_17) {
	            org.json.JSONObject v1_18 = this.b;
	            Object[] v3_1 = new Object[2];
	            v3_1[0] = v0_17.getMessage();
	            v3_1[1] = p9;
	            v1_18.d("Message is malformed (%s); ignoring: %s", v3_1);
	            return;
	        }
	        if (!v1_2.equals("MEDIA_STATUS")) {
	            if (!v1_2.equals("INVALID_PLAYER_STATE")) {
	                if (!v1_2.equals("LOAD_FAILED")) {
	                    if (!v1_2.equals("LOAD_CANCELLED")) {
	                        if (!v1_2.equals("INVALID_REQUEST")) {
	                            return;
	                        } else {
	                            int v5_1 = new Object[0];
	                            this.b.d("received unexpected error: Invalid Request.", v5_1);
	                            org.json.JSONObject v1_6 = v0_2.optJSONObject("customData");
	                            java.util.Iterator v4_11 = this.f.iterator();
	                            while (v4_11.hasNext()) {
	                                ((buy) v4_11.next()).a(v2_2, 2100, v1_6);
	                            }
	                            return;
	                        }
	                    } else {
	                        this.h.a(v2_2, 2101, v0_2.optJSONObject("customData"));
	                        return;
	                    }
	                } else {
	                    this.h.a(v2_2, 2100, v0_2.optJSONObject("customData"));
	                    return;
	                }
	            } else {
	                int v5_4 = new Object[0];
	                this.b.d("received unexpected error: Invalid Player State.", v5_4);
	                org.json.JSONObject v1_13 = v0_2.optJSONObject("customData");
	                java.util.Iterator v4_15 = this.f.iterator();
	                while (v4_15.hasNext()) {
	                    ((buy) v4_15.next()).a(v2_2, 2100, v1_13);
	                }
	                return;
	            }
	        } else {
	            buy v0_13 = v0_2.getJSONArray("status");
	            if (v0_13.length() <= 0) {
	                this.e = 0;
	                this.a();
	                this.b();
	                this.o.a(v2_2, 0, 0);
	                return;
	            } else {
	                this.a(v2_2, v0_13.getJSONObject(0));
	                return;
	            }
	        }
	    }
	
	
	    protected final boolean a(long p6)
	    {
	        int v1_0 = this.f.iterator();
	        while (v1_0.hasNext()) {
	            ((buy) v1_0.next()).a(p6, 2102);
	        }
	        try {
	            java.util.Iterator v3 = this.f.iterator();
	        } catch (int v0_8) {
	            throw v0_8;
	        }
	        while (v3.hasNext()) {
	            if (((buy) v3.next()).b()) {
	                int v0_4 = 1;
	            }
	            return v0_4;
	        }
	        v0_4 = 0;
	        return v0_4;
	    }
	
	
	    public final long b(bux p7, org.json.JSONObject p8)
	    {
	        String v0_1 = new org.json.JSONObject();
	        long v2 = this.d();
	        this.j.a(v2, p7);
	        this.a(1);
	        try {
	            v0_1.put("requestId", v2);
	            v0_1.put("type", "PLAY");
	            v0_1.put("mediaSessionId", this.e());
	        } catch (int v1) {
	            this.a(v0_1.toString(), v2, 0);
	            return v2;
	        }
	        if (p8 == null) {
	            this.a(v0_1.toString(), v2, 0);
	            return v2;
	        } else {
	            v0_1.put("customData", p8);
	            this.a(v0_1.toString(), v2, 0);
	            return v2;
	        }
	    }
	
	
	    public void b()
	    {
	        return;
	    }
	
	
	    public final void c()
	    {
	        super.c();
	        this.f();
	        return;
	    }
	
