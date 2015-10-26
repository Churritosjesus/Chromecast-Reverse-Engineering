	private final bfs a
	
	    public bdd(String p1, bfs p2)
	    {
	        this(p1);
	        this.a = p2;
	        return;
	    }
	
	
	    public static org.json.JSONObject a(bfs p3)
	    {
	        org.json.JSONObject v1_1 = new org.json.JSONObject();
	        try {
	            v1_1.put("ssid", p3.a);
	            v1_1.put("wpa_auth", p3.b.j);
	        } catch (String v0) {
	            return v1_1;
	        }
	        if (p3.c != null) {
	            v1_1.put("wpa_cipher", p3.c.b);
	        }
	        String v0_6;
	        v1_1.put("wpa_id", p3.d);
	        if (!p3.g) {
	            v0_6 = 0;
	        } else {
	            v0_6 = 1;
	        }
	        v1_1.put("scan_ssid", v0_6);
	        if (android.text.TextUtils.isEmpty(p3.e)) {
	            return v1_1;
	        } else {
	            String v0_10;
	            if (!p3.f) {
	                v0_10 = "passwd";
	            } else {
	                v0_10 = "enc_passwd";
	            }
	            v1_1.put(v0_10, p3.e);
	            return v1_1;
	        }
	    }
	
	
	    public final int a()
	    {
	        java.net.SocketException v0 = 0;
	        try {
	            if (this.a("connect_wifi", bfc.a(bdd.a(this.a)), bdd.c).b() != 200) {
	                v0 = -1;
	            }
	        } catch (java.net.SocketException v1) {
	        } catch (java.net.SocketException v1) {
	        } catch (String v2_5) {
	            Object[] v3_3 = new Object[1];
	            v3_3[0] = v2_5.toString();
	            v0 = -1;
	        } catch (java.net.SocketException v0) {
	            v0 = -1;
	        }
	        return v0;
	    }
	
