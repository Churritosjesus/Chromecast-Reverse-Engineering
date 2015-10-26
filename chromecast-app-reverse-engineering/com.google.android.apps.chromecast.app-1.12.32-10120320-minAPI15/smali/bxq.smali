.class public final Lbxq;
.super Lj;

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Laq;


# instance fields
.field private final Z:Landroid/os/Handler;

.field final a:Landroid/util/SparseArray;

.field private b:Z

.field private c:I

.field private d:Lcom/google/android/gms/common/ConnectionResult;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lj;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lbxq;->c:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lbxq;->Z:Landroid/os/Handler;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lbxq;->a:Landroid/util/SparseArray;

    return-void
.end method

.method public static a(Lm;)Lbxq;
    .locals 4

    .prologue
    .line 0
    const-string v0, "Must be called from main thread of process"

    invoke-static {v0}, La;->g(Ljava/lang/String;)V

    .line 1808
    iget-object v1, p0, Lm;->b:Lt;

    .line 0
    :try_start_0
    const-string v0, "GmsSupportLoaderLifecycleFragment"

    invoke-virtual {v1, v0}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    check-cast v0, Lbxq;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    .line 2722
    iget-boolean v2, v0, Lj;->r:Z

    .line 0
    if-eqz v2, :cond_1

    :cond_0
    new-instance v0, Lbxq;

    invoke-direct {v0}, Lbxq;-><init>()V

    invoke-virtual {v1}, Lr;->a()Laf;

    move-result-object v2

    const-string v3, "GmsSupportLoaderLifecycleFragment"

    invoke-virtual {v2, v0, v3}, Laf;->a(Lj;Ljava/lang/String;)Laf;

    move-result-object v2

    invoke-virtual {v2}, Laf;->b()I

    invoke-virtual {v1}, Lr;->b()Z

    :cond_1
    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private a(ILcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    .prologue
    .line 0
    const-string v0, "GmsSupportLoaderLifecycleFragment"

    const-string v1, "Unresolved error while connecting client. Stopping auto-manage."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbxs;

    if-eqz v0, :cond_0

    .line 6000
    iget-object v1, p0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {p0}, Lbxq;->h()Lap;

    move-result-object v1

    invoke-virtual {v1, p1}, Lap;->a(I)V

    .line 0
    iget-object v0, v0, Lbxs;->b:Lbwh;

    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Lbwh;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    :cond_0
    invoke-direct {p0}, Lbxq;->p()V

    return-void
.end method

.method static synthetic a(Lbxq;)V
    .locals 0

    invoke-direct {p0}, Lbxq;->p()V

    return-void
.end method

.method static synthetic a(Lbxq;ILcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lbxq;->a(ILcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method private p()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Lbxq;->b:Z

    const/4 v1, -0x1

    iput v1, p0, Lbxq;->c:I

    iput-object v4, p0, Lbxq;->d:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {p0}, Lbxq;->h()Lap;

    move-result-object v1

    :goto_0
    iget-object v2, p0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {p0, v2}, Lbxq;->b(I)Lbxr;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 7000
    iget-boolean v3, v3, Lbxr;->f:Z

    .line 0
    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Lap;->a(I)V

    invoke-virtual {v1, v2, v4, p0}, Lap;->a(ILandroid/os/Bundle;Laq;)Lbi;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 0
    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-direct {p0}, Lbxq;->p()V

    :goto_1
    return-void

    .line 4612
    :pswitch_0
    iget-object v2, p0, Lj;->y:Lm;

    .line 0
    invoke-static {v2}, Lbvt;->a(Landroid/content/Context;)I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :pswitch_1
    const/4 v2, -0x1

    if-ne p2, v2, :cond_0

    goto :goto_0

    :cond_1
    iget v0, p0, Lbxq;->c:I

    iget-object v1, p0, Lbxq;->d:Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {p0, v0, v1}, Lbxq;->a(ILcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 5

    const/4 v4, 0x0

    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {p0, v2}, Lbxq;->b(I)Lbxr;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v0, p0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbxs;

    iget-object v0, v0, Lbxs;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v3, v3, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eq v0, v3, :cond_0

    invoke-virtual {p0}, Lbxq;->h()Lap;

    move-result-object v0

    invoke-virtual {v0, v2, v4, p0}, Lap;->b(ILandroid/os/Bundle;Laq;)Lbi;

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lbxq;->h()Lap;

    move-result-object v0

    invoke-virtual {v0, v2, v4, p0}, Lap;->a(ILandroid/os/Bundle;Laq;)Lbi;

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    const-string v0, "resolving_error"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lbxq;->b:Z

    const-string v0, "failed_client_id"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lbxq;->c:I

    iget v0, p0, Lbxq;->c:I

    if-ltz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    const-string v0, "failed_status"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v0, "failed_resolution"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    iput-object v1, p0, Lbxq;->d:Lcom/google/android/gms/common/ConnectionResult;

    :cond_0
    return-void
.end method

.method public final synthetic a(Lbi;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 0
    check-cast p2, Lcom/google/android/gms/common/ConnectionResult;

    .line 8000
    invoke-virtual {p2}, Lcom/google/android/gms/common/ConnectionResult;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 8119
    iget v0, p1, Lbi;->a:I

    .line 9000
    iget-boolean v1, p0, Lbxq;->b:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lbxq;->b:Z

    iput v0, p0, Lbxq;->c:I

    iput-object p2, p0, Lbxq;->d:Lcom/google/android/gms/common/ConnectionResult;

    iget-object v1, p0, Lbxq;->Z:Landroid/os/Handler;

    new-instance v2, Lbxt;

    invoke-direct {v2, p0, v0, p2}, Lbxt;-><init>(Lbxq;ILcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 0
    :cond_0
    return-void
.end method

.method final b(I)Lbxr;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lbxq;->h()Lap;

    move-result-object v0

    invoke-virtual {v0, p1}, Lap;->b(I)Lbi;

    move-result-object v0

    check-cast v0, Lbxr;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unknown loader in SupportLoaderLifecycleFragment"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final c_(I)Lbi;
    .locals 3

    .prologue
    .line 0
    new-instance v1, Lbxr;

    .line 5612
    iget-object v2, p0, Lj;->y:Lm;

    .line 0
    iget-object v0, p0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbxs;

    iget-object v0, v0, Lbxs;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-direct {v1, v2, v0}, Lbxr;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-object v1
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 0
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    const-string v0, "resolving_error"

    iget-boolean v1, p0, Lbxq;->b:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget v0, p0, Lbxq;->c:I

    if-ltz v0, :cond_0

    const-string v0, "failed_client_id"

    iget v1, p0, Lbxq;->c:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "failed_status"

    iget-object v1, p0, Lbxq;->d:Lcom/google/android/gms/common/ConnectionResult;

    .line 3000
    iget v1, v1, Lcom/google/android/gms/common/ConnectionResult;->c:I

    .line 0
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "failed_resolution"

    iget-object v1, p0, Lbxq;->d:Lcom/google/android/gms/common/ConnectionResult;

    .line 4000
    iget-object v1, v1, Lcom/google/android/gms/common/ConnectionResult;->d:Landroid/app/PendingIntent;

    .line 0
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method public final g_()V
    .locals 4

    invoke-super {p0}, Lj;->g_()V

    iget-boolean v0, p0, Lbxq;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Lbxq;->h()Lap;

    move-result-object v1

    iget-object v2, p0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, p0}, Lap;->a(ILandroid/os/Bundle;Laq;)Lbi;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 4

    iget v0, p0, Lbxq;->c:I

    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v2, 0xd

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-direct {p0, v0, v1}, Lbxq;->a(ILcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method
