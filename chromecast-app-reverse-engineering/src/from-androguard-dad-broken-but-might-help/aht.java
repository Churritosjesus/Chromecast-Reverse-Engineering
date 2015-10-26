	private java.util.List a
	private java.util.List b
	private  c
	private ahx d
	private java.lang.String e
	
	    public aht(ahx p2, String p3, String p4)
	    {
	        this.a = new java.util.ArrayList();
	        this.b = new java.util.ArrayList();
	        this.d = p2;
	        this.e = p4;
	        return;
	    }
	
	
	    private static byte[] a(String p3)
	    {
	        try {
	            byte[] v0 = p3.getBytes("UTF-8");
	        } catch (java.io.UnsupportedEncodingException v1_1) {
	            aji.a("Encoding exception: ", v1_1);
	        }
	        return v0;
	    }
	
	
	    public final declared_synchronized int a()
	    {
	        try {
	            return this.a.size();
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	    }
	
	
	    public final int a(aga p7, boolean p8, boolean p9)
	    {
	        try {
	            String v1_0 = this.c;
	            this.b.addAll(this.a);
	            this.a.clear();
	            org.json.JSONArray v2_2 = new org.json.JSONArray();
	            String v3_0 = this.b.iterator();
	        } catch (int v0_14) {
	            throw v0_14;
	        }
	        while (v3_0.hasNext()) {
	            int v0_12 = ((ahm) v3_0.next());
	            if ((p8) || (!v0_12.b)) {
	                v2_2.put(v0_12.a);
	            }
	        }
	        int v0_10;
	        if (v2_2.length() != 0) {
	            try {
	                int v0_6 = ahu.a(ahw.b, this.d, this.e, p9, ahe.e());
	            } catch (int v0) {
	                v0_6 = new org.json.JSONObject();
	                p7.c = v0_6;
	                int v0_8 = p7.d;
	                if (v0_8 == 0) {
	                    v0_8 = new android.os.Bundle();
	                }
	                String v1_1 = v2_2.toString();
	                if (v1_1 != null) {
	                    v0_8.putByteArray("custom_events_file", aht.a(v1_1));
	                    p7.f = v1_1;
	                }
	                p7.d = v0_8;
	                v0_10 = v2_2.length();
	            }
	            if (this.c <= 0) {
	            } else {
	                v0_6.put("num_skipped_events", v1_0);
	            }
	        } else {
	            v0_10 = 0;
	        }
	        return v0_10;
	    }
	
	
	    public final declared_synchronized void a(ahm p3)
	    {
	        try {
	            if ((this.a.size() + this.b.size()) < 1000) {
	                this.a.add(p3);
	            } else {
	                this.c = (this.c + 1);
	            }
	        } catch (java.util.List v0_6) {
	            throw v0_6;
	        }
	        return;
	    }
	
	
	    public final declared_synchronized void a(java.util.List p2)
	    {
	        try {
	            this.a.addAll(p2);
	            return;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public final declared_synchronized void a(boolean p3)
	    {
	        if (p3) {
	            try {
	                this.a.addAll(this.b);
	            } catch (Throwable v0_1) {
	                throw v0_1;
	            }
	        }
	        this.b.clear();
	        this.c = 0;
	        return;
	    }
	
	
	    public final declared_synchronized java.util.List b()
	    {
	        try {
	            Throwable v0_0 = this.a;
	            this.a = new java.util.ArrayList();
	            return v0_0;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
