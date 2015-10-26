	private static final Ldie a
	private static final java.util.Map b
	
	    static dig()
	    {
	        int v0_0 = 0;
	        java.util.LinkedHashMap v1_1 = new die[61];
	        v1_1[0] = new die(die.e, "");
	        v1_1[1] = new die(die.b, "GET");
	        v1_1[2] = new die(die.b, "POST");
	        v1_1[3] = new die(die.c, "/");
	        v1_1[4] = new die(die.c, "/index.html");
	        v1_1[5] = new die(die.d, "http");
	        v1_1[6] = new die(die.d, "https");
	        v1_1[7] = new die(die.a, "200");
	        v1_1[8] = new die(die.a, "204");
	        v1_1[9] = new die(die.a, "206");
	        v1_1[10] = new die(die.a, "304");
	        v1_1[11] = new die(die.a, "400");
	        v1_1[12] = new die(die.a, "404");
	        v1_1[13] = new die(die.a, "500");
	        v1_1[14] = new die("accept-charset", "");
	        v1_1[15] = new die("accept-encoding", "gzip, deflate");
	        v1_1[16] = new die("accept-language", "");
	        v1_1[17] = new die("accept-ranges", "");
	        v1_1[18] = new die("accept", "");
	        v1_1[19] = new die("access-control-allow-origin", "");
	        v1_1[20] = new die("age", "");
	        v1_1[21] = new die("allow", "");
	        v1_1[22] = new die("authorization", "");
	        v1_1[23] = new die("cache-control", "");
	        v1_1[24] = new die("content-disposition", "");
	        v1_1[25] = new die("content-encoding", "");
	        v1_1[26] = new die("content-language", "");
	        v1_1[27] = new die("content-length", "");
	        v1_1[28] = new die("content-location", "");
	        v1_1[29] = new die("content-range", "");
	        v1_1[30] = new die("content-type", "");
	        v1_1[31] = new die("cookie", "");
	        v1_1[32] = new die("date", "");
	        v1_1[33] = new die("etag", "");
	        v1_1[34] = new die("expect", "");
	        v1_1[35] = new die("expires", "");
	        v1_1[36] = new die("from", "");
	        v1_1[37] = new die("host", "");
	        v1_1[38] = new die("if-match", "");
	        v1_1[39] = new die("if-modified-since", "");
	        v1_1[40] = new die("if-none-match", "");
	        v1_1[41] = new die("if-range", "");
	        v1_1[42] = new die("if-unmodified-since", "");
	        v1_1[43] = new die("last-modified", "");
	        v1_1[44] = new die("link", "");
	        v1_1[45] = new die("location", "");
	        v1_1[46] = new die("max-forwards", "");
	        v1_1[47] = new die("proxy-authenticate", "");
	        v1_1[48] = new die("proxy-authorization", "");
	        v1_1[49] = new die("range", "");
	        v1_1[50] = new die("referer", "");
	        v1_1[51] = new die("refresh", "");
	        v1_1[52] = new die("retry-after", "");
	        v1_1[53] = new die("server", "");
	        v1_1[54] = new die("set-cookie", "");
	        v1_1[55] = new die("strict-transport-security", "");
	        v1_1[56] = new die("transfer-encoding", "");
	        v1_1[57] = new die("user-agent", "");
	        v1_1[58] = new die("vary", "");
	        v1_1[59] = new die("via", "");
	        v1_1[60] = new die("www-authenticate", "");
	        dig.a = v1_1;
	        java.util.LinkedHashMap v1_3 = new java.util.LinkedHashMap(dig.a.length);
	        while (v0_0 < dig.a.length) {
	            if (!v1_3.containsKey(dig.a[v0_0].h)) {
	                v1_3.put(dig.a[v0_0].h, Integer.valueOf(v0_0));
	            }
	            v0_0++;
	        }
	        dig.b = java.util.Collections.unmodifiableMap(v1_3);
	        return;
	    }
	
	
	    static synthetic dke a(dke p4)
	    {
	        java.io.IOException v0_0 = 0;
	        while (v0_0 < p4.b.length) {
	            String v2_1 = p4.b[v0_0];
	            if ((v2_1 < 65) || (v2_1 > 90)) {
	                v0_0++;
	            } else {
	                throw new java.io.IOException(new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ").append(p4.a()).toString());
	            }
	        }
	        return p4;
	    }
	
	
	    static synthetic die[] a()
	    {
	        return dig.a;
	    }
	
	
	    static synthetic java.util.Map b()
	    {
	        return dig.b;
	    }
	
