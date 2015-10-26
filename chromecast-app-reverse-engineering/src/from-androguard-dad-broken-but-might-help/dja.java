	private final dkc a
	private final djz b
	private final dkc c
	private final  d
	private  e
	
	    dja(dkc p4, boolean p5)
	    {
	        this.a = p4;
	        this.d = p5;
	        dkc v0_1 = new java.util.zip.Deflater();
	        v0_1.setDictionary(diy.a);
	        this.b = new djz();
	        this.c = dkk.a(new dkf(this.b, v0_1));
	        return;
	    }
	
	
	    private void a(java.util.List p6)
	    {
	        if (this.b.b == 0) {
	            this.c.f(p6.size());
	            int v2_1 = p6.size();
	            int v1_1 = 0;
	            while (v1_1 < v2_1) {
	                dkc v0_8 = ((die) p6.get(v1_1)).h;
	                this.c.f(v0_8.b.length);
	                this.c.b(v0_8);
	                dkc v0_11 = ((die) p6.get(v1_1)).i;
	                this.c.f(v0_11.b.length);
	                this.c.b(v0_11);
	                v1_1++;
	            }
	            this.c.flush();
	            return;
	        } else {
	            throw new IllegalStateException();
	        }
	    }
	
	
	    public final declared_synchronized void a()
	    {
	        return;
	    }
	
	
	    public final declared_synchronized void a(int p5, long p6)
	    {
	        try {
	            if (!this.e) {
	                if ((p6 != 0) && (p6 <= 2147483647)) {
	                    this.a.f(-2147287031);
	                    this.a.f(8);
	                    this.a.f(p5);
	                    this.a.f(((int) p6));
	                    this.a.flush();
	                    return;
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder("windowSizeIncrement must be between 1 and 0x7fffffff: ").append(p6).toString());
	                }
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_14) {
	            throw v0_14;
	        }
	    }
	
	
	    public final declared_synchronized void a(int p3, dia p4)
	    {
	        try {
	            if (!this.e) {
	                if (p4.j != -1) {
	                    this.a.f(-2147287037);
	                    this.a.f(8);
	                    this.a.f((2147483647 & p3));
	                    this.a.f(p4.j);
	                    this.a.flush();
	                    return;
	                } else {
	                    throw new IllegalArgumentException();
	                }
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_11) {
	            throw v0_11;
	        }
	    }
	
	
	    public final declared_synchronized void a(int p3, dia p4, byte[] p5)
	    {
	        try {
	            if (!this.e) {
	                if (p4.k != -1) {
	                    this.a.f(-2147287033);
	                    this.a.f(8);
	                    this.a.f(p3);
	                    this.a.f(p4.k);
	                    this.a.flush();
	                    return;
	                } else {
	                    throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
	                }
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_11) {
	            throw v0_11;
	        }
	    }
	
	
	    public final void a(dix p1)
	    {
	        return;
	    }
	
	
	    public final declared_synchronized void a(boolean p5, int p6, int p7)
	    {
	        dkc v0_0 = 1;
	        try {
	            if (!this.e) {
	                String v2_2;
	                if ((p6 & 1) != 1) {
	                    v2_2 = 0;
	                } else {
	                    v2_2 = 1;
	                }
	                if (this.d == v2_2) {
	                    v0_0 = 0;
	                }
	                if (p5 == v0_0) {
	                    this.a.f(-2147287034);
	                    this.a.f(4);
	                    this.a.f(p6);
	                    this.a.flush();
	                    return;
	                } else {
	                    throw new IllegalArgumentException("payload != reply");
	                }
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_9) {
	            throw v0_9;
	        }
	    }
	
	
	    public final declared_synchronized void a(boolean p7, int p8, djz p9, int p10)
	    {
	        dkc v0_0;
	        if (!p7) {
	            v0_0 = 0;
	        } else {
	            v0_0 = 1;
	        }
	        try {
	            if (!this.e) {
	                if (((long) p10) <= 16777215) {
	                    this.a.f((2147483647 & p8));
	                    this.a.f((((v0_0 & 255) << 24) | (16777215 & p10)));
	                    if (p10 > 0) {
	                        this.a.a_(p9, ((long) p10));
	                    }
	                    return;
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder("FRAME_TOO_LARGE max size is 16Mib: ").append(p10).toString());
	                }
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_9) {
	            throw v0_9;
	        }
	    }
	
	
	    public final declared_synchronized void a(boolean p8, boolean p9, int p10, int p11, java.util.List p12)
	    {
	        dkc v0_0 = 0;
	        try {
	            if (!this.e) {
	                djz v1_2;
	                this.a(p12);
	                int v2_2 = ((int) (10 + this.b.b));
	                if (!p8) {
	                    v1_2 = 0;
	                } else {
	                    v1_2 = 1;
	                }
	                if (p9) {
	                    v0_0 = 2;
	                }
	                dkc v0_1 = (v0_0 | v1_2);
	                this.a.f(-2147287039);
	                this.a.f((((v0_1 & 255) << 24) | (v2_2 & 16777215)));
	                this.a.f((p10 & 2147483647));
	                this.a.f((p11 & 2147483647));
	                this.a.g(0);
	                this.a.a(this.b);
	                this.a.flush();
	                return;
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_12) {
	            throw v0_12;
	        }
	    }
	
	
	    public final declared_synchronized void b()
	    {
	        try {
	            if (!this.e) {
	                this.a.flush();
	                return;
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_4) {
	            throw v0_4;
	        }
	    }
	
	
	    public final declared_synchronized void b(dix p6)
	    {
	        try {
	            if (!this.e) {
	                int v0_2 = Integer.bitCount(p6.a);
	                dkc v1_1 = ((v0_2 << 3) + 4);
	                this.a.f(-2147287036);
	                this.a.f(((v1_1 & 16777215) | 0));
	                this.a.f(v0_2);
	                int v0_3 = 0;
	                while (v0_3 <= 10) {
	                    if (p6.a(v0_3)) {
	                        this.a.f((((p6.b(v0_3) & 255) << 24) | (v0_3 & 16777215)));
	                        this.a.f(p6.d[v0_3]);
	                    }
	                    v0_3++;
	                }
	                this.a.flush();
	                return;
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (int v0_7) {
	            throw v0_7;
	        }
	    }
	
	
	    public final int c()
	    {
	        return 16383;
	    }
	
	
	    public final declared_synchronized void close()
	    {
	        try {
	            this.e = 1;
	            dgs.a(this.a, this.c);
	            return;
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	    }
	
