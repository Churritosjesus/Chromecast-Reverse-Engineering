	final java.nio.ByteBuffer a
	
	    private cmk(java.nio.ByteBuffer p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    private cmk(byte[] p2, int p3, int p4)
	    {
	        this(java.nio.ByteBuffer.wrap(p2, p3, p4));
	        return;
	    }
	
	
	    public static int a(int p1)
	    {
	        int v0;
	        if (p1 < 0) {
	            v0 = 10;
	        } else {
	            v0 = cmk.e(p1);
	        }
	        return v0;
	    }
	
	
	    private static int a(CharSequence p8)
	    {
	        IllegalArgumentException v1_0 = 0;
	        String v3_0 = p8.length();
	        int v0_0 = 0;
	        while ((v0_0 < v3_0) && (p8.charAt(v0_0) < 128)) {
	            v0_0++;
	        }
	        StringBuilder v2_1 = v3_0;
	        while (v0_0 < v3_0) {
	            long v4_1 = p8.charAt(v0_0);
	            if (v4_1 >= 2048) {
	                long v4_2 = p8.length();
	                while (v0_0 < v4_2) {
	                    int v5_0 = p8.charAt(v0_0);
	                    if (v5_0 >= 2048) {
	                        v1_0 += 2;
	                        if ((55296 <= v5_0) && (v5_0 <= 57343)) {
	                            if (Character.codePointAt(p8, v0_0) >= 65536) {
	                                v0_0++;
	                            } else {
	                                throw new IllegalArgumentException(new StringBuilder("Unpaired surrogate at index ").append(v0_0).toString());
	                            }
	                        }
	                    } else {
	                        v1_0 += ((127 - v5_0) >> 31);
	                    }
	                    v0_0++;
	                }
	                int v0_1 = (v2_1 + v1_0);
	            } else {
	                v2_1 += ((127 - v4_1) >> 31);
	                v0_0++;
	            }
	            if (v0_1 >= v3_0) {
	                return v0_1;
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("UTF-8 length does not fit in int: ").append((((long) v0_1) + 2.121995791e-314)).toString());
	            }
	        }
	        v0_1 = v2_1;
	    }
	
	
	    private static int a(CharSequence p8, byte[] p9, int p10, int p11)
	    {
	        String v3_0 = p8.length();
	        String v0_0 = 0;
	        int v4 = (p10 + p11);
	        while ((v0_0 < v3_0) && ((v0_0 + p10) < v4)) {
	            int v1_1 = p8.charAt(v0_0);
	            if (v1_1 >= 128) {
	                break;
	            }
	            p9[(p10 + v0_0)] = ((byte) v1_1);
	            v0_0++;
	        }
	        String v0_1;
	        if (v0_0 != v3_0) {
	            byte v2_0 = (p10 + v0_0);
	            while (v0_0 < v3_0) {
	                int v1_21;
	                int v5_0 = p8.charAt(v0_0);
	                if ((v5_0 >= 128) || (v2_0 >= v4)) {
	                    if ((v5_0 >= 2048) || (v2_0 > (v4 - 2))) {
	                        if (((v5_0 >= 55296) && (57343 >= v5_0)) || (v2_0 > (v4 - 3))) {
	                            if (v2_0 > (v4 - 4)) {
	                                throw new ArrayIndexOutOfBoundsException(new StringBuilder("Failed writing ").append(v5_0).append(" at index ").append(v2_0).toString());
	                            } else {
	                                if ((v0_0 + 1) != p8.length()) {
	                                    v0_0++;
	                                    int v1_15 = p8.charAt(v0_0);
	                                    if (Character.isSurrogatePair(v5_0, v1_15)) {
	                                        int v5_1 = Character.toCodePoint(v5_0, v1_15);
	                                        int v1_16 = (v2_0 + 1);
	                                        p9[v2_0] = ((byte) ((v5_1 >> 18) | 240));
	                                        byte v2_1 = (v1_16 + 1);
	                                        p9[v1_16] = ((byte) (((v5_1 >> 12) & 63) | 128));
	                                        int v6_9 = (v2_1 + 1);
	                                        p9[v2_1] = ((byte) (((v5_1 >> 6) & 63) | 128));
	                                        v1_21 = (v6_9 + 1);
	                                        p9[v6_9] = ((byte) ((v5_1 & 63) | 128));
	                                        v0_0++;
	                                        v2_0 = v1_21;
	                                    }
	                                }
	                                throw new IllegalArgumentException(new StringBuilder("Unpaired surrogate at index ").append((v0_0 - 1)).toString());
	                            }
	                        } else {
	                            int v1_24 = (v2_0 + 1);
	                            p9[v2_0] = ((byte) ((v5_0 >> 12) | 480));
	                            byte v2_7 = (v1_24 + 1);
	                            p9[v1_24] = ((byte) (((v5_0 >> 6) & 63) | 128));
	                            v1_21 = (v2_7 + 1);
	                            p9[v2_7] = ((byte) ((v5_0 & 63) | 128));
	                        }
	                    } else {
	                        int v6_17 = (v2_0 + 1);
	                        p9[v2_0] = ((byte) ((v5_0 >> 6) | 960));
	                        v1_21 = (v6_17 + 1);
	                        p9[v6_17] = ((byte) ((v5_0 & 63) | 128));
	                    }
	                } else {
	                    v1_21 = (v2_0 + 1);
	                    p9[v2_0] = ((byte) v5_0);
	                }
	            }
	            v0_1 = v2_0;
	        } else {
	            v0_1 = (p10 + v3_0);
	        }
	        return v0_1;
	    }
	
	
	    public static int a(String p2)
	    {
	        int v0_0 = cmk.a(p2);
	        return (v0_0 + cmk.e(v0_0));
	    }
	
	
	    public static int a(byte[] p2)
	    {
	        return (cmk.e(p2.length) + p2.length);
	    }
	
	
	    public static cmk a(byte[] p1, int p2, int p3)
	    {
	        return new cmk(p1, p2, p3);
	    }
	
	
	    private static void a(CharSequence p3, java.nio.ByteBuffer p4)
	    {
	        if (!p4.isReadOnly()) {
	            if (!p4.hasArray()) {
	                cmk.b(p3, p4);
	            } else {
	                try {
	                    p4.position((cmk.a(p3, p4.array(), (p4.arrayOffset() + p4.position()), p4.remaining()) - p4.arrayOffset()));
	                } catch (ArrayIndexOutOfBoundsException v0_5) {
	                    java.nio.BufferOverflowException v1_4 = new java.nio.BufferOverflowException();
	                    v1_4.initCause(v0_5);
	                    throw v1_4;
	                }
	            }
	            return;
	        } else {
	            throw new java.nio.ReadOnlyBufferException();
	        }
	    }
	
	
	    public static int b(int p2, int p3)
	    {
	        return (cmk.c(p2) + cmk.a(p3));
	    }
	
	
	    public static int b(int p3, long p4)
	    {
	        return (cmk.c(p3) + cmk.b(p4));
	    }
	
	
	    public static int b(int p3, cms p4)
	    {
	        int v0_0 = cmk.c(p3);
	        int v1_0 = p4.f();
	        return (v0_0 + (v1_0 + cmk.e(v1_0)));
	    }
	
	
	    public static int b(int p2, String p3)
	    {
	        return (cmk.c(p2) + cmk.a(p3));
	    }
	
	
	    public static int b(int p2, byte[] p3)
	    {
	        return (cmk.c(p2) + cmk.a(p3));
	    }
	
	
	    public static int b(long p4)
	    {
	        int v0_27;
	        if ((-128 & p4) != 0) {
	            if ((-16384 & p4) != 0) {
	                if ((-2097152 & p4) != 0) {
	                    if ((-268435456 & p4) != 0) {
	                        if ((nan & p4) != 0) {
	                            if ((nan & p4) != 0) {
	                                if ((nan & p4) != 0) {
	                                    if ((-5.486124068793689e+303 & p4) != 0) {
	                                        if ((-0.0 & p4) != 0) {
	                                            v0_27 = 10;
	                                        } else {
	                                            v0_27 = 9;
	                                        }
	                                    } else {
	                                        v0_27 = 8;
	                                    }
	                                } else {
	                                    v0_27 = 7;
	                                }
	                            } else {
	                                v0_27 = 6;
	                            }
	                        } else {
	                            v0_27 = 5;
	                        }
	                    } else {
	                        v0_27 = 4;
	                    }
	                } else {
	                    v0_27 = 3;
	                }
	            } else {
	                v0_27 = 2;
	            }
	        } else {
	            v0_27 = 1;
	        }
	        return v0_27;
	    }
	
	
	    private static void b(CharSequence p5, java.nio.ByteBuffer p6)
	    {
	        IllegalArgumentException v1_0 = p5.length();
	        String v0_0 = 0;
	        while (v0_0 < v1_0) {
	            byte v2_0 = p5.charAt(v0_0);
	            if (v2_0 >= 128) {
	                if (v2_0 >= 2048) {
	                    if ((v2_0 >= 55296) && (57343 >= v2_0)) {
	                        if ((v0_0 + 1) != p5.length()) {
	                            v0_0++;
	                            byte v3_5 = p5.charAt(v0_0);
	                            if (Character.isSurrogatePair(v2_0, v3_5)) {
	                                byte v2_1 = Character.toCodePoint(v2_0, v3_5);
	                                p6.put(((byte) ((v2_1 >> 18) | 240)));
	                                p6.put(((byte) (((v2_1 >> 12) & 63) | 128)));
	                                p6.put(((byte) (((v2_1 >> 6) & 63) | 128)));
	                                p6.put(((byte) ((v2_1 & 63) | 128)));
	                                v0_0++;
	                            }
	                        }
	                        throw new IllegalArgumentException(new StringBuilder("Unpaired surrogate at index ").append((v0_0 - 1)).toString());
	                    } else {
	                        p6.put(((byte) ((v2_0 >> 12) | 480)));
	                        p6.put(((byte) (((v2_0 >> 6) & 63) | 128)));
	                        p6.put(((byte) ((v2_0 & 63) | 128)));
	                    }
	                } else {
	                    p6.put(((byte) ((v2_0 >> 6) | 960)));
	                    p6.put(((byte) ((v2_0 & 63) | 128)));
	                }
	            } else {
	                p6.put(((byte) v2_0));
	            }
	        }
	        return;
	    }
	
	
	    public static int c(int p1)
	    {
	        return cmk.e(cmu.a(p1, 0));
	    }
	
	
	    public static long c(long p4)
	    {
	        return ((p4 << 1) ^ (p4 >> 63));
	    }
	
	
	    public static int e(int p1)
	    {
	        int v0_6;
	        if ((p1 & -128) != 0) {
	            if ((p1 & -16384) != 0) {
	                if ((-2097152 & p1) != 0) {
	                    if ((-268435456 & p1) != 0) {
	                        v0_6 = 5;
	                    } else {
	                        v0_6 = 4;
	                    }
	                } else {
	                    v0_6 = 3;
	                }
	            } else {
	                v0_6 = 2;
	            }
	        } else {
	            v0_6 = 1;
	        }
	        return v0_6;
	    }
	
	
	    public final void a(int p3, int p4)
	    {
	        this.c(p3, 0);
	        if (p4 < 0) {
	            this.a(((long) p4));
	        } else {
	            this.d(p4);
	        }
	        return;
	    }
	
	
	    public final void a(int p3, long p4)
	    {
	        this.c(p3, 0);
	        this.a(p4);
	        return;
	    }
	
	
	    public final void a(int p2, cms p3)
	    {
	        this.c(p2, 2);
	        this.a(p3);
	        return;
	    }
	
	
	    public final void a(int p5, String p6)
	    {
	        this.c(p5, 2);
	        try {
	            java.nio.ByteBuffer v0_2 = cmk.e(p6.length());
	        } catch (java.nio.ByteBuffer v0) {
	            throw new cml(this.a.position(), this.a.limit());
	        }
	        if (v0_2 != cmk.e((p6.length() * 3))) {
	            this.d(cmk.a(p6));
	            cmk.a(p6, this.a);
	        } else {
	            int v1_4 = this.a.position();
	            this.a.position((v1_4 + v0_2));
	            cmk.a(p6, this.a);
	            int v2_3 = this.a.position();
	            this.a.position(v1_4);
	            this.d(((v2_3 - v1_4) - v0_2));
	            this.a.position(v2_3);
	        }
	        return;
	    }
	
	
	    public final void a(int p2, boolean p3)
	    {
	        int v0 = 0;
	        this.c(p2, 0);
	        if (p3) {
	            v0 = 1;
	        }
	        this.b(v0);
	        return;
	    }
	
	
	    public final void a(int p2, byte[] p3)
	    {
	        this.c(p2, 2);
	        this.d(p3.length);
	        this.b(p3);
	        return;
	    }
	
	
	    public final void a(long p6)
	    {
	        while ((-128 & p6) != 0) {
	            this.b(((((int) p6) & 127) | 128));
	            p6 >>= 7;
	        }
	        this.b(((int) p6));
	        return;
	    }
	
	
	    public final void a(cms p2)
	    {
	        this.d(p2.e());
	        p2.a(this);
	        return;
	    }
	
	
	    public final void b(int p4)
	    {
	        if (this.a.hasRemaining()) {
	            this.a.put(((byte) p4));
	            return;
	        } else {
	            throw new cml(this.a.position(), this.a.limit());
	        }
	    }
	
	
	    public final void b(byte[] p4)
	    {
	        cml v0_0 = p4.length;
	        if (this.a.remaining() < v0_0) {
	            throw new cml(this.a.position(), this.a.limit());
	        } else {
	            this.a.put(p4, 0, v0_0);
	            return;
	        }
	    }
	
	
	    public final void c(int p2, int p3)
	    {
	        this.d(cmu.a(p2, p3));
	        return;
	    }
	
	
	    public final void d(int p2)
	    {
	        while ((p2 & -128) != 0) {
	            this.b(((p2 & 127) | 128));
	            p2 >>= 7;
	        }
	        this.b(p2);
	        return;
	    }
	
