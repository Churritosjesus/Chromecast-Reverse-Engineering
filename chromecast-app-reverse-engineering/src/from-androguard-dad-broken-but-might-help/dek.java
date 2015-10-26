	private static final I a
	private static final Ljava.lang.Object b
	private static final dek c
	private  d
	private I e
	private Ljava.lang.Object f
	private  g
	
	    static dek()
	    {
	        dek v0_0 = new int[0];
	        dek.a = v0_0;
	        dek v0_1 = new Object[0];
	        dek.b = v0_1;
	        dek.c = new dek(0, dek.a, dek.b);
	        return;
	    }
	
	
	    dek(int p2, int[] p3, Object[] p4)
	    {
	        this.g = -1;
	        this.d = p2;
	        this.e = p3;
	        this.f = p4;
	        return;
	    }
	
	
	    public static dek a()
	    {
	        return dek.c;
	    }
	
	
	    static dek a(dek p7, dek p8)
	    {
	        int v0_1 = (p7.d + p8.d);
	        int[] v1_2 = java.util.Arrays.copyOf(p7.e, v0_1);
	        System.arraycopy(p8.e, 0, v1_2, p7.d, p8.d);
	        Object[] v2_2 = java.util.Arrays.copyOf(p7.f, v0_1);
	        System.arraycopy(p8.f, 0, v2_2, p7.d, p8.d);
	        return new dek(v0_1, v1_2, v2_2);
	    }
	
	
	    public static del b()
	    {
	        return new del();
	    }
	
	
	    static synthetic int[] d()
	    {
	        return dek.a;
	    }
	
	
	    static synthetic Object[] e()
	    {
	        return dek.b;
	    }
	
	
	    static synthetic dek f()
	    {
	        return dek.c;
	    }
	
	
	    public final void a(ddo p9)
	    {
	        int v1_0 = 0;
	        while (v1_0 < this.d) {
	            cml v0_2 = this.e[v1_0];
	            int v3_0 = den.b(v0_2);
	            switch (den.a(v0_2)) {
	                case 0:
	                    byte[] v4_9 = ((Long) this.f[v1_0]).longValue();
	                    p9.d(v3_0, 0);
	                    p9.a(v4_9);
	                    break;
	                case 1:
	                    byte[] v4_7 = ((Long) this.f[v1_0]).longValue();
	                    p9.d(v3_0, 1);
	                    p9.a((((int) v4_7) & 255));
	                    p9.a((((int) (v4_7 >> 8)) & 255));
	                    p9.a((((int) (v4_7 >> 16)) & 255));
	                    p9.a((((int) (v4_7 >> 24)) & 255));
	                    p9.a((((int) (v4_7 >> 32)) & 255));
	                    p9.a((((int) (v4_7 >> 40)) & 255));
	                    p9.a((((int) (v4_7 >> 48)) & 255));
	                    p9.a((((int) (v4_7 >> 56)) & 255));
	                    break;
	                case 2:
	                    cml v0_16 = ((ddl) this.f[v1_0]);
	                    p9.d(v3_0, 2);
	                    p9.c(v0_16.b());
	                    int v3_7 = v0_16.b();
	                    if ((p9.b - p9.c) < v3_7) {
	                        int v1_2 = (p9.b - p9.c);
	                        v0_16.a(p9.a, 0, p9.c, v1_2);
	                        p9.c = p9.b;
	                        p9.d = (p9.d + v1_2);
	                        throw new cml();
	                    } else {
	                        v0_16.a(p9.a, 0, p9.c, v3_7);
	                        p9.c = (p9.c + v3_7);
	                        p9.d = (p9.d + v3_7);
	                    }
	                    break;
	                case 3:
	                    p9.d(v3_0, 3);
	                    ((dek) this.f[v1_0]).a(p9);
	                    p9.d(v3_0, 4);
	                    break;
	                case 4:
	                default:
	                    throw ddx.f();
	                    break;
	                case 5:
	                    cml v0_7 = ((Integer) this.f[v1_0]).intValue();
	                    p9.d(v3_0, 5);
	                    p9.a((v0_7 & 255));
	                    p9.a(((v0_7 >> 8) & 255));
	                    p9.a(((v0_7 >> 16) & 255));
	                    p9.a((v0_7 >> 24));
	                    break;
	            }
	            v1_0++;
	        }
	        return;
	    }
	
	
	    public final int c()
	    {
	        int v2 = this.g;
	        if (v2 == -1) {
	            int v1_1 = 0;
	            v2 = 0;
	            while (v1_1 < this.d) {
	                int v0_3 = this.e[v1_1];
	                int v3_0 = den.b(v0_3);
	                switch (den.a(v0_3)) {
	                    case 0:
	                        v2 += ddo.a(v3_0, ((Long) this.f[v1_1]).longValue());
	                        break;
	                    case 1:
	                        v2 += ddo.c(v3_0, ((Long) this.f[v1_1]).longValue());
	                        break;
	                    case 2:
	                        v2 += ddo.a(v3_0, ((ddl) this.f[v1_1]));
	                        break;
	                    case 3:
	                        v2 += (((dek) this.f[v1_1]).c() + (ddo.b(v3_0) << 1));
	                        break;
	                    case 4:
	                    default:
	                        throw new IllegalStateException(ddx.f());
	                        break;
	                    case 5:
	                        v2 += ddo.b(v3_0, ((Integer) this.f[v1_1]).intValue());
	                        break;
	                }
	                v1_1++;
	            }
	            this.g = v2;
	        }
	        return v2;
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (this != p5) {
	            if (p5 != null) {
	                if ((p5 instanceof dek)) {
	                    if ((this.d != ((dek) p5).d) || ((!java.util.Arrays.equals(this.e, ((dek) p5).e)) || (!java.util.Arrays.deepEquals(this.f, ((dek) p5).f)))) {
	                        v0 = 0;
	                    }
	                } else {
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
	        return (((((this.d + 527) * 31) + java.util.Arrays.hashCode(this.e)) * 31) + java.util.Arrays.deepHashCode(this.f));
	    }
	
