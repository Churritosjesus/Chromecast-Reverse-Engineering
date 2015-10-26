	private static java.lang.String a
	private static java.util.Map b
	
	    static cvr()
	    {
	        cvr.b = new java.util.HashMap();
	        return;
	    }
	
	
	    cvr()
	    {
	        return;
	    }
	
	
	    static String a(android.content.Context p4, String p5)
	    {
	        if (cvr.a == null) {
	            try {
	                if (cvr.a == null) {
	                    String v0_3 = p4.getSharedPreferences("gtm_install_referrer", 0);
	                    if (v0_3 == null) {
	                        cvr.a = "";
	                    } else {
	                        cvr.a = v0_3.getString("referrer", "");
	                    }
	                }
	            } catch (String v0_6) {
	                throw v0_6;
	            }
	        }
	        return cvr.a(cvr.a, p5);
	    }
	
	
	    static String a(android.content.Context p2, String p3, String p4)
	    {
	        String v0_2 = ((String) cvr.b.get(p3));
	        if (v0_2 == null) {
	            String v0_4 = p2.getSharedPreferences("gtm_click_referrers", 0);
	            if (v0_4 == null) {
	                v0_2 = "";
	            } else {
	                v0_2 = v0_4.getString(p3, "");
	            }
	            cvr.b.put(p3, v0_2);
	        }
	        return cvr.a(v0_2, p4);
	    }
	
	
	    private static String a(String p2, String p3)
	    {
	        if (p3 != null) {
	            p2 = android.net.Uri.parse(new StringBuilder("http://hostname/?").append(p2).toString()).getQueryParameter(p3);
	        } else {
	            if (p2.length() <= 0) {
	                p2 = 0;
	            }
	        }
	        return p2;
	    }
	
	
	    static void b(android.content.Context p2, String p3)
	    {
	        String v0_1 = cvr.a(p3, "conv");
	        if ((v0_1 != null) && (v0_1.length() > 0)) {
	            cvr.b.put(v0_1, p3);
	            a.a(p2, "gtm_click_referrers", v0_1, p3);
	        }
	        return;
	    }
	
