	private final java.util.Map a
	private  b
	private final java.io.File c
	private final  d
	
	    public aem(java.io.File p2)
	    {
	        this(p2, 5242880);
	        return;
	    }
	
	
	    private aem(java.io.File p5, int p6)
	    {
	        this.a = new java.util.LinkedHashMap(16, 1061158912, 1);
	        this.b = 0;
	        this.c = p5;
	        this.d = 5242880;
	        return;
	    }
	
	
	    static int a(java.io.InputStream p2)
	    {
	        return ((((aem.e(p2) | 0) | (aem.e(p2) << 8)) | (aem.e(p2) << 16)) | (aem.e(p2) << 24));
	    }
	
	
	    static void a(java.io.OutputStream p1, int p2)
	    {
	        p1.write((p2 & 255));
	        p1.write(((p2 >> 8) & 255));
	        p1.write(((p2 >> 16) & 255));
	        p1.write((p2 >> 24));
	        return;
	    }
	
	
	    static void a(java.io.OutputStream p3, long p4)
	    {
	        p3.write(((byte) ((int) p4)));
	        p3.write(((byte) ((int) (p4 >> 8))));
	        p3.write(((byte) ((int) (p4 >> 16))));
	        p3.write(((byte) ((int) (p4 >> 24))));
	        p3.write(((byte) ((int) (p4 >> 32))));
	        p3.write(((byte) ((int) (p4 >> 40))));
	        p3.write(((byte) ((int) (p4 >> 48))));
	        p3.write(((byte) ((int) (p4 >> 56))));
	        return;
	    }
	
	
	    static void a(java.io.OutputStream p4, String p5)
	    {
	        byte[] v0_1 = p5.getBytes("UTF-8");
	        aem.a(p4, ((long) v0_1.length));
	        p4.write(v0_1, 0, v0_1.length);
	        return;
	    }
	
	
	    private void a(String p7, aen p8)
	    {
	        if (this.a.containsKey(p7)) {
	            this.b = ((p8.a - ((aen) this.a.get(p7)).a) + this.b);
	        } else {
	            this.b = (this.b + p8.a);
	        }
	        this.a.put(p7, p8);
	        return;
	    }
	
	
	    private static byte[] a(java.io.InputStream p4, int p5)
	    {
	        java.io.IOException v1_0 = new byte[p5];
	        String v0_0 = 0;
	        while (v0_0 < p5) {
	            String v2_1 = p4.read(v1_0, v0_0, (p5 - v0_0));
	            if (v2_1 == -1) {
	                break;
	            }
	            v0_0 += v2_1;
	        }
	        if (v0_0 == p5) {
	            return v1_0;
	        } else {
	            throw new java.io.IOException(new StringBuilder("Expected ").append(p5).append(" bytes, read ").append(v0_0).append(" bytes").toString());
	        }
	    }
	
	
	    static long b(java.io.InputStream p8)
	    {
	        return ((((((((0 | (((long) aem.e(p8)) & 255)) | ((((long) aem.e(p8)) & 255) << 8)) | ((((long) aem.e(p8)) & 255) << 16)) | ((((long) aem.e(p8)) & 255) << 24)) | ((((long) aem.e(p8)) & 255) << 32)) | ((((long) aem.e(p8)) & 255) << 40)) | ((((long) aem.e(p8)) & 255) << 48)) | ((((long) aem.e(p8)) & 255) << 56));
	    }
	
	
	    private declared_synchronized void b(String p7)
	    {
	        try {
	            Object[] v1_0 = this.d(p7).delete();
	            String v0_3 = ((aen) this.a.get(p7));
	        } catch (String v0_6) {
	            throw v0_6;
	        }
	        if (v0_3 != null) {
	            this.b = (this.b - v0_3.a);
	            this.a.remove(p7);
	        }
	        if (v1_0 == null) {
	            Object[] v1_2 = new Object[2];
	            v1_2[0] = p7;
	            v1_2[1] = aem.c(p7);
	            aeg.b("Could not delete cache entry for key=%s, filename=%s", v1_2);
	        }
	        return;
	    }
	
	
	    static String c(java.io.InputStream p3)
	    {
	        return new String(aem.a(p3, ((int) aem.b(p3))), "UTF-8");
	    }
	
	
	    private static String c(String p3)
	    {
	        String v0_1 = (p3.length() / 2);
	        return new StringBuilder().append(String.valueOf(p3.substring(0, v0_1).hashCode())).append(String.valueOf(p3.substring(v0_1).hashCode())).toString();
	    }
	
	
	    private java.io.File d(String p4)
	    {
	        return new java.io.File(this.c, aem.c(p4));
	    }
	
	
	    static java.util.Map d(java.io.InputStream p5)
	    {
	        java.util.HashMap v0_1;
	        int v2 = aem.a(p5);
	        if (v2 != 0) {
	            v0_1 = new java.util.HashMap(v2);
	        } else {
	            v0_1 = java.util.Collections.emptyMap();
	        }
	        int v1 = 0;
	        while (v1 < v2) {
	            v0_1.put(aem.c(p5).intern(), aem.c(p5).intern());
	            v1++;
	        }
	        return v0_1;
	    }
	
	
	    private static int e(java.io.InputStream p2)
	    {
	        java.io.EOFException v0_0 = p2.read();
	        if (v0_0 != -1) {
	            return v0_0;
	        } else {
	            throw new java.io.EOFException();
	        }
	    }
	
	
	    public final declared_synchronized adh a(String p11)
	    {
	        try {
	            int v0_7;
	            int v0_2 = ((aen) this.a.get(p11));
	        } catch (int v0_8) {
	            throw v0_8;
	        }
	        if (v0_2 != 0) {
	            int v4_0 = this.d(p11);
	            try {
	                String v3_1 = new aeo(new java.io.FileInputStream(v4_0));
	            } catch (int v0_3) {
	                String v2_2 = 0;
	                try {
	                    Object[] v5_3 = new Object[2];
	                    v5_3[0] = v4_0.getAbsolutePath();
	                    v5_3[1] = v0_3.toString();
	                    aeg.b("%s: %s", v5_3);
	                    this.b(p11);
	                } catch (int v0_4) {
	                    v3_1 = v2_2;
	                    if (v3_1 != null) {
	                        try {
	                            v3_1.close();
	                        } catch (int v0) {
	                            v0_7 = 0;
	                            return v0_7;
	                        }
	                    }
	                    throw v0_4;
	                }
	                if (v2_2 != null) {
	                    try {
	                        v2_2.close();
	                    } catch (int v0) {
	                        v0_7 = 0;
	                        return v0_7;
	                    }
	                }
	                v0_7 = 0;
	            } catch (int v0_4) {
	                v3_1 = 0;
	            }
	            try {
	                aen.a(v3_1);
	                Object[] v5_0 = aem.a(v3_1, ((int) (v4_0.length() - ((long) aeo.a(v3_1)))));
	                String v2_6 = new adh();
	                v2_6.a = v5_0;
	                v2_6.b = v0_2.c;
	                v2_6.c = v0_2.d;
	                v2_6.d = v0_2.e;
	                v2_6.e = v0_2.f;
	                v2_6.f = v0_2.g;
	                v2_6.g = v0_2.h;
	                try {
	                    v3_1.close();
	                    v0_7 = v2_6;
	                } catch (int v0) {
	                    v0_7 = 0;
	                }
	            } catch (int v0_3) {
	                v2_2 = v3_1;
	            } catch (int v0_4) {
	            }
	        } else {
	            v0_7 = 0;
	        }
	        return v0_7;
	    }
	
	
	    public final declared_synchronized void a()
	    {
	        try {
	            if (this.c.exists()) {
	                String v3_0 = this.c.listFiles();
	                if (v3_0 != null) {
	                    int v4 = v3_0.length;
	                    int v2_0 = 0;
	                    while (v2_0 < v4) {
	                        String v5 = v3_0[v2_0];
	                        java.io.IOException v1_3 = 0;
	                        try {
	                            java.io.IOException v0_2 = new java.io.BufferedInputStream(new java.io.FileInputStream(v5));
	                            try {
	                                java.io.IOException v1_4 = aen.a(v0_2);
	                                v1_4.a = v5.length();
	                                this.a(v1_4.b, v1_4);
	                            } catch (java.io.IOException v1) {
	                                if (v5 != null) {
	                                    v5.delete();
	                                }
	                                if (v0_2 == null) {
	                                    v2_0++;
	                                } else {
	                                    try {
	                                        v0_2.close();
	                                    } catch (java.io.IOException v0) {
	                                    }
	                                }
	                            }
	                            try {
	                                v0_2.close();
	                            } catch (java.io.IOException v0) {
	                            }
	                        } catch (java.io.IOException v1_5) {
	                            v1_3 = v0_2;
	                            java.io.IOException v0_3 = v1_5;
	                            if (v1_3 != null) {
	                                try {
	                                    v1_3.close();
	                                } catch (java.io.IOException v1) {
	                                }
	                            }
	                            throw v0_3;
	                        } catch (java.io.IOException v0) {
	                            v0_2 = 0;
	                        } catch (java.io.IOException v0_3) {
	                        }
	                    }
	                }
	            } else {
	                if (!this.c.mkdirs()) {
	                    java.io.IOException v1_7 = new Object[1];
	                    v1_7[0] = this.c.getAbsolutePath();
	                    aeg.c("Unable to create cache dir %s", v1_7);
	                }
	            }
	        } catch (java.io.IOException v0_8) {
	            throw v0_8;
	        }
	        return;
	    }
	
	
	    public final declared_synchronized void a(String p13, adh p14)
	    {
	        int v1_0 = 0;
	        try {
	            Object[] v2_0 = p14.a.length;
	        } catch (int v0_20) {
	            throw v0_20;
	        }
	        if ((this.b + ((long) v2_0)) >= ((long) this.d)) {
	            if (aeg.a) {
	                Long v3_1 = new Object[0];
	                aeg.a("Pruning old cache entries.", v3_1);
	            }
	            long v4_2 = this.b;
	            long v6_2 = android.os.SystemClock.elapsedRealtime();
	            Long v3_2 = this.a.entrySet().iterator();
	            while (v3_2.hasNext()) {
	                int v0_12 = ((aen) ((java.util.Map$Entry) v3_2.next()).getValue());
	                if (!this.d(v0_12.b).delete()) {
	                    int v9_1 = new Object[2];
	                    v9_1[0] = v0_12.b;
	                    v9_1[1] = aem.c(v0_12.b);
	                    aeg.b("Could not delete cache entry for key=%s, filename=%s", v9_1);
	                } else {
	                    this.b = (this.b - v0_12.a);
	                }
	                v3_2.remove();
	                int v0_8 = (v1_0 + 1);
	                if (((float) (this.b + ((long) v2_0))) >= (((float) this.d) * 1063675494)) {
	                    v1_0 = v0_8;
	                }
	                if (aeg.a) {
	                    Object[] v2_2 = new Object[3];
	                    v2_2[0] = Integer.valueOf(v0_8);
	                    v2_2[1] = Long.valueOf((this.b - v4_2));
	                    v2_2[2] = Long.valueOf((android.os.SystemClock.elapsedRealtime() - v6_2));
	                    aeg.a("pruned %d files, %d bytes, %d ms", v2_2);
	                }
	            }
	            v0_8 = v1_0;
	        }
	        int v0_18 = this.d(p13);
	        try {
	            int v1_6 = new java.io.FileOutputStream(v0_18);
	            Object[] v2_4 = new aen(p13, p14);
	        } catch (int v1) {
	            if (v0_18.delete()) {
	                return;
	            } else {
	                Object[] v2_8 = new Object[1];
	                v2_8[0] = v0_18.getAbsolutePath();
	                aeg.b("Could not clean up file %s", v2_8);
	                return;
	            }
	        }
	        if (v2_4.a(v1_6)) {
	            v1_6.write(p14.a);
	            v1_6.close();
	            this.a(p13, v2_4);
	            return;
	        } else {
	            v1_6.close();
	            Object[] v2_6 = new Object[1];
	            v2_6[0] = v0_18.getAbsolutePath();
	            aeg.b("Failed to write header for %s", v2_6);
	            throw new java.io.IOException();
	        }
	    }
	
