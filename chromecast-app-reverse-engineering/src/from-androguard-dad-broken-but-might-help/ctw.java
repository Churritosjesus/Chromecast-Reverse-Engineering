	private static java.lang.Object a
	private static Ljava.lang.String b
	private static final java.util.regex.Pattern c
	private final java.util.concurrent.ConcurrentHashMap d
	private final java.util.Map e
	private final java.util.concurrent.locks.ReentrantLock f
	private final java.util.LinkedList g
	private final cub h
	private final java.util.concurrent.CountDownLatch i
	
	    static ctw()
	    {
	        ctw.a = new Object();
	        ctw.b = "gtm.lifetime".toString().split("\\.");
	        ctw.c = java.util.regex.Pattern.compile("(\\d+)\\s*([smhd]?)");
	        return;
	    }
	
	
	    ctw()
	    {
	        this(new ctx());
	        return;
	    }
	
	
	    ctw(cub p3)
	    {
	        this.h = p3;
	        this.d = new java.util.concurrent.ConcurrentHashMap();
	        this.e = new java.util.HashMap();
	        this.f = new java.util.concurrent.locks.ReentrantLock();
	        this.g = new java.util.LinkedList();
	        this.i = new java.util.concurrent.CountDownLatch(1);
	        this.h.a(new cty(this));
	        return;
	    }
	
	
	    public static varargs java.util.Map a(Object[] p4)
	    {
	        if ((p4.length % 2) == 0) {
	            StringBuilder v2_1 = new java.util.HashMap();
	            int v1_0 = 0;
	            while (v1_0 < p4.length) {
	                if ((p4[v1_0] instanceof String)) {
	                    v2_1.put(((String) p4[v1_0]), p4[(v1_0 + 1)]);
	                    v1_0 += 2;
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder("key is not a string: ").append(p4[v1_0]).toString());
	                }
	            }
	            return v2_1;
	        } else {
	            throw new IllegalArgumentException("expected even number of key-value pairs");
	        }
	    }
	
	
	    static synthetic java.util.concurrent.CountDownLatch a(ctw p1)
	    {
	        return p1.i;
	    }
	
	
	    static synthetic void a(ctw p0, java.util.Map p1)
	    {
	        p0.b(p1);
	        return;
	    }
	
	
	    private void a(java.util.List p4, java.util.List p5)
	    {
	        while (p5.size() < p4.size()) {
	            p5.add(0);
	        }
	        int v2 = 0;
	        while (v2 < p4.size()) {
	            java.util.Map v0_3 = p4.get(v2);
	            if (!(v0_3 instanceof java.util.List)) {
	                if (!(v0_3 instanceof java.util.Map)) {
	                    if (v0_3 != ctw.a) {
	                        p5.set(v2, v0_3);
	                    }
	                } else {
	                    if (!(p5.get(v2) instanceof java.util.Map)) {
	                        p5.set(v2, new java.util.HashMap());
	                    }
	                    this.a(((java.util.Map) v0_3), ((java.util.Map) p5.get(v2)));
	                }
	            } else {
	                if (!(p5.get(v2) instanceof java.util.List)) {
	                    p5.set(v2, new java.util.ArrayList());
	                }
	                this.a(((java.util.List) v0_3), ((java.util.List) p5.get(v2)));
	            }
	            v2++;
	        }
	        return;
	    }
	
	
	    private void a(java.util.Map p5, String p6, java.util.Collection p7)
	    {
	        java.util.Iterator v2 = p5.entrySet().iterator();
	        while (v2.hasNext()) {
	            String v1_3;
	            Object v0_3 = ((java.util.Map$Entry) v2.next());
	            ctz v3_0 = new StringBuilder().append(p6);
	            if (p6.length() != 0) {
	                v1_3 = ".";
	            } else {
	                v1_3 = "";
	            }
	            String v1_7 = v3_0.append(v1_3).append(((String) v0_3.getKey())).toString();
	            if (!(v0_3.getValue() instanceof java.util.Map)) {
	                if (!v1_7.equals("gtm.lifetime")) {
	                    p7.add(new ctz(v1_7, v0_3.getValue()));
	                }
	            } else {
	                this.a(((java.util.Map) v0_3.getValue()), v1_7, p7);
	            }
	        }
	        return;
	    }
	
	
	    private void a(java.util.Map p5, java.util.Map p6)
	    {
	        java.util.Iterator v2 = p5.keySet().iterator();
	        while (v2.hasNext()) {
	            java.util.Map v0_3 = ((String) v2.next());
	            java.util.Map v1_0 = p5.get(v0_3);
	            if (!(v1_0 instanceof java.util.List)) {
	                if (!(v1_0 instanceof java.util.Map)) {
	                    p6.put(v0_3, v1_0);
	                } else {
	                    if (!(p6.get(v0_3) instanceof java.util.Map)) {
	                        p6.put(v0_3, new java.util.HashMap());
	                    }
	                    this.a(((java.util.Map) v1_0), ((java.util.Map) p6.get(v0_3)));
	                }
	            } else {
	                if (!(p6.get(v0_3) instanceof java.util.List)) {
	                    p6.put(v0_3, new java.util.ArrayList());
	                }
	                this.a(((java.util.List) v1_0), ((java.util.List) p6.get(v0_3)));
	            }
	        }
	        return;
	    }
	
	
	    public static java.util.Map b(String p6, Object p7)
	    {
	        java.util.HashMap v2_1 = new java.util.HashMap();
	        String[] v4 = p6.toString().split("\\.");
	        String v0_1 = 0;
	        java.util.HashMap v1_1 = v2_1;
	        while (v0_1 < (v4.length - 1)) {
	            java.util.HashMap v3_3 = new java.util.HashMap();
	            v1_1.put(v4[v0_1], v3_3);
	            v0_1++;
	            v1_1 = v3_3;
	        }
	        v1_1.put(v4[(v4.length - 1)], p7);
	        return v2_1;
	    }
	
	
	    private void b(java.util.Map p7)
	    {
	        this.f.lock();
	        try {
	            this.g.offer(p7);
	        } catch (java.util.concurrent.locks.ReentrantLock v0_16) {
	            this.f.unlock();
	            throw v0_16;
	        }
	        if (this.f.getHoldCount() == 1) {
	            java.util.ArrayList v1_1 = 0;
	            while(true) {
	                java.util.concurrent.locks.ReentrantLock v0_7 = ((java.util.Map) this.g.poll());
	                if (v0_7 != null) {
	                    this.d(v0_7);
	                    java.util.concurrent.locks.ReentrantLock v0_12 = (v1_1 + 1);
	                    if (v0_12 > 500) {
	                        break;
	                    }
	                    v1_1 = v0_12;
	                }
	            }
	            this.g.clear();
	            throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
	        }
	        java.util.concurrent.locks.ReentrantLock v0_10;
	        java.util.concurrent.locks.ReentrantLock v0_8 = ctw.c(p7);
	        if (v0_8 != null) {
	            v0_10 = ctw.c(v0_8.toString());
	        } else {
	            v0_10 = 0;
	        }
	        if (v0_10 != null) {
	            java.util.ArrayList v1_3 = new java.util.ArrayList();
	            this.a(p7, "", v1_3);
	            v1_3.remove("gtm.lifetime");
	            this.h.a(v1_3, v0_10.longValue());
	        }
	        this.f.unlock();
	        return;
	    }
	
	
	    private static Long c(String p10)
	    {
	        Long v0_0 = 0;
	        String v1_1 = ctw.c.matcher(p10);
	        if (v1_1.matches()) {
	            try {
	                long v2_3 = Long.parseLong(v1_1.group(1));
	            } catch (long v2) {
	                cuh.b(new StringBuilder("illegal number in _lifetime value: ").append(p10).toString());
	                v2_3 = 0;
	            }
	            if (v2_3 > 0) {
	                String v1_2 = v1_1.group(2);
	                if (v1_2.length() != 0) {
	                    switch (v1_2.charAt(0)) {
	                        case 100:
	                            v0_0 = Long.valueOf(((((v2_3 * 1000) * 60) * 60) * 24));
	                            break;
	                        case 104:
	                            v0_0 = Long.valueOf((((v2_3 * 1000) * 60) * 60));
	                            break;
	                        case 109:
	                            v0_0 = Long.valueOf(((v2_3 * 1000) * 60));
	                            break;
	                        case 115:
	                            v0_0 = Long.valueOf((v2_3 * 1000));
	                            break;
	                        default:
	                            cuh.b(new StringBuilder("unknown units in _lifetime: ").append(p10).toString());
	                    }
	                } else {
	                    v0_0 = Long.valueOf(v2_3);
	                }
	            } else {
	                cuh.c(new StringBuilder("non-positive _lifetime: ").append(p10).toString());
	            }
	        } else {
	            cuh.c(new StringBuilder("unknown _lifetime: ").append(p10).toString());
	        }
	        return v0_0;
	    }
	
	
	    private static Object c(java.util.Map p6)
	    {
	        String[] v2 = ctw.b;
	        int v3 = v2.length;
	        int v1 = 0;
	        Object v0_1 = p6;
	        while (v1 < v3) {
	            if ((v0_1 instanceof java.util.Map)) {
	                Object v6_1 = ((java.util.Map) v0_1).get(v2[v1]);
	                v1++;
	                v0_1 = v6_1;
	            } else {
	                v0_1 = 0;
	                break;
	            }
	        }
	        return v0_1;
	    }
	
	
	    private void d(java.util.Map p5)
	    {
	        try {
	            java.util.Iterator v2 = p5.keySet().iterator();
	        } catch (cua v0_10) {
	            throw v0_10;
	        }
	        while (v2.hasNext()) {
	            cua v0_8 = ((String) v2.next());
	            this.a(ctw.b(v0_8, p5.get(v0_8)), this.e);
	        }
	        java.util.Iterator v1 = this.d.keySet().iterator();
	        while (v1.hasNext()) {
	            ((cua) v1.next()).a(p5);
	        }
	        return;
	    }
	
	
	    final void a(cua p3)
	    {
	        this.d.put(p3, Integer.valueOf(0));
	        return;
	    }
	
	
	    public final void a(String p2)
	    {
	        this.a(p2, 0);
	        this.h.a(p2);
	        return;
	    }
	
	
	    public final void a(String p2, Object p3)
	    {
	        this.a(ctw.b(p2, p3));
	        return;
	    }
	
	
	    public final void a(java.util.Map p2)
	    {
	        try {
	            this.i.await();
	        } catch (String v0) {
	            cuh.b("DataLayer.push: unexpected InterruptedException");
	        }
	        this.b(p2);
	        return;
	    }
	
	
	    public final Object b(String p10)
	    {
	        try {
	            int v2_0 = this.e;
	            String[] v5 = p10.split("\\.");
	            int v6 = v5.length;
	            Object v0_2 = v2_0;
	            int v2_1 = 0;
	        } catch (Object v0_5) {
	            throw v0_5;
	        }
	        while (v2_1 < v6) {
	            if ((v0_2 instanceof java.util.Map)) {
	                Object v3_1 = ((java.util.Map) v0_2).get(v5[v2_1]);
	                if (v3_1 != null) {
	                    v2_1++;
	                    v0_2 = v3_1;
	                } else {
	                    v0_2 = 0;
	                }
	            } else {
	                v0_2 = 0;
	            }
	            return v0_2;
	        }
	        return v0_2;
	    }
	
	
	    public final String toString()
	    {
	        try {
	            StringBuilder v2_1 = new StringBuilder();
	            java.util.Iterator v3 = this.e.entrySet().iterator();
	        } catch (String v0_8) {
	            throw v0_8;
	        }
	        while (v3.hasNext()) {
	            String v0_5 = ((java.util.Map$Entry) v3.next());
	            Object[] v5_1 = new Object[2];
	            v5_1[0] = v0_5.getKey();
	            v5_1[1] = v0_5.getValue();
	            v2_1.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", v5_1));
	        }
	        return v2_1.toString();
	    }
	
