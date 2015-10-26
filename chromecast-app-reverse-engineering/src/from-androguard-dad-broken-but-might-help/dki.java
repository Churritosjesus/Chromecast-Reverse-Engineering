	private  a
	private final dkd b
	private final java.util.zip.Inflater c
	private final dkj d
	private final java.util.zip.CRC32 e
	
	    public dki(dkv p4)
	    {
	        this.a = 0;
	        this.e = new java.util.zip.CRC32();
	        if (p4 != null) {
	            this.c = new java.util.zip.Inflater(1);
	            this.b = dkk.a(p4);
	            this.d = new dkj(this.b, this.c);
	            return;
	        } else {
	            throw new IllegalArgumentException("source == null");
	        }
	    }
	
	
	    private void a(djz p9, long p10, long p12)
	    {
	        dks v0 = p9.a;
	        while (p10 >= ((long) (v0.c - v0.b))) {
	            p10 -= ((long) (v0.c - v0.b));
	            v0 = v0.f;
	        }
	        while (p12 > 0) {
	            int v1_5 = ((int) (((long) v0.b) + p10));
	            long v4_8 = ((int) Math.min(((long) (v0.c - v1_5)), p12));
	            this.e.update(v0.a, v1_5, v4_8);
	            p12 -= ((long) v4_8);
	            v0 = v0.f;
	            p10 = 0;
	        }
	        return;
	    }
	
	
	    private static void a(String p5, int p6, int p7)
	    {
	        if (p7 == p6) {
	            return;
	        } else {
	            Object[] v2_1 = new Object[3];
	            v2_1[0] = p5;
	            v2_1[1] = Integer.valueOf(p7);
	            v2_1[2] = Integer.valueOf(p6);
	            throw new java.io.IOException(String.format("%s: actual 0x%08x != expected 0x%08x", v2_1));
	        }
	    }
	
	
	    public final long a(djz p11, long p12)
	    {
	        if (p12 >= 0) {
	            long v4_7;
	            if (p12 != 0) {
	                if (this.a == 0) {
	                    int v6;
	                    this.b.a(10);
	                    byte v7 = this.b.b().b(3);
	                    if (((v7 >> 1) & 1) != 1) {
	                        v6 = 0;
	                    } else {
	                        v6 = 1;
	                    }
	                    if (v6 != 0) {
	                        this.a(this.b.b(), 0, 10);
	                    }
	                    dki.a("ID1ID2", 8075, this.b.h());
	                    this.b.f(8);
	                    if (((v7 >> 2) & 1) == 1) {
	                        this.b.a(2);
	                        if (v6 != 0) {
	                            this.a(this.b.b(), 0, 2);
	                        }
	                        long v8_0 = this.b.b().j();
	                        this.b.a(((long) v8_0));
	                        if (v6 != 0) {
	                            this.a(this.b.b(), 0, ((long) v8_0));
	                        }
	                        this.b.f(((long) v8_0));
	                    }
	                    if (((v7 >> 3) & 1) == 1) {
	                        long v8_1 = this.b.a(0);
	                        if (v8_1 != -1) {
	                            if (v6 != 0) {
	                                this.a(this.b.b(), 0, (1 + v8_1));
	                            }
	                            this.b.f((1 + v8_1));
	                        } else {
	                            throw new java.io.EOFException();
	                        }
	                    }
	                    if (((v7 >> 4) & 1) == 1) {
	                        long v8_2 = this.b.a(0);
	                        if (v8_2 != -1) {
	                            if (v6 != 0) {
	                                this.a(this.b.b(), 0, (1 + v8_2));
	                            }
	                            this.b.f((1 + v8_2));
	                        } else {
	                            throw new java.io.EOFException();
	                        }
	                    }
	                    if (v6 != 0) {
	                        dki.a("FHCRC", this.b.j(), ((short) ((int) this.e.getValue())));
	                        this.e.reset();
	                    }
	                    this.a = 1;
	                }
	                if (this.a == 1) {
	                    long v2_20 = p11.b;
	                    v4_7 = this.d.a(p11, p12);
	                    if (v4_7 == -1) {
	                        this.a = 2;
	                    } else {
	                        this.a(p11, v2_20, v4_7);
	                        return v4_7;
	                    }
	                }
	                if (this.a == 2) {
	                    dki.a("CRC", this.b.k(), ((int) this.e.getValue()));
	                    dki.a("ISIZE", this.b.k(), this.c.getTotalOut());
	                    this.a = 3;
	                    if (!this.b.e()) {
	                        throw new java.io.IOException("gzip finished without exhausting source");
	                    }
	                }
	                v4_7 = -1;
	            } else {
	                v4_7 = 0;
	            }
	            return v4_7;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("byteCount < 0: ").append(p12).toString());
	        }
	    }
	
	
	    public final dkw a()
	    {
	        return this.b.a();
	    }
	
	
	    public final void close()
	    {
	        this.d.close();
	        return;
	    }
	
