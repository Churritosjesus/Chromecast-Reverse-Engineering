	public final dfx a
	public final  b
	public final java.lang.String c
	
	    private dhv(dfx p1, int p2, String p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public static dhv a(dgc p4)
	    {
	        return new dhv(p4.b, p4.c, p4.d);
	    }
	
	
	    public static dhv a(String p7)
	    {
	        java.net.ProtocolException v0_6;
	        String v1_0 = 9;
	        if (!p7.startsWith("HTTP/1.")) {
	            if (!p7.startsWith("ICY ")) {
	                throw new java.net.ProtocolException(new StringBuilder("Unexpected status line: ").append(p7).toString());
	            } else {
	                v0_6 = dfx.a;
	                v1_0 = 4;
	            }
	        } else {
	            if ((p7.length() >= 9) && (p7.charAt(8) == 32)) {
	                java.net.ProtocolException v0_12 = (p7.charAt(7) - 48);
	                if (v0_12 != null) {
	                    if (v0_12 != 1) {
	                        throw new java.net.ProtocolException(new StringBuilder("Unexpected status line: ").append(p7).toString());
	                    } else {
	                        v0_6 = dfx.b;
	                    }
	                } else {
	                    v0_6 = dfx.a;
	                }
	            } else {
	                throw new java.net.ProtocolException(new StringBuilder("Unexpected status line: ").append(p7).toString());
	            }
	        }
	        if (p7.length() >= (v1_0 + 3)) {
	            try {
	                String v1_13;
	                int v3_1 = Integer.parseInt(p7.substring(v1_0, (v1_0 + 3)));
	            } catch (java.net.ProtocolException v0) {
	                throw new java.net.ProtocolException(new StringBuilder("Unexpected status line: ").append(p7).toString());
	            }
	            if (p7.length() <= (v1_0 + 3)) {
	                v1_13 = "";
	            } else {
	                if (p7.charAt((v1_0 + 3)) == 32) {
	                    v1_13 = p7.substring((v1_0 + 4));
	                } else {
	                    throw new java.net.ProtocolException(new StringBuilder("Unexpected status line: ").append(p7).toString());
	                }
	            }
	            return new dhv(v0_6, v3_1, v1_13);
	        } else {
	            throw new java.net.ProtocolException(new StringBuilder("Unexpected status line: ").append(p7).toString());
	        }
	    }
	
	
	    public final String toString()
	    {
	        String v0_1;
	        StringBuilder v1_1 = new StringBuilder();
	        if (this.a != dfx.a) {
	            v0_1 = "HTTP/1.1";
	        } else {
	            v0_1 = "HTTP/1.0";
	        }
	        v1_1.append(v0_1);
	        v1_1.append(32).append(this.b);
	        if (this.c != null) {
	            v1_1.append(32).append(this.c);
	        }
	        return v1_1.toString();
	    }
	
