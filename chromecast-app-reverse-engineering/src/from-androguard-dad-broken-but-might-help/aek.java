	private static java.util.Comparator e
	private java.util.List a
	private java.util.List b
	private  c
	private final  d
	
	    static aek()
	    {
	        aek.e = new ael();
	        return;
	    }
	
	
	    public aek(int p3)
	    {
	        this.a = new java.util.LinkedList();
	        this.b = new java.util.ArrayList(64);
	        this.c = 0;
	        this.d = p3;
	        return;
	    }
	
	
	    private declared_synchronized void a()
	    {
	        try {
	            while (this.c > this.d) {
	                int v0_4 = ((byte[]) this.a.remove(0));
	                this.b.remove(v0_4);
	                this.c = (this.c - v0_4.length);
	            }
	        } catch (int v0_1) {
	            throw v0_1;
	        }
	        return;
	    }
	
	
	    public final declared_synchronized void a(byte[] p3)
	    {
	        try {
	            if ((p3 != null) && (p3.length <= this.d)) {
	                this.a.add(p3);
	                int v0_3 = java.util.Collections.binarySearch(this.b, p3, aek.e);
	                if (v0_3 < 0) {
	                    v0_3 = ((- v0_3) - 1);
	                }
	                this.b.add(v0_3, p3);
	                this.c = (this.c + p3.length);
	                this.a();
	            }
	        } catch (int v0_5) {
	            throw v0_5;
	        }
	        return;
	    }
	
	
	    public final declared_synchronized byte[] a(int p5)
	    {
	        int v1_0 = 0;
	        try {
	            while (v1_0 < this.b.size()) {
	                int v0_3 = ((byte[]) this.b.get(v1_0));
	                if (v0_3.length < p5) {
	                    v1_0++;
	                } else {
	                    this.c = (this.c - v0_3.length);
	                    this.b.remove(v1_0);
	                    this.a.remove(v0_3);
	                }
	                return v0_3;
	            }
	        } catch (int v0_7) {
	            throw v0_7;
	        }
	        v0_3 = new byte[p5];
	        return v0_3;
	    }
	
