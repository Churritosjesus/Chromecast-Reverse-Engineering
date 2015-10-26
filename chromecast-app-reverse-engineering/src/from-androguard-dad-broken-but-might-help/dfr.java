	 java.lang.String a
	 java.lang.String b
	 java.lang.String c
	 java.lang.String d
	  e
	final java.util.List f
	 java.util.List g
	 java.lang.String h
	
	    public dfr()
	    {
	        this.b = "";
	        this.c = "";
	        this.e = -1;
	        this.f = new java.util.ArrayList();
	        this.f.add("");
	        return;
	    }
	
	
	    private static String a(String p3)
	    {
	        IllegalArgumentException v0 = 0;
	        try {
	            IllegalArgumentException v1_1 = java.net.IDN.toASCII(p3).toLowerCase(java.util.Locale.US);
	        } catch (IllegalArgumentException v1) {
	            return v0;
	        }
	        if (!v1_1.isEmpty()) {
	            v0 = v1_1;
	            return v0;
	        } else {
	            return v0;
	        }
	    }
	
	
	    static int b(String p3, int p4, int p5)
	    {
	        int v0 = p4;
	        while (v0 < p5) {
	            switch (p3.charAt(v0)) {
	                case 58:
	                    break;
	                case 91:
	                    do {
	                        v0++;
	                    } while((v0 < p5) && (p3.charAt(v0) != 93));
	                    v0++;
	                    break;
	                default:
	            }
	            return v0;
	        }
	        v0 = p5;
	        return v0;
	    }
	
	
	    static String c(String p5, int p6, int p7)
	    {
	        java.net.InetAddress v0 = 0;
	        java.net.InetAddress v1_0 = dfq.a(p5, p6, p7);
	        if ((!v1_0.startsWith("[")) || (!v1_0.endsWith("]"))) {
	            java.net.InetAddress v1_1 = dfr.a(v1_0);
	            if (v1_1 != null) {
	                int v2_4 = v1_1.length();
	                if (dfq.a(v1_1, 0, v2_4, "\u0000\t\n\r #%/:?@[\\]") == v2_4) {
	                    v0 = v1_1;
	                }
	            }
	        } else {
	            java.net.InetAddress v1_2 = dfr.e(v1_0, 1, (v1_0.length() - 1));
	            if (v1_2 != null) {
	                v0 = v1_2.getHostAddress();
	            }
	        }
	        return v0;
	    }
	
	
	    static int d(String p7, int p8, int p9)
	    {
	        try {
	            int v0_2 = Integer.parseInt(dfq.a(p7, p8, p9, "", 0, 0));
	        } catch (int v0) {
	            v0_2 = -1;
	            return v0_2;
	        }
	        if ((v0_2 <= 0) || (v0_2 > 65535)) {
	            v0_2 = -1;
	            return v0_2;
	        } else {
	            return v0_2;
	        }
	    }
	
	
	    private static java.net.InetAddress e(String p11, int p12, int p13)
	    {
	        byte[] v7 = new byte[16];
	        int v2_0 = 0;
	        int v1 = -1;
	        int v4_0 = -1;
	        int v0_1 = 1;
	        while (v0_1 < p13) {
	            if (v2_0 != 16) {
	                if (((v0_1 + 2) > p13) || (!p11.regionMatches(v0_1, "::", 0, 2))) {
	                    if (v2_0 != 0) {
	                        if (!p11.regionMatches(v0_1, ":", 0, 1)) {
	                            if (!p11.regionMatches(v0_1, ".", 0, 1)) {
	                                int v0_3 = 0;
	                                return v0_3;
	                            } else {
	                                byte v6_3 = (v2_0 - 2);
	                                int v0_4 = v4_0;
	                                int v5_3 = v6_3;
	                                while (v0_4 < p13) {
	                                    if (v5_3 != 16) {
	                                        if (v5_3 != v6_3) {
	                                            if (p11.charAt(v0_4) == 46) {
	                                                v0_4++;
	                                            } else {
	                                                int v0_6 = 0;
	                                                if (v0_6 != 0) {
	                                                    v2_0 += 2;
	                                                    if (v2_0 != 16) {
	                                                        if (v1 != -1) {
	                                                            System.arraycopy(v7, v1, v7, (16 - (v2_0 - v1)), (v2_0 - v1));
	                                                            java.util.Arrays.fill(v7, v1, ((16 - v2_0) + v1), 0);
	                                                        } else {
	                                                            v0_3 = 0;
	                                                            return v0_3;
	                                                        }
	                                                    }
	                                                    try {
	                                                        v0_3 = java.net.InetAddress.getByAddress(v7);
	                                                    } catch (int v0) {
	                                                        throw new AssertionError();
	                                                    }
	                                                    return v0_3;
	                                                } else {
	                                                    v0_3 = 0;
	                                                    return v0_3;
	                                                }
	                                                int v3_14 = 0;
	                                                int v4_3 = v0_1;
	                                                while (v4_3 < p13) {
	                                                    int v5_5 = dfq.a(p11.charAt(v4_3));
	                                                    if (v5_5 == -1) {
	                                                        break;
	                                                    }
	                                                    v3_14 = ((v3_14 << 4) + v5_5);
	                                                    v4_3++;
	                                                }
	                                                int v5_6 = (v4_3 - v0_1);
	                                                if ((v5_6 != 0) && (v5_6 <= 4)) {
	                                                    int v5_7 = (v2_0 + 1);
	                                                    v7[v2_0] = ((byte) (v3_14 >> 8));
	                                                    v2_0 = (v5_7 + 1);
	                                                    v7[v5_7] = ((byte) v3_14);
	                                                    v4_0 = v0_1;
	                                                    v0_1 = v4_3;
	                                                } else {
	                                                    v0_3 = 0;
	                                                }
	                                                return v0_3;
	                                            }
	                                        }
	                                        int v3_9 = 0;
	                                        int v4_2 = v0_4;
	                                        while (v4_2 < p13) {
	                                            int v8_0 = p11.charAt(v4_2);
	                                            if ((v8_0 < 48) || (v8_0 > 57)) {
	                                                break;
	                                            }
	                                            if ((v3_9 != 0) || (v0_4 == v4_2)) {
	                                                v3_9 = (((v3_9 * 10) + v8_0) - 48);
	                                                if (v3_9 <= 255) {
	                                                    v4_2++;
	                                                } else {
	                                                    v0_6 = 0;
	                                                }
	                                            } else {
	                                                v0_6 = 0;
	                                            }
	                                        }
	                                        if ((v4_2 - v0_4) != 0) {
	                                            int v0_8 = (v5_3 + 1);
	                                            v7[v5_3] = ((byte) v3_9);
	                                            v5_3 = v0_8;
	                                            v0_4 = v4_2;
	                                        } else {
	                                            v0_6 = 0;
	                                        }
	                                    } else {
	                                        v0_6 = 0;
	                                    }
	                                }
	                                if (v5_3 == (v6_3 + 4)) {
	                                    v0_6 = 1;
	                                } else {
	                                    v0_6 = 0;
	                                }
	                            }
	                        } else {
	                            v0_1++;
	                        }
	                    }
	                } else {
	                    if (v1 == -1) {
	                        v0_1 += 2;
	                        v1 = (v2_0 + 2);
	                        if (v0_1 != p13) {
	                            v2_0 = v1;
	                        } else {
	                            v2_0 = v1;
	                            break;
	                        }
	                    } else {
	                        v0_3 = 0;
	                        return v0_3;
	                    }
	                }
	            } else {
	                v0_3 = 0;
	            }
	            return v0_3;
	        }
	    }
	
	
	    final int a()
	    {
	        int v0_2;
	        if (this.e == -1) {
	            v0_2 = dfq.a(this.a);
	        } else {
	            v0_2 = this.e;
	        }
	        return v0_2;
	    }
	
	
	    void a(String p8, int p9, int p10)
	    {
	        if (p9 != p10) {
	            java.util.List v0_0 = p8.charAt(p9);
	            if ((v0_0 != 47) && (v0_0 != 92)) {
	                this.f.set((this.f.size() - 1), "");
	            } else {
	                this.f.clear();
	                this.f.add("");
	                p9++;
	            }
	            String v1_6 = p9;
	            while (v1_6 < p10) {
	                int v6;
	                int v2_1 = dfq.a(p8, v1_6, p10, "/\\");
	                if (v2_1 >= p10) {
	                    v6 = 0;
	                } else {
	                    v6 = 1;
	                }
	                java.util.List v0_10;
	                String v1_7 = dfq.a(p8, v1_6, v2_1, " \"<>^`{}|/\\?#", 1, 0);
	                if ((!v1_7.equals(".")) && (!v1_7.equalsIgnoreCase("%2e"))) {
	                    v0_10 = 0;
	                } else {
	                    v0_10 = 1;
	                }
	                if (v0_10 == null) {
	                    if ((!v1_7.equals("..")) && ((!v1_7.equalsIgnoreCase("%2e.")) && ((!v1_7.equalsIgnoreCase(".%2e")) && (!v1_7.equalsIgnoreCase("%2e%2e"))))) {
	                        java.util.List v0_19 = 0;
	                    } else {
	                        v0_19 = 1;
	                    }
	                    if (v0_19 == null) {
	                        if (!((String) this.f.get((this.f.size() - 1))).isEmpty()) {
	                            this.f.add(v1_7);
	                        } else {
	                            this.f.set((this.f.size() - 1), v1_7);
	                        }
	                        if (v6 != 0) {
	                            this.f.add("");
	                        }
	                    } else {
	                        if ((!((String) this.f.remove((this.f.size() - 1))).isEmpty()) || (this.f.isEmpty())) {
	                            this.f.add("");
	                        } else {
	                            this.f.set((this.f.size() - 1), "");
	                        }
	                    }
	                }
	                if (v6 != 0) {
	                    v2_1++;
	                }
	                v1_6 = v2_1;
	            }
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder();
	        v0_1.append(this.a);
	        v0_1.append("://");
	        if ((!this.b.isEmpty()) || (!this.c.isEmpty())) {
	            v0_1.append(this.b);
	            if (!this.c.isEmpty()) {
	                v0_1.append(58);
	                v0_1.append(this.c);
	            }
	            v0_1.append(64);
	        }
	        if (this.d.indexOf(58) == -1) {
	            v0_1.append(this.d);
	        } else {
	            v0_1.append(91);
	            v0_1.append(this.d);
	            v0_1.append(93);
	        }
	        String v1_17 = this.a();
	        if (v1_17 != dfq.a(this.a)) {
	            v0_1.append(58);
	            v0_1.append(v1_17);
	        }
	        dfq.a(v0_1, this.f);
	        if (this.g != null) {
	            v0_1.append(63);
	            dfq.b(v0_1, this.g);
	        }
	        if (this.h != null) {
	            v0_1.append(35);
	            v0_1.append(this.h);
	        }
	        return v0_1.toString();
	    }
	
