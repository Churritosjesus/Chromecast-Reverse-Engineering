	public static final java.lang.String a
	public static final java.lang.String b
	public static final java.lang.String c
	private static final java.util.Comparator d
	private static java.lang.String e
	
	    static dhl()
	    {
	        dhl.d = new dhm();
	        dgn.a();
	        dhl.e = dgn.b();
	        dhl.a = new StringBuilder().append(dhl.e).append("-Sent-Millis").toString();
	        dhl.b = new StringBuilder().append(dhl.e).append("-Received-Millis").toString();
	        dhl.c = new StringBuilder().append(dhl.e).append("-Selected-Protocol").toString();
	        return;
	    }
	
	
	    public static long a(dfo p2)
	    {
	        return dhl.b(p2.a("Content-Length"));
	    }
	
	
	    public static long a(dfy p2)
	    {
	        return dhl.a(p2.c);
	    }
	
	
	    public static long a(dgc p2)
	    {
	        return dhl.a(p2.f);
	    }
	
	
	    public static dfy a(dfa p2, dgc p3, java.net.Proxy p4)
	    {
	        dfy v0_1;
	        if (p3.c != 407) {
	            v0_1 = p2.a(p4, p3);
	        } else {
	            v0_1 = p2.b(p4, p3);
	        }
	        return v0_1;
	    }
	
	
	    public static java.util.Map a(dfo p7, String p8)
	    {
	        java.util.TreeMap v2_1 = new java.util.TreeMap(dhl.d);
	        int v3 = (p7.a.length / 2);
	        java.util.List v1_2 = 0;
	        while (v1_2 < v3) {
	            String v4 = p7.a(v1_2);
	            String v5 = p7.b(v1_2);
	            java.util.ArrayList v6_1 = new java.util.ArrayList();
	            java.util.Map v0_5 = ((java.util.List) v2_1.get(v4));
	            if (v0_5 != null) {
	                v6_1.addAll(v0_5);
	            }
	            v6_1.add(v5);
	            v2_1.put(v4, java.util.Collections.unmodifiableList(v6_1));
	            v1_2++;
	        }
	        if (p8 != null) {
	            v2_1.put(0, java.util.Collections.unmodifiableList(java.util.Collections.singletonList(p8)));
	        }
	        return java.util.Collections.unmodifiableMap(v2_1);
	    }
	
	
	    public static void a(dfz p8, java.util.Map p9)
	    {
	        java.util.Iterator v5 = p9.entrySet().iterator();
	        while (v5.hasNext()) {
	            String v0_3 = ((java.util.Map$Entry) v5.next());
	            String v1_1 = ((String) v0_3.getKey());
	            if ((("Cookie".equalsIgnoreCase(v1_1)) || ("Cookie2".equalsIgnoreCase(v1_1))) && (!((java.util.List) v0_3.getValue()).isEmpty())) {
	                String v0_6;
	                String v0_5 = ((java.util.List) v0_3.getValue());
	                if (v0_5.size() != 1) {
	                    StringBuilder v6_1 = new StringBuilder();
	                    int v7 = v0_5.size();
	                    int v3_1 = 0;
	                    while (v3_1 < v7) {
	                        if (v3_1 > 0) {
	                            v6_1.append("; ");
	                        }
	                        v6_1.append(((String) v0_5.get(v3_1)));
	                        v3_1++;
	                    }
	                    v0_6 = v6_1.toString();
	                } else {
	                    v0_6 = ((String) v0_5.get(0));
	                }
	                p8.b(v1_1, v0_6);
	            }
	        }
	        return;
	    }
	
	
	    static boolean a(String p1)
	    {
	        if (("Connection".equalsIgnoreCase(p1)) || (("Keep-Alive".equalsIgnoreCase(p1)) || (("Proxy-Authenticate".equalsIgnoreCase(p1)) || (("Proxy-Authorization".equalsIgnoreCase(p1)) || (("TE".equalsIgnoreCase(p1)) || (("Trailers".equalsIgnoreCase(p1)) || (("Transfer-Encoding".equalsIgnoreCase(p1)) || ("Upgrade".equalsIgnoreCase(p1))))))))) {
	            int v0_16 = 0;
	        } else {
	            v0_16 = 1;
	        }
	        return v0_16;
	    }
	
	
	    private static long b(String p3)
	    {
	        long v0 = -1;
	        if (p3 != null) {
	            try {
	                v0 = Long.parseLong(p3);
	            } catch (NumberFormatException v2) {
	            }
	        }
	        return v0;
	    }
	
	
	    public static java.util.List b(dfo p10, String p11)
	    {
	        java.util.ArrayList v7_1 = new java.util.ArrayList();
	        int v8 = (p10.a.length / 2);
	        int v6 = 0;
	        while (v6 < v8) {
	            if (p11.equalsIgnoreCase(p10.a(v6))) {
	                int v0_4 = p10.b(v6);
	                int v1_0 = 0;
	                while (v1_0 < v0_4.length()) {
	                    dff v2_2 = a.a(v0_4, v1_0, " ");
	                    String v9 = v0_4.substring(v1_0, v2_2).trim();
	                    dff v2_3 = a.b(v0_4, v2_2);
	                    if (!v0_4.regionMatches(1, v2_3, "realm=\"", 0, 7)) {
	                        break;
	                    }
	                    int v1_4 = (v2_3 + 7);
	                    dff v2_5 = a.a(v0_4, v1_4, "\"");
	                    String v3_1 = v0_4.substring(v1_4, v2_5);
	                    v1_0 = a.b(v0_4, (a.a(v0_4, (v2_5 + 1), ",") + 1));
	                    v7_1.add(new dff(v9, v3_1));
	                }
	            }
	            v6++;
	        }
	        return v7_1;
	    }
	
