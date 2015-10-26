	public static final  a
	private final java.util.List b
	private  c
	
	    static aeh()
	    {
	        aeh.a = aeg.a;
	        return;
	    }
	
	
	    aeh()
	    {
	        this.b = new java.util.ArrayList();
	        this.c = 0;
	        return;
	    }
	
	
	    public final declared_synchronized void a(String p11)
	    {
	        try {
	            long v2_1;
	            this.c = 1;
	        } catch (String v0_17) {
	            throw v0_17;
	        }
	        if (this.b.size() != 0) {
	            v2_1 = (((aei) this.b.get((this.b.size() - 1))).c - ((aei) this.b.get(0)).c);
	        } else {
	            v2_1 = 0;
	        }
	        if (v2_1 > 0) {
	            String v0_15 = ((aei) this.b.get(0)).c;
	            Object[] v5_1 = new Object[2];
	            v5_1[0] = Long.valueOf(v2_1);
	            v5_1[1] = p11;
	            aeg.b("(%-4d ms) %s", v5_1);
	            java.util.Iterator v6_1 = this.b.iterator();
	            long v2_5 = v0_15;
	            while (v6_1.hasNext()) {
	                String v0_19 = ((aei) v6_1.next());
	                long v4_2 = v0_19.c;
	                Object[] v7_1 = new Object[3];
	                v7_1[0] = Long.valueOf((v4_2 - v2_5));
	                v7_1[1] = Long.valueOf(v0_19.b);
	                v7_1[2] = v0_19.a;
	                aeg.b("(+%-4d) [%2d] %s", v7_1);
	                v2_5 = v4_2;
	            }
	        }
	        return;
	    }
	
	
	    public final declared_synchronized void a(String p9, long p10)
	    {
	        try {
	            if (!this.c) {
	                this.b.add(new aei(p9, p10, android.os.SystemClock.elapsedRealtime()));
	                return;
	            } else {
	                throw new IllegalStateException("Marker added to finished log");
	            }
	        } catch (aei v0_5) {
	            throw v0_5;
	        }
	    }
	
	
	    protected final void finalize()
	    {
	        if (!this.c) {
	            this.a("Request on the loose");
	            Object[] v1_1 = new Object[0];
	            aeg.c("Marker log finalized without finish() - uncaught exit point for request", v1_1);
	        }
	        return;
	    }
	
