	private static final B c
	 dks a
	public  b
	
	    static djz()
	    {
	        byte[] v0_1 = new byte[16];
	        v0_1 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
	        djz.c = v0_1;
	        return;
	    }
	
	
	    public djz()
	    {
	        return;
	    }
	
	
	    private String a(long p8, java.nio.charset.Charset p10)
	    {
	        dky.a(this.b, 0, p8);
	        if (p10 != null) {
	            if (p8 <= 2147483647) {
	                String v0_8;
	                if (p8 != 0) {
	                    byte[] v1_0 = this.a;
	                    if ((((long) v1_0.b) + p8) <= ((long) v1_0.c)) {
	                        v0_8 = new String(v1_0.a, v1_0.b, ((int) p8), p10);
	                        v1_0.b = ((int) (((long) v1_0.b) + p8));
	                        this.b = (this.b - p8);
	                        if (v1_0.b == v1_0.c) {
	                            this.a = v1_0.a();
	                            dkt.a(v1_0);
	                        }
	                    } else {
	                        v0_8 = new String(this.e(p8), p10);
	                    }
	                } else {
	                    v0_8 = "";
	                }
	                return v0_8;
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("byteCount > Integer.MAX_VALUE: ").append(p8).toString());
	            }
	        } else {
	            throw new IllegalArgumentException("charset == null");
	        }
	    }
	
	
	    private void c(byte[] p4)
	    {
	        int v0_0 = 0;
	        while (v0_0 < p4.length) {
	            int v1_3 = this.a(p4, v0_0, (p4.length - v0_0));
	            if (v1_3 != -1) {
	                v0_0 += v1_3;
	            } else {
	                throw new java.io.EOFException();
	            }
	        }
	        return;
	    }
	
	
	    private String i(long p2)
	    {
	        return this.a(p2, dky.a);
	    }
	
	
	    private djz s()
	    {
	        djz v0_6;
	        djz v1_1 = new djz();
	        if (this.b != 0) {
	            v1_1.a = new dks(this.a);
	            djz v0_3 = v1_1.a;
	            dks v3_0 = v1_1.a;
	            v1_1.a.g = v3_0;
	            v0_3.f = v3_0;
	            djz v0_5 = this.a.f;
	            while (v0_5 != this.a) {
	                v1_1.a.g.a(new dks(v0_5));
	                v0_5 = v0_5.f;
	            }
	            v1_1.b = this.b;
	            v0_6 = v1_1;
	        } else {
	            v0_6 = v1_1;
	        }
	        return v0_6;
	    }
	
	
	    public final int a(byte[] p7, int p8, int p9)
	    {
	        int v0_4;
	        dky.a(((long) p7.length), ((long) p8), ((long) p9));
	        dks v1 = this.a;
	        if (v1 != null) {
	            v0_4 = Math.min(p9, (v1.c - v1.b));
	            System.arraycopy(v1.a, v1.b, p7, p8, v0_4);
	            v1.b = (v1.b + v0_4);
	            this.b = (this.b - ((long) v0_4));
	            if (v1.b == v1.c) {
	                this.a = v1.a();
	                dkt.a(v1);
	            }
	        } else {
	            v0_4 = -1;
	        }
	        return v0_4;
	    }
	
	
	    public final long a(byte p3)
	    {
	        return this.a(p3, 0);
	    }
	
	
	    public final long a(byte p13, long p14)
	    {
	        if (p14 >= 0) {
	            long v0_4;
	            long v2_0 = this.a;
	            if (v2_0 != 0) {
	                long v0_2 = 0;
	                while(true) {
	                    dks v3_1 = (v2_0.c - v2_0.b);
	                    if (p14 < ((long) v3_1)) {
	                        long v4_5 = (((long) v2_0.b) + p14);
	                        while (v4_5 < ((long) v2_0.c)) {
	                            if (v2_0.a[((int) v4_5)] != p13) {
	                                v4_5++;
	                            } else {
	                                v0_4 = ((v0_2 + v4_5) - ((long) v2_0.b));
	                                return v0_4;
	                            }
	                        }
	                        p14 = 0;
	                    } else {
	                        p14 -= ((long) v3_1);
	                    }
	                    v0_2 += ((long) v3_1);
	                    v2_0 = v2_0.f;
	                    if (v2_0 == this.a) {
	                        v0_4 = -1;
	                    }
	                }
	            } else {
	                v0_4 = -1;
	            }
	            return v0_4;
	        } else {
	            throw new IllegalArgumentException("fromIndex < 0");
	        }
	    }
	
	
	    public final long a(djz p5, long p6)
	    {
	        if (p5 != null) {
	            if (p6 >= 0) {
	                if (this.b != 0) {
	                    if (p6 > this.b) {
	                        p6 = this.b;
	                    }
	                    p5.a_(this, p6);
	                } else {
	                    p6 = -1;
	                }
	                return p6;
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("byteCount < 0: ").append(p6).toString());
	            }
	        } else {
	            throw new IllegalArgumentException("sink == null");
	        }
	    }
	
	
	    public final long a(dkv p7)
	    {
	        if (p7 != null) {
	            long v0_0 = 0;
	            while(true) {
	                long v2_1 = p7.a(this, 2048);
	                if (v2_1 == -1) {
	                    break;
	                }
	                v0_0 += v2_1;
	            }
	            return v0_0;
	        } else {
	            throw new IllegalArgumentException("source == null");
	        }
	    }
	
	
	    public final djz a(int p4)
	    {
	        if (p4 >= 128) {
	            if (p4 >= 2048) {
	                if (p4 >= 65536) {
	                    if (p4 > 1114111) {
	                        throw new IllegalArgumentException(new StringBuilder("Unexpected code point: ").append(Integer.toHexString(p4)).toString());
	                    } else {
	                        this.b(((p4 >> 18) | 240));
	                        this.b((((p4 >> 12) & 63) | 128));
	                        this.b((((p4 >> 6) & 63) | 128));
	                        this.b(((p4 & 63) | 128));
	                    }
	                } else {
	                    if ((p4 < 55296) || (p4 > 57343)) {
	                        this.b(((p4 >> 12) | 224));
	                        this.b((((p4 >> 6) & 63) | 128));
	                        this.b(((p4 & 63) | 128));
	                    } else {
	                        throw new IllegalArgumentException(new StringBuilder("Unexpected code point: ").append(Integer.toHexString(p4)).toString());
	                    }
	                }
	            } else {
	                this.b(((p4 >> 6) | 192));
	                this.b(((p4 & 63) | 128));
	            }
	        } else {
	            this.b(p4);
	        }
	        return this;
	    }
	
	
	    public final djz a(djz p9, long p10, long p12)
	    {
	        if (p9 != null) {
	            dky.a(this.b, p10, p12);
	            if (p12 != 0) {
	                p9.b = (p9.b + p12);
	                dks v0_4 = this.a;
	                while (p10 >= ((long) (v0_4.c - v0_4.b))) {
	                    p10 -= ((long) (v0_4.c - v0_4.b));
	                    v0_4 = v0_4.f;
	                }
	                while (p12 > 0) {
	                    int v1_5 = new dks(v0_4);
	                    v1_5.b = ((int) (((long) v1_5.b) + p10));
	                    v1_5.c = Math.min((v1_5.b + ((int) p12)), v1_5.c);
	                    if (p9.a != null) {
	                        p9.a.g.a(v1_5);
	                    } else {
	                        v1_5.g = v1_5;
	                        v1_5.f = v1_5;
	                        p9.a = v1_5;
	                    }
	                    p12 -= ((long) (v1_5.c - v1_5.b));
	                    v0_4 = v0_4.f;
	                    p10 = 0;
	                }
	            }
	            return this;
	        } else {
	            throw new IllegalArgumentException("out == null");
	        }
	    }
	
	
	    public final djz a(dke p4)
	    {
	        if (p4 != null) {
	            this.b(p4.b, 0, p4.b.length);
	            return this;
	        } else {
	            throw new IllegalArgumentException("byteString == null");
	        }
	    }
	
	
	    public final djz a(String p3)
	    {
	        return this.a(p3, 0, p3.length());
	    }
	
	
	    public final djz a(String p10, int p11, int p12)
	    {
	        if (p10 != null) {
	            if (p11 >= 0) {
	                if (p12 >= p11) {
	                    if (p12 > p10.length()) {
	                        throw new IllegalArgumentException(new StringBuilder("endIndex > string.length: ").append(p12).append(" > ").append(p10.length()).toString());
	                    }
	                    while (p11 < p12) {
	                        int v1_0 = p10.charAt(p11);
	                        if (v1_0 >= 128) {
	                            if (v1_0 >= 2048) {
	                                if ((v1_0 >= 55296) && (v1_0 <= 57343)) {
	                                    int v0_4;
	                                    if ((p11 + 1) >= p12) {
	                                        v0_4 = 0;
	                                    } else {
	                                        v0_4 = p10.charAt((p11 + 1));
	                                    }
	                                    if ((v1_0 <= 56319) && ((v0_4 >= 56320) && (v0_4 <= 57343))) {
	                                        int v0_8 = (((v0_4 & -56321) | ((v1_0 & -55297) << 10)) + 65536);
	                                        this.b(((v0_8 >> 18) | 240));
	                                        this.b((((v0_8 >> 12) & 63) | 128));
	                                        this.b((((v0_8 >> 6) & 63) | 128));
	                                        this.b(((v0_8 & 63) | 128));
	                                        p11 += 2;
	                                    } else {
	                                        this.b(63);
	                                        p11++;
	                                    }
	                                } else {
	                                    this.b(((v1_0 >> 12) | 224));
	                                    this.b((((v1_0 >> 6) & 63) | 128));
	                                    this.b(((v1_0 & 63) | 128));
	                                    p11++;
	                                }
	                            } else {
	                                this.b(((v1_0 >> 6) | 192));
	                                this.b(((v1_0 & 63) | 128));
	                                p11++;
	                            }
	                        } else {
	                            int v2_3 = this.e(1);
	                            int v3_2 = v2_3.a;
	                            long v4_0 = (v2_3.c - p11);
	                            int v5 = Math.min(p12, (2048 - v4_0));
	                            int v0_26 = (p11 + 1);
	                            v3_2[(v4_0 + p11)] = ((byte) v1_0);
	                            while (v0_26 < v5) {
	                                byte v6_1 = p10.charAt(v0_26);
	                                if (v6_1 >= 128) {
	                                    break;
	                                }
	                                int v1_14 = (v0_26 + 1);
	                                v3_2[(v0_26 + v4_0)] = ((byte) v6_1);
	                                v0_26 = v1_14;
	                            }
	                            int v1_13 = ((v0_26 + v4_0) - v2_3.c);
	                            v2_3.c = (v2_3.c + v1_13);
	                            this.b = (this.b + ((long) v1_13));
	                            p11 = v0_26;
	                        }
	                    }
	                    return this;
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder("endIndex < beginIndex: ").append(p12).append(" < ").append(p11).toString());
	                }
	            } else {
	                throw new IllegalAccessError(new StringBuilder("beginIndex < 0: ").append(p11).toString());
	            }
	        } else {
	            throw new IllegalArgumentException("string == null");
	        }
	    }
	
	
	    public final djz a(byte[] p3)
	    {
	        if (p3 != null) {
	            return this.b(p3, 0, p3.length);
	        } else {
	            throw new IllegalArgumentException("source == null");
	        }
	    }
	
	
	    public final dkw a()
	    {
	        return dkw.b;
	    }
	
	
	    public final void a(long p4)
	    {
	        if (this.b >= p4) {
	            return;
	        } else {
	            throw new java.io.EOFException();
	        }
	    }
	
	
	    public final void a_(djz p11, long p12)
	    {
	        if (p11 != null) {
	            if (p11 != this) {
	                dky.a(p11.b, 0, p12);
	                while (p12 > 0) {
	                    if (p12 < ((long) (p11.a.c - p11.a.b))) {
	                        int v1_2;
	                        if (this.a == null) {
	                            v1_2 = 0;
	                        } else {
	                            v1_2 = this.a.g;
	                        }
	                        if ((v1_2 != 0) && (v1_2.e)) {
	                            long v0_14;
	                            if (!v1_2.d) {
	                                v0_14 = v1_2.b;
	                            } else {
	                                v0_14 = 0;
	                            }
	                            if (((((long) v1_2.c) + p12) - ((long) v0_14)) <= 2048) {
	                                p11.a.a(v1_2, ((int) p12));
	                                p11.b = (p11.b - p12);
	                                this.b = (this.b + p12);
	                                break;
	                            }
	                        }
	                        long v0_16 = p11.a;
	                        if ((((int) p12) > 0) && (((int) p12) <= (v0_16.c - v0_16.b))) {
	                            long v4_7 = new dks(v0_16);
	                            v4_7.c = (v4_7.b + ((int) p12));
	                            v0_16.b = (((int) p12) + v0_16.b);
	                            v0_16.g.a(v4_7);
	                            p11.a = v4_7;
	                        } else {
	                            throw new IllegalArgumentException();
	                        }
	                    }
	                    long v0_18 = p11.a;
	                    long v4_9 = ((long) (v0_18.c - v0_18.b));
	                    p11.a = v0_18.a();
	                    if (this.a != null) {
	                        int v1_11 = this.a.g.a(v0_18);
	                        if (v1_11.g != v1_11) {
	                            if (v1_11.g.e) {
	                                long v0_28;
	                                int v7_1 = (v1_11.c - v1_11.b);
	                                if (!v1_11.g.d) {
	                                    v0_28 = v1_11.g.b;
	                                } else {
	                                    v0_28 = 0;
	                                }
	                                if (v7_1 <= (v0_28 + (2048 - v1_11.g.c))) {
	                                    v1_11.a(v1_11.g, v7_1);
	                                    v1_11.a();
	                                    dkt.a(v1_11);
	                                }
	                            }
	                        } else {
	                            throw new IllegalStateException();
	                        }
	                    } else {
	                        this.a = v0_18;
	                        long v0_33 = this.a;
	                        int v7_2 = this.a;
	                        this.a.g = v7_2;
	                        v0_33.f = v7_2;
	                    }
	                    p11.b = (p11.b - v4_9);
	                    this.b = (this.b + v4_9);
	                    p12 -= v4_9;
	                }
	                return;
	            } else {
	                throw new IllegalArgumentException("source == this");
	            }
	        } else {
	            throw new IllegalArgumentException("source == null");
	        }
	    }
	
	
	    public final byte b(long p8)
	    {
	        dky.a(this.b, p8, 1);
	        dks v0_1 = this.a;
	        while(true) {
	            byte[] v1_1 = (v0_1.c - v0_1.b);
	            if (p8 < ((long) v1_1)) {
	                break;
	            }
	            p8 -= ((long) v1_1);
	            v0_1 = v0_1.f;
	        }
	        return v0_1.a[(v0_1.b + ((int) p8))];
	    }
	
	
	    public final djz b()
	    {
	        return this;
	    }
	
	
	    public final djz b(int p5)
	    {
	        long v0_1 = this.e(1);
	        byte[] v1 = v0_1.a;
	        long v2_0 = v0_1.c;
	        v0_1.c = (v2_0 + 1);
	        v1[v2_0] = ((byte) p5);
	        this.b = (this.b + 1);
	        return this;
	    }
	
	
	    public final djz b(byte[] p7, int p8, int p9)
	    {
	        if (p7 != null) {
	            dky.a(((long) p7.length), ((long) p8), ((long) p9));
	            long v0_2 = (p8 + p9);
	            while (p8 < v0_2) {
	                dks v1_1 = this.e(1);
	                long v2_3 = Math.min((v0_2 - p8), (2048 - v1_1.c));
	                System.arraycopy(p7, p8, v1_1.a, v1_1.c, v2_3);
	                p8 += v2_3;
	                v1_1.c = (v2_3 + v1_1.c);
	            }
	            this.b = (this.b + ((long) p9));
	            return this;
	        } else {
	            throw new IllegalArgumentException("source == null");
	        }
	    }
	
	
	    public final synthetic dkc b(dke p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public final synthetic dkc b(String p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public final synthetic dkc b(byte[] p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public final djz c(int p6)
	    {
	        long v0_1 = this.e(2);
	        byte[] v1 = v0_1.a;
	        long v2_0 = v0_1.c;
	        int v3 = (v2_0 + 1);
	        v1[v2_0] = ((byte) (p6 >> 8));
	        long v2_1 = (v3 + 1);
	        v1[v3] = ((byte) p6);
	        v0_1.c = v2_1;
	        this.b = (this.b + 2);
	        return this;
	    }
	
	
	    public final synthetic dkc c(byte[] p2, int p3, int p4)
	    {
	        return this.b(p2, p3, p4);
	    }
	
	
	    public final dke c(long p4)
	    {
	        return new dke(this.e(p4));
	    }
	
	
	    public final java.io.OutputStream c()
	    {
	        return new dka(this);
	    }
	
	
	    public final synthetic Object clone()
	    {
	        return this.s();
	    }
	
	
	    public final void close()
	    {
	        return;
	    }
	
	
	    public final djz d(int p6)
	    {
	        long v0_1 = this.e(4);
	        byte[] v1 = v0_1.a;
	        long v2_0 = v0_1.c;
	        int v3_0 = (v2_0 + 1);
	        v1[v2_0] = ((byte) (p6 >> 24));
	        long v2_1 = (v3_0 + 1);
	        v1[v3_0] = ((byte) (p6 >> 16));
	        int v3_1 = (v2_1 + 1);
	        v1[v2_1] = ((byte) (p6 >> 8));
	        long v2_2 = (v3_1 + 1);
	        v1[v3_1] = ((byte) p6);
	        v0_1.c = v2_2;
	        this.b = (this.b + 4);
	        return this;
	    }
	
	
	    public final dkc d()
	    {
	        return this;
	    }
	
	
	    final String d(long p6)
	    {
	        if ((p6 <= 0) || (this.b((p6 - 1)) != 13)) {
	            String v0_4 = this.i(p6);
	            this.f(1);
	        } else {
	            v0_4 = this.i((p6 - 1));
	            this.f(2);
	        }
	        return v0_4;
	    }
	
	
	    final dks e(int p4)
	    {
	        if ((p4 > 0) && (p4 <= 2048)) {
	            dks v0_2;
	            if (this.a != null) {
	                v0_2 = this.a.g;
	                if (((v0_2.c + p4) > 2048) || (!v0_2.e)) {
	                    v0_2 = v0_2.a(dkt.a());
	                }
	            } else {
	                this.a = dkt.a();
	                dks v1_4 = this.a;
	                v0_2 = this.a;
	                this.a.g = v0_2;
	                v1_4.f = v0_2;
	            }
	            return v0_2;
	        } else {
	            throw new IllegalArgumentException();
	        }
	    }
	
	
	    public final boolean e()
	    {
	        int v0_2;
	        if (this.b != 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final byte[] e(long p8)
	    {
	        dky.a(this.b, 0, p8);
	        if (p8 <= 2147483647) {
	            byte[] v0_4 = new byte[((int) p8)];
	            this.c(v0_4);
	            return v0_4;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("byteCount > Integer.MAX_VALUE: ").append(p8).toString());
	        }
	    }
	
	
	    public final boolean equals(Object p15)
	    {
	        long v0_1;
	        long v0_0 = 0;
	        if (this != p15) {
	            if ((p15 instanceof djz)) {
	                if (this.b == ((djz) p15).b) {
	                    if (this.b != 0) {
	                        dks v5 = this.a;
	                        dks v4_1 = ((djz) p15).a;
	                        int v3_0 = v5.b;
	                        int v2_5 = v4_1.b;
	                        while (v0_0 < this.b) {
	                            long v10 = ((long) Math.min((v5.c - v3_0), (v4_1.c - v2_5)));
	                            int v8_5 = 0;
	                            while (((long) v8_5) < v10) {
	                                if (v5.a[v3_0] == v4_1.a[v2_5]) {
	                                    v8_5++;
	                                    v2_5++;
	                                    v3_0++;
	                                } else {
	                                    v0_1 = 0;
	                                }
	                            }
	                            if (v3_0 == v5.c) {
	                                v5 = v5.f;
	                                v3_0 = v5.b;
	                            }
	                            if (v2_5 == v4_1.c) {
	                                v4_1 = v4_1.f;
	                                v2_5 = v4_1.b;
	                            }
	                            v0_0 += v10;
	                        }
	                        v0_1 = 1;
	                    } else {
	                        v0_1 = 1;
	                    }
	                } else {
	                    v0_1 = 0;
	                }
	            } else {
	                v0_1 = 0;
	            }
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final synthetic dkc f(int p2)
	    {
	        return this.d(p2);
	    }
	
	
	    public final java.io.InputStream f()
	    {
	        return new dkb(this);
	    }
	
	
	    public final void f(long p8)
	    {
	        while (p8 > 0) {
	            if (this.a != null) {
	                dks v0_8 = ((int) Math.min(p8, ((long) (this.a.c - this.a.b))));
	                this.b = (this.b - ((long) v0_8));
	                p8 -= ((long) v0_8);
	                dks v1_2 = this.a;
	                v1_2.b = (v0_8 + v1_2.b);
	                if (this.a.b == this.a.c) {
	                    dks v0_12 = this.a;
	                    this.a = v0_12.a();
	                    dkt.a(v0_12);
	                }
	            } else {
	                throw new java.io.EOFException();
	            }
	        }
	        return;
	    }
	
	
	    public final void flush()
	    {
	        return;
	    }
	
	
	    public final byte g()
	    {
	        if (this.b != 0) {
	            dks v0_2 = this.a;
	            byte v1_0 = v0_2.b;
	            dks v2_1 = v0_2.c;
	            int v4 = (v1_0 + 1);
	            byte v1_1 = v0_2.a[v1_0];
	            this.b = (this.b - 1);
	            if (v4 != v2_1) {
	                v0_2.b = v4;
	            } else {
	                this.a = v0_2.a();
	                dkt.a(v0_2);
	            }
	            return v1_1;
	        } else {
	            throw new IllegalStateException("size == 0");
	        }
	    }
	
	
	    public final djz g(long p10)
	    {
	        if (p10 != 0) {
	            int v1 = ((Long.numberOfTrailingZeros(Long.highestOneBit(p10)) / 4) + 1);
	            long v2_0 = this.e(v1);
	            long v0_7 = ((v2_0.c + v1) - 1);
	            int v4 = v2_0.c;
	            while (v0_7 >= v4) {
	                v2_0.a[v0_7] = djz.c[((int) (15 & p10))];
	                p10 >>= 4;
	                v0_7--;
	            }
	            v2_0.c = (v2_0.c + v1);
	            this.b = (((long) v1) + this.b);
	        } else {
	            this = this.b(48);
	        }
	        return this;
	    }
	
	
	    public final synthetic dkc g(int p2)
	    {
	        return this.c(p2);
	    }
	
	
	    public final synthetic dkc h(int p2)
	    {
	        return this.b(p2);
	    }
	
	
	    public final synthetic dkc h(long p2)
	    {
	        return this.g(p2);
	    }
	
	
	    public final short h()
	    {
	        if (this.b >= 2) {
	            short v0_3;
	            short v0_2 = this.a;
	            int v1_0 = v0_2.b;
	            dks v2_0 = v0_2.c;
	            if ((v2_0 - v1_0) >= 2) {
	                int v3_1 = v0_2.a;
	                int v4_1 = (v1_0 + 1);
	                int v5 = (v4_1 + 1);
	                int v1_4 = (((v3_1[v1_0] & 255) << 8) | (v3_1[v4_1] & 255));
	                this.b = (this.b - 2);
	                if (v5 != v2_0) {
	                    v0_2.b = v5;
	                } else {
	                    this.a = v0_2.a();
	                    dkt.a(v0_2);
	                }
	                v0_3 = ((short) v1_4);
	            } else {
	                v0_3 = ((short) (((this.g() & 255) << 8) | (this.g() & 255)));
	            }
	            return v0_3;
	        } else {
	            throw new IllegalStateException(new StringBuilder("size < 2: ").append(this.b).toString());
	        }
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_0;
	        dks v1 = this.a;
	        if (v1 != null) {
	            v0_0 = 1;
	            do {
	                dks v2_0 = v1.b;
	                if (v2_0 >= v1.c) {
	                    v1 = v1.f;
	                } else {
	                    int v3_2 = (v1.a[v2_0] + (v0_0 * 31));
	                    v2_0++;
	                    v0_0 = v3_2;
	                    while (v2_0 < v1.c) {
	                    }
	                }
	            } while(v1 != this.a);
	        } else {
	            v0_0 = 0;
	        }
	        return v0_0;
	    }
	
	
	    public final int i()
	    {
	        if (this.b >= 4) {
	            int v0_8;
	            int v1_0 = this.a;
	            int v0_2 = v1_0.b;
	            dks v2_0 = v1_0.c;
	            if ((v2_0 - v0_2) >= 4) {
	                int v3_1 = v1_0.a;
	                int v4_1 = (v0_2 + 1);
	                int v5_0 = (v4_1 + 1);
	                int v4_5 = (v5_0 + 1);
	                int v5_4 = (v4_5 + 1);
	                v0_8 = (((((v3_1[v0_2] & 255) << 24) | ((v3_1[v4_1] & 255) << 16)) | ((v3_1[v5_0] & 255) << 8)) | (v3_1[v4_5] & 255));
	                this.b = (this.b - 4);
	                if (v5_4 != v2_0) {
	                    v1_0.b = v5_4;
	                } else {
	                    this.a = v1_0.a();
	                    dkt.a(v1_0);
	                }
	            } else {
	                v0_8 = (((((this.g() & 255) << 24) | ((this.g() & 255) << 16)) | ((this.g() & 255) << 8)) | (this.g() & 255));
	            }
	            return v0_8;
	        } else {
	            throw new IllegalStateException(new StringBuilder("size < 4: ").append(this.b).toString());
	        }
	    }
	
	
	    public final short j()
	    {
	        return dky.a(this.h());
	    }
	
	
	    public final int k()
	    {
	        return dky.a(this.i());
	    }
	
	
	    public final long l()
	    {
	        if (this.b != 0) {
	            String v4_1 = 0;
	            String v3_0 = 0;
	            int v2_2 = 0;
	            do {
	                dks v10 = this.a;
	                int v12 = v10.c;
	                int v7 = v10.b;
	                if (v7 < v12) {
	                    int v6_11;
	                    long v8_0 = v10.a[v7];
	                    if ((v8_0 < 48) || (v8_0 > 57)) {
	                        if ((v8_0 < 97) || (v8_0 > 102)) {
	                            if ((v8_0 < 65) || (v8_0 > 70)) {
	                                if (v3_0 != null) {
	                                    v2_2 = 1;
	                                    if (v7 != v12) {
	                                        v10.b = v7;
	                                    } else {
	                                        this.a = v10.a();
	                                        dkt.a(v10);
	                                    }
	                                } else {
	                                    throw new NumberFormatException(new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x").append(Integer.toHexString(v8_0)).toString());
	                                }
	                            } else {
	                                v6_11 = ((v8_0 - 65) + 10);
	                            }
	                        } else {
	                            v6_11 = ((v8_0 - 97) + 10);
	                        }
	                    } else {
	                        v6_11 = (v8_0 - 48);
	                    }
	                    if ((-3.105036184601418e+231 & v4_1) == 0) {
	                        v3_0++;
	                        v7++;
	                        v4_1 = (((long) v6_11) | (v4_1 << 4));
	                        while (v7 >= v12) {
	                        }
	                    } else {
	                        throw new NumberFormatException(new StringBuilder("Number too large: ").append(new djz().g(v4_1).b(v8_0).n()).toString());
	                    }
	                }
	            } while((v2_2 == 0) && (this.a != null));
	            this.b = (this.b - ((long) v3_0));
	            return v4_1;
	        } else {
	            throw new IllegalStateException("size == 0");
	        }
	    }
	
	
	    public final dke m()
	    {
	        return new dke(this.p());
	    }
	
	
	    public final String n()
	    {
	        try {
	            return this.a(this.b, dky.a);
	        } catch (java.io.EOFException v0_2) {
	            throw new AssertionError(v0_2);
	        }
	    }
	
	
	    public final String o()
	    {
	        String v0_1 = this.a(10, 0);
	        if (v0_1 != -1) {
	            return this.d(v0_1);
	        } else {
	            String v1_1 = new djz();
	            this.a(v1_1, 0, Math.min(32, this.b));
	            throw new java.io.EOFException(new StringBuilder("\\n not found: size=").append(this.b).append(" content=").append(v1_1.m().b()).append("...").toString());
	        }
	    }
	
	
	    public final byte[] p()
	    {
	        try {
	            return this.e(this.b);
	        } catch (java.io.EOFException v0_2) {
	            throw new AssertionError(v0_2);
	        }
	    }
	
	
	    public final void q()
	    {
	        try {
	            this.f(this.b);
	            return;
	        } catch (java.io.EOFException v0_1) {
	            throw new AssertionError(v0_1);
	        }
	    }
	
	
	    public final synthetic dkc r()
	    {
	        return this;
	    }
	
	
	    public final String toString()
	    {
	        String v0_10;
	        if (this.b != 0) {
	            if (this.b > 16) {
	                try {
	                    String v1_0 = java.security.MessageDigest.getInstance("MD5");
	                    v1_0.update(this.a.a, this.a.b, (this.a.c - this.a.b));
	                    String v0_8 = this.a.f;
	                } catch (String v0) {
	                    throw new AssertionError();
	                }
	                while (v0_8 != this.a) {
	                    v1_0.update(v0_8.a, v0_8.b, (v0_8.c - v0_8.b));
	                    v0_8 = v0_8.f;
	                }
	                Object[] v2_6 = new Object[2];
	                v2_6[0] = Long.valueOf(this.b);
	                v2_6[1] = dke.a(v1_0.digest()).b();
	                v0_10 = String.format("Buffer[size=%s md5=%s]", v2_6);
	            } else {
	                String v0_14 = this.s().m();
	                Object[] v2_8 = new Object[2];
	                v2_8[0] = Long.valueOf(this.b);
	                v2_8[1] = v0_14.b();
	                v0_10 = String.format("Buffer[size=%s data=%s]", v2_8);
	            }
	        } else {
	            v0_10 = "Buffer[size=0]";
	        }
	        return v0_10;
	    }
	
