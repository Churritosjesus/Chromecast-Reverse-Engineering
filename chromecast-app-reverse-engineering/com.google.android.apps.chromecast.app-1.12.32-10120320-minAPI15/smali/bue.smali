.class public final Lbue;
.super Lbyo;


# static fields
.field private static final A:Ljava/lang/Object;

.field private static final B:Ljava/lang/Object;

.field private static final j:Lbuu;


# instance fields
.field public a:Lcom/google/android/gms/cast/ApplicationMetadata;

.field public final b:Ljava/util/Map;

.field public c:Z

.field public d:D

.field public final e:Ljava/util/concurrent/atomic/AtomicLong;

.field public final f:Ljava/util/Map;

.field private final k:Lcom/google/android/gms/cast/CastDevice;

.field private final l:Lbtc;

.field private final m:J

.field private n:Lbuh;

.field private o:Ljava/lang/String;

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:I

.field private t:I

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Landroid/os/Bundle;

.field private final x:Lbug;

.field private y:Lbwq;

.field private z:Lbwq;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbuu;

    const-string v1, "CastClientImpl"

    invoke-direct {v0, v1}, Lbuu;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbue;->j:Lbuu;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lbue;->A:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lbue;->B:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/cast/CastDevice;JLbtc;Lbwg;Lbwh;)V
    .locals 6

    .prologue
    .line 0
    const/16 v3, 0xa

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p7

    move-object v5, p8

    invoke-direct/range {v0 .. v5}, Lbyo;-><init>(Landroid/content/Context;Landroid/os/Looper;ILbwg;Lbwh;)V

    iput-object p3, p0, Lbue;->k:Lcom/google/android/gms/cast/CastDevice;

    iput-object p6, p0, Lbue;->l:Lbtc;

    iput-wide p4, p0, Lbue;->m:J

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbue;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lbue;->e:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbue;->f:Ljava/util/Map;

    invoke-direct {p0}, Lbue;->q()V

    new-instance v0, Lbug;

    .line 1000
    invoke-direct {v0, p0}, Lbug;-><init>(Lbue;)V

    .line 0
    iput-object v0, p0, Lbue;->x:Lbug;

    iget-object v0, p0, Lbue;->x:Lbug;

    invoke-virtual {p0, v0}, Lbue;->a(Lbwh;)V

    return-void
.end method

.method static synthetic a(Lbue;Lbwq;)Lbwq;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lbue;->y:Lbwq;

    return-object v0
.end method

.method static synthetic a(Lbue;Lcom/google/android/gms/cast/ApplicationMetadata;)Lcom/google/android/gms/cast/ApplicationMetadata;
    .locals 0

    iput-object p1, p0, Lbue;->a:Lcom/google/android/gms/cast/ApplicationMetadata;

    return-object p1
.end method

.method static synthetic a(Lbue;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lbue;->u:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lbue;)V
    .locals 0

    invoke-direct {p0}, Lbue;->r()V

    return-void
.end method

.method static synthetic a(Lbue;Lcom/google/android/gms/cast/internal/ApplicationStatus;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 0
    .line 12000
    iget-object v0, p1, Lcom/google/android/gms/cast/internal/ApplicationStatus;->b:Ljava/lang/String;

    .line 11000
    iget-object v3, p0, Lbue;->o:Ljava/lang/String;

    invoke-static {v0, v3}, La;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    iput-object v0, p0, Lbue;->o:Ljava/lang/String;

    move v0, v1

    :goto_0
    sget-object v3, Lbue;->j:Lbuu;

    const-string v4, "hasChanged=%b, mFirstApplicationStatusUpdate=%b"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v5, v2

    iget-boolean v0, p0, Lbue;->p:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v5, v1

    invoke-virtual {v3, v4, v5}, Lbuu;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v2, p0, Lbue;->p:Z

    .line 0
    return-void

    :cond_0
    move v0, v2

    goto :goto_0
.end method

.method static synthetic a(Lbue;Lcom/google/android/gms/cast/internal/DeviceStatus;)V
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 0
    .line 6000
    iget-object v0, p1, Lcom/google/android/gms/cast/internal/DeviceStatus;->e:Lcom/google/android/gms/cast/ApplicationMetadata;

    .line 5000
    iget-object v3, p0, Lbue;->a:Lcom/google/android/gms/cast/ApplicationMetadata;

    invoke-static {v0, v3}, La;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    iput-object v0, p0, Lbue;->a:Lcom/google/android/gms/cast/ApplicationMetadata;

    iget-object v0, p0, Lbue;->l:Lbtc;

    iget-object v3, p0, Lbue;->a:Lcom/google/android/gms/cast/ApplicationMetadata;

    invoke-virtual {v0, v3}, Lbtc;->a(Lcom/google/android/gms/cast/ApplicationMetadata;)V

    .line 7000
    :cond_0
    iget-wide v4, p1, Lcom/google/android/gms/cast/internal/DeviceStatus;->b:D

    .line 5000
    const-wide/high16 v6, 0x7ff8000000000000L    # NaN

    cmpl-double v0, v4, v6

    if-eqz v0, :cond_6

    iget-wide v6, p0, Lbue;->d:D

    sub-double v6, v4, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    const-wide v8, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpl-double v0, v6, v8

    if-lez v0, :cond_6

    iput-wide v4, p0, Lbue;->d:D

    move v0, v1

    .line 8000
    :goto_0
    iget-boolean v3, p1, Lcom/google/android/gms/cast/internal/DeviceStatus;->c:Z

    .line 5000
    iget-boolean v4, p0, Lbue;->c:Z

    if-eq v3, v4, :cond_1

    iput-boolean v3, p0, Lbue;->c:Z

    move v0, v1

    :cond_1
    sget-object v3, Lbue;->j:Lbuu;

    const-string v4, "hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b"

    new-array v5, v10, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v2

    iget-boolean v6, p0, Lbue;->q:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Lbuu;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lbue;->l:Lbtc;

    if-eqz v3, :cond_3

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lbue;->q:Z

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lbue;->l:Lbtc;

    invoke-virtual {v0}, Lbtc;->e()V

    .line 9000
    :cond_3
    iget v0, p1, Lcom/google/android/gms/cast/internal/DeviceStatus;->d:I

    .line 5000
    iget v3, p0, Lbue;->s:I

    if-eq v0, v3, :cond_5

    iput v0, p0, Lbue;->s:I

    move v0, v1

    :goto_1
    sget-object v3, Lbue;->j:Lbuu;

    const-string v4, "hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b"

    new-array v5, v10, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v5, v2

    iget-boolean v0, p0, Lbue;->q:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v5, v1

    invoke-virtual {v3, v4, v5}, Lbuu;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10000
    iget v0, p1, Lcom/google/android/gms/cast/internal/DeviceStatus;->f:I

    .line 5000
    iget v3, p0, Lbue;->t:I

    if-eq v0, v3, :cond_4

    iput v0, p0, Lbue;->t:I

    move v0, v1

    :goto_2
    sget-object v3, Lbue;->j:Lbuu;

    const-string v4, "hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b"

    new-array v5, v10, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v5, v2

    iget-boolean v0, p0, Lbue;->q:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v5, v1

    invoke-virtual {v3, v4, v5}, Lbuu;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v2, p0, Lbue;->q:Z

    .line 0
    return-void

    :cond_4
    move v0, v2

    goto :goto_2

    :cond_5
    move v0, v2

    goto :goto_1

    :cond_6
    move v0, v2

    goto :goto_0
.end method

.method static synthetic b(Lbue;Lbwq;)Lbwq;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lbue;->z:Lbwq;

    return-object v0
.end method

.method static synthetic b(Lbue;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lbue;->v:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lbue;)V
    .locals 0

    invoke-direct {p0}, Lbue;->q()V

    return-void
.end method

.method static synthetic c(Lbue;)Lbwq;
    .locals 1

    iget-object v0, p0, Lbue;->y:Lbwq;

    return-object v0
.end method

.method static synthetic d(Lbue;)Lbtc;
    .locals 1

    iget-object v0, p0, Lbue;->l:Lbtc;

    return-object v0
.end method

.method static synthetic e(Lbue;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lbue;->b:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic f(Lbue;)Lcom/google/android/gms/cast/CastDevice;
    .locals 1

    iget-object v0, p0, Lbue;->k:Lcom/google/android/gms/cast/CastDevice;

    return-object v0
.end method

.method static synthetic g()Lbuu;
    .locals 1

    sget-object v0, Lbue;->j:Lbuu;

    return-object v0
.end method

.method static synthetic g(Lbue;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lbue;->f:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic h(Lbue;)Lbwq;
    .locals 1

    iget-object v0, p0, Lbue;->z:Lbwq;

    return-object v0
.end method

.method static synthetic h()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lbue;->A:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic i()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lbue;->B:Ljava/lang/Object;

    return-object v0
.end method

.method private q()V
    .locals 3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v0, -0x1

    iput-boolean v2, p0, Lbue;->r:Z

    iput v0, p0, Lbue;->s:I

    iput v0, p0, Lbue;->t:I

    iput-object v1, p0, Lbue;->a:Lcom/google/android/gms/cast/ApplicationMetadata;

    iput-object v1, p0, Lbue;->o:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lbue;->d:D

    iput-boolean v2, p0, Lbue;->c:Z

    return-void
.end method

.method private r()V
    .locals 3

    sget-object v0, Lbue;->j:Lbuu;

    const-string v1, "removing all MessageReceivedCallbacks"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lbuu;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lbue;->b:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lbue;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final synthetic a(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    .prologue
    .line 0
    .line 4000
    invoke-static {p1}, Lbup;->a(Landroid/os/IBinder;)Lbuo;

    move-result-object v0

    .line 0
    return-object v0
.end method

.method public final a()V
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    sget-object v0, Lbue;->j:Lbuu;

    const-string v1, "disconnect(); ServiceListener=%s, isConnected=%b"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lbue;->n:Lbuh;

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lbue;->k()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Lbuu;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lbue;->n:Lbuh;

    const/4 v1, 0x0

    iput-object v1, p0, Lbue;->n:Lbuh;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lbuh;->a()Lbue;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lbue;->j:Lbuu;

    const-string v1, "already disposed, so short-circuiting"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lbuu;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lbue;->r()V

    :try_start_0
    invoke-virtual {p0}, Lbue;->k()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lbue;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-virtual {p0}, Lbue;->o()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lbuo;

    invoke-interface {v0}, Lbuo;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    invoke-super {p0}, Lbyo;->a()V

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    sget-object v1, Lbue;->j:Lbuu;

    const-string v2, "Error while disconnecting the controller interface: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lbuu;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-super {p0}, Lbyo;->a()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-super {p0}, Lbyo;->a()V

    throw v0
.end method

.method protected final a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 7

    const/16 v6, 0x3e9

    const/4 v0, 0x0

    const/4 v5, 0x1

    sget-object v1, Lbue;->j:Lbuu;

    const-string v2, "in onPostInitHandler; statusCode=%d"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-virtual {v1, v2, v3}, Lbuu;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    if-ne p1, v6, :cond_2

    :cond_0
    iput-boolean v5, p0, Lbue;->r:Z

    iput-boolean v5, p0, Lbue;->p:Z

    iput-boolean v5, p0, Lbue;->q:Z

    :goto_0
    if-ne p1, v6, :cond_1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, p0, Lbue;->w:Landroid/os/Bundle;

    iget-object v1, p0, Lbue;->w:Landroid/os/Bundle;

    const-string v2, "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING"

    invoke-virtual {v1, v2, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    move p1, v0

    :cond_1
    invoke-super {p0, p1, p2, p3}, Lbyo;->a(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void

    :cond_2
    iput-boolean v0, p0, Lbue;->r:Z

    goto :goto_0
.end method

.method public a(Lbwq;)V
    .locals 5

    sget-object v1, Lbue;->A:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lbue;->y:Lbwq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbue;->y:Lbwq;

    new-instance v2, Lbuf;

    new-instance v3, Lcom/google/android/gms/common/api/Status;

    const/16 v4, 0x7d2

    invoke-direct {v3, v4}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v2, v3}, Lbuf;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-interface {v0, v2}, Lbwq;->a(Ljava/lang/Object;)V

    :cond_0
    iput-object p1, p0, Lbue;->y:Lbwq;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 6

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Channel namespace cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v1, p0, Lbue;->b:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lbue;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbtd;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p0}, Lbue;->o()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lbuo;

    invoke-interface {v0, p1}, Lbuo;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    sget-object v1, Lbue;->j:Lbuu;

    const-string v2, "Error unregistering namespace (%s): %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lbuu;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final b()Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, Lbue;->w:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbue;->w:Landroid/os/Bundle;

    const/4 v1, 0x0

    iput-object v1, p0, Lbue;->w:Landroid/os/Bundle;

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Lbyo;->b()Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Lbwq;)V
    .locals 3

    sget-object v1, Lbue;->B:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lbue;->z:Lbwq;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x7d1

    invoke-direct {v0, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {p1, v0}, Lbwq;->a(Ljava/lang/Object;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iput-object p1, p0, Lbue;->z:Lbwq;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected final c()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE"

    return-object v0
.end method

.method protected final d()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.cast.internal.ICastDeviceController"

    return-object v0
.end method

.method protected final e()Landroid/os/Bundle;
    .locals 6

    .prologue
    .line 0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lbue;->j:Lbuu;

    const-string v2, "getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lbue;->u:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    iget-object v5, p0, Lbue;->v:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lbuu;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lbue;->k:Lcom/google/android/gms/cast/CastDevice;

    .line 2000
    const-string v2, "com.google.android.gms.cast.EXTRA_CAST_DEVICE"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 0
    const-string v1, "com.google.android.gms.cast.EXTRA_CAST_FLAGS"

    iget-wide v2, p0, Lbue;->m:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v1, Lbuh;

    invoke-direct {v1, p0}, Lbuh;-><init>(Lbue;)V

    iput-object v1, p0, Lbue;->n:Lbuh;

    const-string v1, "listener"

    new-instance v2, Lcom/google/android/gms/common/internal/BinderWrapper;

    iget-object v3, p0, Lbue;->n:Lbuh;

    invoke-virtual {v3}, Lbuh;->asBinder()Landroid/os/IBinder;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/internal/BinderWrapper;-><init>(Landroid/os/IBinder;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v1, p0, Lbue;->u:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, "last_application_id"

    iget-object v2, p0, Lbue;->u:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lbue;->v:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, "last_session_id"

    iget-object v2, p0, Lbue;->v:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public f()V
    .locals 2

    .prologue
    .line 0
    iget-boolean v0, p0, Lbue;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbue;->n:Lbuh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbue;->n:Lbuh;

    .line 3000
    iget-object v0, v0, Lbuh;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 0
    :goto_0
    if-eqz v0, :cond_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected to a device"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3000
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 0
    :cond_2
    return-void
.end method
