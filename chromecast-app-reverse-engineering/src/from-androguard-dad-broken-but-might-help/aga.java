	public static final java.lang.String a
	private static java.util.regex.Pattern h
	private static bridge java.lang.String m
	 afb b
	public org.json.JSONObject c
	public android.os.Bundle d
	 agf e
	public java.lang.Object f
	public  g
	private agq i
	private java.lang.String j
	private  k
	private java.lang.String l
	
	    static aga()
	    {
	        aga.a = aga.getSimpleName();
	        aga.h = java.util.regex.Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
	        return;
	    }
	
	
	    public aga()
	    {
	        this(0, 0, 0, 0, 0);
	        return;
	    }
	
	
	    public aga(afb p8, String p9, android.os.Bundle p10, agq p11, agf p12)
	    {
	        this(p8, p9, p10, p11, p12, 0);
	        return;
	    }
	
	
	    private aga(afb p2, String p3, android.os.Bundle p4, agq p5, agf p6, String p7)
	    {
	        this.k = 1;
	        this.g = 0;
	        this.b = p2;
	        this.j = p3;
	        this.l = 0;
	        this.a(p6);
	        if (p5 == null) {
	            p5 = agq.a;
	        }
	        this.i = p5;
	        if (p4 == null) {
	            this.d = new android.os.Bundle();
	        } else {
	            this.d = new android.os.Bundle(p4);
	        }
	        if (this.l == null) {
	            this.l = ajh.d();
	        }
	        return;
	    }
	
	
	    public static aga a(afb p6, String p7, agf p8)
	    {
	        return new aga(0, p7, 0, 0, 0);
	    }
	
	
	    public static aga a(afb p6, String p7, org.json.JSONObject p8, agf p9)
	    {
	        aga v0_1 = new aga(0, p7, 0, agq.b, 0);
	        v0_1.c = 0;
	        return v0_1;
	    }
	
	
	    private String a(String p7)
	    {
	        java.util.Locale v2_0 = new android.net.Uri$Builder().encodedPath(p7);
	        String v3_0 = this.d.keySet().iterator();
	        while (v3_0.hasNext()) {
	            IllegalArgumentException v0_7 = ((String) v3_0.next());
	            String v1_1 = this.d.get(v0_7);
	            if (v1_1 == null) {
	                v1_1 = "";
	            }
	            if (!aga.d(v1_1)) {
	                if (this.i == agq.a) {
	                    Object[] v4_3 = new Object[1];
	                    v4_3[0] = v1_1.getClass().getSimpleName();
	                    throw new IllegalArgumentException(String.format(java.util.Locale.US, "Unsupported parameter type for GET request: %s", v4_3));
	                }
	            } else {
	                v2_0.appendQueryParameter(v0_7, aga.e(v1_1).toString());
	            }
	        }
	        return v2_0.toString();
	    }
	
	
	    public static java.util.List a(agm p4)
	    {
	        ajp.a(p4, "requests");
	        try {
	            java.util.List v0_2 = aga.a(aga.c(p4), p4);
	        } catch (java.util.List v0_3) {
	            v0_2 = agp.a(p4.b, 0, new afq(v0_3));
	            aga.a(p4, v0_2);
	        }
	        return v0_2;
	    }
	
	
	    public static java.util.List a(java.net.HttpURLConnection p10, agm p11)
	    {
	        android.os.Handler v0_0 = 1;
	        Integer v2_0 = agp.a(p10, p11);
	        aji.a(p10);
	        aff v3_0 = p11.size();
	        if (v3_0 == v2_0.size()) {
	            aga.a(p11, v2_0);
	            aff v3_1 = aff.a();
	            if (v3_1.b == null) {
	                v0_0 = 0;
	            } else {
	                long v4_5 = Long.valueOf(new java.util.Date().getTime());
	                if ((!v3_1.b.e.d) || (((v4_5.longValue() - v3_1.c.getTime()) <= 3600000) || ((v4_5.longValue() - v3_1.b.f.getTime()) <= 86400000))) {
	                }
	            }
	            if (v0_0 != null) {
	                if (!android.os.Looper.getMainLooper().equals(android.os.Looper.myLooper())) {
	                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new afg(v3_1));
	                } else {
	                    v3_1.b();
	                }
	            }
	            return v2_0;
	        } else {
	            Object[] v7_1 = new Object[2];
	            v7_1[0] = Integer.valueOf(v2_0.size());
	            v7_1[1] = Integer.valueOf(v3_0);
	            throw new afq(String.format(java.util.Locale.US, "Received %d responses while expecting %d", v7_1));
	        }
	    }
	
	
	    private static void a(agk p3, java.util.Collection p4, java.util.Map p5)
	    {
	        org.json.JSONArray v1_1 = new org.json.JSONArray();
	        java.util.Iterator v2 = p4.iterator();
	        while (v2.hasNext()) {
	            ((aga) v2.next()).a(v1_1, p5);
	        }
	        p3.a("batch", v1_1, p4);
	        return;
	    }
	
	
	    private static void a(agm p7, aiw p8, int p9, java.net.URL p10, java.io.OutputStream p11, boolean p12)
	    {
	        String v1_1 = new agk(p11, p8, p12);
	        if (p9 != 1) {
	            org.json.JSONObject v0_1 = aga.f(p7);
	            if (!aji.a(v0_1)) {
	                v1_1.a("batch_app_id", v0_1);
	                org.json.JSONObject v0_3 = new java.util.HashMap();
	                aga.a(v1_1, p7, v0_3);
	                if (p8 != null) {
	                    p8.b("  Attachments:\n");
	                }
	                aga.a(v0_3, v1_1);
	            } else {
	                throw new afq("App ID was not specified at the request or Settings.");
	            }
	        } else {
	            String v2_3 = p7.a(0);
	            java.util.HashMap v3_1 = new java.util.HashMap();
	            java.util.Iterator v4 = v2_3.d.keySet().iterator();
	            while (v4.hasNext()) {
	                org.json.JSONObject v0_16 = ((String) v4.next());
	                Object v5_1 = v2_3.d.get(v0_16);
	                if (aga.c(v5_1)) {
	                    v3_1.put(v0_16, new age(v2_3, v5_1));
	                }
	            }
	            if (p8 != null) {
	                p8.b("  Parameters:\n");
	            }
	            aga.a(v2_3.d, v1_1, v2_3);
	            if (p8 != null) {
	                p8.b("  Attachments:\n");
	            }
	            aga.a(v3_1, v1_1);
	            if (v2_3.c != null) {
	                aga.a(v2_3.c, p10.getPath(), v1_1);
	            }
	        }
	        return;
	    }
	
	
	    private static void a(agm p6, java.util.List p7)
	    {
	        android.os.Handler v1_0 = p6.size();
	        java.util.ArrayList v2_1 = new java.util.ArrayList();
	        agc v0_0 = 0;
	        while (v0_0 < v1_0) {
	            agf v3_0 = p6.a(v0_0);
	            if (v3_0.e != null) {
	                v2_1.add(new android.util.Pair(v3_0.e, p7.get(v0_0)));
	            }
	            v0_0++;
	        }
	        if (v2_1.size() > 0) {
	            agc v0_3 = new agc(v2_1, p6);
	            android.os.Handler v1_1 = p6.a;
	            if (v1_1 != null) {
	                v1_1.post(v0_3);
	            } else {
	                v0_3.run();
	            }
	        }
	        return;
	    }
	
	
	    private static void a(android.os.Bundle p4, agk p5, aga p6)
	    {
	        java.util.Iterator v1 = p4.keySet().iterator();
	        while (v1.hasNext()) {
	            String v0_3 = ((String) v1.next());
	            Object v2 = p4.get(v0_3);
	            if (aga.d(v2)) {
	                p5.a(v0_3, v2, p6);
	            }
	        }
	        return;
	    }
	
	
	    private static void a(String p9, Object p10, agg p11, boolean p12)
	    {
	        String v0_0 = p10.getClass();
	        if (!org.json.JSONObject.isAssignableFrom(v0_0)) {
	            if (!org.json.JSONArray.isAssignableFrom(v0_0)) {
	                if ((!String.isAssignableFrom(v0_0)) && ((!Number.isAssignableFrom(v0_0)) && (!Boolean.isAssignableFrom(v0_0)))) {
	                    if (java.util.Date.isAssignableFrom(v0_0)) {
	                        p11.a(p9, new java.text.SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ssZ", java.util.Locale.US).format(((java.util.Date) p10)));
	                    }
	                } else {
	                    p11.a(p9, p10.toString());
	                }
	            } else {
	                java.util.Locale v2_5 = ((org.json.JSONArray) p10).length();
	                String v0_6 = 0;
	                while (v0_6 < v2_5) {
	                    Object[] v5 = new Object[2];
	                    v5[0] = p9;
	                    v5[1] = Integer.valueOf(v0_6);
	                    aga.a(String.format(java.util.Locale.ROOT, "%s[%d]", v5), ((org.json.JSONArray) p10).opt(v0_6), p11, p12);
	                    v0_6++;
	                }
	            }
	        } else {
	            if (!p12) {
	                if (!((org.json.JSONObject) p10).has("id")) {
	                    if (!((org.json.JSONObject) p10).has("url")) {
	                        if (((org.json.JSONObject) p10).has("fbsdk:create_object")) {
	                            aga.a(p9, ((org.json.JSONObject) p10).toString(), p11, p12);
	                        }
	                    } else {
	                        aga.a(p9, ((org.json.JSONObject) p10).optString("url"), p11, p12);
	                    }
	                } else {
	                    aga.a(p9, ((org.json.JSONObject) p10).optString("id"), p11, p12);
	                }
	            } else {
	                java.util.Locale v2_6 = ((org.json.JSONObject) p10).keys();
	                while (v2_6.hasNext()) {
	                    String v0_20 = ((String) v2_6.next());
	                    Object v4_2 = new Object[2];
	                    v4_2[0] = p9;
	                    v4_2[1] = v0_20;
	                    aga.a(String.format("%s[%s]", v4_2), ((org.json.JSONObject) p10).opt(v0_20), p11, p12);
	                }
	            }
	        }
	        return;
	    }
	
	
	    private static void a(java.util.Map p4, agk p5)
	    {
	        java.util.Iterator v2 = p4.keySet().iterator();
	        while (v2.hasNext()) {
	            String v0_3 = ((String) v2.next());
	            aga v1_1 = ((age) p4.get(v0_3));
	            if (aga.c(v1_1.b)) {
	                p5.a(v0_3, v1_1.b, v1_1.a);
	            }
	        }
	        return;
	    }
	
	
	    private void a(org.json.JSONArray p11, java.util.Map p12)
	    {
	        org.json.JSONObject v1_1 = new org.json.JSONObject();
	        String v2_0 = this.c();
	        v1_1.put("relative_url", v2_0);
	        v1_1.put("method", this.i);
	        if (this.b != null) {
	            aiw.a(this.b.d);
	        }
	        org.json.JSONObject v3_2 = new java.util.ArrayList();
	        agd v4_0 = this.d.keySet().iterator();
	        while (v4_0.hasNext()) {
	            String v0_17 = this.d.get(((String) v4_0.next()));
	            if (aga.c(v0_17)) {
	                Object[] v7_1 = new Object[2];
	                v7_1[0] = "file";
	                v7_1[1] = Integer.valueOf(p12.size());
	                String v5_3 = String.format(java.util.Locale.ROOT, "%s%d", v7_1);
	                v3_2.add(v5_3);
	                p12.put(v5_3, new age(this, v0_17));
	            }
	        }
	        if (!v3_2.isEmpty()) {
	            v1_1.put("attached_files", android.text.TextUtils.join(",", v3_2));
	        }
	        if (this.c != null) {
	            String v0_13 = new java.util.ArrayList();
	            aga.a(this.c, v2_0, new agd(this, v0_13));
	            v1_1.put("body", android.text.TextUtils.join("&", v0_13));
	        }
	        p11.put(v1_1);
	        return;
	    }
	
	
	    private static void a(org.json.JSONObject p7, String p8, agg p9)
	    {
	        String v0_2;
	        String v0_1 = aga.h.matcher(p8);
	        if (!v0_1.matches()) {
	            v0_2 = p8;
	        } else {
	            v0_2 = v0_1.group(1);
	        }
	        if ((!v0_2.startsWith("me/")) && (!v0_2.startsWith("/me/"))) {
	            String v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        int v3_4;
	        if (v0_4 == null) {
	            v3_4 = 0;
	        } else {
	            String v0_7;
	            String v0_6 = p8.indexOf(":");
	            int v3_6 = p8.indexOf("?");
	            if ((v0_6 <= 3) || ((v3_6 != -1) && (v0_6 >= v3_6))) {
	                v0_7 = 0;
	            } else {
	                v0_7 = 1;
	            }
	            v3_4 = v0_7;
	        }
	        java.util.Iterator v5 = p7.keys();
	        while (v5.hasNext()) {
	            int v4_4;
	            String v0_10 = ((String) v5.next());
	            Object v6 = p7.opt(v0_10);
	            if ((v3_4 == 0) || (!v0_10.equalsIgnoreCase("image"))) {
	                v4_4 = 0;
	            } else {
	                v4_4 = 1;
	            }
	            aga.a(v0_10, v6, p9, v4_4);
	        }
	        return;
	    }
	
	
	    static synthetic boolean a(Object p1)
	    {
	        return aga.d(p1);
	    }
	
	
	    public static agl b(agm p1)
	    {
	        ajp.a(p1, "requests");
	        agl v0_2 = new agl(p1);
	        v0_2.a();
	        return v0_2;
	    }
	
	
	    static synthetic String b(Object p1)
	    {
	        return aga.e(p1);
	    }
	
	
	    private void b()
	    {
	        if (this.b == null) {
	            if ((!this.g) && (!this.d.containsKey("access_token"))) {
	                String v0_4 = afv.h();
	                android.os.Bundle v1_1 = afv.i();
	                if ((!aji.a(v0_4)) && (!aji.a(v1_1))) {
	                    this.d.putString("access_token", new StringBuilder(((String.valueOf(v0_4).length() + 1) + String.valueOf(v1_1).length())).append(v0_4).append("|").append(v1_1).toString());
	                }
	            }
	        } else {
	            if (!this.d.containsKey("access_token")) {
	                String v0_12 = this.b.d;
	                aiw.a(v0_12);
	                this.d.putString("access_token", v0_12);
	            }
	        }
	        this.d.putString("sdk", "android");
	        this.d.putString("format", "json");
	        if (!afv.a(ags.h)) {
	            if (afv.a(ags.g)) {
	                this.d.putString("debug", "warning");
	            }
	        } else {
	            this.d.putString("debug", "info");
	        }
	        return;
	    }
	
	
	    private String c()
	    {
	        String v0_0 = this.d();
	        this.b();
	        return this.a(v0_0);
	    }
	
	
	    private static java.net.HttpURLConnection c(agm p16)
	    {
	        try {
	            Throwable v2_2;
	            if (p16.size() != 1) {
	                v2_2 = new java.net.URL(ajh.b());
	            } else {
	                String v4_5;
	                java.net.URL v5_0 = p16.a(0);
	                if ((v5_0.i != agq.b) || ((v5_0.j == null) || (!v5_0.j.endsWith("/videos")))) {
	                    v4_5 = ajh.b();
	                } else {
	                    v4_5 = ajh.c();
	                }
	                java.util.zip.GZIPOutputStream v9_1 = new Object[2];
	                v9_1[0] = v4_5;
	                v9_1[1] = v5_0.d();
	                v2_2 = new java.net.URL(v5_0.b().a(String.format("%s/%s", v9_1)));
	            }
	            try {
	                java.net.HttpURLConnection v14 = ((java.net.HttpURLConnection) v2_2.openConnection());
	            } catch (Throwable v2_26) {
	                throw new afq("could not construct request body", v2_26);
	            } catch (Throwable v2_25) {
	                throw new afq("could not construct request body", v2_25);
	            }
	            if (aga.m == null) {
	                java.net.URL v5_3 = new Object[2];
	                v5_3[0] = "FBAndroidSDK";
	                v5_3[1] = "4.4.1";
	                aga.m = String.format("%s.%s", v5_3);
	                String v4_13 = a.dd;
	                if (!aji.a(v4_13)) {
	                    java.util.zip.GZIPOutputStream v9_5 = new Object[2];
	                    v9_5[0] = aga.m;
	                    v9_5[1] = v4_13;
	                    aga.m = String.format(java.util.Locale.ROOT, "%s/%s", v9_5);
	                }
	            }
	            Throwable v2_11;
	            v14.setRequestProperty("User-Agent", aga.m);
	            v14.setRequestProperty("Accept-Language", java.util.Locale.getDefault().toString());
	            v14.setChunkedStreamingMode(0);
	            aiw v15_1 = new aiw(ags.a, "Request");
	            String v4_19 = p16.size();
	            String v7_6 = aga.e(p16);
	            if (v4_19 != 1) {
	                v2_11 = agq.b;
	            } else {
	                v2_11 = p16.a(0).i;
	            }
	            v14.setRequestMethod(v2_11.name());
	            if (v7_6 == null) {
	                agm v10_5 = new Object[1];
	                v10_5[0] = "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f";
	                v14.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", v10_5));
	            } else {
	                v14.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	                v14.setRequestProperty("Content-Encoding", "gzip");
	            }
	            Throwable v2_14;
	            java.net.URL v5_10 = v14.getURL();
	            v15_1.b("Request:\n");
	            v15_1.a("Id", p16.c);
	            v15_1.a("URL", v5_10);
	            v15_1.a("Method", v14.getRequestMethod());
	            v15_1.a("User-Agent", v14.getRequestProperty("User-Agent"));
	            v15_1.a("Content-Type", v14.getRequestProperty("Content-Type"));
	            v14.setConnectTimeout(0);
	            v14.setReadTimeout(0);
	            if (v2_11 != agq.b) {
	                v2_14 = 0;
	            } else {
	                v2_14 = 1;
	            }
	            if (v2_14 != null) {
	                v14.setDoOutput(1);
	                try {
	                    java.util.zip.GZIPOutputStream v9_20 = new java.io.BufferedOutputStream(v14.getOutputStream());
	                } catch (Throwable v2_17) {
	                    v9_20 = 0;
	                    if (v9_20 != null) {
	                        v9_20.close();
	                    }
	                    throw v2_17;
	                }
	                try {
	                    if (v7_6 != null) {
	                        v9_20 = new java.util.zip.GZIPOutputStream(v9_20);
	                    }
	                } catch (Throwable v2_17) {
	                }
	                java.util.zip.GZIPOutputStream v6_1;
	                if (!aga.d(p16)) {
	                    v6_1 = v9_20;
	                } else {
	                    java.util.zip.GZIPOutputStream v6_3 = new agy(p16.a);
	                    aga.a(p16, 0, v4_19, v5_10, v6_3, v7_6);
	                    v6_1 = new agz(v9_20, p16, v6_3.a, ((long) v6_3.b));
	                }
	                try {
	                    aga.a(p16, v15_1, v4_19, v5_10, v6_1, v7_6);
	                } catch (Throwable v2_17) {
	                    v9_20 = v6_1;
	                }
	                v6_1.close();
	                v15_1.a();
	            } else {
	                v15_1.a();
	            }
	            return v14;
	        } catch (Throwable v2_5) {
	            throw new afq("could not construct URL for request", v2_5);
	        }
	    }
	
	
	    private static boolean c(Object p1)
	    {
	        if ((!(p1 instanceof android.graphics.Bitmap)) && ((!(p1 instanceof byte[])) && ((!(p1 instanceof android.net.Uri)) && ((!(p1 instanceof android.os.ParcelFileDescriptor)) && (!(p1 instanceof agi)))))) {
	            int v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
	
	    private String d()
	    {
	        String v0_4;
	        if (!aga.h.matcher(this.j).matches()) {
	            Object[] v1_2 = new Object[2];
	            v1_2[0] = this.l;
	            v1_2[1] = this.j;
	            v0_4 = String.format("%s/%s", v1_2);
	        } else {
	            v0_4 = this.j;
	        }
	        return v0_4;
	    }
	
	
	    private static boolean d(agm p3)
	    {
	        java.util.Iterator v2_0 = p3.d.iterator();
	        while (v2_0.hasNext()) {
	            if ((((agn) v2_0.next()) instanceof ago)) {
	                int v0_3 = 1;
	            }
	            return v0_3;
	        }
	        java.util.Iterator v2_1 = p3.iterator();
	        while (v2_1.hasNext()) {
	            if ((((aga) v2_1.next()).e instanceof agh)) {
	                v0_3 = 1;
	            }
	            return v0_3;
	        }
	        v0_3 = 0;
	        return v0_3;
	    }
	
	
	    private static boolean d(Object p1)
	    {
	        if ((!(p1 instanceof String)) && ((!(p1 instanceof Boolean)) && ((!(p1 instanceof Number)) && (!(p1 instanceof java.util.Date))))) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    private static String e(Object p3)
	    {
	        String v3_1;
	        if (!(p3 instanceof String)) {
	            if ((!(p3 instanceof Boolean)) && (!(p3 instanceof Number))) {
	                if (!(p3 instanceof java.util.Date)) {
	                    throw new IllegalArgumentException("Unsupported parameter type.");
	                } else {
	                    v3_1 = new java.text.SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ssZ", java.util.Locale.US).format(p3);
	                }
	            } else {
	                v3_1 = p3.toString();
	            }
	        } else {
	            v3_1 = ((String) p3);
	        }
	        return v3_1;
	    }
	
	
	    private static boolean e(agm p5)
	    {
	        java.util.Iterator v2 = p5.iterator();
	        while (v2.hasNext()) {
	            int v0_3 = ((aga) v2.next());
	            java.util.Iterator v3 = v0_3.d.keySet().iterator();
	            while (v3.hasNext()) {
	                if (aga.c(v0_3.d.get(((String) v3.next())))) {
	                    int v0_1 = 0;
	                }
	                return v0_1;
	            }
	        }
	        v0_1 = 1;
	        return v0_1;
	    }
	
	
	    private static String f(agm p3)
	    {
	        String v0_3;
	        if (aji.a(0)) {
	            java.util.Iterator v2 = p3.iterator();
	            while (v2.hasNext()) {
	                String v0_6 = ((aga) v2.next()).b;
	                if (v0_6 != null) {
	                    v0_3 = v0_6.g;
	                    if (v0_3 != null) {
	                    }
	                }
	            }
	            if (aji.a(0)) {
	                v0_3 = afv.h();
	            } else {
	                v0_3 = 0;
	            }
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public final agp a()
	    {
	        agp v0_0 = new aga[1];
	        v0_0[0] = this;
	        ajp.a(v0_0, "requests");
	        agp v0_2 = aga.a(new agm(java.util.Arrays.asList(v0_0)));
	        if ((v0_2 != null) && (v0_2.size() == 1)) {
	            return ((agp) v0_2.get(0));
	        } else {
	            throw new afq("invalid state: expected a single response");
	        }
	    }
	
	
	    public final void a(agf p2)
	    {
	        if ((!afv.a(ags.h)) && (!afv.a(ags.g))) {
	            this.e = p2;
	        } else {
	            this.e = new agb(this, p2);
	        }
	        return;
	    }
	
	
	    public String toString()
	    {
	        String v0_3;
	        String v1_2 = new StringBuilder("{Request: ").append(" accessToken: ");
	        if (this.b != null) {
	            v0_3 = this.b;
	        } else {
	            v0_3 = "null";
	        }
	        return v1_2.append(v0_3).append(", graphPath: ").append(this.j).append(", graphObject: ").append(this.c).append(", httpMethod: ").append(this.i).append(", parameters: ").append(this.d).append("}").toString();
	    }
	
