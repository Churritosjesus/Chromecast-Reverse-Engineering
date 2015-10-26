.class final Lbwt;
.super Lcsw;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;


# direct methods
.method constructor <init>(Lbws;)V
    .locals 1

    invoke-direct {p0}, Lcsw;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lbwt;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/signin/internal/AuthAccountResult;)V
    .locals 3

    .prologue
    .line 0
    iget-object v0, p0, Lbwt;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbws;

    if-nez v0, :cond_0

    :goto_0
    return-void

    .line 1000
    :cond_0
    iget-object v1, v0, Lbws;->a:Lbwz;

    .line 0
    iget-object v1, v1, Lbwz;->h:Lbxe;

    new-instance v2, Lbwu;

    invoke-direct {v2, p0, v0, p1}, Lbwu;-><init>(Lbwt;Lbws;Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v1, v2}, Lbxe;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
