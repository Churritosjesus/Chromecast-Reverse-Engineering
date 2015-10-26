	static java.lang.String c
	private static final blp d
	private static java.lang.String h
	public final aow b
	private final android.content.Context e
	private final atf f
	private final btl g
	
	    static aqj()
	    {
	        aqj.d = new blp("BackdropCastConnection");
	        return;
	    }
	
	
	    public aqj(aow p7, android.content.Context p8, atf p9)
	    {
	        this(p7.b, p8);
	        try {
	            aqj.h = new org.json.JSONObject().put("requestId", "0").put("type", "GET_STATUS").toString();
	        } catch (btl v0_6) {
	            Object[] v3_0 = new Object[1];
	            v3_0[0] = v0_6.getMessage();
	            aqj.d.a("Could not create JSON status request message: %s", v3_0);
	        }
	        try {
	            aqj.c = new org.json.JSONObject().put("requestId", "0").put("type", "SETTINGS_UPDATED").toString();
	        } catch (btl v0_13) {
	            Object[] v3_1 = new Object[1];
	            v3_1[0] = v0_13.getMessage();
	            aqj.d.a("Could not create JSON refresh message: %s", v3_1);
	        }
	        this.b = p7;
	        this.e = p8;
	        this.f = p9;
	        aqi.a();
	        this.g = new btl();
	        return;
	    }
	
	
	    static synthetic void a(aqj p0)
	    {
	        p0.j();
	        return;
	    }
	
	
	    static synthetic aow b(aqj p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic btl c(aqj p1)
	    {
	        return p1.g;
	    }
	
	
	    static synthetic android.content.Context d(aqj p1)
	    {
	        return p1.e;
	    }
	
	
	    static synthetic blp h()
	    {
	        return aqj.d;
	    }
	
	
	    private void i()
	    {
	        String v1;
	        aow v2_0 = this.a();
	        if (v2_0 != null) {
	            v1 = v2_0.b;
	        } else {
	            v1 = "";
	        }
	        String v0_2;
	        if (v2_0 != null) {
	            v0_2 = v2_0.c;
	        } else {
	            v0_2 = "";
	        }
	        if (((!android.text.TextUtils.isEmpty(v1)) || (!this.b.c.h)) && (!android.text.TextUtils.equals(v1, this.b.o))) {
	            aow v2_9 = new Object[3];
	            v2_9[0] = v1;
	            v2_9[1] = v0_2;
	            v2_9[2] = this.b.g();
	            aqi.a();
	            this.b.b(v1, v0_2);
	        }
	        return;
	    }
	
	
	    private void j()
	    {
	        this.a("urn:x-cast:com.google.cast.sse", this);
	        if (aqj.h != null) {
	            aqi.a();
	            String v0_3 = new Object[1];
	            v0_3[0] = this.b.g();
	            this.a("urn:x-cast:com.google.cast.sse", aqj.h, 0);
	        }
	        return;
	    }
	
	
	    public final void a(double p2)
	    {
	        this.a(new aqr(this, p2));
	        return;
	    }
	
	
	    public final synthetic void a(bwm p6)
	    {
	        blp v0_1 = new Object[2];
	        v0_1[0] = Boolean.valueOf(((bst) p6).b().a());
	        v0_1[1] = this.b.g();
	        if (((bst) p6).b().a()) {
	            aqi.a();
	            this.f();
	        } else {
	            Object[] v2_1 = new Object[1];
	            v2_1[0] = ((bst) p6).b().g;
	            aqj.d.a("(6) Failed to connect to the backdrop app:  %s", v2_1);
	            aqi.a();
	        }
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.cast.ApplicationMetadata p7)
	    {
	        boolean v0_0;
	        if (p7 != null) {
	            v0_0 = p7.b;
	        } else {
	            v0_0 = 0;
	        }
	        Object[] v1_1 = new Object[3];
	        v1_1[0] = this.b.g();
	        v1_1[1] = this.b.o;
	        v1_1[2] = v0_0;
	        if (!android.text.TextUtils.equals(v0_0, this.b.o)) {
	            if (!v0_0) {
	                if (!this.b.c.h) {
	                    this.i();
	                }
	            } else {
	                this.i();
	                Object[] v1_5 = new Object[2];
	                v1_5[0] = v0_0;
	                v1_5[1] = this.b.g();
	                super.a(v0_0, this);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(String p9, String p10)
	    {
	        Object[] v0_0 = new Object[1];
	        v0_0[0] = this.b.g();
	        if (this.f != null) {
	            try {
	                Object[] v0_5 = ((org.json.JSONObject) new org.json.JSONTokener(p10).nextValue());
	                String v2_3 = v0_5.getString("backendData");
	            } catch (Object[] v0) {
	                int v3_0 = new Object[1];
	                v3_0[0] = p9;
	                aqj.d.a("Could not parse the returned data from %s", v3_0);
	                aqi.a();
	            }
	            try {
	                int v3_2 = new org.json.JSONArray(v0_5.getString("topicHistory"));
	                Object[] v0_9 = new Object[2];
	                v0_9[0] = this.b.g();
	                v0_9[1] = v3_2;
	            } catch (Object[] v0) {
	                String v4_7 = new Object[2];
	                v4_7[0] = p9;
	                v4_7[1] = this.b.g();
	                aqj.d.a("Could not parse the returned history data from %s for device: %s.", v4_7);
	                aqi.a();
	                Object[] v0_18 = this.f.a(v2_3, this.b);
	                aqi.a();
	                this.f.a(v0_18);
	                Object[] v0_19 = new Object[1];
	                v0_19[0] = this.b.g();
	            }
	            if (v3_2.length() <= 0) {
	            } else {
	                String v4_4 = new java.util.ArrayList(v3_2.length());
	                Object[] v0_12 = 0;
	                while (v0_12 < v3_2.length()) {
	                    v4_4.add(v3_2.getString(v0_12));
	                    v0_12++;
	                }
	                this.b.a(java.util.Collections.unmodifiableList(v4_4));
	                Object[] v0_15 = new Object[1];
	                v0_15[0] = this.b.g();
	            }
	        }
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        this.a(new aqp(this, p2));
	        return;
	    }
	
	
	    public final void e()
	    {
	        this.a(new aqs(this));
	        return;
	    }
	
	
	    public final void f()
	    {
	        aql v0_0 = this.a();
	        String v1_1 = this.b.o;
	        if (!"00000000-0000-0000-0000-000000000000".equals(v1_1)) {
	            if (!"E8C28D3C".equals(v1_1)) {
	                if (v0_0 != null) {
	                    aql v0_3;
	                    String v1_4 = this.g.c();
	                    if ((v0_0.e == null) || (!v0_0.e.contains(v1_4))) {
	                        v0_3 = 0;
	                    } else {
	                        v0_3 = 1;
	                    }
	                    if (v0_3 != null) {
	                        this.a(new aqm(this));
	                    }
	                    this.a(new aql(this));
	                }
	            } else {
	                this.j();
	            }
	        } else {
	            this.b.b(v1_1, "");
	            new android.os.Handler().postDelayed(new aqk(this), asr.a);
	        }
	        return;
	    }
	
	
	    public final void g()
	    {
	        this.b();
	        return;
	    }
	
