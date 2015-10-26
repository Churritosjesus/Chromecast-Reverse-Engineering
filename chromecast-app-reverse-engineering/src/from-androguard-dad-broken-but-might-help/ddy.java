	private static final  serialVersionUID
	public final B b
	private  c
	
	    ddy(byte[] p2)
	    {
	        this.c = 0;
	        this.b = p2;
	        return;
	    }
	
	
	    protected final int a(int p6, int p7, int p8)
	    {
	        byte[] v2 = this.b;
	        int v1 = (this.d() + p7);
	        int v0_1 = v1;
	        while (v0_1 < (v1 + p8)) {
	            p6 = ((p6 * 31) + v2[v0_1]);
	            v0_1++;
	        }
	        return p6;
	    }
	
	
	    public ddm a()
	    {
	        return new ddz(this);
	    }
	
	
	    final boolean a(ddy p8, int p9, int p10)
	    {
	        if (p10 <= p8.b()) {
	            if ((p9 + p10) <= p8.b()) {
	                byte[] v2_0 = this.b;
	                byte[] v3_0 = p8.b;
	                int v4 = (this.d() + p10);
	                int v1_1 = this.d();
	                int v0_4 = (p8.d() + p9);
	                while (v1_1 < v4) {
	                    if (v2_0[v1_1] == v3_0[v0_4]) {
	                        v1_1++;
	                        v0_4++;
	                    } else {
	                        int v0_5 = 0;
	                    }
	                    return v0_5;
	                }
	                v0_5 = 1;
	                return v0_5;
	            } else {
	                throw new IllegalArgumentException(new StringBuilder(59).append("Ran off end of other: ").append(p9).append(", ").append(p10).append(", ").append(p8.b()).toString());
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder(40).append("Length too large: ").append(p10).append(this.b()).toString());
	        }
	    }
	
	
	    public int b()
	    {
	        return this.b.length;
	    }
	
	
	    protected void b(byte[] p2, int p3, int p4, int p5)
	    {
	        System.arraycopy(this.b, p3, p2, p4, p5);
	        return;
	    }
	
	
	    protected int d()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p5)
	    {
	        StringBuilder v0_9;
	        if (p5 != this) {
	            if ((p5 instanceof ddl)) {
	                if (this.b() == ((ddl) p5).b()) {
	                    if (this.b() != 0) {
	                        if (!(p5 instanceof ddy)) {
	                            if (!(p5 instanceof deg)) {
	                                int v1_2 = String.valueOf(p5.getClass());
	                                throw new IllegalArgumentException(new StringBuilder((String.valueOf(v1_2).length() + 49)).append("Has a new type of ByteString been created? Found ").append(v1_2).toString());
	                            } else {
	                                v0_9 = p5.equals(this);
	                            }
	                        } else {
	                            if ((this.c == 0) || ((((ddy) p5).c == 0) || (this.c == ((ddy) p5).c))) {
	                                v0_9 = this.a(((ddy) p5), 0, this.b());
	                            } else {
	                                v0_9 = 0;
	                            }
	                        }
	                    } else {
	                        v0_9 = 1;
	                    }
	                } else {
	                    v0_9 = 0;
	                }
	            } else {
	                v0_9 = 0;
	            }
	        } else {
	            v0_9 = 1;
	        }
	        return v0_9;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_0 = this.c;
	        if (v0_0 == 0) {
	            v0_0 = this.a(this.b(), 0, this.b());
	            if (v0_0 == 0) {
	                v0_0 = 1;
	            }
	            this.c = v0_0;
	        }
	        return v0_0;
	    }
	
	
	    public synthetic java.util.Iterator iterator()
	    {
	        return this.a();
	    }
	
