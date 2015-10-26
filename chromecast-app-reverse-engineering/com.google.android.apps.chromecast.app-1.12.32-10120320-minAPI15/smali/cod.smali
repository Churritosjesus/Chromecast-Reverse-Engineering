.class public final Lcod;
.super Lcno;


# instance fields
.field public final b:Lcoa;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lbwg;Lbwh;Ljava/lang/String;Lbyl;)V
    .locals 8

    sget-object v7, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;->a:Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lcod;-><init>(Landroid/content/Context;Landroid/os/Looper;Lbwg;Lbwh;Ljava/lang/String;Lbyl;Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lbwg;Lbwh;Ljava/lang/String;Lbyl;Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;)V
    .locals 6

    .prologue
    .line 0
    invoke-direct/range {p0 .. p6}, Lcno;-><init>(Landroid/content/Context;Landroid/os/Looper;Lbwg;Lbwh;Ljava/lang/String;Lbyl;)V

    new-instance v0, Lcoa;

    iget-object v1, p0, Lcod;->a:Lcoh;

    invoke-direct {v0, p1, v1}, Lcoa;-><init>(Landroid/content/Context;Lcoh;)V

    iput-object v0, p0, Lcod;->b:Lcoa;

    .line 1000
    iget-object v0, p6, Lbyl;->a:Landroid/accounts/Account;

    if-eqz v0, :cond_0

    iget-object v0, p6, Lbyl;->a:Landroid/accounts/Account;

    iget-object v2, v0, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 2000
    :goto_0
    iget-object v3, p6, Lbyl;->e:Ljava/lang/String;

    .line 0
    iget-object v4, p0, Lcod;->a:Lcoh;

    .line 3000
    new-instance v0, Lcnn;

    move-object v1, p1

    move-object v5, p7

    invoke-direct/range {v0 .. v5}, Lcnn;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcoh;Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;)V

    .line 0
    return-void

    .line 1000
    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    .line 0
    iget-object v2, p0, Lcod;->b:Lcoa;

    monitor-enter v2

    :try_start_0
    invoke-virtual {p0}, Lcod;->k()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v0

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v3, p0, Lcod;->b:Lcoa;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 4000
    :try_start_2
    iget-object v4, v3, Lcoa;->c:Ljava/util/Map;

    monitor-enter v4
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v0, v3, Lcoa;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcoc;

    if-eqz v0, :cond_0

    iget-object v1, v3, Lcoa;->a:Lcoh;

    invoke-interface {v1}, Lcoh;->b()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcnu;

    invoke-static {v0}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->a(Lcon;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move-result-object v0

    invoke-interface {v1, v0}, Lcnu;->a(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catch_0
    move-exception v0

    :try_start_5
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 0
    :catch_1
    move-exception v0

    :try_start_6
    const-string v1, "LocationClientImpl"

    const-string v3, "Client disconnected before listeners could be cleaned up"

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_1
    invoke-super {p0}, Lcno;->a()V

    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    return-void

    .line 4000
    :cond_2
    :try_start_7
    iget-object v0, v3, Lcoa;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, v3, Lcoa;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcob;

    if-eqz v0, :cond_3

    iget-object v1, v3, Lcoa;->a:Lcoh;

    invoke-interface {v1}, Lcoh;->b()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcnu;

    invoke-static {v0}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->a(Lcok;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move-result-object v0

    invoke-interface {v1, v0}, Lcnu;->a(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V

    goto :goto_2

    :cond_4
    iget-object v0, v3, Lcoa;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 0
    :try_start_8
    iget-object v1, p0, Lcod;->b:Lcoa;

    .line 5000
    iget-boolean v0, v1, Lcoa;->b:Z
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    if-eqz v0, :cond_1

    .line 6000
    :try_start_9
    iget-object v0, v1, Lcoa;->a:Lcoh;

    invoke-interface {v0}, Lcoh;->a()V

    iget-object v0, v1, Lcoa;->a:Lcoh;

    invoke-interface {v0}, Lcoh;->b()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcnu;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Lcnu;->a(Z)V

    const/4 v0, 0x0

    iput-boolean v0, v1, Lcoa;->b:Z
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_1

    .line 5000
    :catch_2
    move-exception v0

    :try_start_a
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 0
    :catchall_1
    move-exception v0

    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    throw v0
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
