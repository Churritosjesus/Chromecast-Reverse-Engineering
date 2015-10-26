	private final java.util.LinkedHashMap a
	private  b
	private  c
	private  d
	private  e
	private  f
	private  g
	
	    public eh(int p5)
	    {
	        if (p5 > 0) {
	            this.c = p5;
	            this.a = new java.util.LinkedHashMap(0, 1061158912, 1);
	            return;
	        } else {
	            throw new IllegalArgumentException("maxSize <= 0");
	        }
	    }
	
	
	    private int c(Object p4, Object p5)
	    {
	        IllegalStateException v0_0 = this.b(p4, p5);
	        if (v0_0 >= null) {
	            return v0_0;
	        } else {
	            throw new IllegalStateException(new StringBuilder("Negative size: ").append(p4).append("=").append(p5).toString());
	        }
	    }
	
	
	    public final Object a(Object p3)
	    {
	        if (p3 != null) {
	            try {
	                int v0_1 = this.a.get(p3);
	            } catch (int v0_4) {
	                throw v0_4;
	            }
	            if (v0_1 == 0) {
	                this.g = (this.g + 1);
	                v0_1 = 0;
	            } else {
	                this.f = (this.f + 1);
	            }
	            return v0_1;
	        } else {
	            throw new NullPointerException("key == null");
	        }
	    }
	
	
	    public final Object a(Object p4, Object p5)
	    {
	        if ((p4 != null) && (p5 != null)) {
	            this.d = (this.d + 1);
	            this.b = (this.b + this.c(p4, p5));
	            Throwable v0_5 = this.a.put(p4, p5);
	            if (v0_5 != null) {
	                this.b = (this.b - this.c(p4, v0_5));
	            }
	            this.a(this.c);
	            return v0_5;
	        } else {
	            throw new NullPointerException("key == null || value == null");
	        }
	    }
	
	
	    public final void a()
	    {
	        this.a(-1);
	        return;
	    }
	
	
	    public final void a(int p4)
	    {
	        try {
	            while ((this.b >= 0) && ((!this.a.isEmpty()) || (this.b == 0))) {
	                if ((this.b > p4) && (!this.a.isEmpty())) {
	                    int v0_11 = ((java.util.Map$Entry) this.a.entrySet().iterator().next());
	                    Object v1_0 = v0_11.getKey();
	                    int v0_12 = v0_11.getValue();
	                    this.a.remove(v1_0);
	                    this.b = (this.b - this.c(v1_0, v0_12));
	                    this.e = (this.e + 1);
	                } else {
	                    return;
	                }
	            }
	        } catch (int v0_19) {
	            throw v0_19;
	        }
	        throw new IllegalStateException(new StringBuilder().append(this.getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
	    }
	
	
	    public final declared_synchronized int b()
	    {
	        try {
	            return this.c;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public int b(Object p2, Object p3)
	    {
	        return 1;
	    }
	
	
	    public final declared_synchronized String toString()
	    {
	        String v0_0 = 0;
	        try {
	            String v1_1 = (this.f + this.g);
	        } catch (String v0_3) {
	            throw v0_3;
	        }
	        if (v1_1 != null) {
	            v0_0 = ((this.f * 100) / v1_1);
	        }
	        Object[] v2_2 = new Object[4];
	        v2_2[0] = Integer.valueOf(this.c);
	        v2_2[1] = Integer.valueOf(this.f);
	        v2_2[2] = Integer.valueOf(this.g);
	        v2_2[3] = Integer.valueOf(v0_0);
	        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", v2_2);
	    }
	
