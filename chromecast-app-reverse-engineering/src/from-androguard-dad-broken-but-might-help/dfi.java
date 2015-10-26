	private static final dfi a
	private final  b
	private final  c
	private final java.util.LinkedList d
	private java.util.concurrent.Executor e
	private final java.lang.Runnable f
	
	    static dfi()
	    {
	        long v0_3;
	        dfi v2_0 = System.getProperty("http.keepAlive");
	        long v0_2 = System.getProperty("http.keepAliveDuration");
	        int v3_0 = System.getProperty("http.maxConnections");
	        if (v0_2 == 0) {
	            v0_3 = 300000;
	        } else {
	            v0_3 = Long.parseLong(v0_2);
	        }
	        if ((v2_0 == null) || (Boolean.parseBoolean(v2_0))) {
	            if (v3_0 == 0) {
	                dfi.a = new dfi(5, v0_3);
	            } else {
	                dfi.a = new dfi(Integer.parseInt(v3_0), v0_3);
	            }
	        } else {
	            dfi.a = new dfi(0, v0_3);
	        }
	        return;
	    }
	
	
	    private dfi(int p13, long p14)
	    {
	        this.d = new java.util.LinkedList();
	        this.e = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), dgs.a("OkHttp ConnectionPool", 1));
	        this.f = new dfj(this);
	        this.b = p13;
	        this.c = ((p14 * 1000) * 1000);
	        return;
	    }
	
	
	    public static dfi a()
	    {
	        return dfi.a;
	    }
	
	
	    static synthetic void a(dfi p1)
	    {
	        while (p1.b()) {
	        }
	        return;
	    }
	
	
	    private boolean b()
	    {
	        try {
	            int v2_10;
	            if (!this.d.isEmpty()) {
	                java.util.ArrayList v7_1 = new java.util.ArrayList();
	                int v3_0 = 0;
	                long v8_0 = System.nanoTime();
	                int v4_0 = this.c;
	                java.util.ListIterator v10 = this.d.listIterator(this.d.size());
	                while (v10.hasPrevious()) {
	                    int v2_20 = ((dfh) v10.previous());
	                    long v12_2 = ((v2_20.d() + this.c) - v8_0);
	                    if ((v12_2 > 0) && (v2_20.b())) {
	                        int v2_22;
	                        int v4_4;
	                        if (!v2_20.c()) {
	                            v4_4 = v3_0;
	                            v2_22 = v4_0;
	                        } else {
	                            int v6_7 = (v3_0 + 1);
	                            v2_22 = Math.min(v4_0, v12_2);
	                            v4_4 = v6_7;
	                        }
	                        v3_0 = v4_4;
	                        v4_0 = v2_22;
	                    } else {
	                        v10.remove();
	                        v7_1.add(v2_20);
	                    }
	                }
	                int v6_4 = this.d.listIterator(this.d.size());
	                while ((v6_4.hasPrevious()) && (v3_0 > this.b)) {
	                    int v2_18;
	                    int v2_17 = ((dfh) v6_4.previous());
	                    if (!v2_17.c()) {
	                        v2_18 = v3_0;
	                    } else {
	                        v7_1.add(v2_17);
	                        v6_4.remove();
	                        v2_18 = (v3_0 - 1);
	                    }
	                    v3_0 = v2_18;
	                }
	                if (v7_1.isEmpty()) {
	                    int v2_9 = (v4_0 / 1000000);
	                    this.wait(v2_9, ((int) (v4_0 - (1000000 * v2_9))));
	                    v2_10 = 1;
	                }
	                int v4_3 = v7_1.size();
	                int v3_1 = 0;
	                while (v3_1 < v4_3) {
	                    dgs.a(((dfh) v7_1.get(v3_1)).c);
	                    v3_1++;
	                }
	                v2_10 = 1;
	            } else {
	                v2_10 = 0;
	            }
	        } catch (int v2_23) {
	            throw v2_23;
	        }
	        return v2_10;
	    }
	
	
	    public final declared_synchronized dfh a(dez p9)
	    {
	        try {
	            java.util.ListIterator v3 = this.d.listIterator(this.d.size());
	        } catch (String v0_9) {
	            throw v0_9;
	        }
	        while (v3.hasPrevious()) {
	            String v0_2 = ((dfh) v3.previous());
	            if ((v0_2.b.a.equals(p9)) && ((v0_2.b()) && ((System.nanoTime() - v0_2.d()) < this.c))) {
	                v3.remove();
	                if (!v0_2.e()) {
	                    try {
	                        dgn.a().a(v0_2.c);
	                    } catch (java.net.SocketException v1_9) {
	                        dgs.a(v0_2.c);
	                        dgn.a();
	                        dgn.a(new StringBuilder("Unable to tagSocket(): ").append(v1_9).toString());
	                    }
	                }
	            }
	            if ((v0_2 != null) && (v0_2.e())) {
	                this.d.addFirst(v0_2);
	            }
	            return v0_2;
	        }
	        v0_2 = 0;
	    }
	
	
	    void a(dfh p3)
	    {
	        java.util.concurrent.Executor v0_1 = this.d.isEmpty();
	        this.d.addFirst(p3);
	        if (v0_1 == null) {
	            this.notifyAll();
	        } else {
	            this.e.execute(this.f);
	        }
	        return;
	    }
	
