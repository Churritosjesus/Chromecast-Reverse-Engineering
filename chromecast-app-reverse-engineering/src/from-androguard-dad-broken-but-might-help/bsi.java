	final java.util.Map a
	final java.util.List b
	final  c
	final  d
	final  e
	final  f
	private final java.lang.String g
	
	    public bsi(bqz p12, java.util.Map p13, long p14, boolean p16)
	    {
	        this(p12, p13, p14, p16, 0, 0, 0);
	        return;
	    }
	
	
	    public bsi(bqz p11, java.util.Map p12, long p13, boolean p15, long p16, int p18)
	    {
	        this(p11, p12, p13, p15, p16, p18, 0);
	        return;
	    }
	
	
	    public bsi(bqz p5, java.util.Map p6, long p7, boolean p9, long p10, int p12, java.util.List p13)
	    {
	        String v0_0;
	        a.c(p5);
	        a.c(p6);
	        this.d = p7;
	        this.f = p9;
	        this.c = p10;
	        this.e = p12;
	        if (p13 == null) {
	            v0_0 = java.util.Collections.EMPTY_LIST;
	        } else {
	            v0_0 = p13;
	        }
	        this.b = v0_0;
	        this.g = bsi.a(p13);
	        java.util.HashMap v1_1 = new java.util.HashMap();
	        String v2_0 = p6.entrySet().iterator();
	        while (v2_0.hasNext()) {
	            String v0_20 = ((java.util.Map$Entry) v2_0.next());
	            if (bsi.a(v0_20.getKey())) {
	                String v3_7 = bsi.a(p5, v0_20.getKey());
	                if (v3_7 != null) {
	                    v1_1.put(v3_7, bsi.b(p5, v0_20.getValue()));
	                }
	            }
	        }
	        String v2_1 = p6.entrySet().iterator();
	        while (v2_1.hasNext()) {
	            String v0_16 = ((java.util.Map$Entry) v2_1.next());
	            if (!bsi.a(v0_16.getKey())) {
	                String v3_3 = bsi.a(p5, v0_16.getKey());
	                if (v3_3 != null) {
	                    v1_1.put(v3_3, bsi.b(p5, v0_16.getValue()));
	                }
	            }
	        }
	        if (!android.text.TextUtils.isEmpty(this.g)) {
	            bqs.a(v1_1, "_v", this.g);
	            if ((this.g.equals("ma4.0.0")) || (this.g.equals("ma4.0.1"))) {
	                v1_1.remove("adid");
	            }
	        }
	        this.a = java.util.Collections.unmodifiableMap(v1_1);
	        return;
	    }
	
	
	    private static String a(bqz p5, Object p6)
	    {
	        int v0;
	        if (p6 != null) {
	            v0 = p6.toString();
	            if (v0.startsWith("&")) {
	                v0 = v0.substring(1);
	            }
	            boolean v2_3 = v0.length();
	            if (v2_3 > 256) {
	                v0 = v0.substring(0, 256);
	                p5.c("Hit param name is too long and will be trimmed", Integer.valueOf(v2_3), v0);
	            }
	            if (android.text.TextUtils.isEmpty(v0)) {
	                v0 = 0;
	            }
	        } else {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    private static String a(java.util.List p5)
	    {
	        String v0_1;
	        com.google.android.gms.analytics.internal.Command v1 = 0;
	        if (p5 == null) {
	            v0_1 = 0;
	        } else {
	            boolean v2_0 = p5.iterator();
	            while (v2_0.hasNext()) {
	                String v0_3 = ((com.google.android.gms.analytics.internal.Command) v2_0.next());
	                if ("appendVersion".equals(v0_3.a)) {
	                    v0_1 = v0_3.b;
	                }
	            }
	        }
	        if (!android.text.TextUtils.isEmpty(v0_1)) {
	            v1 = v0_1;
	        }
	        return v1;
	    }
	
	
	    private static boolean a(Object p2)
	    {
	        boolean v0_1;
	        if (p2 != null) {
	            v0_1 = p2.toString().startsWith("&");
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    private static String b(bqz p4, Object p5)
	    {
	        String v0;
	        if (p5 != null) {
	            v0 = p5.toString();
	        } else {
	            v0 = "";
	        }
	        Integer v1_0 = v0.length();
	        if (v1_0 > 8192) {
	            v0 = v0.substring(0, 8192);
	            p4.c("Hit param value is too long and will be trimmed", Integer.valueOf(v1_0), v0);
	        }
	        return v0;
	    }
	
	
	    String a(String p3, String p4)
	    {
	        String v0_2;
	        a.f(p3);
	        if (p3.startsWith("&")) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        a.b(v0_2, "Short param name required");
	        String v0_5 = ((String) this.a.get(p3));
	        if (v0_5 == null) {
	            v0_5 = p4;
	        }
	        return v0_5;
	    }
	
	
	    public final String toString()
	    {
	        StringBuffer v1_1 = new StringBuffer();
	        v1_1.append("ht=").append(this.d);
	        if (this.c != 0) {
	            v1_1.append(", dbId=").append(this.c);
	        }
	        if (((long) this.e) != 0) {
	            v1_1.append(", appUID=").append(this.e);
	        }
	        String v0_10 = new java.util.ArrayList(this.a.keySet());
	        java.util.Collections.sort(v0_10);
	        java.util.Iterator v2_7 = v0_10.iterator();
	        while (v2_7.hasNext()) {
	            String v0_14 = ((String) v2_7.next());
	            v1_1.append(", ");
	            v1_1.append(v0_14);
	            v1_1.append("=");
	            v1_1.append(((String) this.a.get(v0_14)));
	        }
	        return v1_1.toString();
	    }
	
