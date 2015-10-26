.class public Lbsu;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/GoogleApiClient;)Lbwj;
    .locals 1

    .prologue
    .line 4000
    new-instance v0, Lbsy;

    invoke-direct {v0, p0, p1}, Lbsy;-><init>(Lbsu;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lbwj;
    .locals 1

    .prologue
    .line 2000
    new-instance v0, Lbsw;

    invoke-direct {v0, p0, p1, p2}, Lbsw;-><init>(Lbsu;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lbwj;
    .locals 1

    .prologue
    .line 1000
    new-instance v0, Lbsv;

    invoke-direct {v0, p0, p1, p2, p3}, Lbsv;-><init>(Lbsu;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/GoogleApiClient;D)V
    .locals 8

    .prologue
    .line 6000
    :try_start_0
    sget-object v0, Lbut;->a:Lbwe;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwe;)Lbwc;

    move-result-object v0

    check-cast v0, Lbue;

    .line 7000
    invoke-static {p2, p3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Volume cannot be "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6000
    :catch_0
    move-exception v0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "service error"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7000
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lbue;->o()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lbuo;

    iget-wide v4, v0, Lbue;->d:D

    iget-boolean v6, v0, Lbue;->c:Z

    move-wide v2, p2

    invoke-interface/range {v1 .. v6}, Lbuo;->a(DDZ)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 6000
    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lbtd;)V
    .locals 3

    .prologue
    .line 12000
    :try_start_0
    sget-object v0, Lbut;->a:Lbwe;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwe;)Lbwc;

    move-result-object v0

    check-cast v0, Lbue;

    .line 13000
    invoke-static {p2}, La;->d(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lbue;->a(Ljava/lang/String;)V

    if-eqz p3, :cond_0

    iget-object v1, v0, Lbue;->b:Ljava/util/Map;

    monitor-enter v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, v0, Lbue;->b:Ljava/util/Map;

    invoke-interface {v2, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Lbue;->o()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lbuo;

    invoke-interface {v0, p2}, Lbuo;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 12000
    :cond_0
    return-void

    .line 13000
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0

    .line 12000
    :catch_0
    move-exception v0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "service error"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lcom/google/android/gms/common/api/GoogleApiClient;)Lbwj;
    .locals 1

    .prologue
    .line 5000
    new-instance v0, Lbsz;

    invoke-direct {v0, p0, p1}, Lbsz;-><init>(Lbsu;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lbwj;
    .locals 1

    .prologue
    .line 3000
    new-instance v0, Lbsx;

    invoke-direct {v0, p0, p1, p2}, Lbsx;-><init>(Lbsu;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/android/gms/common/api/GoogleApiClient;)D
    .locals 2

    .prologue
    .line 8000
    sget-object v0, Lbut;->a:Lbwe;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwe;)Lbwc;

    move-result-object v0

    check-cast v0, Lbue;

    .line 9000
    invoke-virtual {v0}, Lbue;->f()V

    iget-wide v0, v0, Lbue;->d:D

    .line 8000
    return-wide v0
.end method

.method public c(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 14000
    :try_start_0
    sget-object v0, Lbut;->a:Lbwe;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwe;)Lbwc;

    move-result-object v0

    check-cast v0, Lbue;

    invoke-virtual {v0, p2}, Lbue;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "service error"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/cast/ApplicationMetadata;
    .locals 1

    .prologue
    .line 10000
    sget-object v0, Lbut;->a:Lbwe;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwe;)Lbwc;

    move-result-object v0

    check-cast v0, Lbue;

    .line 11000
    invoke-virtual {v0}, Lbue;->f()V

    iget-object v0, v0, Lbue;->a:Lcom/google/android/gms/cast/ApplicationMetadata;

    .line 10000
    return-object v0
.end method
