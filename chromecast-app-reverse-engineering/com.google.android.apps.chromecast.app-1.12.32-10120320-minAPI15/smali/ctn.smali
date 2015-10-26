.class public Lctn;
.super Ljava/lang/Object;

# interfaces
.implements Lbwl;
.implements Lbwm;


# instance fields
.field a:Lctk;

.field b:Lctk;

.field c:Lcom/google/android/gms/common/api/Status;

.field d:Lcyy;

.field e:Z

.field f:Lcuq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    .prologue
    .line 2000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lctn;->c:Lcom/google/android/gms/common/api/Status;

    return-void
.end method

.method public constructor <init>(Lcuq;Landroid/os/Looper;Lctk;Lbb;)V
    .locals 2

    .prologue
    .line 3000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lctn;->f:Lcuq;

    if-nez p2, :cond_0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    :cond_0
    iput-object p3, p0, Lctn;->a:Lctk;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    iput-object v0, p0, Lctn;->c:Lcom/google/android/gms/common/api/Status;

    .line 4000
    iget-object v0, p1, Lcuq;->c:Ljava/util/concurrent/ConcurrentMap;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3000
    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    .prologue
    .line 6000
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lctn;->e:Z

    if-eqz v0, :cond_0

    const-string v0, "Releasing a released ContainerHolder."

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lctn;->e:Z

    iget-object v0, p0, Lctn;->f:Lcuq;

    .line 7000
    iget-object v0, v0, Lcuq;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p0}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6000
    :cond_1
    iget-object v0, p0, Lctn;->a:Lctk;

    .line 8000
    const/4 v1, 0x0

    iput-object v1, v0, Lctk;->a:Lcxi;

    .line 6000
    const/4 v0, 0x0

    iput-object v0, p0, Lctn;->a:Lctk;

    const/4 v0, 0x0

    iput-object v0, p0, Lctn;->b:Lctk;

    const/4 v0, 0x0

    iput-object v0, p0, Lctn;->d:Lcyy;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lctk;)V
    .locals 1

    .prologue
    .line 9000
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lctn;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iput-object p1, p0, Lctn;->b:Lctk;

    invoke-virtual {p0}, Lctn;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 10000
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lctn;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lctn;->a:Lctk;

    .line 11000
    invoke-virtual {v0}, Lctk;->a()Lcxi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcxi;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 10000
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b()Lcom/google/android/gms/common/api/Status;
    .locals 1

    .prologue
    .line 5000
    iget-object v0, p0, Lctn;->c:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public declared-synchronized c()Lctk;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1000
    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lctn;->e:Z

    if-eqz v1, :cond_0

    const-string v1, "ContainerHolder is released."

    invoke-static {v1}, Lcuh;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lctn;->b:Lctk;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lctn;->b:Lctk;

    iput-object v0, p0, Lctn;->a:Lctk;

    const/4 v0, 0x0

    iput-object v0, p0, Lctn;->b:Lctk;

    :cond_1
    iget-object v0, p0, Lctn;->a:Lctk;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method d()V
    .locals 0

    .prologue
    .line 12000
    return-void
.end method
