.class final Lbxt;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/common/ConnectionResult;

.field private synthetic c:Lbxq;


# direct methods
.method public constructor <init>(Lbxq;ILcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    iput-object p1, p0, Lbxt;->c:Lbxq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lbxt;->a:I

    iput-object p3, p0, Lbxt;->b:Lcom/google/android/gms/common/ConnectionResult;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 0
    iget-object v0, p0, Lbxt;->b:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lbxt;->c:Lbxq;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 1808
    iget-object v0, v0, Lm;->b:Lt;

    .line 0
    invoke-virtual {v0}, Lr;->f()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lbxt;->c:Lbxq;

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    shl-int/lit8 v0, v0, 0x10

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lbxt;->b:Lcom/google/android/gms/common/ConnectionResult;

    iget-object v2, p0, Lbxt;->c:Lbxq;

    .line 2612
    iget-object v2, v2, Lj;->y:Lm;

    .line 0
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/common/ConnectionResult;->a(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v0, p0, Lbxt;->c:Lbxq;

    invoke-static {v0}, Lbxq;->a(Lbxq;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbxt;->b:Lcom/google/android/gms/common/ConnectionResult;

    .line 3000
    iget v0, v0, Lcom/google/android/gms/common/ConnectionResult;->c:I

    .line 0
    invoke-static {v0}, Lbvt;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbxt;->b:Lcom/google/android/gms/common/ConnectionResult;

    .line 4000
    iget v0, v0, Lcom/google/android/gms/common/ConnectionResult;->c:I

    .line 0
    iget-object v1, p0, Lbxt;->c:Lbxq;

    .line 4612
    iget-object v1, v1, Lj;->y:Lm;

    .line 0
    iget-object v2, p0, Lbxt;->c:Lbxq;

    const/4 v3, 0x2

    iget-object v4, p0, Lbxt;->c:Lbxq;

    invoke-static {v0, v1, v2, v3, v4}, Lbvt;->a(ILandroid/app/Activity;Lj;ILandroid/content/DialogInterface$OnCancelListener;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lbxt;->c:Lbxq;

    iget v1, p0, Lbxt;->a:I

    iget-object v2, p0, Lbxt;->b:Lcom/google/android/gms/common/ConnectionResult;

    invoke-static {v0, v1, v2}, Lbxq;->a(Lbxq;ILcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0
.end method
