	private static final Ljava.lang.String a
	private static java.util.Map b
	private static java.util.concurrent.atomic.AtomicBoolean c
	private static  d
	private static  e
	private static  f
	private static  g
	private static java.lang.String h
	private static java.lang.String i
	
	    static aji()
	    {
	        String v0_1 = new String[5];
	        v0_1[0] = "supports_implicit_sdk_logging";
	        v0_1[1] = "gdpv4_nux_content";
	        v0_1[2] = "gdpv4_nux_enabled";
	        v0_1[3] = "android_dialog_configs";
	        v0_1[4] = "android_sdk_error_categories";
	        aji.a = v0_1;
	        aji.b = new java.util.concurrent.ConcurrentHashMap();
	        aji.c = new java.util.concurrent.atomic.AtomicBoolean(0);
	        aji.d = 0;
	        aji.e = -1;
	        aji.f = -1;
	        aji.g = -1;
	        aji.h = "";
	        aji.i = "NoCarrier";
	        return;
	    }
	
	
	    public static int a(java.io.InputStream p5, java.io.OutputStream p6)
	    {
	        int v0_0 = 0;
	        try {
	            int v1_1 = new java.io.BufferedInputStream(p5);
	        } catch (int v0_1) {
	            v1_1 = 8192;
	            if (v1_1 != 0) {
	                v1_1.close();
	            }
	            if (p5 != null) {
	                p5.close();
	            }
	            throw v0_1;
	        }
	        try {
	            byte[] v2_1 = new byte[8192];
	        } catch (int v0_1) {
	        }
	        while(true) {
	            int v3 = v1_1.read(v2_1);
	            if (v3 == -1) {
	                break;
	            }
	            p6.write(v2_1, 0, v3);
	            v0_0 += v3;
	        }
	        v1_1.close();
	        if (p5 != null) {
	            p5.close();
	        }
	        return v0_0;
	    }
	
	
	    private static long a(double p2)
	    {
	        return Math.round((p2 / 1073741824.0));
	    }
	
	
	    public static long a(android.net.Uri p7)
	    {
	        try {
	            int v1_1 = afv.f().getContentResolver().query(p7, 0, 0, 0, 0);
	            try {
	                Throwable v0_4 = v1_1.getColumnIndex("_size");
	                v1_1.moveToFirst();
	                long v2_1 = v1_1.getLong(v0_4);
	            } catch (Throwable v0_2) {
	                if (v1_1 != 0) {
	                    v1_1.close();
	                }
	                throw v0_2;
	            }
	            if (v1_1 != 0) {
	                v1_1.close();
	            }
	            return v2_1;
	        } catch (Throwable v0_2) {
	            v1_1 = 0;
	        }
	    }
	
	
	    static synthetic ajn a(String p1, org.json.JSONObject p2)
	    {
	        return aji.b(p1, p2);
	    }
	
	
	    public static ajn a(String p1, boolean p2)
	    {
	        if ((p2) || (!aji.b.containsKey(p1))) {
	            ajn v0_2 = aji.f(p1);
	            if (v0_2 != null) {
	                ajn v0_3 = aji.b(p1, v0_2);
	            } else {
	                v0_3 = 0;
	            }
	        } else {
	            v0_3 = ((ajn) aji.b.get(p1));
	        }
	        return v0_3;
	    }
	
	
	    public static android.net.Uri a(String p5, String p6, android.os.Bundle p7)
	    {
	        android.net.Uri$Builder v2_1 = new android.net.Uri$Builder();
	        v2_1.scheme("https");
	        v2_1.authority(p5);
	        v2_1.path(p6);
	        if (p7 != null) {
	            java.util.Iterator v3 = p7.keySet().iterator();
	            while (v3.hasNext()) {
	                String v0_5 = ((String) v3.next());
	                String v1_0 = p7.get(v0_5);
	                if ((v1_0 instanceof String)) {
	                    v2_1.appendQueryParameter(v0_5, ((String) v1_0));
	                }
	            }
	        }
	        return v2_1.build();
	    }
	
	
	    public static varargs Object a(Object p2, reflect.Method p3, Object[] p4)
	    {
	        try {
	            Object v0 = p3.invoke(p2, p4);
	        } catch (reflect.InvocationTargetException v1) {
	        } catch (reflect.InvocationTargetException v1) {
	        }
	        return v0;
	    }
	
	
	    public static Object a(org.json.JSONObject p2, String p3, String p4)
	    {
	        String v1_1;
	        afq v0_0 = p2.opt(p3);
	        if ((v0_0 == null) || (!(v0_0 instanceof String))) {
	            v1_1 = v0_0;
	        } else {
	            v1_1 = new org.json.JSONTokener(((String) v0_0)).nextValue();
	        }
	        if ((v1_1 == null) || (((v1_1 instanceof org.json.JSONObject)) || ((v1_1 instanceof org.json.JSONArray)))) {
	            afq v0_5 = v1_1;
	        } else {
	            if (p4 == null) {
	                throw new afq("Got an unexpected non-JSON object.");
	            } else {
	                v0_5 = new org.json.JSONObject();
	                v0_5.putOpt(p4, v1_1);
	            }
	        }
	        return v0_5;
	    }
	
	
	    public static String a(android.content.Context p1)
	    {
	        ajp.a(p1, "context");
	        afv.a(p1);
	        return afv.h();
	    }
	
	
	    public static String a(java.io.InputStream p6)
	    {
	        java.io.BufferedInputStream v2_0 = 0;
	        try {
	            java.io.BufferedInputStream v3_1 = new java.io.BufferedInputStream(p6);
	        } catch (String v0_0) {
	            int v1_0 = 0;
	            aji.a(v2_0);
	            aji.a(v1_0);
	            throw v0_0;
	        }
	        try {
	            v1_0 = new java.io.InputStreamReader(v3_1);
	        } catch (String v0_0) {
	            v1_0 = 0;
	            v2_0 = v3_1;
	        }
	        try {
	            String v0_2 = new StringBuilder();
	            java.io.BufferedInputStream v2_2 = new char[2048];
	        } catch (String v0_0) {
	            v2_0 = v3_1;
	        }
	        while(true) {
	            int v4 = v1_0.read(v2_2);
	            if (v4 == -1) {
	                break;
	            }
	            v0_2.append(v2_2, 0, v4);
	        }
	        String v0_3 = v0_2.toString();
	        aji.a(v3_1);
	        aji.a(v1_0);
	        return v0_3;
	    }
	
	
	    private static String a(String p6, byte[] p7)
	    {
	        try {
	            String v0_0 = java.security.MessageDigest.getInstance(p6);
	            v0_0.update(p7);
	            byte[] v1 = v0_0.digest();
	            StringBuilder v2_1 = new StringBuilder();
	            int v3 = v1.length;
	            String v0_1 = 0;
	        } catch (String v0) {
	            String v0_2 = 0;
	            return v0_2;
	        }
	        while (v0_1 < v3) {
	            String v4_0 = v1[v0_1];
	            v2_1.append(Integer.toHexString(((v4_0 >> 4) & 15)));
	            v2_1.append(Integer.toHexString((v4_0 & 15)));
	            v0_1++;
	        }
	        v0_2 = v2_1.toString();
	        return v0_2;
	    }
	
	
	    public static String a(byte[] p1)
	    {
	        return aji.a("SHA-1", p1);
	    }
	
	
	    public static varargs reflect.Method a(Class p1, String p2, Class[] p3)
	    {
	        try {
	            int v0 = p1.getMethod(p2, p3);
	        } catch (int v0) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public static varargs reflect.Method a(String p1, String p2, Class[] p3)
	    {
	        try {
	            int v0_1 = aji.a(Class.forName(p1), p2, p3);
	        } catch (int v0) {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public static varargs java.util.Collection a(Object[] p1)
	    {
	        return java.util.Collections.unmodifiableCollection(java.util.Arrays.asList(p1));
	    }
	
	
	    public static java.util.Date a(android.os.Bundle p8, String p9, java.util.Date p10)
	    {
	        int v0_1;
	        if (p8 != null) {
	            long v2_2;
	            int v0_0 = p8.get(p9);
	            if (!(v0_0 instanceof Long)) {
	                if (!(v0_0 instanceof String)) {
	                    v0_1 = 0;
	                    return v0_1;
	                } else {
	                    try {
	                        v2_2 = Long.parseLong(((String) v0_0));
	                    } catch (int v0) {
	                        v0_1 = 0;
	                        return v0_1;
	                    }
	                }
	            } else {
	                v2_2 = ((Long) v0_0).longValue();
	            }
	            if (v2_2 != 0) {
	                v0_1 = new java.util.Date(((v2_2 * 1000) + p10.getTime()));
	            } else {
	                v0_1 = new java.util.Date(nan);
	            }
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public static java.util.List a(org.json.JSONArray p3)
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList();
	        int v0 = 0;
	        while (v0 < p3.length()) {
	            v1_1.add(p3.getString(v0));
	            v0++;
	        }
	        return v1_1;
	    }
	
	
	    public static java.util.Map a(android.os.Parcel p5)
	    {
	        java.util.HashMap v0_1;
	        int v2 = p5.readInt();
	        if (v2 >= 0) {
	            v0_1 = new java.util.HashMap();
	            int v1 = 0;
	            while (v1 < v2) {
	                v0_1.put(p5.readString(), p5.readString());
	                v1++;
	            }
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    private static java.util.Map a(org.json.JSONObject p10)
	    {
	        java.util.HashMap v5_1 = new java.util.HashMap();
	        if (p10 != null) {
	            org.json.JSONArray v6 = p10.optJSONArray("data");
	            if (v6 != null) {
	                int v1 = 0;
	                while (v1 < v6.length()) {
	                    ajm v4_3;
	                    ajm v4_0 = v6.optJSONObject(v1);
	                    int v0_3 = v4_0.optString("name");
	                    if (!aji.a(v0_3)) {
	                        int v0_4 = v0_3.split("\\|");
	                        if (v0_4.length == 2) {
	                            String v7_3 = v0_4[0];
	                            String v8_2 = v0_4[1];
	                            if ((!aji.a(v7_3)) && (!aji.a(v8_2))) {
	                                int v0_9;
	                                int v0_8 = v4_0.optString("url");
	                                if (aji.a(v0_8)) {
	                                    v0_9 = 0;
	                                } else {
	                                    v0_9 = android.net.Uri.parse(v0_8);
	                                }
	                                v4_3 = new ajm(v7_3, v8_2, v0_9, ajm.a(v4_0.optJSONArray("versions")));
	                            } else {
	                                v4_3 = 0;
	                            }
	                        } else {
	                            v4_3 = 0;
	                        }
	                    } else {
	                        v4_3 = 0;
	                    }
	                    if (v4_3 != null) {
	                        String v7_4 = v4_3.a;
	                        int v0_11 = ((java.util.Map) v5_1.get(v7_4));
	                        if (v0_11 == 0) {
	                            v0_11 = new java.util.HashMap();
	                            v5_1.put(v7_4, v0_11);
	                        }
	                        v0_11.put(v4_3.b, v4_3);
	                    }
	                    v1++;
	                }
	            }
	        }
	        return v5_1;
	    }
	
	
	    static synthetic java.util.concurrent.atomic.AtomicBoolean a()
	    {
	        return aji.c;
	    }
	
	
	    public static void a(android.content.Context p5, String p6)
	    {
	        int v0_1 = aji.c.compareAndSet(0, 1);
	        if ((!aji.a(p6)) && ((!aji.b.containsKey(p6)) && (v0_1 != 0))) {
	            String v2_3 = new Object[1];
	            v2_3[0] = p6;
	            int v0_3 = String.format("com.facebook.internal.APP_SETTINGS.%s", v2_3);
	            afv.d().execute(new ajj(p6, p5, v0_3));
	            String v2_7 = p5.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(v0_3, 0);
	            if (!aji.a(v2_7)) {
	                try {
	                    int v0_6 = new org.json.JSONObject(v2_7);
	                } catch (int v0_7) {
	                    aji.a("FacebookSDK", v0_7);
	                    v0_6 = 0;
	                }
	                if (v0_6 != 0) {
	                    aji.b(p6, v0_6);
	                }
	            }
	        }
	        return;
	    }
	
	
	    public static void a(android.os.Parcel p3, java.util.Map p4)
	    {
	        if (p4 != null) {
	            p3.writeInt(p4.size());
	            java.util.Iterator v2 = p4.entrySet().iterator();
	            while (v2.hasNext()) {
	                String v0_4 = ((java.util.Map$Entry) v2.next());
	                p3.writeString(((String) v0_4.getKey()));
	                p3.writeString(((String) v0_4.getValue()));
	            }
	        } else {
	            p3.writeInt(-1);
	        }
	        return;
	    }
	
	
	    public static void a(java.io.Closeable p1)
	    {
	        if (p1 != null) {
	            try {
	                p1.close();
	            } catch (java.io.IOException v0) {
	            }
	        }
	        return;
	    }
	
	
	    public static void a(String p3, ajo p4)
	    {
	        java.util.List v0_0 = ajg.a(p3);
	        if (v0_0 == null) {
	            java.util.List v0_2 = new ajk(p4, p3);
	            agm v1_0 = aji.g(p3);
	            v1_0.a(v0_2);
	            java.util.List v0_4 = new aga[1];
	            v0_4[0] = v1_0;
	            ajp.a(v0_4, "requests");
	            aga.b(new agm(java.util.Arrays.asList(v0_4)));
	        } else {
	            p4.a(v0_0);
	        }
	        return;
	    }
	
	
	    public static void a(String p5, Exception p6)
	    {
	        if (afv.b()) {
	            StringBuilder v0_3 = String.valueOf(p6.getClass().getSimpleName());
	            String v1_1 = String.valueOf(p6.getMessage());
	            new StringBuilder(((String.valueOf(v0_3).length() + 2) + String.valueOf(v1_1).length())).append(v0_3).append(": ").append(v1_1);
	        }
	        return;
	    }
	
	
	    public static void a(String p0, String p1)
	    {
	        afv.b();
	        return;
	    }
	
	
	    public static void a(String p1, String p2, Throwable p3)
	    {
	        if (afv.b()) {
	            aji.a(p1);
	        }
	        return;
	    }
	
	
	    public static void a(java.net.URLConnection p1)
	    {
	        if ((p1 instanceof java.net.HttpURLConnection)) {
	            ((java.net.HttpURLConnection) p1).disconnect();
	        }
	        return;
	    }
	
	
	    public static void a(org.json.JSONObject p4, ahx p5, String p6, boolean p7)
	    {
	        int v1 = 1;
	        if ((p5 != null) && (p5.a != null)) {
	            p4.put("attribution", p5.a);
	        }
	        if ((p5 != null) && (p5.b != null)) {
	            String v0_5;
	            p4.put("advertiser_id", p5.b);
	            if (p5.d) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 1;
	            }
	            p4.put("advertiser_tracking_enabled", v0_5);
	        }
	        if ((p5 != null) && (p5.c != null)) {
	            p4.put("installer_package", p5.c);
	        }
	        p4.put("anon_id", p6);
	        if (p7) {
	            v1 = 0;
	        }
	        p4.put("application_tracking_enabled", v1);
	        return;
	    }
	
	
	    public static void a(org.json.JSONObject p10, android.content.Context p11)
	    {
	        org.json.JSONArray v7_1 = new org.json.JSONArray();
	        v7_1.put("a2");
	        if ((aji.e == -1) || ((System.currentTimeMillis() - aji.e) >= 1800000)) {
	            aji.e = System.currentTimeMillis();
	            aji.c();
	            aji.d(p11);
	            aji.f();
	            aji.e();
	        }
	        int v2_3 = p11.getPackageName();
	        try {
	            int v3_1 = p11.getPackageManager().getPackageInfo(v2_3, 0);
	            int v1_0 = v3_1.versionCode;
	            int v0_7 = v3_1.versionName;
	        } catch (int v3) {
	        }
	        v7_1.put(v2_3);
	        v7_1.put(v1_0);
	        v7_1.put(v0_7);
	        v7_1.put(android.os.Build$VERSION.RELEASE);
	        v7_1.put(android.os.Build.MODEL);
	        try {
	            int v0_12 = p11.getResources().getConfiguration().locale;
	        } catch (int v0) {
	            v0_12 = java.util.Locale.getDefault();
	        }
	        int v1_2 = String.valueOf(v0_12.getLanguage());
	        int v0_14 = String.valueOf(v0_12.getCountry());
	        v7_1.put(new StringBuilder(((String.valueOf(v1_2).length() + 1) + String.valueOf(v0_14).length())).append(v1_2).append("_").append(v0_14).toString());
	        v7_1.put(aji.h);
	        v7_1.put(aji.i);
	        int v2_7 = 0;
	        try {
	            int v0_22;
	            int v3_6;
	            int v0_21 = ((android.view.WindowManager) p11.getSystemService("window"));
	        } catch (int v0) {
	            int v0_24 = 0;
	            int v1_7 = 0;
	            int v8 = v2_7;
	            v2_7 = v0_24;
	            v3_6 = v1_7;
	            v0_22 = v8;
	            v7_1.put(v3_6);
	            v7_1.put(v2_7);
	            int v3_8 = new Object[1];
	            v3_8[0] = Double.valueOf(v0_22);
	            v7_1.put(String.format("%.2f", v3_8));
	            v7_1.put(aji.b());
	            v7_1.put(aji.f);
	            v7_1.put(aji.g);
	            p10.put("extinfo", v7_1.toString());
	            return;
	        }
	        if (v0_21 == 0) {
	            v0_22 = 0;
	            v2_7 = 0;
	            v3_6 = 0;
	            v7_1.put(v3_6);
	            v7_1.put(v2_7);
	            v3_8 = new Object[1];
	            v3_8[0] = Double.valueOf(v0_22);
	            v7_1.put(String.format("%.2f", v3_8));
	            v7_1.put(aji.b());
	            v7_1.put(aji.f);
	            v7_1.put(aji.g);
	            p10.put("extinfo", v7_1.toString());
	            return;
	        } else {
	            int v0_23 = v0_21.getDefaultDisplay();
	            int v1_6 = new android.util.DisplayMetrics();
	            v0_23.getMetrics(v1_6);
	            int v6 = v1_6.widthPixels;
	            try {
	                int v4_3 = v1_6.heightPixels;
	                try {
	                    v0_22 = ((double) v1_6.density);
	                    v2_7 = v4_3;
	                    v3_6 = v6;
	                } catch (int v0) {
	                    v0_24 = v4_3;
	                    v1_7 = v6;
	                }
	                v7_1.put(v3_6);
	                v7_1.put(v2_7);
	                v3_8 = new Object[1];
	                v3_8[0] = Double.valueOf(v0_22);
	                v7_1.put(String.format("%.2f", v3_8));
	                v7_1.put(aji.b());
	                v7_1.put(aji.f);
	                v7_1.put(aji.g);
	                p10.put("extinfo", v7_1.toString());
	                return;
	            } catch (int v0) {
	                v0_24 = 0;
	                v1_7 = v6;
	            }
	        }
	    }
	
	
	    public static boolean a(afb p1)
	    {
	        int v0_0;
	        if (p1 == null) {
	            v0_0 = 0;
	        } else {
	            v0_0 = p1.equals(afb.a());
	        }
	        return v0_0;
	    }
	
	
	    public static boolean a(Object p1, Object p2)
	    {
	        int v0;
	        if (p1 != null) {
	            v0 = p1.equals(p2);
	        } else {
	            if (p2 != null) {
	                v0 = 0;
	            } else {
	                v0 = 1;
	            }
	        }
	        return v0;
	    }
	
	
	    public static boolean a(String p1)
	    {
	        if ((p1 != null) && (p1.length() != 0)) {
	            int v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public static boolean a(java.util.Collection p1)
	    {
	        if ((p1 != null) && (p1.size() != 0)) {
	            int v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    private static int b()
	    {
	        int v0_0 = 1;
	        if (aji.d <= 0) {
	            if (android.os.Build$VERSION.SDK_INT > 10) {
	                try {
	                    aji.d = new java.io.File("/sys/devices/system/cpu/").listFiles(new ajl()).length;
	                } catch (int v1) {
	                }
	                if (aji.d <= 0) {
	                    aji.d = Math.max(Runtime.getRuntime().availableProcessors(), 1);
	                }
	                v0_0 = aji.d;
	            } else {
	                aji.d = 1;
	            }
	        } else {
	            v0_0 = aji.d;
	        }
	        return v0_0;
	    }
	
	
	    private static ajn b(String p13, org.json.JSONObject p14)
	    {
	        String v5_1;
	        org.json.JSONArray v9 = p14.optJSONArray("android_sdk_error_categories");
	        if (v9 != null) {
	            if (v9 != null) {
	                int v0_1 = 0;
	                String v6 = 0;
	                String v5_0 = 0;
	                String v4_0 = 0;
	                java.util.Map v3_0 = 0;
	                java.util.Map v2_0 = 0;
	                java.util.Map v1_0 = 0;
	                while (v0_1 < v9.length()) {
	                    org.json.JSONObject v10_1 = v9.optJSONObject(v0_1);
	                    if (v10_1 != null) {
	                        boolean v11_1 = v10_1.optString("name");
	                        if (v11_1) {
	                            if (!v11_1.equalsIgnoreCase("other")) {
	                                if (!v11_1.equalsIgnoreCase("transient")) {
	                                    if (v11_1.equalsIgnoreCase("login_recoverable")) {
	                                        v6 = v10_1.optString("recovery_message", 0);
	                                        v3_0 = aiq.a(v10_1);
	                                    }
	                                } else {
	                                    v5_0 = v10_1.optString("recovery_message", 0);
	                                    v2_0 = aiq.a(v10_1);
	                                }
	                            } else {
	                                v4_0 = v10_1.optString("recovery_message", 0);
	                                v1_0 = aiq.a(v10_1);
	                            }
	                        }
	                    }
	                    v0_1++;
	                }
	                v5_1 = new aiq(v1_0, v2_0, v3_0, v4_0, v5_0, v6);
	            } else {
	                v5_1 = 0;
	            }
	        } else {
	            v5_1 = aiq.a();
	        }
	        int v0_5 = new ajn(p14.optBoolean("supports_implicit_sdk_logging", 0), p14.optString("gdpv4_nux_content", ""), p14.optBoolean("gdpv4_nux_enabled", 0), aji.a(p14.optJSONObject("android_dialog_configs")), v5_1);
	        aji.b.put(p13, v0_5);
	        return v0_5;
	    }
	
	
	    public static android.os.Bundle b(String p8)
	    {
	        android.os.Bundle v2_1 = new android.os.Bundle();
	        if (!aji.a(p8)) {
	            String[] v3 = p8.split("&");
	            int v4 = v3.length;
	            int v1_2 = 0;
	            while (v1_2 < v4) {
	                String v0_2 = v3[v1_2].split("=");
	                try {
	                    if (v0_2.length != 2) {
	                        if (v0_2.length == 1) {
	                            v2_1.putString(java.net.URLDecoder.decode(v0_2[0], "UTF-8"), "");
	                        }
	                    } else {
	                        v2_1.putString(java.net.URLDecoder.decode(v0_2[0], "UTF-8"), java.net.URLDecoder.decode(v0_2[1], "UTF-8"));
	                    }
	                    v1_2++;
	                } catch (String v0_8) {
	                    aji.a("FacebookSDK", v0_8);
	                }
	            }
	        }
	        return v2_1;
	    }
	
	
	    public static varargs java.util.List b(Object[] p3)
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList();
	        int v0 = 0;
	        while (v0 < 2) {
	            Object v2_1 = p3[v0];
	            if (v2_1 != null) {
	                v1_1.add(v2_1);
	            }
	            v0++;
	        }
	        return v1_1;
	    }
	
	
	    public static void b(android.content.Context p1)
	    {
	        aji.b(p1, "facebook.com");
	        aji.b(p1, ".facebook.com");
	        aji.b(p1, "https://facebook.com");
	        aji.b(p1, "https://.facebook.com");
	        return;
	    }
	
	
	    private static void b(android.content.Context p7, String p8)
	    {
	        android.webkit.CookieSyncManager.createInstance(p7).sync();
	        android.webkit.CookieManager v2 = android.webkit.CookieManager.getInstance();
	        int v0_1 = v2.getCookie(p8);
	        if (v0_1 != 0) {
	            String[] v3_1 = v0_1.split(";");
	            int v4 = v3_1.length;
	            int v0_2 = 0;
	            while (v0_2 < v4) {
	                String v5_1 = v3_1[v0_2].split("=");
	                if (v5_1.length > 0) {
	                    v2.setCookie(p8, String.valueOf(v5_1[0].trim()).concat("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
	                }
	                v0_2++;
	            }
	            v2.removeExpiredCookie();
	        }
	        return;
	    }
	
	
	    public static ajn c(String p1)
	    {
	        int v0_0;
	        if (p1 == null) {
	            v0_0 = 0;
	        } else {
	            v0_0 = ((ajn) aji.b.get(p1));
	        }
	        return v0_0;
	    }
	
	
	    public static String c(android.content.Context p1)
	    {
	        String v0_2;
	        if (p1 != null) {
	            if (p1 != p1.getApplicationContext()) {
	                v0_2 = p1.getClass().getSimpleName();
	            } else {
	                v0_2 = "unknown";
	            }
	        } else {
	            v0_2 = "null";
	        }
	        return v0_2;
	    }
	
	
	    private static void c()
	    {
	        try {
	            Exception v0_0 = java.util.TimeZone.getDefault();
	            aji.h = v0_0.getDisplayName(v0_0.inDaylightTime(new java.util.Date()), 0);
	        } catch (Exception v0) {
	        }
	        return;
	    }
	
	
	    public static org.json.JSONObject d(String p2)
	    {
	        org.json.JSONObject v0_0 = ajg.a(p2);
	        if (v0_0 == null) {
	            org.json.JSONObject v0_2 = aji.g(p2).a();
	            if (v0_2.b == null) {
	                v0_0 = v0_2.a;
	            } else {
	                v0_0 = 0;
	            }
	        }
	        return v0_0;
	    }
	
	
	    private static void d(android.content.Context p2)
	    {
	        if (aji.i.equals("NoCarrier")) {
	            try {
	                aji.i = ((android.telephony.TelephonyManager) p2.getSystemService("phone")).getNetworkOperatorName();
	            } catch (Exception v0) {
	            }
	        }
	        return;
	    }
	
	
	    private static boolean d()
	    {
	        return "mounted".equals(android.os.Environment.getExternalStorageState());
	    }
	
	
	    static synthetic org.json.JSONObject e(String p1)
	    {
	        return aji.f(p1);
	    }
	
	
	    private static void e()
	    {
	        try {
	            if (!aji.d()) {
	                aji.g = aji.a(((double) aji.g));
	            } else {
	                android.os.StatFs v1_1 = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
	                aji.g = (((long) v1_1.getBlockSize()) * ((long) v1_1.getAvailableBlocks()));
	            }
	        } catch (long v0) {
	        }
	        return;
	    }
	
	
	    private static org.json.JSONObject f(String p5)
	    {
	        org.json.JSONObject v0_1 = new android.os.Bundle();
	        v0_1.putString("fields", android.text.TextUtils.join(",", aji.a));
	        aga v1_1 = aga.a(0, p5, 0);
	        v1_1.g = 1;
	        v1_1.d = v0_1;
	        return v1_1.a().a;
	    }
	
	
	    private static void f()
	    {
	        try {
	            if (!aji.d()) {
	                aji.f = aji.a(((double) aji.f));
	            } else {
	                android.os.StatFs v1_1 = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
	                aji.f = (((long) v1_1.getBlockSize()) * ((long) v1_1.getBlockCount()));
	            }
	        } catch (long v0) {
	        }
	        return;
	    }
	
	
	    private static aga g(String p6)
	    {
	        android.os.Bundle v3_1 = new android.os.Bundle();
	        v3_1.putString("fields", "id,name,first_name,middle_name,last_name,link");
	        v3_1.putString("access_token", p6);
	        return new aga(0, "me", v3_1, agq.a, 0);
	    }
	
