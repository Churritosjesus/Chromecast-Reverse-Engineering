	private  a
	private final brk b
	private final bqn c
	private final bqm e
	private final brf f
	private  g
	private final bsb h
	private final bsb i
	private final bqr j
	private  k
	private  l
	
	    protected brn(brb p3, brd p4)
	    {
	        this(p3);
	        a.c(p4);
	        this.g = -0.0;
	        this.e = new bqm(p3);
	        this.b = new brk(p3);
	        this.c = new bqn(p3);
	        this.f = brd.d(p3);
	        this.j = new bqr(this.k());
	        this.h = new bro(this, p3);
	        this.i = new brp(this, p3);
	        return;
	    }
	
	
	    private void a(bre p10, cpf p11)
	    {
	        a.c(p10);
	        a.c(p11);
	        cou v1_1 = new bpd(this.d);
	        coz v2_0 = p10.c;
	        a.f(v2_0);
	        coy v3_0 = bpi.a(v2_0);
	        String v4_0 = v1_1.h.i.listIterator();
	        while (v4_0.hasNext()) {
	            if (v3_0.equals(((cpd) v4_0.next()).a())) {
	                v4_0.remove();
	            }
	        }
	        v1_1.h.i.add(new bpi(v1_1.a, v2_0));
	        v1_1.b = p10.d;
	        cou v5 = v1_1.a();
	        IllegalStateException v0_9 = ((bpy) v5.b(bpy));
	        v0_9.a = "data";
	        v0_9.g = 1;
	        v5.a(p11);
	        cou v1_5 = ((bpx) v5.b(bpx));
	        coz v2_3 = ((cpe) v5.b(cpe));
	        java.util.Iterator v6 = p10.f.entrySet().iterator();
	        while (v6.hasNext()) {
	            coy v3_9 = ((java.util.Map$Entry) v6.next());
	            String v4_4 = ((String) v3_9.getKey());
	            coy v3_11 = ((String) v3_9.getValue());
	            if (!"an".equals(v4_4)) {
	                if (!"av".equals(v4_4)) {
	                    if (!"aid".equals(v4_4)) {
	                        if (!"aiid".equals(v4_4)) {
	                            if (!"uid".equals(v4_4)) {
	                                a.f(v4_4);
	                                if ((v4_4 != null) && (v4_4.startsWith("&"))) {
	                                    v4_4 = v4_4.substring(1);
	                                }
	                                a.a(v4_4, "Name can not be empty or \"&\"");
	                                v1_5.a.put(v4_4, v3_11);
	                            } else {
	                                v0_9.c = v3_11;
	                            }
	                        } else {
	                            v2_3.d = v3_11;
	                        }
	                    } else {
	                        v2_3.c = v3_11;
	                    }
	                } else {
	                    v2_3.b = v3_11;
	                }
	            } else {
	                v2_3.a = v3_11;
	            }
	        }
	        this.b("Sending installation campaign to", p10.c, p11);
	        v5.e = this.o().b();
	        IllegalStateException v0_13 = v5.b();
	        if (!v5.g) {
	            if (!v5.c) {
	                cou v1_9 = v5.a();
	                v1_9.f = v1_9.b.b();
	                if (v1_9.e == 0) {
	                    v1_9.d = v1_9.b.a();
	                } else {
	                    v1_9.d = v1_9.e;
	                }
	                v1_9.c = 1;
	                v0_13.b.execute(new coy(v0_13, v1_9));
	                return;
	            } else {
	                throw new IllegalStateException("Measurement can only be submitted once");
	            }
	        } else {
	            throw new IllegalStateException("Measurement prototype can\'t be submitted");
	        }
	    }
	
	
	    static synthetic void a(brn p4)
	    {
	        try {
	            p4.b.f();
	            p4.g();
	        } catch (bsb v0_1) {
	            p4.d("Failed to delete stale hits", v0_1);
	        }
	        p4.i.a(86400000);
	        return;
	    }
	
	
	    private boolean g(String p2)
	    {
	        int v0_2;
	        if (this.l().checkCallingOrSelfPermission(p2) != 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    private void h()
	    {
	        if ((!this.l) && ((brz.b()) && ((!this.f.b()) && (this.j.a(((Long) bqd.C.a()).longValue()))))) {
	            this.j.a();
	            this.b("Connecting to service");
	            if (this.f.c()) {
	                this.b("Connected to service");
	                this.j.a = 0;
	                this.e();
	            }
	        }
	        return;
	    }
	
	
	    private boolean i()
	    {
	        android.database.sqlite.SQLiteException v0_4;
	        String v1_0 = 1;
	        cox.b();
	        this.r();
	        this.b("Dispatching a batch of local hits");
	        if ((this.f.b()) || (byk.a)) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        if (this.c.b()) {
	            v1_0 = 0;
	        }
	        if ((v0_4 == null) || (v1_0 == null)) {
	            Integer v3_3 = new java.util.ArrayList();
	            long v4_0 = 0;
	            try {
	                while(true) {
	                    this.b.b();
	                    v3_3.clear();
	                    java.util.List v8 = this.b.a(((long) Math.max(brz.f(), brz.g())));
	                    if (!v8.isEmpty()) {
	                        this.a("Hits loaded from store. count", Integer.valueOf(v8.size()));
	                        String v1_4 = v8.iterator();
	                        while (v1_4.hasNext()) {
	                            if (((bsi) v1_4.next()).c == v4_0) {
	                                this.d("Database contains successfully uploaded hit", Long.valueOf(v4_0), Integer.valueOf(v8.size()));
	                                this.v();
	                                try {
	                                    this.b.c();
	                                    this.b.d();
	                                } catch (android.database.sqlite.SQLiteException v0_46) {
	                                    this.e("Failed to commit local dispatch transaction", v0_46);
	                                    this.v();
	                                }
	                            }
	                        }
	                        if ((this.f.b()) && (!byk.a)) {
	                            this.b("Service connected, sending hits to the service");
	                            while (!v8.isEmpty()) {
	                                android.database.sqlite.SQLiteException v0_19 = ((bsi) v8.get(0));
	                                if (!this.f.a(v0_19)) {
	                                    break;
	                                }
	                                v4_0 = Math.max(v4_0, v0_19.c);
	                                v8.remove(v0_19);
	                                this.b("Hit sent do device AnalyticsService for delivery", v0_19);
	                                try {
	                                    this.b.b(v0_19.c);
	                                    v3_3.add(Long.valueOf(v0_19.c));
	                                } catch (android.database.sqlite.SQLiteException v0_36) {
	                                    this.e("Failed to remove hit that was send for delivery", v0_36);
	                                    this.v();
	                                    try {
	                                        this.b.c();
	                                        this.b.d();
	                                    } catch (android.database.sqlite.SQLiteException v0_39) {
	                                        this.e("Failed to commit local dispatch transaction", v0_39);
	                                        this.v();
	                                    }
	                                    return 0;
	                                }
	                            }
	                        }
	                        android.database.sqlite.SQLiteException v0_20 = v4_0;
	                        if (this.c.b()) {
	                            java.util.List v9 = this.c.a(v8);
	                            long v10_0 = v9.iterator();
	                            long v4_4 = v0_20;
	                            while (v10_0.hasNext()) {
	                                v4_4 = Math.max(v4_4, ((Long) v10_0.next()).longValue());
	                            }
	                            v8.removeAll(v9);
	                            try {
	                                this.b.a(v9);
	                                v3_3.addAll(v9);
	                                v0_20 = v4_4;
	                            } catch (android.database.sqlite.SQLiteException v0_23) {
	                                this.e("Failed to remove successfully uploaded hits", v0_23);
	                                this.v();
	                                try {
	                                    this.b.c();
	                                    this.b.d();
	                                } catch (android.database.sqlite.SQLiteException v0_26) {
	                                    this.e("Failed to commit local dispatch transaction", v0_26);
	                                    this.v();
	                                }
	                                return 0;
	                            }
	                        }
	                        if (!v3_3.isEmpty()) {
	                            break;
	                        }
	                        try {
	                            this.b.c();
	                            this.b.d();
	                        } catch (android.database.sqlite.SQLiteException v0_30) {
	                            this.e("Failed to commit local dispatch transaction", v0_30);
	                            this.v();
	                        }
	                    } else {
	                        this.b("Store is empty, nothing to dispatch");
	                        this.v();
	                        try {
	                            this.b.c();
	                            this.b.d();
	                        } catch (android.database.sqlite.SQLiteException v0_56) {
	                            this.e("Failed to commit local dispatch transaction", v0_56);
	                            this.v();
	                        }
	                    }
	                }
	                try {
	                    this.b.c();
	                    this.b.d();
	                    v4_0 = v0_20;
	                } catch (android.database.sqlite.SQLiteException v0_27) {
	                    this.e("Failed to commit local dispatch transaction", v0_27);
	                    this.v();
	                }
	            } catch (android.database.sqlite.SQLiteException v0_52) {
	                try {
	                    this.b.c();
	                    this.b.d();
	                    throw v0_52;
	                } catch (android.database.sqlite.SQLiteException v0_53) {
	                    this.e("Failed to commit local dispatch transaction", v0_53);
	                    this.v();
	                }
	            }
	            try {
	            } catch (android.database.sqlite.SQLiteException v0_48) {
	                this.d("Failed to read hits from persisted store", v0_48);
	                this.v();
	                try {
	                    this.b.c();
	                    this.b.d();
	                } catch (android.database.sqlite.SQLiteException v0_51) {
	                    this.e("Failed to commit local dispatch transaction", v0_51);
	                    this.v();
	                }
	            }
	        } else {
	            this.b("No network or service available. Will retry later");
	        }
	        return 0;
	    }
	
	
	    private long t()
	    {
	        cox.b();
	        this.r();
	        try {
	            long v0_1 = this.b.g();
	        } catch (long v0_2) {
	            this.e("Failed to get min/max hit times from local store", v0_2);
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    private void u()
	    {
	        bse v1 = this.n();
	        if ((v1.a) && (!v1.b)) {
	            Long v2_0 = this.t();
	            if ((v2_0 != 0) && (Math.abs((this.k().a() - v2_0)) <= ((Long) bqd.h.a()).longValue())) {
	                this.a("Dispatch alarm scheduled (ms)", Long.valueOf(brz.e()));
	                v1.b();
	            }
	        }
	        return;
	    }
	
	
	    private void v()
	    {
	        if (this.h.b()) {
	            this.b("All hits dispatched or no network/service. Going to power save mode");
	        }
	        this.h.c();
	        bse v0_4 = this.n();
	        if (v0_4.b) {
	            v0_4.c();
	        }
	        return;
	    }
	
	
	    private long w()
	    {
	        long v0_5;
	        if (this.g == -0.0) {
	            v0_5 = ((Long) bqd.e.a()).longValue();
	            if (this.d.e().f()) {
	                v0_5 = (((long) this.d.e().g()) * 1000);
	            }
	        } else {
	            v0_5 = this.g;
	        }
	        return v0_5;
	    }
	
	
	    private void x()
	    {
	        this.r();
	        brb.i();
	        this.l = 1;
	        this.f.d();
	        this.g();
	        return;
	    }
	
	
	    public final long a(bre p6, boolean p7)
	    {
	        a.c(p6);
	        this.r();
	        brb.i();
	        try {
	            this.b.b();
	            this.b.a(p6.a, p6.b);
	            long v0_3 = this.b.a(p6.a, p6.b, p6.c);
	            p6.e = (1 + v0_3);
	            this.b.a(p6);
	            this.b.c();
	        } catch (long v0_4) {
	            this.e("Failed to update Analytics property", v0_4);
	            try {
	                this.b.d();
	            } catch (long v0_6) {
	                this.e("Failed to end transaction", v0_6);
	            }
	            v0_3 = -1;
	            return v0_3;
	        } catch (long v0_7) {
	            try {
	                this.b.d();
	            } catch (String v1_5) {
	                this.e("Failed to end transaction", v1_5);
	            }
	            throw v0_7;
	        }
	        try {
	            this.b.d();
	        } catch (String v2_8) {
	            this.e("Failed to end transaction", v2_8);
	        }
	        return v0_3;
	    }
	
	
	    protected final void a()
	    {
	        this.b.s();
	        this.c.s();
	        this.f.s();
	        return;
	    }
	
	
	    protected final void a(bre p5)
	    {
	        brb.i();
	        this.b("Sending first hit to property", p5.c);
	        if (!this.o().c().a(brz.l())) {
	            cpf v0_5 = this.o().f();
	            if (!android.text.TextUtils.isEmpty(v0_5)) {
	                cpf v0_6 = bqs.a(this.d.a(), v0_5);
	                this.b("Found relevant installation campaign", v0_6);
	                this.a(p5, v0_6);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(bsf p3)
	    {
	        this.a(p3, this.k);
	        return;
	    }
	
	
	    public final void a(bsf p7, long p8)
	    {
	        cox.b();
	        this.r();
	        android.content.Context v0_0 = -1;
	        int v2_1 = this.o().d();
	        if (v2_1 != 0) {
	            v0_0 = Math.abs((this.k().a() - v2_1));
	        }
	        this.b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(v0_0));
	        if (!byk.a) {
	            this.h();
	        }
	        try {
	            this.i();
	            this.o().e();
	            this.g();
	        } catch (android.content.Context v0_11) {
	            this.e("Local dispatch failed", v0_11);
	            this.o().e();
	            this.g();
	            if (p7 == null) {
	                return;
	            } else {
	                p7.a();
	                return;
	            }
	        }
	        if (p7 != null) {
	            p7.a();
	        }
	        if ((this.k == p8) || (android.os.Build$VERSION.SDK_INT <= 10)) {
	            return;
	        } else {
	            android.content.Context v0_10 = this.e.c();
	            android.content.Intent v1_2 = new android.content.Intent("com.google.analytics.RADIO_POWERED");
	            v1_2.addCategory(v0_10.getPackageName());
	            v1_2.putExtra(bqm.a, 1);
	            v0_10.sendOrderedBroadcast(v1_2, 0);
	            return;
	        }
	    }
	
	
	    public final void a(bsi p11)
	    {
	        a.c(p11);
	        cox.b();
	        this.r();
	        if (!this.l) {
	            this.a("Delivering hit", p11);
	        } else {
	            this.c("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
	        }
	        if (android.text.TextUtils.isEmpty(p11.a("_m", ""))) {
	            String v1_1 = this.o().b.a();
	            if (v1_1 != null) {
	                bql v0_13 = new StringBuilder().append(((Long) v1_1.second)).append(":").append(((String) v1_1.first)).toString();
	                java.util.HashMap v2_4 = new java.util.HashMap(p11.a);
	                v2_4.put("_m", v0_13);
	                p11 = new bsi(this, v2_4, p11.d, p11.f, p11.c, p11.e, p11.b);
	            }
	        }
	        this.h();
	        if (!this.f.a(p11)) {
	            if (!byk.a) {
	                try {
	                    this.b.a(p11);
	                    this.g();
	                } catch (bql v0_20) {
	                    this.e("Delivery failed to save hit to a database", v0_20);
	                    this.d.a().a(p11, "deliver: failed to insert hit to database");
	                }
	            } else {
	                this.d.a().a(p11, "Service unavailable on package side");
	            }
	        } else {
	            this.c("Hit sent to the device AnalyticsService for delivery");
	        }
	        return;
	    }
	
	
	    public final void a(String p5)
	    {
	        a.f(p5);
	        brb.i();
	        this.j();
	        String v1_0 = bqs.a(this.d.a(), p5);
	        if (v1_0 != null) {
	            bre v0_3 = this.o().f();
	            if (!p5.equals(v0_3)) {
	                if (android.text.TextUtils.isEmpty(v0_3)) {
	                    this.o().a(p5);
	                    if (!this.o().c().a(brz.l())) {
	                        this.b("Received installation campaign", v1_0);
	                        java.util.Iterator v2_4 = this.b.c(0).iterator();
	                        while (v2_4.hasNext()) {
	                            this.a(((bre) v2_4.next()), v1_0);
	                        }
	                    } else {
	                        this.d("Campaign received too late, ignoring", v1_0);
	                    }
	                } else {
	                    this.d("Ignoring multiple install campaigns. original, new", v0_3, p5);
	                }
	            } else {
	                this.e("Ignoring duplicate install campaign");
	            }
	        } else {
	            this.d("Parsing failed. Ignoring invalid campaign data", p5);
	        }
	        return;
	    }
	
	
	    final void b()
	    {
	        String v0_1;
	        this.r();
	        if (this.a) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        a.a(v0_1, "Analytics backend already started");
	        this.a = 1;
	        if (!byk.a) {
	            String v0_4 = this.d.a;
	            if (bpe.a(v0_4)) {
	                if (!bpf.a(v0_4)) {
	                    this.f("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
	                }
	            } else {
	                this.e("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
	            }
	            if (bpj.a(v0_4)) {
	                if (!bpk.a(v0_4)) {
	                    this.e("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
	                }
	            } else {
	                this.e("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
	            }
	        }
	        this.d.b().a(new brq(this));
	        return;
	    }
	
	
	    protected final void c()
	    {
	        this.r();
	        this.o().b();
	        if (!this.g("android.permission.ACCESS_NETWORK_STATE")) {
	            this.f("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
	            this.x();
	        }
	        if (!this.g("android.permission.INTERNET")) {
	            this.f("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
	            this.x();
	        }
	        if (!bpf.a(this.l())) {
	            if (!byk.a) {
	                this.e("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
	            } else {
	                this.f("Device AnalyticsService not registered! Hits will not be delivered reliably.");
	            }
	        } else {
	            this.b("AnalyticsService registered in the app manifest and enabled");
	        }
	        if ((!this.l) && ((!byk.a) && (!this.b.e()))) {
	            this.h();
	        }
	        this.g();
	        return;
	    }
	
	
	    final void d()
	    {
	        brb.i();
	        this.k = this.k().a();
	        return;
	    }
	
	
	    protected final void e()
	    {
	        brb.i();
	        if (!byk.a) {
	            cox.b();
	            this.r();
	            this.j();
	            if (!brz.b()) {
	                this.e("Service client disabled. Can\'t dispatch local hits to device AnalyticsService");
	            }
	            if (this.f.b()) {
	                if (!this.b.e()) {
	                    this.b("Dispatching local hits to device AnalyticsService");
	                    try {
	                        while(true) {
	                            String v1_1 = this.b.a(((long) brz.f()));
	                            this.e("Failed to remove hit that was send for delivery", android.database.sqlite.SQLiteException v0_15);
	                            this.v();
	                        }
	                        this.g();
	                    } catch (android.database.sqlite.SQLiteException v0_10) {
	                        this.e("Failed to read hits from store", v0_10);
	                        this.v();
	                    }
	                    if (v1_1.isEmpty()) {
	                        this.g();
	                        return;
	                    }
	                    while (!v1_1.isEmpty()) {
	                        android.database.sqlite.SQLiteException v0_14 = ((bsi) v1_1.get(0));
	                        if (this.f.a(v0_14)) {
	                            v1_1.remove(v0_14);
	                            try {
	                                this.b.b(v0_14.c);
	                            } catch (android.database.sqlite.SQLiteException v0_15) {
	                            }
	                        }
	                    }
	                }
	            } else {
	                this.b("Service not connected");
	            }
	        }
	        return;
	    }
	
	
	    public final void f()
	    {
	        cox.b();
	        this.r();
	        this.b("Service disconnected");
	        return;
	    }
	
	
	    public final void g()
	    {
	        bql v0_5;
	        boolean v4 = 0;
	        brb.i();
	        this.r();
	        if (((this.l) || ((byk.a) && (!this.m().a()))) || (this.w() <= 0)) {
	            v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        if (v0_5 != null) {
	            if (!this.b.e()) {
	                bql v0_12;
	                if (((Boolean) bqd.z.a()).booleanValue()) {
	                    v0_12 = 1;
	                } else {
	                    this.e.a();
	                    bql v0_14 = this.e;
	                    if (!v0_14.c) {
	                        v0_14.b.a().e("Connectivity unknown. Receiver not registered");
	                    }
	                    v0_12 = v0_14.d;
	                }
	                if (v0_12 == null) {
	                    this.v();
	                    this.u();
	                } else {
	                    bql v0_18;
	                    this.u();
	                    Long v2_2 = this.w();
	                    bql v0_16 = this.o().d();
	                    if (v0_16 == 0) {
	                        v0_18 = Math.min(brz.d(), v2_2);
	                    } else {
	                        v0_18 = (v2_2 - Math.abs((this.k().a() - v0_16)));
	                        if (v0_18 <= 0) {
	                            v0_18 = Math.min(brz.d(), v2_2);
	                        }
	                    }
	                    this.a("Dispatch scheduled (ms)", Long.valueOf(v0_18));
	                    if (!this.h.b()) {
	                        this.h.a(v0_18);
	                    } else {
	                        Long v2_10;
	                        Long v2_7 = this.h;
	                        if (v2_7.c != 0) {
	                            v2_10 = Math.abs((v2_7.a.c.a() - v2_7.c));
	                        } else {
	                            v2_10 = 0;
	                        }
	                        bql v0_23 = Math.max(1, (v0_18 + v2_10));
	                        Long v2_11 = this.h;
	                        if (v2_11.b()) {
	                            if (v0_23 >= 0) {
	                                bql v0_24 = (v0_23 - Math.abs((v2_11.a.c.a() - v2_11.c)));
	                                if (v0_24 >= 0) {
	                                    v4 = v0_24;
	                                }
	                                v2_11.d().removeCallbacks(v2_11.b);
	                                if (!v2_11.d().postDelayed(v2_11.b, v4)) {
	                                    v2_11.a.a().e("Failed to adjust delayed post. time", Long.valueOf(v4));
	                                }
	                            } else {
	                                v2_11.c();
	                            }
	                        }
	                    }
	                }
	            } else {
	                this.e.b();
	                this.v();
	            }
	        } else {
	            this.e.b();
	            this.v();
	        }
	        return;
	    }
	
