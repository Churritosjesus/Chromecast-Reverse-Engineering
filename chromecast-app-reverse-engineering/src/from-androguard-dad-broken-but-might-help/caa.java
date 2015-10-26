	private final  a
	private final  b
	private final ep c
	
	    public caa()
	    {
	        this.a = 60000;
	        this.b = 10;
	        this.c = new ep(10);
	        return;
	    }
	
	
	    public caa(int p3, long p4)
	    {
	        this.a = p4;
	        this.b = 1024;
	        this.c = new ep();
	        return;
	    }
	
	
	    public final Long a(Long p9)
	    {
	        long v4 = android.os.SystemClock.elapsedRealtime();
	        long v2_0 = this.a;
	        try {
	            while (this.c.size() >= this.b) {
	                int v1_2 = (this.c.size() - 1);
	                while (v1_2 >= 0) {
	                    if ((v4 - ((Long) this.c.c(v1_2)).longValue()) > v2_0) {
	                        this.c.d(v1_2);
	                    }
	                    v1_2--;
	                }
	                int v0_10 = (v2_0 / 2);
	                android.util.Log.w("PassiveTimedConnectionMap", new StringBuilder("The max capacity ").append(this.b).append(" is not enough. Current durationThreshold is: ").append(v0_10).toString());
	                v2_0 = v0_10;
	            }
	        } catch (int v0_17) {
	            throw v0_17;
	        }
	        return ((Long) this.c.put(p9, Long.valueOf(v4)));
	    }
	
	
	    public final boolean a(long p4)
	    {
	        try {
	            int v0_2;
	            if (this.c.remove(Long.valueOf(p4)) == null) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	        } catch (int v0_3) {
	            throw v0_3;
	        }
	        return v0_2;
	    }
	
