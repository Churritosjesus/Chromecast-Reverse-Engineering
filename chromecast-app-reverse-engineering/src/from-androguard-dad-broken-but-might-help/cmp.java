	 cmn a
	 java.lang.Object b
	 java.util.List c
	
	    cmp()
	    {
	        this.c = new java.util.ArrayList();
	        return;
	    }
	
	
	    private byte[] c()
	    {
	        byte[] v0_1 = new byte[this.a()];
	        this.a(cmk.a(v0_1, 0, v0_1.length));
	        return v0_1;
	    }
	
	
	    final int a()
	    {
	        int v1_2;
	        if (this.b == null) {
	            java.util.Iterator v2 = this.c.iterator();
	            v1_2 = 0;
	            while (v2.hasNext()) {
	                int v0_3 = ((cmt) v2.next());
	                v1_2 = ((v0_3.b.length + (cmk.e(v0_3.a) + 0)) + v1_2);
	            }
	        } else {
	            v1_2 = this.a.a(this.b);
	        }
	        return v1_2;
	    }
	
	
	    final void a(cmk p4)
	    {
	        if (this.b == null) {
	            java.util.Iterator v1_0 = this.c.iterator();
	            while (v1_0.hasNext()) {
	                byte[] v0_4 = ((cmt) v1_0.next());
	                p4.d(v0_4.a);
	                p4.b(v0_4.b);
	            }
	        } else {
	            this.a.a(this.b, p4);
	        }
	        return;
	    }
	
	
	    public final cmp b()
	    {
	        int v1_0 = 0;
	        cmp v3_1 = new cmp();
	        try {
	            v3_1.a = this.a;
	        } catch (cms[] v0_48) {
	            throw new AssertionError(v0_48);
	        }
	        if (this.c != null) {
	            v3_1.c.addAll(this.c);
	        } else {
	            v3_1.c = 0;
	        }
	        if (this.b != null) {
	            if (!(this.b instanceof cms)) {
	                if (!(this.b instanceof byte[])) {
	                    if (!(this.b instanceof byte[][])) {
	                        if (!(this.b instanceof boolean[])) {
	                            if (!(this.b instanceof int[])) {
	                                if (!(this.b instanceof long[])) {
	                                    if (!(this.b instanceof float[])) {
	                                        if (!(this.b instanceof double[])) {
	                                            if ((this.b instanceof cms[])) {
	                                                cms[] v0_24 = ((cms[]) this.b);
	                                                cms[] v2_2 = new cms[v0_24.length];
	                                                v3_1.b = v2_2;
	                                                while (v1_0 < v0_24.length) {
	                                                    v2_2[v1_0] = v0_24[v1_0].d();
	                                                    v1_0++;
	                                                }
	                                            }
	                                        } else {
	                                            v3_1.b = ((double[]) this.b).clone();
	                                        }
	                                    } else {
	                                        v3_1.b = ((float[]) this.b).clone();
	                                    }
	                                } else {
	                                    v3_1.b = ((long[]) this.b).clone();
	                                }
	                            } else {
	                                v3_1.b = ((int[]) this.b).clone();
	                            }
	                        } else {
	                            v3_1.b = ((boolean[]) this.b).clone();
	                        }
	                    } else {
	                        cms[] v0_41 = ((byte[][]) this.b);
	                        cms v4_3 = new byte[][v0_41.length];
	                        v3_1.b = v4_3;
	                        cms[] v2_4 = 0;
	                        while (v2_4 < v0_41.length) {
	                            v4_3[v2_4] = ((byte[]) v0_41[v2_4].clone());
	                            v2_4++;
	                        }
	                    }
	                } else {
	                    v3_1.b = ((byte[]) this.b).clone();
	                }
	            } else {
	                v3_1.b = ((cms) this.b).d();
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
	            if ((p4 instanceof cmp)) {
	                if ((this.b == null) || (((cmp) p4).b == null)) {
	                    if ((this.c == null) || (((cmp) p4).c == null)) {
	                        try {
	                            v0_0 = java.util.Arrays.equals(this.c(), ((cmp) p4).c());
	                        } catch (boolean v0_4) {
	                            throw new IllegalStateException(v0_4);
	                        }
	                    } else {
	                        v0_0 = this.c.equals(((cmp) p4).c);
	                    }
	                } else {
	                    if (this.a == ((cmp) p4).a) {
	                        if (this.a.a.isArray()) {
	                            if (!(this.b instanceof byte[])) {
	                                if (!(this.b instanceof int[])) {
	                                    if (!(this.b instanceof long[])) {
	                                        if (!(this.b instanceof float[])) {
	                                            if (!(this.b instanceof double[])) {
	                                                if (!(this.b instanceof boolean[])) {
	                                                    v0_0 = java.util.Arrays.deepEquals(((Object[]) this.b), ((Object[]) ((cmp) p4).b));
	                                                } else {
	                                                    v0_0 = java.util.Arrays.equals(((boolean[]) this.b), ((boolean[]) ((cmp) p4).b));
	                                                }
	                                            } else {
	                                                v0_0 = java.util.Arrays.equals(((double[]) this.b), ((double[]) ((cmp) p4).b));
	                                            }
	                                        } else {
	                                            v0_0 = java.util.Arrays.equals(((float[]) this.b), ((float[]) ((cmp) p4).b));
	                                        }
	                                    } else {
	                                        v0_0 = java.util.Arrays.equals(((long[]) this.b), ((long[]) ((cmp) p4).b));
	                                    }
	                                } else {
	                                    v0_0 = java.util.Arrays.equals(((int[]) this.b), ((int[]) ((cmp) p4).b));
	                                }
	                            } else {
	                                v0_0 = java.util.Arrays.equals(((byte[]) this.b), ((byte[]) ((cmp) p4).b));
	                            }
	                        } else {
	                            v0_0 = this.b.equals(((cmp) p4).b);
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
	
