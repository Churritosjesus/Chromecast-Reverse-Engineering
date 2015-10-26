.class final Laqv;
.super Lua;
.source "PG"


# instance fields
.field private synthetic a:Laqu;


# direct methods
.method constructor <init>(Laqu;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Laqv;->a:Laqu;

    invoke-direct {p0}, Lua;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .prologue
    .line 99
    return-void
.end method

.method public final a(Ltz;Luh;)V
    .locals 6

    .prologue
    .line 76
    iget-object v0, p0, Laqv;->a:Laqu;

    invoke-static {v0}, Laqu;->b(Laqu;)Lblp;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 77
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v4, p0, Laqv;->a:Laqu;

    invoke-static {v4}, Laqu;->a(Laqu;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 1874
    iget-object v2, p2, Luh;->c:Ljava/lang/String;

    .line 77
    aput-object v2, v0, v1

    .line 78
    iget-object v0, p0, Laqv;->a:Laqu;

    invoke-static {v0}, Laqu;->c(Laqu;)Lalm;

    move-result-object v0

    invoke-virtual {v0, p2}, Lalm;->a(Luh;)V

    .line 79
    return-void
.end method

.method public final a(Luh;)V
    .locals 0

    .prologue
    .line 95
    return-void
.end method

.method public final b(Ltz;Luh;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 88
    iget-object v0, p0, Laqv;->a:Laqu;

    invoke-static {v0}, Laqu;->b(Laqu;)Lblp;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 89
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v1, p0, Laqv;->a:Laqu;

    invoke-static {v1}, Laqu;->a(Laqu;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v0, v6

    .line 2874
    iget-object v1, p2, Luh;->c:Ljava/lang/String;

    .line 89
    aput-object v1, v0, v7

    .line 90
    iget-object v0, p0, Laqv;->a:Laqu;

    invoke-static {v0}, Laqu;->c(Laqu;)Lalm;

    move-result-object v0

    .line 3678
    iget-object v1, v0, Lalm;->g:Ljava/util/List;

    monitor-enter v1

    .line 4231
    :try_start_0
    iget-object v2, p2, Luh;->m:Landroid/os/Bundle;

    .line 3679
    invoke-static {v2}, Lcom/google/android/gms/cast/CastDevice;->a(Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;

    move-result-object v2

    .line 5000
    iget-object v2, v2, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 3681
    invoke-virtual {v0, v2}, Lalm;->e(Ljava/lang/String;)Laow;

    move-result-object v2

    .line 3682
    if-eqz v2, :cond_0

    .line 3683
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v2}, Laow;->g()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    .line 3684
    iget-object v3, v0, Lalm;->c:Lass;

    invoke-virtual {v3, v2}, Lass;->b(Laow;)V

    .line 5273
    const/4 v3, 0x0

    iput-object v3, v2, Laow;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 5274
    const/4 v3, 0x0

    iput-object v3, v2, Laow;->g:Latu;

    .line 5275
    iget-object v3, v2, Laow;->u:[J

    sget v4, Laoz;->d:I

    add-int/lit8 v4, v4, -0x1

    const-wide/16 v6, -0x1

    aput-wide v6, v3, v4

    .line 3686
    invoke-virtual {v0, v2}, Lalm;->c(Laow;)Z

    .line 3688
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c(Ltz;Luh;)V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Laqv;->a:Laqu;

    invoke-static {v0}, Laqu;->c(Laqu;)Lalm;

    move-result-object v0

    invoke-virtual {v0, p2}, Lalm;->a(Luh;)V

    .line 84
    return-void
.end method
