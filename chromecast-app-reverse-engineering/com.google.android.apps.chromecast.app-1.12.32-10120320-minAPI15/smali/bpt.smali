.class final Lbpt;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/util/Map;

.field private synthetic b:Z

.field private synthetic c:Ljava/lang/String;

.field private synthetic d:J

.field private synthetic e:Z

.field private synthetic f:Z

.field private synthetic g:Ljava/lang/String;

.field private synthetic h:Lbps;


# direct methods
.method constructor <init>(Lbps;Ljava/util/Map;ZLjava/lang/String;JZZLjava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lbpt;->h:Lbps;

    iput-object p2, p0, Lbpt;->a:Ljava/util/Map;

    iput-boolean p3, p0, Lbpt;->b:Z

    iput-object p4, p0, Lbpt;->c:Ljava/lang/String;

    iput-wide p5, p0, Lbpt;->d:J

    iput-boolean p7, p0, Lbpt;->e:Z

    iput-boolean p8, p0, Lbpt;->f:Z

    iput-object p9, p0, Lbpt;->g:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .prologue
    const/4 v11, 0x1

    const/4 v1, 0x0

    const-wide/16 v7, 0x0

    .line 0
    iget-object v0, p0, Lbpt;->h:Lbps;

    .line 1000
    iget-object v0, v0, Lbps;->c:Lbpu;

    .line 0
    invoke-virtual {v0}, Lbpu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "sc"

    const-string v3, "start"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "cid"

    iget-object v3, p0, Lbpt;->h:Lbps;

    .line 2000
    iget-object v3, v3, Lbqz;->d:Lbrb;

    invoke-virtual {v3}, Lbrb;->d()Lbpo;

    move-result-object v3

    .line 3000
    const-string v4, "getClientId can not be called from the main thread"

    invoke-static {v4}, La;->h(Ljava/lang/String;)V

    .line 4000
    iget-object v3, v3, Lbpd;->a:Lbrb;

    .line 3000
    invoke-virtual {v3}, Lbrb;->g()Lbrt;

    move-result-object v3

    invoke-virtual {v3}, Lbrt;->b()Ljava/lang/String;

    move-result-object v3

    .line 0
    invoke-static {v0, v2, v3}, Lbqs;->b(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "&sf"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "&sf"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    invoke-static {v0, v2, v3}, Lbqs;->a(Ljava/lang/String;D)D

    move-result-wide v2

    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v4, "&cid"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v3, v0}, Lbqs;->a(DLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbpt;->h:Lbps;

    const-string v1, "Sampling enabled. Hit sampled out. sample rate"

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbps;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lbpt;->h:Lbps;

    invoke-static {v0}, Lbps;->a(Lbps;)Lbqf;

    move-result-object v0

    iget-boolean v2, p0, Lbpt;->b:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    const-string v3, "ate"

    invoke-virtual {v0}, Lbqf;->b()Z

    move-result v4

    invoke-static {v2, v3, v4}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Z)V

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    const-string v3, "adid"

    invoke-virtual {v0}, Lbqf;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v0}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lbpt;->h:Lbps;

    invoke-static {v0}, Lbps;->b(Lbps;)Lbrm;

    move-result-object v0

    invoke-virtual {v0}, Lbrm;->b()Lcpe;

    move-result-object v0

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    const-string v3, "an"

    .line 5000
    iget-object v4, v0, Lcpe;->a:Ljava/lang/String;

    .line 0
    invoke-static {v2, v3, v4}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    const-string v3, "av"

    .line 6000
    iget-object v4, v0, Lcpe;->b:Ljava/lang/String;

    .line 0
    invoke-static {v2, v3, v4}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    const-string v3, "aid"

    .line 7000
    iget-object v4, v0, Lcpe;->c:Ljava/lang/String;

    .line 0
    invoke-static {v2, v3, v4}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    const-string v3, "aiid"

    .line 8000
    iget-object v0, v0, Lcpe;->d:Ljava/lang/String;

    .line 0
    invoke-static {v2, v3, v0}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "v"

    const-string v3, "1"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "_v"

    const-string v3, "ma4.5.0"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "ul"

    iget-object v3, p0, Lbpt;->h:Lbps;

    invoke-static {v3}, Lbps;->c(Lbps;)Lbsd;

    move-result-object v3

    invoke-virtual {v3}, Lbsd;->b()Lcpg;

    move-result-object v3

    .line 9000
    iget-object v3, v3, Lcpg;->a:Ljava/lang/String;

    .line 0
    invoke-static {v0, v2, v3}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "sr"

    iget-object v3, p0, Lbpt;->h:Lbps;

    invoke-static {v3}, Lbps;->d(Lbps;)Lbsd;

    move-result-object v3

    invoke-virtual {v3}, Lbsd;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lbpt;->c:Ljava/lang/String;

    const-string v2, "transaction"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lbpt;->c:Ljava/lang/String;

    const-string v2, "item"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_2
    move v0, v11

    :goto_2
    if-nez v0, :cond_5

    iget-object v0, p0, Lbpt;->h:Lbps;

    .line 10000
    iget-object v0, v0, Lbps;->b:Lbqj;

    .line 0
    invoke-virtual {v0}, Lbqj;->a()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lbpt;->h:Lbps;

    invoke-static {v0}, Lbps;->e(Lbps;)Lbql;

    move-result-object v0

    iget-object v1, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "Too many hits sent too quickly, rate limiting invoked"

    invoke-virtual {v0, v1, v2}, Lbql;->a(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "ate"

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "adid"

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_4
    move v0, v1

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "ht"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lbqs;->a(Ljava/lang/String;)J

    move-result-wide v4

    cmp-long v0, v4, v7

    if-nez v0, :cond_6

    iget-wide v4, p0, Lbpt;->d:J

    :cond_6
    iget-boolean v0, p0, Lbpt;->e:Z

    if-eqz v0, :cond_7

    new-instance v1, Lbsi;

    iget-object v2, p0, Lbpt;->h:Lbps;

    iget-object v3, p0, Lbpt;->a:Ljava/util/Map;

    iget-boolean v6, p0, Lbpt;->f:Z

    invoke-direct/range {v1 .. v6}, Lbsi;-><init>(Lbqz;Ljava/util/Map;JZ)V

    iget-object v0, p0, Lbpt;->h:Lbps;

    invoke-static {v0}, Lbps;->f(Lbps;)Lbql;

    move-result-object v0

    const-string v2, "Dry run enabled. Would have sent hit"

    invoke-virtual {v0, v2, v1}, Lbql;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "cid"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    const-string v0, "uid"

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    invoke-static {v14, v0, v2}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    const-string v0, "an"

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    invoke-static {v14, v0, v2}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    const-string v0, "aid"

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    invoke-static {v14, v0, v2}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    const-string v0, "av"

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    invoke-static {v14, v0, v2}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    const-string v0, "aiid"

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    invoke-static {v14, v0, v2}, Lbqs;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    new-instance v6, Lbre;

    iget-object v10, p0, Lbpt;->g:Ljava/lang/String;

    iget-object v0, p0, Lbpt;->a:Ljava/util/Map;

    const-string v2, "adid"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    :goto_3
    move-wide v12, v7

    invoke-direct/range {v6 .. v14}, Lbre;-><init>(JLjava/lang/String;Ljava/lang/String;ZJLjava/util/Map;)V

    iget-object v0, p0, Lbpt;->h:Lbps;

    invoke-static {v0}, Lbps;->g(Lbps;)Lbqu;

    move-result-object v0

    invoke-virtual {v0, v6}, Lbqu;->a(Lbre;)J

    move-result-wide v0

    iget-object v2, p0, Lbpt;->a:Ljava/util/Map;

    const-string v3, "_s"

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lbsi;

    iget-object v2, p0, Lbpt;->h:Lbps;

    iget-object v3, p0, Lbpt;->a:Ljava/util/Map;

    iget-boolean v6, p0, Lbpt;->f:Z

    invoke-direct/range {v1 .. v6}, Lbsi;-><init>(Lbqz;Ljava/util/Map;JZ)V

    iget-object v0, p0, Lbpt;->h:Lbps;

    invoke-static {v0}, Lbps;->h(Lbps;)Lbqu;

    move-result-object v0

    invoke-virtual {v0, v1}, Lbqu;->a(Lbsi;)V

    goto/16 :goto_0

    :cond_8
    move v11, v1

    goto :goto_3
.end method
