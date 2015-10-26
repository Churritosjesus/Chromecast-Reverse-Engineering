	public final  a
	public final  b
	public final  c
	public final  d
	public final  e
	public final  f
	public final  g
	public final  h
	public final  i
	private final  j
	private final  k
	private java.lang.String l
	
	    static dfb()
	    {
	        int v0_4;
	        int v0_1 = new dfc();
	        v0_1.a = 1;
	        v0_1.a();
	        dfc v1_1 = new dfc();
	        v1_1.e = 1;
	        long v2_1 = java.util.concurrent.TimeUnit.SECONDS.toSeconds(2147483647);
	        if (v2_1 <= 2147483647) {
	            v0_4 = ((int) v2_1);
	        } else {
	            v0_4 = 2147483647;
	        }
	        v1_1.c = v0_4;
	        v1_1.a();
	        return;
	    }
	
	
	    dfb(dfc p3)
	    {
	        this.a = p3.a;
	        this.b = 0;
	        this.c = p3.b;
	        this.j = -1;
	        this.d = 0;
	        this.e = 0;
	        this.f = 0;
	        this.g = p3.c;
	        this.h = p3.d;
	        this.i = p3.e;
	        this.k = 0;
	        return;
	    }
	
	
	    private dfb(boolean p1, boolean p2, int p3, int p4, boolean p5, boolean p6, boolean p7, int p8, int p9, boolean p10, boolean p11, String p12)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.j = p4;
	        this.d = p5;
	        this.e = p6;
	        this.f = p7;
	        this.g = p8;
	        this.h = p9;
	        this.i = p10;
	        this.k = p11;
	        this.l = p12;
	        return;
	    }
	
	
	    public static dfb a(dfo p23)
	    {
	        int v4 = 0;
	        int v5_0 = -1;
	        int v6_0 = -1;
	        int v7 = 0;
	        int v8 = 0;
	        int v9 = 0;
	        int v10_0 = -1;
	        int v11_0 = -1;
	        int v12 = 0;
	        int v13 = 0;
	        int v15 = 1;
	        int v19 = (p23.a.length / 2);
	        int v18 = 0;
	        dfb v2_1 = 0;
	        int v3_1 = 0;
	        while (v18 < v19) {
	            int v16_3;
	            int v16_1 = p23.a(v18);
	            int v14_3 = p23.b(v18);
	            if (!v16_1.equalsIgnoreCase("Cache-Control")) {
	                if (!v16_1.equalsIgnoreCase("Pragma")) {
	                    v16_3 = v3_1;
	                } else {
	                    v15 = 0;
	                    v16_3 = v3_1;
	                    int v3_2 = 0;
	                    while (v3_2 < v14_3.length()) {
	                        boolean v17_10;
	                        boolean v17_5 = a.a(v14_3, v3_2, "=,;");
	                        String v20 = v14_3.substring(v3_2, v17_5).trim();
	                        if ((v17_5 != v14_3.length()) && ((v14_3.charAt(v17_5) != 44) && (v14_3.charAt(v17_5) != 59))) {
	                            int v3_9 = a.b(v14_3, (v17_5 + 1));
	                            if ((v3_9 >= v14_3.length()) || (v14_3.charAt(v3_9) != 34)) {
	                                boolean v17_9 = a.a(v14_3, v3_9, ",;");
	                                v3_2 = v17_9;
	                                v17_10 = v14_3.substring(v3_9, v17_9).trim();
	                            } else {
	                                int v3_12 = (v3_9 + 1);
	                                boolean v17_12 = a.a(v14_3, v3_12, "\"");
	                                v3_2 = (v17_12 + 1);
	                                v17_10 = v14_3.substring(v3_12, v17_12);
	                            }
	                        } else {
	                            v3_2 = (v17_5 + 1);
	                            v17_10 = 0;
	                        }
	                        if (!"no-cache".equalsIgnoreCase(v20)) {
	                            if (!"no-store".equalsIgnoreCase(v20)) {
	                                if (!"max-age".equalsIgnoreCase(v20)) {
	                                    if (!"s-maxage".equalsIgnoreCase(v20)) {
	                                        if (!"private".equalsIgnoreCase(v20)) {
	                                            if (!"public".equalsIgnoreCase(v20)) {
	                                                if (!"must-revalidate".equalsIgnoreCase(v20)) {
	                                                    if (!"max-stale".equalsIgnoreCase(v20)) {
	                                                        if (!"min-fresh".equalsIgnoreCase(v20)) {
	                                                            if (!"only-if-cached".equalsIgnoreCase(v20)) {
	                                                                if ("no-transform".equalsIgnoreCase(v20)) {
	                                                                    v13 = 1;
	                                                                }
	                                                            } else {
	                                                                v12 = 1;
	                                                            }
	                                                        } else {
	                                                            v11_0 = a.c(v17_10, -1);
	                                                        }
	                                                    } else {
	                                                        v10_0 = a.c(v17_10, 2147483647);
	                                                    }
	                                                } else {
	                                                    v9 = 1;
	                                                }
	                                            } else {
	                                                v8 = 1;
	                                            }
	                                        } else {
	                                            v7 = 1;
	                                        }
	                                    } else {
	                                        v6_0 = a.c(v17_10, -1);
	                                    }
	                                } else {
	                                    v5_0 = a.c(v17_10, -1);
	                                }
	                            } else {
	                                v4 = 1;
	                            }
	                        } else {
	                            v16_3 = 1;
	                        }
	                    }
	                }
	            } else {
	                if (v2_1 == null) {
	                    v2_1 = v14_3;
	                } else {
	                    v15 = 0;
	                }
	            }
	            v18++;
	            v3_1 = v16_3;
	        }
	        int v14_2;
	        if (v15 != 0) {
	            v14_2 = v2_1;
	        } else {
	            v14_2 = 0;
	        }
	        return new dfb(v3_1, v4, v5_0, v6_0, v7, v8, v9, v10_0, v11_0, v12, v13, v14_2);
	    }
	
	
	    public final String toString()
	    {
	        String v0_0 = this.l;
	        if (v0_0 == null) {
	            String v0_2 = new StringBuilder();
	            if (this.a) {
	                v0_2.append("no-cache, ");
	            }
	            if (this.b) {
	                v0_2.append("no-store, ");
	            }
	            if (this.c != -1) {
	                v0_2.append("max-age=").append(this.c).append(", ");
	            }
	            if (this.j != -1) {
	                v0_2.append("s-maxage=").append(this.j).append(", ");
	            }
	            if (this.d) {
	                v0_2.append("private, ");
	            }
	            if (this.e) {
	                v0_2.append("public, ");
	            }
	            if (this.f) {
	                v0_2.append("must-revalidate, ");
	            }
	            if (this.g != -1) {
	                v0_2.append("max-stale=").append(this.g).append(", ");
	            }
	            if (this.h != -1) {
	                v0_2.append("min-fresh=").append(this.h).append(", ");
	            }
	            if (this.i) {
	                v0_2.append("only-if-cached, ");
	            }
	            if (this.k) {
	                v0_2.append("no-transform, ");
	            }
	            if (v0_2.length() != 0) {
	                v0_2.delete((v0_2.length() - 2), v0_2.length());
	                v0_0 = v0_2.toString();
	            } else {
	                v0_0 = "";
	            }
	            this.l = v0_0;
	        }
	        return v0_0;
	    }
	
