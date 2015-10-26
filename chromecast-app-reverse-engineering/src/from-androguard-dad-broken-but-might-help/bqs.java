	
	    public static double a(String p3, double p4)
	    {
	        double v0 = 100.0;
	        if (p3 != null) {
	            try {
	                v0 = Double.parseDouble(p3);
	            } catch (NumberFormatException v2) {
	            }
	        }
	        return v0;
	    }
	
	
	    public static long a(String p3)
	    {
	        long v0 = 0;
	        if (p3 != null) {
	            try {
	                v0 = Long.parseLong(p3);
	            } catch (NumberFormatException v2) {
	            }
	        }
	        return v0;
	    }
	
	
	    public static cpf a(bql p4, String p5)
	    {
	        cpf v0_0 = 0;
	        a.c(p4);
	        if (!android.text.TextUtils.isEmpty(p5)) {
	            try {
	                v0_0 = org.apache.http.client.utils.URLEncodedUtils.parse(new java.net.URI(new StringBuilder("?").append(p5).toString()), "UTF-8");
	                String v2_6 = new java.util.HashMap(v0_0.size());
	                cpf v1_4 = v0_0.iterator();
	            } catch (cpf v1_5) {
	                p4.d("No valid campaign data found", v1_5);
	            }
	            while (v1_4.hasNext()) {
	                cpf v0_33 = ((org.apache.http.NameValuePair) v1_4.next());
	                v2_6.put(v0_33.getName(), v0_33.getValue());
	            }
	            cpf v1_7 = new cpf();
	            v1_7.e = ((String) v2_6.get("utm_content"));
	            v1_7.c = ((String) v2_6.get("utm_medium"));
	            v1_7.a = ((String) v2_6.get("utm_campaign"));
	            v1_7.b = ((String) v2_6.get("utm_source"));
	            v1_7.d = ((String) v2_6.get("utm_term"));
	            v1_7.f = ((String) v2_6.get("utm_id"));
	            v1_7.g = ((String) v2_6.get("anid"));
	            v1_7.h = ((String) v2_6.get("gclid"));
	            v1_7.i = ((String) v2_6.get("dclid"));
	            v1_7.j = ((String) v2_6.get("aclid"));
	            v0_0 = v1_7;
	        }
	        return v0_0;
	    }
	
	
	    public static String a(java.util.Locale p3)
	    {
	        String v0_0 = 0;
	        if (p3 != null) {
	            StringBuilder v1_0 = p3.getLanguage();
	            if (!android.text.TextUtils.isEmpty(v1_0)) {
	                String v0_2 = new StringBuilder();
	                v0_2.append(v1_0.toLowerCase());
	                if (!android.text.TextUtils.isEmpty(p3.getCountry())) {
	                    v0_2.append("-").append(p3.getCountry().toLowerCase());
	                }
	                v0_0 = v0_2.toString();
	            }
	        }
	        return v0_0;
	    }
	
	
	    public static void a(java.util.Map p1, String p2, String p3)
	    {
	        if ((p3 != null) && (!p1.containsKey(p2))) {
	            p1.put(p2, p3);
	        }
	        return;
	    }
	
	
	    public static void a(java.util.Map p1, String p2, java.util.Map p3)
	    {
	        bqs.a(p1, p2, ((String) p3.get(p2)));
	        return;
	    }
	
	
	    public static void a(java.util.Map p1, String p2, boolean p3)
	    {
	        if (!p1.containsKey(p2)) {
	            String v0_1;
	            if (!p3) {
	                v0_1 = "0";
	            } else {
	                v0_1 = "1";
	            }
	            p1.put(p2, v0_1);
	        }
	        return;
	    }
	
	
	    public static boolean a(double p8, String p10)
	    {
	        int v1 = 1;
	        if ((p8 > 0) && (p8 < 100.0)) {
	            int v0_3;
	            if (android.text.TextUtils.isEmpty(p10)) {
	                v0_3 = 1;
	            } else {
	                int v3 = (p10.length() - 1);
	                v0_3 = 0;
	                while (v3 >= 0) {
	                    int v4_2 = p10.charAt(v3);
	                    v0_3 = ((((v0_3 << 6) & 268435455) + v4_2) + (v4_2 << 14));
	                    int v4_5 = (266338304 & v0_3);
	                    if (v4_5 != 0) {
	                        v0_3 ^= (v4_5 >> 21);
	                    }
	                    v3--;
	                }
	            }
	            if (((double) (v0_3 % 10000)) < (100.0 * p8)) {
	                v1 = 0;
	            }
	        } else {
	            v1 = 0;
	        }
	        return v1;
	    }
	
	
	    public static boolean a(android.content.Context p3, Class p4)
	    {
	        try {
	            int v0_3;
	            int v0_1 = p3.getPackageManager().getServiceInfo(new android.content.ComponentName(p3, p4), 4);
	        } catch (int v0) {
	            v0_3 = 0;
	            return v0_3;
	        }
	        if ((v0_1 == 0) || (!v0_1.enabled)) {
	        } else {
	            v0_3 = 1;
	            return v0_3;
	        }
	    }
	
	
	    public static boolean a(android.content.Context p3, Class p4, boolean p5)
	    {
	        try {
	            int v0_3;
	            int v0_1 = p3.getPackageManager().getReceiverInfo(new android.content.ComponentName(p3, p4), 2);
	        } catch (int v0) {
	            v0_3 = 0;
	            return v0_3;
	        }
	        if ((v0_1 == 0) || ((!v0_1.enabled) || ((p5) && (!v0_1.exported)))) {
	        } else {
	            v0_3 = 1;
	            return v0_3;
	        }
	    }
	
	
	    public static boolean a(String p2, boolean p3)
	    {
	        int v0 = 1;
	        if ((p2 != null) && ((!p2.equalsIgnoreCase("true")) && ((!p2.equalsIgnoreCase("yes")) && ((!p2.equalsIgnoreCase("1")) && ((p2.equalsIgnoreCase("false")) || ((p2.equalsIgnoreCase("no")) || (p2.equalsIgnoreCase("0")))))))) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public static java.security.MessageDigest b(String p2)
	    {
	        int v1 = 0;
	        while (v1 < 2) {
	            try {
	                int v0_2 = java.security.MessageDigest.getInstance(p2);
	            } catch (int v0) {
	                v1++;
	            }
	            if (v0_2 == 0) {
	            }
	            return v0_2;
	        }
	        v0_2 = 0;
	        return v0_2;
	    }
	
	
	    public static void b(java.util.Map p1, String p2, String p3)
	    {
	        if ((p3 != null) && (android.text.TextUtils.isEmpty(((CharSequence) p1.get(p2))))) {
	            p1.put(p2, p3);
	        }
	        return;
	    }
	
	
	    public static boolean c(String p2)
	    {
	        int v0 = 1;
	        if ((!android.text.TextUtils.isEmpty(p2)) && (p2.startsWith("http:"))) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
