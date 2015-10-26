	private static Ljava.lang.Object d
	private static  e
	private static Ljava.lang.Object f
	private static  g
	 I a
	 Ljava.lang.Object b
	  c
	
	    public ep()
	    {
	        this.a = ef.a;
	        this.b = ef.b;
	        this.c = 0;
	        return;
	    }
	
	
	    public ep(int p2)
	    {
	        this.a(10);
	        this.c = 0;
	        return;
	    }
	
	
	    private int a()
	    {
	        int v0_1;
	        Object v2_0 = this.c;
	        if (v2_0 != null) {
	            v0_1 = ef.a(this.a, v2_0, 0);
	            if ((v0_1 >= 0) && (this.b[(v0_1 << 1)] != null)) {
	                int v1_3 = (v0_1 + 1);
	                while ((v1_3 < v2_0) && (this.a[v1_3] == 0)) {
	                    if (this.b[(v1_3 << 1)] != null) {
	                        v1_3++;
	                    } else {
	                        v0_1 = v1_3;
	                    }
	                }
	                v0_1--;
	                while ((v0_1 >= 0) && (this.a[v0_1] == 0)) {
	                    if (this.b[(v0_1 << 1)] != null) {
	                        v0_1--;
	                    }
	                }
	                v0_1 = (v1_3 ^ -1);
	            }
	        } else {
	            v0_1 = -1;
	        }
	        return v0_1;
	    }
	
	
	    private int a(Object p6, int p7)
	    {
	        int v0_1;
	        boolean v2_0 = this.c;
	        if (v2_0) {
	            v0_1 = ef.a(this.a, v2_0, p7);
	            if ((v0_1 >= 0) && (!p6.equals(this.b[(v0_1 << 1)]))) {
	                int v1_3 = (v0_1 + 1);
	                while ((v1_3 < v2_0) && (this.a[v1_3] == p7)) {
	                    if (!p6.equals(this.b[(v1_3 << 1)])) {
	                        v1_3++;
	                    } else {
	                        v0_1 = v1_3;
	                    }
	                }
	                v0_1--;
	                while ((v0_1 >= 0) && (this.a[v0_1] == p7)) {
	                    if (!p6.equals(this.b[(v0_1 << 1)])) {
	                        v0_1--;
	                    }
	                }
	                v0_1 = (v1_3 ^ -1);
	            }
	        } else {
	            v0_1 = -1;
	        }
	        return v0_1;
	    }
	
	
	    static void a(int[] p4, Object[] p5, int p6)
	    {
	        try {
	            if (p4.length != 8) {
	                if (p4.length == 4) {
	                    try {
	                        if (ep.e < 10) {
	                            p5[0] = ep.d;
	                            p5[1] = p4;
	                            int v0_6 = ((p6 << 1) - 1);
	                            while (v0_6 >= 2) {
	                                p5[v0_6] = 0;
	                                v0_6--;
	                            }
	                            ep.d = p5;
	                            ep.e = (ep.e + 1);
	                        }
	                    } catch (int v0_9) {
	                        throw v0_9;
	                    }
	                }
	            } else {
	                if (ep.g < 10) {
	                    p5[0] = ep.f;
	                    p5[1] = p4;
	                    int v0_14 = ((p6 << 1) - 1);
	                    while (v0_14 >= 2) {
	                        p5[v0_14] = 0;
	                        v0_14--;
	                    }
	                    ep.f = p5;
	                    ep.g = (ep.g + 1);
	                }
	            }
	        } catch (int v0_17) {
	            throw v0_17;
	        }
	        return;
	    }
	
	
	    public final int a(Object p2)
	    {
	        int v0_1;
	        if (p2 != null) {
	            v0_1 = this.a(p2, p2.hashCode());
	        } else {
	            v0_1 = this.a();
	        }
	        return v0_1;
	    }
	
	
	    public final Object a(int p4, Object p5)
	    {
	        int v0_1 = ((p4 << 1) + 1);
	        Object v1_1 = this.b[v0_1];
	        this.b[v0_1] = p5;
	        return v1_1;
	    }
	
	
	    void a(int p6)
	    {
	        if (p6 != 8) {
	            if (p6 != 4) {
	                int v0_14 = new int[p6];
	                this.a = v0_14;
	                int v0_16 = new Object[(p6 << 1)];
	                this.b = v0_16;
	            } else {
	                try {
	                    if (ep.d == null) {
	                    } else {
	                        Object[] v2_0 = ep.d;
	                        this.b = v2_0;
	                        ep.d = ((Object[]) v2_0[0]);
	                        this.a = ((int[]) v2_0[1]);
	                        v2_0[1] = 0;
	                        v2_0[0] = 0;
	                        ep.e = (ep.e - 1);
	                    }
	                } catch (int v0_12) {
	                    throw v0_12;
	                }
	            }
	        } else {
	            if (ep.f == null) {
	            } else {
	                Object[] v2_1 = ep.f;
	                this.b = v2_1;
	                ep.f = ((Object[]) v2_1[0]);
	                this.a = ((int[]) v2_1[1]);
	                v2_1[1] = 0;
	                v2_1[0] = 0;
	                ep.g = (ep.g - 1);
	            }
	        }
	        return;
	    }
	
	
	    final int b(Object p5)
	    {
	        int v0_1;
	        int v0_0 = 1;
	        int v1_1 = (this.c << 1);
	        Object[] v2 = this.b;
	        if (p5 != null) {
	            while (v0_0 < v1_1) {
	                if (!p5.equals(v2[v0_0])) {
	                    v0_0 += 2;
	                } else {
	                    v0_1 = (v0_0 >> 1);
	                }
	            }
	            v0_1 = -1;
	        } else {
	            while (v0_0 < v1_1) {
	                if (v2[v0_0] != null) {
	                    v0_0 += 2;
	                } else {
	                    v0_1 = (v0_0 >> 1);
	                }
	            }
	        }
	        return v0_1;
	    }
	
	
	    public final Object b(int p3)
	    {
	        return this.b[(p3 << 1)];
	    }
	
	
	    public final Object c(int p3)
	    {
	        return this.b[((p3 << 1) + 1)];
	    }
	
	
	    public void clear()
	    {
	        if (this.c != 0) {
	            ep.a(this.a, this.b, this.c);
	            this.a = ef.a;
	            this.b = ef.b;
	            this.c = 0;
	        }
	        return;
	    }
	
	
	    public boolean containsKey(Object p2)
	    {
	        int v0_1;
	        if (this.a(p2) < 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean containsValue(Object p2)
	    {
	        int v0_1;
	        if (this.b(p2) < 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final Object d(int p8)
	    {
	        int v0_0 = 8;
	        Object v1_1 = this.b[((p8 << 1) + 1)];
	        if (this.c > 1) {
	            if ((this.a.length <= 8) || (this.c >= (this.a.length / 3))) {
	                this.c = (this.c - 1);
	                if (p8 < this.c) {
	                    System.arraycopy(this.a, (p8 + 1), this.a, p8, (this.c - p8));
	                    System.arraycopy(this.b, ((p8 + 1) << 1), this.b, (p8 << 1), ((this.c - p8) << 1));
	                }
	                this.b[(this.c << 1)] = 0;
	                this.b[((this.c << 1) + 1)] = 0;
	            } else {
	                if (this.c > 8) {
	                    v0_0 = (this.c + (this.c >> 1));
	                }
	                Object[] v2_17 = this.a;
	                Object[] v3_6 = this.b;
	                this.a(v0_0);
	                this.c = (this.c - 1);
	                if (p8 > 0) {
	                    System.arraycopy(v2_17, 0, this.a, 0, p8);
	                    System.arraycopy(v3_6, 0, this.b, 0, (p8 << 1));
	                }
	                if (p8 < this.c) {
	                    System.arraycopy(v2_17, (p8 + 1), this.a, p8, (this.c - p8));
	                    System.arraycopy(v3_6, ((p8 + 1) << 1), this.b, (p8 << 1), ((this.c - p8) << 1));
	                }
	            }
	        } else {
	            ep.a(this.a, this.b, this.c);
	            this.a = ef.a;
	            this.b = ef.b;
	            this.c = 0;
	        }
	        return v1_1;
	    }
	
	
	    public boolean equals(Object p7)
	    {
	        int v0 = 1;
	        if (this != p7) {
	            if (!(p7 instanceof java.util.Map)) {
	                v0 = 0;
	            } else {
	                if (this.size() == ((java.util.Map) p7).size()) {
	                    int v2_2 = 0;
	                    try {
	                        while (v2_2 < this.c) {
	                            boolean v3_2 = this.b(v2_2);
	                            Object v4 = this.c(v2_2);
	                            Object v5 = ((java.util.Map) p7).get(v3_2);
	                            if (v4 != null) {
	                                if (!v4.equals(v5)) {
	                                    v0 = 0;
	                                    break;
	                                }
	                            } else {
	                                if ((v5 != null) || (!((java.util.Map) p7).containsKey(v3_2))) {
	                                    v0 = 0;
	                                    break;
	                                }
	                            }
	                            v2_2++;
	                        }
	                    } catch (int v0) {
	                        v0 = 0;
	                    } catch (int v0) {
	                        v0 = 0;
	                    }
	                } else {
	                    v0 = 0;
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public Object get(Object p3)
	    {
	        int v0_1;
	        int v0_0 = this.a(p3);
	        if (v0_0 < 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.b[((v0_0 << 1) + 1)];
	        }
	        return v0_1;
	    }
	
	
	    public int hashCode()
	    {
	        int[] v5 = this.a;
	        Object[] v6 = this.b;
	        int v7 = this.c;
	        int v2 = 1;
	        int v3 = 0;
	        int v4 = 0;
	        while (v3 < v7) {
	            int v0_2;
	            int v0_1 = v6[v2];
	            int v8 = v5[v3];
	            if (v0_1 != 0) {
	                v0_2 = v0_1.hashCode();
	            } else {
	                v0_2 = 0;
	            }
	            v4 += (v0_2 ^ v8);
	            v3++;
	            v2 += 2;
	        }
	        return v4;
	    }
	
	
	    public boolean isEmpty()
	    {
	        int v0_1;
	        if (this.c > 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public Object put(Object p8, Object p9)
	    {
	        int v3;
	        int v2_0;
	        int v0_0 = 8;
	        if (p8 != null) {
	            v3 = p8.hashCode();
	            v2_0 = this.a(p8, v3);
	        } else {
	            v2_0 = this.a();
	            v3 = 0;
	        }
	        int v0_15;
	        if (v2_0 < 0) {
	            int v2_1 = (v2_0 ^ -1);
	            if (this.c >= this.a.length) {
	                if (this.c < 8) {
	                    if (this.c < 4) {
	                        v0_0 = 4;
	                    }
	                } else {
	                    v0_0 = (this.c + (this.c >> 1));
	                }
	                int[] v1_3 = this.a;
	                Object[] v5_3 = this.b;
	                this.a(v0_0);
	                if (this.a.length > 0) {
	                    System.arraycopy(v1_3, 0, this.a, 0, v1_3.length);
	                    System.arraycopy(v5_3, 0, this.b, 0, v5_3.length);
	                }
	                ep.a(v1_3, v5_3, this.c);
	            }
	            if (v2_1 < this.c) {
	                System.arraycopy(this.a, v2_1, this.a, (v2_1 + 1), (this.c - v2_1));
	                System.arraycopy(this.b, (v2_1 << 1), this.b, ((v2_1 + 1) << 1), ((this.c - v2_1) << 1));
	            }
	            this.a[v2_1] = v3;
	            this.b[(v2_1 << 1)] = p8;
	            this.b[((v2_1 << 1) + 1)] = p9;
	            this.c = (this.c + 1);
	            v0_15 = 0;
	        } else {
	            int[] v1_9 = ((v2_0 << 1) + 1);
	            v0_15 = this.b[v1_9];
	            this.b[v1_9] = p9;
	        }
	        return v0_15;
	    }
	
	
	    public Object remove(Object p2)
	    {
	        int v0_1;
	        int v0_0 = this.a(p2);
	        if (v0_0 < 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.d(v0_0);
	        }
	        return v0_1;
	    }
	
	
	    public int size()
	    {
	        return this.c;
	    }
	
	
	    public String toString()
	    {
	        int v0_6;
	        if (!this.isEmpty()) {
	            StringBuilder v1_1 = new StringBuilder((this.c * 28));
	            v1_1.append(123);
	            int v0_4 = 0;
	            while (v0_4 < this.c) {
	                if (v0_4 > 0) {
	                    v1_1.append(", ");
	                }
	                String v2_2 = this.b(v0_4);
	                if (v2_2 == this) {
	                    v1_1.append("(this Map)");
	                } else {
	                    v1_1.append(v2_2);
	                }
	                v1_1.append(61);
	                String v2_5 = this.c(v0_4);
	                if (v2_5 == this) {
	                    v1_1.append("(this Map)");
	                } else {
	                    v1_1.append(v2_5);
	                }
	                v0_4++;
	            }
	            v1_1.append(125);
	            v0_6 = v1_1.toString();
	        } else {
	            v0_6 = "{}";
	        }
	        return v0_6;
	    }
	
