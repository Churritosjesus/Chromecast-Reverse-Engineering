	private synthetic java.util.concurrent.atomic.AtomicBoolean a
	private synthetic java.util.Set b
	private synthetic java.util.Set c
	
	    afh(aff p1, java.util.concurrent.atomic.AtomicBoolean p2, java.util.Set p3, java.util.Set p4)
	    {
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final void a(agp p7)
	    {
	        int v0_0 = p7.a;
	        if (v0_0 != 0) {
	            org.json.JSONArray v2 = v0_0.optJSONArray("data");
	            if (v2 != null) {
	                this.a.set(1);
	                int v0_2 = 0;
	                while (v0_2 < v2.length()) {
	                    String v1_3 = v2.optJSONObject(v0_2);
	                    if (v1_3 != null) {
	                        String v3_1 = v1_3.optString("permission");
	                        String v1_4 = v1_3.optString("status");
	                        if ((!aji.a(v3_1)) && (!aji.a(v1_4))) {
	                            String v1_5 = v1_4.toLowerCase(java.util.Locale.US);
	                            if (!v1_5.equals("granted")) {
	                                if (!v1_5.equals("declined")) {
	                                    String v1_8;
	                                    String v1_6 = String.valueOf(v1_5);
	                                    if (v1_6.length() == 0) {
	                                        v1_8 = new String("Unexpected status: ");
	                                    } else {
	                                        v1_8 = "Unexpected status: ".concat(v1_6);
	                                    }
	                                    android.util.Log.w("AccessTokenManager", v1_8);
	                                } else {
	                                    this.c.add(v3_1);
	                                }
	                            } else {
	                                this.b.add(v3_1);
	                            }
	                        }
	                    }
	                    v0_2++;
	                }
	            }
	        }
	        return;
	    }
	
