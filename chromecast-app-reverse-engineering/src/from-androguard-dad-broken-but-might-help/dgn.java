	private static final dgn a
	
	    static dgn()
	    {
	        dgn.a = dgn.c();
	        return;
	    }
	
	
	    public dgn()
	    {
	        return;
	    }
	
	
	    public static dgn a()
	    {
	        return dgn.a;
	    }
	
	
	    public static void a(String p1)
	    {
	        System.out.println(p1);
	        return;
	    }
	
	
	    public static String b()
	    {
	        return "OkHttp";
	    }
	
	
	    private static dgn c()
	    {
	        NoSuchMethodException v3_0 = 0;
	        try {
	            Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
	        } catch (NoSuchMethodException v0) {
	            Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
	        }
	        try {
	            NoSuchMethodException v4_1 = new Class[1];
	            v4_1[0] = Boolean.TYPE;
	            reflect.Method v1_1 = new dgm(0, "setUseSessionTickets", v4_1);
	            NoSuchMethodException v5_2 = new Class[1];
	            v5_2[0] = String;
	            reflect.Method v2_2 = new dgm(0, "setHostname", v5_2);
	            try {
	                NoSuchMethodException v0_5 = Class.forName("android.net.TrafficStats");
	                NoSuchMethodException v5_4 = new Class[1];
	                v5_4[0] = java.net.Socket;
	                NoSuchMethodException v5_5 = v0_5.getMethod("tagSocket", v5_4);
	            } catch (NoSuchMethodException v0) {
	                NoSuchMethodException v0_7 = 0;
	                NoSuchMethodException v4_4 = 0;
	                v5_5 = v0_7;
	                NoSuchMethodException v0_6 = 0;
	                NoSuchMethodException v6_7 = v3_0;
	                v3_0 = v5_5;
	                v5_5 = v0_6;
	                NoSuchMethodException v0_11 = new dgo(v1_1, v2_2, v3_0, v4_4, v5_5, v6_7);
	                return v0_11;
	            } catch (NoSuchMethodException v0) {
	                v0_6 = 0;
	                v4_4 = 0;
	                v5_5 = 0;
	            }
	            try {
	                NoSuchMethodException v6_4 = new Class[1];
	                v6_4[0] = java.net.Socket;
	                v4_4 = v0_5.getMethod("untagSocket", v6_4);
	                try {
	                    Class.forName("android.net.Network");
	                    String v8_2 = new Class[0];
	                    v0_6 = new dgm(byte[], "getAlpnSelectedProtocol", v8_2);
	                } catch (NoSuchMethodException v0) {
	                    v0_6 = 0;
	                    v6_7 = v3_0;
	                    v3_0 = v5_5;
	                    v5_5 = v0_6;
	                } catch (NoSuchMethodException v0) {
	                    v0_6 = 0;
	                }
	                try {
	                    Class[] v9_1 = new Class[1];
	                    v9_1[0] = byte[];
	                    v6_7 = new dgm(0, "setAlpnProtocols", v9_1);
	                    v3_0 = v5_5;
	                    v5_5 = v0_6;
	                } catch (NoSuchMethodException v6) {
	                } catch (NoSuchMethodException v6) {
	                }
	            } catch (NoSuchMethodException v0) {
	                v0_7 = v5_5;
	            } catch (NoSuchMethodException v0) {
	                v0_6 = 0;
	                v4_4 = 0;
	            }
	        } catch (NoSuchMethodException v0) {
	            try {
	                NoSuchMethodException v3_1 = Class.forName("org.eclipse.jetty.alpn.ALPN");
	                reflect.Method v1_7 = Class.forName(new StringBuilder().append("org.eclipse.jetty.alpn.ALPN").append("$Provider").toString());
	                NoSuchMethodException v4_7 = Class.forName(new StringBuilder().append("org.eclipse.jetty.alpn.ALPN").append("$ClientProvider").toString());
	                NoSuchMethodException v5_6 = Class.forName(new StringBuilder().append("org.eclipse.jetty.alpn.ALPN").append("$ServerProvider").toString());
	                reflect.Method v2_13 = new Class[2];
	                v2_13[0] = javax.net.ssl.SSLSocket;
	                v2_13[1] = v1_7;
	                reflect.Method v1_8 = v3_1.getMethod("put", v2_13);
	                reflect.Method v2_15 = new Class[1];
	                v2_15[0] = javax.net.ssl.SSLSocket;
	                reflect.Method v2_16 = v3_1.getMethod("get", v2_15);
	                NoSuchMethodException v6_12 = new Class[1];
	                v6_12[0] = javax.net.ssl.SSLSocket;
	                v0_11 = new dgp(v1_8, v2_16, v3_1.getMethod("remove", v6_12), v4_7, v5_6);
	            } catch (NoSuchMethodException v0) {
	                v0_11 = new dgn();
	            } catch (NoSuchMethodException v0) {
	            }
	            return v0_11;
	        }
	    }
	
	
	    public void a(java.net.Socket p1)
	    {
	        return;
	    }
	
	
	    public void a(java.net.Socket p1, java.net.InetSocketAddress p2, int p3)
	    {
	        p1.connect(p2, p3);
	        return;
	    }
	
	
	    public void a(javax.net.ssl.SSLSocket p1)
	    {
	        return;
	    }
	
	
	    public void a(javax.net.ssl.SSLSocket p1, String p2, java.util.List p3)
	    {
	        return;
	    }
	
	
	    public String b(javax.net.ssl.SSLSocket p2)
	    {
	        return 0;
	    }
	
	
	    public void b(java.net.Socket p1)
	    {
	        return;
	    }
	
