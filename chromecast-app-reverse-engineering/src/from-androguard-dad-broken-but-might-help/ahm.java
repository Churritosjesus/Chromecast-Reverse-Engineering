	private static final java.util.HashSet c
	private static final  serialVersionUID
	 org.json.JSONObject a
	  b
	
	    static ahm()
	    {
	        ahm.c = new java.util.HashSet();
	        return;
	    }
	
	
	    public ahm(String p10, String p11, Double p12, android.os.Bundle p13, boolean p14)
	    {
	        try {
	            ahm.a(p11);
	            this.b = p14;
	            this.a = new org.json.JSONObject();
	            this.a.put("_eventName", p11);
	            this.a.put("_logTime", (System.currentTimeMillis() / 1000));
	            this.a.put("_ui", p10);
	        } catch (String v0_17) {
	            Object[] v4_5 = new Object[1];
	            v4_5[0] = v0_17.toString();
	            aiw.a(ags.e, "AppEvents", "JSON encoding for app event failed: \'%s\'", v4_5);
	            this.a = 0;
	            return;
	        } catch (String v0_15) {
	            Object[] v4_4 = new Object[1];
	            v4_4[0] = v0_15.toString();
	            aiw.a(ags.e, "AppEvents", "Invalid app event name or parameter:", v4_4);
	            this.a = 0;
	            return;
	        }
	        if (p12 != null) {
	            this.a.put("_valueToSum", p12.doubleValue());
	        }
	        if (this.b) {
	            this.a.put("_implicitlyLogged", "1");
	        }
	        if (p13 != null) {
	            afq v1_5 = p13.keySet().iterator();
	            while (v1_5.hasNext()) {
	                String v0_13 = ((String) v1_5.next());
	                ahm.a(v0_13);
	                int v2_5 = p13.get(v0_13);
	                if (((v2_5 instanceof String)) || ((v2_5 instanceof Number))) {
	                    this.a.put(v0_13, v2_5.toString());
	                } else {
	                    Object[] v4_3 = new Object[2];
	                    v4_3[0] = v2_5;
	                    v4_3[1] = v0_13;
	                    throw new afq(String.format("Parameter value \'%s\' for key \'%s\' should be a string or a numeric type.", v4_3));
	                }
	            }
	        }
	        if (this.b) {
	            return;
	        } else {
	            String v3_1 = new Object[1];
	            v3_1[0] = this.a.toString();
	            aiw.a(ags.e, "AppEvents", "Created app event \'%s\'", v3_1);
	            return;
	        }
	    }
	
	
	    ahm(String p2, boolean p3)
	    {
	        this.a = new org.json.JSONObject(p2);
	        this.b = p3;
	        return;
	    }
	
	
	    private static void a(String p7)
	    {
	        if ((p7 != null) && ((p7.length() != 0) && (p7.length() <= 40))) {
	            if (!ahm.c.contains(p7)) {
	                if (!p7.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
	                    Object[] v2_0 = new Object[1];
	                    v2_0[0] = p7;
	                    throw new afq(String.format("Skipping event named \'%s\' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", v2_0));
	                } else {
	                    ahm.c.add(p7);
	                }
	            }
	            return;
	        } else {
	            if (p7 == null) {
	                p7 = "<None Provided>";
	            }
	            Object[] v3_1 = new Object[2];
	            v3_1[0] = p7;
	            v3_1[1] = Integer.valueOf(40);
	            throw new afq(String.format(java.util.Locale.ROOT, "Identifier \'%s\' must be less than %d characters", v3_1));
	        }
	    }
	
	
	    private Object writeReplace()
	    {
	        return new ahn(this.a.toString(), this.b);
	    }
	
	
	    public final String toString()
	    {
	        Object[] v1_1 = new Object[3];
	        v1_1[0] = this.a.optString("_eventName");
	        v1_1[1] = Boolean.valueOf(this.b);
	        v1_1[2] = this.a.toString();
	        return String.format("\"%s\", implicit: %b, json: %s", v1_1);
	    }
	
