	final java.util.Map a
	final java.util.Set b
	final java.util.concurrent.PriorityBlockingQueue c
	 java.util.List d
	private java.util.concurrent.atomic.AtomicInteger e
	private final java.util.concurrent.PriorityBlockingQueue f
	private final adg g
	private final adm h
	private final aeb i
	private Ladn j
	private adi k
	
	    public adv(adg p2, adm p3)
	    {
	        this(p2, p3, 4);
	        return;
	    }
	
	
	    private adv(adg p5, adm p6, int p7)
	    {
	        this(p5, p6, 4, new aeb(new android.os.Handler(android.os.Looper.getMainLooper())));
	        return;
	    }
	
	
	    private adv(adg p2, adm p3, int p4, aeb p5)
	    {
	        this.e = new java.util.concurrent.atomic.AtomicInteger();
	        this.a = new java.util.HashMap();
	        this.b = new java.util.HashSet();
	        this.c = new java.util.concurrent.PriorityBlockingQueue();
	        this.f = new java.util.concurrent.PriorityBlockingQueue();
	        this.d = new java.util.ArrayList();
	        this.g = p2;
	        this.h = p3;
	        adn[] v0_12 = new adn[p4];
	        this.j = v0_12;
	        this.i = p5;
	        return;
	    }
	
	
	    public final ads a(ads p6)
	    {
	        p6.e = this;
	        this.b.add(p6);
	        p6.d = Integer.valueOf(this.e.incrementAndGet());
	        p6.a("add-to-queue");
	        if (p6.f) {
	            try {
	                String v2 = p6.b;
	            } catch (String v0_17) {
	                throw v0_17;
	            }
	            if (!this.a.containsKey(v2)) {
	                this.a.put(v2, 0);
	                this.c.add(p6);
	            } else {
	                String v0_13 = ((java.util.Queue) this.a.get(v2));
	                if (v0_13 == null) {
	                    v0_13 = new java.util.LinkedList();
	                }
	                v0_13.add(p6);
	                this.a.put(v2, v0_13);
	                if (aeg.a) {
	                    Object[] v3_3 = new Object[1];
	                    v3_3[0] = v2;
	                    aeg.a("Request for cacheKey=%s is in flight, putting on hold.", v3_3);
	                }
	            }
	        } else {
	            this.f.add(p6);
	        }
	        return p6;
	    }
	
	
	    public final void a()
	    {
	        int v1 = 0;
	        if (this.k != null) {
	            adn v0_1 = this.k;
	            v0_1.a = 1;
	            v0_1.interrupt();
	        }
	        adn v0_2 = 0;
	        while (v0_2 < this.j.length) {
	            if (this.j[v0_2] != null) {
	                adn[] v2_8 = this.j[v0_2];
	                v2_8.a = 1;
	                v2_8.interrupt();
	            }
	            v0_2++;
	        }
	        this.k = new adi(this.c, this.f, this.g, this.i);
	        this.k.start();
	        while (v1 < this.j.length) {
	            adn v0_9 = new adn(this.f, this.h, this.g, this.i);
	            this.j[v1] = v0_9;
	            v0_9.start();
	            v1++;
	        }
	        return;
	    }
	
	
	    public final void a(adx p5)
	    {
	        try {
	            java.util.Iterator v2 = this.b.iterator();
	        } catch (ads v0_4) {
	            throw v0_4;
	        }
	        while (v2.hasNext()) {
	            ads v0_3 = ((ads) v2.next());
	            if (p5.a(v0_3)) {
	                v0_3.g = 1;
	            }
	        }
	        return;
	    }
	
