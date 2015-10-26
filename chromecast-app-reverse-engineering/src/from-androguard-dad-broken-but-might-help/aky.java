	 java.util.Map a
	public akh b
	
	    aky(akh p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    aky(android.os.Parcel p2)
	    {
	        this.a = aji.a(p2);
	        return;
	    }
	
	
	    public static afb a(java.util.Collection p9, android.os.Bundle p10, afl p11, String p12)
	    {
	        java.util.Collection v4_0;
	        afb v0_0 = 0;
	        java.util.Date v7 = aji.a(p10, "expires_in", new java.util.Date());
	        String v1_2 = p10.getString("access_token");
	        String v2_3 = p10.getString("granted_scopes");
	        if (aji.a(v2_3)) {
	            v4_0 = p9;
	        } else {
	            v4_0 = new java.util.ArrayList(java.util.Arrays.asList(v2_3.split(",")));
	        }
	        int v5_0;
	        String v2_7 = p10.getString("denied_scopes");
	        if (aji.a(v2_7)) {
	            v5_0 = 0;
	        } else {
	            v5_0 = new java.util.ArrayList(java.util.Arrays.asList(v2_7.split(",")));
	        }
	        if (!aji.a(v1_2)) {
	            v0_0 = new afb(v1_2, p12, aky.b(p10.getString("signed_request")), v4_0, v5_0, p11, v7, new java.util.Date());
	        }
	        return v0_0;
	    }
	
	
	    private static String b(String p3)
	    {
	        if ((p3 != null) && (!p3.isEmpty())) {
	            try {
	                afq v0_2 = p3.split("\\.");
	            } catch (afq v0) {
	                throw new afq("Failed to retrieve user_id from signed_request");
	            } catch (afq v0) {
	            }
	            if (v0_2.length != 2) {
	            } else {
	                return new org.json.JSONObject(new String(android.util.Base64.decode(v0_2[1], 0), "UTF-8")).getString("user_id");
	            }
	        } else {
	            throw new afq("Authorization response does not contain the signed_request");
	        }
	    }
	
	
	    protected final void a(String p7)
	    {
	        String v0_2 = this.b.f.d;
	        ahe v1_2 = ahe.a(this.b.a(), v0_2);
	        android.os.Bundle v2_1 = new android.os.Bundle();
	        v2_1.putString("fb_web_login_e2e", p7);
	        v2_1.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
	        v2_1.putString("app_id", v0_2);
	        v1_2.a("fb_dialogs_web_login_dialog_complete", 0, v2_1);
	        return;
	    }
	
	
	    protected final void a(String p3, Object p4)
	    {
	        if (this.a == null) {
	            this.a = new java.util.HashMap();
	        }
	        String v0_3;
	        java.util.Map v1 = this.a;
	        if (p4 != null) {
	            v0_3 = p4.toString();
	        } else {
	            v0_3 = 0;
	        }
	        v1.put(p3, v0_3);
	        return;
	    }
	
	
	    boolean a(int p2, android.content.Intent p3)
	    {
	        return 0;
	    }
	
	
	    void b()
	    {
	        return;
	    }
	
	
	    boolean c()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        aji.a(p2, this.a);
	        return;
	    }
	
