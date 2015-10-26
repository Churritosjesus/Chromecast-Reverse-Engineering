	private synthetic java.util.Map a
	private synthetic  b
	private synthetic java.lang.String c
	private synthetic  d
	private synthetic  e
	private synthetic  f
	private synthetic java.lang.String g
	private synthetic bps h
	
	    bpt(bps p2, java.util.Map p3, boolean p4, String p5, long p6, boolean p8, boolean p9, String p10)
	    {
	        this.h = p2;
	        this.a = p3;
	        this.b = p4;
	        this.c = p5;
	        this.d = p6;
	        this.e = p8;
	        this.f = p9;
	        this.g = p10;
	        return;
	    }
	
	
	    public final void run()
	    {
	        bsi v11 = 1;
	        if (this.h.c.b()) {
	            this.a.put("sc", "start");
	        }
	        bqu v0_4 = this.a;
	        java.util.Map v3_3 = this.h.d.d();
	        a.h("getClientId can not be called from the main thread");
	        bqs.b(v0_4, "cid", v3_3.a.g().b());
	        if (this.a.get("&sf") == null) {
	            bqu v0_15 = bps.a(this.h);
	            if (!this.b) {
	                this.a.remove("ate");
	                this.a.remove("adid");
	            } else {
	                bqs.a(this.a, "ate", v0_15.b());
	                bqs.a(this.a, "adid", v0_15.c());
	            }
	            bqu v0_31;
	            bqu v0_21 = bps.b(this.h).b();
	            bqs.a(this.a, "an", v0_21.a);
	            bqs.a(this.a, "av", v0_21.b);
	            bqs.a(this.a, "aid", v0_21.c);
	            bqs.a(this.a, "aiid", v0_21.d);
	            this.a.put("v", "1");
	            this.a.put("_v", "ma4.5.0");
	            bqs.a(this.a, "ul", bps.c(this.h).b().a);
	            bqs.a(this.a, "sr", bps.d(this.h).c());
	            if ((!this.c.equals("transaction")) && (!this.c.equals("item"))) {
	                v0_31 = 0;
	            } else {
	                v0_31 = 1;
	            }
	            if ((v0_31 != null) || (this.h.b.a())) {
	                long v4_6 = bqs.a(((String) this.a.get("ht")));
	                if (v4_6 == 0) {
	                    v4_6 = this.d;
	                }
	                if (!this.e) {
	                    String v9_1 = ((String) this.a.get("cid"));
	                    java.util.HashMap v14_1 = new java.util.HashMap();
	                    bqs.a(v14_1, "uid", this.a);
	                    bqs.a(v14_1, "an", this.a);
	                    bqs.a(v14_1, "aid", this.a);
	                    bqs.a(v14_1, "av", this.a);
	                    bqs.a(v14_1, "aiid", this.a);
	                    if (android.text.TextUtils.isEmpty(((CharSequence) this.a.get("adid")))) {
	                        v11 = 0;
	                    }
	                    this.a.put("_s", String.valueOf(bps.g(this.h).a(new bre(0, v9_1, this.g, v11, 0, v14_1))));
	                    bps.h(this.h).a(new bsi(this.h, this.a, v4_6, this.f));
	                } else {
	                    bps.f(this.h).c("Dry run enabled. Would have sent hit", new bsi(this.h, this.a, v4_6, this.f));
	                }
	            } else {
	                bps.e(this.h).a(this.a, "Too many hits sent too quickly, rate limiting invoked");
	            }
	        } else {
	            bps v2_5 = bqs.a(((String) this.a.get("&sf")), 100.0);
	            if (!bqs.a(v2_5, ((String) this.a.get("&cid")))) {
	            } else {
	                this.h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(v2_5));
	            }
	        }
	        return;
	    }
	
