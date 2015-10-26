	 java.lang.String a
	
	    public bfb(String p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public final int a()
	    {
	        java.io.IOException v0 = -1;
	        try {
	            String v2_1 = this.a("NOTICE.html.gz", bfb.c);
	        } catch (java.io.IOException v0) {
	            v0 = -2;
	            return v0;
	        }
	        if (v2_1.b() == 200) {
	            String v2_2 = v2_1.c();
	            if (v2_2 != null) {
	                String v2_3 = v2_2.a;
	                StringBuilder v3_3 = new StringBuilder();
	                char[] v4_2 = new char[2048];
	                java.io.InputStreamReader v5_1 = new java.io.InputStreamReader(new java.util.zip.GZIPInputStream(new java.io.ByteArrayInputStream(v2_3)));
	                while(true) {
	                    String v2_4 = v5_1.read(v4_2);
	                    if (v2_4 < null) {
	                        break;
	                    }
	                    v3_3.append(v4_2, 0, v2_4);
	                }
	                v5_1.close();
	                this.a = v3_3.toString();
	            }
	            v0 = 0;
	            return v0;
	        } else {
	            return v0;
	        }
	    }
	
