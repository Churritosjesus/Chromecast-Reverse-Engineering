	public static final java.nio.charset.Charset a
	private static final blp b
	private static final Ljava.lang.String c
	
	    static blj()
	    {
	        blj.a = java.nio.charset.Charset.forName("UTF-8");
	        blj.b = new blp("LocalizationUtil");
	        String[] v0_5 = new String[8];
	        v0_5[0] = "ARAB";
	        v0_5[1] = "CYRL";
	        v0_5[2] = "GURU";
	        v0_5[3] = "HANS";
	        v0_5[4] = "HANT";
	        v0_5[5] = "LATN";
	        v0_5[6] = "TFNG";
	        v0_5[7] = "VAII";
	        blj.c = v0_5;
	        return;
	    }
	
	
	    public static blm a(java.util.List p5)
	    {
	        java.util.Locale v1 = java.util.Locale.getDefault();
	        java.util.Iterator v2 = p5.iterator();
	        while (v2.hasNext()) {
	            int v0_1 = ((blm) v2.next());
	            if (v0_1.a.equals(v1.getCountry())) {
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public static blm a(java.util.List p4, String p5)
	    {
	        int v0_2;
	        if (!android.text.TextUtils.isEmpty(p5)) {
	            java.util.Iterator v2 = p4.iterator();
	            while (v2.hasNext()) {
	                v0_2 = ((blm) v2.next());
	                if (p5.equals(v0_2.a)) {
	                }
	            }
	            v0_2 = 0;
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public static String a()
	    {
	        return blj.a(java.util.Locale.getDefault());
	    }
	
	
	    public static String a(java.util.Locale p6)
	    {
	        String v0_1 = new StringBuilder();
	        v0_1.append(blj.c(p6));
	        if (!android.text.TextUtils.isEmpty(p6.getCountry())) {
	            Object[] v3_1 = new Object[1];
	            v3_1[0] = p6.getLanguage();
	            v0_1.append(String.format(java.util.Locale.US, ", %s;q=0.8", v3_1));
	        }
	        v0_1.append(", en;q=0.5");
	        return v0_1.toString();
	    }
	
	
	    public static void a(m p5, bln p6)
	    {
	        com.google.android.gms.common.api.GoogleApiClient v0_0 = 0;
	        if ((!ble.a(p5)) || (ble.b(p5) == 1)) {
	            v0_0 = 1;
	        } else {
	            Object[] v3 = new Object[0];
	            blj.b.a("Google Apps Access to location disabled.", v3);
	        }
	        if (v0_0 != null) {
	            if (android.location.Geocoder.isPresent()) {
	                com.google.android.gms.common.api.GoogleApiClient v0_6 = new bwf(com.google.android.apps.chromecast.app.SetupApplication.a()).a(new blk(p6)).a(cni.a).b();
	                v0_6.a(new bll(v0_6, p6, p5));
	                v0_6.b();
	            } else {
	                p6.a(0);
	            }
	        } else {
	            p6.a(0);
	        }
	        return;
	    }
	
	
	    public static String b()
	    {
	        return blj.b(java.util.Locale.getDefault());
	    }
	
	
	    public static String b(java.util.Locale p1)
	    {
	        String v0_2;
	        if (!android.text.TextUtils.isEmpty(p1.getLanguage())) {
	            v0_2 = p1.getLanguage();
	        } else {
	            v0_2 = "en";
	        }
	        return v0_2;
	    }
	
	
	    public static String c()
	    {
	        return blj.c(java.util.Locale.getDefault());
	    }
	
	
	    public static String c(java.util.Locale p5)
	    {
	        String v0_2;
	        if (android.text.TextUtils.isEmpty(p5.getCountry())) {
	            v0_2 = p5.getLanguage();
	        } else {
	            Object[] v2_1 = new Object[2];
	            v2_1[0] = p5.getLanguage();
	            v2_1[1] = p5.getCountry();
	            v0_2 = String.format(java.util.Locale.US, "%s-%s", v2_1);
	        }
	        return v0_2;
	    }
	
	
	    private static String d(java.util.Locale p7)
	    {
	        String[] v1_0 = 0;
	        String v0_0 = p7.getCountry();
	        if (android.os.Build$VERSION.SDK_INT == 19) {
	            int v3_1 = blj.c;
	            int v2_1 = 0;
	            while (v2_1 < v3_1.length) {
	                if (!v3_1[v2_1].equals(p7.getCountry())) {
	                    v2_1++;
	                } else {
	                    v1_0 = 1;
	                    break;
	                }
	            }
	            if (v1_0 != null) {
	                String[] v1_2 = android.text.TextUtils.split(p7.toString(), "_");
	                if (v1_2.length == 3) {
	                    v0_0 = v1_2[2];
	                }
	            }
	        }
	        return v0_0;
	    }
	
	
	    public static boolean d()
	    {
	        return java.util.Locale.GERMAN.getLanguage().equals(java.util.Locale.getDefault().getLanguage());
	    }
	
	
	    public static java.util.List e()
	    {
	        java.util.Collection v1_1 = new java.util.TreeMap();
	        java.util.Locale[] v2 = java.util.Locale.getAvailableLocales();
	        int v3 = v2.length;
	        int v0_0 = 0;
	        while (v0_0 < v3) {
	            String v4_0 = v2[v0_0];
	            String v5 = v4_0.getDisplayCountry();
	            if (!android.text.TextUtils.isEmpty(v5)) {
	                String v4_1 = blj.d(v4_0);
	                if ((!android.text.TextUtils.isEmpty(v4_1)) && ((v4_1.length() == 2) && (!v1_1.containsKey(v5)))) {
	                    v1_1.put(v5, new blm(v4_1, v5));
	                }
	            }
	            v0_0++;
	        }
	        return new java.util.ArrayList(v1_1.values());
	    }
	
	
	    static synthetic blp f()
	    {
	        return blj.b;
	    }
	
