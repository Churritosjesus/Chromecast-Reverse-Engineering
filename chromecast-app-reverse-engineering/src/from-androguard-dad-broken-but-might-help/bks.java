	private static final java.util.regex.Pattern a
	private static final bkv b
	private static final bkv c
	private static final bkv d
	private static final bku e
	private static final java.util.regex.Pattern f
	
	    static bks()
	    {
	        bks.a = java.util.regex.Pattern.compile("[swh]\\d+");
	        bks.b = bkv.a("-").a();
	        bks.c = bkv.a("=").a();
	        bks.d = bkv.a("/").a();
	        bks.e = new bku("/");
	        bks.f = java.util.regex.Pattern.compile("^((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z])?\\.((ggpht)|(googleusercontent)|(google)))|(ci[3-6]\\.((ggpht)|(googleusercontent)|(google)))|((cp|gp)[3-6]\\.((ggpht)|(googleusercontent)|(google)))|([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com/image)|(www\\.google\\.com\\/visualsearch\\/lh))\\/");
	        return;
	    }
	
	
	    public static String a(int p9, int p10, String p11)
	    {
	        String v2_0 = 1;
	        if (p11 != null) {
	            if (bks.a(p11)) {
	                android.net.Uri v0_1 = bks.b(p11);
	                android.graphics.Point v4_1 = new android.graphics.Point();
	                if (p10 != 0) {
	                    if (p9 != 0) {
	                        v4_1.x = p9;
	                        v4_1.y = p10;
	                    } else {
	                        if ((v0_1.x <= 0) || (v0_1.y <= 0)) {
	                            android.net.Uri v0_2 = 0;
	                        } else {
	                            v0_2 = ((v0_1.x * p10) / v0_1.y);
	                        }
	                        v4_1.x = v0_2;
	                        v4_1.y = p10;
	                    }
	                } else {
	                    android.net.Uri v0_4;
	                    v4_1.x = p9;
	                    if ((v0_1.x <= 0) || (v0_1.y <= 0)) {
	                        v0_4 = 0;
	                    } else {
	                        v0_4 = ((v0_1.y * p9) / v0_1.x);
	                    }
	                    v4_1.y = v0_4;
	                }
	                int v3_8 = android.net.Uri.parse(p11);
	                StringBuilder v5_1 = bks.a(bks.d.a(v3_8.getPath()));
	                android.net.Uri v0_8 = v5_1.size();
	                if (bks.a(v5_1)) {
	                    v0_8--;
	                }
	                if ((v0_8 < 4) || (v0_8 > 6)) {
	                    if (v0_8 != 1) {
	                        android.net.Uri v0_9 = v3_8;
	                    } else {
	                        android.net.Uri v0_10 = v3_8.getPath();
	                        String v2_2 = new StringBuilder();
	                        StringBuilder v5_5 = v0_10.indexOf("=");
	                        if (v5_5 < null) {
	                            v2_2.append(v0_10).append("=");
	                            bks.a(v4_1, v2_2);
	                        } else {
	                            android.net.Uri$Builder v1_2 = v0_10.substring(0, v5_5);
	                            android.net.Uri v0_12 = v0_10.substring((v5_5 + 1));
	                            v2_2.append(v1_2).append("=");
	                            bks.a(v4_1, v2_2);
	                            bks.a(v0_12, v2_2);
	                        }
	                        v0_9 = v3_8.buildUpon().path(v2_2.toString()).build();
	                    }
	                } else {
	                    StringBuilder v5_8 = v3_8.getPath();
	                    java.util.ArrayList v6 = bks.a(bks.d.a(v5_8));
	                    if ((v6.size() <= 0) || (!((String) v6.get(0)).equals("image"))) {
	                        v2_0 = 0;
	                    } else {
	                        v6.remove(0);
	                    }
	                    if (v5_8.endsWith("/")) {
	                        v6.add("");
	                    }
	                    if (v6.size() != 4) {
	                        if (v6.size() == 5) {
	                            v6.add(4, "");
	                        }
	                    } else {
	                        v6.add("");
	                    }
	                    StringBuilder v5_11 = new StringBuilder();
	                    bks.a(v4_1, v5_11);
	                    bks.a(((String) v6.get(4)), v5_11);
	                    v6.set(4, v5_11.toString());
	                    if (v2_0 != null) {
	                        v6.add(0, "image");
	                    }
	                    android.net.Uri v0_37;
	                    android.net.Uri$Builder v1_5 = v3_8.buildUpon();
	                    android.net.Uri v0_35 = String.valueOf(bks.e.a(new StringBuilder(), v6).toString());
	                    if (v0_35.length() == 0) {
	                        v0_37 = new String("/");
	                    } else {
	                        v0_37 = "/".concat(v0_35);
	                    }
	                    v0_9 = v1_5.path(v0_37).build();
	                }
	                p11 = android.net.Uri.decode(v0_9.toString());
	            }
	        } else {
	            p11 = 0;
	        }
	        return p11;
	    }
	
	
	    private static java.util.ArrayList a(Iterable p3)
	    {
	        java.util.ArrayList v0_2;
	        if (!(p3 instanceof java.util.Collection)) {
	            java.util.Iterator v1 = p3.iterator();
	            v0_2 = new java.util.ArrayList();
	            while (v1.hasNext()) {
	                v0_2.add(v1.next());
	            }
	        } else {
	            v0_2 = new java.util.ArrayList(((java.util.Collection) p3));
	        }
	        return v0_2;
	    }
	
	
	    private static void a(android.graphics.Point p2, StringBuilder p3)
	    {
	        if (p2.x > 0) {
	            p3.append("w").append(p2.x);
	        }
	        if (p2.y > 0) {
	            if (p3.length() > 0) {
	                p3.append("-");
	            }
	            p3.append("h").append(p2.y);
	        }
	        return;
	    }
	
	
	    private static void a(String p3, StringBuilder p4)
	    {
	        java.util.Iterator v1 = bks.b.a(p3).iterator();
	        while (v1.hasNext()) {
	            String v0_4 = ((String) v1.next());
	            if (!bks.a.matcher(v0_4).find()) {
	                p4.append("-").append(v0_4);
	            }
	        }
	        return;
	    }
	
	
	    private static boolean a(String p1)
	    {
	        boolean v0_2;
	        if (p1 != null) {
	            v0_2 = bks.f.matcher(p1).find();
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    private static boolean a(java.util.List p4)
	    {
	        if ((p4.size() <= 1) || ((!((String) p4.get(0)).equals("image")) && ((!((String) p4.get(0)).equals("public")) && ((!((String) p4.get(0)).equals("proxy")) && (!((String) p4.get(0)).equals("private")))))) {
	            boolean v0_13 = 0;
	        } else {
	            v0_13 = 1;
	        }
	        return v0_13;
	    }
	
	
	    private static android.graphics.Point b(String p8)
	    {
	        int v0_19;
	        android.graphics.Point v2_1 = new android.graphics.Point();
	        if ((p8 != null) && (bks.a(p8))) {
	            int v4_0 = android.net.Uri.parse(p8);
	            java.util.ArrayList v5_1 = bks.a(bks.d.a(v4_0.getPath()));
	            int v0_3 = v5_1.size();
	            if (bks.a(v5_1)) {
	                v0_3--;
	            }
	            if ((v0_3 < 4) || (v0_3 > 6)) {
	                if (v0_3 != 1) {
	                    int v0_4 = "";
	                } else {
	                    int v0_7 = bks.a(bks.c.a(v4_0.getPath()));
	                    if (v0_7.size() <= 1) {
	                        v0_4 = "";
	                    } else {
	                        v0_4 = ((String) v0_7.get(1));
	                    }
	                }
	            } else {
	                int v4_3 = v4_0.getPath();
	                java.util.ArrayList v5_4 = bks.a(bks.d.a(v4_3));
	                if ((v5_4.size() > 0) && (((String) v5_4.get(0)).equals("image"))) {
	                    v5_4.remove(0);
	                }
	                int v4_6;
	                int v0_15 = v5_4.size();
	                if ((v4_3.endsWith("/")) || (v0_15 != 5)) {
	                    v4_6 = 0;
	                } else {
	                    v4_6 = 1;
	                }
	                int v0_16;
	                if (v0_15 != 4) {
	                    v0_16 = 0;
	                } else {
	                    v0_16 = 1;
	                }
	                if ((v4_6 != 0) || (v0_16 != 0)) {
	                    v0_4 = "";
	                } else {
	                    v0_4 = ((String) v5_4.get(4));
	                }
	            }
	            if (!android.text.TextUtils.isEmpty(v0_4)) {
	                String[] v3_3 = v0_4.split("-");
	                int v0_18 = 0;
	                while (v0_18 < v3_3.length) {
	                    int v1_2 = v3_3[v0_18];
	                    try {
	                        if (!v1_2.startsWith("w")) {
	                            if (v1_2.startsWith("h")) {
	                                v2_1.y = Integer.parseInt(v1_2.substring(1));
	                            }
	                        } else {
	                            v2_1.x = Integer.parseInt(v1_2.substring(1));
	                        }
	                        v0_18++;
	                    } catch (int v1) {
	                    }
	                }
	                v0_19 = v2_1;
	            } else {
	                v0_19 = v2_1;
	            }
	        } else {
	            v0_19 = v2_1;
	        }
	        return v0_19;
	    }
	
