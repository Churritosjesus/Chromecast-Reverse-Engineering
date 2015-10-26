	public static final dke a
	private static C c
	private static final  serialVersionUID
	public final B b
	private varargs  d
	private varargs java.lang.String e
	
	    static dke()
	    {
	        dke v0_1 = new char[16];
	        v0_1 = {48, 0, 49, 0, 50, 0, 51, 0, 52, 0, 53, 0, 54, 0, 55, 0};
	        dke.c = v0_1;
	        dke v0_3 = new byte[0];
	        dke.a = dke.a(v0_3);
	        return;
	    }
	
	
	    dke(byte[] p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    public static dke a(String p2)
	    {
	        if (p2 != null) {
	            dke v0_1 = new dke(p2.getBytes(dky.a));
	            v0_1.e = p2;
	            return v0_1;
	        } else {
	            throw new IllegalArgumentException("s == null");
	        }
	    }
	
	
	    public static varargs dke a(byte[] p2)
	    {
	        if (p2 != null) {
	            return new dke(((byte[]) p2.clone()));
	        } else {
	            throw new IllegalArgumentException("data == null");
	        }
	    }
	
	
	    private dke b(String p3)
	    {
	        try {
	            return dke.a(java.security.MessageDigest.getInstance(p3).digest(this.b));
	        } catch (java.security.NoSuchAlgorithmException v0_3) {
	            throw new AssertionError(v0_3);
	        }
	    }
	
	
	    private void readObject(java.io.ObjectInputStream p6)
	    {
	        reflect.Field v1_0 = p6.readInt();
	        if (p6 != null) {
	            if (v1_0 >= null) {
	                int v2_0 = new byte[v1_0];
	                AssertionError v0_0 = 0;
	                while (v0_0 < v1_0) {
	                    int v3_1 = p6.read(v2_0, v0_0, (v1_0 - v0_0));
	                    if (v3_1 != -1) {
	                        v0_0 += v3_1;
	                    } else {
	                        throw new java.io.EOFException();
	                    }
	                }
	                AssertionError v0_2 = new dke(v2_0);
	                try {
	                    reflect.Field v1_2 = dke.getDeclaredField("b");
	                    v1_2.setAccessible(1);
	                    v1_2.set(this, v0_2.b);
	                    return;
	                } catch (AssertionError v0) {
	                    throw new AssertionError();
	                } catch (AssertionError v0) {
	                    throw new AssertionError();
	                }
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("byteCount < 0: ").append(v1_0).toString());
	            }
	        } else {
	            throw new IllegalArgumentException("in == null");
	        }
	    }
	
	
	    private void writeObject(java.io.ObjectOutputStream p2)
	    {
	        p2.writeInt(this.b.length);
	        p2.write(this.b);
	        return;
	    }
	
	
	    public final String a()
	    {
	        String v0_0 = this.e;
	        if (v0_0 == null) {
	            v0_0 = new String(this.b, dky.a);
	            this.e = v0_0;
	        }
	        return v0_0;
	    }
	
	
	    public final String b()
	    {
	        String v0_0 = 0;
	        char[] v2 = new char[(this.b.length << 1)];
	        byte[] v3 = this.b;
	        int v4 = v3.length;
	        int v1_3 = 0;
	        while (v0_0 < v4) {
	            char v5_0 = v3[v0_0];
	            int v6 = (v1_3 + 1);
	            v2[v1_3] = dke.c[((v5_0 >> 4) & 15)];
	            v1_3 = (v6 + 1);
	            v2[v6] = dke.c[(v5_0 & 15)];
	            v0_0++;
	        }
	        return new String(v2);
	    }
	
	
	    public final dke c()
	    {
	        int v1_0 = 0;
	        while (v1_0 < this.b.length) {
	            byte v3_0 = this.b[v1_0];
	            if ((v3_0 < 65) || (v3_0 > 90)) {
	                v1_0++;
	            } else {
	                byte[] v0_7 = ((byte[]) this.b.clone());
	                byte v2_0 = (v1_0 + 1);
	                v0_7[v1_0] = ((byte) (v3_0 + 32));
	                int v1_1 = v2_0;
	                while (v1_1 < v0_7.length) {
	                    byte v2_2 = v0_7[v1_1];
	                    if ((v2_2 >= 65) && (v2_2 <= 90)) {
	                        v0_7[v1_1] = ((byte) (v2_2 + 32));
	                    }
	                    v1_1++;
	                }
	                this = new dke;
	                this(v0_7);
	                break;
	            }
	        }
	        return this;
	    }
	
	
	    public final byte[] d()
	    {
	        return ((byte[]) this.b.clone());
	    }
	
	
	    public boolean equals(Object p6)
	    {
	        int v0_8;
	        if (p6 != this) {
	            if (((p6 instanceof dke)) && (((dke) p6).b.length == this.b.length)) {
	                int v0_7;
	                int v0_5 = this.b;
	                int v3_3 = this.b.length;
	                if (((((dke) p6).b.length - v3_3) < 0) || (((v0_5.length - v3_3) < 0) || (!dky.a(((dke) p6).b, 0, v0_5, 0, v3_3)))) {
	                    v0_7 = 0;
	                } else {
	                    v0_7 = 1;
	                }
	                if (v0_7 != 0) {
	                    v0_8 = 1;
	                    return v0_8;
	                }
	            }
	            v0_8 = 0;
	        } else {
	            v0_8 = 1;
	        }
	        return v0_8;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_0 = this.d;
	        if (v0_0 == 0) {
	            v0_0 = java.util.Arrays.hashCode(this.b);
	            this.d = v0_0;
	        }
	        return v0_0;
	    }
	
	
	    public String toString()
	    {
	        String v0_5;
	        if (this.b.length != 0) {
	            if (this.b.length > 16) {
	                Object[] v1_1 = new Object[2];
	                v1_1[0] = Integer.valueOf(this.b.length);
	                v1_1[1] = this.b("MD5").b();
	                v0_5 = String.format("ByteString[size=%s md5=%s]", v1_1);
	            } else {
	                Object[] v1_2 = new Object[2];
	                v1_2[0] = Integer.valueOf(this.b.length);
	                v1_2[1] = this.b();
	                v0_5 = String.format("ByteString[size=%s data=%s]", v1_2);
	            }
	        } else {
	            v0_5 = "ByteString[size=0]";
	        }
	        return v0_5;
	    }
	
