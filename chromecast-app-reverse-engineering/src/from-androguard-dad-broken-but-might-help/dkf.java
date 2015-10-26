	private final dkc a
	private final java.util.zip.Deflater b
	private  c
	
	    private dkf(dkc p3, java.util.zip.Deflater p4)
	    {
	        if (p3 != null) {
	            if (p4 != null) {
	                this.a = p3;
	                this.b = p4;
	                return;
	            } else {
	                throw new IllegalArgumentException("inflater == null");
	            }
	        } else {
	            throw new IllegalArgumentException("source == null");
	        }
	    }
	
	
	    public dkf(dku p2, java.util.zip.Deflater p3)
	    {
	        this(dkk.a(p2), p3);
	        return;
	    }
	
	
	    private void a(boolean p8)
	    {
	        djz v1 = this.a.b();
	        do {
	            dks v0_3;
	            long v2_0 = v1.e(1);
	            if (!p8) {
	                v0_3 = this.b.deflate(v2_0.a, v2_0.c, (2048 - v2_0.c));
	            } else {
	                v0_3 = this.b.deflate(v2_0.a, v2_0.c, (2048 - v2_0.c), 2);
	            }
	            if (v0_3 <= null) {
	            } else {
	                v2_0.c = (v2_0.c + v0_3);
	                v1.b = (v1.b + ((long) v0_3));
	                this.a.r();
	            }
	        } while(!this.b.needsInput());
	        if (v2_0.b == v2_0.c) {
	            v1.a = v2_0.a();
	            dkt.a(v2_0);
	        }
	        return;
	    }
	
	
	    public final dkw a()
	    {
	        return this.a.a();
	    }
	
	
	    public final void a_(djz p9, long p10)
	    {
	        dky.a(p9.b, 0, p10);
	        while (p10 > 0) {
	            long v0_2 = p9.a;
	            int v1_2 = ((int) Math.min(p10, ((long) (v0_2.c - v0_2.b))));
	            this.b.setInput(v0_2.a, v0_2.b, v1_2);
	            this.a(0);
	            p9.b = (p9.b - ((long) v1_2));
	            v0_2.b = (v0_2.b + v1_2);
	            if (v0_2.b == v0_2.c) {
	                p9.a = v0_2.a();
	                dkt.a(v0_2);
	            }
	            p10 -= ((long) v1_2);
	        }
	        return;
	    }
	
	
	    public final void close()
	    {
	        if (!this.c) {
	            int v1_0 = 0;
	            try {
	                this.b.finish();
	                this.a(0);
	            } catch (int v0_3) {
	                v1_0 = v0_3;
	            }
	            try {
	                this.b.end();
	                int v0_5 = v1_0;
	            } catch (int v0_5) {
	                if (v1_0 == 0) {
	                } else {
	                    v0_5 = v1_0;
	                }
	            }
	            try {
	                this.a.close();
	            } catch (int v1_2) {
	                if (v0_5 != 0) {
	                } else {
	                    v0_5 = v1_2;
	                }
	            }
	            this.c = 1;
	            if (v0_5 != 0) {
	                dky.a(v0_5);
	            }
	        }
	        return;
	    }
	
	
	    public final void flush()
	    {
	        this.a(1);
	        this.a.flush();
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("DeflaterSink(").append(this.a).append(")").toString();
	    }
	
