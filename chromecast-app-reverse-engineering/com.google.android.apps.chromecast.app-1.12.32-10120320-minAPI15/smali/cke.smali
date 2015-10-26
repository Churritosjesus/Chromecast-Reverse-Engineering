.class final Lcke;
.super Lckh;


# instance fields
.field private synthetic a:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private synthetic g:Lckc;


# direct methods
.method constructor <init>(Lckc;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcke;->g:Lckc;

    iput-object p3, p0, Lcke;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-direct {p0, p2}, Lckh;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lcom/google/android/gms/common/api/Status;)Lbwm;
    .locals 0

    .prologue
    .line 0
    return-object p1
.end method

.method protected final synthetic a(Lbwc;)V
    .locals 4

    .prologue
    .line 0
    .line 1000
    :try_start_0
    invoke-static {}, Lckc;->a()Lckk;

    move-result-object v0

    const-wide/16 v2, 0xa

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lckk;->a(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x64

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    iget-object v0, p0, Lcke;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->c()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcke;->g:Lckc;

    iget-object v1, p0, Lcke;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-static {v0, v1, p0}, Lckc;->a(Lckc;Lcom/google/android/gms/common/api/GoogleApiClient;Lckh;)Lbwj;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0
.end method
