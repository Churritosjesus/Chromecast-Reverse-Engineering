	 java.util.List a
	private dh b
	private java.lang.Object c
	
	    det()
	    {
	        this.a = new java.util.ArrayList();
	        return;
	    }
	
	
	    private byte[] c()
	    {
	        byte[] v0_1 = new byte[this.a()];
	        this.a(dep.a(v0_1, 0, v0_1.length));
	        return v0_1;
	    }
	
	
	    final int a()
	    {
	        int v1_2;
	        if (this.c == null) {
	            java.util.Iterator v2 = this.a.iterator();
	            v1_2 = 0;
	            while (v2.hasNext()) {
	                int v0_3 = ((dex) v2.next());
	                v1_2 = ((v0_3.b.length + (dep.d(v0_3.a) + 0)) + v1_2);
	            }
	        } else {
	            v1_2 = this.b.a(this.c);
	        }
	        return v1_2;
	    }
	
	
	    final void a(dep p6)
	    {
	        if (this.c == null) {
	            int v1_0 = this.a.iterator();
	            while (v1_0.hasNext()) {
	                deq v0_4 = ((dex) v1_0.next());
	                p6.c(v0_4.a);
	                deq v0_5 = v0_4.b;
	                int v2_1 = v0_5.length;
	                if (p6.a.remaining() < v2_1) {
	                    throw new deq(p6.a.position(), p6.a.limit());
	                } else {
	                    p6.a.put(v0_5, 0, v2_1);
	                }
	            }
	        } else {
	            this.b.a(this.c, p6);
	        }
	        return;
	    }
	
	
	    public final det b()
	    {
	        int v1_0 = 0;
	        det v3_1 = new det();
	        try {
	            v3_1.b = this.b;
	        } catch (dew[] v0_48) {
	            throw new AssertionError(v0_48);
	        }
	        if (this.a != null) {
	            v3_1.a.addAll(this.a);
	        } else {
	            v3_1.a = 0;
	        }
	        if (this.c != null) {
	            if (!(this.c instanceof dew)) {
	                if (!(this.c instanceof byte[])) {
	                    if (!(this.c instanceof byte[][])) {
	                        if (!(this.c instanceof boolean[])) {
	                            if (!(this.c instanceof int[])) {
	                                if (!(this.c instanceof long[])) {
	                                    if (!(this.c instanceof float[])) {
	                                        if (!(this.c instanceof double[])) {
	                                            if ((this.c instanceof dew[])) {
	                                                dew[] v0_24 = ((dew[]) this.c);
	                                                dew[] v2_2 = new dew[v0_24.length];
	                                                v3_1.c = v2_2;
	                                                while (v1_0 < v0_24.length) {
	                                                    v2_2[v1_0] = v0_24[v1_0].c();
	                                                    v1_0++;
	                                                }
	                                            }
	                                        } else {
	                                            v3_1.c = ((double[]) this.c).clone();
	                                        }
	                                    } else {
	                                        v3_1.c = ((float[]) this.c).clone();
	                                    }
	                                } else {
	                                    v3_1.c = ((long[]) this.c).clone();
	                                }
	                            } else {
	                                v3_1.c = ((int[]) this.c).clone();
	                            }
	                        } else {
	                            v3_1.c = ((boolean[]) this.c).clone();
	                        }
	                    } else {
	                        dew[] v0_41 = ((byte[][]) this.c);
	                        dew v4_3 = new byte[][v0_41.length];
	                        v3_1.c = v4_3;
	                        dew[] v2_4 = 0;
	                        while (v2_4 < v0_41.length) {
	                            v4_3[v2_4] = ((byte[]) v0_41[v2_4].clone());
	                            v2_4++;
	                        }
	                    }
	                } else {
	                    v3_1.c = ((byte[]) this.c).clone();
	                }
	            } else {
	                v3_1.c = ((dew) this.c).c();
	            }
	        }
	        return v3_1;
	    }
	
	
	    public final synthetic Object clone()
	    {
	        return this.b();
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0_0 = 0;
	        if (p4 != this) {
	            if ((p4 instanceof det)) {
	                if ((this.c == null) || (((det) p4).c == null)) {
	                    if ((this.a == null) || (((det) p4).a == null)) {
	                        try {
	                            v0_0 = java.util.Arrays.equals(this.c(), ((det) p4).c());
	                        } catch (boolean v0_4) {
	                            throw new IllegalStateException(v0_4);
	                        }
	                    } else {
	                        v0_0 = this.a.equals(((det) p4).a);
	                    }
	                } else {
	                    if (this.b == ((det) p4).b) {
	                        if (0.isArray()) {
	                            if (!(this.c instanceof byte[])) {
	                                if (!(this.c instanceof int[])) {
	                                    if (!(this.c instanceof long[])) {
	                                        if (!(this.c instanceof float[])) {
	                                            if (!(this.c instanceof double[])) {
	                                                if (!(this.c instanceof boolean[])) {
	                                                    v0_0 = java.util.Arrays.deepEquals(((Object[]) this.c), ((Object[]) ((det) p4).c));
	                                                } else {
	                                                    v0_0 = java.util.Arrays.equals(((boolean[]) this.c), ((boolean[]) ((det) p4).c));
	                                                }
	                                            } else {
	                                                v0_0 = java.util.Arrays.equals(((double[]) this.c), ((double[]) ((det) p4).c));
	                                            }
	                                        } else {
	                                            v0_0 = java.util.Arrays.equals(((float[]) this.c), ((float[]) ((det) p4).c));
	                                        }
	                                    } else {
	                                        v0_0 = java.util.Arrays.equals(((long[]) this.c), ((long[]) ((det) p4).c));
	                                    }
	                                } else {
	                                    v0_0 = java.util.Arrays.equals(((int[]) this.c), ((int[]) ((det) p4).c));
	                                }
	                            } else {
	                                v0_0 = java.util.Arrays.equals(((byte[]) this.c), ((byte[]) ((det) p4).c));
	                            }
	                        } else {
	                            v0_0 = this.c.equals(((det) p4).c);
	                        }
	                    }
	                }
	            }
	        } else {
	            v0_0 = 1;
	        }
	        return v0_0;
	    }
	
	
	    public final int hashCode()
	    {
	        try {
	            return (java.util.Arrays.hashCode(this.c()) + 527);
	        } catch (java.io.IOException v0_3) {
	            throw new IllegalStateException(v0_3);
	        }
	    }
	
