	public final  a
	public final java.lang.String b
	final  c
	 java.lang.Integer d
	 adv e
	  f
	public  g
	  h
	public aec i
	public adh j
	public java.lang.Object k
	private final aeh l
	private final adz m
	private  n
	
	    public ads(int p7, String p8, adz p9)
	    {
	        int v0_1;
	        if (!aeh.a) {
	            v0_1 = 0;
	        } else {
	            v0_1 = new aeh();
	        }
	        int v0_9;
	        this.l = v0_1;
	        this.f = 1;
	        this.g = 0;
	        this.h = 0;
	        this.n = 0;
	        this.j = 0;
	        this.a = p7;
	        this.b = p8;
	        this.m = p9;
	        this.i = new aec();
	        if (android.text.TextUtils.isEmpty(p8)) {
	            v0_9 = 0;
	        } else {
	            int v0_7 = android.net.Uri.parse(p8);
	            if (v0_7 == 0) {
	            } else {
	                int v0_8 = v0_7.getHost();
	                if (v0_8 == 0) {
	                } else {
	                    v0_9 = v0_8.hashCode();
	                }
	            }
	        }
	        this.c = v0_9;
	        return;
	    }
	
	
	    protected static aef a(aef p0)
	    {
	        return p0;
	    }
	
	
	    static synthetic aeh a(ads p1)
	    {
	        return p1.l;
	    }
	
	
	    private static byte[] a(java.util.Map p4, String p5)
	    {
	        String v2_1 = new StringBuilder();
	        try {
	            String v3_0 = p4.entrySet().iterator();
	        } catch (byte[] v0_4) {
	            throw new RuntimeException(new StringBuilder("Encoding not supported: ").append(p5).toString(), v0_4);
	        }
	        while (v3_0.hasNext()) {
	            byte[] v0_6 = ((java.util.Map$Entry) v3_0.next());
	            v2_1.append(java.net.URLEncoder.encode(((String) v0_6.getKey()), p5));
	            v2_1.append(61);
	            v2_1.append(java.net.URLEncoder.encode(((String) v0_6.getValue()), p5));
	            v2_1.append(38);
	        }
	        return v2_1.toString().getBytes(p5);
	    }
	
	
	    public java.util.Map a()
	    {
	        return java.util.Collections.emptyMap();
	    }
	
	
	    public final void a(String p5)
	    {
	        if (!aeh.a) {
	            if (this.n == 0) {
	                this.n = android.os.SystemClock.elapsedRealtime();
	            }
	        } else {
	            this.l.a(p5, Thread.currentThread().getId());
	        }
	        return;
	    }
	
	
	    public void b(aef p2)
	    {
	        if (this.m != null) {
	            this.m.a(p2);
	        }
	        return;
	    }
	
	
	    final void b(String p12)
	    {
	        if (this.e != null) {
	            java.util.concurrent.PriorityBlockingQueue v1_0 = this.e;
	            v1_0.b.remove(this);
	            try {
	                Throwable v0_4 = v1_0.d.iterator();
	            } catch (Throwable v0_18) {
	                throw v0_18;
	            }
	            while (v0_4.hasNext()) {
	                v0_4.next();
	            }
	            if (this.f) {
	                String v3_1 = this.b;
	                Throwable v0_8 = ((java.util.Queue) v1_0.a.remove(v3_1));
	                if (v0_8 != null) {
	                    if (aeg.a) {
	                        Object[] v5_1 = new Object[2];
	                        v5_1[0] = Integer.valueOf(v0_8.size());
	                        v5_1[1] = v3_1;
	                        aeg.a("Releasing %d waiting requests for cacheKey=%s.", v5_1);
	                    }
	                    v1_0.c.addAll(v0_8);
	                }
	            }
	        }
	        if (!aeh.a) {
	            Throwable v0_12 = (android.os.SystemClock.elapsedRealtime() - this.n);
	            if (v0_12 >= 3000) {
	                String v3_2 = new Object[2];
	                v3_2[0] = Long.valueOf(v0_12);
	                v3_2[1] = this.toString();
	                aeg.b("%d ms: %s", v3_2);
	            }
	        } else {
	            Throwable v0_16 = Thread.currentThread().getId();
	            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
	                this.l.a(p12, v0_16);
	                this.l.a(this.toString());
	            } else {
	                new android.os.Handler(android.os.Looper.getMainLooper()).post(new adt(this, p12, v0_16));
	            }
	        }
	        return;
	    }
	
	
	    public final byte[] b()
	    {
	        byte[] v0 = 0;
	        if ((0 != 0) && (0.size() > 0)) {
	            v0 = ads.a(0, "UTF-8");
	        }
	        return v0;
	    }
	
	
	    public String c()
	    {
	        return new StringBuilder("application/x-www-form-urlencoded; charset=").append("UTF-8").toString();
	    }
	
	
	    public synthetic int compareTo(Object p3)
	    {
	        int v0_2;
	        int v0_0 = this.e();
	        int v1_0 = ((ads) p3).e();
	        if (v0_0 != v1_0) {
	            v0_2 = (v1_0.ordinal() - v0_0.ordinal());
	        } else {
	            v0_2 = (this.d.intValue() - ((ads) p3).d.intValue());
	        }
	        return v0_2;
	    }
	
	
	    public byte[] d()
	    {
	        return 0;
	    }
	
	
	    public adu e()
	    {
	        return adu.b;
	    }
	
	
	    public final int f()
	    {
	        return this.i.a();
	    }
	
	
	    public String toString()
	    {
	        String v0_4;
	        Integer v1_3 = new StringBuilder("0x").append(Integer.toHexString(this.c)).toString();
	        String v2_1 = new StringBuilder();
	        if (!this.g) {
	            v0_4 = "[ ] ";
	        } else {
	            v0_4 = "[X] ";
	        }
	        return v2_1.append(v0_4).append(this.b).append(" ").append(v1_3).append(" ").append(this.e()).append(" ").append(this.d).toString();
	    }
	
