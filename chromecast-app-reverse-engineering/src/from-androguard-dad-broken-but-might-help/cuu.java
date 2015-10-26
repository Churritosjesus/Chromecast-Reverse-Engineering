	private static final java.lang.String b
	private static final java.lang.String c
	private static final java.lang.String d
	private static final java.lang.String e
	private static final java.lang.String f
	private static final java.lang.String g
	private static final java.lang.String h
	private static final java.lang.String i
	private static final java.lang.String j
	private static final java.util.List k
	private static final java.util.regex.Pattern l
	private static final java.util.regex.Pattern m
	private static java.util.Map n
	private static java.util.Map o
	private final java.util.Set p
	private final cyd q
	private final ctw r
	
	    static cuu()
	    {
	        cuu.b = cip.P.toString();
	        cit.a.toString();
	        cuu.c = cit.e.toString();
	        cuu.d = cit.n.toString();
	        cuu.e = cit.m.toString();
	        cuu.f = cit.l.toString();
	        cuu.g = cit.d.toString();
	        cuu.h = cit.G.toString();
	        cuu.i = cit.H.toString();
	        cuu.j = cit.I.toString();
	        java.util.regex.Pattern v0_20 = new String[8];
	        v0_20[0] = "detail";
	        v0_20[1] = "checkout";
	        v0_20[2] = "checkout_option";
	        v0_20[3] = "click";
	        v0_20[4] = "add";
	        v0_20[5] = "remove";
	        v0_20[6] = "purchase";
	        v0_20[7] = "refund";
	        cuu.k = java.util.Arrays.asList(v0_20);
	        cuu.l = java.util.regex.Pattern.compile("dimension(\\d+)");
	        cuu.m = java.util.regex.Pattern.compile("metric(\\d+)");
	        return;
	    }
	
	
	    public cuu(android.content.Context p2, ctw p3)
	    {
	        this(p3, new cyd(p2));
	        return;
	    }
	
	
	    private cuu(ctw p3, cyd p4)
	    {
	        String v1_1 = new String[0];
	        this(cuu.b, v1_1);
	        this.r = p3;
	        this.q = p4;
	        this.p = new java.util.HashSet();
	        this.p.add("");
	        this.p.add("0");
	        this.p.add("false");
	        return;
	    }
	
	
	    private static Double a(Object p4)
	    {
	        Double v4_1;
	        if (!(p4 instanceof String)) {
	            if (!(p4 instanceof Integer)) {
	                if (!(p4 instanceof Double)) {
	                    throw new RuntimeException(new StringBuilder("Cannot convert the object to Double: ").append(p4.toString()).toString());
	                } else {
	                    v4_1 = ((Double) p4);
	                }
	            } else {
	                v4_1 = Double.valueOf(((Integer) p4).doubleValue());
	            }
	        } else {
	            try {
	                v4_1 = Double.valueOf(((String) p4));
	            } catch (RuntimeException v0_6) {
	                throw new RuntimeException(new StringBuilder("Cannot convert the object to Double: ").append(v0_6.getMessage()).toString());
	            }
	        }
	        return v4_1;
	    }
	
	
	    private String a(String p2)
	    {
	        String v0_2;
	        String v0_1 = this.r.b(p2);
	        if (v0_1 != null) {
	            v0_2 = v0_1.toString();
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    private static java.util.Map a(cje p4)
	    {
	        java.util.LinkedHashMap v0_4;
	        java.util.LinkedHashMap v0_0 = cyh.e(p4);
	        if ((v0_0 instanceof java.util.Map)) {
	            java.util.LinkedHashMap v0_1 = ((java.util.Map) v0_0);
	            java.util.LinkedHashMap v1_2 = new java.util.LinkedHashMap();
	            java.util.Iterator v2 = v0_1.entrySet().iterator();
	            while (v2.hasNext()) {
	                java.util.LinkedHashMap v0_6 = ((java.util.Map$Entry) v2.next());
	                v1_2.put(v0_6.getKey().toString(), v0_6.getValue().toString());
	            }
	            v0_4 = v1_2;
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    private void a(bps p9, java.util.Map p10)
	    {
	        String v3 = this.a("transactionId");
	        if (v3 != null) {
	            java.util.LinkedList v4_1 = new java.util.LinkedList();
	            try {
	                String v0_11;
	                String v2_0 = this.b(((cje) p10.get(cuu.g)));
	                v2_0.put("&t", "transaction");
	                String v0_7 = ((cje) p10.get(cuu.i));
	            } catch (String v0_23) {
	                cuh.a("Unable to send transaction", v0_23);
	            }
	            if (v0_7 == null) {
	                if (cuu.n == null) {
	                    String v0_10 = new java.util.HashMap();
	                    v0_10.put("transactionId", "&ti");
	                    v0_10.put("transactionAffiliation", "&ta");
	                    v0_10.put("transactionTax", "&tt");
	                    v0_10.put("transactionShipping", "&ts");
	                    v0_10.put("transactionTotal", "&tr");
	                    v0_10.put("transactionCurrency", "&cu");
	                    cuu.n = v0_10;
	                }
	                v0_11 = cuu.n;
	            } else {
	                v0_11 = cuu.a(v0_7);
	            }
	            java.util.Iterator v5_6 = v0_11.entrySet().iterator();
	            while (v5_6.hasNext()) {
	                String v0_25 = ((java.util.Map$Entry) v5_6.next());
	                cuu.a(v2_0, ((String) v0_25.getValue()), this.a(((String) v0_25.getKey())));
	            }
	            v4_1.add(v2_0);
	            String v0_15 = this.b("transactionProducts");
	            if (v0_15 != null) {
	                java.util.Iterator v5_7 = v0_15.iterator();
	                while (v5_7.hasNext()) {
	                    String v0_21 = ((java.util.Map) v5_7.next());
	                    if (v0_21.get("name") != null) {
	                        String v1_21;
	                        java.util.Map v6 = this.b(((cje) p10.get(cuu.g)));
	                        v6.put("&t", "item");
	                        v6.put("&ti", v3);
	                        String v1_17 = ((cje) p10.get(cuu.j));
	                        if (v1_17 == null) {
	                            if (cuu.o == null) {
	                                String v1_20 = new java.util.HashMap();
	                                v1_20.put("name", "&in");
	                                v1_20.put("sku", "&ic");
	                                v1_20.put("category", "&iv");
	                                v1_20.put("price", "&ip");
	                                v1_20.put("quantity", "&iq");
	                                v1_20.put("currency", "&cu");
	                                cuu.o = v1_20;
	                            }
	                            v1_21 = cuu.o;
	                        } else {
	                            v1_21 = cuu.a(v1_17);
	                        }
	                        String v7_6 = v1_21.entrySet().iterator();
	                        while (v7_6.hasNext()) {
	                            String v1_25 = ((java.util.Map$Entry) v7_6.next());
	                            cuu.a(v6, ((String) v1_25.getValue()), ((String) v0_21.get(v1_25.getKey())));
	                        }
	                        v4_1.add(v6);
	                    } else {
	                        cuh.a("Unable to send transaction item hit due to missing \'name\' field.");
	                        return;
	                    }
	                }
	            }
	            String v1_7 = v4_1.iterator();
	            while (v1_7.hasNext()) {
	                p9.a(((java.util.Map) v1_7.next()));
	            }
	        } else {
	            cuh.a("Cannot find transactionId in data layer.");
	        }
	        return;
	    }
	
	
	    private static void a(java.util.Map p0, String p1, String p2)
	    {
	        if (p2 != null) {
	            p0.put(p1, p2);
	        }
	        return;
	    }
	
	
	    private static boolean a(java.util.Map p1, String p2)
	    {
	        boolean v0_3;
	        boolean v0_1 = ((cje) p1.get(p2));
	        if (v0_1) {
	            v0_3 = cyh.d(v0_1).booleanValue();
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    private static Integer b(Object p4)
	    {
	        Integer v4_1;
	        if (!(p4 instanceof String)) {
	            if (!(p4 instanceof Double)) {
	                if (!(p4 instanceof Integer)) {
	                    throw new RuntimeException(new StringBuilder("Cannot convert the object to Integer: ").append(p4.toString()).toString());
	                } else {
	                    v4_1 = ((Integer) p4);
	                }
	            } else {
	                v4_1 = Integer.valueOf(((Double) p4).intValue());
	            }
	        } else {
	            try {
	                v4_1 = Integer.valueOf(((String) p4));
	            } catch (RuntimeException v0_6) {
	                throw new RuntimeException(new StringBuilder("Cannot convert the object to Integer: ").append(v0_6.getMessage()).toString());
	            }
	        }
	        return v4_1;
	    }
	
	
	    private java.util.List b(String p4)
	    {
	        String v1_1;
	        String v1_0 = this.r.b(p4);
	        if (v1_0 != null) {
	            if ((v1_0 instanceof java.util.List)) {
	                IllegalArgumentException v0_4 = ((java.util.List) v1_0).iterator();
	                while (v0_4.hasNext()) {
	                    if (!(v0_4.next() instanceof java.util.Map)) {
	                        throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
	                    }
	                }
	                v1_1 = ((java.util.List) v1_0);
	            } else {
	                throw new IllegalArgumentException("transactionProducts should be of type List.");
	            }
	        } else {
	            v1_1 = 0;
	        }
	        return v1_1;
	    }
	
	
	    private java.util.Map b(cje p4)
	    {
	        String v0_6;
	        if (p4 != null) {
	            java.util.Map v1 = cuu.a(p4);
	            if (v1 != null) {
	                String v0_2 = ((String) v1.get("&aip"));
	                if ((v0_2 != null) && (this.p.contains(v0_2.toLowerCase()))) {
	                    v1.remove("&aip");
	                }
	                v0_6 = v1;
	            } else {
	                v0_6 = new java.util.HashMap();
	            }
	        } else {
	            v0_6 = new java.util.HashMap();
	        }
	        return v0_6;
	    }
	
	
	    private bpz c(java.util.Map p6)
	    {
	        bpz v1_1 = new bpz();
	        String v0_1 = p6.get("id");
	        if (v0_1 != null) {
	            v1_1.a("id", String.valueOf(v0_1));
	        }
	        String v0_4 = p6.get("name");
	        if (v0_4 != null) {
	            v1_1.a("nm", String.valueOf(v0_4));
	        }
	        String v0_7 = p6.get("brand");
	        if (v0_7 != null) {
	            v1_1.a("br", String.valueOf(v0_7));
	        }
	        String v0_10 = p6.get("category");
	        if (v0_10 != null) {
	            v1_1.a("ca", String.valueOf(v0_10));
	        }
	        String v0_13 = p6.get("variant");
	        if (v0_13 != null) {
	            v1_1.a("va", String.valueOf(v0_13));
	        }
	        String v0_16 = p6.get("coupon");
	        if (v0_16 != null) {
	            v1_1.a("cc", String.valueOf(v0_16));
	        }
	        String v0_19 = p6.get("position");
	        if (v0_19 != null) {
	            v1_1.a("ps", Integer.toString(cuu.b(v0_19).intValue()));
	        }
	        String v0_24 = p6.get("price");
	        if (v0_24 != null) {
	            v1_1.a("pr", Double.toString(cuu.a(v0_24).doubleValue()));
	        }
	        String v0_28 = p6.get("quantity");
	        if (v0_28 != null) {
	            v1_1.a("qt", Integer.toString(cuu.b(v0_28).intValue()));
	        }
	        java.util.Iterator v2_10 = p6.keySet().iterator();
	        while (v2_10.hasNext()) {
	            String v0_35 = ((String) v2_10.next());
	            StringBuilder v3_1 = cuu.l.matcher(v0_35);
	            if (!v3_1.matches()) {
	                StringBuilder v3_3 = cuu.m.matcher(v0_35);
	                if (v3_3.matches()) {
	                    try {
	                        StringBuilder v3_5 = Integer.parseInt(v3_3.group(1));
	                        String v0_38 = cuu.b(p6.get(v0_35)).intValue();
	                        StringBuilder v3_6 = a.a("cm", v3_5);
	                        String v0_39 = Integer.toString(v0_38);
	                        v1_1.a(v3_6, v0_39);
	                    } catch (StringBuilder v3) {
	                        cuh.b(new StringBuilder("illegal number in custom metric value: ").append(v0_39).toString());
	                    }
	                }
	            } else {
	                try {
	                    StringBuilder v3_10 = Integer.parseInt(v3_1.group(1));
	                    String v0_43 = String.valueOf(p6.get(v0_35));
	                    v1_1.a(a.a("cd", v3_10), v0_43);
	                } catch (StringBuilder v3) {
	                    cuh.b(new StringBuilder("illegal number in custom dimension value: ").append(v0_43).toString());
	                }
	            }
	        }
	        return v1_1;
	    }
	
	
	    public final bridge synthetic cje a(java.util.Map p2)
	    {
	        return super.a(p2);
	    }
	
	
	    public final bridge synthetic boolean a()
	    {
	        return super.a();
	    }
	
	
	    public final bridge synthetic java.util.Set b()
	    {
	        return super.b();
	    }
	
	
	    public final void b(java.util.Map p10)
	    {
	        String v0_0 = this.q;
	        v0_0.a("_GTM_DEFAULT_TRACKER_");
	        bps v4 = v0_0.a;
	        v4.a = cuu.a(p10, "collect_adid");
	        if (!cuu.a(p10, cuu.d)) {
	            if (!cuu.a(p10, cuu.c)) {
	                if (!cuu.a(p10, cuu.h)) {
	                    cuh.b("Ignoring unknown tag.");
	                } else {
	                    this.a(v4, p10);
	                }
	            } else {
	                v4.a(this.b(((cje) p10.get(cuu.g))));
	            }
	        } else {
	            bpq v5_1 = new bpq();
	            String v2_1 = this.b(((cje) p10.get(cuu.g)));
	            if (v2_1 != null) {
	                v5_1.a.putAll(new java.util.HashMap(v2_1));
	            }
	            String v3_3;
	            if (!cuu.a(p10, cuu.e)) {
	                String v0_23 = cyh.e(((cje) p10.get(cuu.f)));
	                if (!(v0_23 instanceof java.util.Map)) {
	                    v3_3 = 0;
	                } else {
	                    v3_3 = ((java.util.Map) v0_23);
	                }
	            } else {
	                String v0_27;
	                String v0_26 = this.r.b("ecommerce");
	                if (!(v0_26 instanceof java.util.Map)) {
	                    v0_27 = 0;
	                } else {
	                    v0_27 = ((java.util.Map) v0_26);
	                }
	                v3_3 = v0_27;
	            }
	            if (v3_3 != null) {
	                String v0_30 = ((String) v2_1.get("&cu"));
	                if (v0_30 == null) {
	                    v0_30 = ((String) v3_3.get("currencyCode"));
	                }
	                if (v0_30 != null) {
	                    v5_1.a("&cu", v0_30);
	                }
	                String v0_34 = v3_3.get("impressions");
	                if ((v0_34 instanceof java.util.List)) {
	                    String v2_4 = ((java.util.List) v0_34).iterator();
	                    while (v2_4.hasNext()) {
	                        String v0_122 = ((java.util.Map) v2_4.next());
	                        try {
	                            double v6_7 = this.c(v0_122);
	                            String v0_124 = ((String) v0_122.get("list"));
	                        } catch (String v0_125) {
	                            cuh.a(new StringBuilder("Failed to extract a product from DataLayer. ").append(v0_125.getMessage()).toString());
	                        }
	                        if (v6_7 != 0) {
	                            if (v0_124 == null) {
	                                v0_124 = "";
	                            }
	                            if (!v5_1.c.containsKey(v0_124)) {
	                                v5_1.c.put(v0_124, new java.util.ArrayList());
	                            }
	                            ((java.util.List) v5_1.c.get(v0_124)).add(v6_7);
	                        } else {
	                            bqk.a("product should be non-null");
	                        }
	                        v4.a(v5_1.a());
	                        return;
	                    }
	                }
	                String v0_41;
	                if (!v3_3.containsKey("promoClick")) {
	                    if (!v3_3.containsKey("promoView")) {
	                        v0_41 = 0;
	                    } else {
	                        v0_41 = ((java.util.List) ((java.util.Map) v3_3.get("promoView")).get("promotions"));
	                    }
	                } else {
	                    v0_41 = ((java.util.List) ((java.util.Map) v3_3.get("promoClick")).get("promotions"));
	                }
	                String v0_54;
	                if (v0_41 == null) {
	                    v0_54 = 1;
	                } else {
	                    double v6_0 = v0_41.iterator();
	                    while (v6_0.hasNext()) {
	                        String v1_16 = ((java.util.Map) v6_0.next());
	                        try {
	                            String v7_2 = new bqb();
	                            String v0_101 = ((String) v1_16.get("id"));
	                        } catch (String v0_116) {
	                            cuh.a(new StringBuilder("Failed to extract a promotion from DataLayer. ").append(v0_116.getMessage()).toString());
	                        }
	                        if (v0_101 != null) {
	                            v7_2.a("id", String.valueOf(v0_101));
	                        }
	                        String v0_105 = ((String) v1_16.get("name"));
	                        if (v0_105 != null) {
	                            v7_2.a("nm", String.valueOf(v0_105));
	                        }
	                        String v0_109 = ((String) v1_16.get("creative"));
	                        if (v0_109 != null) {
	                            v7_2.a("cr", String.valueOf(v0_109));
	                        }
	                        String v0_113 = ((String) v1_16.get("position"));
	                        if (v0_113 != null) {
	                            v7_2.a("ps", String.valueOf(v0_113));
	                        }
	                        if (v7_2 != null) {
	                            v5_1.d.add(v7_2);
	                        } else {
	                            bqk.a("promotion should be non-null");
	                        }
	                    }
	                    if (!v3_3.containsKey("promoClick")) {
	                        v5_1.a("&promoa", "view");
	                    } else {
	                        v5_1.a("&promoa", "click");
	                        v0_54 = 0;
	                    }
	                }
	                if (v0_54 != null) {
	                    String v1_5 = cuu.k.iterator();
	                    while (v1_5.hasNext()) {
	                        String v0_59 = ((String) v1_5.next());
	                        if (v3_3.containsKey(v0_59)) {
	                            String v1_7 = ((java.util.Map) v3_3.get(v0_59));
	                            String v2_9 = ((java.util.List) v1_7.get("products"));
	                            if (v2_9 != null) {
	                                String v3_6 = v2_9.iterator();
	                                while (v3_6.hasNext()) {
	                                    try {
	                                        String v2_19 = this.c(((java.util.Map) v3_6.next()));
	                                    } catch (String v2_20) {
	                                        cuh.a(new StringBuilder("Failed to extract a product from DataLayer. ").append(v2_20.getMessage()).toString());
	                                    }
	                                    if (v2_19 != null) {
	                                        v5_1.e.add(v2_19);
	                                    } else {
	                                        bqk.a("product should be non-null");
	                                    }
	                                }
	                            }
	                            try {
	                                String v0_60;
	                                if (!v1_7.containsKey("actionField")) {
	                                    v0_60 = new bqa(v0_59);
	                                } else {
	                                    String v1_11 = ((java.util.Map) v1_7.get("actionField"));
	                                    String v2_15 = new bqa(v0_59);
	                                    String v0_62 = v1_11.get("id");
	                                    if (v0_62 != null) {
	                                        v2_15.a("&ti", String.valueOf(v0_62));
	                                    }
	                                    String v0_65 = v1_11.get("affiliation");
	                                    if (v0_65 != null) {
	                                        v2_15.a("&ta", String.valueOf(v0_65));
	                                    }
	                                    String v0_68 = v1_11.get("coupon");
	                                    if (v0_68 != null) {
	                                        v2_15.a("&tcc", String.valueOf(v0_68));
	                                    }
	                                    String v0_71 = v1_11.get("list");
	                                    if (v0_71 != null) {
	                                        v2_15.a("&pal", String.valueOf(v0_71));
	                                    }
	                                    String v0_74 = v1_11.get("option");
	                                    if (v0_74 != null) {
	                                        v2_15.a("&col", String.valueOf(v0_74));
	                                    }
	                                    String v0_77 = v1_11.get("revenue");
	                                    if (v0_77 != null) {
	                                        v2_15.a("&tr", Double.toString(cuu.a(v0_77).doubleValue()));
	                                    }
	                                    String v0_81 = v1_11.get("tax");
	                                    if (v0_81 != null) {
	                                        v2_15.a("&tt", Double.toString(cuu.a(v0_81).doubleValue()));
	                                    }
	                                    String v0_85 = v1_11.get("shipping");
	                                    if (v0_85 != null) {
	                                        v2_15.a("&ts", Double.toString(cuu.a(v0_85).doubleValue()));
	                                    }
	                                    String v0_89 = v1_11.get("step");
	                                    if (v0_89 != null) {
	                                        v2_15.a("&cos", Integer.toString(cuu.b(v0_89).intValue()));
	                                    }
	                                    v0_60 = v2_15;
	                                }
	                            } catch (String v0_93) {
	                                cuh.a(new StringBuilder("Failed to extract a product action from DataLayer. ").append(v0_93.getMessage()).toString());
	                                break;
	                            }
	                            v5_1.b = v0_60;
	                            break;
	                        }
	                    }
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final bridge synthetic String c()
	    {
	        return super.c();
	    }
	
