	private final dkc a
	private final  b
	private final djz c
	private final dii d
	private  e
	private  f
	
	    din(dkc p3, boolean p4)
	    {
	        this.a = p3;
	        this.b = p4;
	        this.c = new djz();
	        this.d = new dii(this.c);
	        this.e = 16384;
	        return;
	    }
	
	
	    private void a(int p6, int p7, byte p8, byte p9)
	    {
	        if (dij.b().isLoggable(java.util.logging.Level.FINE)) {
	            dij.b().fine(dil.a(0, p6, p7, p8, p9));
	        }
	        if (p7 <= this.e) {
	            if ((-2147483648 & p6) == 0) {
	                dij.a(this.a, p7);
	                this.a.h((p8 & 255));
	                this.a.h((p9 & 255));
	                this.a.f((2147483647 & p6));
	                return;
	            } else {
	                int v1_6 = new Object[1];
	                v1_6[0] = Integer.valueOf(p6);
	                throw dij.b("reserved bit set: %s", v1_6);
	            }
	        } else {
	            int v1_8 = new Object[2];
	            v1_8[0] = Integer.valueOf(this.e);
	            v1_8[1] = Integer.valueOf(p7);
	            throw dij.b("FRAME_SIZE_ERROR length > %d: %d", v1_8);
	        }
	    }
	
	
	    private void b(int p9, long p10)
	    {
	        while (p10 > 0) {
	            dkc v0_5;
	            int v1 = ((int) Math.min(((long) this.e), p10));
	            p10 -= ((long) v1);
	            if (p10 != 0) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 4;
	            }
	            this.a(p9, v1, 9, v0_5);
	            this.a.a_(this.c, ((long) v1));
	        }
	        return;
	    }
	
	
	    public final declared_synchronized void a()
	    {
	        try {
	            if (!this.f) {
	                if (this.b) {
	                    if (dij.b().isLoggable(java.util.logging.Level.FINE)) {
	                        dkc v0_4 = dij.b();
	                        Object[] v2_1 = new Object[1];
	                        v2_1[0] = dij.a().b();
	                        v0_4.fine(String.format(">> CONNECTION %s", v2_1));
	                    }
	                    this.a.b(dij.a().d());
	                    this.a.flush();
	                }
	                return;
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_9) {
	            throw v0_9;
	        }
	    }
	
	
	    public final declared_synchronized void a(int p5, long p6)
	    {
	        try {
	            if (!this.f) {
	                if ((p6 != 0) && (p6 <= 2147483647)) {
	                    this.a(p5, 4, 8, 0);
	                    this.a.f(((int) p6));
	                    this.a.flush();
	                    return;
	                } else {
	                    int v1_3 = new Object[1];
	                    v1_3[0] = Long.valueOf(p6);
	                    throw dij.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", v1_3);
	                }
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_12) {
	            throw v0_12;
	        }
	    }
	
	
	    public final declared_synchronized void a(int p4, dia p5)
	    {
	        try {
	            if (!this.f) {
	                if (p5.j != -1) {
	                    this.a(p4, 4, 3, 0);
	                    this.a.f(p5.i);
	                    this.a.flush();
	                    return;
	                } else {
	                    throw new IllegalArgumentException();
	                }
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_9) {
	            throw v0_9;
	        }
	    }
	
	
	    public final declared_synchronized void a(int p5, dia p6, byte[] p7)
	    {
	        try {
	            if (!this.f) {
	                if (p6.i != -1) {
	                    this.a(0, (p7.length + 8), 7, 0);
	                    this.a.f(p5);
	                    this.a.f(p6.i);
	                    if (p7.length > 0) {
	                        this.a.b(p7);
	                    }
	                    this.a.flush();
	                    return;
	                } else {
	                    int v1_4 = new Object[0];
	                    throw dij.b("errorCode.httpCode == -1", v1_4);
	                }
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_13) {
	            throw v0_13;
	        }
	    }
	
	
	    public final declared_synchronized void a(dix p5)
	    {
	        try {
	            if (!this.f) {
	                dkc v0_1 = this.e;
	                if ((p5.a & 32) != 0) {
	                    v0_1 = p5.d[5];
	                }
	                this.e = v0_1;
	                this.a(0, 0, 4, 1);
	                this.a.flush();
	                return;
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_7) {
	            throw v0_7;
	        }
	    }
	
	
	    public final declared_synchronized void a(boolean p5, int p6, int p7)
	    {
	        dkc v0_0 = 0;
	        try {
	            if (!this.f) {
	                if (p5) {
	                    v0_0 = 1;
	                }
	                this.a(0, 8, 6, v0_0);
	                this.a.f(p6);
	                this.a.f(p7);
	                this.a.flush();
	                return;
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_6) {
	            throw v0_6;
	        }
	    }
	
	
	    public final declared_synchronized void a(boolean p5, int p6, djz p7, int p8)
	    {
	        dkc v0_0 = 0;
	        try {
	            if (!this.f) {
	                if (p5) {
	                    v0_0 = 1;
	                }
	                this.a(p6, p8, 0, v0_0);
	                if (p8 > 0) {
	                    this.a.a_(p7, ((long) p8));
	                }
	                return;
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_4) {
	            throw v0_4;
	        }
	    }
	
	
	    public final declared_synchronized void a(boolean p9, boolean p10, int p11, int p12, java.util.List p13)
	    {
	        try {
	            if (!p10) {
	                if (!this.f) {
	                    if (!this.f) {
	                        if (this.c.b == 0) {
	                            long v0_11;
	                            this.d.a(p13);
	                            long v2_1 = this.c.b;
	                            int v1_0 = ((int) Math.min(((long) this.e), v2_1));
	                            if (v2_1 != ((long) v1_0)) {
	                                v0_11 = 0;
	                            } else {
	                                v0_11 = 4;
	                            }
	                            if (p9) {
	                                v0_11 = ((byte) (v0_11 | 1));
	                            }
	                            this.a(p11, v1_0, 1, v0_11);
	                            this.a.a_(this.c, ((long) v1_0));
	                            if (v2_1 > ((long) v1_0)) {
	                                this.b(p11, (v2_1 - ((long) v1_0)));
	                            }
	                            return;
	                        } else {
	                            throw new IllegalStateException();
	                        }
	                    } else {
	                        throw new java.io.IOException("closed");
	                    }
	                } else {
	                    throw new java.io.IOException("closed");
	                }
	            } else {
	                throw new UnsupportedOperationException();
	            }
	        } catch (long v0_25) {
	            throw v0_25;
	        }
	    }
	
	
	    public final declared_synchronized void b()
	    {
	        try {
	            if (!this.f) {
	                this.a.flush();
	                return;
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (dkc v0_4) {
	            throw v0_4;
	        }
	    }
	
	
	    public final declared_synchronized void b(dix p7)
	    {
	        int v2 = 0;
	        try {
	            if (!this.f) {
	                this.a(0, (Integer.bitCount(p7.a) * 6), 4, 0);
	                while (v2 < 10) {
	                    if (p7.a(v2)) {
	                        int v0_8;
	                        if (v2 != 4) {
	                            if (v2 != 7) {
	                                v0_8 = v2;
	                            } else {
	                                v0_8 = 4;
	                            }
	                        } else {
	                            v0_8 = 3;
	                        }
	                        this.a.g(v0_8);
	                        this.a.f(p7.d[v2]);
	                    }
	                    v2++;
	                }
	                this.a.flush();
	                return;
	            } else {
	                throw new java.io.IOException("closed");
	            }
	        } catch (int v0_12) {
	            throw v0_12;
	        }
	    }
	
	
	    public final int c()
	    {
	        return this.e;
	    }
	
	
	    public final declared_synchronized void close()
	    {
	        try {
	            this.f = 1;
	            this.a.close();
	            return;
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	    }
	
