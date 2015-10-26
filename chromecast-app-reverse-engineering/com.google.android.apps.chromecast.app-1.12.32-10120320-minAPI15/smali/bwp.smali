.class public abstract Lbwp;
.super Lbvx;

# interfaces
.implements Lbwq;
.implements Lbxi;


# instance fields
.field private a:Ljava/util/concurrent/atomic/AtomicReference;

.field final f:Lbwe;


# direct methods
.method public constructor <init>(Lbwe;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    const-string v0, "GoogleApiClient must not be null"

    invoke-static {p2, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Lbvx;-><init>(Landroid/os/Looper;)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lbwp;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwe;

    iput-object v0, p0, Lbwp;->f:Lbwe;

    return-void
.end method

.method private a(Landroid/os/RemoteException;)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x8

    invoke-virtual {p1}, Landroid/os/RemoteException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {p0, v0}, Lbwp;->d(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method


# virtual methods
.method public abstract a(Lbwc;)V
.end method

.method public final a(Lbxg;)V
    .locals 1

    iget-object v0, p0, Lbwp;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lbwm;

    invoke-super {p0, p1}, Lbvx;->a(Lbwm;)V

    return-void
.end method

.method public final b(Lbwc;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0, p1}, Lbwp;->a(Lbwc;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lbwp;->a(Landroid/os/RemoteException;)V

    throw v0

    :catch_1
    move-exception v0

    invoke-direct {p0, v0}, Lbwp;->a(Landroid/os/RemoteException;)V

    goto :goto_0
.end method

.method protected final d()V
    .locals 2

    iget-object v0, p0, Lbwp;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbxg;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lbxg;->a(Lbxi;)V

    :cond_0
    return-void
.end method

.method public final d(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Failed result must not be success"

    invoke-static {v0, v1}, La;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0, p1}, Lbwp;->a(Lcom/google/android/gms/common/api/Status;)Lbwm;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbwp;->a(Lbwm;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Lbwe;
    .locals 1

    iget-object v0, p0, Lbwp;->f:Lbwe;

    return-object v0
.end method
