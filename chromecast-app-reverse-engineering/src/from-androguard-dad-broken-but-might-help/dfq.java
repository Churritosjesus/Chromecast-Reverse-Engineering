	private static final C b
	final java.lang.String a
	private final java.lang.String c
	private final java.lang.String d
	private final java.lang.String e
	private final  f
	private final java.util.List g
	private final java.lang.String h
	
	    static dfq()
	    {
	        char[] v0_1 = new char[16];
	        v0_1 = {48, 0, 49, 0, 50, 0, 51, 0, 52, 0, 53, 0, 54, 0, 55, 0};
	        dfq.b = v0_1;
	        return;
	    }
	
	
	    dfq(dfr p2)
	    {
	        String v0_9;
	        this.a = p2.a;
	        this.c = dfq.c(p2.b);
	        this.d = dfq.c(p2.c);
	        this.e = p2.d;
	        this.f = p2.a();
	        dfq.a(p2.f);
	        if (p2.g == null) {
	            v0_9 = 0;
	        } else {
	            v0_9 = dfq.a(p2.g);
	        }
	        this.g = v0_9;
	        if (p2.h != null) {
	            dfq.c(p2.h);
	        }
	        this.h = p2.toString();
	        return;
	    }
	
	
	    static int a(char p1)
	    {
	        if ((p1 < 48) || (p1 > 57)) {
	            if ((p1 < 97) || (p1 > 102)) {
	                if ((p1 < 65) || (p1 > 70)) {
	                    int v0_6 = -1;
	                } else {
	                    v0_6 = ((p1 - 65) + 10);
	                }
	            } else {
	                v0_6 = ((p1 - 97) + 10);
	            }
	        } else {
	            v0_6 = (p1 - 48);
	        }
	        return v0_6;
	    }
	
	
	    public static int a(String p1)
	    {
	        int v0_4;
	        if (!p1.equals("http")) {
	            if (!p1.equals("https")) {
	                v0_4 = -1;
	            } else {
	                v0_4 = 443;
	            }
	        } else {
	            v0_4 = 80;
	        }
	        return v0_4;
	    }
	
	
	    static synthetic int a(String p1, int p2, int p3, String p4)
	    {
	        return dfq.b(p1, p2, p3, p4);
	    }
	
	
	    public static dfq a(java.net.URL p12)
	    {
	        dfq v0_0 = p12.toString();
	        dfr v9_1 = new dfr();
	        String v1_0 = v0_0.length();
	        int v2_0 = 0;
	        while (v2_0 < v1_0) {
	            switch (v0_0.charAt(v2_0)) {
	                case 9:
	                case 10:
	                case 12:
	                case 13:
	                case 32:
	                    v2_0++;
	                    break;
	            }
	            String v1_2 = (v0_0.length() - 1);
	            while (v1_2 >= v2_0) {
	                switch (v0_0.charAt(v1_2)) {
	                    case 9:
	                    case 10:
	                    case 12:
	                    case 13:
	                    case 32:
	                        v1_2--;
	                        break;
	                    default:
	                        int v8 = (v1_2 + 1);
	                        String v1_6;
	                        if ((v8 - v2_0) < 2) {
	                            v1_6 = -1;
	                        } else {
	                            String v1_5 = v0_0.charAt(v2_0);
	                            if (((v1_5 >= 97) && (v1_5 <= 122)) || ((v1_5 >= 65) && (v1_5 <= 90))) {
	                                v1_6 = (v2_0 + 1);
	                                while (v1_6 < v8) {
	                                    String v3_7 = v0_0.charAt(v1_6);
	                                    if (((v3_7 >= 97) && (v3_7 <= 122)) || (((v3_7 >= 65) && (v3_7 <= 90)) || ((v3_7 == 43) || ((v3_7 == 45) || (v3_7 == 46))))) {
	                                        v1_6++;
	                                    } else {
	                                        if (v3_7 != 58) {
	                                            v1_6 = -1;
	                                        }
	                                    }
	                                }
	                            } else {
	                                v1_6 = -1;
	                            }
	                        }
	                        dfq v0_1;
	                        if (v1_6 == -1) {
	                            v0_1 = 0;
	                        } else {
	                            String v1_12;
	                            if (!v0_0.regionMatches(1, v2_0, "https:", 0, 6)) {
	                                if (!v0_0.regionMatches(1, v2_0, "http:", 0, 5)) {
	                                    v0_1 = 0;
	                                    return v0_1;
	                                } else {
	                                    v9_1.a = "http";
	                                    v1_12 = (v2_0 + 5);
	                                }
	                            } else {
	                                v9_1.a = "https";
	                                v1_12 = (v2_0 + 6);
	                            }
	                            int v4_10 = 0;
	                            int v5_2 = v1_12;
	                            while (v5_2 < v8) {
	                                int v6_0 = v0_0.charAt(v5_2);
	                                if ((v6_0 != 92) && (v6_0 != 47)) {
	                                    break;
	                                }
	                                v4_10++;
	                                v5_2++;
	                            }
	                            String v1_14 = (v1_12 + v4_10);
	                            int v6_1 = 0;
	                            int v7_2 = 0;
	                            while(true) {
	                                int v2_3;
	                                int v10 = dfq.b(v0_0, v1_14, v8, "@/\\?#");
	                                if (v10 == v8) {
	                                    v2_3 = -1;
	                                } else {
	                                    v2_3 = v0_0.charAt(v10);
	                                }
	                                switch (v2_3) {
	                                    case -1:
	                                    case 35:
	                                    case 47:
	                                    case 63:
	                                    case 92:
	                                        int v2_12 = dfr.b(v0_0, v1_14, v10);
	                                        if ((v2_12 + 1) >= v10) {
	                                            v9_1.d = dfr.c(v0_0, v1_14, v2_12);
	                                            v9_1.e = dfq.a(v9_1.a);
	                                        } else {
	                                            v9_1.d = dfr.c(v0_0, v1_14, v2_12);
	                                            v9_1.e = dfr.d(v0_0, (v2_12 + 1), v10);
	                                            if (v9_1.e == -1) {
	                                                v0_1 = 0;
	                                                return v0_1;
	                                            }
	                                        }
	                                        if (v9_1.d != null) {
	                                            int v2_15;
	                                            String v1_32 = dfq.a(v0_0, v10, v8, "?#");
	                                            v9_1.a(v0_0, v10, v1_32);
	                                            if ((v1_32 >= v8) || (v0_0.charAt(v1_32) != 63)) {
	                                                v2_15 = v1_32;
	                                            } else {
	                                                v2_15 = dfq.a(v0_0, v1_32, v8, "#");
	                                                v9_1.g = dfq.b(dfq.a(v0_0, (v1_32 + 1), v2_15, " \"\'<>#", 1, 1));
	                                            }
	                                            if ((v2_15 < v8) && (v0_0.charAt(v2_15) == 35)) {
	                                                v9_1.h = dfq.a(v0_0, (v2_15 + 1), v8, "", 1, 0);
	                                            }
	                                            if (v9_1.a != null) {
	                                                if (v9_1.d != null) {
	                                                    v0_1 = new dfq(v9_1);
	                                                } else {
	                                                    throw new IllegalStateException("host == null");
	                                                }
	                                            } else {
	                                                throw new IllegalStateException("scheme == null");
	                                            }
	                                        } else {
	                                            v0_1 = 0;
	                                        }
	                                    case 64:
	                                        int v2_8;
	                                        String v1_18;
	                                        if (v6_1 != 0) {
	                                            v9_1.c = new StringBuilder().append(v9_1.c).append("%40").append(dfq.a(v0_0, v1_14, v10, " \"\':;<=>@[]\\^`{}|/\\?#", 1, 0)).toString();
	                                            v1_18 = v6_1;
	                                            v2_8 = v7_2;
	                                        } else {
	                                            int v2_10 = dfq.b(v0_0, v1_14, v10, ":");
	                                            String v1_19 = dfq.a(v0_0, v1_14, v2_10, " \"\':;<=>@[]^`{}|/\\?#", 1, 0);
	                                            if (v7_2 != 0) {
	                                                v1_19 = new StringBuilder().append(v9_1.b).append("%40").append(v1_19).toString();
	                                            }
	                                            v9_1.b = v1_19;
	                                            if (v2_10 != v10) {
	                                                v6_1 = 1;
	                                                v9_1.c = dfq.a(v0_0, (v2_10 + 1), v10, " \"\':;<=>@[]\\^`{}|/\\?#", 1, 0);
	                                            }
	                                            v2_8 = 1;
	                                            v1_18 = v6_1;
	                                        }
	                                        v6_1 = v1_18;
	                                        v7_2 = v2_8;
	                                        v1_14 = (v10 + 1);
	                                        break;
	                                    default:
	                                }
	                            }
	                        }
	                        return v0_1;
	                }
	            }
	            v8 = v2_0;
	        }
	        v2_0 = v1_0;
	    }
	
	
	    static String a(String p7, int p8, int p9)
	    {
	        int v0_0 = p8;
	        while (v0_0 < p9) {
	            if (p7.charAt(v0_0) != 37) {
	                v0_0++;
	            } else {
	                djz v1_2 = new djz();
	                v1_2.a(p7, p8, v0_0);
	                while (v0_0 < p9) {
	                    int v2_0 = p7.codePointAt(v0_0);
	                    if ((v2_0 != 37) || ((v0_0 + 2) >= p9)) {
	                        v1_2.a(v2_0);
	                    } else {
	                        int v3_3 = dfq.a(p7.charAt((v0_0 + 1)));
	                        int v4_2 = dfq.a(p7.charAt((v0_0 + 2)));
	                        if ((v3_3 == -1) || (v4_2 == -1)) {
	                        } else {
	                            v1_2.b(((v3_3 << 4) + v4_2));
	                            v0_0 += 2;
	                        }
	                    }
	                    v0_0 += Character.charCount(v2_0);
	                }
	                int v0_1 = v1_2.n();
	            }
	            return v0_1;
	        }
	        v0_1 = p7.substring(p8, p9);
	        return v0_1;
	    }
	
	
	    static String a(String p7, int p8, int p9, String p10, boolean p11, boolean p12)
	    {
	        djz v0_0 = p8;
	        while (v0_0 < p9) {
	            char v1_0 = p7.codePointAt(v0_0);
	            if (((v1_0 >= 32) && ((v1_0 < 127) && ((p10.indexOf(v1_0) == -1) && ((v1_0 != 37) || (p11))))) && ((!p12) || (v1_0 != 43))) {
	                v0_0 += Character.charCount(v1_0);
	            } else {
	                int v3_2 = new djz();
	                v3_2.a(p7, p8, v0_0);
	                int v2_5 = v0_0;
	                djz v0_2 = 0;
	                while (v2_5 < p9) {
	                    int v4 = p7.codePointAt(v2_5);
	                    if ((!p11) || ((v4 != 9) && ((v4 != 10) && ((v4 != 12) && (v4 != 13))))) {
	                        if ((!p12) || (v4 != 43)) {
	                            if ((v4 >= 32) && ((v4 < 127) && ((p10.indexOf(v4) == -1) && ((v4 != 37) || (p11))))) {
	                                v3_2.a(v4);
	                            } else {
	                                if (v0_2 == null) {
	                                    v0_2 = new djz();
	                                }
	                                v0_2.a(v4);
	                                while (!v0_2.e()) {
	                                    char v1_14 = (v0_2.g() & 255);
	                                    v3_2.b(37);
	                                    v3_2.b(dfq.b[((v1_14 >> 4) & 15)]);
	                                    v3_2.b(dfq.b[(v1_14 & 15)]);
	                                }
	                            }
	                        } else {
	                            char v1_17;
	                            if (!p11) {
	                                v1_17 = "%2B";
	                            } else {
	                                v1_17 = "%20";
	                            }
	                            v3_2.a(v1_17);
	                        }
	                    }
	                    v2_5 = (Character.charCount(v4) + v2_5);
	                }
	                djz v0_1 = v3_2.n();
	            }
	            return v0_1;
	        }
	        v0_1 = p7.substring(p8, p9);
	        return v0_1;
	    }
	
	
	    private static java.util.List a(java.util.List p3)
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList(p3.size());
	        java.util.Iterator v2 = p3.iterator();
	        while (v2.hasNext()) {
	            int v0_5;
	            int v0_4 = ((String) v2.next());
	            if (v0_4 == 0) {
	                v0_5 = 0;
	            } else {
	                v0_5 = dfq.c(v0_4);
	            }
	            v1_1.add(v0_5);
	        }
	        return java.util.Collections.unmodifiableList(v1_1);
	    }
	
	
	    static void a(StringBuilder p3, java.util.List p4)
	    {
	        int v2 = p4.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            p3.append(47);
	            p3.append(((String) p4.get(v1)));
	            v1++;
	        }
	        return;
	    }
	
	
	    private static int b(String p3, int p4, int p5, String p6)
	    {
	        int v0 = p4;
	        while (v0 < p5) {
	            if (p6.indexOf(p3.charAt(v0)) == -1) {
	                v0++;
	            } else {
	                p5 = v0;
	                break;
	            }
	        }
	        return p5;
	    }
	
	
	    static java.util.List b(String p5)
	    {
	        java.util.ArrayList v2_1 = new java.util.ArrayList();
	        int v0_0 = 0;
	        while (v0_0 <= p5.length()) {
	            int v1_2 = p5.indexOf(38, v0_0);
	            if (v1_2 == -1) {
	                v1_2 = p5.length();
	            }
	            int v3_1 = p5.indexOf(61, v0_0);
	            if ((v3_1 != -1) && (v3_1 <= v1_2)) {
	                v2_1.add(p5.substring(v0_0, v3_1));
	                v2_1.add(p5.substring((v3_1 + 1), v1_2));
	            } else {
	                v2_1.add(p5.substring(v0_0, v1_2));
	                v2_1.add(0);
	            }
	            v0_0 = (v1_2 + 1);
	        }
	        return v2_1;
	    }
	
	
	    static void b(StringBuilder p5, java.util.List p6)
	    {
	        int v3 = p6.size();
	        int v2 = 0;
	        while (v2 < v3) {
	            int v0_2 = ((String) p6.get(v2));
	            String v1_2 = ((String) p6.get((v2 + 1)));
	            if (v2 > 0) {
	                p5.append(38);
	            }
	            p5.append(v0_2);
	            if (v1_2 != null) {
	                p5.append(61);
	                p5.append(v1_2);
	            }
	            v2 += 2;
	        }
	        return;
	    }
	
	
	    private static String c(String p2)
	    {
	        return dfq.a(p2, 0, p2.length());
	    }
	
	
	    public final java.net.URL a()
	    {
	        try {
	            return new java.net.URL(this.h);
	        } catch (java.net.MalformedURLException v0_2) {
	            throw new RuntimeException(v0_2);
	        }
	    }
	
	
	    public final java.net.URI b()
	    {
	        try {
	            return new java.net.URI(this.h);
	        } catch (IllegalStateException v0) {
	            throw new IllegalStateException(new StringBuilder("not valid as a java.net.URI: ").append(this.h).toString());
	        }
	    }
	
	
	    public final boolean equals(Object p3)
	    {
	        if ((!(p3 instanceof dfq)) || (!((dfq) p3).h.equals(this.h))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final int hashCode()
	    {
	        return this.h.hashCode();
	    }
	
	
	    public final String toString()
	    {
	        return this.h;
	    }
	
