	 java.lang.String a
	 java.lang.String b
	
	    ajm(String p1, String p2, android.net.Uri p3, int[] p4)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    static int[] a(org.json.JSONArray p7)
	    {
	        int v0_0 = 0;
	        if (p7 != null) {
	            int v4 = p7.length();
	            int[] v2 = new int[v4];
	            int v3 = 0;
	            while (v3 < v4) {
	                int v0_2 = p7.optInt(v3, -1);
	                if (v0_2 == -1) {
	                    String v5_0 = p7.optString(v3);
	                    if (!aji.a(v5_0)) {
	                        try {
	                            v0_2 = Integer.parseInt(v5_0);
	                        } catch (int v0_3) {
	                            aji.a("FacebookSDK", v0_3);
	                            v0_2 = -1;
	                        }
	                    }
	                }
	                v2[v3] = v0_2;
	                v3++;
	            }
	            v0_0 = v2;
	        }
	        return v0_0;
	    }
	
