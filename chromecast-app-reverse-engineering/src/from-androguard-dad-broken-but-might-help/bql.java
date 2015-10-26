	private static java.lang.String a
	private static java.lang.String b
	private static bql c
	
	    static bql()
	    {
	        bql.a = "3";
	        bql.b = "01VDIWEA?";
	        return;
	    }
	
	
	    public bql(brb p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    private static String a(Object p8)
	    {
	        String v0_5;
	        if (p8 != null) {
	            String v1_0;
	            if (!(p8 instanceof Integer)) {
	                v1_0 = p8;
	            } else {
	                v1_0 = new Long(((long) ((Integer) p8).intValue()));
	            }
	            if (!(v1_0 instanceof Long)) {
	                if (!(v1_0 instanceof Boolean)) {
	                    if (!(v1_0 instanceof Throwable)) {
	                        v0_5 = "-";
	                    } else {
	                        v0_5 = v1_0.getClass().getCanonicalName();
	                    }
	                } else {
	                    v0_5 = String.valueOf(v1_0);
	                }
	            } else {
	                if (Math.abs(((Long) v1_0).longValue()) >= 100) {
	                    String v0_12;
	                    if (String.valueOf(v1_0).charAt(0) != 45) {
	                        v0_12 = "";
	                    } else {
	                        v0_12 = "-";
	                    }
	                    String v1_3 = String.valueOf(Math.abs(((Long) v1_0).longValue()));
	                    StringBuilder v2_8 = new StringBuilder();
	                    v2_8.append(v0_12);
	                    v2_8.append(Math.round(Math.pow(10.0, ((double) (v1_3.length() - 1)))));
	                    v2_8.append("...");
	                    v2_8.append(v0_12);
	                    v2_8.append(Math.round((Math.pow(10.0, ((double) v1_3.length())) - 1.0)));
	                    v0_5 = v2_8.toString();
	                } else {
	                    v0_5 = String.valueOf(v1_0);
	                }
	            }
	        } else {
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
	
	    public static bql b()
	    {
	        return bql.c;
	    }
	
	
	    private declared_synchronized void b(int p7, String p8, Object p9, Object p10, Object p11)
	    {
	        bqq v0_0 = 0;
	        try {
	            a.c(p8);
	        } catch (bqq v0_18) {
	            throw v0_18;
	        }
	        if (p7 >= 0) {
	            v0_0 = p7;
	        }
	        String v1_2;
	        if (v0_0 < bql.b.length()) {
	            v1_2 = v0_0;
	        } else {
	            v1_2 = (bql.b.length() - 1);
	        }
	        bqq v0_7;
	        if (!this.m().a()) {
	            if (!byk.a) {
	                v0_7 = 99;
	            } else {
	                v0_7 = 112;
	            }
	        } else {
	            if (!byk.a) {
	                v0_7 = 67;
	            } else {
	                v0_7 = 80;
	            }
	        }
	        String v1_9;
	        bqq v0_13 = new StringBuilder().append(bql.a).append(bql.b.charAt(v1_2)).append(v0_7).append("7327").append(":").append(bql.c(p8, bql.a(p9), bql.a(p10), bql.a(p11))).toString();
	        if (v0_13.length() <= 1024) {
	            v1_9 = v0_13;
	        } else {
	            v1_9 = v0_13.substring(0, 1024);
	        }
	        bqq v0_16;
	        bqq v0_15 = this.d;
	        if ((v0_15.g != null) && (v0_15.g.q())) {
	            v0_16 = v0_15.g;
	        } else {
	            v0_16 = 0;
	        }
	        if (v0_16 != null) {
	            v0_16.b.a(v1_9);
	        }
	        return;
	    }
	
	
	    protected final void a()
	    {
	        try {
	            bql.c = this;
	            return;
	        } catch (Throwable v0) {
	            throw v0;
	        }
	    }
	
	
	    public final void a(int p3, String p4, Object p5, Object p6, Object p7)
	    {
	        int v0_2 = ((String) bqd.b.a());
	        if (android.util.Log.isLoggable(v0_2, p3)) {
	            android.util.Log.println(p3, v0_2, bql.c(p4, p5, p6, p7));
	        }
	        if (p3 >= 5) {
	            this.b(p3, p4, p5, p6, p7);
	        }
	        return;
	    }
	
	
	    public final void a(bsi p4, String p5)
	    {
	        String v0;
	        if (p4 == null) {
	            v0 = "no hit data";
	        } else {
	            v0 = p4.toString();
	        }
	        this.d(new StringBuilder("Discarding hit. ").append(p5).toString(), v0);
	        return;
	    }
	
	
	    public final void a(java.util.Map p5, String p6)
	    {
	        String v0_0;
	        if (p5 == null) {
	            v0_0 = "no hit data";
	        } else {
	            String v2_1 = new StringBuilder();
	            java.util.Iterator v3 = p5.entrySet().iterator();
	            while (v3.hasNext()) {
	                String v0_4 = ((java.util.Map$Entry) v3.next());
	                if (v2_1.length() > 0) {
	                    v2_1.append(44);
	                }
	                v2_1.append(((String) v0_4.getKey()));
	                v2_1.append(61);
	                v2_1.append(((String) v0_4.getValue()));
	            }
	            v0_0 = v2_1.toString();
	        }
	        this.d(new StringBuilder("Discarding hit. ").append(p6).toString(), v0_0);
	        return;
	    }
	
