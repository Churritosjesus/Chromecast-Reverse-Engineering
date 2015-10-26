.class public final Lbrf;
.super Lbra;


# instance fields
.field final a:Lbrh;

.field private b:Lbqg;

.field private final c:Lbsb;

.field private e:Lbqr;


# direct methods
.method protected constructor <init>(Lbrb;)V
    .locals 2

    .prologue
    .line 0
    invoke-direct {p0, p1}, Lbra;-><init>(Lbrb;)V

    new-instance v0, Lbqr;

    .line 1000
    iget-object v1, p1, Lbrb;->c:Lcac;

    .line 0
    invoke-direct {v0, v1}, Lbqr;-><init>(Lcac;)V

    iput-object v0, p0, Lbrf;->e:Lbqr;

    new-instance v0, Lbrh;

    invoke-direct {v0, p0}, Lbrh;-><init>(Lbrf;)V

    iput-object v0, p0, Lbrf;->a:Lbrh;

    new-instance v0, Lbrg;

    invoke-direct {v0, p0, p1}, Lbrg;-><init>(Lbrf;Lbrb;)V

    iput-object v0, p0, Lbrf;->c:Lbsb;

    return-void
.end method

.method static synthetic a(Lbrf;)V
    .locals 1

    .prologue
    .line 0
    .line 19000
    invoke-static {}, Lbrb;->i()V

    .line 18000
    invoke-virtual {p0}, Lbrf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Inactivity, disconnecting from device AnalyticsService"

    invoke-virtual {p0, v0}, Lbrf;->b(Ljava/lang/String;)V

    invoke-virtual {p0}, Lbrf;->d()V

    .line 0
    :cond_0
    return-void
.end method

.method static synthetic a(Lbrf;Landroid/content/ComponentName;)V
    .locals 1

    .prologue
    .line 0
    .line 17000
    invoke-static {}, Lbrb;->i()V

    .line 16000
    iget-object v0, p0, Lbrf;->b:Lbqg;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lbrf;->b:Lbqg;

    const-string v0, "Disconnected from device AnalyticsService"

    invoke-virtual {p0, v0, p1}, Lbrf;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrf;->f()V

    .line 0
    :cond_0
    return-void
.end method

.method static synthetic a(Lbrf;Lbqg;)V
    .locals 1

    .prologue
    .line 0
    .line 14000
    invoke-static {}, Lbrb;->i()V

    .line 13000
    iput-object p1, p0, Lbrf;->b:Lbqg;

    invoke-direct {p0}, Lbrf;->e()V

    .line 15000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->c()Lbqu;

    move-result-object v0

    .line 13000
    invoke-virtual {v0}, Lbqu;->d()V

    .line 0
    return-void
.end method

.method private e()V
    .locals 4

    .prologue
    .line 0
    iget-object v0, p0, Lbrf;->e:Lbqr;

    invoke-virtual {v0}, Lbqr;->a()V

    iget-object v1, p0, Lbrf;->c:Lbsb;

    .line 7000
    sget-object v0, Lbqd;->A:Lbqe;

    invoke-virtual {v0}, Lbqe;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 0
    invoke-virtual {v1, v2, v3}, Lbsb;->a(J)V

    return-void
.end method

.method private f()V
    .locals 1

    .prologue
    .line 0
    .line 12000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->c()Lbqu;

    move-result-object v0

    .line 0
    invoke-virtual {v0}, Lbqu;->c()V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 0

    return-void
.end method

.method public final a(Lbsi;)Z
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 0
    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3000
    invoke-static {}, Lbrb;->i()V

    .line 0
    invoke-virtual {p0}, Lbrf;->r()V

    iget-object v0, p0, Lbrf;->b:Lbqg;

    if-nez v0, :cond_0

    move v0, v6

    :goto_0
    return v0

    .line 4000
    :cond_0
    iget-boolean v1, p1, Lbsi;->f:Z

    .line 0
    if-eqz v1, :cond_1

    invoke-static {}, Lbrz;->h()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 5000
    :try_start_0
    iget-object v1, p1, Lbsi;->a:Ljava/util/Map;

    .line 6000
    iget-wide v2, p1, Lbsi;->d:J

    .line 0
    invoke-interface/range {v0 .. v5}, Lbqg;->a(Ljava/util/Map;JLjava/lang/String;Ljava/util/List;)V

    invoke-direct {p0}, Lbrf;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Lbrz;->i()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v0, "Failed to send hits to AnalyticsService"

    invoke-virtual {p0, v0}, Lbrf;->b(Ljava/lang/String;)V

    move v0, v6

    goto :goto_0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 0
    .line 2000
    invoke-static {}, Lbrb;->i()V

    .line 0
    invoke-virtual {p0}, Lbrf;->r()V

    iget-object v0, p0, Lbrf;->b:Lbqg;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 0
    .line 8000
    invoke-static {}, Lbrb;->i()V

    .line 0
    invoke-virtual {p0}, Lbrf;->r()V

    iget-object v1, p0, Lbrf;->b:Lbqg;

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lbrf;->a:Lbrh;

    invoke-virtual {v1}, Lbrh;->a()Lbqg;

    move-result-object v1

    if-eqz v1, :cond_1

    iput-object v1, p0, Lbrf;->b:Lbqg;

    invoke-direct {p0}, Lbrf;->e()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()V
    .locals 3

    .prologue
    .line 0
    .line 9000
    invoke-static {}, Lbrb;->i()V

    .line 0
    invoke-virtual {p0}, Lbrf;->r()V

    :try_start_0
    invoke-static {}, Lbzw;->a()Lbzw;

    move-result-object v0

    invoke-virtual {p0}, Lbrf;->l()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lbrf;->a:Lbrh;

    invoke-virtual {v0, v1, v2}, Lbzw;->a(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lbrf;->b:Lbqg;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lbrf;->b:Lbqg;

    .line 11000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->c()Lbqu;

    move-result-object v0

    .line 10000
    invoke-virtual {v0}, Lbqu;->c()V

    .line 0
    :cond_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method
