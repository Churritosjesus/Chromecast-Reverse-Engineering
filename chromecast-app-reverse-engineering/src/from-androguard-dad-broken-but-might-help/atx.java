	private synthetic auo a
	private synthetic atw b
	
	    atx(atw p1, auo p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final synthetic void a(Object p11)
	    {
	        if ((((dbs) p11) == null) || (((dbs) p11).a == null)) {
	            if (this.a != null) {
	                this.a.a(0);
	            }
	        } else {
	            int v0_6;
	            this.b.g = android.os.SystemClock.elapsedRealtime();
	            atw v4_1 = this.b;
	            dbr[] v5 = ((dbs) p11).a;
	            if (v5 != null) {
	                if (v4_1.a.size() == v5.length) {
	                    int v1_1 = 0;
	                    while (v1_1 < v4_1.a.size()) {
	                        int v0_13;
	                        int v0_9 = ((ast) v4_1.a.get(v1_1));
	                        long v6_0 = v5[v1_1];
	                        if (android.text.TextUtils.equals(v0_9.a, v6_0.a)) {
	                            if (android.text.TextUtils.equals(v0_9.b, v6_0.b)) {
	                                if (android.text.TextUtils.equals(v0_9.c, v6_0.c)) {
	                                    int v0_12;
	                                    int v0_10 = Long.valueOf(v0_9.d);
	                                    long v6_1 = v6_0.d;
	                                    if ((v0_10 != 0) || (v6_1 != 0)) {
	                                        if ((v0_10 != 0) && (v6_1 != 0)) {
	                                            if (v0_10.longValue() != v6_1.longValue()) {
	                                                v0_12 = 0;
	                                            } else {
	                                                v0_12 = 1;
	                                            }
	                                        } else {
	                                            v0_12 = 0;
	                                        }
	                                    } else {
	                                        v0_12 = 1;
	                                    }
	                                    if (v0_12 != 0) {
	                                        v0_13 = 1;
	                                    } else {
	                                        v0_13 = 0;
	                                    }
	                                } else {
	                                    v0_13 = 0;
	                                }
	                            } else {
	                                v0_13 = 0;
	                            }
	                        } else {
	                            v0_13 = 0;
	                        }
	                        if (v0_13 != 0) {
	                            v1_1++;
	                        } else {
	                            v0_6 = 0;
	                        }
	                    }
	                    v0_6 = 1;
	                } else {
	                    v0_6 = 0;
	                }
	            } else {
	                v0_6 = 0;
	            }
	            if (v0_6 == 0) {
	                this.b.a(((dbs) p11));
	            }
	            if ((atw.a(this.b)) && (v0_6 != 0)) {
	            } else {
	                atw.a(this.b, 1);
	                int v0_18 = new Object[1];
	                v0_18[0] = Integer.valueOf(atw.b(this.b).size());
	                if (this.a == null) {
	                } else {
	                    this.a.a(1);
	                }
	            }
	        }
	        return;
	    }
	
