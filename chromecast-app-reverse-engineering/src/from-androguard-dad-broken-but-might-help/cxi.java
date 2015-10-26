	private static final cwj a
	private final clz b
	private final cvd c
	private final java.util.Map d
	private final java.util.Map e
	private final java.util.Map f
	private final cyt g
	private final cyt h
	private final java.util.Set i
	private final ctw j
	private final java.util.Map k
	private bridge java.lang.String l
	private  m
	
	    static cxi()
	    {
	        cxi.a = new cwj(cyh.f(), 1);
	        return;
	    }
	
	
	    public cxi(android.content.Context p10, clz p11, ctw p12, czd p13, czd p14, cvd p15)
	    {
	        if (p11 != null) {
	            this.b = p11;
	            this.i = new java.util.HashSet(p11.a);
	            this.j = p12;
	            this.c = p15;
	            this.g = new cyu().a(1048576, new cxj(this));
	            this.h = new cyu().a(1048576, new cxk(this));
	            this.d = new java.util.HashMap();
	            this.b(new cyq(p10));
	            this.b(new czc(p14));
	            this.b(new czm(p12));
	            this.b(new cuu(p10, p12));
	            this.b(new cyb(p10, p12));
	            this.e = new java.util.HashMap();
	            this.c(new cza());
	            this.c(new cvb());
	            this.c(new cue());
	            this.c(new cvg());
	            this.c(new cvh());
	            this.c(new cvx());
	            this.c(new cvy());
	            this.c(new cws());
	            this.c(new cxy());
	            this.f = new java.util.HashMap();
	            this.a(new cwa(p10));
	            this.a(new cww(p10));
	            this.a(new cyl(p10));
	            this.a(new cym(p10));
	            this.a(new cyn(p10));
	            this.a(new cyo(p10));
	            this.a(new cyp(p10));
	            this.a(new cyx());
	            this.a(new cyz(this.b.c));
	            this.a(new czc(p13));
	            this.a(new czf(p12));
	            this.a(new czn(p10));
	            this.a(new czo());
	            this.a(new cva());
	            this.a(new cve(this));
	            this.a(new cvi());
	            this.a(new cvj());
	            this.a(new cvq(p10));
	            this.a(new cvs());
	            this.a(new cug());
	            this.a(new cwd());
	            this.a(new cwf(p10));
	            this.a(new cwk());
	            this.a(new cwo());
	            this.a(new cwp());
	            this.a(new cwr());
	            this.a(new cwt(p10));
	            this.a(new cxq());
	            this.a(new cxr());
	            this.a(new cya());
	            this.a(new cyi());
	            this.k = new java.util.HashMap();
	            java.util.Map v5_0 = this.i.iterator();
	            while (v5_0.hasNext()) {
	                java.util.Map$Entry v2_4 = ((cmb) v5_0.next());
	                int v3_1 = 0;
	                while (v3_1 < v2_4.e.size()) {
	                    int v0_133 = ((clx) v2_4.e.get(v3_1));
	                    cxp v7_3 = cxi.a(this.k, cxi.a(v0_133));
	                    v7_3.a(v2_4);
	                    java.util.Map v1_25 = ((java.util.List) v7_3.b.get(v2_4));
	                    if (v1_25 == null) {
	                        v1_25 = new java.util.ArrayList();
	                        v7_3.b.put(v2_4, v1_25);
	                    }
	                    v1_25.add(v0_133);
	                    int v0_136 = ((java.util.List) v7_3.d.get(v2_4));
	                    if (v0_136 == 0) {
	                        v0_136 = new java.util.ArrayList();
	                        v7_3.d.put(v2_4, v0_136);
	                    }
	                    v0_136.add("Unknown");
	                    v3_1++;
	                }
	                int v3_2 = 0;
	                while (v3_2 < v2_4.f.size()) {
	                    int v0_125 = ((clx) v2_4.f.get(v3_2));
	                    cxp v7_1 = cxi.a(this.k, cxi.a(v0_125));
	                    v7_1.a(v2_4);
	                    java.util.Map v1_19 = ((java.util.List) v7_1.c.get(v2_4));
	                    if (v1_19 == null) {
	                        v1_19 = new java.util.ArrayList();
	                        v7_1.c.put(v2_4, v1_19);
	                    }
	                    v1_19.add(v0_125);
	                    int v0_128 = ((java.util.List) v7_1.e.get(v2_4));
	                    if (v0_128 == 0) {
	                        v0_128 = new java.util.ArrayList();
	                        v7_1.e.put(v2_4, v0_128);
	                    }
	                    v0_128.add("Unknown");
	                    v3_2++;
	                }
	            }
	            int v3_0 = this.b.b.entrySet().iterator();
	            while (v3_0.hasNext()) {
	                java.util.Map$Entry v2_2 = ((java.util.Map$Entry) v3_0.next());
	                java.util.Iterator v4_1 = ((java.util.List) v2_2.getValue()).iterator();
	                while (v4_1.hasNext()) {
	                    int v0_117 = ((clx) v4_1.next());
	                    if (!cyh.d(((cje) java.util.Collections.unmodifiableMap(v0_117.a).get(cit.C.toString()))).booleanValue()) {
	                        cxi.a(this.k, ((String) v2_2.getKey())).f = v0_117;
	                    }
	                }
	            }
	            return;
	        } else {
	            throw new NullPointerException("resource cannot be null");
	        }
	    }
	
	
	    private cwj a(cje p7, java.util.Set p8, cyj p9)
	    {
	        int v0_8;
	        if (p7.l) {
	            switch (p7.a) {
	                case 2:
	                    cje v3_2 = a.a(p7);
	                    int v0_52 = new cje[p7.c.length];
	                    v3_2.c = v0_52;
	                    int v1_14 = 0;
	                    while (v1_14 < p7.c.length) {
	                        int v0_58 = this.a(p7.c[v1_14], p8, p9.a());
	                        if (v0_58 != cxi.a) {
	                            v3_2.c[v1_14] = ((cje) v0_58.a);
	                            v1_14++;
	                        } else {
	                            v0_8 = cxi.a;
	                        }
	                    }
	                    v0_8 = new cwj(v3_2, 0);
	                    break;
	                case 3:
	                    cje v3_1 = a.a(p7);
	                    if (p7.d.length == p7.e.length) {
	                        int v0_31 = new cje[p7.d.length];
	                        v3_1.d = v0_31;
	                        int v0_34 = new cje[p7.d.length];
	                        v3_1.e = v0_34;
	                        int v1_11 = 0;
	                        while (v1_11 < p7.d.length) {
	                            int v0_40 = this.a(p7.d[v1_11], p8, p9.b());
	                            cje[] v4_6 = this.a(p7.e[v1_11], p8, p9.c());
	                            if ((v0_40 != cxi.a) && (v4_6 != cxi.a)) {
	                                v3_1.d[v1_11] = ((cje) v0_40.a);
	                                v3_1.e[v1_11] = ((cje) v4_6.a);
	                                v1_11++;
	                            } else {
	                                v0_8 = cxi.a;
	                            }
	                        }
	                        v0_8 = new cwj(v3_1, 0);
	                    } else {
	                        cuh.a(new StringBuilder("Invalid serving value: ").append(p7.toString()).toString());
	                        v0_8 = cxi.a;
	                    }
	                    break;
	                case 4:
	                    if (!p8.contains(p7.f)) {
	                        p8.add(p7.f);
	                        v0_8 = a.a(this.a(p7.f, p8, p9.e()), p7.k);
	                        p8.remove(p7.f);
	                    } else {
	                        cuh.a(new StringBuilder("Macro cycle detected.  Current macro reference: ").append(p7.f).append(".  Previous macro references: ").append(p8.toString()).append(".").toString());
	                        v0_8 = cxi.a;
	                    }
	                    break;
	                case 5:
	                case 6:
	                default:
	                    cuh.a(new StringBuilder("Unknown type: ").append(p7.a).toString());
	                    v0_8 = cxi.a;
	                    break;
	                case 7:
	                    cje v3_0 = a.a(p7);
	                    int v0_4 = new cje[p7.j.length];
	                    v3_0.j = v0_4;
	                    int v1_0 = 0;
	                    while (v1_0 < p7.j.length) {
	                        int v0_11 = this.a(p7.j[v1_0], p8, p9.d());
	                        if (v0_11 != cxi.a) {
	                            v3_0.j[v1_0] = ((cje) v0_11.a);
	                            v1_0++;
	                        } else {
	                            v0_8 = cxi.a;
	                        }
	                    }
	                    v0_8 = new cwj(v3_0, 0);
	                    break;
	            }
	        } else {
	            v0_8 = new cwj(p7, 1);
	        }
	        return v0_8;
	    }
	
	
	    private cwj a(clx p4, java.util.Set p5, cwu p6)
	    {
	        boolean v1_0 = this.a(this.e, p4, p5, p6);
	        Boolean v0_3 = cyh.d(((cje) v1_0.a));
	        cyh.a(v0_3);
	        return new cwj(v0_3, v1_0.b);
	    }
	
	
	    private cwj a(cmb p7, java.util.Set p8, cwy p9)
	    {
	        java.util.Iterator v4_0 = p7.b.iterator();
	        Boolean v3 = 1;
	        while (v4_0.hasNext()) {
	            cwj v5_3 = this.a(((clx) v4_0.next()), p8, p9.a());
	            if (!((Boolean) v5_3.a).booleanValue()) {
	                if ((v3 == null) || (!v5_3.b)) {
	                    Boolean v0_22 = 0;
	                } else {
	                    v0_22 = 1;
	                }
	                v3 = v0_22;
	            } else {
	                cyh.a(Boolean.valueOf(0));
	                Boolean v0_6 = new cwj(Boolean.valueOf(0), v5_3.b);
	            }
	            return v0_6;
	        }
	        java.util.Iterator v4_1 = p7.a.iterator();
	        while (v4_1.hasNext()) {
	            cwj v5_1 = this.a(((clx) v4_1.next()), p8, p9.b());
	            if (((Boolean) v5_1.a).booleanValue()) {
	                if ((v3 == null) || (!v5_1.b)) {
	                    Boolean v0_13 = 0;
	                } else {
	                    v0_13 = 1;
	                }
	                v3 = v0_13;
	            } else {
	                cyh.a(Boolean.valueOf(0));
	                v0_6 = new cwj(Boolean.valueOf(0), v5_1.b);
	            }
	            return v0_6;
	        }
	        cyh.a(Boolean.valueOf(1));
	        v0_6 = new cwj(Boolean.valueOf(1), v3);
	        return v0_6;
	    }
	
	
	    private cwj a(String p11, java.util.Set p12, cwe p13)
	    {
	        cwj v0_30;
	        this.m = (this.m + 1);
	        cwj v0_4 = ((cxo) this.h.a(p11));
	        if (v0_4 == null) {
	            cxp v8_1 = ((cxp) this.k.get(p11));
	            if (v8_1 != null) {
	                cyt v2_3;
	                int v1_1 = this.a(v8_1.a, v8_1.b, v8_1.d, v8_1.c, v8_1.e, p12, p13.b());
	                if (!((java.util.Set) v1_1.a).isEmpty()) {
	                    if (((java.util.Set) v1_1.a).size() > 1) {
	                        cuh.b(new StringBuilder().append(this.b()).append("Multiple macros active for macroName ").append(p11).toString());
	                    }
	                    v2_3 = ((clx) ((java.util.Set) v1_1.a).iterator().next());
	                } else {
	                    v2_3 = v8_1.f;
	                }
	                if (v2_3 != null) {
	                    cwj v0_29;
	                    cxo v3_2 = this.a(this.f, v2_3, p12, p13.a());
	                    if ((!v1_1.b) || (!v3_2.b)) {
	                        v0_29 = 0;
	                    } else {
	                        v0_29 = 1;
	                    }
	                    if (v3_2 != cxi.a) {
	                        v0_30 = new cwj(v3_2.a, v0_29);
	                    } else {
	                        v0_30 = cxi.a;
	                    }
	                    int v1_5 = v2_3.b;
	                    if (v0_30.b) {
	                        this.h.a(p11, new cxo(v0_30, v1_5));
	                    }
	                    this.a(v1_5, p12);
	                    this.m = (this.m - 1);
	                } else {
	                    this.m = (this.m - 1);
	                    v0_30 = cxi.a;
	                }
	            } else {
	                cuh.a(new StringBuilder().append(this.b()).append("Invalid macro: ").append(p11).toString());
	                this.m = (this.m - 1);
	                v0_30 = cxi.a;
	            }
	        } else {
	            this.a(v0_4.b, p12);
	            this.m = (this.m - 1);
	            v0_30 = v0_4.a;
	        }
	        return v0_30;
	    }
	
	
	    private cwj a(java.util.Map p11, clx p12, java.util.Set p13, cwu p14)
	    {
	        cwj v1_4;
	        cyt v0_3 = ((cje) java.util.Collections.unmodifiableMap(p12.a).get(cit.p.toString()));
	        if (v0_3 != null) {
	            String v5 = v0_3.g;
	            cyt v0_5 = ((cvf) p11.get(v5));
	            if (v0_5 != null) {
	                v1_4 = ((cwj) this.g.a(p12));
	                if (v1_4 == null) {
	                    java.util.HashMap v6_1 = new java.util.HashMap();
	                    int v4 = 1;
	                    java.util.Iterator v7 = java.util.Collections.unmodifiableMap(p12.a).entrySet().iterator();
	                    while (v7.hasNext()) {
	                        Object v3_1 = ((java.util.Map$Entry) v7.next());
	                        v3_1.getKey();
	                        cwj v2_5 = p14.a();
	                        cwj v1_21 = ((cje) v3_1.getValue());
	                        v3_1.getValue();
	                        cwj v8 = this.a(v1_21, p13, v2_5.a());
	                        if (v8 != cxi.a) {
	                            cwj v1_24;
	                            if (!v8.b) {
	                                v1_24 = 0;
	                            } else {
	                                p12.a.put(((String) v3_1.getKey()), ((cje) v8.a));
	                                v1_24 = v4;
	                            }
	                            v6_1.put(v3_1.getKey(), v8.a);
	                            v4 = v1_24;
	                        } else {
	                            v1_4 = cxi.a;
	                        }
	                    }
	                    if (v6_1.keySet().containsAll(v0_5.a)) {
	                        if ((v4 == 0) || (!v0_5.a())) {
	                            cwj v1_12 = 0;
	                        } else {
	                            v1_12 = 1;
	                        }
	                        cwj v2_2 = new cwj(v0_5.a(v6_1), v1_12);
	                        if (v1_12 != null) {
	                            this.g.a(p12, v2_2);
	                        }
	                        v1_4 = v2_2;
	                    } else {
	                        cuh.a(new StringBuilder("Incorrect keys for function ").append(v5).append(" required ").append(v0_5.b()).append(" had ").append(v6_1.keySet()).toString());
	                        v1_4 = cxi.a;
	                    }
	                }
	            } else {
	                cuh.a(new StringBuilder().append(v5).append(" has no backing implementation.").toString());
	                v1_4 = cxi.a;
	            }
	        } else {
	            cuh.a("No function id in properties");
	            v1_4 = cxi.a;
	        }
	        return v1_4;
	    }
	
	
	    private cwj a(java.util.Set p7, java.util.Map p8, java.util.Map p9, java.util.Map p10, java.util.Map p11, java.util.Set p12, cxh p13)
	    {
	        return this.a(p7, p12, new cxl(this, p8, p9, p10, p11), p13);
	    }
	
	
	    private cwj a(java.util.Set p10, java.util.Set p11, cxn p12, cxh p13)
	    {
	        java.util.HashSet v4_1 = new java.util.HashSet();
	        java.util.HashSet v5_1 = new java.util.HashSet();
	        java.util.Iterator v6 = p10.iterator();
	        int v2 = 1;
	        while (v6.hasNext()) {
	            int v0_4 = ((cmb) v6.next());
	            cwy v7 = p13.a();
	            cwj v8 = this.a(v0_4, p11, v7);
	            if (((Boolean) v8.a).booleanValue()) {
	                p12.a(v0_4, v4_1, v5_1, v7);
	            }
	            if ((v2 == 0) || (!v8.b)) {
	                int v0_6 = 0;
	            } else {
	                v0_6 = 1;
	            }
	            v2 = v0_6;
	        }
	        v4_1.removeAll(v5_1);
	        return new cwj(v4_1, v2);
	    }
	
	
	    private static cxp a(java.util.Map p1, String p2)
	    {
	        cxp v0_1 = ((cxp) p1.get(p2));
	        if (v0_1 == null) {
	            v0_1 = new cxp();
	            p1.put(p2, v0_1);
	        }
	        return v0_1;
	    }
	
	
	    private static String a(clx p2)
	    {
	        return cyh.a(((cje) java.util.Collections.unmodifiableMap(p2.a).get(cit.u.toString())));
	    }
	
	
	    private void a(cje p4, java.util.Set p5)
	    {
	        if (p4 != null) {
	            String v0_2 = this.a(p4, p5, new cyj());
	            if (v0_2 != cxi.a) {
	                String v0_5 = cyh.e(((cje) v0_2.a));
	                if (!(v0_5 instanceof java.util.Map)) {
	                    if (!(v0_5 instanceof java.util.List)) {
	                        cuh.b("pushAfterEvaluate: value not a Map or List");
	                    } else {
	                        java.util.Iterator v1_3 = ((java.util.List) v0_5).iterator();
	                        while (v1_3.hasNext()) {
	                            String v0_9 = v1_3.next();
	                            if (!(v0_9 instanceof java.util.Map)) {
	                                cuh.b("pushAfterEvaluate: value not a Map");
	                            } else {
	                                this.j.a(((java.util.Map) v0_9));
	                            }
	                        }
	                    }
	                } else {
	                    this.j.a(((java.util.Map) v0_5));
	                }
	            }
	        }
	        return;
	    }
	
	
	    private void a(cvf p2)
	    {
	        cxi.a(this.f, p2);
	        return;
	    }
	
	
	    private static void a(java.util.Map p3, cvf p4)
	    {
	        if (!p3.containsKey(p4.c())) {
	            p3.put(p4.c(), p4);
	            return;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("Duplicate function type name: ").append(p4.c()).toString());
	        }
	    }
	
	
	    private String b()
	    {
	        String v0_5;
	        if (this.m > 1) {
	            StringBuilder v1_2 = new StringBuilder();
	            v1_2.append(Integer.toString(this.m));
	            String v0_3 = 2;
	            while (v0_3 < this.m) {
	                v1_2.append(32);
	                v0_3++;
	            }
	            v1_2.append(": ");
	            v0_5 = v1_2.toString();
	        } else {
	            v0_5 = "";
	        }
	        return v0_5;
	    }
	
	
	    private void b(cvf p2)
	    {
	        cxi.a(this.d, p2);
	        return;
	    }
	
	
	    private void c(cvf p2)
	    {
	        cxi.a(this.e, p2);
	        return;
	    }
	
	
	    private declared_synchronized void c(String p2)
	    {
	        try {
	            this.l = p2;
	            return;
	        } catch (Throwable v0) {
	            throw v0;
	        }
	    }
	
	
	    final declared_synchronized String a()
	    {
	        try {
	            return this.l;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public final declared_synchronized void a(String p7)
	    {
	        try {
	            this.c(p7);
	            cze v1 = this.c.b().b();
	            java.util.Iterator v2_1 = ((java.util.Set) this.a(this.i, new java.util.HashSet(), new cxm(this), v1.b()).a).iterator();
	        } catch (int v0_8) {
	            throw v0_8;
	        }
	        while (v2_1.hasNext()) {
	            this.a(this.d, ((clx) v2_1.next()), new java.util.HashSet(), v1.a());
	        }
	        this.c(0);
	        return;
	    }
	
	
	    public final declared_synchronized void a(java.util.List p5)
	    {
	        try {
	            java.util.Iterator v1 = p5.iterator();
	        } catch (String v0_3) {
	            throw v0_3;
	        }
	        while (v1.hasNext()) {
	            String v0_2 = ((cjc) v1.next());
	            if ((v0_2.a != null) && (v0_2.a.startsWith("gaExperiment:"))) {
	                a.a(this.j, v0_2);
	            } else {
	                cuh.e(new StringBuilder("Ignored supplemental: ").append(v0_2).toString());
	            }
	        }
	        return;
	    }
	
	
	    public final cwj b(String p3)
	    {
	        this.m = 0;
	        return this.a(p3, new java.util.HashSet(), this.c.a().a());
	    }
	
