	public static final djt a
	private static final java.util.regex.Pattern b
	
	    static djt()
	    {
	        djt.a = new djt();
	        djt.b = java.util.regex.Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
	        return;
	    }
	
	
	    private djt()
	    {
	        return;
	    }
	
	
	    public static java.util.List a(java.security.cert.X509Certificate p5)
	    {
	        java.util.List v0_1 = djt.a(p5, 7);
	        java.util.List v1_1 = djt.a(p5, 2);
	        java.util.ArrayList v2_1 = new java.util.ArrayList((v0_1.size() + v1_1.size()));
	        v2_1.addAll(v0_1);
	        v2_1.addAll(v1_1);
	        return v2_1;
	    }
	
	
	    private static java.util.List a(java.security.cert.X509Certificate p5, int p6)
	    {
	        java.util.ArrayList v2_1 = new java.util.ArrayList();
	        try {
	            String v0_2;
	            String v0_0 = p5.getSubjectAlternativeNames();
	        } catch (String v0) {
	            v0_2 = java.util.Collections.emptyList();
	            return v0_2;
	        }
	        if (v0_0 != null) {
	            java.util.Iterator v3 = v0_0.iterator();
	            while (v3.hasNext()) {
	                String v0_4 = ((java.util.List) v3.next());
	                if ((v0_4 != null) && (v0_4.size() >= 2)) {
	                    int v1_3 = ((Integer) v0_4.get(0));
	                    if ((v1_3 != 0) && (v1_3.intValue() == p6)) {
	                        String v0_6 = ((String) v0_4.get(1));
	                        if (v0_6 != null) {
	                            v2_1.add(v0_6);
	                        }
	                    }
	                }
	            }
	            v0_2 = v2_1;
	            return v0_2;
	        } else {
	            v0_2 = java.util.Collections.emptyList();
	            return v0_2;
	        }
	    }
	
	
	    private static boolean a(String p7, String p8)
	    {
	        int v0 = 0;
	        if ((p7 != null) && ((p7.length() != 0) && ((!p7.startsWith(".")) && ((!p7.endsWith("..")) && ((p8 != null) && ((p8.length() != 0) && ((!p8.startsWith(".")) && (!p8.endsWith(".."))))))))) {
	            if (!p7.endsWith(".")) {
	                p7 = new StringBuilder().append(p7).append(46).toString();
	            }
	            if (!p8.endsWith(".")) {
	                p8 = new StringBuilder().append(p8).append(46).toString();
	            }
	            int v2_23 = p8.toLowerCase(java.util.Locale.US);
	            if (v2_23.contains("*")) {
	                if ((v2_23.startsWith("*.")) && ((v2_23.indexOf(42, 1) == -1) && ((p7.length() >= v2_23.length()) && (!"*.".equals(v2_23))))) {
	                    int v2_24 = v2_23.substring(1);
	                    if (p7.endsWith(v2_24)) {
	                        int v2_26 = (p7.length() - v2_24.length());
	                        if ((v2_26 <= 0) || (p7.lastIndexOf(46, (v2_26 - 1)) == -1)) {
	                            v0 = 1;
	                        }
	                    }
	                }
	            } else {
	                v0 = p7.equals(v2_23);
	            }
	        }
	        return v0;
	    }
	
	
	    public final boolean verify(String p12, javax.net.ssl.SSLSession p13)
	    {
	        boolean v3 = 0;
	        int v0_51;
	        int v0_2 = ((java.security.cert.X509Certificate) p13.getPeerCertificates()[0]);
	        if (!djt.b.matcher(p12).matches()) {
	            String v6 = p12.toLowerCase(java.util.Locale.US);
	            char[] v7_0 = djt.a(v0_2, 2);
	            int v8_0 = v7_0.size();
	            String v5_0 = 0;
	            String v1_6 = 0;
	            while (v5_0 < v8_0) {
	                if (!djt.a(v6, ((String) v7_0.get(v5_0)))) {
	                    v5_0++;
	                    v1_6 = 1;
	                } else {
	                    v3 = 1;
	                    return v3;
	                }
	            }
	            if (v1_6 == null) {
	                int v0_11;
	                String v2_2 = new djs(v0_2.getSubjectX500Principal());
	                v2_2.c = 0;
	                v2_2.d = 0;
	                v2_2.e = 0;
	                v2_2.f = 0;
	                v2_2.g = v2_2.a.toCharArray();
	                int v0_10 = v2_2.a();
	                if (v0_10 != 0) {
	                    String v1_7 = v0_10;
	                    do {
	                        v0_11 = "";
	                        if (v2_2.c != v2_2.b) {
	                            switch (v2_2.g[v2_2.c]) {
	                                case 34:
	                                    v2_2.c = (v2_2.c + 1);
	                                    v2_2.d = v2_2.c;
	                                    v2_2.e = v2_2.d;
	                                    while (v2_2.c != v2_2.b) {
	                                        if (v2_2.g[v2_2.c] != 34) {
	                                            if (v2_2.g[v2_2.c] != 92) {
	                                                v2_2.g[v2_2.e] = v2_2.g[v2_2.c];
	                                            } else {
	                                                v2_2.g[v2_2.e] = v2_2.d();
	                                            }
	                                            v2_2.c = (v2_2.c + 1);
	                                            v2_2.e = (v2_2.e + 1);
	                                        } else {
	                                            v2_2.c = (v2_2.c + 1);
	                                            while ((v2_2.c < v2_2.b) && (v2_2.g[v2_2.c] == 32)) {
	                                                v2_2.c = (v2_2.c + 1);
	                                            }
	                                            v0_11 = new String(v2_2.g, v2_2.d, (v2_2.e - v2_2.d));
	                                        }
	                                    }
	                                    throw new IllegalStateException(new StringBuilder("Unexpected end of DN: ").append(v2_2.a).toString());
	                                case 35:
	                                    v0_11 = v2_2.b();
	                                case 43:
	                                case 44:
	                                case 59:
	                                    break;
	                                case 43:
	                                case 44:
	                                case 59:
	                                    break;
	                                case 43:
	                                case 44:
	                                case 59:
	                                    break;
	                                default:
	                                    v0_11 = v2_2.c();
	                            }
	                        } else {
	                            v0_11 = 0;
	                            break;
	                        }
	                    } while("cn".equalsIgnoreCase(v1_7));
	                } else {
	                    v0_11 = 0;
	                }
	                if (v0_11 != 0) {
	                    v3 = djt.a(v6, v0_11);
	                    return v3;
	                }
	            }
	            v0_51 = 0;
	        } else {
	            String v4_4 = djt.a(v0_2, 7);
	            String v5_2 = v4_4.size();
	            String v1_33 = 0;
	            while (v1_33 < v5_2) {
	                if (!p12.equalsIgnoreCase(((String) v4_4.get(v1_33)))) {
	                    v1_33++;
	                } else {
	                    v0_51 = 1;
	                }
	            }
	            return v3;
	        }
	        v3 = v0_51;
	        return v3;
	    }
	
