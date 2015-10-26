	public static final B a
	public static final Ljava.lang.String b
	public static final java.nio.charset.Charset c
	
	    static dgs()
	    {
	        java.nio.charset.Charset v0_0 = new byte[0];
	        dgs.a = v0_0;
	        java.nio.charset.Charset v0_1 = new String[0];
	        dgs.b = v0_1;
	        dgs.c = java.nio.charset.Charset.forName("UTF-8");
	        return;
	    }
	
	
	    public static int a(String p1)
	    {
	        int v0_4;
	        if (!"http".equals(p1)) {
	            if (!"https".equals(p1)) {
	                v0_4 = -1;
	            } else {
	                v0_4 = 443;
	            }
	        } else {
	            v0_4 = 80;
	        }
	        return v0_4;
	    }
	
	
	    private static int a(String p1, int p2)
	    {
	        if (p2 == -1) {
	            p2 = dgs.a(p1);
	        }
	        return p2;
	    }
	
	
	    public static int a(java.net.URI p2)
	    {
	        return dgs.a(p2.getScheme(), p2.getPort());
	    }
	
	
	    public static int a(java.net.URL p2)
	    {
	        return dgs.a(p2.getProtocol(), p2.getPort());
	    }
	
	
	    public static dke a(dke p2)
	    {
	        try {
	            return dke.a(java.security.MessageDigest.getInstance("SHA-1").digest(p2.d()));
	        } catch (java.security.NoSuchAlgorithmException v0_4) {
	            throw new AssertionError(v0_4);
	        }
	    }
	
	
	    public static java.util.List a(java.util.List p1)
	    {
	        return java.util.Collections.unmodifiableList(new java.util.ArrayList(p1));
	    }
	
	
	    public static varargs java.util.List a(Object[] p1)
	    {
	        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(((Object[]) p1.clone())));
	    }
	
	
	    public static java.util.Map a(java.util.Map p1)
	    {
	        return java.util.Collections.unmodifiableMap(new java.util.LinkedHashMap(p1));
	    }
	
	
	    public static java.util.concurrent.ThreadFactory a(String p2, boolean p3)
	    {
	        return new dgt(p2, 1);
	    }
	
	
	    public static void a(long p4, long p6, long p8)
	    {
	        if (((p6 | p8) >= 0) && ((p6 <= p4) && ((p4 - p6) >= p8))) {
	            return;
	        } else {
	            throw new ArrayIndexOutOfBoundsException();
	        }
	    }
	
	
	    public static void a(java.io.Closeable p1)
	    {
	        if (p1 != null) {
	            try {
	                p1.close();
	            } catch (Exception v0) {
	                throw v0;
	            } catch (Exception v0) {
	            }
	        }
	        return;
	    }
	
	
	    public static void a(java.io.Closeable p2, java.io.Closeable p3)
	    {
	        Error v0_0 = 0;
	        try {
	            p2.close();
	            try {
	                p3.close();
	            } catch (AssertionError v1_0) {
	                if (v0_0 != null) {
	                } else {
	                    v0_0 = v1_0;
	                }
	            }
	            if (v0_0 != null) {
	                if (!(v0_0 instanceof java.io.IOException)) {
	                    if (!(v0_0 instanceof RuntimeException)) {
	                        if (!(v0_0 instanceof Error)) {
	                            throw new AssertionError(v0_0);
	                        } else {
	                            throw ((Error) v0_0);
	                        }
	                    } else {
	                        throw ((RuntimeException) v0_0);
	                    }
	                } else {
	                    throw ((java.io.IOException) v0_0);
	                }
	            } else {
	                return;
	            }
	        } catch (Error v0_0) {
	        }
	    }
	
	
	    public static void a(java.net.Socket p1)
	    {
	        if (p1 != null) {
	            try {
	                p1.close();
	            } catch (Exception v0) {
	                throw v0;
	            } catch (Exception v0) {
	            }
	        }
	        return;
	    }
	
	
	    public static boolean a(dkv p1, int p2, java.util.concurrent.TimeUnit p3)
	    {
	        try {
	            int v0_1 = dgs.b(p1, 100, p3);
	        } catch (int v0) {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public static boolean a(Object p1, Object p2)
	    {
	        if ((p1 != p2) && ((p1 == null) || (!p1.equals(p2)))) {
	            int v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public static Object[] a(Class p9, Object[] p10, Object[] p11)
	    {
	        java.util.ArrayList v3_1 = new java.util.ArrayList();
	        int v4 = p10.length;
	        int v2 = 0;
	        while (v2 < v4) {
	            int v0_4 = 0;
	            while (v0_4 < p11.length) {
	                Object v7 = p11[v0_4];
	                if (!p10[v2].equals(v7)) {
	                    v0_4++;
	                } else {
	                    v3_1.add(v7);
	                    break;
	                }
	            }
	            v2++;
	        }
	        return v3_1.toArray(((Object[]) reflect.Array.newInstance(p9, v3_1.size())));
	    }
	
	
	    public static boolean b(dkv p12, int p13, java.util.concurrent.TimeUnit p14)
	    {
	        int v0_2;
	        long v6 = System.nanoTime();
	        if (!p12.a().m_()) {
	            v0_2 = nan;
	        } else {
	            v0_2 = (p12.a().c() - v6);
	        }
	        p12.a().a((Math.min(v0_2, p14.toNanos(((long) p13))) + v6));
	        try {
	            java.io.InterruptedIOException v4_2 = new djz();
	        } catch (java.io.InterruptedIOException v4_3) {
	            if (v0_2 != nan) {
	                p12.a().a((v0_2 + v6));
	            } else {
	                p12.a().n_();
	            }
	            throw v4_3;
	        } catch (java.io.InterruptedIOException v4) {
	            if (v0_2 != nan) {
	                p12.a().a((v0_2 + v6));
	            } else {
	                p12.a().n_();
	            }
	            int v0_7 = 0;
	            return v0_7;
	        }
	        while (p12.a(v4_2, 2048) != -1) {
	            v4_2.q();
	        }
	        if (v0_2 != nan) {
	            p12.a().a((v0_2 + v6));
	        } else {
	            p12.a().n_();
	        }
	        v0_7 = 1;
	        return v0_7;
	    }
	
