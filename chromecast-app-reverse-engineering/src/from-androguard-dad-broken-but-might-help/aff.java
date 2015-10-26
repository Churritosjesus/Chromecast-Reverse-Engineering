	private static bridge aff d
	final afd a
	 afb b
	 java.util.Date c
	private final bk e
	private java.util.concurrent.atomic.AtomicBoolean f
	
	    private aff(bk p5, afd p6)
	    {
	        this.f = new java.util.concurrent.atomic.AtomicBoolean(0);
	        this.c = new java.util.Date(0);
	        ajp.a(p5, "localBroadcastManager");
	        ajp.a(p6, "accessTokenCache");
	        this.e = p5;
	        this.a = p6;
	        return;
	    }
	
	
	    static aff a()
	    {
	        if (aff.d == null) {
	            if (aff.d == null) {
	                aff.d = new aff(bk.a(afv.f()), new afd());
	            }
	        }
	        return aff.d;
	    }
	
	
	    static synthetic void a(aff p0)
	    {
	        p0.b();
	        return;
	    }
	
	
	    static synthetic java.util.concurrent.atomic.AtomicBoolean b(aff p1)
	    {
	        return p1.f;
	    }
	
	
	    void a(afb p5, boolean p6)
	    {
	        bk v0_0 = this.b;
	        this.b = p5;
	        this.f.set(0);
	        this.c = new java.util.Date(0);
	        if (p6) {
	            if (p5 == null) {
	                android.content.Context v1_3 = this.a;
	                v1_3.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
	                if (afv.c()) {
	                    v1_3.b().b();
	                }
	                aji.b(afv.f());
	            } else {
	                this.a.a(p5);
	            }
	        }
	        if (!aji.a(v0_0, p5)) {
	            android.content.Context v1_9 = new android.content.Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
	            v1_9.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", v0_0);
	            v1_9.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", p5);
	            this.e.a(v1_9);
	        }
	        return;
	    }
	
	
	    void b()
	    {
	        afb v1 = this.b;
	        if ((v1 != null) && (this.f.compareAndSet(0, 1))) {
	            ajp.a();
	            this.c = new java.util.Date();
	            java.util.HashSet v7_1 = new java.util.HashSet();
	            java.util.HashSet v8_1 = new java.util.HashSet();
	            java.util.concurrent.atomic.AtomicBoolean v9_1 = new java.util.concurrent.atomic.AtomicBoolean(0);
	            afk v6_1 = new afk();
	            aga[] v11 = new aga[2];
	            v11[0] = new aga(v1, "me/permissions", new android.os.Bundle(), agq.a, new afh(this, v9_1, v7_1, v8_1));
	            java.util.concurrent.atomic.AtomicBoolean v5_3 = new afi(this, v6_1);
	            aff v3_3 = new android.os.Bundle();
	            v3_3.putString("grant_type", "fb_extend_sso_token");
	            v11[1] = new aga(v1, "oauth/access_token", v3_3, agq.a, v5_3);
	            agm v10_1 = new agm(v11);
	            afj v2_4 = new afj(this, v1, v9_1, v6_1, v7_1, v8_1);
	            if (!v10_1.d.contains(v2_4)) {
	                v10_1.d.add(v2_4);
	            }
	            aga.b(v10_1);
	        }
	        return;
	    }
	
