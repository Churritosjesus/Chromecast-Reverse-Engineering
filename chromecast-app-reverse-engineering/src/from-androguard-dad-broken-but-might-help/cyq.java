	private static final java.lang.String b
	private static final java.lang.String c
	private static final java.lang.String d
	private static final java.lang.String e
	private static java.lang.String f
	private static final java.util.Set g
	private final cys h
	private final android.content.Context i
	
	    static cyq()
	    {
	        cyq.b = cip.O.toString();
	        cyq.c = cit.L.toString();
	        cyq.d = cit.b.toString();
	        cyq.e = cit.K.toString();
	        cyq.f = new StringBuilder("gtm_").append(cyq.b).append("_unrepeatable").toString();
	        cyq.g = new java.util.HashSet();
	        return;
	    }
	
	
	    public cyq(android.content.Context p2)
	    {
	        this(p2, new cyr(p2));
	        return;
	    }
	
	
	    private cyq(android.content.Context p5, cys p6)
	    {
	        String[] v1_1 = new String[1];
	        v1_1[0] = cyq.c;
	        this(cyq.b, v1_1);
	        this.h = p6;
	        this.i = p5;
	        return;
	    }
	
	
	    private declared_synchronized boolean a(String p6)
	    {
	        java.util.Set v0_0 = 1;
	        try {
	            if (!cyq.g.contains(p6)) {
	                if (!this.i.getSharedPreferences(cyq.f, 0).contains(p6)) {
	                    v0_0 = 0;
	                } else {
	                    cyq.g.add(p6);
	                }
	            }
	        } catch (java.util.Set v0_1) {
	            throw v0_1;
	        }
	        return v0_0;
	    }
	
	
	    public final void b(java.util.Map p7)
	    {
	        String v1_0;
	        if (p7.get(cyq.e) == null) {
	            v1_0 = 0;
	        } else {
	            v1_0 = cyh.a(((cje) p7.get(cyq.e)));
	        }
	        if ((v1_0 == null) || (!this.a(v1_0))) {
	            Class v2_0 = android.net.Uri.parse(cyh.a(((cje) p7.get(cyq.c)))).buildUpon();
	            String v0_15 = ((cje) p7.get(cyq.d));
	            if (v0_15 != null) {
	                String v0_16 = cyh.e(v0_15);
	                if ((v0_16 instanceof java.util.List)) {
	                    String v3_1 = ((java.util.List) v0_16).iterator();
	                    while (v3_1.hasNext()) {
	                        String v0_26 = v3_1.next();
	                        if ((v0_26 instanceof java.util.Map)) {
	                            java.util.Iterator v4_2 = ((java.util.Map) v0_26).entrySet().iterator();
	                            while (v4_2.hasNext()) {
	                                String v0_31 = ((java.util.Map$Entry) v4_2.next());
	                                v2_0.appendQueryParameter(v0_31.getKey().toString(), v0_31.getValue().toString());
	                            }
	                        } else {
	                            cuh.a(new StringBuilder("ArbitraryPixel: additional params contains non-map: not sending partial hit: ").append(v2_0.build().toString()).toString());
	                            return;
	                        }
	                    }
	                } else {
	                    cuh.a(new StringBuilder("ArbitraryPixel: additional params not a list: not sending partial hit: ").append(v2_0.build().toString()).toString());
	                    return;
	                }
	            }
	            String v0_20 = v2_0.build().toString();
	            this.h.a().a(v0_20);
	            cuh.e(new StringBuilder("ArbitraryPixel: url = ").append(v0_20).toString());
	            if (v1_0 != null) {
	                try {
	                    cyq.g.add(v1_0);
	                    a.a(this.i, cyq.f, v1_0, "true");
	                } catch (String v0_25) {
	                    throw v0_25;
	                }
	            }
	        }
	        return;
	    }
	
