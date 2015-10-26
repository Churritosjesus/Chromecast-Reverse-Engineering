	private static final buu a
	private static final Ljava.lang.String b
	private static final java.lang.String c
	
	    static cjf()
	    {
	        cjf.a = new buu("MetadataUtils");
	        String v0_3 = new String[4];
	        v0_3[0] = "Z";
	        v0_3[1] = "+hh";
	        v0_3[2] = "+hhmm";
	        v0_3[3] = "+hh:mm";
	        cjf.b = v0_3;
	        cjf.c = new StringBuilder("yyyyMMdd\'T\'HHmmss").append(cjf.b[0]).toString();
	        return;
	    }
	
	
	    public static java.util.Calendar a(String p6)
	    {
	        int v0_10;
	        if (!android.text.TextUtils.isEmpty(p6)) {
	            buu v1_0 = cjf.b(p6);
	            if (!android.text.TextUtils.isEmpty(v1_0)) {
	                String v3_0 = cjf.c(p6);
	                int v0_2 = "yyyyMMdd";
	                if (!android.text.TextUtils.isEmpty(v3_0)) {
	                    v1_0 = new StringBuilder().append(v1_0).append("T").append(v3_0).toString();
	                    if (v3_0.length() != 6) {
	                        v0_2 = cjf.c;
	                    } else {
	                        v0_2 = "yyyyMMdd\'T\'HHmmss";
	                    }
	                }
	                String v3_2 = java.util.GregorianCalendar.getInstance();
	                try {
	                    v3_2.setTime(new java.text.SimpleDateFormat(v0_2).parse(v1_0));
	                    v0_10 = v3_2;
	                } catch (int v0_11) {
	                    Object[] v4_4 = new Object[1];
	                    v4_4[0] = v0_11.getMessage();
	                    cjf.a.b("Error parsing string: %s", v4_4);
	                    v0_10 = 0;
	                }
	            } else {
	                String v3_4 = new Object[0];
	                cjf.a.b("Invalid date format", v3_4);
	                v0_10 = 0;
	            }
	        } else {
	            String v3_5 = new Object[0];
	            cjf.a.b("Input string is empty or null", v3_5);
	            v0_10 = 0;
	        }
	        return v0_10;
	    }
	
	
	    public static void a(java.util.List p5, org.json.JSONObject p6)
	    {
	        try {
	            p5.clear();
	            org.json.JSONArray v1 = p6.getJSONArray("images");
	            int v2 = v1.length();
	            int v0_1 = 0;
	        } catch (int v0) {
	            return;
	        }
	        while (v0_1 < v2) {
	            try {
	                p5.add(new com.google.android.gms.common.images.WebImage(v1.getJSONObject(v0_1)));
	            } catch (IllegalArgumentException v3) {
	            }
	            v0_1++;
	        }
	        return;
	    }
	
	
	    private static String b(String p6)
	    {
	        String v0 = 0;
	        if (!android.text.TextUtils.isEmpty(p6)) {
	            try {
	                v0 = p6.substring(0, 8);
	            } catch (String v1_2) {
	                Object[] v4_1 = new Object[1];
	                v4_1[0] = v1_2.getMessage();
	                cjf.a.c("Error extracting the date: %s", v4_1);
	            }
	        } else {
	            String v3_1 = new Object[0];
	            cjf.a.b("Input string is empty or null", v3_1);
	        }
	        return v0;
	    }
	
	
	    private static String c(String p8)
	    {
	        String v0_0 = 0;
	        String v2_0 = 0;
	        if (!android.text.TextUtils.isEmpty(p8)) {
	            String v1_2 = p8.indexOf(84);
	            if (v1_2 == 8) {
	                try {
	                    String v1_3 = p8.substring((v1_2 + 1));
	                } catch (String v1_4) {
	                    int v3_1 = new Object[1];
	                    v3_1[0] = v1_4.getMessage();
	                    cjf.a.b("Error extracting the time substring: %s", v3_1);
	                }
	                if (v1_3.length() != 6) {
	                    switch (v1_3.charAt(6)) {
	                        case 43:
	                        case 45:
	                            int v4_8 = v1_3.length();
	                            if ((v4_8 == (cjf.b[1].length() + 6)) || ((v4_8 == (cjf.b[2].length() + 6)) || (v4_8 == (cjf.b[3].length() + 6)))) {
	                                v2_0 = 1;
	                            }
	                            if (v2_0 != null) {
	                                v0_0 = v1_3.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
	                            }
	                            break;
	                        case 90:
	                            if (v1_3.length() == (cjf.b[0].length() + 6)) {
	                                v0_0 = new StringBuilder().append(v1_3.substring(0, (v1_3.length() - 1))).append("+0000").toString();
	                            }
	                            break;
	                        default:
	                    }
	                } else {
	                    v0_0 = v1_3;
	                }
	            } else {
	                String v2_2 = new Object[0];
	                cjf.a.b("T delimeter is not found", v2_2);
	            }
	        } else {
	            String v2_3 = new Object[0];
	            cjf.a.b("string is empty or null", v2_3);
	        }
	        return v0_0;
	    }
	
