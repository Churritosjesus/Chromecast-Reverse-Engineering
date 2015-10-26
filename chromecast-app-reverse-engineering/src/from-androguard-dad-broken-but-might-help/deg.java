	private static final I b
	private static final  serialVersionUID
	private  c
	
	    static deg()
	    {
	        int v0_0 = 1;
	        java.util.ArrayList v2_1 = new java.util.ArrayList();
	        int v1_0 = 1;
	        while (v0_0 > 0) {
	            v2_1.add(Integer.valueOf(v0_0));
	            int v4 = (v1_0 + v0_0);
	            v1_0 = v0_0;
	            v0_0 = v4;
	        }
	        v2_1.add(Integer.valueOf(2147483647));
	        int v0_4 = new int[v2_1.size()];
	        deg.b = v0_4;
	        int v1_1 = 0;
	        while (v1_1 < deg.b.length) {
	            deg.b[v1_1] = ((Integer) v2_1.get(v1_1)).intValue();
	            v1_1++;
	        }
	        return;
	    }
	
	
	    static synthetic ddl a(deg p1)
	    {
	        return 0;
	    }
	
	
	    static synthetic ddl b(deg p1)
	    {
	        return 0;
	    }
	
	
	    private void readObject(java.io.ObjectInputStream p3)
	    {
	        throw new java.io.InvalidObjectException("RopeByteStream instances are not to be serialized directly");
	    }
	
	
	    protected final int a(int p5, int p6, int p7)
	    {
	        int v0_3;
	        if ((p6 + p7) > 0) {
	            if (p6 < 0) {
	                int v0_1 = (0 - p6);
	                v0_3 = 0.a(0.a(p5, p6, v0_1), 0, (p7 - v0_1));
	            } else {
	                v0_3 = 0.a(p5, p6, p7);
	            }
	        } else {
	            v0_3 = 0.a(p5, p6, p7);
	        }
	        return v0_3;
	    }
	
	
	    public final ddm a()
	    {
	        return new dei(this);
	    }
	
	
	    public final int b()
	    {
	        return 0;
	    }
	
	
	    protected final void b(byte[] p5, int p6, int p7, int p8)
	    {
	        if ((p6 + p8) > 0) {
	            if (p6 < 0) {
	                int v0_1 = (0 - p6);
	                0.b(p5, p6, p7, v0_1);
	                0.b(p5, 0, (p7 + v0_1), (p8 - v0_1));
	            } else {
	                0.b(p5, p6, p7, p8);
	            }
	        } else {
	            0.b(p5, p6, p7, p8);
	        }
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        int v0 = 1;
	        if (p4 != this) {
	            if ((p4 instanceof ddl)) {
	                if (((ddl) p4).b() != 0) {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0 = this.c;
	        if (v0 == 0) {
	            v0 = this.a(0, 0, 0);
	            if (v0 == 0) {
	                v0 = 1;
	            }
	            this.c = v0;
	        }
	        return v0;
	    }
	
	
	    public final synthetic java.util.Iterator iterator()
	    {
	        return this.a();
	    }
	
	
	    final Object writeReplace()
	    {
	        return new ddy(this.c());
	    }
	
